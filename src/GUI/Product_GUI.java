//1013, 579
package GUI;

public class Product_GUI extends javax.swing.JPanel {

    private PProperties_GUI pDetails_GUI;
    public Product_GUI() {
        initComponents();
        
        pDetails_GUI = new PProperties_GUI();
        jpTmp.removeAll();
        jpTmp.add(pDetails_GUI);
        jpTmp.revalidate();
        jpTmp.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMainSearch = new javax.swing.JPanel();
        btnProduct = new Customs.Button();
        bynRevenue = new Customs.Button();
        jpTmp = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jpMainSearch.setBackground(new java.awt.Color(255, 255, 255));
        jpMainSearch.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 0));

        btnProduct.setBackground(new java.awt.Color(204, 204, 255));
        btnProduct.setBorder(null);
        btnProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnProduct.setText("Thuộc tính sản phẩm");
        btnProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        jpMainSearch.add(btnProduct);

        bynRevenue.setBackground(new java.awt.Color(204, 204, 255));
        bynRevenue.setBorder(null);
        bynRevenue.setForeground(new java.awt.Color(255, 255, 255));
        bynRevenue.setText("Thông tin chi tiết");
        bynRevenue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bynRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bynRevenueActionPerformed(evt);
            }
        });
        jpMainSearch.add(bynRevenue);

        add(jpMainSearch);

        jpTmp.setLayout(new java.awt.GridLayout());
        add(jpTmp);
    }// </editor-fold>//GEN-END:initComponents

    private void bynRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bynRevenueActionPerformed


    }//GEN-LAST:event_bynRevenueActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed

    }//GEN-LAST:event_btnProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Customs.Button btnProduct;
    private Customs.Button bynRevenue;
    private javax.swing.JPanel jpMainSearch;
    private javax.swing.JPanel jpTmp;
    // End of variables declaration//GEN-END:variables
}
