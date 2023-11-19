package gui;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import dao.Customer_DAO;
import dao.InvoiceDetails_DAO;
import dao.Invoice_DAO;
import dao.Product_DAO;
import dao.Promotion_DAO;
import dao.Staff_DAO;
import dao.VAT_DAO;
import entity.Flag;
import entity.Product;
import entity.Promotion;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import lib2.TableCustom;
import entity.Invoice;
import entity.Staff;
import entity.Customer;
import entity.InvoiceDetails;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicHTML;
import static utils.Utils.openPDF;
import org.jsoup.Jsoup;

public class Sell_GUI extends javax.swing.JPanel implements Runnable, ThreadFactory {

    private ProductAddToCart_GUI productAddToCart_GUI;
    private DefaultTableModel defaultTableModelPendingInvoice;
    private DefaultTableModel defaultTableModelCart;

    private Promotion_DAO promotion_DAO = new Promotion_DAO();
    private Customer_DAO customer_DAO = new Customer_DAO();
    private Product_DAO product_DAO = new Product_DAO();
    private Invoice_DAO invoice_DAO = new Invoice_DAO();
    private Staff_DAO staff_DAO = new Staff_DAO();
    private InvoiceDetails_DAO invoiceDetails_DAO = new InvoiceDetails_DAO();
    private VAT_DAO vat_dao = new VAT_DAO();

    private WebcamPanel webcamPanel = null;
    private Webcam webcam = null;
//    private Executor executor = Executors.newSingleThreadExecutor(this);
//    Dùng ExecutorService thay vì Executor để gọi được medthod shutdown camera
    private ExecutorService executor = Executors.newSingleThreadExecutor(this);

    private double priceRange;
    private Customer customer;
    private Map<String, String> promotionMap = new HashMap<>();

    private String previousPromotionId = ""; // Biến để theo dõi trạng thái trước đó của item CBB Promotion
    private int previousPointsIndex = -1; // Biến để theo dõi trạng thái trước đó của item CBB Points
    private double originalTotalAmount;

    ;

    public Sell_GUI() {
        initComponents();
        TableCustom.apply(jSPPendingnvoice, TableCustom.TableType.DEFAULT);
        defaultTableModelPendingInvoice = (DefaultTableModel) jTablePendingInvoice.getModel();
        ListSelectionModel selectionModel_1 = jTablePendingInvoice.getSelectionModel();
        selectionModel_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        TableCustom.apply(jSPCart, TableCustom.TableType.DEFAULT);
        defaultTableModelCart = (DefaultTableModel) jTableCart.getModel();
        ListSelectionModel selectionModel_2 = jTableCart.getSelectionModel();
        selectionModel_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        ExecutorService executor = Executors.newSingleThreadExecutor((ThreadFactory) this);
        initWebcam();

        if (Flag.getFlagSell_GUI() == 1) { // nếu GUI mở từ Customer_GUI
            Customer customer1 = customer_DAO.getCustomerByID(Flag.getIdCusForSell_GUI());
            jtfPhoneCus.setText(customer1.getPhone());
            jtfEmail.setText(customer1.getEmail());
            jtfNameCus.setText(customer1.getName());
            jtfPhoneCus.setEditable(false);
            btnPendingInvoice.setEnabled(true);

            btnCreateInvoice.setText("Hủy");
            btnPendingInvoice.setEnabled(true);
            btnPay.setEnabled(true);
            jtfMoneyReceived.setEditable(true);
            jTFPoints.setText(customer1.getRewardPoints() + "");

            cbPayments.setEnabled(true);
            cbPonis.setEnabled(true);
            cbPromotion.setEnabled(true);
        }

        defaultTableModelCart.setRowCount(0); // set cho jtable cart = 0 để table trống lần đầu khởi tạo
// Sự kiện nghe sự thay đổi của jtable
        defaultTableModelCart.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.INSERT || e.getType() == TableModelEvent.UPDATE || e.getType() == TableModelEvent.DELETE) {

                    // 1) Tính giá trị VAT
                    double vatValue = calculateTotalAmount() * (vat_dao.getVAT() / 100);
                    double total = vatValue + calculateTotalAmount();
                    jtfTotalAmount.setText(total + " VNĐ");

                    //        Lấy tổng tiền hóa đon từ đó lấy mã giảm giá hợp lý
                    loadPromotion(promotion_DAO.getListPromotionsByStatusAndTypePromotion2(total));
                }
            }
        });
