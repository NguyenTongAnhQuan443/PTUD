package gui;

import javax.swing.JOptionPane;

public class Sell_CreateOrderShip_GUI extends javax.swing.JPanel {

    public Sell_CreateOrderShip_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ipInfoCustomer = new javax.swing.JPanel();
        jpCustomer = new javax.swing.JPanel();
        jlNameCus = new javax.swing.JLabel();
        jtfNameCus = new javax.swing.JTextField();
        jtfAddress = new javax.swing.JTextField();
        jlPhoneCus = new javax.swing.JLabel();
        jlAddress = new javax.swing.JLabel();
        cbProvince = new lib2.ComboBoxSuggestion();
        cbDistrict = new lib2.ComboBoxSuggestion();
        cbCommune = new lib2.ComboBoxSuggestion();
        jlAddress1 = new javax.swing.JLabel();
        jtfPhoneCus = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jcReceivePromotion = new javax.swing.JCheckBox();
        jpMoney = new javax.swing.JPanel();
        jlTotalAmount = new javax.swing.JLabel();
        jtfTotalAmount = new javax.swing.JTextField();
        jlMoneyShip = new javax.swing.JLabel();
        jtfMoneyShip = new javax.swing.JTextField();
        jlTotal = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();
        jtfNote = new javax.swing.JTextField();
        jlNote = new javax.swing.JLabel();
        jpPay = new javax.swing.JPanel();
        btnCreateOrder = new lib2.Button();
        btnDelivering = new lib2.Button();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        ipInfoCustomer.setBackground(new java.awt.Color(255, 255, 255));
        ipInfoCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipInfoCustomer.setLayout(new java.awt.GridLayout(1, 1));

        jpCustomer.setBackground(new java.awt.Color(255, 255, 255));
        jpCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlNameCus.setText("Tên KH (*):");

        jtfNameCus.setEditable(false);
        jtfNameCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfAddress.setEditable(false);
        jtfAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlPhoneCus.setText("SDT (*):");

        jlAddress.setText("Địa chỉ (*):");

        cbProvince.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tỉnh/Thành phố" }));

        cbDistrict.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quận/Huyện" }));

        cbCommune.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Phường/Xã" }));

        jlAddress1.setText("Cụ thể :");

        jtfPhoneCus.setEditable(false);
        jtfPhoneCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlEmail.setText("Email :");

        jtfEmail.setEditable(false);
        jtfEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jcReceivePromotion.setBackground(new java.awt.Color(255, 255, 255));
        jcReceivePromotion.setText("Nhận thông tin khuyến mãi");

