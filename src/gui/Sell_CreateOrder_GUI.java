//230, 550
package gui;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static utils.Utils.openPDF;

public class Sell_CreateOrder_GUI extends javax.swing.JPanel {

    public Sell_CreateOrder_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ipInfoCustomer = new javax.swing.JPanel();
        jpCheckOldCus = new javax.swing.JPanel();
        jlPhoneOldCus = new javax.swing.JLabel();
        jtfPhoneOldCus = new javax.swing.JTextField();
        btnSearchPhone = new lib2.Button();
        jpNewCus = new javax.swing.JPanel();
        jlNameCus = new javax.swing.JLabel();
        jtfNameCus = new javax.swing.JTextField();
        jtfPhoneCus = new javax.swing.JTextField();
        jlPhoneCus = new javax.swing.JLabel();
        jpMoney = new javax.swing.JPanel();
        jlTotalAmount = new javax.swing.JLabel();
        jtfTotalAmount = new javax.swing.JTextField();
        jlVoucher = new javax.swing.JLabel();
        jlPayments = new javax.swing.JLabel();
        jtfMoneyReceived = new javax.swing.JTextField();
        jlMoneyReceived = new javax.swing.JLabel();
        jtfExcessCash = new javax.swing.JTextField();
        jlExcessCash = new javax.swing.JLabel();
        cbVoucher = new lib2.ComboBoxSuggestion();
        cbPayments = new lib2.ComboBoxSuggestion();
        jpPay = new javax.swing.JPanel();
        btnPay = new lib2.Button();
        btnCreateOrder = new lib2.Button();
        btnOrderWait = new lib2.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        ipInfoCustomer.setBackground(new java.awt.Color(255, 255, 255));
        ipInfoCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipInfoCustomer.setLayout(new java.awt.GridLayout(2, 1));

        jpCheckOldCus.setBackground(new java.awt.Color(255, 255, 255));
        jpCheckOldCus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách hàng cũ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N

        jlPhoneOldCus.setText("SDT Khách hàng :");

