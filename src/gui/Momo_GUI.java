package gui;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import dao.InvoiceDetails_DAO;
import dao.Invoice_DAO;
import entity.Flag;
import javax.swing.ImageIcon;
import java.io.File;
import entity.Invoice;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import static utils.Utils.openPDF;

public class Momo_GUI extends javax.swing.JFrame {

    private Invoice_DAO invoice_DAO = new Invoice_DAO();
    private InvoiceDetails_DAO invoiceDetails_DAO = new InvoiceDetails_DAO();
    private Invoice invoice;

    public Momo_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        String filePath = "D:\\FleyShopApp\\QRPay\\QRPay.png";
        File imageFile = new File(filePath);
        jlImgQR.setIcon(new ImageIcon(filePath));
        imageFile.delete();
        JOptionPane.showMessageDialog(null, Flag.getIdInvoiceForPrintf());
        printInvoice(invoice_DAO.getInvoiceById(Flag.getIdInvoiceForPrintf()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jlLogoMomo = new javax.swing.JLabel();
        jpQR = new javax.swing.JPanel();
        jlImgQR = new javax.swing.JLabel();
        btnReturn = new lib2.Button();
        btnInBill = new lib2.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hệ thống thanh toán trực tuyến FleyShop");

        jpMain.setBackground(new java.awt.Color(255, 255, 255));
        jpMain.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thanh toán Momo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jlLogoMomo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/MoMo_Logo.png"))); // NOI18N

        jpQR.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpQRLayout = new javax.swing.GroupLayout(jpQR);
        jpQR.setLayout(jpQRLayout);
        jpQRLayout.setHorizontalGroup(
            jpQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlImgQR, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );
        jpQRLayout.setVerticalGroup(
            jpQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlImgQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpMainLayout = new javax.swing.GroupLayout(jpMain);
        jpMain.setLayout(jpMainLayout);
        jpMainLayout.setHorizontalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addComponent(jlLogoMomo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpQR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpMainLayout.setVerticalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlLogoMomo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReturn.setBackground(new java.awt.Color(135, 206, 235));
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/return16.png"))); // NOI18N
        btnReturn.setText("Quay lại");
        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnInBill.setBackground(new java.awt.Color(135, 206, 235));
        btnInBill.setForeground(new java.awt.Color(255, 255, 255));
        btnInBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/printer16.png"))); // NOI18N
        btnInBill.setText("Thành công_in hóa đơn");
        btnInBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInBillMouseClicked(evt);
            }
        });
        btnInBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnInBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInBillActionPerformed
//        printInvoice(invoice_DAO.getInvoiceById(Flag.getIdInvoiceForPrintf()));
    }//GEN-LAST:event_btnInBillActionPerformed

    private void btnInBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInBillMouseClicked

    }//GEN-LAST:event_btnInBillMouseClicked
    public void printInvoice(Invoice invoice) {
        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            // In hóa đơn
            Flag.setIdInvoiceForPrintf(invoice.getIdInvoice());
            Invoice_GUI invoice_GUI = new Invoice_GUI();
            invoice_GUI.setJlIDInvoiceDetails(invoice.getIdInvoice());
            invoice_GUI.setJlNameCusDetails(invoice.getCustomer().getName());
            invoice_GUI.setJlDateInvoiceDetails(invoice.getDateCreated().toLocalDate().toString());
            invoice_GUI.setJlNameStaffDetails(invoice.getStaff().getName());
            invoice_GUI.setJlTotalDetails(invoice.getTotalAmount() + "");
            invoice_GUI.setJlMoneyReceived(invoice.getAmountReceived() + "");
            invoice_GUI.setJlExcessCash(invoice.getChangeAmount() + "");

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnInBill;
    private lib2.Button btnReturn;
    private javax.swing.JLabel jlImgQR;
    private javax.swing.JLabel jlLogoMomo;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpQR;
    // End of variables declaration//GEN-END:variables
}
