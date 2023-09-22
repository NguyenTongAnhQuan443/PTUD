//1012, 550
// free layout
package gui;

import lib2.TableCustom;

public class Product_Detail_GUI extends javax.swing.JPanel {

    public Product_Detail_GUI() {
        initComponents();
        TableCustom.apply(jspTable, TableCustom.TableType.DEFAULT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTop = new javax.swing.JPanel();
        jtfIDProduct = new lib2.TextField();
        jtfPrice = new lib2.TextField();
        cbColor = new lib2.ComboBoxSuggestion();
        jtfNameProduct = new lib2.TextField();
        jtfNumber = new lib2.TextField();
        cbType = new lib2.ComboBoxSuggestion();
        cbMaterial = new lib2.ComboBoxSuggestion();
        cbSize = new lib2.ComboBoxSuggestion();
        jpBottom = new javax.swing.JPanel();
        jspTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new lib2.Button();
        btnDel = new lib2.Button();
        btnInputFile = new lib2.Button();
        btnEdit = new lib2.Button();
        btnSearch = new lib2.Button();
        btnOutputFile = new lib2.Button();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jpTop.setBackground(new java.awt.Color(255, 255, 255));
        jpTop.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jtfIDProduct.setEditable(false);
        jtfIDProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfIDProduct.setLabelText("Mã sản phẩm");
        jtfIDProduct.setLineColor(new java.awt.Color(204, 204, 255));
        jtfIDProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDProductActionPerformed(evt);
            }
        });

        jtfPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfPrice.setLabelText("Đơn giá");
        jtfPrice.setLineColor(new java.awt.Color(204, 204, 255));
        jtfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPriceActionPerformed(evt);
            }
        });

        cbColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Màu sắc" }));
        cbColor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfNameProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNameProduct.setLabelText("Tên sản phẩm");
        jtfNameProduct.setLineColor(new java.awt.Color(204, 204, 255));
        jtfNameProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameProductActionPerformed(evt);
            }
        });

        jtfNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNumber.setLabelText("Số lượng");
        jtfNumber.setLineColor(new java.awt.Color(204, 204, 255));
        jtfNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumberActionPerformed(evt);
            }
        });

        cbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Loại sản phẩm" }));
        cbType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbMaterial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chất liệu" }));
        cbMaterial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kích thước" }));
        cbSize.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpTopLayout = new javax.swing.GroupLayout(jpTop);
        jpTop.setLayout(jpTopLayout);
        jpTopLayout.setHorizontalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIDProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMaterial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154))
        );
        jpTopLayout.setVerticalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIDProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jpTop);

        jpBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpBottom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Loại sản phẩm", "Nhà cung cấp", "Kích thước", "Màu sắc", "Chất liệu", "Đơn giá", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspTable.setViewportView(jTable1);

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

        btnDel.setBackground(new java.awt.Color(135, 206, 235));
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete24.png"))); // NOI18N
        btnDel.setText("Xóa");
        btnDel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnInputFile.setBackground(new java.awt.Color(135, 206, 235));
        btnInputFile.setForeground(new java.awt.Color(255, 255, 255));
        btnInputFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inputfile24.png"))); // NOI18N
        btnInputFile.setText("Nhập SP từ file");
        btnInputFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInputFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputFileActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit24.png"))); // NOI18N
        btnEdit.setText("Sủa thông tin");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(135, 206, 235));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear24.png"))); // NOI18N
        btnSearch.setText("Xóa trắng");
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnOutputFile.setBackground(new java.awt.Color(135, 206, 235));
        btnOutputFile.setForeground(new java.awt.Color(255, 255, 255));
        btnOutputFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outputfile24.png"))); // NOI18N
        btnOutputFile.setText("Xuất SP ra file");
        btnOutputFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOutputFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutputFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBottomLayout = new javax.swing.GroupLayout(jpBottom);
        jpBottom.setLayout(jpBottomLayout);
        jpBottomLayout.setHorizontalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTable)
            .addGroup(jpBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(btnInputFile, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOutputFile, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpBottomLayout.setVerticalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspTable, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInputFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOutputFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        add(jpBottom);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIDProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDProductActionPerformed

    private void jtfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPriceActionPerformed

    private void jtfNameProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameProductActionPerformed

    private void jtfNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumberActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
         if (btnAdd.getText().equals("Thêm")) {
            jtfNameProduct.setEditable(true);
            jtfNumber.setEditable(true);
            jtfPrice.setEditable(true);
            btnAdd.setText("Lưu");
            btnEdit.setText("Hủy");
        } else if (btnAdd.getText().equals("Lưu")) {
            btnAdd.setText("Thêm");
            clearInput();
            offInput();
            btnEdit.setText("Sủa thông tin");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
         if (btnEdit.getText().equals("Hủy")) {
            btnAdd.setText("Thêm");
            clearInput();
            offInput();
            btnEdit.setText("Sủa thông tin");
        } else if (btnEdit.getText().equals("Hủy")) {

        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        clearInput();
        cbColor.setSelectedIndex(0);
        cbMaterial.setSelectedIndex(0);
        cbSize.setSelectedIndex(0);
        cbType.setSelectedIndex(0);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnInputFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInputFileActionPerformed

    private void btnOutputFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutputFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOutputFileActionPerformed

public void clearInput() {
        jtfIDProduct.setText("");
        jtfNameProduct.setText("");
        jtfNumber.setText("");
        jtfPrice.setText("");
    }

    public void onInput() {
        jtfNameProduct.setEditable(true);
        jtfNumber.setEditable(true);
        jtfPrice.setEditable(true);
    }

    public void offInput() {
        jtfNameProduct.setEditable(false);
        jtfNumber.setEditable(false);
        jtfPrice.setEditable(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnAdd;
    private lib2.Button btnDel;
    private lib2.Button btnEdit;
    private lib2.Button btnInputFile;
    private lib2.Button btnOutputFile;
    private lib2.Button btnSearch;
    private lib2.ComboBoxSuggestion cbColor;
    private lib2.ComboBoxSuggestion cbMaterial;
    private lib2.ComboBoxSuggestion cbSize;
    private lib2.ComboBoxSuggestion cbType;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpBottom;
    private javax.swing.JPanel jpTop;
    private javax.swing.JScrollPane jspTable;
    private lib2.TextField jtfIDProduct;
    private lib2.TextField jtfNameProduct;
    private lib2.TextField jtfNumber;
    private lib2.TextField jtfPrice;
    // End of variables declaration//GEN-END:variables
}