//        }

        loadDataPendingInvoice();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jPPendingInvoice = new javax.swing.JPanel();
        jSPPendingnvoice = new javax.swing.JScrollPane();
        jTablePendingInvoice = new javax.swing.JTable();
        jPQR = new javax.swing.JPanel();
        jpWebcam = new javax.swing.JPanel();
        jP2 = new javax.swing.JPanel();
        jSPCart = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();
        jP3 = new javax.swing.JPanel();
        iP3_4 = new javax.swing.JPanel();
        btnPay = new lib2.Button();
        btnPendingInvoice = new lib2.Button();
        btnCreateInvoice = new lib2.Button();
        iP3_3 = new javax.swing.JPanel();
        jLIDInvoice = new javax.swing.JLabel();
        jLIDInvoiceMain = new javax.swing.JLabel();
        jLIDStaff = new javax.swing.JLabel();
        jLIDStaffMain = new javax.swing.JLabel();
        jLNameStaff = new javax.swing.JLabel();
        jLNameStaffMain = new javax.swing.JLabel();
        iP3_1 = new javax.swing.JPanel();
        jlPhoneCus = new javax.swing.JLabel();
        jtfPhoneCus = new javax.swing.JTextField();
        btnSearchPhone = new lib2.Button();
        jP3_2 = new javax.swing.JPanel();
        jlNameCus = new javax.swing.JLabel();
        jtfNameCus = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jLPoints = new javax.swing.JLabel();
        jTFPoints = new javax.swing.JTextField();
        jP_3_3 = new javax.swing.JPanel();
        jlTotalAmount = new javax.swing.JLabel();
        jtfTotalAmount = new javax.swing.JTextField();
        jlVoucher = new javax.swing.JLabel();
        jlPayments = new javax.swing.JLabel();
        jtfMoneyReceived = new javax.swing.JTextField();
        jlMoneyReceived = new javax.swing.JLabel();
        jtfChangeAmount = new javax.swing.JTextField();
        jLChangeAmount = new javax.swing.JLabel();
        cbPromotion = new lib2.ComboBoxSuggestion();
        cbPayments = new lib2.ComboBoxSuggestion();
        jLMinusPoints = new javax.swing.JLabel();
        cbPonis = new lib2.ComboBoxSuggestion();
        jLTitleVAT = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPPendingInvoice.setBackground(new java.awt.Color(255, 255, 255));
        jPPendingInvoice.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách hóa đơn chờ"));

        jTablePendingInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hóa đơn", "Tên khách hàng", "Tên nhân viên", "Ngày tạo", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePendingInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePendingInvoiceMouseClicked(evt);
            }
        });
        jSPPendingnvoice.setViewportView(jTablePendingInvoice);

        javax.swing.GroupLayout jPPendingInvoiceLayout = new javax.swing.GroupLayout(jPPendingInvoice);
        jPPendingInvoice.setLayout(jPPendingInvoiceLayout);
        jPPendingInvoiceLayout.setHorizontalGroup(
            jPPendingInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPPendingnvoice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        jPPendingInvoiceLayout.setVerticalGroup(
            jPPendingInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPPendingnvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        );

        jPQR.setBackground(new java.awt.Color(255, 255, 255));
        jPQR.setBorder(javax.swing.BorderFactory.createTitledBorder("Quét mã sản phẩm"));
        jPQR.setToolTipText("");

        jpWebcam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPQRLayout = new javax.swing.GroupLayout(jPQR);
        jPQR.setLayout(jPQRLayout);
        jPQRLayout.setHorizontalGroup(
            jPQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpWebcam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPQRLayout.setVerticalGroup(
            jPQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jP1Layout = new javax.swing.GroupLayout(jP1);
        jP1.setLayout(jP1Layout);
        jP1Layout.setHorizontalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addComponent(jPPendingInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP1Layout.setVerticalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPPendingInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jP2.setBackground(new java.awt.Color(255, 255, 255));
        jP2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sản phẩm chờ thanh toán"));

        jTableCart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số lượng", "Giá gốc", "Giá khuyến mãi", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableCartMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableCartMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableCartMouseReleased(evt);
            }
        });
        jTableCart.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTableCartPropertyChange(evt);
            }
        });
        jTableCart.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTableCartVetoableChange(evt);
            }
        });
        jSPCart.setViewportView(jTableCart);

        javax.swing.GroupLayout jP2Layout = new javax.swing.GroupLayout(jP2);
        jP2.setLayout(jP2Layout);
        jP2Layout.setHorizontalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPCart)
        );
        jP2Layout.setVerticalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addComponent(jSPCart)
                .addContainerGap())
        );

        jP3.setBackground(new java.awt.Color(255, 255, 255));
        jP3.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết hóa đơn"));

        iP3_4.setBackground(new java.awt.Color(255, 255, 255));
        iP3_4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPay.setBackground(new java.awt.Color(135, 206, 235));
        btnPay.setForeground(new java.awt.Color(255, 255, 255));
        btnPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pay24.png"))); // NOI18N
        btnPay.setText("Thanh toán");
        btnPay.setEnabled(false);
        btnPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPay.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnPayAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btnPendingInvoice.setBackground(new java.awt.Color(135, 206, 235));
        btnPendingInvoice.setForeground(new java.awt.Color(255, 255, 255));
        btnPendingInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/waiting24.png"))); // NOI18N
        btnPendingInvoice.setText("Đơn chờ");
        btnPendingInvoice.setEnabled(false);
        btnPendingInvoice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPendingInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendingInvoiceActionPerformed(evt);
            }
        });

        btnCreateInvoice.setBackground(new java.awt.Color(135, 206, 235));
        btnCreateInvoice.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/create24.png"))); // NOI18N
        btnCreateInvoice.setText("Tạo hóa đơn");
        btnCreateInvoice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateInvoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout iP3_4Layout = new javax.swing.GroupLayout(iP3_4);
        iP3_4.setLayout(iP3_4Layout);
        iP3_4Layout.setHorizontalGroup(
            iP3_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iP3_4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iP3_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(iP3_4Layout.createSequentialGroup()
                        .addComponent(btnCreateInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPendingInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        iP3_4Layout.setVerticalGroup(
            iP3_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iP3_4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(iP3_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPendingInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        iP3_3.setBackground(new java.awt.Color(255, 255, 255));
        iP3_3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lập hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N

        jLIDInvoice.setText("Mã HĐ: ");

        jLIDInvoiceMain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLIDStaff.setText("Mã NV: ");

        jLIDStaffMain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLNameStaff.setText("Tên NV:");

        jLNameStaffMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout iP3_3Layout = new javax.swing.GroupLayout(iP3_3);
        iP3_3.setLayout(iP3_3Layout);
        iP3_3Layout.setHorizontalGroup(
            iP3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iP3_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iP3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iP3_3Layout.createSequentialGroup()
                        .addComponent(jLIDInvoice)
                        .addGap(18, 18, 18)
                        .addComponent(jLIDInvoiceMain, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(iP3_3Layout.createSequentialGroup()
                        .addComponent(jLIDStaff)
                        .addGap(18, 18, 18)
                        .addComponent(jLIDStaffMain, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(iP3_3Layout.createSequentialGroup()
                        .addComponent(jLNameStaff)
                        .addGap(18, 18, 18)
                        .addComponent(jLNameStaffMain, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        iP3_3Layout.setVerticalGroup(
            iP3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iP3_3Layout.createSequentialGroup()
                .addGroup(iP3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIDInvoice)
                    .addComponent(jLIDInvoiceMain, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(iP3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIDStaff)
                    .addComponent(jLIDStaffMain, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(iP3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNameStaff)
                    .addComponent(jLNameStaffMain, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        iP3_1.setBackground(new java.awt.Color(255, 255, 255));
        iP3_1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách hàng cũ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N

        jlPhoneCus.setText("SDT Khách hàng :");

        jtfPhoneCus.setEditable(false);
        jtfPhoneCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfPhoneCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPhoneCusActionPerformed(evt);
            }
        });

        btnSearchPhone.setBackground(new java.awt.Color(135, 206, 235));
        btnSearchPhone.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search24.png"))); // NOI18N
        btnSearchPhone.setText("Tìm  ");
        btnSearchPhone.setEnabled(false);
        btnSearchPhone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearchPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPhoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout iP3_1Layout = new javax.swing.GroupLayout(iP3_1);
        iP3_1.setLayout(iP3_1Layout);
        iP3_1Layout.setHorizontalGroup(
            iP3_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iP3_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iP3_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iP3_1Layout.createSequentialGroup()
                        .addComponent(jtfPhoneCus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(iP3_1Layout.createSequentialGroup()
                        .addComponent(jlPhoneCus)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        iP3_1Layout.setVerticalGroup(
            iP3_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iP3_1Layout.createSequentialGroup()
                .addComponent(jlPhoneCus)
                .addGap(0, 0, 0)
                .addGroup(iP3_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearchPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfPhoneCus))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jP3_2.setBackground(new java.awt.Color(255, 255, 255));
        jP3_2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlNameCus.setText("Tên KH :");

        jtfNameCus.setEditable(false);
        jtfNameCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNameCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameCusActionPerformed(evt);
            }
        });

        jtfEmail.setEditable(false);
        jtfEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });

        jlEmail.setText("Email :");

        jLPoints.setText("Điểm tích lũy:");

        jTFPoints.setEditable(false);

        javax.swing.GroupLayout jP3_2Layout = new javax.swing.GroupLayout(jP3_2);
        jP3_2.setLayout(jP3_2Layout);
        jP3_2Layout.setHorizontalGroup(
            jP3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP3_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlNameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEmail, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(13, 13, 13)
                .addGroup(jP3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfEmail)
                    .addComponent(jtfNameCus)
                    .addComponent(jTFPoints))
                .addContainerGap())
        );
        jP3_2Layout.setVerticalGroup(
            jP3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP3_2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jP3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNameCus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPoints))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jP_3_3.setBackground(new java.awt.Color(255, 255, 255));
        jP_3_3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTotalAmount.setText("TỔNG TIỀN: ");

        jtfTotalAmount.setEditable(false);
        jtfTotalAmount.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jtfTotalAmount.setForeground(new java.awt.Color(255, 51, 51));
        jtfTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTotalAmountActionPerformed(evt);
            }
        });

        jlVoucher.setText("Giảm giá:");

        jlPayments.setText("HT thanh toán :");

        jtfMoneyReceived.setEditable(false);
        jtfMoneyReceived.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfMoneyReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMoneyReceivedActionPerformed(evt);
            }
        });
        jtfMoneyReceived.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtfMoneyReceivedPropertyChange(evt);
            }
        });

        jlMoneyReceived.setText("Tiền nhận:");

        jtfChangeAmount.setEditable(false);
        jtfChangeAmount.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLChangeAmount.setText("Tiền trả lại");

        cbPromotion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Không áp dụng" }));
        cbPromotion.setEnabled(false);
        cbPromotion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPromotionItemStateChanged(evt);
            }
        });

        cbPayments.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tiền mặt", "Momo" }));
        cbPayments.setEnabled(false);
        cbPayments.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPaymentsItemStateChanged(evt);
            }
        });
        cbPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPaymentsActionPerformed(evt);
            }
        });

        jLMinusPoints.setText("Trừ điểm TL:");

        cbPonis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1000", "2000", "3000", "4000", "5000", "6000", "7000", "8000", "9000", "10000" }));
        cbPonis.setEnabled(false);
        cbPonis.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPonisItemStateChanged(evt);
            }
        });

        jLTitleVAT.setText("(Đã bao gồm phí VAT)");

        javax.swing.GroupLayout jP_3_3Layout = new javax.swing.GroupLayout(jP_3_3);
        jP_3_3.setLayout(jP_3_3Layout);
        jP_3_3Layout.setHorizontalGroup(
            jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_3_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlPayments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLMinusPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jP_3_3Layout.createSequentialGroup()
                            .addComponent(jlVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addGap(6, 6, 6)))
                    .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLChangeAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlMoneyReceived, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jtfTotalAmount)
                    .addComponent(jtfMoneyReceived)
                    .addComponent(jtfChangeAmount)
                    .addComponent(cbPayments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbPonis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_3_3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLTitleVAT)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        jP_3_3Layout.setVerticalGroup(
            jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_3_3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTotalAmount))
                .addGap(1, 1, 1)
                .addComponent(jLTitleVAT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVoucher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMinusPoints)
                    .addComponent(cbPonis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPayments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMoneyReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMoneyReceived))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfChangeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLChangeAmount))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout jP3Layout = new javax.swing.GroupLayout(jP3);
        jP3.setLayout(jP3Layout);
        jP3Layout.setHorizontalGroup(
            jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iP3_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(iP3_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(iP3_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jP3_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jP_3_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jP3Layout.setVerticalGroup(
            jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP3Layout.createSequentialGroup()
                .addComponent(iP3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iP3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iP3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPhoneCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPhoneCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPhoneCusActionPerformed

    private void jtfMoneyReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMoneyReceivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMoneyReceivedActionPerformed

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void cbPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaymentsActionPerformed

    }//GEN-LAST:event_cbPaymentsActionPerformed

    private void btnSearchPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPhoneActionPerformed
        if (jtfNameCus.getText().equals("")) {
            String phone = jtfPhoneCus.getText().trim();
            if (phone.length() <= 0) {
                showERROR(jtfPhoneCus, "Vui lòng nhập số điện thoại của khách hàng !");
                return;
            }
            if (checkRegex(phone, "^0\\d{9}$") == false) {
                showERROR(jtfPhoneCus, "Số điện thoại không đúng định dạng 0xx.xxxx.xxx vui lòng kiểm tra lại");
                return;
            }
            Customer customer = customer_DAO.getCustomerByPhone(phone);
            if (customer != null) {
                jtfEmail.setText(customer.getEmail());
                jtfNameCus.setText(customer.getName());
                btnPay.setEnabled(true);
                jTFPoints.setText(customer.getRewardPoints() + "");
                cbPonis.setEnabled(true);
                Flag.setIdCusForSell_GUI(customer.getIdCustomer().trim());
                jtfPhoneCus.setEditable(false);

                cbPayments.setEnabled(true);
                cbPonis.setEnabled(true);
                cbPromotion.setEnabled(true);
                btnPendingInvoice.setEnabled(true);
                jtfMoneyReceived.setEditable(true);
            } else {
                if (JOptionPane.showConfirmDialog(null, "Khách hàng chưa tồn tại trên hệ thống, vui lòng thêm mới khách hàng !", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    Flag.setFlagSell_GUI(1);
                    stopWebcam();
                    toCustomerGUI();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Đã có thông tin khách hàng cho hóa đơn !");
        }
    }//GEN-LAST:event_btnSearchPhoneActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        if (btnPendingInvoice.getText().equals("Đơn chờ")) {//            Đang ở trạng thái hóa đơn mới
            if (!jtfTotalAmount.getText().trim().equals("")) {
                if (cbPayments.getSelectedIndex() == 0) {
                    if (validator()) {
                        updateChangeAmount();
                        double totalAmount = Double.parseDouble(jtfTotalAmount.getText().trim().replaceAll("\\ VNĐ", ""));
                        String str1 = "Tổng tiền hàng phải trả là : ";
                        String str2 = "Số tiền phải phải trả lại khách hành là : ";
                        String str3 = jtfChangeAmount.getText().trim().replaceAll("\\ VNĐ", "");
                        if (JOptionPane.showConfirmDialog(null, str2 + utils.Utils.formatMoney(Double.valueOf(str3)), "Xác nhận thanh toán", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            boolean res = createInvoice("Đã thanh toán");
                            if (res) {
                                JOptionPane.showMessageDialog(null, "Thanh toán thành công");
                                cbPayments.setEnabled(false);
                                updateQuantityProduct();
//                                printInvoice(invoice_DAO.getInvoiceById(jLIDInvoiceMain.getText()));

                                String strTotal = jtfTotalAmount.getText().trim().replaceAll("\\ .0", "").replaceAll("\\ VNĐ", "");
                                double total = Double.parseDouble(strTotal);
                                String strChangeAmount = jtfChangeAmount.getText().trim().replaceAll("\\ .0", "").replaceAll("\\ VNĐ", "");
                                double changeAmount = Double.parseDouble(strChangeAmount);
                                String strMoneyReceived = jtfMoneyReceived.getText().trim().replaceAll("\\ .0", "").replaceAll("\\ VNĐ", "");
                                double moneyReceived = Double.parseDouble(strMoneyReceived);
                                Invoice invoiceTMP = invoice_DAO.getInvoiceById(jLIDInvoiceMain.getText());
                                printInvoice(invoiceTMP, total, moneyReceived, changeAmount);
                                clearInfoInvoice();
                            }
                        } else {
                            jtfChangeAmount.setText("");
                        }
                    }
                } else if (cbPayments.getSelectedIndex() == 1) {
                    Flag.setIdInvoiceForPrintf(jLIDInvoiceMain.getText());
                    try {
                        String monney = jtfTotalAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", ""); // truyền số tiền hàng vào đây
                        String str1 = "2|99|0365962232|Nguyen Tong Anh Quan||0|0|";
                        String str2 = "||transfer_myqr";
                        String QrCodeData = str1 + monney + str2;
                        String fileName = "QRPay.png";
                        String filePath = "D:\\FleyShopApp\\QRPay\\" + fileName;
//
                        String charset = "UTF-8";
                        Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
                        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
                        BitMatrix matrix = new MultiFormatWriter().encode(
                                new String(QrCodeData.getBytes(charset), charset),
                                BarcodeFormat.QR_CODE, 242, 242, hintMap);
                        MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.') + 1), new File(filePath));
                    } catch (Exception e) {
                    }
                    Momo_GUI momo_GUI = new Momo_GUI();
                    momo_GUI.setVisible(true);

//                Sự kiện lắng nghe Jframe momo đóng
                    momo_GUI.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            if (Flag.isFlagPayDone()) { // nếu đã thanh toán thành công
                                boolean res = createInvoice("Đã thanh toán");
                                if (res) {
                                    JOptionPane.showMessageDialog(null, "Thanh toán thành công");
                                    updateQuantityProduct();
                                    String strTotal = jtfTotalAmount.getText().trim().replaceAll("\\ .0", "").replaceAll("\\ VNĐ", "");
                                    double total = Double.parseDouble(strTotal);
                                    Invoice invoiceTMP = invoice_DAO.getInvoiceById(jLIDInvoiceMain.getText());
                                    printInvoice(invoiceTMP, total, total, 0);
                                    clearInfoInvoice();
                                }
                            }
                        }
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "Chưa có sản phẩm nào trong giỏ hàng vui lòng kiểm tra lại");
                return;
            }
        } else if (btnPendingInvoice.getText().equals("Hủy")) { // trạng thái đơn chờ
            if (!jtfTotalAmount.getText().trim().equals("")) {
                if (cbPayments.getSelectedIndex() == 0) {
                    if (validator()) {
                        updateChangeAmount();
                        double totalAmount = Double.parseDouble(jtfTotalAmount.getText().trim().replaceAll("\\ VNĐ", ""));
                        String str1 = "Tổng tiền hàng phải trả là : ";
                        String str2 = "Số tiền phải phải trả lại khách hành là : ";
                        String str3 = jtfChangeAmount.getText().trim().replaceAll("\\ VNĐ", "");
                        if (JOptionPane.showConfirmDialog(null, str2 + utils.Utils.formatMoney(Double.valueOf(str3)), "Xác nhận thanh toán", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            String idInvoice = jLIDInvoiceMain.getText().trim();
                            boolean res = invoice_DAO.updateInvoiceStatus(idInvoice, "Đã thanh toán");
                            if (res) {
                                JOptionPane.showMessageDialog(null, "Thanh toán thành công");
                                updateQuantityProduct();
                                //Cập nhập lại số lượng mã khuyến mãi
                                minusQuantityPromotion(promotion_DAO.getPromotionByID(getPromotionIdFromComboBox()));
                                //Cập nhập điểm tích lũy
                                Customer customer = customer_DAO.getCustomerByID(Flag.getIdCusForSell_GUI());
                                minusPointsCustomer(customer);
                                //Cộng điểm tích lũy dựa trên tổng tiền hóa đơn
                                sumPointsCustomer(customer);

                                loadDataPendingInvoice();
                                defaultTableModelCart.setRowCount(0);
                                Flag.setIdInvoiceForPrintf(idInvoice); // set idinvoice để in hóa đơn
//                                printInvoice(invoice_DAO.getInvoiceById(idInvoice));
                                String strTotal = jtfTotalAmount.getText().trim().replaceAll("\\ .0", "").replaceAll("\\ VNĐ", "");
                                double total = Double.parseDouble(strTotal);
                                String strChangeAmount = jtfChangeAmount.getText().trim().replaceAll("\\ .0", "").replaceAll("\\ VNĐ", "");
                                double changeAmount = Double.parseDouble(strChangeAmount);
                                String strMoneyReceived = jtfMoneyReceived.getText().trim().replaceAll("\\ .0", "").replaceAll("\\ VNĐ", "");
                                double moneyReceived = Double.parseDouble(strMoneyReceived);
                                Invoice invoiceTMP = invoice_DAO.getInvoiceById(jLIDInvoiceMain.getText());
                                printInvoice(invoiceTMP, totalAmount, moneyReceived, changeAmount);

                                btnCreateInvoice.setEnabled(true);
                                btnPendingInvoice.setText("Đơn chờ");

                                clearInfoInvoice();
                                clearAllInPut();
                            }

                        } else {
                            jtfChangeAmount.setText("");
                        }
                    }
                }
//                else if (cbPayments.getSelectedIndex() == 1) {
//                    Flag.setIdInvoiceForPrintf(jLIDInvoiceMain.getText());
//                    try {
//                        String monney = jtfTotalAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", ""); // truyền số tiền hàng vào đây
//                        String str1 = "2|99|0365962232|Nguyen Tong Anh Quan||0|0|";
//                        String str2 = "||transfer_myqr";
//                        String QrCodeData = str1 + monney + str2;
//                        String fileName = "QRPay.png";
//                        String filePath = "D:\\FleyShopApp\\QRPay\\" + fileName;
////
//                        String charset = "UTF-8";
//                        Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
//                        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
//                        BitMatrix matrix = new MultiFormatWriter().encode(
//                                new String(QrCodeData.getBytes(charset), charset),
//                                BarcodeFormat.QR_CODE, 242, 242, hintMap);
//                        MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.') + 1), new File(filePath));
//                    } catch (Exception e) {
//                    }
//                    Momo_GUI momo_GUI = new Momo_GUI();
//                    momo_GUI.setVisible(true);
//
////                Sự kiện lắng nghe Jframe momo đóng
//                    momo_GUI.addWindowListener(new WindowAdapter() {
//                        @Override
//                        public void windowClosed(WindowEvent e) {
//                            if (Flag.isFlagPayDone()) { // nếu đã thanh toán thành công
//                                boolean res = createInvoice("Đã thanh toán");
//                                if (res) {
//                                    JOptionPane.showMessageDialog(null, "Thanh toán thành công");
//updateQuantityProduct
//                                    printInvoice(invoice_DAO.getInvoiceById(jLIDInvoiceMain.getText()));
//                                    clearInfoInvoice();
//                                }
//                            }
//                        }
//                    });
//                }
            } else {
                JOptionPane.showMessageDialog(null, "Chưa có sản phẩm nào trong giỏ hàng vui lòng kiểm tra lại");
                return;
            }
        }
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnPendingInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendingInvoiceActionPerformed
        if (btnPendingInvoice.getText().equals("Đơn chờ") && defaultTableModelCart.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đặt trạng thái chờ cho đơn hàng không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                boolean res = createInvoice("Đơn chờ");
                if (res) {
                    JOptionPane.showMessageDialog(null, "Tạo đơn chờ thành công");
                    loadDataPendingInvoice();
                    clearInfoInvoice();
                }
            }
        } else if (btnPendingInvoice.getText().equals("Hủy")) {
            defaultTableModelCart.setRowCount(0);
            btnPendingInvoice.setEnabled(false);
            btnPay.setEnabled(false);
            jtfMoneyReceived.setEditable(false);

            clearAllInPut();
            jtfMoneyReceived.setEditable(false);
            cbPonis.setEditable(false);

            jLIDInvoiceMain.setText("");
            jLIDStaffMain.setText("");
            jLNameStaffMain.setText("");

            cbPayments.setEnabled(false);
            cbPonis.setEnabled(false);
            cbPromotion.setEnabled(false);
            jtfTotalAmount.setText(""); // khác
            btnCreateInvoice.setEnabled(true);
            btnPendingInvoice.setText("Đơn chờ");

        } else if (defaultTableModelCart.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Giỏ hàng đang trống không thể tạo đơn chờ !");
        }
    }//GEN-LAST:event_btnPendingInvoiceActionPerformed

    private void btnCreateInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateInvoiceActionPerformed
        if (btnCreateInvoice.getText().equals("Tạo hóa đơn")) {
            defaultTableModelCart.setRowCount(0);
            jtfPhoneCus.setEditable(true);
            btnSearchPhone.setEnabled(true);
            btnCreateInvoice.setText("Hủy");
            jtfMoneyReceived.setEditable(false);

            jLIDInvoiceMain.setText(invoice_DAO.createIDInvoice());
            jLIDStaffMain.setText(Flag.getIdStaff());
            jLNameStaffMain.setText(staff_DAO.getStaffByID(Flag.getIdStaff()).getName());

            Flag.setIdInvoiceForPrintf(jLIDInvoiceMain.getText()); // lưu id hóa đơn để in hóa đơn

        } else if (btnCreateInvoice.getText().equals("Hủy") && !jtfPhoneCus.getText().trim().equals("")) {
            if (defaultTableModelCart.getRowCount() != 0) {
                int option = JOptionPane.showConfirmDialog(null, "Giỏ hàng đang bận bạn có chắc muốn hủy toàn bộ không !", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    clearInfoInvoice();
                }
            } else {
                jtfPhoneCus.setEditable(false);
                btnSearchPhone.setEnabled(false);
                btnPendingInvoice.setEnabled(false);
                btnCreateInvoice.setText("Tạo hóa đơn");
                btnPay.setEnabled(false);
                jtfMoneyReceived.setEditable(false);

                clearAllInPut();
                jtfMoneyReceived.setEditable(false);
                cbPonis.setEditable(false);

                jLIDInvoiceMain.setText("");
                jLIDStaffMain.setText("");
                jLNameStaffMain.setText("");

                cbPayments.setEnabled(false);
                cbPonis.setEnabled(false);
                cbPromotion.setEnabled(false);
            }
        } else if (btnCreateInvoice.getText().equals("Hủy")) {
            if (defaultTableModelCart.getRowCount() != 0) {
                int option = JOptionPane.showConfirmDialog(null, "Giỏ hàng đang bận bạn có chắc muốn hủy toàn bộ không !", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    clearInfoInvoice();
                }
            } else {
                jtfPhoneCus.setEditable(false);
                btnSearchPhone.setEnabled(false);
                btnPendingInvoice.setEnabled(false);
                btnCreateInvoice.setText("Tạo hóa đơn");
                btnPay.setEnabled(false);
                jtfMoneyReceived.setEditable(false);

                clearAllInPut();
                jtfMoneyReceived.setEditable(false);
                cbPonis.setEditable(false);

                jLIDInvoiceMain.setText("");
                jLIDStaffMain.setText("");
                jLNameStaffMain.setText("");

                cbPayments.setEnabled(false);
                cbPonis.setEnabled(false);
                cbPromotion.setEnabled(false);
                jtfTotalAmount.setText(""); // khác
            }
        }
    }//GEN-LAST:event_btnCreateInvoiceActionPerformed

    private void jTableCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCartMouseClicked

    }//GEN-LAST:event_jTableCartMouseClicked

    private void jTableCartPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTableCartPropertyChange
        if ("tableCellEditor".equals(evt.getPropertyName())) {
            int selectedRow = jTableCart.getSelectedRow();
            int selectedColumn = jTableCart.getSelectedColumn();

            if (selectedColumn == 3) { // Kiểm tra nếu cột là cột số lượng
                String quantitySTR = jTableCart.getValueAt(selectedRow, 3).toString().trim().replaceAll("\\.0", "").replaceAll("đ", "");
                String priceSTR = jTableCart.getValueAt(selectedRow, 4).toString().trim().replaceAll("\\.0", "").replaceAll("đ", "");
                int quantity = Integer.parseInt(quantitySTR);
                double unitPrice = Double.parseDouble(priceSTR);
                double totalPrice = quantity * unitPrice;

                // Cập nhật giá trị trong JTable
                jTableCart.setValueAt(totalPrice + "đ", selectedRow, 5);

                // Bắt buộc JTable cập nhật lại hiển thị cho ô cụ thể đã thay đổi
                ((AbstractTableModel) jTableCart.getModel()).fireTableCellUpdated(selectedRow, 5);
                // Tính tổng tiền và đặt vào JTextField
            }
        }
    }//GEN-LAST:event_jTableCartPropertyChange

    private void jTableCartVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTableCartVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCartVetoableChange

    private void jTableCartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCartMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCartMouseEntered

    private void jTableCartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCartMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCartMousePressed

    private void jTableCartMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCartMouseReleased

    }//GEN-LAST:event_jTableCartMouseReleased

    private void cbPaymentsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPaymentsItemStateChanged
        if (cbPayments.getSelectedIndex() == 0) {
            jtfMoneyReceived.setEditable(true);
        } else if (cbPayments.getSelectedIndex() == 1) {
            jtfMoneyReceived.setEditable(false);
            jtfMoneyReceived.setText("");
        }
    }//GEN-LAST:event_cbPaymentsItemStateChanged

    private void jtfNameCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameCusActionPerformed

    private void jtfTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTotalAmountActionPerformed

    private void jtfMoneyReceivedPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtfMoneyReceivedPropertyChange

    }//GEN-LAST:event_jtfMoneyReceivedPropertyChange

    private void cbPromotionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPromotionItemStateChanged
        // 2) Lấy tiền giảm khuyến mãi nếu có
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String currentPromotionId = getPromotionIdFromComboBox();

            if (currentPromotionId != null && !currentPromotionId.equals(previousPromotionId)) {
                double promotionMoney = 0;
                Promotion promotion = promotion_DAO.getPromotionByID(currentPromotionId);
                if (promotion != null) {
                    promotionMoney = promotion.getDiscount();
                }

                // Kiểm tra giá trị gốc trước khi thay đổi
                if (originalTotalAmount == 0) {
                    originalTotalAmount = Double.parseDouble(jtfTotalAmount.getText().trim().replaceAll("\\ VNĐ", ""));
                }

                double totalAmount = originalTotalAmount - promotionMoney;
                originalTotalAmount = totalAmount; // cập nhập lại giá hiện tại
                jtfTotalAmount.setText(totalAmount + " VNĐ");

                // Cập nhật trạng thái trước đó
                previousPromotionId = currentPromotionId;

            }
            if (cbPonis.getSelectedIndex() > 0) {
                cbPonis.setSelectedIndex(0); // set điểm về 0 để tránh lỗi
            }
        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
            // Đặt giá trị gốc về 0 khi không có khuyến mãi được chọn
            originalTotalAmount = 0;

            double vatValue = calculateTotalAmount() * (vat_dao.getVAT() / 100);
            double total = vatValue + calculateTotalAmount();
            originalTotalAmount = total;
            jtfTotalAmount.setText(total + " VNĐ");

            // Cập nhật trạng thái trước đó
            previousPromotionId = "";

            if (cbPonis.getSelectedIndex() > 0) {
                cbPonis.setSelectedIndex(0); // set điểm về 0 để tránh lỗi
            }
        }
    }//GEN-LAST:event_cbPromotionItemStateChanged

    private void cbPonisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPonisItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String idCustomer = Flag.getIdCusForSell_GUI();
            Customer customer = customer_DAO.getCustomerByID(idCustomer);

            int currentPointsIndex = cbPonis.getSelectedIndex();
            if (validator_2(customer) && jTableCart.getRowCount() > 0 && currentPointsIndex != previousPointsIndex) {
                double pointsToMoney = getPointsToMoney();

                double totalAmount = originalTotalAmount - pointsToMoney;
                jtfTotalAmount.setText(totalAmount + " VNĐ");

                // Cập nhật trạng thái trước đó
                previousPointsIndex = currentPointsIndex;
            }
        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
            // Cập nhật trạng thái trước đó
            previousPointsIndex = -1;
        }
    }//GEN-LAST:event_cbPonisItemStateChanged

    private void btnPayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnPayAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPayAncestorAdded

    private void jTablePendingInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePendingInvoiceMouseClicked
        if (evt.getClickCount() == 2 && btnCreateInvoice.getText().equals("Tạo hóa đơn")) {
            int selectedRow = jTablePendingInvoice.getSelectedRow();
            String idInvoice = (String) defaultTableModelPendingInvoice.getValueAt(selectedRow, 1);
            loadListProductPendingInvoice(idInvoice);
            Invoice invoiceTMP = invoice_DAO.getInvoiceById(idInvoice);
            Flag.setIdCusForSell_GUI(invoiceTMP.getCustomer().getIdCustomer()); // set id vào cờ để check được điểm tích lũy
        }
    }//GEN-LAST:event_jTablePendingInvoiceMouseClicked
