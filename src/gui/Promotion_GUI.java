package gui;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import lib2.TableCustom;

public class Promotion_GUI extends javax.swing.JPanel {
    private DefaultTableModel defaultTableModelListPromotion;
    private DefaultTableModel defaultTableModel1ListProduct;

    public Promotion_GUI() {
        initComponents();
        
        TableCustom.apply(jspListPromotion, TableCustom.TableType.DEFAULT);
        defaultTableModelListPromotion = (DefaultTableModel) jTableListPromotion.getModel();
        ListSelectionModel selectionModel_1 = jTableListPromotion.getSelectionModel();
        selectionModel_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        TableCustom.apply(jspListProduct, TableCustom.TableType.DEFAULT);
        defaultTableModel1ListProduct = (DefaultTableModel) jTableListProduct.getModel();
        ListSelectionModel selectionModel_2 = jTableListProduct.getSelectionModel();
        selectionModel_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpRight = new javax.swing.JPanel();
        jlTypePromotion = new javax.swing.JLabel();
        cbTypePromotion = new lib2.ComboBoxSuggestion();
        jlIDPromotion = new javax.swing.JLabel();
        jtfIDPromotion = new javax.swing.JTextField();
        jlNamePromotion = new javax.swing.JLabel();
        jtfNamePromotion = new javax.swing.JTextField();
        jlStartPromotion = new javax.swing.JLabel();
        jtfStartPromotion = new javax.swing.JTextField();
        jlEndPromotion = new javax.swing.JLabel();
        jtfEndPromotion = new javax.swing.JTextField();
        jlLimitPromotion = new javax.swing.JLabel();
        jtfLimitPromotion = new javax.swing.JTextField();
        jlPriceRangeStart = new javax.swing.JLabel();
        jtfPriceRangeStart = new javax.swing.JTextField();
        jtfPriceRangeEnd = new javax.swing.JTextField();
        jlPriceRangeEnd = new javax.swing.JLabel();
        jlDescribe = new javax.swing.JLabel();
        jspDescribe = new javax.swing.JScrollPane();
        jtaDescribe = new javax.swing.JTextArea();
        jPListPromotion = new javax.swing.JPanel();
        jspListPromotion = new javax.swing.JScrollPane();
        jTableListPromotion = new javax.swing.JTable();
        btnSendprodmotion = new lib2.Button();
        hPListProductPromotion = new javax.swing.JPanel();
        jspListProduct = new javax.swing.JScrollPane();
        jTableListProduct = new javax.swing.JTable();
        jlTypeApply = new javax.swing.JLabel();
        cbTypeApply = new lib2.ComboBoxSuggestion();
        checkboxSelectAll = new java.awt.Checkbox();

        jpRight.setBackground(new java.awt.Color(255, 255, 255));
        jpRight.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jlTypePromotion.setText("Hình thức :");

        cbTypePromotion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Giảm theo %", "Theo khoảng giá" }));
        cbTypePromotion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTypePromotionItemStateChanged(evt);
            }
        });
        cbTypePromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypePromotionActionPerformed(evt);
            }
        });

        jlIDPromotion.setText("Mã khuyễn mãi :");

        jlNamePromotion.setText("Tên chương trình :");

        jlStartPromotion.setText("Thời gian bắt đầu :");

        jlEndPromotion.setText("Thời gian kết thúc :");

        jlLimitPromotion.setText("Mức giảm giá : ");

        jlPriceRangeStart.setText("Khoản giá từ :");

        jtfPriceRangeStart.setEditable(false);

        jtfPriceRangeEnd.setEditable(false);

        jlPriceRangeEnd.setText("Đến :");

        jlDescribe.setText("Mô tả :");

        jtaDescribe.setColumns(20);
        jtaDescribe.setRows(5);
        jspDescribe.setViewportView(jtaDescribe);

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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlIDPromotion)
                        .addGap(18, 18, 18)
                        .addComponent(jtfIDPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRightLayout.createSequentialGroup()
                        .addComponent(jlDescribe)
                        .addGap(18, 18, 18)
                        .addComponent(jspDescribe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlStartPromotion)
                            .addComponent(jlEndPromotion)
                            .addComponent(jlNamePromotion)
                            .addComponent(jlLimitPromotion)
                            .addComponent(jlPriceRangeStart)
                            .addComponent(jlPriceRangeEnd))
                        .addGap(18, 18, 18)
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPriceRangeEnd)
                            .addComponent(jtfPriceRangeStart)
                            .addComponent(jtfLimitPromotion)
                            .addComponent(jtfNamePromotion)
                            .addComponent(jtfEndPromotion)
                            .addComponent(jtfStartPromotion))))
                .addContainerGap())
        );
        jpRightLayout.setVerticalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTypePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTypePromotion))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIDPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIDPromotion))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNamePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNamePromotion))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfStartPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlStartPromotion))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEndPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEndPromotion))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLimitPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLimitPromotion))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPriceRangeStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPriceRangeStart))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPriceRangeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPriceRangeEnd))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspDescribe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jlDescribe)))
                .addContainerGap(325, Short.MAX_VALUE))
        );

        jPListPromotion.setBackground(new java.awt.Color(255, 255, 255));
        jPListPromotion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jTableListPromotion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KM", "Tên KM", "Hình thức", "Mức giảm giá", "Khoảng giá áp dụng", "Ngày bắt đầu", "Ngày kết thúc", "Trạng thái", "Mô tả"
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

        btnSendprodmotion.setBackground(new java.awt.Color(135, 206, 235));
        btnSendprodmotion.setForeground(new java.awt.Color(255, 255, 255));
        btnSendprodmotion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/save24.png"))); // NOI18N
        btnSendprodmotion.setText("Gửi thông tin khuyến mãi");
        btnSendprodmotion.setToolTipText("Hệ thống sẽ gửi thông tin các chương trình khuyến mãi hiện có đến khách hàng qua Email");
        btnSendprodmotion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPListPromotionLayout = new javax.swing.GroupLayout(jPListPromotion);
        jPListPromotion.setLayout(jPListPromotionLayout);
        jPListPromotionLayout.setHorizontalGroup(
            jPListPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPListPromotionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSendprodmotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jspListPromotion)
        );
        jPListPromotionLayout.setVerticalGroup(
            jPListPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListPromotionLayout.createSequentialGroup()
                .addComponent(jspListPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSendprodmotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        hPListProductPromotion.setBackground(new java.awt.Color(255, 255, 255));
        hPListProductPromotion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jTableListProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Kích thước", "Màu sắc", "Chất liệu", "Đơn giá", "Trạng thái"
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

        javax.swing.GroupLayout hPListProductPromotionLayout = new javax.swing.GroupLayout(hPListProductPromotion);
        hPListProductPromotion.setLayout(hPListProductPromotionLayout);
        hPListProductPromotionLayout.setHorizontalGroup(
            hPListProductPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
            .addGroup(hPListProductPromotionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTypeApply)
                .addGap(18, 18, 18)
                .addComponent(cbTypeApply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkboxSelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        hPListProductPromotionLayout.setVerticalGroup(
            hPListProductPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hPListProductPromotionLayout.createSequentialGroup()
                .addGroup(hPListProductPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hPListProductPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlTypeApply)
                        .addComponent(cbTypeApply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkboxSelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspListProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hPListProductPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPListPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPListPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hPListProductPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbTypePromotionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTypePromotionItemStateChanged

//        if (cbTypePromotion.getSelectedIndex() == 0) {
//            offInput();
//        } else if (cbTypePromotion.getSelectedIndex() == 1) {
//            onInput();
//        }
    }//GEN-LAST:event_cbTypePromotionItemStateChanged

    private void cbTypePromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypePromotionActionPerformed

    }//GEN-LAST:event_cbTypePromotionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnSendprodmotion;
    private lib2.ComboBoxSuggestion cbTypeApply;
    private lib2.ComboBoxSuggestion cbTypePromotion;
    private java.awt.Checkbox checkboxSelectAll;
    private javax.swing.JPanel hPListProductPromotion;
    private javax.swing.JPanel jPListPromotion;
    private javax.swing.JTable jTableListProduct;
    private javax.swing.JTable jTableListPromotion;
    private javax.swing.JLabel jlDescribe;
    private javax.swing.JLabel jlEndPromotion;
    private javax.swing.JLabel jlIDPromotion;
    private javax.swing.JLabel jlLimitPromotion;
    private javax.swing.JLabel jlNamePromotion;
    private javax.swing.JLabel jlPriceRangeEnd;
    private javax.swing.JLabel jlPriceRangeStart;
    private javax.swing.JLabel jlStartPromotion;
    private javax.swing.JLabel jlTypeApply;
    private javax.swing.JLabel jlTypePromotion;
    private javax.swing.JPanel jpRight;
    private javax.swing.JScrollPane jspDescribe;
    private javax.swing.JScrollPane jspListProduct;
    private javax.swing.JScrollPane jspListPromotion;
    private javax.swing.JTextArea jtaDescribe;
    private javax.swing.JTextField jtfEndPromotion;
    private javax.swing.JTextField jtfIDPromotion;
    private javax.swing.JTextField jtfLimitPromotion;
    private javax.swing.JTextField jtfNamePromotion;
    private javax.swing.JTextField jtfPriceRangeEnd;
    private javax.swing.JTextField jtfPriceRangeStart;
    private javax.swing.JTextField jtfStartPromotion;
    // End of variables declaration//GEN-END:variables
}
