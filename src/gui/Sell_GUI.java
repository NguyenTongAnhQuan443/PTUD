//1013, 579
// button trả hàng chỉ xuất hiện khi ở giao diện trả hàng
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

public class Sell_GUI extends javax.swing.JPanel implements Runnable, ThreadFactory {

    private WebcamPanel webcamPanel = null;
    private Webcam webcam = null;
//    private Executor executor = Executors.newSingleThreadExecutor(this);
//    Dùng ExecutorService thay vì Executor để gọi được medthod shutdown camera
    private ExecutorService executor = Executors.newSingleThreadExecutor(this);

    private Sell_CreateOrder_GUI sell_CreateOrder_GUI;
    private Sell_CreateOrderShip_GUI sell_CreateOrderShip_GUI;

    public Sell_GUI() {
        initComponents();
        TableCustom.apply(jspListBill, TableCustom.TableType.DEFAULT);
        TableCustom.apply(jspCart, TableCustom.TableType.DEFAULT);
        TableCustom.apply(jspListProduct, TableCustom.TableType.DEFAULT);

        ExecutorService executor = Executors.newSingleThreadExecutor(this);
        initWebcam();

        sell_CreateOrder_GUI = new Sell_CreateOrder_GUI();
        jpRightBottom.add(sell_CreateOrder_GUI);
        jpRightBottom.revalidate();
        jpRightBottom.repaint();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLeft = new javax.swing.JPanel();
        jpLeft1 = new javax.swing.JPanel();
        jpListBill = new javax.swing.JPanel();
        jspListBill = new javax.swing.JScrollPane();
        jTableListBill = new javax.swing.JTable();
        jpQR = new javax.swing.JPanel();
        jpWebcam = new javax.swing.JPanel();
        jpLeft2 = new javax.swing.JPanel();
        jspCart = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();
        btnDel = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jpLeft3 = new javax.swing.JPanel();
        jspListProduct = new javax.swing.JScrollPane();
        jTableListProduct = new javax.swing.JTable();
        lbSearch = new javax.swing.JLabel();
        jtfSearch = new javax.swing.JTextField();
        btnAdd = new lib2.Button();
        lbFilterCategory = new javax.swing.JLabel();
        cbFilterCategory = new lib2.ComboBoxSuggestion();
        jpRight = new javax.swing.JPanel();
        jpRightTop = new javax.swing.JPanel();
        btnOrder = new lib2.Button();
        btnOrderShip = new lib2.Button();
        jpRightBottom = new javax.swing.JPanel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jpLeft.setBackground(new java.awt.Color(204, 204, 204));
        jpLeft.setLayout(new javax.swing.BoxLayout(jpLeft, javax.swing.BoxLayout.Y_AXIS));

        jpLeft1.setBackground(new java.awt.Color(255, 255, 255));
        jpLeft1.setLayout(new javax.swing.BoxLayout(jpLeft1, javax.swing.BoxLayout.LINE_AXIS));

        jpListBill.setBackground(new java.awt.Color(255, 255, 255));
        jpListBill.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTableListBill.setModel(new javax.swing.table.DefaultTableModel(
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
        jspListBill.setViewportView(jTableListBill);

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
            .addComponent(jpWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpListBillLayout = new javax.swing.GroupLayout(jpListBill);
        jpListBill.setLayout(jpListBillLayout);
        jpListBillLayout.setHorizontalGroup(
            jpListBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListBillLayout.createSequentialGroup()
                .addComponent(jspListBill, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpQR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpListBillLayout.setVerticalGroup(
            jpListBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jspListBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jpLeft1.add(jpListBill);

        jpLeft.add(jpLeft1);

        jpLeft2.setBackground(new java.awt.Color(255, 255, 255));
        jpLeft2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspCart.setViewportView(jTableCart);

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

        javax.swing.GroupLayout jpLeft2Layout = new javax.swing.GroupLayout(jpLeft2);
        jpLeft2.setLayout(jpLeft2Layout);
        jpLeft2Layout.setHorizontalGroup(
            jpLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeft2Layout.createSequentialGroup()
                .addComponent(jspCart, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDel)
                    .addComponent(btnClear)))
        );
        jpLeft2Layout.setVerticalGroup(
            jpLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLeft2Layout.createSequentialGroup()
                .addGroup(jpLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jspCart, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jpLeft2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpLeft.add(jpLeft2);

        jpLeft3.setBackground(new java.awt.Color(255, 255, 255));
        jpLeft3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jpLeft3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTableListProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Loại SP", "Kích thước", "Màu sắc", "Chất liệu", "Đơn giá", "Số lượng"
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

        javax.swing.GroupLayout jpLeft3Layout = new javax.swing.GroupLayout(jpLeft3);
        jpLeft3.setLayout(jpLeft3Layout);
        jpLeft3Layout.setHorizontalGroup(
            jpLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
            .addGroup(jpLeft3Layout.createSequentialGroup()
                .addComponent(lbSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFilterCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFilterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpLeft3Layout.setVerticalGroup(
            jpLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeft3Layout.createSequentialGroup()
                .addGroup(jpLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfSearch)
                    .addComponent(lbSearch)
                    .addComponent(lbFilterCategory)
                    .addComponent(cbFilterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspListProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpLeft.add(jpLeft3);

        add(jpLeft);

        jpRight.setBackground(new java.awt.Color(255, 255, 255));
        jpRight.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tạo hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jpRight.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpRight.setLayout(new javax.swing.BoxLayout(jpRight, javax.swing.BoxLayout.Y_AXIS));

        jpRightTop.setBackground(new java.awt.Color(204, 204, 255));
        jpRightTop.setLayout(new java.awt.GridLayout(1, 2));

        btnOrder.setBackground(new java.awt.Color(204, 204, 255));
        btnOrder.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setText("Tạo đơn hàng");
        btnOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        jpRightTop.add(btnOrder);

        btnOrderShip.setBackground(new java.awt.Color(204, 204, 255));
        btnOrderShip.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnOrderShip.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderShip.setText("Tạo đơn ship");
        btnOrderShip.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOrderShip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderShipActionPerformed(evt);
            }
        });
        jpRightTop.add(btnOrderShip);

        jpRight.add(jpRightTop);

        jpRightBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpRightBottom.setLayout(new java.awt.GridLayout(0, 1));
        jpRight.add(jpRightBottom);

        add(jpRight);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        sell_CreateOrder_GUI = new Sell_CreateOrder_GUI();
        jpRightBottom.removeAll();
        jpRightBottom.add(sell_CreateOrder_GUI);
        jpRightBottom.revalidate();
        jpRightBottom.repaint();
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnOrderShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderShipActionPerformed
        sell_CreateOrderShip_GUI = new Sell_CreateOrderShip_GUI();
        jpRightBottom.removeAll();
        jpRightBottom.add(sell_CreateOrderShip_GUI);
        jpRightBottom.revalidate();
        jpRightBottom.repaint();
    }//GEN-LAST:event_btnOrderShipActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

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
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDel;
    private lib2.Button btnOrder;
    private lib2.Button btnOrderShip;
    private lib2.ComboBoxSuggestion cbFilterCategory;
    private javax.swing.JTable jTableCart;
    private javax.swing.JTable jTableListBill;
    private javax.swing.JTable jTableListProduct;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpLeft1;
    private javax.swing.JPanel jpLeft2;
    private javax.swing.JPanel jpLeft3;
    private javax.swing.JPanel jpListBill;
    private javax.swing.JPanel jpQR;
    private javax.swing.JPanel jpRight;
    private javax.swing.JPanel jpRightBottom;
    private javax.swing.JPanel jpRightTop;
    private javax.swing.JPanel jpWebcam;
    private javax.swing.JScrollPane jspCart;
    private javax.swing.JScrollPane jspListBill;
    private javax.swing.JScrollPane jspListProduct;
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JLabel lbFilterCategory;
    private javax.swing.JLabel lbSearch;
    // End of variables declaration//GEN-END:variables
}
