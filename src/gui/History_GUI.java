//1013, 579
// left 763 right 250
package gui;

import lib2.TableCustom;

public class History_GUI extends javax.swing.JPanel {

    public History_GUI() {
        initComponents();
        TableCustom.apply(jspListBill, TableCustom.TableType.DEFAULT);
        TableCustom.apply(jspInfoProduct, TableCustom.TableType.DEFAULT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLeft = new javax.swing.JPanel();
        jpLeftListBill = new javax.swing.JPanel();
        jspListBill = new javax.swing.JScrollPane();
        jTableListBill = new javax.swing.JTable();
        jpLeftInfoProduct = new javax.swing.JPanel();
        jspInfoProduct = new javax.swing.JScrollPane();
        jTableInfoProduct = new javax.swing.JTable();
        jpRight = new javax.swing.JPanel();
        jlNameCus = new javax.swing.JLabel();
        jlIDStaff = new javax.swing.JLabel();
        jlNameStaff = new javax.swing.JLabel();
        jlIDBill = new javax.swing.JLabel();
        jtfNameCus = new javax.swing.JTextField();
        jlPhoneCus = new javax.swing.JLabel();
        jlAddress = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jlDateCreate = new javax.swing.JLabel();
        jlStatus = new javax.swing.JLabel();
        jlReasonCancel = new javax.swing.JLabel();
        jtfIDBill = new javax.swing.JTextField();
        jtfIDStaff = new javax.swing.JTextField();
        jtfNameStaff = new javax.swing.JTextField();
        jtfPhoneCus = new javax.swing.JTextField();
        jtfAddress = new javax.swing.JTextField();
        jtfTotal = new javax.swing.JTextField();
        jtfDateCreate = new javax.swing.JTextField();
        jtfStatus = new javax.swing.JTextField();
        jspReasonCancel = new javax.swing.JScrollPane();
        jtaReasonCancel = new javax.swing.JTextArea();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jpLeft.setLayout(new java.awt.GridLayout(2, 1));

        jpLeftListBill.setBackground(new java.awt.Color(255, 255, 255));
        jpLeftListBill.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTableListBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hóa đơn", "Tên nhân viên", "Tên khách hàng", "Ngày tào", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspListBill.setViewportView(jTableListBill);

        javax.swing.GroupLayout jpLeftListBillLayout = new javax.swing.GroupLayout(jpLeftListBill);
        jpLeftListBill.setLayout(jpLeftListBillLayout);
        jpLeftListBillLayout.setHorizontalGroup(
            jpLeftListBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListBill, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );
        jpLeftListBillLayout.setVerticalGroup(
            jpLeftListBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftListBillLayout.createSequentialGroup()
                .addComponent(jspListBill, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpLeft.add(jpLeftListBill);

        jpLeftInfoProduct.setBackground(new java.awt.Color(255, 255, 255));
        jpLeftInfoProduct.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTableInfoProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Giảm giá", "Thành tiền", "Trạng thái", "Lý do hủy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspInfoProduct.setViewportView(jTableInfoProduct);

        javax.swing.GroupLayout jpLeftInfoProductLayout = new javax.swing.GroupLayout(jpLeftInfoProduct);
        jpLeftInfoProduct.setLayout(jpLeftInfoProductLayout);
        jpLeftInfoProductLayout.setHorizontalGroup(
            jpLeftInfoProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspInfoProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );
        jpLeftInfoProductLayout.setVerticalGroup(
            jpLeftInfoProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftInfoProductLayout.createSequentialGroup()
                .addComponent(jspInfoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpLeft.add(jpLeftInfoProduct);

        add(jpLeft);

        jpRight.setBackground(new java.awt.Color(255, 255, 255));
        jpRight.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jlNameCus.setText("Tên khách hàng :");

        jlIDStaff.setText("Mã nhân viên :");

        jlNameStaff.setText("Tên nhân viên :");

        jlIDBill.setText("Mã hóa đơn : ");

        jtfNameCus.setEditable(false);

        jlPhoneCus.setText("Số điện thoại  :");

        jlAddress.setText("Địa chỉ :");

        jlTotal.setText("Tổng tiền hàng :");

        jlDateCreate.setText("Ngày tạo :");

        jlStatus.setText("Trạng thái :");

        jlReasonCancel.setText("Lý do hủy :");

        jtfIDBill.setEditable(false);

        jtfIDStaff.setEditable(false);

        jtfNameStaff.setEditable(false);

        jtfPhoneCus.setEditable(false);

        jtfAddress.setEditable(false);

        jtfTotal.setEditable(false);

        jtfDateCreate.setEditable(false);

        jtfStatus.setEditable(false);

        jtaReasonCancel.setColumns(20);
        jtaReasonCancel.setRows(5);
        jspReasonCancel.setViewportView(jtaReasonCancel);

        javax.swing.GroupLayout jpRightLayout = new javax.swing.GroupLayout(jpRight);
        jpRight.setLayout(jpRightLayout);
        jpRightLayout.setHorizontalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addComponent(jlReasonCancel)
                        .addGap(18, 18, 18)
                        .addComponent(jspReasonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addComponent(jlIDBill)
                        .addGap(29, 29, 29)
                        .addComponent(jtfIDBill, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNameStaff)
                            .addComponent(jlIDStaff)
                            .addComponent(jlNameCus)
                            .addComponent(jlPhoneCus)
                            .addComponent(jlAddress)
                            .addComponent(jlTotal)
                            .addComponent(jlDateCreate)
                            .addComponent(jlStatus))
                        .addGap(12, 12, 12)
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfStatus)
                            .addComponent(jtfDateCreate)
                            .addComponent(jtfTotal)
                            .addComponent(jtfAddress)
                            .addComponent(jtfPhoneCus)
                            .addComponent(jtfNameCus)
                            .addComponent(jtfIDStaff)
                            .addComponent(jtfNameStaff))))
                .addContainerGap())
        );
        jpRightLayout.setVerticalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDBill)
                    .addComponent(jtfIDBill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDStaff)
                    .addComponent(jtfIDStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNameStaff)
                    .addComponent(jtfNameStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNameCus)
                    .addComponent(jtfNameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPhoneCus)
                    .addComponent(jtfPhoneCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAddress)
                    .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTotal)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDateCreate)
                    .addComponent(jtfDateCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlStatus)
                    .addComponent(jtfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlReasonCancel)
                    .addComponent(jspReasonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        add(jpRight);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jTableInfoProduct;
    private javax.swing.JTable jTableListBill;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlDateCreate;
    private javax.swing.JLabel jlIDBill;
    private javax.swing.JLabel jlIDStaff;
    private javax.swing.JLabel jlNameCus;
    private javax.swing.JLabel jlNameStaff;
    private javax.swing.JLabel jlPhoneCus;
    private javax.swing.JLabel jlReasonCancel;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpLeftInfoProduct;
    private javax.swing.JPanel jpLeftListBill;
    private javax.swing.JPanel jpRight;
    private javax.swing.JScrollPane jspInfoProduct;
    private javax.swing.JScrollPane jspListBill;
    private javax.swing.JScrollPane jspReasonCancel;
    private javax.swing.JTextArea jtaReasonCancel;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfDateCreate;
    private javax.swing.JTextField jtfIDBill;
    private javax.swing.JTextField jtfIDStaff;
    private javax.swing.JTextField jtfNameCus;
    private javax.swing.JTextField jtfNameStaff;
    private javax.swing.JTextField jtfPhoneCus;
    private javax.swing.JTextField jtfStatus;
    private javax.swing.JTextField jtfTotal;
    // End of variables declaration//GEN-END:variables
}
