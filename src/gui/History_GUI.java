//1013, 579
// left 763 right 250
package gui;

import javax.swing.JOptionPane;
import lib2.TableCustom;

public class History_GUI extends javax.swing.JPanel {

    public History_GUI() {
        initComponents();
        TableCustom.apply(jspListInvoice, TableCustom.TableType.DEFAULT);
        TableCustom.apply(jspInfoProduct, TableCustom.TableType.DEFAULT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLeft = new javax.swing.JPanel();
        jpLeftListInvoice = new javax.swing.JPanel();
        jspListInvoice = new javax.swing.JScrollPane();
        jTableListInvoice = new javax.swing.JTable();
        btnReturns = new lib2.Button();
        btnDelivered = new lib2.Button();
        jlDay = new javax.swing.JLabel();
        cbDay = new lib2.ComboBoxSuggestion();
        jlMonth = new javax.swing.JLabel();
        cbMonth = new lib2.ComboBoxSuggestion();
        jlYear = new javax.swing.JLabel();
        cbYear = new lib2.ComboBoxSuggestion();
        jlSearchID = new javax.swing.JLabel();
        jtfIDInvoice = new javax.swing.JTextField();
        btnSearch = new lib2.Button();
        jlStatusInvoice = new javax.swing.JLabel();
        cbStatusInvoice = new lib2.ComboBoxSuggestion();
        jpLeftInfoProduct = new javax.swing.JPanel();
        jspInfoProduct = new javax.swing.JScrollPane();
        jTableInfoProduct = new javax.swing.JTable();
        jpRight = new javax.swing.JPanel();
        jlNameCus = new javax.swing.JLabel();
        jlIDStaff = new javax.swing.JLabel();
        jlNameStaff = new javax.swing.JLabel();
        jlIDInvoice = new javax.swing.JLabel();
        jtfNameCus = new javax.swing.JTextField();
        jlPhoneCus = new javax.swing.JLabel();
        jlAddress = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jlDateCreate = new javax.swing.JLabel();
        jlStatus = new javax.swing.JLabel();
        jlReasonCancel = new javax.swing.JLabel();
        jtfIDInvoiceDetails = new javax.swing.JTextField();
        jtfIDStaff = new javax.swing.JTextField();
        jtfNameStaff = new javax.swing.JTextField();
        jtfPhoneCus = new javax.swing.JTextField();
        jtfAddress = new javax.swing.JTextField();
        jtfTotal = new javax.swing.JTextField();
        jtfDateCreate = new javax.swing.JTextField();
        jtfStatusDetails = new javax.swing.JTextField();
        jspReasonCancel = new javax.swing.JScrollPane();
        jtaReasonCancel = new javax.swing.JTextArea();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));

        jpLeft.setLayout(new java.awt.GridLayout(2, 1));

        jpLeftListInvoice.setBackground(new java.awt.Color(255, 255, 255));
        jpLeftListInvoice.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTableListInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hóa đơn", "Tên nhân viên", "Tên khách hàng", "Ngày tào", "Trạng thái", "Đã giao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListInvoice.setToolTipText("");
        jspListInvoice.setViewportView(jTableListInvoice);

