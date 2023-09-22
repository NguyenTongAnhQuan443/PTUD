// 1013, 579
// 1013, 348 buttom
package gui;

import lib2.TableCustom;

public class Customer_GUI extends javax.swing.JPanel {

    public Customer_GUI() {
        initComponents();
        TableCustom.apply(jspTableCus, TableCustom.TableType.DEFAULT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpTop = new javax.swing.JPanel();
        jlIDCus = new javax.swing.JLabel();
        jtfIDCus = new javax.swing.JTextField();
        jlNameCus = new javax.swing.JLabel();
        jlPhoneCus = new javax.swing.JLabel();
        jlStatus = new javax.swing.JLabel();
        jrbActive = new javax.swing.JRadioButton();
        jrbInactive = new javax.swing.JRadioButton();
        jpFunction = new javax.swing.JPanel();
        btnClear = new lib2.Button();
        btnEdit = new lib2.Button();
        btnAdd = new lib2.Button();
        jlAddress = new javax.swing.JLabel();
        cbProvince = new lib2.ComboBoxSuggestion();
        cbDistrict = new lib2.ComboBoxSuggestion();
        cbCommune = new lib2.ComboBoxSuggestion();
        jlAddressDetail = new javax.swing.JLabel();
        jtfNameCus = new javax.swing.JTextField();
        jtfPhoneCus = new javax.swing.JTextField();
        jtfAddressDetail = new javax.swing.JTextField();
        jcReceivePromotion = new javax.swing.JCheckBox();
        jpBottom = new javax.swing.JPanel();
        jpSelect = new javax.swing.JPanel();
        btnInfo = new lib2.Button();
        btnHistory = new lib2.Button();
        jpTable = new javax.swing.JPanel();
        jspTableCus = new javax.swing.JScrollPane();
        jTableCus = new javax.swing.JTable();
        jpFunctionTable = new javax.swing.JPanel();
        jlFilterPhone = new javax.swing.JLabel();
        jtfFilterPhone = new javax.swing.JTextField();
        btnFilter = new lib2.Button();
        jlFilterStatus = new javax.swing.JLabel();
        cbStatus = new lib2.ComboBoxSuggestion();

        buttonGroup1.add(jrbActive);
        buttonGroup1.add(jrbInactive);
        jrbActive.setSelected(true);

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

        jlStatus.setText("Trạng thái :");

        jrbActive.setBackground(new java.awt.Color(255, 255, 255));
        jrbActive.setText("Đang hoạt động");

        jrbInactive.setBackground(new java.awt.Color(255, 255, 255));
        jrbInactive.setText("Ngưng hoạt động");
        jrbInactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactiveActionPerformed(evt);
            }
        });

        jpFunction.setBackground(new java.awt.Color(255, 255, 255));
        jpFunction.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnClear.setBackground(new java.awt.Color(135, 206, 235));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear24.png"))); // NOI18N
        btnClear.setText("Làm mới");
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit24.png"))); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.setEnabled(false);
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(135, 206, 235));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add24.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFunctionLayout = new javax.swing.GroupLayout(jpFunction);
        jpFunction.setLayout(jpFunctionLayout);
        jpFunctionLayout.setHorizontalGroup(
            jpFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFunctionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpFunctionLayout.setVerticalGroup(
            jpFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFunctionLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jlAddress.setText("Địa chỉ : ");

        cbProvince.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tỉnh/Thành phố" }));

        cbDistrict.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quận/Huyện" }));

        cbCommune.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Phường/Xã" }));

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

        javax.swing.GroupLayout jpTopLayout = new javax.swing.GroupLayout(jpTop);
        jpTop.setLayout(jpTopLayout);
        jpTopLayout.setHorizontalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addComponent(jlIDCus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfIDCus))
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNameCus)
                            .addComponent(jlAddress)
                            .addComponent(jlAddressDetail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpTopLayout.createSequentialGroup()
                                .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfNameCus)
                            .addComponent(jtfAddressDetail))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlPhoneCus)
                            .addComponent(jlStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpTopLayout.createSequentialGroup()
                                .addComponent(jrbActive)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbInactive))
                            .addComponent(jtfPhoneCus, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jcReceivePromotion))
                .addGap(18, 18, 18)
                .addComponent(jpFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jpTopLayout.setVerticalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlIDCus)
                            .addComponent(jtfIDCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPhoneCus)
                            .addComponent(jtfPhoneCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNameCus)
                            .addComponent(jlStatus)
                            .addComponent(jrbActive)
                            .addComponent(jrbInactive)
                            .addComponent(jtfNameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAddress)
                            .addComponent(jcReceivePromotion))
                        .addGap(18, 18, 18)
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfAddressDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAddressDetail)
                            .addComponent(cbCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        add(jpTop);

        jpBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpBottom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jpSelect.setLayout(new java.awt.GridLayout(1, 2));

        btnInfo.setBackground(new java.awt.Color(204, 204, 255));
        btnInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnInfo.setText("Thông tin cá nhân");
        btnInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jpSelect.add(btnInfo);

        btnHistory.setBackground(new java.awt.Color(204, 204, 255));
        btnHistory.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnHistory.setText("Lịch sử giao dịch");
        btnHistory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jpSelect.add(btnHistory);

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

        javax.swing.GroupLayout jpTableLayout = new javax.swing.GroupLayout(jpTable);
        jpTable.setLayout(jpTableLayout);
        jpTableLayout.setHorizontalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addComponent(jspTableCus, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTableLayout.setVerticalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTableCus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jpFunctionTable.setBackground(new java.awt.Color(255, 255, 255));
        jpFunctionTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlFilterPhone.setText("Tìm theo SDT :");

        jtfFilterPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFilterPhoneActionPerformed(evt);
            }
        });

        btnFilter.setBackground(new java.awt.Color(135, 206, 235));
        btnFilter.setForeground(new java.awt.Color(255, 255, 255));
        btnFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search24.png"))); // NOI18N
        btnFilter.setText("Tìm");
        btnFilter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jlFilterStatus.setText("Lọc theo trạng thái :");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Đang hoạt động", "Ngưng hoạt động" }));

        javax.swing.GroupLayout jpFunctionTableLayout = new javax.swing.GroupLayout(jpFunctionTable);
        jpFunctionTable.setLayout(jpFunctionTableLayout);
        jpFunctionTableLayout.setHorizontalGroup(
            jpFunctionTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFunctionTableLayout.createSequentialGroup()
                .addGroup(jpFunctionTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFilterPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFilterStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 34, Short.MAX_VALUE))
            .addGroup(jpFunctionTableLayout.createSequentialGroup()
                .addGroup(jpFunctionTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFunctionTableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpFunctionTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfFilterPhone)))
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpFunctionTableLayout.setVerticalGroup(
            jpFunctionTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFunctionTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlFilterPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfFilterPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jlFilterStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpBottomLayout = new javax.swing.GroupLayout(jpBottom);
        jpBottom.setLayout(jpBottomLayout);
        jpBottomLayout.setHorizontalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBottomLayout.createSequentialGroup()
                .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFunctionTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBottomLayout.setVerticalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBottomLayout.createSequentialGroup()
                .addComponent(jpSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBottomLayout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jpFunctionTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(jpBottom);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIDCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDCusActionPerformed

    private void jrbInactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbInactiveActionPerformed

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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
//        if(btnAdd.getText().equals("Thêm")){
//            openInput();
//        }else if(btnAdd.getText().equals("Hủy")){
//            offInput();
//            clearInput();
//            btnAdd.setText("Thêm");
//        }
    }//GEN-LAST:event_btnAddActionPerformed
// ID Khách hàng do hệ thống phát sinh

    public void openInput() {
        jtfNameCus.setEditable(true);
        jtfPhoneCus.setEditable(true);
        jtfAddressDetail.setEditable(true);
        btnAdd.setText("Hủy");
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
    private lib2.Button btnAdd;
    private lib2.Button btnClear;
    private lib2.Button btnEdit;
    private lib2.Button btnFilter;
    private lib2.Button btnHistory;
    private lib2.Button btnInfo;
    private javax.swing.ButtonGroup buttonGroup1;
    private lib2.ComboBoxSuggestion cbCommune;
    private lib2.ComboBoxSuggestion cbDistrict;
    private lib2.ComboBoxSuggestion cbProvince;
    private lib2.ComboBoxSuggestion cbStatus;
    private javax.swing.JTable jTableCus;
    private javax.swing.JCheckBox jcReceivePromotion;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlAddressDetail;
    private javax.swing.JLabel jlFilterPhone;
    private javax.swing.JLabel jlFilterStatus;
    private javax.swing.JLabel jlIDCus;
    private javax.swing.JLabel jlNameCus;
    private javax.swing.JLabel jlPhoneCus;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JPanel jpBottom;
    private javax.swing.JPanel jpFunction;
    private javax.swing.JPanel jpFunctionTable;
    private javax.swing.JPanel jpSelect;
    private javax.swing.JPanel jpTable;
    private javax.swing.JPanel jpTop;
    private javax.swing.JRadioButton jrbActive;
    private javax.swing.JRadioButton jrbInactive;
    private javax.swing.JScrollPane jspTableCus;
    private javax.swing.JTextField jtfAddressDetail;
    private javax.swing.JTextField jtfFilterPhone;
    private javax.swing.JTextField jtfIDCus;
    private javax.swing.JTextField jtfNameCus;
    private javax.swing.JTextField jtfPhoneCus;
    // End of variables declaration//GEN-END:variables
}