        jtfPhoneOldCus.setEditable(false);
        jtfPhoneOldCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfPhoneOldCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPhoneOldCusActionPerformed(evt);
            }
        });

        btnSearchPhone.setBackground(new java.awt.Color(135, 206, 235));
        btnSearchPhone.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search24.png"))); // NOI18N
        btnSearchPhone.setText("Tìm  ");
        btnSearchPhone.setEnabled(false);
        btnSearchPhone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearchPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPhoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCheckOldCusLayout = new javax.swing.GroupLayout(jpCheckOldCus);
        jpCheckOldCus.setLayout(jpCheckOldCusLayout);
        jpCheckOldCusLayout.setHorizontalGroup(
            jpCheckOldCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCheckOldCusLayout.createSequentialGroup()
                .addComponent(jtfPhoneOldCus, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpCheckOldCusLayout.createSequentialGroup()
                .addComponent(jlPhoneOldCus)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpCheckOldCusLayout.setVerticalGroup(
            jpCheckOldCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCheckOldCusLayout.createSequentialGroup()
                .addComponent(jlPhoneOldCus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCheckOldCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPhoneOldCus)
                    .addComponent(btnSearchPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ipInfoCustomer.add(jpCheckOldCus);

        jpNewCus.setBackground(new java.awt.Color(255, 255, 255));
        jpNewCus.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlNameCus.setText("Tên KH :");

        jtfNameCus.setEditable(false);
        jtfNameCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfPhoneCus.setEditable(false);
        jtfPhoneCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlPhoneCus.setText("SDT :");

        javax.swing.GroupLayout jpNewCusLayout = new javax.swing.GroupLayout(jpNewCus);
        jpNewCus.setLayout(jpNewCusLayout);
        jpNewCusLayout.setHorizontalGroup(
            jpNewCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNewCusLayout.createSequentialGroup()
                .addGroup(jpNewCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNewCusLayout.createSequentialGroup()
                        .addComponent(jlPhoneCus)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNewCusLayout.createSequentialGroup()
                        .addComponent(jlNameCus)
                        .addGap(18, 18, 18)))
                .addGroup(jpNewCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNameCus, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jtfPhoneCus)))
        );
        jpNewCusLayout.setVerticalGroup(
            jpNewCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNewCusLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpNewCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNameCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNameCus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpNewCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPhoneCus)
                    .addComponent(jtfPhoneCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        ipInfoCustomer.add(jpNewCus);

        add(ipInfoCustomer);

        jpMoney.setBackground(new java.awt.Color(255, 255, 255));
        jpMoney.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTotalAmount.setText("Tổng tiền hàng : ");

        jtfTotalAmount.setEditable(false);
        jtfTotalAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlVoucher.setText("Mã giảm giá :");

        jlPayments.setText("HT thanh toán :");

        jtfMoneyReceived.setEditable(false);
        jtfMoneyReceived.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfMoneyReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMoneyReceivedActionPerformed(evt);
            }
        });

        jlMoneyReceived.setText("Số tiền nhận :");

        jtfExcessCash.setEditable(false);
        jtfExcessCash.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlExcessCash.setText("Số tiền còn lại :");

        cbPayments.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tiền mặt", "Momo" }));
        cbPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPaymentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMoneyLayout = new javax.swing.GroupLayout(jpMoney);
        jpMoney.setLayout(jpMoneyLayout);
        jpMoneyLayout.setHorizontalGroup(
            jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMoneyLayout.createSequentialGroup()
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTotalAmount)
                    .addComponent(jlVoucher)
                    .addComponent(jlPayments)
                    .addComponent(jlMoneyReceived)
                    .addComponent(jlExcessCash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(cbVoucher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(cbPayments, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jtfMoneyReceived)
                    .addComponent(jtfExcessCash)))
        );
        jpMoneyLayout.setVerticalGroup(
            jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMoneyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTotalAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVoucher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPayments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPayments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMoneyReceived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMoneyReceived))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfExcessCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlExcessCash))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        add(jpMoney);

        jpPay.setBackground(new java.awt.Color(255, 255, 255));
        jpPay.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPay.setBackground(new java.awt.Color(135, 206, 235));
        btnPay.setForeground(new java.awt.Color(255, 255, 255));
        btnPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pay24.png"))); // NOI18N
        btnPay.setText("Thanh toán");
        btnPay.setEnabled(false);
        btnPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btnCreateOrder.setBackground(new java.awt.Color(135, 206, 235));
        btnCreateOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/create24.png"))); // NOI18N
        btnCreateOrder.setText("Tạo hóa đơn");
        btnCreateOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrderActionPerformed(evt);
            }
        });

        btnOrderWait.setBackground(new java.awt.Color(135, 206, 235));
        btnOrderWait.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderWait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/waiting24.png"))); // NOI18N
        btnOrderWait.setText("Đơn chờ");
        btnOrderWait.setEnabled(false);
        btnOrderWait.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOrderWait.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderWaitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPayLayout = new javax.swing.GroupLayout(jpPay);
        jpPay.setLayout(jpPayLayout);
        jpPayLayout.setHorizontalGroup(
            jpPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPayLayout.createSequentialGroup()
                .addComponent(btnCreateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrderWait, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
            .addComponent(btnPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpPayLayout.setVerticalGroup(
            jpPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPayLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jpPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrderWait, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jpPay);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPhoneOldCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPhoneOldCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPhoneOldCusActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
//      nếu thanh toán bằng tiền mặt
        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn thanh toán hóa đơn này không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (cbPayments.getSelectedIndex() == 0) {
//              Sự kiện thanh toán thành công và hỏi có in hóa đơn hay không
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

// In hóa đơn           
// Truyền dữ liệu vào các trường này
                    Invoice_GUI invoice_GUI = new Invoice_GUI();
                    invoice_GUI.setJlIDInvoiceDetails("Mã hóa đơn 002");
                    invoice_GUI.setJlNameCusDetails("Tên KH");
                    invoice_GUI.setJlDateInvoiceDetails("Ngày tạo");
                    invoice_GUI.setJlNameStaffDetails("Tên nhân viên");
//    invoice_GUI.setjTableListProduct(jTableListProduct); // truyền vào dữ liệu table
                    invoice_GUI.setJlTotalDetails("Tổng tiền hàng");
// In hóa đơn            

// print the panel to pdf
                    Document document = new Document();
                    try {
                        // Đường dẫn tới tệp PDF để lưu hóa đơn
                        String pdfFilePath = "bill.pdf";
                        // Tạo một đối tượng PdfWriter để viết nội dung vào tệp PDF
                        PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
                        // Mở tài liệu để bắt đầu viết
                        document.open();
                        // Lấy kích thước của jpMain
                        int width = invoice_GUI.getJpMain().getWidth();
                        int height = invoice_GUI.getJpMain().getHeight();
                        // Tạo một BufferedImage để chứa hình ảnh của jpMain
                        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                        Graphics2D g = image.createGraphics();

                        invoice_GUI.getJpMain().printAll(g);
                        g.dispose();
                        // Chuyển đổi BufferedImage thành hình ảnh dựng sẵn để chèn vào tài liệu PDF
                        com.itextpdf.text.Image pdfImage = com.itextpdf.text.Image.getInstance(image, null);
                        // Đặt kích thước của hình ảnh trong tài liệu PDF (có thể điều chỉnh kích thước tùy ý)
                        pdfImage.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());
                        // Chèn hình ảnh vào tài liệu PDF
                        document.add(pdfImage);
                        // Đóng tài liệu
                        document.close();
                        openPDF(pdfFilePath);
                    } catch (DocumentException | IOException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Lỗi khi lưu hóa đơn: " + e.getMessage());
                    }

                }
            } //          Nếu thanh toán bằng momo
            else if (cbPayments.getSelectedIndex() == 1) {
                try {
                    String monney = "231016"; // truyền số tiền hàng vào đây
                    String str1 = "2|99|0365962232|Nguyen Tong Anh Quan||0|0|";
                    String str2 = "||transfer_myqr";
                    String QrCodeData = str1 + monney + str2;

                    String projectDir = System.getProperty("user.dir"); // Lấy đường dẫn đến thư mục dự án

                    String fileName = "QRPay.png";
                    String filePath = projectDir + "\\src\\images\\" + fileName; // Sử dụng thư mục "images" trong dự án

                    String charset = "UTF-8";
                    Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
                    hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
                    BitMatrix matrix = new MultiFormatWriter().encode(
                            new String(QrCodeData.getBytes(charset), charset),
                            BarcodeFormat.QR_CODE, 242, 242, hintMap);
                    MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.') + 1), new File(filePath));
                } catch (Exception e) {
                    System.out.println(e);
                }
                Momo_GUI momo_GUI = new Momo_GUI();
                momo_GUI.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPayActionPerformed

    private void jtfMoneyReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMoneyReceivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMoneyReceivedActionPerformed

    private void cbPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaymentsActionPerformed
        if (cbPayments.getSelectedIndex() == 1) {
            jtfMoneyReceived.setEditable(false);
        } else {
            jtfMoneyReceived.setEditable(true);
        }
    }//GEN-LAST:event_cbPaymentsActionPerformed

    private void btnCreateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrderActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tạo đơn hàng mới không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            jtfPhoneOldCus.setEditable(true);
            btnSearchPhone.setEnabled(true);
            jtfMoneyReceived.setEditable(true);
            btnOrderWait.setEnabled(true);
            btnPay.setEnabled(true);
        }
    }//GEN-LAST:event_btnCreateOrderActionPerformed

    private void btnSearchPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPhoneActionPerformed
