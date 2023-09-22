package gui;

import lib2.TableCustom;

public class Supplier_GUI extends javax.swing.JPanel {

    public Supplier_GUI() {
        initComponents();
        TableCustom.apply(jspTableSupplier, TableCustom.TableType.DEFAULT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpTop = new javax.swing.JPanel();
        jlIDSupplier = new javax.swing.JLabel();
        jtfIDSupplier = new javax.swing.JTextField();
        jlNameSupplier = new javax.swing.JLabel();
        jtfNameSupplier = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jlAddress = new javax.swing.JLabel();
        cbProvince = new lib2.ComboBoxSuggestion();
        cbDistrict = new lib2.ComboBoxSuggestion();
        cbCommune = new lib2.ComboBoxSuggestion();
        jlAddressDetails = new javax.swing.JLabel();
        jtfAddressDetails = new javax.swing.JTextField();
        btnEdit = new lib2.Button();
        jlStatus = new javax.swing.JLabel();
        jrbStopWorking = new javax.swing.JRadioButton();
        jrbStillWorking = new javax.swing.JRadioButton();
        btnAdd = new lib2.Button();
        jpBottom = new javax.swing.JPanel();
        jspTableSupplier = new javax.swing.JScrollPane();
        jTableSupplier = new javax.swing.JTable();
        jlSearchIDSupplier = new javax.swing.JLabel();
        jtfSearchIDSupplier = new javax.swing.JTextField();
        btnSearch = new lib2.Button();
        jlFillterStatus = new javax.swing.JLabel();
        cbStatus = new lib2.ComboBoxSuggestion();

        buttonGroup1.add(jrbStillWorking);
        buttonGroup1.add(jrbStopWorking);
        jrbStillWorking.setSelected(true);

        setBackground(new java.awt.Color(255, 255, 255));

        jpTop.setBackground(new java.awt.Color(255, 255, 255));
        jpTop.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lọc nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jlIDSupplier.setText("Mã nhà cung cấp :");

        jtfIDSupplier.setEditable(false);

        jlNameSupplier.setText("Tên nhà cung cấp :");

        jtfNameSupplier.setEditable(false);

        jlEmail.setText("Email :");

        jtfEmail.setEditable(false);

        jlAddress.setText("Địa chỉ :");

        cbProvince.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tỉnh/Thành phố" }));

        cbDistrict.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quận/Huyện" }));

        cbCommune.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Phường/Xã" }));

        jlAddressDetails.setText("Địa chỉ cụ thể :");

        jtfAddressDetails.setEditable(false);

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit24.png"))); // NOI18N
        btnEdit.setText("Cập nhập  ");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jlStatus.setText("Tình trạng hợp tác :");

        jrbStopWorking.setBackground(new java.awt.Color(255, 255, 255));
        jrbStopWorking.setText("Hết hợp đồng");

        jrbStillWorking.setBackground(new java.awt.Color(255, 255, 255));
        jrbStillWorking.setText("Còn hợp đồng");

        btnAdd.setBackground(new java.awt.Color(135, 206, 235));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add24.png"))); // NOI18N
        btnAdd.setText("Thêm nhà cung cấp  ");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTopLayout = new javax.swing.GroupLayout(jpTop);
        jpTop.setLayout(jpTopLayout);
        jpTopLayout.setHorizontalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlNameSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlIDSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNameSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jtfEmail)
                            .addComponent(jtfIDSupplier))
                        .addGap(57, 57, 57)
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpTopLayout.createSequentialGroup()
                                .addComponent(jlStatus)
                                .addGap(18, 18, 18)
                                .addComponent(jrbStillWorking)
                                .addGap(18, 18, 18)
                                .addComponent(jrbStopWorking))
                            .addGroup(jpTopLayout.createSequentialGroup()
                                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlAddressDetails)
                                    .addComponent(jlAddress))
                                .addGap(42, 42, 42)
                                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpTopLayout.createSequentialGroup()
                                        .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfAddressDetails)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpTopLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpTopLayout.setVerticalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDSupplier)
                    .addComponent(jtfIDSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAddress)
                    .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNameSupplier)
                    .addComponent(jtfNameSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAddressDetails)
                    .addComponent(jtfAddressDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEmail)
                    .addComponent(jlStatus)
                    .addComponent(jrbStillWorking)
                    .addComponent(jrbStopWorking))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jpBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpBottom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTableSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã nhà cung cấp", "Tên nhà cung cấp", "Email", "Địa chỉ", "Trạng thái hợp đồng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspTableSupplier.setViewportView(jTableSupplier);

        jlSearchIDSupplier.setText("Mã nhà cung cấp :");

        btnSearch.setBackground(new java.awt.Color(135, 206, 235));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search24.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm  ");
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jlFillterStatus.setText("Lọc theo trạng thái :");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Còn hợp đồng", "Hết hợp đồng" }));

        javax.swing.GroupLayout jpBottomLayout = new javax.swing.GroupLayout(jpBottom);
        jpBottom.setLayout(jpBottomLayout);
        jpBottomLayout.setHorizontalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTableSupplier)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlSearchIDSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfSearchIDSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlFillterStatus)
                .addGap(18, 18, 18)
                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpBottomLayout.setVerticalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jspTableSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfSearchIDSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlSearchIDSupplier)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlFillterStatus)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (btnEdit.getText().equals("Hủy  ")) {
            clearinput();
            offInput();
            btnEdit.setText("Cập nhập  ");
            btnAdd.setText("Thêm nhà cung cấp  ");
        } else if (btnEdit.getText().equals("Cập nhập  ")) {

        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if (btnAdd.getText().equals("Thêm nhà cung cấp  ")) {
            onInput();
            setIndexCB();
            btnAdd.setText("Lưu  ");
            btnEdit.setText("Hủy  ");
        } else if (btnAdd.getText().equals("Lưu  ")) {
            clearinput();
            offInput();
            btnEdit.setText("Cập nhập  ");
            btnAdd.setText("Thêm nhà cung cấp  ");
        }
    }//GEN-LAST:event_btnAddActionPerformed
    public void onInput() {
        jtfAddressDetails.setEditable(true);
        jtfEmail.setEditable(true);
        jtfNameSupplier.setEditable(true);
    }

    public void offInput() {
        jtfAddressDetails.setEditable(false);
        jtfEmail.setEditable(false);
        jtfIDSupplier.setEditable(false);
        jtfNameSupplier.setEditable(false);
    }

    public void setIndexCB() {
        cbCommune.setSelectedIndex(0);
        cbDistrict.setSelectedIndex(0);
        cbProvince.setSelectedIndex(0);
    }

    public void clearinput() {
        jtfAddressDetails.setText("");
        jtfEmail.setText("");
        jtfIDSupplier.setText("");
        jtfNameSupplier.setText("");
        jtfSearchIDSupplier.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnAdd;
    private lib2.Button btnEdit;
    private lib2.Button btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private lib2.ComboBoxSuggestion cbCommune;
    private lib2.ComboBoxSuggestion cbDistrict;
    private lib2.ComboBoxSuggestion cbProvince;
    private lib2.ComboBoxSuggestion cbStatus;
    private javax.swing.JTable jTableSupplier;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlAddressDetails;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlFillterStatus;
    private javax.swing.JLabel jlIDSupplier;
    private javax.swing.JLabel jlNameSupplier;
    private javax.swing.JLabel jlSearchIDSupplier;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JPanel jpBottom;
    private javax.swing.JPanel jpTop;
    private javax.swing.JRadioButton jrbStillWorking;
    private javax.swing.JRadioButton jrbStopWorking;
    private javax.swing.JScrollPane jspTableSupplier;
    private javax.swing.JTextField jtfAddressDetails;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfIDSupplier;
    private javax.swing.JTextField jtfNameSupplier;
    private javax.swing.JTextField jtfSearchIDSupplier;
    // End of variables declaration//GEN-END:variables
}
