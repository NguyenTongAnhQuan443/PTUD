// 1013, 579
//Left 763, 582
//Right 250, 582
package gui;

import lib2.TableCustom;

public class Promotion_GUI extends javax.swing.JPanel {

    public Promotion_GUI() {
        initComponents();
        TableCustom.apply(jspListProduct, TableCustom.TableType.DEFAULT);
        TableCustom.apply(jspListPromotion, TableCustom.TableType.DEFAULT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLeft = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jspListProduct = new javax.swing.JScrollPane();
        jTableListProduct = new javax.swing.JTable();
        jlTypeApply = new javax.swing.JLabel();
        cbTypeApply = new lib2.ComboBoxSuggestion();
        checkboxSelectAll = new java.awt.Checkbox();
        jPanel2 = new javax.swing.JPanel();
        jspListPromotion = new javax.swing.JScrollPane();
        jTableListPromotion = new javax.swing.JTable();
        jpRight = new javax.swing.JPanel();
        jlIDPromotion = new javax.swing.JLabel();
        jlNamePromotion = new javax.swing.JLabel();
        jlStartPromotion = new javax.swing.JLabel();
        jlEndPromotion = new javax.swing.JLabel();
        jtfEndPromotion = new javax.swing.JTextField();
        jtfStartPromotion = new javax.swing.JTextField();
        jtfNamePromotion = new javax.swing.JTextField();
        jtfIDPromotion = new javax.swing.JTextField();
        jlTypePromotion = new javax.swing.JLabel();
        cbTypePromotion = new lib2.ComboBoxSuggestion();
        jlLimitPromotion = new javax.swing.JLabel();
        jtfLimitPromotion = new javax.swing.JTextField();
        jlPriceRangeStart = new javax.swing.JLabel();
        jtfPriceRangeEnd = new javax.swing.JTextField();
        jpPricerangeEnd = new javax.swing.JTextField();
        jlPriceRangeEnd = new javax.swing.JLabel();
        jlDetails = new javax.swing.JLabel();
        jtfDetails = new javax.swing.JTextField();
        btnEdit = new lib2.Button();
        btnRefresh = new lib2.Button();
        btnSave = new lib2.Button();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jpLeft.setBackground(new java.awt.Color(255, 255, 255));
        jpLeft.setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jTableListProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã sản phẩm", "Tên sản phẩm", "Kích thước", "Màu sắc", "Chất liệu", "Đơn giá", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspListProduct.setViewportView(jTableListProduct);

        jlTypeApply.setText("Áp dụng cho :");

        checkboxSelectAll.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        checkboxSelectAll.setLabel("Tất cả sản phẩm");
        checkboxSelectAll.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListProduct)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jlTypeApply)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTypeApply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(checkboxSelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlTypeApply)
                        .addComponent(cbTypeApply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkboxSelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspListProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpLeft.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jTableListPromotion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KM", "Tên chương trình", "Hình thức", "Giá giảm", "Sản phẩm", "Ngày bắt đầu", "Ngày kết thúc", "Trạng thái", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspListPromotion.setViewportView(jTableListPromotion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        jpLeft.add(jPanel2);

        add(jpLeft);

        jpRight.setBackground(new java.awt.Color(255, 255, 255));
        jpRight.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chương trính khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jlIDPromotion.setText("Mã khuyễn mãi :");

        jlNamePromotion.setText("Tên chương trình :");

        jlStartPromotion.setText("Thời gian bắt đầu :");

        jlEndPromotion.setText("Thời gian kết thúc :");

        jlTypePromotion.setText("Hình thức :");

        cbTypePromotion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Giảm theo %", "Giảm theo số tiền", "Giảm theo khoảng giá" }));

        jlLimitPromotion.setText("Mức giảm giá :       ");

        jlPriceRangeStart.setText("Khoản giá từ :");

        jlPriceRangeEnd.setText("Đến");

        jlDetails.setText("Mô tả :");

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit24.png"))); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnRefresh.setBackground(new java.awt.Color(135, 206, 235));
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh24.png"))); // NOI18N
        btnRefresh.setText("  Làm mới  ");
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnSave.setBackground(new java.awt.Color(135, 206, 235));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save24.png"))); // NOI18N
        btnSave.setText("    Lưu    ");
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jpRightLayout = new javax.swing.GroupLayout(jpRight);
        jpRight.setLayout(jpRightLayout);
        jpRightLayout.setHorizontalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addComponent(jlTypePromotion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTypePromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlEndPromotion)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlStartPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlNamePromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlIDPromotion, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jlLimitPromotion)
                            .addComponent(jlPriceRangeStart)
                            .addComponent(jlPriceRangeEnd)
                            .addComponent(jlDetails))
                        .addGap(18, 18, 18)
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDetails)
                            .addComponent(jpPricerangeEnd)
                            .addComponent(jtfLimitPromotion)
                            .addComponent(jtfStartPromotion)
                            .addComponent(jtfNamePromotion)
                            .addComponent(jtfIDPromotion)
                            .addComponent(jtfEndPromotion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfPriceRangeEnd)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRightLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpRightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpRightLayout.setVerticalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTypePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTypePromotion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDPromotion)
                    .addComponent(jtfIDPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNamePromotion)
                    .addComponent(jtfNamePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlStartPromotion)
                    .addComponent(jtfStartPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEndPromotion)
                    .addComponent(jtfEndPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLimitPromotion)
                    .addComponent(jtfLimitPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPriceRangeStart)
                    .addComponent(jtfPriceRangeEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpPricerangeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPriceRangeEnd))
                .addGap(22, 22, 22)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDetails)
                    .addComponent(jtfDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRightLayout.createSequentialGroup()
                    .addContainerGap(529, Short.MAX_VALUE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );

        add(jpRight);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnEdit;
    private lib2.Button btnRefresh;
    private lib2.Button btnSave;
    private lib2.ComboBoxSuggestion cbTypeApply;
    private lib2.ComboBoxSuggestion cbTypePromotion;
    private java.awt.Checkbox checkboxSelectAll;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable jTableListProduct;
    private javax.swing.JTable jTableListPromotion;
    private javax.swing.JLabel jlDetails;
    private javax.swing.JLabel jlEndPromotion;
    private javax.swing.JLabel jlIDPromotion;
    private javax.swing.JLabel jlLimitPromotion;
    private javax.swing.JLabel jlNamePromotion;
    private javax.swing.JLabel jlPriceRangeEnd;
    private javax.swing.JLabel jlPriceRangeStart;
    private javax.swing.JLabel jlStartPromotion;
    private javax.swing.JLabel jlTypeApply;
    private javax.swing.JLabel jlTypePromotion;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JTextField jpPricerangeEnd;
    private javax.swing.JPanel jpRight;
    private javax.swing.JScrollPane jspListProduct;
    private javax.swing.JScrollPane jspListPromotion;
    private javax.swing.JTextField jtfDetails;
    private javax.swing.JTextField jtfEndPromotion;
    private javax.swing.JTextField jtfIDPromotion;
    private javax.swing.JTextField jtfLimitPromotion;
    private javax.swing.JTextField jtfNamePromotion;
    private javax.swing.JTextField jtfPriceRangeEnd;
    private javax.swing.JTextField jtfStartPromotion;
    // End of variables declaration//GEN-END:variables
}