//        Thêm sự kiện nếu tìm thấy load data vào jtf tên khách hàng và sdt khách hàng
//        Nếu không tìm thấy mở 2 jtf này lên để nhập thông tin 
        jtfNameCus.setEditable(true);
        jtfPhoneCus.setEditable(true);
    }//GEN-LAST:event_btnSearchPhoneActionPerformed

    private void btnOrderWaitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderWaitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn hủy hóa đơn này không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            clearInput();
            offInput();
            offButton();
//            Chuyển đơn hàng vào table hóa đơn trạng thái là đơn chờ
        }

    }//GEN-LAST:event_btnOrderWaitActionPerformed
    public void clearInput() {
        jtfPhoneOldCus.setText("");
        jtfNameCus.setText("");
        jtfPhoneCus.setText("");
        jtfTotalAmount.setText("");
        jtfMoneyReceived.setText("");
        jtfExcessCash.setText("");
    }

    public void offInput() {
        jtfPhoneOldCus.setEditable(false);
        btnSearchPhone.setEnabled(false);
        cbVoucher.setEditable(false);
        cbPayments.setEditable(false);
        jtfNameCus.setEditable(false);
        jtfPhoneCus.setEditable(false);
        jtfMoneyReceived.setEditable(false);
    }

    public void offButton() {
        btnSearchPhone.setEnabled(false);
        btnOrderWait.setEnabled(false);
        btnPay.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnCreateOrder;
    private lib2.Button btnOrderWait;
    private lib2.Button btnPay;
    private lib2.Button btnSearchPhone;
    private lib2.ComboBoxSuggestion cbPayments;
    private lib2.ComboBoxSuggestion cbVoucher;
    private javax.swing.JPanel ipInfoCustomer;
    private javax.swing.JLabel jlExcessCash;
    private javax.swing.JLabel jlMoneyReceived;
    private javax.swing.JLabel jlNameCus;
    private javax.swing.JLabel jlPayments;
    private javax.swing.JLabel jlPhoneCus;
    private javax.swing.JLabel jlPhoneOldCus;
    private javax.swing.JLabel jlTotalAmount;
    private javax.swing.JLabel jlVoucher;
    private javax.swing.JPanel jpCheckOldCus;
    private javax.swing.JPanel jpMoney;
    private javax.swing.JPanel jpNewCus;
    private javax.swing.JPanel jpPay;
    private javax.swing.JTextField jtfExcessCash;
    private javax.swing.JTextField jtfMoneyReceived;
    private javax.swing.JTextField jtfNameCus;
    private javax.swing.JTextField jtfPhoneCus;
    private javax.swing.JTextField jtfPhoneOldCus;
    private javax.swing.JTextField jtfTotalAmount;
    // End of variables declaration//GEN-END:variables
}