// Xóa thông tin chi tiết trên hóa đơn

    private void clearInfoInvoice() {
        defaultTableModelCart.setRowCount(0);

        jLIDInvoiceMain.setText("");
        jLIDStaffMain.setText("");
        jLNameStaffMain.setText("");

        jtfPhoneCus.setText("");
        jtfPhoneCus.setEditable(false);

        jtfNameCus.setText("");
        jtfEmail.setText("");
        jTFPoints.setText("");

        jtfTotalAmount.setText("");
        cbPromotion.setSelectedIndex(0);
        cbPromotion.setEnabled(false);
        cbPonis.setSelectedItem(0);
        cbPonis.setEnabled(false);
        cbPayments.setSelectedIndex(0);
        cbPayments.setEditable(false);

        jtfMoneyReceived.setText("");
        jtfMoneyReceived.setEditable(false);
        jtfChangeAmount.setText("");

        btnCreateInvoice.setText("Tạo hóa đơn");
        btnPendingInvoice.setEnabled(false);
        btnPay.setEnabled(false);
    }
//   Cập nhập giá tiền phải trả lại khách

    private void updateChangeAmount() {
        if (validator()) {
            double totalAmount = Double.parseDouble(jtfTotalAmount.getText().trim().replaceAll("\\ VNĐ", ""));
            double moneyReceived = Double.parseDouble((jtfMoneyReceived.getText().trim()));
            double changeAmount = moneyReceived - totalAmount;
            jtfChangeAmount.setText(changeAmount + " VNĐ");
        }
    }

