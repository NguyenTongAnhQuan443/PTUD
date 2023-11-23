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

public class ExchangeProduct_GUI extends javax.swing.JPanel implements Runnable, ThreadFactory {

//    private ProductAddToCart_GUI productAddToCart_GUI;
    private DefaultTableModel defaultTableModelListInvoice;
    private DefaultTableModel defaultTableModelCart;

//    private Promotion_DAO promotion_DAO = new Promotion_DAO();
//    private Customer_DAO customer_DAO = new Customer_DAO();
    private Product_DAO product_DAO = new Product_DAO();
    private Invoice_DAO invoice_DAO = new Invoice_DAO();
//    private Staff_DAO staff_DAO = new Staff_DAO();
    private InvoiceDetails_DAO invoiceDetails_DAO = new InvoiceDetails_DAO();
    private VAT_DAO vat_dao = new VAT_DAO();
//
    private WebcamPanel webcamPanel = null;
    private Webcam webcam = null;
    private ExecutorService executor = Executors.newSingleThreadExecutor(this);
//
//    private double priceRange;
//    private Customer customer;
//    private Map<String, String> promotionMap = new HashMap<>();
//
//    private String previousPromotionId = "";
//// Biến để theo dõi trạng thái trước đó của item CBB Promotion
//    private int previousPointsIndex = -1;
//// Biến để theo dõi trạng thái trước đó của item CBB Points
//    private double originalTotalAmount;
//
//    ;

