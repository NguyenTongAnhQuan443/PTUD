/*
    hiển thị các sản phẩm sắp hết hàng
    sản phẩm dưới 5 cái 
    sản phẩm dưới 10 cái
    sản phẩm dưới 15 cái
*/
package GUI;


public class Statistical_Product_GUI extends javax.swing.JPanel {

    public Statistical_Product_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTable = new javax.swing.JLabel();
        jspTable = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        jlTable.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlTable.setText("Thông tin chi tiết sản phẩm");

        jTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Số lượng bán", "Tên SP", "Chất liệu", "Màu sắc", "Kích thước", "Số lượng"
            }
        ));
        jspTable.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jlTable)
                .addContainerGap(410, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspTable)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspTable, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jTable;
    private javax.swing.JLabel jlTable;
    private javax.swing.JScrollPane jspTable;
    // End of variables declaration//GEN-END:variables
}
