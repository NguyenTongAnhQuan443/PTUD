
package gui;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.util.concurrent.ThreadFactory;
import javax.swing.JOptionPane;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import lib2.TableCustom;

public class TransferProduct_GUI extends javax.swing.JFrame implements Runnable, ThreadFactory {
    
    private WebcamPanel webcamPanel = null;
    private Webcam webcam = null;
//    private Executor executor = Executors.newSingleThreadExecutor(this);
//    Dùng ExecutorService thay vì Executor để gọi được medthod shutdown camera
    private ExecutorService executor = Executors.newSingleThreadExecutor(this);
    public TransferProduct_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        TableCustom.apply(jspInvoice, TableCustom.TableType.DEFAULT);
        TableCustom.apply(jspCart, TableCustom.TableType.DEFAULT);
        TableCustom.apply(jspListProduct, TableCustom.TableType.DEFAULT);
        
        ExecutorService executor = Executors.newSingleThreadExecutor(this);
        initWebcam();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jpRight = new javax.swing.JPanel();
        jlIDInvoice = new javax.swing.JLabel();
        jlNameCus = new javax.swing.JLabel();
        jlDateCreate = new javax.swing.JLabel();
        jlMoneyBefore = new javax.swing.JLabel();
        jlMoneyAfter = new javax.swing.JLabel();
        jlCusMustPay = new javax.swing.JLabel();
        jlStoreMustPay = new javax.swing.JLabel();
        jlWarning2 = new javax.swing.JLabel();
        jlWarning1 = new javax.swing.JLabel();
        jlMoneyReceive = new javax.swing.JLabel();
        jlChange = new javax.swing.JLabel();
        jtfIDinvoice = new javax.swing.JTextField();
        jtfNameCus = new javax.swing.JTextField();
        jtfDateCreate = new javax.swing.JTextField();
        jtfMoneyBefore = new javax.swing.JTextField();
        jtfMoneyAfter = new javax.swing.JTextField();
        jtfCusMustPay = new javax.swing.JTextField();
        jtfStoreMustPay = new javax.swing.JTextField();
        jtfMoneyReceiver = new javax.swing.JTextField();
        jtfChange = new javax.swing.JTextField();
        btnConfirm = new lib2.Button();
        btnBack = new lib2.Button();
        jlLeft3 = new javax.swing.JPanel();
        lbSearch = new javax.swing.JLabel();
        jtfSearch = new javax.swing.JTextField();
        btnAdd = new lib2.Button();
        lbFilterCategory = new javax.swing.JLabel();
        jpTableProduct = new javax.swing.JPanel();
        jspListProduct = new javax.swing.JScrollPane();
        jTableListProduct = new javax.swing.JTable();
        cbFillterCategory = new lib2.ComboBoxSuggestion();
        jpLeft1 = new javax.swing.JPanel();
        jpInvoice = new javax.swing.JPanel();
        jspInvoice = new javax.swing.JScrollPane();
        jTableinvoice = new javax.swing.JTable();
        jlIDInvoiceFillter = new javax.swing.JLabel();
        jtfIDInvoiceFillter = new javax.swing.JTextField();
        btnDFillterID = new lib2.Button();
        btnChangeProduct = new lib2.Button();
        jpQR = new javax.swing.JPanel();
        jpWebcam = new javax.swing.JPanel();
        jlLeft2 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jpCart = new javax.swing.JPanel();
        jspCart = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Giao diện đổi hàng");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jpMain.setBackground(new java.awt.Color(255, 255, 255));

        jpRight.setBackground(new java.awt.Color(255, 255, 255));
        jpRight.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jlIDInvoice.setText("Mã hóa đơn :");

        jlNameCus.setText("Tên KH :");

        jlDateCreate.setText("Ngày tạo :");

        jlMoneyBefore.setText("Tổng tiền trước :");

        jlMoneyAfter.setText("Tổng tiền sau :");

        jlCusMustPay.setText("Khách phải trả thêm :");

        jlStoreMustPay.setText("Số tiền phải trả KH :");

        jlWarning2.setForeground(new java.awt.Color(255, 0, 0));
        jlWarning2.setText("(Số tiền hàng lớn hơn số tiền ban đầu)");

        jlWarning1.setForeground(new java.awt.Color(255, 0, 0));
        jlWarning1.setText("(Số tiền hàng bé hơn số tiền ban đầu)");

        jlMoneyReceive.setText("Số tiền nhận :");

        jlChange.setText("Số tiền dư :");

        jtfIDinvoice.setEditable(false);

        jtfNameCus.setEditable(false);

        jtfDateCreate.setEditable(false);

        jtfMoneyBefore.setEditable(false);

        jtfMoneyAfter.setEditable(false);

        jtfCusMustPay.setEditable(false);

        jtfStoreMustPay.setEditable(false);

        jtfChange.setEditable(false);