        javax.swing.GroupLayout jpCustomerLayout = new javax.swing.GroupLayout(jpCustomer);
        jpCustomer.setLayout(jpCustomerLayout);
        jpCustomerLayout.setHorizontalGroup(
            jpCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCustomerLayout.createSequentialGroup()
                .addGroup(jpCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAddress)
                    .addComponent(jlAddress1))
                .addGap(18, 18, 18)
                .addGroup(jpCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCommune, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cbDistrict, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jtfAddress)
                    .addComponent(cbProvince, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
            .addGroup(jpCustomerLayout.createSequentialGroup()
                .addGroup(jpCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCustomerLayout.createSequentialGroup()
                        .addComponent(jlNameCus)
                        .addGap(18, 18, 18))
                    .addGroup(jpCustomerLayout.createSequentialGroup()
                        .addComponent(jlEmail)
                        .addGap(41, 41, 41)))
                .addGroup(jpCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfEmail)
                    .addComponent(jtfNameCus)))
            .addGroup(jpCustomerLayout.createSequentialGroup()
                .addComponent(jcReceivePromotion)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCustomerLayout.createSequentialGroup()
                .addComponent(jlPhoneCus)
                .addGap(37, 37, 37)
                .addComponent(jtfPhoneCus))
        );
        jpCustomerLayout.setVerticalGroup(
            jpCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNameCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNameCus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPhoneCus)
                    .addComponent(jtfPhoneCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAddress1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcReceivePromotion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ipInfoCustomer.add(jpCustomer);

        add(ipInfoCustomer);

        jpMoney.setBackground(new java.awt.Color(255, 255, 255));
        jpMoney.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTotalAmount.setText("Tổng tiền hàng : ");

        jtfTotalAmount.setEditable(false);
        jtfTotalAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlMoneyShip.setText("Tiền Ship :");

        jtfMoneyShip.setEditable(false);
        jtfMoneyShip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlTotal.setText("Khách cần trả :");

        jtfTotal.setEditable(false);
        jtfTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTotalActionPerformed(evt);
            }
        });

        jtfNote.setEditable(false);

        jlNote.setText("Ghi chú :");

        javax.swing.GroupLayout jpMoneyLayout = new javax.swing.GroupLayout(jpMoney);
        jpMoney.setLayout(jpMoneyLayout);
        jpMoneyLayout.setHorizontalGroup(
            jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMoneyLayout.createSequentialGroup()
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTotalAmount)
                    .addComponent(jlMoneyShip)
                    .addComponent(jlTotal)
                    .addComponent(jlNote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNote, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jtfTotal)
                    .addComponent(jtfMoneyShip)
                    .addComponent(jtfTotalAmount)))
        );
        jpMoneyLayout.setVerticalGroup(
            jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMoneyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTotalAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMoneyShip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMoneyShip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNote))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(jpMoney);

        jpPay.setBackground(new java.awt.Color(255, 255, 255));
        jpPay.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCreateOrder.setBackground(new java.awt.Color(135, 206, 235));
        btnCreateOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/create24.png"))); // NOI18N
        btnCreateOrder.setText("Tạo đơn hàng");
        btnCreateOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrderActionPerformed(evt);
            }
        });

        btnDelivering.setBackground(new java.awt.Color(135, 206, 235));
        btnDelivering.setForeground(new java.awt.Color(255, 255, 255));
        btnDelivering.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart24.png"))); // NOI18N
        btnDelivering.setText("Giao hàng");
        btnDelivering.setEnabled(false);
        btnDelivering.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelivering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveringActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPayLayout = new javax.swing.GroupLayout(jpPay);
        jpPay.setLayout(jpPayLayout);
        jpPayLayout.setHorizontalGroup(
            jpPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCreateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
            .addComponent(btnDelivering, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpPayLayout.setVerticalGroup(
            jpPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelivering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(jpPay);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliveringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveringActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn giao hàng không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            offInput();
            JOptionPane.showMessageDialog(null, "Đang tiến hành giao hàng");
            btnDelivering.setEnabled(false);
        }
    }//GEN-LAST:event_btnDeliveringActionPerformed

    private void jtfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTotalActionPerformed

    private void btnCreateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrderActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tạo đơn hàng ship không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            onInput();
            btnDelivering.setEnabled(true);
        }
    }//GEN-LAST:event_btnCreateOrderActionPerformed

    public void offInput() {
        jtfNameCus.setEditable(false);
        jtfPhoneCus.setEditable(false);
        jtfMoneyShip.setEditable(false);
        jtfNote.setEditable(false);
        jtfAddress.setEditable(false);
        jtfEmail.setEditable(false);
    }

    public void onInput() {
        jtfNameCus.setEditable(true);
        jtfPhoneCus.setEditable(true);
        jtfAddress.setEditable(true);
        jtfMoneyShip.setEditable(true);
        jtfNote.setEditable(true);
        jtfEmail.setEditable(true);
    }

    public void clearInput() {
        jtfAddress.setText("");
        jtfMoneyShip.setText("");
        jtfNameCus.setText("");
        jtfNote.setText("");
        jtfPhoneCus.setText("");
        jtfTotal.setText("");
        jtfTotalAmount.setText("");
        cbCommune.setSelectedIndex(0);
        cbDistrict.setSelectedIndex(0);
        cbProvince.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnCreateOrder;
    private lib2.Button btnDelivering;
    private lib2.ComboBoxSuggestion cbCommune;
    private lib2.ComboBoxSuggestion cbDistrict;
    private lib2.ComboBoxSuggestion cbProvince;
    private javax.swing.JPanel ipInfoCustomer;
    private javax.swing.JCheckBox jcReceivePromotion;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlAddress1;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlMoneyShip;
    private javax.swing.JLabel jlNameCus;
    private javax.swing.JLabel jlNote;
    private javax.swing.JLabel jlPhoneCus;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JLabel jlTotalAmount;
    private javax.swing.JPanel jpCustomer;
    private javax.swing.JPanel jpMoney;
    private javax.swing.JPanel jpPay;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfMoneyShip;
    private javax.swing.JTextField jtfNameCus;
    private javax.swing.JTextField jtfNote;
    private javax.swing.JTextField jtfPhoneCus;
    private javax.swing.JTextField jtfTotal;
    private javax.swing.JTextField jtfTotalAmount;
    // End of variables declaration//GEN-END:variables
}
