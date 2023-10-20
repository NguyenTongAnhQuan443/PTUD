// jpTMP 1120, 439
package gui;

public class Staff_GUI extends javax.swing.JPanel {

    private Staff_Table_GUI staff_Table_GUI;
    private Staff_InfoStaff_GUI staff_InfoStaff_GUI;

    public Staff_GUI() {
        initComponents();

        staff_Table_GUI = new Staff_Table_GUI();
        jpTMP.removeAll();
        jpTMP.add(staff_Table_GUI);
        jpTMP.revalidate();
        jpTMP.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTop = new javax.swing.JPanel();
        jpTop1 = new javax.swing.JPanel();
        jpTop1Left = new javax.swing.JPanel();
        jlSearch = new javax.swing.JLabel();
        jtfInputID = new javax.swing.JTextField();
        btnSearch = new lib2.Button();
        jpTop1Right = new javax.swing.JPanel();
        jlArrage = new javax.swing.JLabel();
        cbArrange = new lib2.ComboBoxSuggestion();
        btnArrange = new lib2.Button();
        jpTopBottom = new javax.swing.JPanel();
        btnAdd = new lib2.Button();
        btnEdit = new lib2.Button();
        btnDismissal = new lib2.Button();
        btnReload = new lib2.Button();
        btnInputFile = new lib2.Button();
        btnOutputFile = new lib2.Button();
        jpTMP = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jpTop.setBackground(new java.awt.Color(255, 255, 255));
        jpTop.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jpTop.setLayout(new java.awt.GridLayout(2, 0));

        jpTop1.setBackground(new java.awt.Color(255, 255, 255));
        jpTop1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        jpTop1.setLayout(new java.awt.GridLayout(1, 0));

        jpTop1Left.setBackground(new java.awt.Color(255, 255, 255));

        jlSearch.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlSearch.setText("Tìm nhân viên :");

        jtfInputID.setText("Nhập mã nhân viên");

        btnSearch.setBackground(new java.awt.Color(135, 206, 235));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search24.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.setToolTipText("");
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jpTop1LeftLayout = new javax.swing.GroupLayout(jpTop1Left);
        jpTop1Left.setLayout(jpTop1LeftLayout);
        jpTop1LeftLayout.setHorizontalGroup(
            jpTop1LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTop1LeftLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlSearch)
                .addGap(18, 18, 18)
                .addComponent(jtfInputID, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jpTop1LeftLayout.setVerticalGroup(
            jpTop1LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTop1LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTop1LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfInputID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpTop1.add(jpTop1Left);

        jpTop1Right.setBackground(new java.awt.Color(255, 255, 255));

        jlArrage.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlArrage.setText("Sắp xếp theo :");

        cbArrange.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mã nhân viên", "Họ tên", "Doanh thu cao nhất", "Doanh thu thấp nhất" }));

        btnArrange.setBackground(new java.awt.Color(135, 206, 235));
        btnArrange.setForeground(new java.awt.Color(255, 255, 255));
        btnArrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/arrange24.png"))); // NOI18N
        btnArrange.setText("Sắp xếp");
        btnArrange.setToolTipText("");
        btnArrange.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jpTop1RightLayout = new javax.swing.GroupLayout(jpTop1Right);
        jpTop1Right.setLayout(jpTop1RightLayout);
        jpTop1RightLayout.setHorizontalGroup(
            jpTop1RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTop1RightLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlArrage)
                .addGap(18, 18, 18)
                .addComponent(cbArrange, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnArrange, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jpTop1RightLayout.setVerticalGroup(
            jpTop1RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTop1RightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTop1RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTop1RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbArrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlArrage))
                    .addComponent(btnArrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpTop1.add(jpTop1Right);

        jpTop.add(jpTop1);

        jpTopBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpTopBottom.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));
        jpTopBottom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 15));

        btnAdd.setBackground(new java.awt.Color(135, 206, 235));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add24.png"))); // NOI18N
        btnAdd.setText("Thêm NV ");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jpTopBottom.add(btnAdd);

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit24.png"))); // NOI18N
        btnEdit.setText("Sủa thông tin NV ");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jpTopBottom.add(btnEdit);

        btnDismissal.setBackground(new java.awt.Color(135, 206, 235));
        btnDismissal.setForeground(new java.awt.Color(255, 255, 255));
        btnDismissal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/warning24.png"))); // NOI18N
        btnDismissal.setText("Danh sách thôi việc  ");
        btnDismissal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDismissal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDismissalActionPerformed(evt);
            }
        });
        jpTopBottom.add(btnDismissal);

        btnReload.setBackground(new java.awt.Color(135, 206, 235));
        btnReload.setForeground(new java.awt.Color(255, 255, 255));
        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/refresh24.png"))); // NOI18N
        btnReload.setText("Làm mới");
        btnReload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        jpTopBottom.add(btnReload);

        btnInputFile.setBackground(new java.awt.Color(135, 206, 235));
        btnInputFile.setForeground(new java.awt.Color(255, 255, 255));
        btnInputFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/inputfile24.png"))); // NOI18N
        btnInputFile.setText("Nhập danh sách NV ");
        btnInputFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jpTopBottom.add(btnInputFile);

        btnOutputFile.setBackground(new java.awt.Color(135, 206, 235));
        btnOutputFile.setForeground(new java.awt.Color(255, 255, 255));
        btnOutputFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/outputfile24.png"))); // NOI18N
        btnOutputFile.setText("Xuất danh sách NV ");
        btnOutputFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jpTopBottom.add(btnOutputFile);

        jpTop.add(jpTopBottom);

        add(jpTop);

        jpTMP.setBackground(new java.awt.Color(255, 255, 255));
        jpTMP.setLayout(new java.awt.GridLayout(1, 0));
        add(jpTMP);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        staff_InfoStaff_GUI = new Staff_InfoStaff_GUI();
        staff_InfoStaff_GUI.setVisible(true);
        staff_InfoStaff_GUI.setFlag(1);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Staff_InfoStaff_GUI staff_AddStaff_GUI = new Staff_InfoStaff_GUI();
        staff_AddStaff_GUI.setVisible(true);
        staff_AddStaff_GUI.setFlag(2);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDismissalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDismissalActionPerformed
//     hiển thị danh sách thôi việc lên table
    }//GEN-LAST:event_btnDismissalActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
//        staff_InfoStaff_GUI = new Staff_InfoStaff_GUI();
//        staff_InfoStaff_GUI.setVisible(true);
//        staff_InfoStaff_GUI.setFlag(3);
    }//GEN-LAST:event_btnReloadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnAdd;
    private lib2.Button btnArrange;
    private lib2.Button btnDismissal;
    private lib2.Button btnEdit;
    private lib2.Button btnInputFile;
    private lib2.Button btnOutputFile;
    private lib2.Button btnReload;
    private lib2.Button btnSearch;
    private lib2.ComboBoxSuggestion cbArrange;
    private javax.swing.JLabel jlArrage;
    private javax.swing.JLabel jlSearch;
    private javax.swing.JPanel jpTMP;
    private javax.swing.JPanel jpTop;
    private javax.swing.JPanel jpTop1;
    private javax.swing.JPanel jpTop1Left;
    private javax.swing.JPanel jpTop1Right;
    private javax.swing.JPanel jpTopBottom;
    private javax.swing.JTextField jtfInputID;
    // End of variables declaration//GEN-END:variables

}