//    Kiểm tra dữ liệu số
    private boolean isNumber(String number) {
        try {
            int num = Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }

//    Đổi điểm tích lũy sang tiền
    private int getPointsToMoney() {
        int points = 0;
        int cBBSelectedIndex = cbPonis.getSelectedIndex();
        switch (cBBSelectedIndex) {
            case 0:
                points = 0;
                break;
            case 1:
                points = 10000;
                break;
            case 2:
                points = 20000;
                break;
            case 3:
                points = 30000;
                break;
            case 4:
                points = 40000;
                break;
            case 5:
                points = 50000;
                break;
            case 6:
                points = 60000;
                break;
            case 7:
                points = 70000;
                break;
            case 8:
                points = 80000;
                break;
            case 9:
                points = 90000;
                break;
            case 10:
                points = 100000;
                break;
            default:
                points = 0;
                break;
        }
        return points;
    }

    private boolean validator() {
        if (cbPayments.getSelectedIndex() == 0) {
            if (jtfMoneyReceived.getText().trim().equals("")) {
                return showERROR(jtfMoneyReceived, "Vui lòng nhập số tiền nhận trước khi thanh toán !");
            }
            if (!isNumber(jtfMoneyReceived.getText().trim())) {
                return showERROR(jtfMoneyReceived, "Số tiền nhận vào không chính xác, vui lòng kiểm tra lại");
            }
            if (Double.parseDouble(jtfMoneyReceived.getText().trim()) < 0) {
                return showERROR(jtfMoneyReceived, "Số tiền nhận phải lớn hơn 0 !");
            }
            double total = Double.parseDouble(jtfTotalAmount.getText().trim().replaceAll("\\ VNĐ", ""));
            if (Double.parseDouble(jtfMoneyReceived.getText().trim()) < total) {
                return showERROR(jtfMoneyReceived, "Số tiền nhận không đủ đề thanh toán vui lòng kiểm tra lại !");
            }
        }
        return true;
    }

    private boolean validator_2(Customer customer) {
        int points = 0;
        int cBBSelectedIndex = cbPonis.getSelectedIndex();

        switch (cBBSelectedIndex) {
            case 0:
                points = 0;
                break;
            case 1:
                points = 1000;
                break;
            case 2:
                points = 2000;
                break;
            case 3:
                points = 3000;
                break;
            case 4:
                points = 4000;
                break;
            case 5:
                points = 5000;
                break;
            case 6:
                points = 6000;
                break;
            case 7:
                points = 7000;
                break;
            case 8:
                points = 8000;
                break;
            case 9:
                points = 9000;
                break;
            case 10:
                points = 10000;
                break;
            default:
                points = 0;
                break;
        }

        if (customer.getRewardPoints() < points) {
            JOptionPane.showMessageDialog(null, "Điểm tích lũy của khách hàng không đủ để trừ vui lòng kiểm tra lại !");
            cbPonis.setSelectedIndex(0);
            return false;
        }
        return true;
    }

    private void clearAllInPut() {
        jtfEmail.setText("");
        jtfChangeAmount.setText("");
        jtfMoneyReceived.setText("");
        jtfNameCus.setText("");
        jtfPhoneCus.setText("");
        jtfTotalAmount.setText("");
        cbPonis.setSelectedIndex(0);
        jTFPoints.setText("");
        cbPayments.setSelectedIndex(0);
        cbPromotion.setSelectedItem("");
    }

// Hàm tính tổng tiền từ cột "thành tiền" của JTable
    private double calculateTotalAmount() {
        double totalAmount = 0;
        int rowCount = jTableCart.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            String value = jTableCart.getValueAt(i, 6).toString().trim().replaceAll("\\.0", "").replaceAll("đ", "");
            double total = Double.parseDouble(value);
            totalAmount += total;
        }
        return totalAmount;
    }

