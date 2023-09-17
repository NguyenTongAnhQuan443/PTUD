//1013, 579
package gui;

public class Product_GUI extends javax.swing.JPanel {

    private Product_Detail_GUI product_Detail_GUI;
    private Product_Properties_GUI product_Properties_GUI;
    private Product_Filter_GUI product_Filter_GUI;

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
        btnProductProperties = new lib2.Button();
        btnProductDetails = new lib2.Button();
        btnProductFilter = new lib2.Button();
        jpTmp = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jpMainSearch.setBackground(new java.awt.Color(255, 255, 255));
        jpMainSearch.setLayout(new java.awt.GridLayout(1, 0));

        btnProductProperties.setBackground(new java.awt.Color(204, 204, 255));
        btnProductProperties.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnProductProperties.setForeground(new java.awt.Color(255, 255, 255));
        btnProductProperties.setText("Thuộc tính sản phẩm");
        btnProductProperties.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProductProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductPropertiesActionPerformed(evt);
            }
        });
        jpMainSearch.add(btnProductProperties);

        btnProductDetails.setBackground(new java.awt.Color(204, 204, 255));
        btnProductDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnProductDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnProductDetails.setText("Thông tin chi tiết");
        btnProductDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProductDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductDetailsActionPerformed(evt);
            }
        });
        jpMainSearch.add(btnProductDetails);

        btnProductFilter.setBackground(new java.awt.Color(204, 204, 255));
        btnProductFilter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnProductFilter.setForeground(new java.awt.Color(255, 255, 255));
        btnProductFilter.setText("Lọc sản phẩm");
        btnProductFilter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProductFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductFilterActionPerformed(evt);
            }
        });
        jpMainSearch.add(btnProductFilter);

        add(jpMainSearch);

        jpTmp.setLayout(new java.awt.GridLayout(1, 0));
        add(jpTmp);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductDetailsActionPerformed
        product_Detail_GUI = new Product_Detail_GUI();
        jpTmp.removeAll();
        jpTmp.add(product_Detail_GUI);
        jpTmp.revalidate();
        jpTmp.repaint();

    }//GEN-LAST:event_btnProductDetailsActionPerformed

    private void btnProductPropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductPropertiesActionPerformed
        product_Properties_GUI = new Product_Properties_GUI();
        jpTmp.removeAll();
        jpTmp.add(product_Properties_GUI);
        jpTmp.revalidate();
        jpTmp.repaint();
    }//GEN-LAST:event_btnProductPropertiesActionPerformed

    private void btnProductFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductFilterActionPerformed
        Product_Filter_GUI product_Filter_GUI = new Product_Filter_GUI();
        jpTmp.removeAll();
        jpTmp.add(product_Filter_GUI);
        jpTmp.revalidate();
        jpTmp.repaint();
    }//GEN-LAST:event_btnProductFilterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnProductDetails;
    private lib2.Button btnProductFilter;
    private lib2.Button btnProductProperties;
    private javax.swing.JPanel jpMainSearch;
    private javax.swing.JPanel jpTmp;
    // End of variables declaration//GEN-END:variables
}