        btnConfirm.setBackground(new java.awt.Color(135, 206, 235));
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/done24.png"))); // NOI18N
        btnConfirm.setText("Xác nhận");
        btnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnBack.setBackground(new java.awt.Color(135, 206, 235));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/back24.png"))); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpRightLayout = new javax.swing.GroupLayout(jpRight);
        jpRight.setLayout(jpRightLayout);
        jpRightLayout.setHorizontalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlIDInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlNameCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlDateCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfIDinvoice)
                            .addComponent(jtfNameCus)
                            .addComponent(jtfDateCreate)))
                    .addComponent(jlWarning2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlWarning1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlStoreMustPay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlCusMustPay, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCusMustPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfStoreMustPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlMoneyReceive))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMoneyReceiver)
                            .addComponent(jtfChange)))
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlMoneyAfter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlMoneyBefore, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfMoneyBefore)
                            .addComponent(jtfMoneyAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpRightLayout.setVerticalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDInvoice)
                    .addComponent(jtfIDinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNameCus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDateCreate)
                    .addComponent(jtfDateCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMoneyBefore)
                    .addComponent(jtfMoneyBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMoneyAfter)
                    .addComponent(jtfMoneyAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCusMustPay)
                    .addComponent(jtfCusMustPay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlWarning1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlStoreMustPay)
                    .addComponent(jtfStoreMustPay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlWarning2)
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMoneyReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMoneyReceive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlChange)
                    .addComponent(jtfChange, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jlLeft3.setBackground(new java.awt.Color(255, 255, 255));
        jlLeft3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lbSearch.setText("Tìm Sản phẩm :");

        jtfSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(135, 206, 235));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/addToCart16.png"))); // NOI18N
        btnAdd.setText("Thêm vào giỏ");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lbFilterCategory.setText("Lọc theo danh mục :");

        jpTableProduct.setBackground(new java.awt.Color(255, 255, 255));

        jTableListProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Loại SP", "Kích thước", "Màu săc", "Chất liệu", "Đơn giá", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspListProduct.setViewportView(jTableListProduct);

        javax.swing.GroupLayout jpTableProductLayout = new javax.swing.GroupLayout(jpTableProduct);
        jpTableProduct.setLayout(jpTableProductLayout);
        jpTableProductLayout.setHorizontalGroup(
            jpTableProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListProduct)
        );
        jpTableProductLayout.setVerticalGroup(
            jpTableProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jlLeft3Layout = new javax.swing.GroupLayout(jlLeft3);
        jlLeft3.setLayout(jlLeft3Layout);
        jlLeft3Layout.setHorizontalGroup(
            jlLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlLeft3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFilterCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFillterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jpTableProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jlLeft3Layout.setVerticalGroup(
            jlLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlLeft3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfSearch)
                    .addComponent(lbSearch)
                    .addComponent(lbFilterCategory)
                    .addComponent(cbFillterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTableProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpLeft1.setBackground(new java.awt.Color(255, 255, 255));
        jpLeft1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jpInvoice.setBackground(new java.awt.Color(255, 255, 255));

        jTableinvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hóa đơn", "Tên NV", "Tên KH", "Ngày tạo", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspInvoice.setViewportView(jTableinvoice);

        jlIDInvoiceFillter.setText("Mã hóa đơn");

        btnDFillterID.setBackground(new java.awt.Color(135, 206, 235));
        btnDFillterID.setForeground(new java.awt.Color(255, 255, 255));
        btnDFillterID.setText("Tìm");
        btnDFillterID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnChangeProduct.setBackground(new java.awt.Color(135, 206, 235));
        btnChangeProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnChangeProduct.setText("Đổi hàng");
        btnChangeProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jpInvoiceLayout = new javax.swing.GroupLayout(jpInvoice);
        jpInvoice.setLayout(jpInvoiceLayout);
        jpInvoiceLayout.setHorizontalGroup(
            jpInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInvoiceLayout.createSequentialGroup()
                .addComponent(jspInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlIDInvoiceFillter)
                    .addComponent(jtfIDInvoiceFillter)
                    .addComponent(btnDFillterID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChangeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jpInvoiceLayout.setVerticalGroup(
            jpInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInvoiceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIDInvoiceFillter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfIDInvoiceFillter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDFillterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChangeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpQR.setBackground(new java.awt.Color(255, 255, 255));
        jpQR.setBorder(javax.swing.BorderFactory.createTitledBorder("QR Sản phẩm"));

        jpWebcam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jpQRLayout = new javax.swing.GroupLayout(jpQR);
        jpQR.setLayout(jpQRLayout);
        jpQRLayout.setHorizontalGroup(
            jpQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        jpQRLayout.setVerticalGroup(
            jpQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpWebcam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpLeft1Layout = new javax.swing.GroupLayout(jpLeft1);
        jpLeft1.setLayout(jpLeft1Layout);
        jpLeft1Layout.setHorizontalGroup(
            jpLeft1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeft1Layout.createSequentialGroup()
                .addComponent(jpInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpQR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpLeft1Layout.setVerticalGroup(
            jpLeft1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpQR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jlLeft2.setBackground(new java.awt.Color(255, 255, 255));
        jlLeft2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btnClear.setBackground(new java.awt.Color(135, 206, 235));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/Clear16.png"))); // NOI18N
        btnClear.setText("Làm mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(135, 206, 235));
        btnDel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/delete20.png"))); // NOI18N
        btnDel.setText(" Xóa SP  ");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        jpCart.setBackground(new java.awt.Color(255, 255, 255));

        jTableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Giá giảm", "Thành tiền", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspCart.setViewportView(jTableCart);

        javax.swing.GroupLayout jpCartLayout = new javax.swing.GroupLayout(jpCart);
        jpCart.setLayout(jpCartLayout);
        jpCartLayout.setHorizontalGroup(
            jpCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCartLayout.createSequentialGroup()
                .addComponent(jspCart)
                .addContainerGap())
        );
        jpCartLayout.setVerticalGroup(
            jpCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspCart, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jlLeft2Layout = new javax.swing.GroupLayout(jlLeft2);
        jlLeft2.setLayout(jlLeft2Layout);
        jlLeft2Layout.setHorizontalGroup(
            jlLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlLeft2Layout.createSequentialGroup()
                .addComponent(jpCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDel)
                    .addComponent(btnClear))
                .addContainerGap())
        );
        jlLeft2Layout.setVerticalGroup(
            jlLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlLeft2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnDel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap(42, Short.MAX_VALUE))
            .addComponent(jpCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpMainLayout = new javax.swing.GroupLayout(jpMain);
        jpMain.setLayout(jpMainLayout);
        jpMainLayout.setHorizontalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlLeft2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlLeft3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpLeft1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpMainLayout.setVerticalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpMainLayout.createSequentialGroup()
                        .addComponent(jpLeft1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlLeft2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlLeft3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        stopWebcam();
    }//GEN-LAST:event_btnBackActionPerformed

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
        jpWebcam.add(webcamPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 130));
        executor.execute(this);
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sell_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            Result result = null;
            BufferedImage image = null;

            if (webcam.isOpen()) {
                if ((image = webcam.getImage()) == null) {
                    continue;
                }
            }

            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException ex) {
                Logger.getLogger(Sell_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (result != null) {
                String qr = result.getText();
                JOptionPane.showMessageDialog(null, "Mã QR Code: " + qr);
            }

        } while (true);
    }

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnAdd;
    private lib2.Button btnBack;
    private lib2.Button btnChangeProduct;
    private javax.swing.JButton btnClear;
    private lib2.Button btnConfirm;
    private lib2.Button btnDFillterID;
    private javax.swing.JButton btnDel;
    private lib2.ComboBoxSuggestion cbFillterCategory;
    private javax.swing.JTable jTableCart;
    private javax.swing.JTable jTableListProduct;
    private javax.swing.JTable jTableinvoice;
    private javax.swing.JLabel jlChange;
    private javax.swing.JLabel jlCusMustPay;
    private javax.swing.JLabel jlDateCreate;
    private javax.swing.JLabel jlIDInvoice;
    private javax.swing.JLabel jlIDInvoiceFillter;
    private javax.swing.JPanel jlLeft2;
    private javax.swing.JPanel jlLeft3;
    private javax.swing.JLabel jlMoneyAfter;
    private javax.swing.JLabel jlMoneyBefore;
    private javax.swing.JLabel jlMoneyReceive;
    private javax.swing.JLabel jlNameCus;
    private javax.swing.JLabel jlStoreMustPay;
    private javax.swing.JLabel jlWarning1;
    private javax.swing.JLabel jlWarning2;
    private javax.swing.JPanel jpCart;
    private javax.swing.JPanel jpInvoice;
    private javax.swing.JPanel jpLeft1;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpQR;
    private javax.swing.JPanel jpRight;
    private javax.swing.JPanel jpTableProduct;
    private javax.swing.JPanel jpWebcam;
    private javax.swing.JScrollPane jspCart;
    private javax.swing.JScrollPane jspInvoice;
    private javax.swing.JScrollPane jspListProduct;
    private javax.swing.JTextField jtfChange;
    private javax.swing.JTextField jtfCusMustPay;
    private javax.swing.JTextField jtfDateCreate;
    private javax.swing.JTextField jtfIDInvoiceFillter;
    private javax.swing.JTextField jtfIDinvoice;
    private javax.swing.JTextField jtfMoneyAfter;
    private javax.swing.JTextField jtfMoneyBefore;
    private javax.swing.JTextField jtfMoneyReceiver;
    private javax.swing.JTextField jtfNameCus;
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JTextField jtfStoreMustPay;
    private javax.swing.JLabel lbFilterCategory;
    private javax.swing.JLabel lbSearch;
    // End of variables declaration//GEN-END:variables
}