//    Load thông tin khuyến mãi lên combobox
    private void loadPromotion(List<Promotion> listPromotion) {
        cbPromotion.removeAllItems();
        cbPromotion.addItem("Không áp dụng");
        for (Promotion promotion : listPromotion) {
            String promotionName = promotion.getName();
            String promotionId = promotion.getIdPromotion();

            cbPromotion.addItem(promotionName);
            promotionMap.put(promotionName, promotionId);
        }
    }

//    Đi đến trang customer_GUI
    public void toCustomerGUI() {
        JPanel parent = (JPanel) this.getParent();
        parent.remove(this);
        parent.add(new Customer_GUI()); // Thay "JPanel1()" bằng cách khởi tạo đúng của JPanel 1
        parent.revalidate();
        parent.repaint();

    }

    private boolean showERROR(JTextField jtf, String mess) {
        jtf.selectAll();
        jtf.requestFocus();
        JOptionPane.showMessageDialog(null, mess);
        return false;
    }

    private boolean checkRegex(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    private void initWebcam() {
        Dimension size = WebcamResolution.VGA.getSize();

        //khởi tạo thuộc tính webcam của jFrame
        webcam = Webcam.getWebcams().get(0);
        //Set kích thước hiển thị của webcam theo đối tượng Dimension vừa tạo
        webcam.setViewSize(size);
        //Khởi tạo thuộc tính webcamPanel với tham số là thuộc tính webcam
        webcamPanel = new WebcamPanel(webcam);
        //Set kích thước của panel bằng với kích thước hiển thị của webcam
        webcamPanel.setPreferredSize(size);
        //tắt hiển thị FPS video
        webcamPanel.setFPSDisplayed(false);
        //lúc đầu và set vị trị của webcamPanel thông qua hàm khởi tạo của Absolute Layout
        jpWebcam.add(webcamPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 220));
        executor.execute(this);
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            }

            Result result = null;
            BufferedImage image = null;

            if (webcam.isOpen()) {
                image = webcam.getImage();
                if (image == null) {
                    continue;
                }
            } else {
                break;
            }

            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException ex) {
            }

            if (result != null) {
                String qrIDProduct = result.getText();
                if ((btnCreateInvoice.getText().equals("Hủy") && !jtfNameCus.getText().equals("")) || btnPendingInvoice.getText().equals("Hủy")) {
                    addToCart(qrIDProduct);
                    jtfMoneyReceived.setText(""); // làm mới ô tiền nhận nếu thêm sản phẩm mới vào giỏ
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng thêm khách hàng trước");
                }

            }

        } while (webcam.isOpen());
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
    }

    public void stopWebcam() {
        webcam.close();
        executor.shutdown();
        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }

//    Thêm sản phẩm vào giỏ hàng
    private void addToCart(String idProduct) {
        Product product = product_DAO.getProductByID(idProduct);

        // Nếu sản phẩm tồn tại
        if (product != null) {
            int currentQuantity = 1; // Số lượng mặc định khi thêm mới sản phẩm vào giỏ hàng

            // Kiểm tra số lượng tồn kho
            if (currentQuantity > product.getQuantity()) {
                JOptionPane.showMessageDialog(null, "Vượt quá số lượng tồn kho, vui lòng kiểm tra lại");
                return; // Không thêm sản phẩm vào giỏ hàng nếu vượt quá số lượng tồn kho
            }

            int rowCount = defaultTableModelCart.getRowCount();
            boolean productExists = false;

            for (int i = 0; i < rowCount; i++) {
                String IdProduct = defaultTableModelCart.getValueAt(i, 1).toString();

                if (IdProduct.equals(idProduct)) {
                    productExists = true;

                    currentQuantity = Integer.parseInt(defaultTableModelCart.getValueAt(i, 3).toString());

                    // Sử dụng thông tin số lượng từ đối tượng sản phẩm đã lấy
                    if (currentQuantity + 1 > product.getQuantity()) {
                        JOptionPane.showMessageDialog(null, "Vượt quá số lượng tồn kho, vui lòng kiểm tra lại");
                    } else {
                        defaultTableModelCart.removeRow(i);  // Xóa hàng cũ

                        double currentPrice = (product.getCurrentPrice() == null || product.getCurrentPrice() == 0) ? product.getOriginalPrice() : product.getCurrentPrice();
                        double total = (currentQuantity + 1) * currentPrice;
                        Object[] rowData = {rowCount + 1, product.getIdProduct(), product.getName(), currentQuantity + 1, product.getOriginalPrice() + "đ", currentPrice, total + "đ"};
                        defaultTableModelCart.addRow(rowData);
                        cbbIndex0(); // đưa các cbb khuyến mãi về 0
                        JOptionPane.showMessageDialog(null, "Đã thêm sản phẩm");
                    }

                    // Kiểm tra khuyến mãi và đặt màu nếu có
                    Map<String, Double> discountInfo = product_DAO.getDiscountForProduct(idProduct);
                    if (!discountInfo.isEmpty()) {
                        defaultTableModelCart.setValueAt("<html><b><font color='BLUE'>" + product.getName() + "</font></b></html>", i, 2);
                        defaultTableModelCart.setValueAt("<html><b><font color='BLUE'>" + product.getCurrentPrice() + "đ" + "</font></b></html>", i, 5);
                    }
                }
            }

            // Kiểm tra sản phẩm đã có trong giỏ hàng chưa
            if (!productExists) {
                double currentPrice = (product.getCurrentPrice() == null || product.getCurrentPrice() == 0) ? product.getOriginalPrice() : product.getCurrentPrice();
                Object[] rowData = {rowCount + 1, product.getIdProduct(), product.getName(), currentQuantity, product.getOriginalPrice() + "đ", currentPrice + "đ", currentPrice + "đ"};

//                // Kiểm tra khuyến mãi và đặt màu nếu có
                Map<String, Double> discountInfo = product_DAO.getDiscountForProduct(idProduct);
                if (!discountInfo.isEmpty()) {
                    rowData[2] = "<html><b><font color='BLUE'>" + product.getName() + "</font></b></html>";
                    rowData[5] = "<html><b><font color='BLUE'>" + product.getCurrentPrice() + "</font></b></html>";
                }
                defaultTableModelCart.addRow(rowData);
                cbbIndex0(); // đưa các cbb khuyến mãi về 0
                JOptionPane.showMessageDialog(null, "Đã thêm sản phẩm");
            }
        }
    }

    // Lấy id của promotion từ tên promotion được chọn
    private String getPromotionIdFromComboBox() {
        String selectedPromotionName = (String) cbPromotion.getSelectedItem();
        return promotionMap.get(selectedPromotionName);

    }

    private void cbbIndex0() {
        cbPromotion.setSelectedIndex(0); // mỗi lần thêm sản phẩm mới đưa cbb giảm giá vè 0
        cbPonis.setSelectedIndex(0); // mỗi lần thêm sản phẩm mới đưa point về 0
    }
