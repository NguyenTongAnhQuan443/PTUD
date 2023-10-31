// 1013, 579
// 1013, 348 buttom
package gui;

import lib2.TableCustom;

public class Customer_GUI extends javax.swing.JPanel {

    private PurchaseHistory_GUI purchaseHistory_GUI;
    public Customer_GUI() {
        initComponents();
        TableCustom.apply(jspTableCus, TableCustom.TableType.DEFAULT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTop = new javax.swing.JPanel();
        jlIDCus = new javax.swing.JLabel();
        jtfIDCus = new javax.swing.JTextField();
        jlNameCus = new javax.swing.JLabel();
        jlPhoneCus = new javax.swing.JLabel();
        jlAddress = new javax.swing.JLabel();
        cbProvince = new lib2.ComboBoxSuggestion();
        cbDistrict = new lib2.ComboBoxSuggestion();
        cbCommune = new lib2.ComboBoxSuggestion();
        jlAddressDetail = new javax.swing.JLabel();
        jtfNameCus = new javax.swing.JTextField();
        jtfPhoneCus = new javax.swing.JTextField();
        jtfAddressDetail = new javax.swing.JTextField();
        jcReceivePromotion = new javax.swing.JCheckBox();
        btnAdd1 = new lib2.Button();
        btnEdit = new lib2.Button();
        btnClear = new lib2.Button();
        jpBottom = new javax.swing.JPanel();
        jpSelect = new javax.swing.JPanel();
        jpTable = new javax.swing.JPanel();
        jspTableCus = new javax.swing.JScrollPane();
        jTableCus = new javax.swing.JTable();
        jlFilterPhone = new javax.swing.JLabel();
        jtfFilterPhone = new javax.swing.JTextField();
        btnFilter = new lib2.Button();
        jlFilterStatus = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbStatus = new lib2.ComboBoxSuggestion();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jpTop.setBackground(new java.awt.Color(255, 255, 255));
        jpTop.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thiết lập thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jlIDCus.setText("Mã khách hàng : ");

        jtfIDCus.setEditable(false);
        jtfIDCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDCusActionPerformed(evt);
            }
        });

        jlNameCus.setText("Tên khách hàng :");

        jlPhoneCus.setText("Số điện thoại : ");

        jlAddress.setText("Địa chỉ : ");

        cbProvince.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tỉnh/Thành phố" }));

        cbDistrict.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quận/Huyện" }));
        cbDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDistrictActionPerformed(evt);
            }
        });

        cbCommune.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Phường/Xã" }));
        cbCommune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCommuneActionPerformed(evt);
            }
        });

        jlAddressDetail.setText("Địa chỉ cụ thể :");

        jtfNameCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameCusActionPerformed(evt);
            }
        });

        jtfPhoneCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPhoneCusActionPerformed(evt);
            }
        });

        jtfAddressDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAddressDetailActionPerformed(evt);
            }
        });

        jcReceivePromotion.setBackground(new java.awt.Color(255, 255, 255));
        jcReceivePromotion.setText("Nhận thông tin chương trình khuyến mãi ?");

        btnAdd1.setBackground(new java.awt.Color(135, 206, 235));
        btnAdd1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add24.png"))); // NOI18N
        btnAdd1.setText("Thêm");
        btnAdd1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit24.png"))); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.setEnabled(false);
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnClear.setBackground(new java.awt.Color(135, 206, 235));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/clear24.png"))); // NOI18N
        btnClear.setText("Làm mới");
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTopLayout = new javax.swing.GroupLayout(jpTop);
        jpTop.setLayout(jpTopLayout);
        jpTopLayout.setHorizontalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIDCus)
                    .addComponent(jlAddress)
                    .addComponent(jlPhoneCus))
                .addGap(25, 25, 25)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpTopLayout.createSequentialGroup()
                                .addComponent(jtfIDCus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172)
                                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNameCus)
                                    .addComponent(jlAddressDetail)))
                            .addGroup(jpTopLayout.createSequentialGroup()
                                .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80)
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcReceivePromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfAddressDetail)
                            .addComponent(jtfNameCus)))
                    .addComponent(jtfPhoneCus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(332, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(551, 551, 551))
        );
        jpTopLayout.setVerticalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDCus)
                    .addComponent(jtfIDCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNameCus)
                    .addComponent(jtfNameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPhoneCus)
                    .addComponent(jtfPhoneCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfAddressDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlAddressDetail)))
                .addGap(18, 18, 18)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAddress)
                    .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcReceivePromotion))
                .addGap(32, 32, 32)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(jpTop);

        jpBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpBottom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jpSelect.setLayout(new java.awt.GridLayout(1, 2));

        jpTable.setBackground(new java.awt.Color(255, 255, 255));

        jTableCus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Email", "Địa chỉ", "Trạng thái", "Nhận thông tin khuyến mãi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspTableCus.setViewportView(jTableCus);

        jlFilterPhone.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlFilterPhone.setText("Tìm theo SDT :");

        jtfFilterPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFilterPhoneActionPerformed(evt);
            }
        });

        btnFilter.setBackground(new java.awt.Color(135, 206, 235));
        btnFilter.setForeground(new java.awt.Color(255, 255, 255));
        btnFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search24.png"))); // NOI18N
        btnFilter.setText("Tìm");
        btnFilter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        jlFilterStatus.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlFilterStatus.setText("Lọc theo trạng thái :");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Test lịch sử GD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Đang hoạt động", "Ngưng hoạt động" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTableLayout = new javax.swing.GroupLayout(jpTable);
        jpTable.setLayout(jpTableLayout);
        jpTableLayout.setHorizontalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlFilterPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfFilterPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jlFilterStatus)
                .addGap(18, 18, 18)
                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jspTableCus)
        );
        jpTableLayout.setVerticalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addComponent(jspTableCus, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jlFilterPhone)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFilterStatus)
                    .addComponent(jButton1)
                    .addComponent(jtfFilterPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpBottomLayout = new javax.swing.GroupLayout(jpBottom);
        jpBottom.setLayout(jpBottomLayout);
        jpBottomLayout.setHorizontalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBottomLayout.createSequentialGroup()
                .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jpBottomLayout.setVerticalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBottomLayout.createSequentialGroup()
                .addComponent(jpSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jpBottom);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIDCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDCusActionPerformed

    private void jtfNameCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameCusActionPerformed

    private void jtfPhoneCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPhoneCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPhoneCusActionPerformed

    private void jtfAddressDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAddressDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAddressDetailActionPerformed

    private void jtfFilterPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFilterPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFilterPhoneActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearInput();
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        purchaseHistory_GUI = new PurchaseHistory_GUI();
        purchaseHistory_GUI.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbCommuneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCommuneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCommuneActionPerformed

    private void cbDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDistrictActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFilterActionPerformed
// ID Khách hàng do hệ thống phát sinh

    public void openInput() {
        jtfNameCus.setEditable(true);
        jtfPhoneCus.setEditable(true);
        jtfAddressDetail.setEditable(true);
//        btnAdd.setText("Hủy");
    }

    public void clearInput() {
        jtfAddressDetail.setText("");
        jtfIDCus.setText("");
        jtfNameCus.setText("");
        jtfPhoneCus.setText("");

        cbCommune.setSelectedIndex(0);
        cbDistrict.setSelectedIndex(0);
        cbProvince.setSelectedIndex(0);
    }

    public void offInput() {
        jtfNameCus.setEditable(false);
        jtfPhoneCus.setEditable(false);
        jtfAddressDetail.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnAdd1;
    private lib2.Button btnClear;
    private lib2.Button btnEdit;
    private lib2.Button btnFilter;
    private lib2.ComboBoxSuggestion cbCommune;
    private lib2.ComboBoxSuggestion cbDistrict;
    private lib2.ComboBoxSuggestion cbProvince;
    private lib2.ComboBoxSuggestion cbStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jTableCus;
    private javax.swing.JCheckBox jcReceivePromotion;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlAddressDetail;
    private javax.swing.JLabel jlFilterPhone;
    private javax.swing.JLabel jlFilterStatus;
    private javax.swing.JLabel jlIDCus;
    private javax.swing.JLabel jlNameCus;
    private javax.swing.JLabel jlPhoneCus;
    private javax.swing.JPanel jpBottom;
    private javax.swing.JPanel jpSelect;
    private javax.swing.JPanel jpTable;
    private javax.swing.JPanel jpTop;
    private javax.swing.JScrollPane jspTableCus;
    private javax.swing.JTextField jtfAddressDetail;
    private javax.swing.JTextField jtfFilterPhone;
    private javax.swing.JTextField jtfIDCus;
    private javax.swing.JTextField jtfNameCus;
    private javax.swing.JTextField jtfPhoneCus;
    // End of variables declaration//GEN-END:variables
}
