//230, 550
package gui;

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
        btnCancel = new lib2.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        ipInfoCustomer.setBackground(new java.awt.Color(255, 255, 255));
        ipInfoCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipInfoCustomer.setLayout(new java.awt.GridLayout(2, 1));

        jpCheckOldCus.setBackground(new java.awt.Color(255, 255, 255));
        jpCheckOldCus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách hàng cũ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N

        jlPhoneOldCus.setText("SDT Khách hàng :");

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
        btnSearchPhone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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

        jtfNameCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        btnCancel.setBackground(new java.awt.Color(135, 206, 235));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x24.png"))); // NOI18N
        btnCancel.setText("Hủy");
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jpPayLayout = new javax.swing.GroupLayout(jpPay);
        jpPay.setLayout(jpPayLayout);
        jpPayLayout.setHorizontalGroup(
            jpPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPayLayout.createSequentialGroup()
                .addComponent(btnCreateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
            .addComponent(btnPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpPayLayout.setVerticalGroup(
            jpPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPayLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jpPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jpPay);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPhoneOldCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPhoneOldCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPhoneOldCusActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPayActionPerformed

    private void jtfMoneyReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMoneyReceivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMoneyReceivedActionPerformed

    private void cbPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaymentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPaymentsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnCancel;
    private lib2.Button btnCreateOrder;
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