//    Tạo hóa đơn

    public boolean createInvoice(String status) {
        String idInvoice = jLIDInvoiceMain.getText().trim();
        Staff staff = staff_DAO.getStaffByID(jLIDStaffMain.getText().trim());
        Customer customer = customer_DAO.getCustomerByID(Flag.getIdCusForSell_GUI());
        Promotion promotion = null;
        String idpromotion = null;

        String amountReceivedSTR = (jtfMoneyReceived.getText().trim() != null && !jtfMoneyReceived.getText().trim().equals("")) ? jtfMoneyReceived.getText().trim() : jtfTotalAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", "");
        double amountReceived = Double.parseDouble(amountReceivedSTR);
        String changeAmountSTR = (jtfChangeAmount.getText().trim() != null && !jtfChangeAmount.getText().trim().equals("")) ? jtfChangeAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", "") : "0";
        double changeAmount = Double.parseDouble(changeAmountSTR);
        double totalAmount = Double.parseDouble(jtfTotalAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", ""));
        LocalDateTime dateCreated = LocalDateTime.now();

        Invoice invoice = new Invoice(idInvoice, staff, customer, promotion, amountReceived, changeAmount, totalAmount, dateCreated, Invoice.convertStringToStatus(status));

        boolean res = invoice_DAO.createInvoice(invoice);

        if (res) {
            if (status.equals("Đã thanh toán")) {
                //Cập nhập lại số lượng mã khuyến mãi
                minusQuantityPromotion(promotion);
                //Cập nhập điểm tích lũy
                minusPointsCustomer(customer);
                //Cộng điểm tích lũy dựa trên tổng tiền hóa đơn
                sumPointsCustomer(customer);
            }// chỉ khi thanh toán thành công mới thực hiện những việc này

            //Thêm chi tiết hóa đơn vào hóa đơn
            processJTableCart(invoice_DAO.getInvoiceById(idInvoice));
            return true;
        }

        return false;
    }

//  Cập nhập lại số lượng mã giảm giá khi mã giảm giá được sử dụng
    private void minusQuantityPromotion(Promotion promotion) {
        if (!cbPromotion.getSelectedItem().toString().equals("Không áp dụng")) {
            promotion = promotion_DAO.getPromotionByID(getPromotionIdFromComboBox());
            String idpromotion = promotion.getIdPromotion();

            // Kiểm tra và giảm số lượng khuyến mãi
            if (promotion.getQuantity() > 0) {
                promotion.setQuantity(promotion.getQuantity() - 1);

                // Kiểm tra số lượng trước khi cập nhật
                if (promotion.getQuantity() < 0) {
//                    System.out.println("Số lượng khuyến mãi không đủ");
                } else {
                    // Nếu số lượng không âm, cập nhật thông tin khuyến mãi
                    promotion_DAO.updateInfoPromotion(promotion);
                }
            }
        }
    }

//  Cập nhập lại điểm tích lũy của khách hàng khi khách hàng sử dụng
    private void minusPointsCustomer(Customer customer) {
        if (cbPonis.getSelectedIndex() > 0) {
            int pointsToDeduct = Integer.parseInt(cbPonis.getSelectedItem().toString());
            customer.setRewardPoints(customer.getRewardPoints() - pointsToDeduct);
            // Cập nhật thông tin khách hàng sau khi trừ điểm
            customer_DAO.updateRewordPoints(customer);
        }
    }

//  Cộng 1000đ tích lũy cho tối 100K tiền hóa đơn
    private void sumPointsCustomer(Customer customer) {
        double totalAmount = Double.parseDouble(jtfTotalAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", ""));
        int newPoints = (int) (totalAmount / 1000);
        // 100TR = 100đ
        int currentPoints = customer.getRewardPoints();
        customer.setRewardPoints(currentPoints + newPoints);
        customer_DAO.updateRewordPoints(customer);
    }

//    Duyệt giỏ hàng để thêm sản phẩm
    private void processJTableCart(Invoice invoice) {
        DefaultTableModel model = (DefaultTableModel) jTableCart.getModel();
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            String productId = (String) model.getValueAt(i, 1);
            int quantity = Integer.parseInt(defaultTableModelCart.getValueAt(i, 3).toString().trim());

//            Xử lý chuỗi nếu có html
            double unitPrice;
            String htmlString = defaultTableModelCart.getValueAt(i, 5).toString().trim();
            if (BasicHTML.isHTMLString(htmlString)) {
                org.jsoup.nodes.Document document = Jsoup.parse(htmlString);
                String textContent = document.text().replaceAll("\\.0", "").replaceAll("\\đ", "");
                unitPrice = Double.parseDouble(textContent);
            } else {
                unitPrice = Double.parseDouble(defaultTableModelCart.getValueAt(i, 5).toString().replaceAll("\\.0", "").replaceAll("\\đ", ""));
            }

            // Sử dụng thông tin để tạo chi tiết hóa đơn
            Product product = product_DAO.getProductByID(productId);
            createInvoiceDetails(invoice, product, quantity, unitPrice);
        }
    }

//  Tạo chi tiết hóa đơn
    private void createInvoiceDetails(Invoice invoice, Product product, int quantity, double unitPrice) {
        try {
            // Tạo chi tiết hóa đơn
            InvoiceDetails invoiceDetails = new InvoiceDetails();
            invoiceDetails.setIdInvoiceDetails(invoiceDetails_DAO.createIDInvoiceDetails());
            invoiceDetails.setInvoice(invoice);
            invoiceDetails.setProduct(product);
            invoiceDetails.setQuantity(quantity);
            invoiceDetails.setUnitPrice(unitPrice);
            invoiceDetails.setReturnQuantity(0); // Số lượng trả
            invoiceDetails.setReturnReason(""); // Lý do trả

            invoiceDetails_DAO.createInvoiceDetails(invoiceDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    cập nhập số lượng sản phẩm
    private boolean updateQuantityProduct() {
        DefaultTableModel model = (DefaultTableModel) jTableCart.getModel();
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            String id = (String) defaultTableModelCart.getValueAt(i, 1);
            int quantity = (int) defaultTableModelCart.getValueAt(i, 3);

            Product product = product_DAO.getProductByID(id);

            if (product.getQuantity() >= quantity) {

                int updatedQuantity = product.getQuantity() - quantity;
                product.setQuantity(updatedQuantity);

                product_DAO.updateInfoProduct(product);

                return true;
            }
        }

        return false;
    }

    //    In hóa đơn
    public static void printInvoice(Invoice invoice, double totalAmount, double amountReceived, double changeAmount) {
        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            // In hóa đơn
            Invoice_GUI invoice_GUI = new Invoice_GUI();
            invoice_GUI.setJlIDInvoiceDetails(invoice.getIdInvoice());
            invoice_GUI.setJlNameCusDetails(invoice.getCustomer().getName());
            invoice_GUI.setJlDateInvoiceDetails(invoice.getDateCreated().toLocalDate().toString());
            invoice_GUI.setJlNameStaffDetails(invoice.getStaff().getName());
//            invoice_GUI.setJlTotalDetails(invoice.getTotalAmount() + "");
//            invoice_GUI.setJlMoneyReceived(invoice.getAmountReceived() + "");
//            invoice_GUI.setJlExcessCash(invoice.getChangeAmount() + "");
            invoice_GUI.setJlTotalDetails(totalAmount + "");
            invoice_GUI.setJlMoneyReceived(amountReceived + "");
            invoice_GUI.setJlExcessCash(changeAmount + "");

            // In hóa đơn
            // print the panel to pdf
            Document document = new Document(); // itextPDF
            try {
                // Đường dẫn tới tệp PDF để lưu hóa đơn
                String pdfFilePath = "bill.pdf";
                // Tạo một đối tượng PdfWriter để viết nội dung vào tệp PDF
                PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath)); // java io, itextPDF
                // Mở tài liệu để bắt đầu viết
                document.open();
                // Lấy kích thước của jpMain
                int width = invoice_GUI.getJpMain().getWidth();
                int height = invoice_GUI.getJpMain().getHeight();
                // Tạo một BufferedImage để chứa hình ảnh của jpMain
                BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                Graphics2D g = image.createGraphics(); // java awt graphic2D

                invoice_GUI.getJpMain().printAll(g);
                g.dispose();
                // Chuyển đổi BufferedImage thành hình ảnh dựng sẵn để chèn vào tài liệu PDF
                com.itextpdf.text.Image pdfImage = com.itextpdf.text.Image.getInstance(image, null);
                // Đặt kích thước của hình ảnh trong tài liệu PDF (có thể điều chỉnh kích thước tùy ý)
                pdfImage.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight()); // itextPDF
                // Chèn hình ảnh vào tài liệu PDF
                document.add(pdfImage);
                // Đóng tài liệu
                document.close();
                openPDF(pdfFilePath); // utils
            } catch (DocumentException | IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Lỗi khi lưu hóa đơn: " + e.getMessage());
            }
        }
    }

