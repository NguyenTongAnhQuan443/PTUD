//1013, 579
package gui;

public class Product_GUI extends javax.swing.JPanel {

    private Product_Detail_GUI product_Detail_GUI;
    private Product_Properties_GUI product_Properties_GUI;
    public Product_GUI() {
        initComponents();
        
        product_Properties_GUI = new Product_Properties_GUI();
        jpTmp.removeAll();
        jpTmp.add(product_Properties_GUI);
        jpTmp.revalidate();
        jpTmp.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMainSearch = new javax.swing.JPanel();
        btnProduct = new lib2.Button();
        btnRevenue = new lib2.Button();
        jpTmp = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jpMainSearch.setBackground(new java.awt.Color(255, 255, 255));
        jpMainSearch.setLayout(new java.awt.GridLayout(1, 0));

        btnProduct.setBackground(new java.awt.Color(204, 204, 255));
        btnProduct.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnProduct.setText("Thuộc tính sản phẩm");
        btnProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        jpMainSearch.add(btnProduct);

        btnRevenue.setBackground(new java.awt.Color(204, 204, 255));
        btnRevenue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRevenue.setForeground(new java.awt.Color(255, 255, 255));
        btnRevenue.setText("Thông tin chi tiết");
        btnRevenue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevenueActionPerformed(evt);
            }
        });
        jpMainSearch.add(btnRevenue);

        add(jpMainSearch);

        jpTmp.setLayout(new java.awt.GridLayout(1, 0));
        add(jpTmp);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevenueActionPerformed
                product_Detail_GUI = new Product_Detail_GUI();
        jpTmp.removeAll();
        jpTmp.add(product_Detail_GUI);
        jpTmp.revalidate();
        jpTmp.repaint();

    }//GEN-LAST:event_btnRevenueActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
                product_Properties_GUI = new Product_Properties_GUI();
        jpTmp.removeAll();
        jpTmp.add(product_Properties_GUI);
        jpTmp.revalidate();
        jpTmp.repaint();
    }//GEN-LAST:event_btnProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnProduct;
    private lib2.Button btnRevenue;
    private javax.swing.JPanel jpMainSearch;
    private javax.swing.JPanel jpTmp;
    // End of variables declaration//GEN-END:variables
}