    public ExchangeProduct_GUI() {
        initComponents();
        TableCustom.apply(jSPListInvoice, TableCustom.TableType.DEFAULT);
        defaultTableModelListInvoice = (DefaultTableModel) jTableListInvoice.getModel();
        ListSelectionModel selectionModel_1 = jTableListInvoice.getSelectionModel();
        selectionModel_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        TableCustom.apply(jSPCart, TableCustom.TableType.DEFAULT);
        defaultTableModelCart = (DefaultTableModel) jTableCart.getModel();
        ListSelectionModel selectionModel_2 = jTableCart.getSelectionModel();
        selectionModel_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        ExecutorService executor = Executors.newSingleThreadExecutor((ThreadFactory) this);
        initWebcam();

        loadListInvoice();

//        if (Flag.getFlagSell_GUI() == 1) { // nếu GUI mở từ Customer_GUI
//            Customer customer1 = customer_DAO.getCustomerByID(Flag.getIdCusForSell_GUI());
//            JTFIDInvoice.setText(customer1.getPhone());
//            jtfEmail.setText(customer1.getEmail());
//            jtfNameCus.setText(customer1.getName());
//            JTFIDInvoice.setEditable(false);
//            btnPendingInvoice.setEnabled(true);
//
//            btnCreateInvoice.setText("Hủy");
//            btnPendingInvoice.setEnabled(true);
//            btnPay.setEnabled(true);
//            jtfMoneyReceived.setEditable(true);
//            jTFPoints.setText(customer1.getRewardPoints() + "");
//
//            cbPayments.setEnabled(true);
//            cbPonis.setEnabled(true);
//            cbPromotion.setEnabled(true);
//        }
//
//        defaultTableModelCart.setRowCount(0); // set cho jtable cart = 0 để table trống lần đầu khởi tạo
// Sự kiện nghe sự thay đổi của jtable
        defaultTableModelCart.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.INSERT || e.getType() == TableModelEvent.UPDATE || e.getType() == TableModelEvent.DELETE) {

                    // 1) Tính giá trị VAT
                    double vatValue = calculateTotalAmount() * (vat_dao.getVAT() / 100);
                    double total = vatValue + calculateTotalAmount();
                    jtfTotalAfter.setText(total + "");

                    // 2) Tính số tiền mới khi sản phẩm được thêm vào giỏ hàng
                    double moneyBefore = Double.parseDouble(jtfTotalBefore.getText());
                    double moneyAfter = Double.parseDouble(jtfTotalAfter.getText());
                    calculateTotalBeforeAfter(moneyBefore, moneyAfter);

                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jPListInvoice = new javax.swing.JPanel();
        jSPListInvoice = new javax.swing.JScrollPane();
        jTableListInvoice = new javax.swing.JTable();
        jPQR = new javax.swing.JPanel();
        jpWebcam = new javax.swing.JPanel();
        jP2 = new javax.swing.JPanel();
        jSPCart = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();
        jP3 = new javax.swing.JPanel();
        iP3_4 = new javax.swing.JPanel();
        btnPay = new lib2.Button();
        btnCancel = new lib2.Button();
        btnCreateInvoice = new lib2.Button();
        jP3_2 = new javax.swing.JPanel();
        jlNameCus = new javax.swing.JLabel();
        jtfNameCus = new javax.swing.JTextField();
        jtfDateCreate = new javax.swing.JTextField();
        jlDateCreate = new javax.swing.JLabel();
        jP_3_3 = new javax.swing.JPanel();
        jlTotalBefore = new javax.swing.JLabel();
        jtfTotalBefore = new javax.swing.JTextField();
        jlTotalAfter = new javax.swing.JLabel();
        jtfTotalAfter = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlAmountNeeded = new javax.swing.JLabel();
        jtfAmountNeeded = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfGiveBack = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jlGiveBack = new javax.swing.JLabel();
        jlWarning1 = new javax.swing.JLabel();
        jlWarning2 = new javax.swing.JLabel();
        jlPayments = new javax.swing.JLabel();
        cbPayments = new lib2.ComboBoxSuggestion();
        jlMoneyReceived = new javax.swing.JLabel();
        jtfMoneyReceived = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLChangeAmount = new javax.swing.JLabel();
        jtfChangeAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLTitleVAT = new javax.swing.JLabel();
        iP3_1 = new javax.swing.JPanel();
        JLIDInvoice = new javax.swing.JLabel();
        JTFIDInvoice = new javax.swing.JTextField();
        btnSearchIDInvoice = new lib2.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        jPListInvoice.setBackground(new java.awt.Color(255, 255, 255));
        jPListInvoice.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách hóa đơn"));

        jTableListInvoice.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableListInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListInvoiceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableListInvoiceMouseEntered(evt);
            }
        });
        jSPListInvoice.setViewportView(jTableListInvoice);

        javax.swing.GroupLayout jPListInvoiceLayout = new javax.swing.GroupLayout(jPListInvoice);
        jPListInvoice.setLayout(jPListInvoiceLayout);
        jPListInvoiceLayout.setHorizontalGroup(
            jPListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPListInvoice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        jPListInvoiceLayout.setVerticalGroup(
            jPListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPListInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
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
                .addComponent(jPListInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP1Layout.setVerticalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPListInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jSPCart, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
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

        btnCancel.setBackground(new java.awt.Color(135, 206, 235));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/x24.png"))); // NOI18N
        btnCancel.setText("Hủy");
        btnCancel.setEnabled(false);
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnCreateInvoice.setBackground(new java.awt.Color(135, 206, 235));
        btnCreateInvoice.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/create24.png"))); // NOI18N
        btnCreateInvoice.setText("Tạo hóa đơn");
        btnCreateInvoice.setEnabled(false);
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
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        iP3_4Layout.setVerticalGroup(
            iP3_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iP3_4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(iP3_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jtfDateCreate.setEditable(false);
        jtfDateCreate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfDateCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDateCreateActionPerformed(evt);
            }
        });

        jlDateCreate.setText("Ngày tạo:");

        javax.swing.GroupLayout jP3_2Layout = new javax.swing.GroupLayout(jP3_2);
        jP3_2.setLayout(jP3_2Layout);
        jP3_2Layout.setHorizontalGroup(
            jP3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP3_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlNameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDateCreate, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(13, 13, 13)
                .addGroup(jP3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDateCreate)
                    .addComponent(jtfNameCus))
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
                    .addComponent(jlDateCreate)
                    .addComponent(jtfDateCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jP_3_3.setBackground(new java.awt.Color(255, 255, 255));
        jP_3_3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTotalBefore.setText("Tổng tiền trước: ");

        jtfTotalBefore.setEditable(false);
        jtfTotalBefore.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jtfTotalBefore.setForeground(new java.awt.Color(255, 51, 51));
        jtfTotalBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTotalBeforeActionPerformed(evt);
            }
        });

        jlTotalAfter.setText("Tổng tiền sau: ");

        jtfTotalAfter.setEditable(false);
        jtfTotalAfter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfTotalAfter.setForeground(new java.awt.Color(0, 153, 255));
        jtfTotalAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTotalAfterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("VNĐ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("VNĐ");

        jlAmountNeeded.setText("KH trả thêm:");

        jtfAmountNeeded.setEditable(false);
        jtfAmountNeeded.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jtfAmountNeeded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAmountNeededActionPerformed(evt);
            }
        });
        jtfAmountNeeded.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtfAmountNeededPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("VNĐ");

        jtfGiveBack.setEditable(false);
        jtfGiveBack.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("VNĐ");

        jlGiveBack.setText("Phải trả lại KH:");

        jlWarning1.setForeground(new java.awt.Color(255, 0, 0));
        jlWarning1.setText("(Nếu tiền hàng LỚN hơn số tiền ban đầu)");

        jlWarning2.setForeground(new java.awt.Color(255, 0, 0));
        jlWarning2.setText("(Nếu tiền hàng NHỎ hơn số tiền ban đầu)");

        jlPayments.setText("HT thanh toán:");

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

        jlMoneyReceived.setText("Tiền nhận:");

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("VNĐ");

        jLChangeAmount.setText("Tiền trả lại");

        jtfChangeAmount.setEditable(false);
        jtfChangeAmount.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("VNĐ");

        jLTitleVAT.setText("(Đã bao gồm phí VAT)");

        javax.swing.GroupLayout jP_3_3Layout = new javax.swing.GroupLayout(jP_3_3);
        jP_3_3.setLayout(jP_3_3Layout);
        jP_3_3Layout.setHorizontalGroup(
            jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_3_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_3_3Layout.createSequentialGroup()
                        .addComponent(jlGiveBack, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfGiveBack, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_3_3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlWarning1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlWarning2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jP_3_3Layout.createSequentialGroup()
                        .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlMoneyReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPayments)
                            .addComponent(jLChangeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_3_3Layout.createSequentialGroup()
                                .addComponent(jtfChangeAmount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(jP_3_3Layout.createSequentialGroup()
                                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfMoneyReceived, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_3_3Layout.createSequentialGroup()
                        .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_3_3Layout.createSequentialGroup()
                                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlTotalBefore)
                                    .addComponent(jlTotalAfter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jP_3_3Layout.createSequentialGroup()
                                .addComponent(jlAmountNeeded)
                                .addGap(27, 27, 27)))
                        .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jP_3_3Layout.createSequentialGroup()
                                .addComponent(jtfAmountNeeded, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLTitleVAT)
                            .addGroup(jP_3_3Layout.createSequentialGroup()
                                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfTotalAfter, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(jtfTotalBefore))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jP_3_3Layout.setVerticalGroup(
            jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_3_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTotalBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTotalBefore)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTotalAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTotalAfter)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitleVAT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAmountNeeded, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAmountNeeded)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlWarning1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfGiveBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlGiveBack)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlWarning2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPayments))
                .addGap(18, 18, 18)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMoneyReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMoneyReceived)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jP_3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfChangeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLChangeAmount)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iP3_1.setBackground(new java.awt.Color(255, 255, 255));
        iP3_1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã hóa đơn cần đổi trả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N

        JLIDInvoice.setText("Mã hóa đơn: ");

        JTFIDInvoice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTFIDInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIDInvoiceActionPerformed(evt);
            }
        });

        btnSearchIDInvoice.setBackground(new java.awt.Color(135, 206, 235));
        btnSearchIDInvoice.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchIDInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search24.png"))); // NOI18N
        btnSearchIDInvoice.setText("Tìm  ");
        btnSearchIDInvoice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearchIDInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIDInvoiceActionPerformed(evt);
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
                        .addComponent(JTFIDInvoice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchIDInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(iP3_1Layout.createSequentialGroup()
                        .addComponent(JLIDInvoice)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        iP3_1Layout.setVerticalGroup(
            iP3_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iP3_1Layout.createSequentialGroup()
                .addComponent(JLIDInvoice)
                .addGap(0, 0, 0)
                .addGroup(iP3_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearchIDInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTFIDInvoice))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jP3Layout = new javax.swing.GroupLayout(jP3);
        jP3.setLayout(jP3Layout);
        jP3Layout.setHorizontalGroup(
            jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iP3_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jP3_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jP_3_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(iP3_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jP3Layout.setVerticalGroup(
            jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP3Layout.createSequentialGroup()
                .addComponent(iP3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_3_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(iP3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTFIDInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIDInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIDInvoiceActionPerformed

    private void jtfAmountNeededActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAmountNeededActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAmountNeededActionPerformed

    private void jtfDateCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDateCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDateCreateActionPerformed

    private void cbPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaymentsActionPerformed

    }//GEN-LAST:event_cbPaymentsActionPerformed

    private void btnSearchIDInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIDInvoiceActionPerformed
//        if (jtfNameCus.getText().equals("")) {
//            String phone = jtfPhoneCus.getText().trim();
//            if (phone.length() <= 0) {
//                showERROR(jtfPhoneCus, "Vui lòng nhập số điện thoại của khách hàng !");
//                return;
//            }
//            if (checkRegex(phone, "^0\\d{9}$") == false) {
//                showERROR(jtfPhoneCus, "Số điện thoại không đúng định dạng 0xx.xxxx.xxx vui lòng kiểm tra lại");
//                return;
//            }
//            Customer customer = customer_DAO.getCustomerByPhone(phone);
//            if (customer != null) {
//                jtfEmail.setText(customer.getEmail());
//                jtfNameCus.setText(customer.getName());
//                btnPay.setEnabled(true);
//                jTFPoints.setText(customer.getRewardPoints() + "");
//                cbPonis.setEnabled(true);
//                Flag.setIdCusForSell_GUI(customer.getIdCustomer().trim());
//                jtfPhoneCus.setEditable(false);
//
//                cbPayments.setEnabled(true);
//                cbPonis.setEnabled(true);
//                cbPromotion.setEnabled(true);
//                btnPendingInvoice.setEnabled(true);
//                jtfMoneyReceived.setEditable(true);
//            } else {
//                if (JOptionPane.showConfirmDialog(null, "Khách hàng chưa tồn tại trên hệ thống, vui lòng thêm mới khách hàng !", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//                    Flag.setFlagSell_GUI(1);
//                    stopWebcam();
//                    toCustomerGUI();
//                }
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Đã có thông tin khách hàng cho hóa đơn !");
//        }
    }//GEN-LAST:event_btnSearchIDInvoiceActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        String idInvoice = JTFIDInvoice.getText().trim();
        String moneyBeforeSTR = jtfTotalBefore.getText().trim().replaceAll("\\.0", "");
        String moneyAfterSTR = jtfTotalAfter.getText().trim().replaceAll("\\.0", "");
        double moneyBefore = Double.parseDouble(moneyBeforeSTR);
        double moneyAfter = Double.parseDouble(moneyAfterSTR);
        double totalAmount = 0;

        String title_1 = "Số tiền phải trả lại khách hàng là: ";
        String title_2 = "Số tiền khách hàng phải trả thêm là: ";
        if (cbPayments.getSelectedIndex() == 0) {

            if (moneyBefore - moneyAfter > 0) {
                jtfMoneyReceived.setEditable(false);
                cbPayments.setEnabled(true);

                totalAmount = moneyBefore - moneyAfter;
                JOptionPane.showMessageDialog(null, title_1 + utils.Utils.formatMoney(totalAmount));
                boolean res = invoice_DAO.updateInvoiceMoney(idInvoice, moneyBefore, moneyBefore - moneyAfter, moneyAfter);
                if (res) {
                    // trừ số lượng sản phẩm 
                    // cộng số lượng sản phẩm
                    // cập nhập chi tiết hóa đơn
                    clearInput();
                    btnPay.setEnabled(false);
                    btnCancel.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Đổi trả hàng thành công !");
                }
            } else if (cbPayments.getSelectedIndex() == 1) {

            }

        }
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearInput();
        btnCancel.setEnabled(false);
        defaultTableModelCart.setRowCount(0);
        btnPay.setEnabled(false);
        cbPayments.setEnabled(false);
        jtfMoneyReceived.setEditable(false);
//        if (btnPendingInvoice.getText().equals("Đơn chờ") && defaultTableModelCart.getRowCount() > 0) {
//            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đặt trạng thái chờ cho đơn hàng không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//                boolean res = createInvoice("Đơn chờ");
//                if (res) {
//                    JOptionPane.showMessageDialog(null, "Tạo đơn chờ thành công");
//                    loadDataPendingInvoice();
//                    clearInfoInvoice();
//                }
//            }
//        } else if (btnPendingInvoice.getText().equals("Hủy")) {
//            defaultTableModelCart.setRowCount(0);
//            btnPendingInvoice.setEnabled(false);
//            btnPay.setEnabled(false);
//            jtfMoneyReceived.setEditable(false);
//
//            clearAllInPut();
//            jtfMoneyReceived.setEditable(false);
//            cbPonis.setEditable(false);
//
//            jLIDInvoiceMain.setText("");
//            jLIDStaffMain.setText("");
//            jLNameStaffMain.setText("");
//
//            cbPayments.setEnabled(false);
//            cbPonis.setEnabled(false);
//            cbPromotion.setEnabled(false);
//            jtfTotalAmount.setText(""); // khác
//            btnCreateInvoice.setEnabled(true);
//            btnPendingInvoice.setText("Đơn chờ");
//
//        } else if (defaultTableModelCart.getRowCount() == 0) {
//            JOptionPane.showMessageDialog(null, "Giỏ hàng đang trống không thể tạo đơn chờ !");
//        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCreateInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateInvoiceActionPerformed
//        if (btnCreateInvoice.getText().equals("Tạo hóa đơn")) {
//            defaultTableModelCart.setRowCount(0);
//            JTFIDInvoice.setEditable(true);
//            btnSearchIDInvoice.setEnabled(true);
//            btnCreateInvoice.setText("Hủy");
//            jtfMoneyReceived.setEditable(false);
//
//            jLIDInvoiceMain.setText(invoice_DAO.createIDInvoice());
//            jLIDStaffMain.setText(Flag.getIdStaff());
//            jLNameStaffMain.setText(staff_DAO.getStaffByID(Flag.getIdStaff()).getName());
//
//            Flag.setIdInvoiceForPrintf(jLIDInvoiceMain.getText()); // lưu id hóa đơn để in hóa đơn
//
//        } else if (btnCreateInvoice.getText().equals("Hủy") && !JTFIDInvoice.getText().trim().equals("")) {
//            if (defaultTableModelCart.getRowCount() != 0) {
//                int option = JOptionPane.showConfirmDialog(null, "Giỏ hàng đang bận bạn có chắc muốn hủy toàn bộ không !", "Xác nhận", JOptionPane.YES_NO_OPTION);
//                if (option == JOptionPane.YES_OPTION) {
//                    clearInfoInvoice();
//                }
//            } else {
//                JTFIDInvoice.setEditable(false);
//                btnSearchIDInvoice.setEnabled(false);
//                btnPendingInvoice.setEnabled(false);
//                btnCreateInvoice.setText("Tạo hóa đơn");
//                btnPay.setEnabled(false);
//                jtfMoneyReceived.setEditable(false);
//
//                clearAllInPut();
//                jtfMoneyReceived.setEditable(false);
//                cbPonis.setEditable(false);
//
//                jLIDInvoiceMain.setText("");
//                jLIDStaffMain.setText("");
//                jLNameStaffMain.setText("");
//
//                cbPayments.setEnabled(false);
//                cbPonis.setEnabled(false);
//                cbPromotion.setEnabled(false);
//            }
//        } else if (btnCreateInvoice.getText().equals("Hủy")) {
//            if (defaultTableModelCart.getRowCount() != 0) {
//                int option = JOptionPane.showConfirmDialog(null, "Giỏ hàng đang bận bạn có chắc muốn hủy toàn bộ không !", "Xác nhận", JOptionPane.YES_NO_OPTION);
//                if (option == JOptionPane.YES_OPTION) {
//                    clearInfoInvoice();
//                }
//            } else {
//                JTFIDInvoice.setEditable(false);
//                btnSearchIDInvoice.setEnabled(false);
//                btnPendingInvoice.setEnabled(false);
//                btnCreateInvoice.setText("Tạo hóa đơn");
//                btnPay.setEnabled(false);
//                jtfMoneyReceived.setEditable(false);
//
//                clearAllInPut();
//                jtfMoneyReceived.setEditable(false);
//                cbPonis.setEditable(false);
//
//                jLIDInvoiceMain.setText("");
//                jLIDStaffMain.setText("");
//                jLNameStaffMain.setText("");
//
//                cbPayments.setEnabled(false);
//                cbPonis.setEnabled(false);
//                cbPromotion.setEnabled(false);
//                jtfTotalAmount.setText(""); // khác
//            }
//        }
    }//GEN-LAST:event_btnCreateInvoiceActionPerformed

    private void jTableCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCartMouseClicked

    }//GEN-LAST:event_jTableCartMouseClicked

    private void jTableCartPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTableCartPropertyChange
        if ("tableCellEditor".equals(evt.getPropertyName())) {
            int selectedRow = jTableCart.getSelectedRow();
            int selectedColumn = jTableCart.getSelectedColumn();
            // kiểm tra sự kiện sửa ở cột số lượng
            if (selectedColumn == 3) {
                String quantitySTR = jTableCart.getValueAt(selectedRow, 3).toString().trim().replaceAll("\\.0", "").replaceAll("đ", "");
                String priceSTR = jTableCart.getValueAt(selectedRow, 5).toString().trim().replaceAll("\\.0", "").replaceAll("đ", "");
                int quantity = Integer.parseInt(quantitySTR);
                double unitPrice = Double.parseDouble(priceSTR);
                double totalPrice = quantity * unitPrice;

                // Cập nhật giá trị thành tiền trong JTable
                jTableCart.setValueAt(totalPrice + "đ", selectedRow, 6);

                // Kiểm tra nếu số lượng <= 0, xóa hàng khỏi bảng
                if (quantity <= 0) {
                    DefaultTableModel model = (DefaultTableModel) jTableCart.getModel();
                    model.removeRow(selectedRow);
                }
            }
            // cập nhập số tiền KH phải trả thêm hoặc số tiền phải trả lại KH khi table có sự thay đổi
            double moneyBefore = Double.parseDouble(jtfTotalBefore.getText());
            double moneyAfter = Double.parseDouble(jtfTotalAfter.getText());
            calculateTotalBeforeAfter(moneyBefore, moneyAfter);
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

    private void jtfTotalBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTotalBeforeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTotalBeforeActionPerformed

    private void jtfAmountNeededPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtfAmountNeededPropertyChange

    }//GEN-LAST:event_jtfAmountNeededPropertyChange

    private void btnPayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnPayAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPayAncestorAdded

    private void jTableListInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListInvoiceMouseClicked
//        if (evt.getClickCount() == 2 && btnCreateInvoice.getText().equals("Tạo hóa đơn")) {
//            btnPendingInvoice.setEnabled(true);
//            int selectedRow = jTablePendingInvoice.getSelectedRow();
//            String idInvoice = (String) defaultTableModelPendingInvoice.getValueAt(selectedRow, 1);
//            loadListProductPendingInvoice(idInvoice);
//
//            // 1) Tính giá trị VAT
//            String totalSTR = jtfTotalAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", "");
//            double total = Double.parseDouble(totalSTR);
//            double vatValue = total * (vat_dao.getVAT() / 100);
//            double totalNew = vatValue + total;
//            jtfTotalAmount.setText(totalNew + " VNĐ");
//
//            Invoice invoiceTMP = invoice_DAO.getInvoiceById(idInvoice);
//            Flag.setIdCusForSell_GUI(invoiceTMP.getCustomer().getIdCustomer()); // set id vào cờ để check được điểm tích lũy
//        }
        if (evt.getClickCount() == 2) {
            int selectedRow = jTableListInvoice.getSelectedRow();
            String idInvoice = (String) defaultTableModelListInvoice.getValueAt(selectedRow, 1);
            Invoice invoiceTMP = invoice_DAO.getInvoiceById(idInvoice);
            loadDataToPanel(invoiceTMP);
            loadListProductOfInvoice(idInvoice);

            JTFIDInvoice.setEditable(false);
            btnSearchIDInvoice.setEnabled(false);
            btnCancel.setEnabled(true);
            btnPay.setEnabled(true);
            cbPayments.setEnabled(true);
            jtfMoneyReceived.setEditable(true);
        }
    }//GEN-LAST:event_jTableListInvoiceMouseClicked

    private void jtfTotalAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTotalAfterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTotalAfterActionPerformed

    private void jtfMoneyReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMoneyReceivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMoneyReceivedActionPerformed

    private void jtfMoneyReceivedPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtfMoneyReceivedPropertyChange

    }//GEN-LAST:event_jtfMoneyReceivedPropertyChange

    private void jTableListInvoiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListInvoiceMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableListInvoiceMouseEntered

////   Cập nhập giá tiền phải trả lại khách
//
//    private void updateChangeAmount() {
//        if (validator()) {
//            double totalAmount = Double.parseDouble(jtfTotalAmount.getText().trim().replaceAll("\\ VNĐ", ""));
//            double moneyReceived = Double.parseDouble((jtfMoneyReceived.getText().trim()));
//            double changeAmount = moneyReceived - totalAmount;
//            jtfChangeAmount.setText(changeAmount + " VNĐ");
//        }
//    }
//
//    private boolean checkRegex(String input, String regex) {
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//        if (matcher.matches()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
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
                String idInvoice = JTFIDInvoice.getText().trim();
                if (!JTFIDInvoice.getText().trim().equals("") && invoice_DAO.getInvoiceById(idInvoice) != null) {
                    addToCart(qrIDProduct);
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng thêm hóa đơn cần đổi trả trước trước khi thực hiện thao tác !");
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

//
////    Tạo hóa đơn
//    public boolean createInvoice(String status) {
//        String idInvoice = jLIDInvoiceMain.getText().trim();
//        Staff staff = staff_DAO.getStaffByID(jLIDStaffMain.getText().trim());
//        Customer customer = customer_DAO.getCustomerByID(Flag.getIdCusForSell_GUI());
//        Promotion promotion = null;
//        String idpromotion = null;
//
//        String amountReceivedSTR = (jtfMoneyReceived.getText().trim() != null && !jtfMoneyReceived.getText().trim().equals("")) ? jtfMoneyReceived.getText().trim() : jtfTotalAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", "");
//        double amountReceived = Double.parseDouble(amountReceivedSTR);
//        String changeAmountSTR = (jtfChangeAmount.getText().trim() != null && !jtfChangeAmount.getText().trim().equals("")) ? jtfChangeAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", "") : "0";
//        double changeAmount = Double.parseDouble(changeAmountSTR);
//        double totalAmount = Double.parseDouble(jtfTotalAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", ""));
//        LocalDateTime dateCreated = LocalDateTime.now();
//
//        Invoice invoice = new Invoice(idInvoice, staff, customer, promotion, amountReceived, changeAmount, totalAmount, dateCreated, Invoice.convertStringToStatus(status));
//
//        boolean res = invoice_DAO.createInvoice(invoice);
//
//        if (res) {
//            if (status.equals("Đã thanh toán")) {
//                //Cập nhập lại số lượng mã khuyến mãi
//                minusQuantityPromotion(promotion);
//                //Cập nhập điểm tích lũy
//                minusPointsCustomer(customer);
//                //Cộng điểm tích lũy dựa trên tổng tiền hóa đơn
//                sumPointsCustomer(customer);
//            }// chỉ khi thanh toán thành công mới thực hiện những việc này
//
//            //Thêm chi tiết hóa đơn vào hóa đơn
//            processJTableCart(invoice_DAO.getInvoiceById(idInvoice));
//            return true;
//        }
//
//        return false;
//    }
//
//
////    Duyệt giỏ hàng để thêm sản phẩm
//    private void processJTableCart(Invoice invoice) {
//        DefaultTableModel model = (DefaultTableModel) jTableCart.getModel();
//        int rowCount = model.getRowCount();
//        for (int i = 0; i < rowCount; i++) {
//            String productId = (String) model.getValueAt(i, 1);
//            int quantity = Integer.parseInt(defaultTableModelCart.getValueAt(i, 3).toString().trim());
//
////            Xử lý chuỗi nếu có html
//            double unitPrice;
//            String htmlString = defaultTableModelCart.getValueAt(i, 5).toString().trim();
//            if (BasicHTML.isHTMLString(htmlString)) {
//                org.jsoup.nodes.Document document = Jsoup.parse(htmlString);
//                String textContent = document.text().replaceAll("\\.0", "").replaceAll("\\đ", "");
//                unitPrice = Double.parseDouble(textContent);
//            } else {
//                unitPrice = Double.parseDouble(defaultTableModelCart.getValueAt(i, 5).toString().replaceAll("\\.0", "").replaceAll("\\đ", ""));
//            }
//
//            Product product = product_DAO.getProductByID(productId);
//            createInvoiceDetails(invoice, product, quantity, unitPrice);
//
//        }
//    }
//
////    Update danh sách sản phẩm đơn chờ 
//    private void UpdateListProductPendingInvoice(Invoice invoice) {
//        // xóa danh sách chi tiết sản phẩm cũ
//        invoiceDetails_DAO.deleteInvoiceDetailsByInvoiceId(invoice.getIdInvoice());
//        DefaultTableModel model = (DefaultTableModel) jTableCart.getModel();
//        int rowCount = model.getRowCount();
//        for (int i = 0; i < rowCount; i++) {
//            String productId = (String) model.getValueAt(i, 1);
//            int quantity = Integer.parseInt(defaultTableModelCart.getValueAt(i, 3).toString().trim());
//
////            Xử lý chuỗi nếu có html
//            double unitPrice;
//            String htmlString = defaultTableModelCart.getValueAt(i, 5).toString().trim();
//            if (BasicHTML.isHTMLString(htmlString)) {
//                org.jsoup.nodes.Document document = Jsoup.parse(htmlString);
//                String textContent = document.text().replaceAll("\\.0", "").replaceAll("\\đ", "");
//                unitPrice = Double.parseDouble(textContent);
//            } else {
//                unitPrice = Double.parseDouble(defaultTableModelCart.getValueAt(i, 5).toString().replaceAll("\\.0", "").replaceAll("\\đ", ""));
//            }
//
//            Product product = product_DAO.getProductByID(productId);
//            createInvoiceDetails(invoice, product, quantity, unitPrice);
//        }
//    }
//
////  Tạo chi tiết hóa đơn
//    private void createInvoiceDetails(Invoice invoice, Product product, int quantity, double unitPrice) {
//        try {
//            // Tạo chi tiết hóa đơn
//            InvoiceDetails invoiceDetails = new InvoiceDetails();
//            invoiceDetails.setIdInvoiceDetails(invoiceDetails_DAO.createIDInvoiceDetails());
//            invoiceDetails.setInvoice(invoice);
//            invoiceDetails.setProduct(product);
//            invoiceDetails.setQuantity(quantity);
//            invoiceDetails.setUnitPrice(unitPrice);
//            invoiceDetails.setReturnQuantity(0); // Số lượng trả
//            invoiceDetails.setReturnReason(""); // Lý do trả
//
//            invoiceDetails_DAO.createInvoiceDetails(invoiceDetails);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
////    cập nhập số lượng sản phẩm
//    private boolean updateQuantityProduct() {
//        DefaultTableModel model = (DefaultTableModel) jTableCart.getModel();
//        int rowCount = model.getRowCount();
//        for (int i = 0; i < rowCount; i++) {
//            String id = (String) defaultTableModelCart.getValueAt(i, 1);
//            int quantity = (int) defaultTableModelCart.getValueAt(i, 3);
//
//            Product product = product_DAO.getProductByID(id);
//
//            if (product.getQuantity() >= quantity) {
//
//                int updatedQuantity = product.getQuantity() - quantity;
//                product.setQuantity(updatedQuantity);
//
//                product_DAO.updateInfoProduct(product);
//
//                return true;
//            }
//        }
//
//        return false;
//    }
//
////    Update totalAmount, changeAmount, moneyreceived pending invoice
//    public boolean updateMoneyPendingInvoice() {
//        String idInvoice = jLIDInvoiceMain.getText().trim();
//        Staff staff = staff_DAO.getStaffByID(jLIDStaffMain.getText().trim());
//        Customer customer = customer_DAO.getCustomerByID(Flag.getIdCusForSell_GUI());
//        Promotion promotion = null;
//        String idpromotion = null;
//
//        String amountReceivedSTR = (jtfMoneyReceived.getText().trim() != null && !jtfMoneyReceived.getText().trim().equals("")) ? jtfMoneyReceived.getText().trim() : jtfTotalAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", "");
//        double amountReceived = Double.parseDouble(amountReceivedSTR);
//        String changeAmountSTR = (jtfChangeAmount.getText().trim() != null && !jtfChangeAmount.getText().trim().equals("")) ? jtfChangeAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", "") : "0";
//        double changeAmount = Double.parseDouble(changeAmountSTR);
//        double totalAmount = Double.parseDouble(jtfTotalAmount.getText().trim().replaceAll("\\.0", "").replaceAll("\\ VNĐ", ""));
//        LocalDateTime dateCreated = LocalDateTime.now();
//
//        Invoice invoice = new Invoice(idInvoice, staff, customer, promotion, amountReceived, changeAmount, totalAmount, dateCreated, Invoice.convertStringToStatus("Đã thanh toán"));
//
//        boolean res = invoice_DAO.updateInvoiceMoney(idInvoice, amountReceived, changeAmount, totalAmount);
//
//        if (res) {
//            return true;
//        }
//        return false;
//    }
//
//    //    In hóa đơn
//    public static void printInvoice(Invoice invoice, double totalAmount, double amountReceived, double changeAmount) {
//        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//            // In hóa đơn
//            Invoice_GUI invoice_GUI = new Invoice_GUI();
//            invoice_GUI.setJlIDInvoiceDetails(invoice.getIdInvoice());
//            invoice_GUI.setJlNameCusDetails(invoice.getCustomer().getName());
//            invoice_GUI.setJlDateInvoiceDetails(invoice.getDateCreated().toLocalDate().toString());
//            invoice_GUI.setJlNameStaffDetails(invoice.getStaff().getName());
//            invoice_GUI.setJlTotalDetails(totalAmount + "");
//            invoice_GUI.setJlMoneyReceived(amountReceived + "");
//            invoice_GUI.setJlExcessCash(changeAmount + "");
//
//            // In hóa đơn
//            // print the panel to pdf
//            Document document = new Document(); // itextPDF
//            try {
//                // Đường dẫn tới tệp PDF để lưu hóa đơn
//                String pdfFilePath = "bill.pdf";
//                // Tạo một đối tượng PdfWriter để viết nội dung vào tệp PDF
//                PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath)); // java io, itextPDF
//                // Mở tài liệu để bắt đầu viết
//                document.open();
//                // Lấy kích thước của jpMain
//                int width = invoice_GUI.getJpMain().getWidth();
//                int height = invoice_GUI.getJpMain().getHeight();
//                // Tạo một BufferedImage để chứa hình ảnh của jpMain
//                BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//                Graphics2D g = image.createGraphics(); // java awt graphic2D
//
//                invoice_GUI.getJpMain().printAll(g);
//                g.dispose();
//                // Chuyển đổi BufferedImage thành hình ảnh dựng sẵn để chèn vào tài liệu PDF
//                com.itextpdf.text.Image pdfImage = com.itextpdf.text.Image.getInstance(image, null);
//                // Đặt kích thước của hình ảnh trong tài liệu PDF (có thể điều chỉnh kích thước tùy ý)
//                pdfImage.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight()); // itextPDF
//                // Chèn hình ảnh vào tài liệu PDF
//                document.add(pdfImage);
//                // Đóng tài liệu
//                document.close();
//                openPDF(pdfFilePath); // utils
//            } catch (DocumentException | IOException e) {
//                JOptionPane.showMessageDialog(null, "Lỗi khi in hóa đơn vui lòng tắt file hóa đơn cũ trước khi in");
//                return;
//            }
//        }
//    }
//
//    Load list invoice
    private void loadListInvoice() {
        defaultTableModelListInvoice.setRowCount(0);
        for (Invoice invoice : invoice_DAO.getListPendingInvoice("Đã thanh toán")) {
            int numberOrder = defaultTableModelListInvoice.getRowCount() + 1;
            String status = Invoice.convertStatusToString(invoice.getStatus());
            Object[] rowData = {numberOrder, invoice.getIdInvoice(), invoice.getCustomer().getName(), invoice.getStaff().getName(), invoice.getDateCreated().toLocalDate(), status};
            defaultTableModelListInvoice.addRow(rowData);
        }
    }

//    Load data to panel
    private void loadDataToPanel(Invoice invoice) {
        JTFIDInvoice.setText(invoice.getIdInvoice());
        jtfNameCus.setText(invoice.getCustomer().getName());
        jtfDateCreate.setText(invoice.getDateCreated().toLocalDate() + "");
        jtfTotalBefore.setText(invoice.getTotalAmount() + "");
        jtfTotalAfter.setText(invoice.getTotalAmount() + "");
    }

//    Clear panel right
    private void clearInput() {
        JTFIDInvoice.setEditable(true);
        btnSearchIDInvoice.setEnabled(true);

        JTFIDInvoice.setText("");
        jtfNameCus.setText("");
        jtfDateCreate.setText("");
        jtfTotalBefore.setText("");
        jtfTotalAfter.setText("");
        jtfAmountNeeded.setText("");
        jtfGiveBack.setText("");
        cbPayments.setSelectedIndex(0);
        jtfMoneyReceived.setText("");
        jtfChangeAmount.setText("");
    }

    //    Load list product of invoice
    public void loadListProductOfInvoice(String idInvoice) {
        defaultTableModelCart.setRowCount(0);
        int selectedRow = defaultTableModelCart.getRowCount();
        for (InvoiceDetails invoiceDetails : invoiceDetails_DAO.getListInvoiceDetailsById(idInvoice)) {
            Object[] rowData = {defaultTableModelCart.getRowCount() + 1, invoiceDetails.getProduct().getIdProduct(), invoiceDetails.getProduct().getName(), invoiceDetails.getQuantity(), invoiceDetails.getProduct().getOriginalPrice() + "đ", invoiceDetails.getUnitPrice() + "đ", invoiceDetails.getQuantity() * invoiceDetails.getUnitPrice() + "đ"};
            defaultTableModelCart.addRow(rowData);
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
                        Object[] rowData = {defaultTableModelCart.getRowCount() + 1, product.getIdProduct(), product.getName(), currentQuantity + 1, product.getOriginalPrice() + "đ", currentPrice, total + "đ"};
                        defaultTableModelCart.addRow(rowData);
                        JOptionPane.showMessageDialog(null, "Đã thêm sản phẩm");
                    }
                }
            }

            // Kiểm tra sản phẩm đã có trong giỏ hàng chưa
            if (!productExists) {
                double currentPrice = (product.getCurrentPrice() == null || product.getCurrentPrice() == 0) ? product.getOriginalPrice() : product.getCurrentPrice();
                Object[] rowData = {defaultTableModelCart.getRowCount() + 1, product.getIdProduct(), product.getName(), currentQuantity, product.getOriginalPrice() + "đ", currentPrice + "đ", currentPrice + "đ"};
                defaultTableModelCart.addRow(rowData);
                JOptionPane.showMessageDialog(null, "Đã thêm sản phẩm");
            }
        }
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

    // Hàm tính tổng tiền trước và sau của hóa đơn
    private void calculateTotalBeforeAfter(double moneyBefore, double moneyAfter) {
        double totalAmount = 0;

        if (moneyBefore - moneyAfter > 0) {
            totalAmount = moneyBefore - moneyAfter;
            jtfGiveBack.setText(Double.toString(totalAmount));
            jtfAmountNeeded.setText("0");
        } else if (moneyBefore - moneyAfter <= 0) {
            totalAmount = moneyAfter - moneyBefore;
            jtfAmountNeeded.setText(Double.toString(totalAmount));
            jtfGiveBack.setText("0");
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

//    Show ERROR
    private boolean showERROR(JTextField jtf, String mess) {
        jtf.selectAll();
        jtf.requestFocus();
        JOptionPane.showMessageDialog(null, mess);
        return false;
    }

//    Validator
//    private boolean validator() {
//        if (cbPayments.getSelectedIndex() == 0) {
//            if (jtfMoneyReceived.getText().trim().equals("")) {
//                return showERROR(jtfMoneyReceived, "Vui lòng nhập số tiền nhận trước khi thanh toán !");
//            }
//            if (!isNumber(jtfMoneyReceived.getText().trim())) {
//                return showERROR(jtfMoneyReceived, "Số tiền nhận vào không chính xác, vui lòng kiểm tra lại");
//            }
//            if (Double.parseDouble(jtfMoneyReceived.getText().trim()) < 0) {
//                return showERROR(jtfMoneyReceived, "Số tiền nhận phải lớn hơn 0 !");
//            }
//            double total = Double.parseDouble(jtfTotalAmount.getText().trim().replaceAll("\\.0", ""));
//            if (Double.parseDouble(jtfMoneyReceived.getText().trim()) < total) {
//                return showERROR(jtfMoneyReceived, "Số tiền nhận không đủ đề thanh toán vui lòng kiểm tra lại !");
//            }
//        }
//        return true;
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLIDInvoice;
    private javax.swing.JTextField JTFIDInvoice;
    private lib2.Button btnCancel;
    private lib2.Button btnCreateInvoice;
    private lib2.Button btnPay;
    private lib2.Button btnSearchIDInvoice;
    private lib2.ComboBoxSuggestion cbPayments;
    private javax.swing.JPanel iP3_1;
    private javax.swing.JPanel iP3_4;
    private javax.swing.JLabel jLChangeAmount;
    private javax.swing.JLabel jLTitleVAT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jP2;
    private javax.swing.JPanel jP3;
    private javax.swing.JPanel jP3_2;
    private javax.swing.JPanel jPListInvoice;
    private javax.swing.JPanel jPQR;
    private javax.swing.JPanel jP_3_3;
    private javax.swing.JScrollPane jSPCart;
    private javax.swing.JScrollPane jSPListInvoice;
    private javax.swing.JTable jTableCart;
    private javax.swing.JTable jTableListInvoice;
    private javax.swing.JLabel jlAmountNeeded;
    private javax.swing.JLabel jlDateCreate;
    private javax.swing.JLabel jlGiveBack;
    private javax.swing.JLabel jlMoneyReceived;
    private javax.swing.JLabel jlNameCus;
    private javax.swing.JLabel jlPayments;
    private javax.swing.JLabel jlTotalAfter;
    private javax.swing.JLabel jlTotalBefore;
    private javax.swing.JLabel jlWarning1;
    private javax.swing.JLabel jlWarning2;
    private javax.swing.JPanel jpWebcam;
    private javax.swing.JTextField jtfAmountNeeded;
    private javax.swing.JTextField jtfChangeAmount;
    private javax.swing.JTextField jtfDateCreate;
    private javax.swing.JTextField jtfGiveBack;
    private javax.swing.JTextField jtfMoneyReceived;
    private javax.swing.JTextField jtfNameCus;
    private javax.swing.JTextField jtfTotalAfter;
    private javax.swing.JTextField jtfTotalBefore;
    // End of variables declaration//GEN-END:variables
}