//    Load list data pending invoice
    public void loadDataPendingInvoice() {
        defaultTableModelPendingInvoice.setRowCount(0);
        for (Invoice invoice : invoice_DAO.getListPendingInvoice("Đơn chờ")) {
            Object[] rowData = {defaultTableModelPendingInvoice.getRowCount() + 1, invoice.getIdInvoice(), invoice.getCustomer().getName(), invoice.getStaff().getName(), invoice.getDateCreated().toLocalDate(), Invoice.convertStatusToString(invoice.getStatus())};
            defaultTableModelPendingInvoice.addRow(rowData);
        }
    }

//    Load list product pending invoice
    public void loadListProductPendingInvoice(String idInvoice) {
        defaultTableModelCart.setRowCount(0);
        for (InvoiceDetails invoiceDetails : invoiceDetails_DAO.getListInvoiceDetailsById(idInvoice)) {
            double currentPrice = (invoiceDetails.getProduct().getCurrentPrice() == null || invoiceDetails.getProduct().getCurrentPrice() == 0) ? invoiceDetails.getProduct().getOriginalPrice() : invoiceDetails.getProduct().getCurrentPrice();
            double total = invoiceDetails.getQuantity() * currentPrice;
            // 1) Tính giá trị VAT
            double vatValue = total * (vat_dao.getVAT() / 100);
            double totalNew = vatValue + total;
            jtfTotalAmount.setText(total + " VNĐ");

            Object[] rowData = {defaultTableModelCart.getRowCount() + 1, invoiceDetails.getProduct().getIdProduct(), invoiceDetails.getProduct().getName(), invoiceDetails.getQuantity(), invoiceDetails.getProduct().getOriginalPrice() + "đ", currentPrice + "đ", totalNew + "đ"};
            defaultTableModelCart.addRow(rowData);

            for (int i = 0; i < defaultTableModelCart.getRowCount(); i++) {
                // Kiểm tra khuyến mãi và đặt màu nếu có
                Map<String, Double> discountInfo = product_DAO.getDiscountForProduct(invoiceDetails.getProduct().getIdProduct());
                if (!discountInfo.isEmpty()) {
                    defaultTableModelCart.setValueAt("<html><b><font color='BLUE'>" + invoiceDetails.getProduct().getName() + "</font></b></html>", i, 2);
                    defaultTableModelCart.setValueAt("<html><b><font color='BLUE'>" + invoiceDetails.getProduct().getCurrentPrice() + "đ" + "</font></b></html>", i, 5);
                }
            }
        }
        getInfoInvoiceDetailsToGUI(invoice_DAO.getInvoiceById(idInvoice));
        String pricePromotionSTR = jtfTotalAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", "");
    }

//    lấy thông tin hóa đơn hiển thị lên gui
    private void getInfoInvoiceDetailsToGUI(Invoice invoice) {
        jLIDInvoiceMain.setText(invoice.getIdInvoice().trim());
        jLIDStaffMain.setText(invoice.getStaff().getIdStaff().trim());
        jLNameStaffMain.setText(invoice.getStaff().getName().trim());

        jtfPhoneCus.setText(invoice.getCustomer().getPhone().trim());
        jtfNameCus.setText(invoice.getCustomer().getName().trim());
        jtfEmail.setText(invoice.getCustomer().getEmail().trim());
        jTFPoints.setText(invoice.getCustomer().getRewardPoints() + "");

        jtfTotalAmount.setText(calculateTotalAmount() + " VNĐ");

        cbPromotion.setEnabled(true);
        cbPonis.setEnabled(true);
        cbPayments.setEnabled(true);
        jtfMoneyReceived.setEditable(true);

        btnCreateInvoice.setEnabled(false);
        btnPendingInvoice.setText("Hủy");
        btnPendingInvoice.setEnabled(true);
        btnPay.setEnabled(true);
        repaint();
        revalidate();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnCreateInvoice;
    private lib2.Button btnPay;
    private lib2.Button btnPendingInvoice;
    private lib2.Button btnSearchPhone;
    private lib2.ComboBoxSuggestion cbPayments;
    private lib2.ComboBoxSuggestion cbPonis;
    private lib2.ComboBoxSuggestion cbPromotion;
    private javax.swing.JPanel iP3_1;
    private javax.swing.JPanel iP3_3;
    private javax.swing.JPanel iP3_4;
    private javax.swing.JLabel jLChangeAmount;
    private javax.swing.JLabel jLIDInvoice;
    private javax.swing.JLabel jLIDInvoiceMain;
    private javax.swing.JLabel jLIDStaff;
    private javax.swing.JLabel jLIDStaffMain;
    private javax.swing.JLabel jLMinusPoints;
    private javax.swing.JLabel jLNameStaff;
    private javax.swing.JLabel jLNameStaffMain;
    private javax.swing.JLabel jLPoints;
    private javax.swing.JLabel jLTitleVAT;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jP2;
    private javax.swing.JPanel jP3;
    private javax.swing.JPanel jP3_2;
    private javax.swing.JPanel jPPendingInvoice;
    private javax.swing.JPanel jPQR;
    private javax.swing.JPanel jP_3_3;
    private javax.swing.JScrollPane jSPCart;
    private javax.swing.JScrollPane jSPPendingnvoice;
    private javax.swing.JTextField jTFPoints;
    private javax.swing.JTable jTableCart;
    private javax.swing.JTable jTablePendingInvoice;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlMoneyReceived;
    private javax.swing.JLabel jlNameCus;
    private javax.swing.JLabel jlPayments;
    private javax.swing.JLabel jlPhoneCus;
    private javax.swing.JLabel jlTotalAmount;
    private javax.swing.JLabel jlVoucher;
    private javax.swing.JPanel jpWebcam;
    private javax.swing.JTextField jtfChangeAmount;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfMoneyReceived;
    private javax.swing.JTextField jtfNameCus;
    private javax.swing.JTextField jtfPhoneCus;
    private javax.swing.JTextField jtfTotalAmount;
    // End of variables declaration//GEN-END:variables
}
