//1013, 579
package GUI;

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
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.ThreadFactory;
import javax.swing.JOptionPane;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Bill_GUI extends javax.swing.JPanel implements Runnable, ThreadFactory {

    private WebcamPanel webcamPanel = null;
    private Webcam webcam = null;
//    private Executor executor = Executors.newSingleThreadExecutor(this);
//    Dùng ExecutorService thay vì Executor để gọi được medthod shutdown camera
    private ExecutorService executor = Executors.newSingleThreadExecutor(this);
    
    public Bill_GUI() {
        initComponents();    
ExecutorService executor = Executors.newSingleThreadExecutor(this);

        initWebcam();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLeft = new javax.swing.JPanel();
        jpLeft1 = new javax.swing.JPanel();
        jpListBill = new javax.swing.JPanel();
        jspListBill = new javax.swing.JScrollPane();
        jTablejspListBill = new javax.swing.JTable();
        jpQR = new javax.swing.JPanel();
        jpWebcam = new javax.swing.JPanel();
        jpLeft2 = new javax.swing.JPanel();
        jpsCart = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();
        btnDel = new javax.swing.JButton();
        jpLeft3 = new javax.swing.JPanel();
        jspListProduct = new javax.swing.JScrollPane();
        jTableLítProduct = new javax.swing.JTable();
        jpRight = new javax.swing.JPanel();
        jpRight1 = new javax.swing.JPanel();
        jlNameCustomer = new javax.swing.JLabel();
        jlPhone = new javax.swing.JLabel();
        jtfNameCustomer = new javax.swing.JTextField();
        jtfPhone = new javax.swing.JTextField();
        jpRight2 = new javax.swing.JPanel();
        jlTotalAmount = new javax.swing.JLabel();
        jlVoucher = new javax.swing.JLabel();
        jlPay = new javax.swing.JLabel();
        jlMoneyReceived = new javax.swing.JLabel();
        jlMoneyLeftOver = new javax.swing.JLabel();
        jtfVoucher = new javax.swing.JTextField();
        jtfTotalAmount = new javax.swing.JTextField();
        jtfMoneyReceived = new javax.swing.JTextField();
        jtfMoneyLeftOver = new javax.swing.JTextField();
        cbPay = new javax.swing.JComboBox<>();
        jpRight3 = new javax.swing.JPanel();
        btnCreateBill = new Customs.Button();
        btnCancel = new Customs.Button();
        btnPay = new Customs.Button();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jpLeft.setBackground(new java.awt.Color(204, 204, 204));
        jpLeft.setLayout(new javax.swing.BoxLayout(jpLeft, javax.swing.BoxLayout.Y_AXIS));

        jpLeft1.setBackground(new java.awt.Color(255, 255, 255));
        jpLeft1.setLayout(new javax.swing.BoxLayout(jpLeft1, javax.swing.BoxLayout.LINE_AXIS));

        jpListBill.setBackground(new java.awt.Color(255, 255, 255));
        jpListBill.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTablejspListBill.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTablejspListBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hóa đơn", "Tên NV", "Tên KH", "Trạng thái", "Ngày tạo"
            }
        ));
        jspListBill.setViewportView(jTablejspListBill);

        jpQR.setBackground(new java.awt.Color(255, 255, 255));
        jpQR.setBorder(javax.swing.BorderFactory.createTitledBorder("QR Code"));

        jpWebcam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jpQRLayout = new javax.swing.GroupLayout(jpQR);
        jpQR.setLayout(jpQRLayout);
        jpQRLayout.setHorizontalGroup(
            jpQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jpQRLayout.setVerticalGroup(
            jpQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpListBillLayout = new javax.swing.GroupLayout(jpListBill);
        jpListBill.setLayout(jpListBillLayout);
        jpListBillLayout.setHorizontalGroup(
            jpListBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListBillLayout.createSequentialGroup()
                .addComponent(jspListBill, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpQR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpListBillLayout.setVerticalGroup(
            jpListBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListBill, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jpQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpLeft1.add(jpListBill);

        jpLeft.add(jpLeft1);

        jpLeft2.setBackground(new java.awt.Color(255, 255, 255));
        jpLeft2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTableCart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Giảm giá", "Thành tiền", "Trạng thái"
            }
        ));
        jpsCart.setViewportView(jTableCart);

        btnDel.setBackground(new java.awt.Color(135, 206, 235));
        btnDel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete20.png"))); // NOI18N
        btnDel.setText("Xóa");

        javax.swing.GroupLayout jpLeft2Layout = new javax.swing.GroupLayout(jpLeft2);
        jpLeft2.setLayout(jpLeft2Layout);
        jpLeft2Layout.setHorizontalGroup(
            jpLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpsCart, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
            .addGroup(jpLeft2Layout.createSequentialGroup()
                .addComponent(btnDel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpLeft2Layout.setVerticalGroup(
            jpLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLeft2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpsCart, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpLeft.add(jpLeft2);

        jpLeft3.setBackground(new java.awt.Color(255, 255, 255));
        jpLeft3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jpLeft3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTableLítProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableLítProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Loại", "Chất liệu", "Kích thước", "Màu sắc", "Số lượng", "Đơn giá"
            }
        ));
        jspListProduct.setViewportView(jTableLítProduct);

        javax.swing.GroupLayout jpLeft3Layout = new javax.swing.GroupLayout(jpLeft3);
        jpLeft3.setLayout(jpLeft3Layout);
        jpLeft3Layout.setHorizontalGroup(
            jpLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        jpLeft3Layout.setVerticalGroup(
            jpLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
        );

        jpLeft.add(jpLeft3);

        add(jpLeft);

        jpRight.setBackground(new java.awt.Color(255, 255, 255));
        jpRight.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tạo hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jpRight.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpRight.setLayout(new javax.swing.BoxLayout(jpRight, javax.swing.BoxLayout.Y_AXIS));

        jpRight1.setBackground(new java.awt.Color(255, 255, 255));
        jpRight1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlNameCustomer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNameCustomer.setText("Tên KH :");

        jlPhone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPhone.setText("SDT :");

        jtfNameCustomer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpRight1Layout = new javax.swing.GroupLayout(jpRight1);
        jpRight1.setLayout(jpRight1Layout);
        jpRight1Layout.setHorizontalGroup(
            jpRight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRight1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNameCustomer)
                    .addComponent(jlPhone))
                .addGap(18, 18, 18)
                .addGroup(jpRight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jtfNameCustomer))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jpRight1Layout.setVerticalGroup(
            jpRight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRight1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpRight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNameCustomer)
                    .addComponent(jtfNameCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpRight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPhone))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jpRight.add(jpRight1);

        jpRight2.setBackground(new java.awt.Color(255, 255, 255));
        jpRight2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTotalAmount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlTotalAmount.setText("Tổng tiền hàng :");

        jlVoucher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlVoucher.setText("Mã giảm giá (nếu có) :");

        jlPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPay.setText("HT Thanh toán :");

        jlMoneyReceived.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlMoneyReceived.setText("Tiền khách đưa :");

        jlMoneyLeftOver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlMoneyLeftOver.setText("Tiền thừa :");

        jtfVoucher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfVoucherActionPerformed(evt);
            }
        });

        jtfTotalAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfTotalAmount.setEnabled(false);
        jtfTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTotalAmountActionPerformed(evt);
            }
        });

        jtfMoneyReceived.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfMoneyReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMoneyReceivedActionPerformed(evt);
            }
        });

        jtfMoneyLeftOver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfMoneyLeftOver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMoneyLeftOverActionPerformed(evt);
            }
        });

        cbPay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbPay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Chuyển khoản" }));

        javax.swing.GroupLayout jpRight2Layout = new javax.swing.GroupLayout(jpRight2);
        jpRight2.setLayout(jpRight2Layout);
        jpRight2Layout.setHorizontalGroup(
            jpRight2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRight2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRight2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpRight2Layout.createSequentialGroup()
                        .addComponent(jlTotalAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTotalAmount))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRight2Layout.createSequentialGroup()
                        .addComponent(jlVoucher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpRight2Layout.createSequentialGroup()
                        .addGroup(jpRight2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlMoneyReceived)
                            .addComponent(jlMoneyLeftOver)
                            .addComponent(jlPay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpRight2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfMoneyLeftOver)
                            .addComponent(jtfMoneyReceived))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpRight2Layout.setVerticalGroup(
            jpRight2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRight2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRight2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTotalAmount)
                    .addComponent(jtfTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpRight2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVoucher)
                    .addComponent(jtfVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpRight2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPay)
                    .addComponent(cbPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpRight2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMoneyReceived)
                    .addComponent(jtfMoneyReceived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpRight2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMoneyLeftOver)
                    .addComponent(jtfMoneyLeftOver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jpRight.add(jpRight2);

        jpRight3.setBackground(new java.awt.Color(255, 255, 255));
        jpRight3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCreateBill.setBackground(new java.awt.Color(135, 206, 235));
        btnCreateBill.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/create24.png"))); // NOI18N
        btnCreateBill.setText("Tạo hóa đơn");
        btnCreateBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnCancel.setBackground(new java.awt.Color(135, 206, 235));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x24.png"))); // NOI18N
        btnCancel.setText("Hủy");
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnPay.setBackground(new java.awt.Color(135, 206, 235));
        btnPay.setForeground(new java.awt.Color(255, 255, 255));
        btnPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pay24.png"))); // NOI18N
        btnPay.setText("Thanh toán");
        btnPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jpRight3Layout = new javax.swing.GroupLayout(jpRight3);
        jpRight3.setLayout(jpRight3Layout);
        jpRight3Layout.setHorizontalGroup(
            jpRight3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRight3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRight3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpRight3Layout.createSequentialGroup()
                        .addComponent(btnCreateBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jpRight3Layout.setVerticalGroup(
            jpRight3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRight3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpRight3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jpRight.add(jpRight3);

        add(jpRight);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfVoucherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfVoucherActionPerformed

    private void jtfTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTotalAmountActionPerformed

    private void jtfMoneyReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMoneyReceivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMoneyReceivedActionPerformed

    private void jtfMoneyLeftOverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMoneyLeftOverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMoneyLeftOverActionPerformed

    
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
        jpWebcam.add(webcamPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 143));
        executor.execute(this);
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bill_GUI.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(Bill_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (result != null) {
                String qr = result.getText();
                JOptionPane.showMessageDialog(null, "Mã QR Code: " + qr);
            }

        } while (true);
    }
//@Override

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
    private Customs.Button btnCancel;
    private Customs.Button btnCreateBill;
    private javax.swing.JButton btnDel;
    private Customs.Button btnPay;
    private javax.swing.JComboBox<String> cbPay;
    private javax.swing.JTable jTableCart;
    private javax.swing.JTable jTableLítProduct;
    private javax.swing.JTable jTablejspListBill;
    private javax.swing.JLabel jlMoneyLeftOver;
    private javax.swing.JLabel jlMoneyReceived;
    private javax.swing.JLabel jlNameCustomer;
    private javax.swing.JLabel jlPay;
    private javax.swing.JLabel jlPhone;
    private javax.swing.JLabel jlTotalAmount;
    private javax.swing.JLabel jlVoucher;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpLeft1;
    private javax.swing.JPanel jpLeft2;
    private javax.swing.JPanel jpLeft3;
    private javax.swing.JPanel jpListBill;
    private javax.swing.JPanel jpQR;
    private javax.swing.JPanel jpRight;
    private javax.swing.JPanel jpRight1;
    private javax.swing.JPanel jpRight2;
    private javax.swing.JPanel jpRight3;
    private javax.swing.JPanel jpWebcam;
    private javax.swing.JScrollPane jpsCart;
    private javax.swing.JScrollPane jspListBill;
    private javax.swing.JScrollPane jspListProduct;
    private javax.swing.JTextField jtfMoneyLeftOver;
    private javax.swing.JTextField jtfMoneyReceived;
    private javax.swing.JTextField jtfNameCustomer;
    private javax.swing.JTextField jtfPhone;
    private javax.swing.JTextField jtfTotalAmount;
    private javax.swing.JTextField jtfVoucher;
    // End of variables declaration//GEN-END:variables
}
