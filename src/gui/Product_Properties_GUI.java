//1012, 550
package gui;

import lib2.TableCustom;

public class Product_Properties_GUI extends javax.swing.JPanel {

    public Product_Properties_GUI() {
        initComponents();
        TableCustom.apply(jspTable, TableCustom.TableType.DEFAULT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jpTop = new javax.swing.JPanel();
        jpTopLeft = new javax.swing.JPanel();
        jrbType = new javax.swing.JRadioButton();
        jrbColor = new javax.swing.JRadioButton();
        jrbSize = new javax.swing.JRadioButton();
        jrbMaterial = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jpTopRight = new javax.swing.JPanel();
        jtfNameType = new lib2.TextField();
        btnAdd = new lib2.Button();
        btnEdit = new lib2.Button();
        jpBottom = new javax.swing.JPanel();
        jspTable = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        buttonGroup.add(jrbColor);
        buttonGroup.add(jrbMaterial);
        buttonGroup.add(jrbSize);
        buttonGroup.add(jrbType);
        jrbType.setSelected(true);

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jpTop.setBackground(new java.awt.Color(255, 255, 255));
        jpTop.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thuộc tính sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jpTop.setLayout(new javax.swing.BoxLayout(jpTop, javax.swing.BoxLayout.X_AXIS));

        jpTopLeft.setBackground(new java.awt.Color(255, 255, 255));
        jpTopLeft.setBorder(javax.swing.BorderFactory.createTitledBorder("Hãy chọn loại thuộc tính"));

        jrbType.setBackground(new java.awt.Color(255, 255, 255));
        jrbType.setText("Loại sản phẩm");
        jrbType.setToolTipText("Quấn, Áo, Váy, Nón, Phụ kiện ...");
        jrbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTypeActionPerformed(evt);
            }
        });

        jrbColor.setBackground(new java.awt.Color(255, 255, 255));
        jrbColor.setText("Màu sắc");
        jrbColor.setToolTipText("Vàng, Xanh, Đỏ ...");

        jrbSize.setBackground(new java.awt.Color(255, 255, 255));
        jrbSize.setText("Kích thước");
        jrbSize.setToolTipText("S, M, L, XL, 2XL, 3XL ...");
        jrbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSizeActionPerformed(evt);
            }
        });

        jrbMaterial.setBackground(new java.awt.Color(255, 255, 255));
        jrbMaterial.setText("Chất liệu");
        jrbMaterial.setToolTipText("Cotton, Kaki, Jean ...");

        jLabel1.setText("(Hãy chọn loại thuộc tính trước khi nhập tên thuộc tính)");

        javax.swing.GroupLayout jpTopLeftLayout = new javax.swing.GroupLayout(jpTopLeft);
        jpTopLeft.setLayout(jpTopLeftLayout);
        jpTopLeftLayout.setHorizontalGroup(
            jpTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLeftLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jpTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jpTopLeftLayout.createSequentialGroup()
                        .addComponent(jrbType)
                        .addGap(18, 18, 18)
                        .addComponent(jrbSize)
                        .addGap(18, 18, 18)
                        .addComponent(jrbColor)
                        .addGap(18, 18, 18)
                        .addComponent(jrbMaterial)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jpTopLeftLayout.setVerticalGroup(
            jpTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLeftLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jpTopLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMaterial)
                    .addComponent(jrbColor)
                    .addComponent(jrbSize)
                    .addComponent(jrbType))
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jpTop.add(jpTopLeft);

        jpTopRight.setBackground(new java.awt.Color(255, 255, 255));
        jpTopRight.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhập tên thuộc tính"));

        jtfNameType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNameType.setLabelText("Hãy nhập tên thuộc tính");
        jtfNameType.setLineColor(new java.awt.Color(204, 204, 255));
        jtfNameType.setSelectionColor(new java.awt.Color(204, 204, 255));

        btnAdd.setBackground(new java.awt.Color(135, 206, 235));
        btnAdd.setBorder(null);
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add24.png"))); // NOI18N
        btnAdd.setText("Thêm thuộc tính");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setBorder(null);
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit24.png"))); // NOI18N
        btnEdit.setText("Sửa thuộc tính");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTopRightLayout = new javax.swing.GroupLayout(jpTopRight);
        jpTopRight.setLayout(jpTopRightLayout);
        jpTopRightLayout.setHorizontalGroup(
            jpTopRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTopRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNameType, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpTopRightLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jpTopRightLayout.setVerticalGroup(
            jpTopRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopRightLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jtfNameType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTopRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jpTop.add(jpTopRight);

        add(jpTop);

        jpBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpBottom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin thuộc tính", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Loại thuộc tính", "Tên thuộc tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspTable.setViewportView(jTable);

        javax.swing.GroupLayout jpBottomLayout = new javax.swing.GroupLayout(jpBottom);
        jpBottom.setLayout(jpBottomLayout);
        jpBottomLayout.setHorizontalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspTable, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpBottomLayout.setVerticalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTable, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        add(jpBottom);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void jrbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbTypeActionPerformed

    private void jrbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnAdd;
    private lib2.Button btnEdit;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jTable;
    private javax.swing.JPanel jpBottom;
    private javax.swing.JPanel jpTop;
    private javax.swing.JPanel jpTopLeft;
    private javax.swing.JPanel jpTopRight;
    private javax.swing.JRadioButton jrbColor;
    private javax.swing.JRadioButton jrbMaterial;
    private javax.swing.JRadioButton jrbSize;
    private javax.swing.JRadioButton jrbType;
    private javax.swing.JScrollPane jspTable;
    private lib2.TextField jtfNameType;
    // End of variables declaration//GEN-END:variables
}