        btnReturns.setBackground(new java.awt.Color(135, 206, 235));
        btnReturns.setForeground(new java.awt.Color(255, 255, 255));
        btnReturns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productReturn24.png"))); // NOI18N
        btnReturns.setText("Trả hàng  ");
        btnReturns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnsActionPerformed(evt);
            }
        });

        btnDelivered.setBackground(new java.awt.Color(135, 206, 235));
        btnDelivered.setForeground(new java.awt.Color(255, 255, 255));
        btnDelivered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/done24.png"))); // NOI18N
        btnDelivered.setText("Đã giao hàng");
        btnDelivered.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jlDay.setText("Ngày :");

        jlMonth.setText("Tháng :");

        jlYear.setText("Năm :");

        jlSearchID.setText("Mã hóa đơn :");

        btnSearch.setBackground(new java.awt.Color(135, 206, 235));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search24.png"))); // NOI18N
        btnSearch.setText("Tìm   ");
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jlStatusInvoice.setText("Trạng thái :");

        javax.swing.GroupLayout jpLeftListInvoiceLayout = new javax.swing.GroupLayout(jpLeftListInvoice);
        jpLeftListInvoice.setLayout(jpLeftListInvoiceLayout);
        jpLeftListInvoiceLayout.setHorizontalGroup(
            jpLeftListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
            .addGroup(jpLeftListInvoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpLeftListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLeftListInvoiceLayout.createSequentialGroup()
                        .addComponent(jlDay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMonth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlYear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlSearchID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfIDInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpLeftListInvoiceLayout.createSequentialGroup()
                        .addComponent(jlStatusInvoice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStatusInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelivered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpLeftListInvoiceLayout.setVerticalGroup(
            jpLeftListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftListInvoiceLayout.createSequentialGroup()
                .addGroup(jpLeftListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDay)
                    .addComponent(jlMonth)
                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlYear)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIDInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSearchID)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspListInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLeftListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelivered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlStatusInvoice)
                    .addComponent(cbStatusInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jpLeft.add(jpLeftListInvoice);

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
            .addComponent(jspInfoProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
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

        jlIDInvoice.setText("Mã hóa đơn : ");

        jtfNameCus.setEditable(false);
        jtfNameCus.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jtfNameCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameCusActionPerformed(evt);
            }
        });

        jlPhoneCus.setText("Số điện thoại  :");

        jlAddress.setText("Địa chỉ :");

        jlTotal.setText("Tổng tiền hàng :");

        jlDateCreate.setText("Ngày tạo :");

        jlStatus.setText("Trạng thái :");

        jlReasonCancel.setText("Lý do hủy :");

        jtfIDInvoiceDetails.setEditable(false);

        jtfIDStaff.setEditable(false);

        jtfNameStaff.setEditable(false);
        jtfNameStaff.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        jtfPhoneCus.setEditable(false);

        jtfAddress.setEditable(false);
        jtfAddress.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        jtfTotal.setEditable(false);

        jtfDateCreate.setEditable(false);

        jtfStatusDetails.setEditable(false);

        jtaReasonCancel.setColumns(20);
        jtaReasonCancel.setRows(5);
        jspReasonCancel.setViewportView(jtaReasonCancel);

        javax.swing.GroupLayout jpRightLayout = new javax.swing.GroupLayout(jpRight);
        jpRight.setLayout(jpRightLayout);
        jpRightLayout.setHorizontalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addComponent(jlReasonCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspReasonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(jpRightLayout.createSequentialGroup()
                .addComponent(jlIDInvoice)
                .addGap(29, 29, 29)
                .addComponent(jtfIDInvoiceDetails))
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
                    .addComponent(jtfStatusDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jtfDateCreate)
                    .addComponent(jtfTotal)
                    .addComponent(jtfAddress)
                    .addComponent(jtfPhoneCus)
                    .addComponent(jtfNameCus)
                    .addComponent(jtfIDStaff)
                    .addComponent(jtfNameStaff)))
        );
        jpRightLayout.setVerticalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDInvoice)
                    .addComponent(jtfIDInvoiceDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jtfStatusDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlReasonCancel)
                    .addComponent(jspReasonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        add(jpRight);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jtfNameCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameCusActionPerformed

    private void btnReturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnsActionPerformed
        String[] options = {"Toàn phần", "Một phần"};
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Bạn muốn hoàn trả toàn phần hay hoàn trả một phần:",
                    "Lựa chọn",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (choice == 0) {
//                Sự kiện toàn phần
            } else if (choice == 1) {
//                Sự kiện một phần
            }
    }//GEN-LAST:event_btnReturnsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnDelivered;
    private lib2.Button btnReturns;
    private lib2.Button btnSearch;
    private lib2.ComboBoxSuggestion cbDay;
    private lib2.ComboBoxSuggestion cbMonth;
    private lib2.ComboBoxSuggestion cbStatusInvoice;
    private lib2.ComboBoxSuggestion cbYear;
    private javax.swing.JTable jTableInfoProduct;
    private javax.swing.JTable jTableListInvoice;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlDateCreate;
    private javax.swing.JLabel jlDay;
    private javax.swing.JLabel jlIDInvoice;
    private javax.swing.JLabel jlIDStaff;
    private javax.swing.JLabel jlMonth;
    private javax.swing.JLabel jlNameCus;
    private javax.swing.JLabel jlNameStaff;
    private javax.swing.JLabel jlPhoneCus;
    private javax.swing.JLabel jlReasonCancel;
    private javax.swing.JLabel jlSearchID;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JLabel jlStatusInvoice;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JLabel jlYear;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpLeftInfoProduct;
    private javax.swing.JPanel jpLeftListInvoice;
    private javax.swing.JPanel jpRight;
    private javax.swing.JScrollPane jspInfoProduct;
    private javax.swing.JScrollPane jspListInvoice;
    private javax.swing.JScrollPane jspReasonCancel;
    private javax.swing.JTextArea jtaReasonCancel;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfDateCreate;
    private javax.swing.JTextField jtfIDInvoice;
    private javax.swing.JTextField jtfIDInvoiceDetails;
    private javax.swing.JTextField jtfIDStaff;
    private javax.swing.JTextField jtfNameCus;
    private javax.swing.JTextField jtfNameStaff;
    private javax.swing.JTextField jtfPhoneCus;
    private javax.swing.JTextField jtfStatusDetails;
    private javax.swing.JTextField jtfTotal;
    // End of variables declaration//GEN-END:variables
}
