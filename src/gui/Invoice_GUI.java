package gui;

import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Invoice_GUI extends javax.swing.JFrame {

    public JPanel getJpMain() {
        return jpMain;
    }
//    Getter and seter
    public void setJpMain(JPanel jpMain) {
        this.jpMain = jpMain;
    }

    public JTable getjTableListProduct() {
        return jTableListProduct;
    }

    public void setjTableListProduct(JTable jTableListProduct) {
        this.jTableListProduct = jTableListProduct;
    }

    public JLabel getJlDateInvoiceDetails() {
        return jlDateInvoiceDetails;
    }

    public void setJlDateInvoiceDetails(String jlDateInvoiceDetails) {
        this.jlDateInvoiceDetails.setText(jlDateInvoiceDetails);
    }

    public JLabel getJlIDInvoiceDetails() {
        return jlIDInvoiceDetails;
    }

    public void setJlIDInvoiceDetails(String jlIDInvoiceDetails) {
        this.jlIDInvoiceDetails.setText(jlIDInvoiceDetails);
    }

    public JLabel getJlNameCusDetails() {
        return jlNameCusDetails;
    }

    public void setJlNameCusDetails(String jlNameCusDetails) {
        this.jlNameCusDetails.setText(jlNameCusDetails);
    }

    public JLabel getJlNameStaffDetails() {
        return jlNameStaffDetails;
    }

    public void setJlNameStaffDetails(String jlNameStaffDetails) {
        this.jlNameStaffDetails.setText(jlNameStaffDetails);
    }

    public JLabel getJlTotalDetails() {
        return jlTotalDetails;
    }

    public void setJlTotalDetails(String jlTotalDetails) {
        this.jlTotalDetails.setText(jlTotalDetails);
    }

    public JScrollPane getJspTableListProduct() {
        return jspTableListProduct;
    }

    public void setJspTableListProduct(JScrollPane jspTableListProduct) {
        this.jspTableListProduct = jspTableListProduct;
    }
    public Invoice_GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        jlTitle = new javax.swing.JLabel();
        jlAddress = new javax.swing.JLabel();
        jlAddressDetails = new javax.swing.JLabel();
        jlHotline = new javax.swing.JLabel();
        jlHotlineDetails = new javax.swing.JLabel();
        jlIDInvoice = new javax.swing.JLabel();
        jlNameCus = new javax.swing.JLabel();
        jlDateInvoice = new javax.swing.JLabel();
        jlNameStaff = new javax.swing.JLabel();
        jlIDInvoiceDetails = new javax.swing.JLabel();
        jlNameCusDetails = new javax.swing.JLabel();
        jlDateInvoiceDetails = new javax.swing.JLabel();
        jlNameStaffDetails = new javax.swing.JLabel();
        jspTableListProduct = new javax.swing.JScrollPane();
        jTableListProduct = new javax.swing.JTable();
        jlTotal = new javax.swing.JLabel();
        jlTotalDetails = new javax.swing.JLabel();
        jlVND = new javax.swing.JLabel();
        jpThanks = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlMoneyReceived = new javax.swing.JLabel();
        jlVND1 = new javax.swing.JLabel();
        jlExcessCash = new javax.swing.JLabel();
        jlVND2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpMain.setBackground(new java.awt.Color(255, 255, 255));

        jlLogo.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jlLogo.setForeground(new java.awt.Color(0, 128, 128));
        jlLogo.setText("Fley Shop");

        jlTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTitle.setText("HÓA ĐƠN TÍNH TIỀN");

        jlAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlAddress.setText("Địa chỉ : ");

        jlAddressDetails.setText("Phường 17, Quận Bình Thạnh, TP Hồ Chí Minh");

        jlHotline.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlHotline.setText("Hotline :");

        jlHotlineDetails.setText("036 596 2232");

        jlIDInvoice.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlIDInvoice.setText("Mã hóa đơn : ");

        jlNameCus.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlNameCus.setText("Tên KH :");

        jlDateInvoice.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlDateInvoice.setText("Ngày lập :");

        jlNameStaff.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlNameStaff.setText("Tên NV :");

        jlIDInvoiceDetails.setText("HD001");

        jlNameCusDetails.setText("Nguyễn Quân");

        jlDateInvoiceDetails.setText("23-10-2023");

        jlNameStaffDetails.setText("Nguyễn Văn A");

        jTableListProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "SL", "Giá", "Giảm", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspTableListProduct.setViewportView(jTableListProduct);

        jlTotal.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlTotal.setText("Tổng tiền phải thanh toán :");

        jlTotalDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlTotalDetails.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlTotalDetails.setText("100,000,000");

        jlVND.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlVND.setText("VND");

        jpThanks.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jpThanks.setText("Xin chân thành cảm ơn quý khách !");

        jLabel1.setText("Số tiền nhận :");

        jLabel2.setText("Số tiền thừa :");

        jlMoneyReceived.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlMoneyReceived.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMoneyReceived.setText("100,000,000");

        jlVND1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlVND1.setText("VND");

        jlExcessCash.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlExcessCash.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlExcessCash.setText("100,000,000");

        jlVND2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlVND2.setText("VND");

        javax.swing.GroupLayout jpMainLayout = new javax.swing.GroupLayout(jpMain);
        jpMain.setLayout(jpMainLayout);
        jpMainLayout.setHorizontalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlTitle)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlLogo)
                .addGap(123, 123, 123))
            .addGroup(jpMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMainLayout.createSequentialGroup()
                        .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIDInvoice)
                            .addComponent(jlNameCus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlNameCusDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlIDInvoiceDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMainLayout.createSequentialGroup()
                                .addComponent(jlNameStaff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlNameStaffDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                            .addGroup(jpMainLayout.createSequentialGroup()
                                .addComponent(jlDateInvoice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlDateInvoiceDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jspTableListProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jpMainLayout.createSequentialGroup()
                        .addComponent(jlTotal)
                        .addGap(18, 18, 18)
                        .addComponent(jlTotalDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jlVND))
                    .addGroup(jpMainLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jlMoneyReceived, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jlVND1))
                    .addGroup(jpMainLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jlExcessCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jlVND2))
                    .addGroup(jpMainLayout.createSequentialGroup()
                        .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMainLayout.createSequentialGroup()
                                .addComponent(jlAddress)
                                .addGap(18, 18, 18)
                                .addComponent(jlAddressDetails))
                            .addGroup(jpMainLayout.createSequentialGroup()
                                .addComponent(jlHotline)
                                .addGap(18, 18, 18)
                                .addComponent(jlHotlineDetails)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpMainLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jpThanks)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMainLayout.setVerticalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addComponent(jlLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAddress)
                    .addComponent(jlAddressDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHotline)
                    .addComponent(jlHotlineDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDInvoice)
                    .addComponent(jlDateInvoice)
                    .addComponent(jlIDInvoiceDetails)
                    .addComponent(jlDateInvoiceDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNameCus)
                    .addComponent(jlNameStaff)
                    .addComponent(jlNameCusDetails)
                    .addComponent(jlNameStaffDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspTableListProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTotal)
                    .addComponent(jlVND)
                    .addComponent(jlTotalDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlVND1)
                    .addComponent(jlMoneyReceived))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlVND2)
                    .addComponent(jlExcessCash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpThanks)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTable jTableListProduct;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlAddressDetails;
    private javax.swing.JLabel jlDateInvoice;
    private javax.swing.JLabel jlDateInvoiceDetails;
    private javax.swing.JLabel jlExcessCash;
    private javax.swing.JLabel jlHotline;
    private javax.swing.JLabel jlHotlineDetails;
    private javax.swing.JLabel jlIDInvoice;
    private javax.swing.JLabel jlIDInvoiceDetails;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlMoneyReceived;
    private javax.swing.JLabel jlNameCus;
    private javax.swing.JLabel jlNameCusDetails;
    private javax.swing.JLabel jlNameStaff;
    private javax.swing.JLabel jlNameStaffDetails;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JLabel jlTotalDetails;
    private javax.swing.JLabel jlVND;
    private javax.swing.JLabel jlVND1;
    private javax.swing.JLabel jlVND2;
    private javax.swing.JPanel jpMain;
    private javax.swing.JLabel jpThanks;
    private javax.swing.JScrollPane jspTableListProduct;
    // End of variables declaration//GEN-END:variables
}
