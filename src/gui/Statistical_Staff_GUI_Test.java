/*
    hiển thị các sản phẩm sắp hết hàng
    sản phẩm dưới 5 cái 
    sản phẩm dưới 10 cái
    sản phẩm dưới 15 cái
*/
package gui;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;


public class Statistical_Staff_GUI_Test extends javax.swing.JPanel {

    public Statistical_Staff_GUI_Test() {
        initComponents();
        
        Statistical_Product_Table_GUI statistical_Product_Table_GUI = new Statistical_Product_Table_GUI();
        jpRight.removeAll();

        jpRight.setLayout(new FlowLayout());
        jpRight.add(statistical_Product_Table_GUI);

        jpRight.revalidate();
        jpRight.repaint();
    }
    ButtonGroup buttonGroup = new ButtonGroup();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLeft = new javax.swing.JPanel();
        jlChooserYear = new javax.swing.JLabel();
        jlChooserDisplay = new javax.swing.JLabel();
        jrbTable = new javax.swing.JRadioButton();
        jrbChart = new javax.swing.JRadioButton();
        cbChooserYear = new lib2.ComboBoxSuggestion();
        jlTitle = new javax.swing.JLabel();
        jpRight = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));

        jpLeft.setBackground(new java.awt.Color(255, 255, 255));
        jpLeft.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlChooserYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlChooserYear.setText("Hãy chọn kiểu thống kê");

        jlChooserDisplay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlChooserDisplay.setText("Hãy chọn kiểu hiển thị");

        jrbTable.setBackground(new java.awt.Color(255, 255, 255));
        jrbTable.setText("Dạng bảng");
        buttonGroup.add(jrbTable);
        buttonGroup.add(jrbChart);
        jrbTable.setSelected(true);
        jrbTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTableActionPerformed(evt);
            }
        });

        jrbChart.setBackground(new java.awt.Color(255, 255, 255));
        jrbChart.setText("Dạng biểu đồ");
        jrbChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbChartActionPerformed(evt);
            }
        });

        cbChooserYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tồn kho nhiều nhất", "Tồn kho ít nhất" }));
        cbChooserYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlTitle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlTitle.setText("Thống kê sản phẩm");

        javax.swing.GroupLayout jpLeftLayout = new javax.swing.GroupLayout(jpLeft);
        jpLeft.setLayout(jpLeftLayout);
        jpLeftLayout.setHorizontalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLeftLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jlTitle))
                    .addGroup(jpLeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlChooserYear))
                    .addGroup(jpLeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpLeftLayout.createSequentialGroup()
                                .addComponent(jrbTable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbChart))
                            .addComponent(cbChooserYear, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpLeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlChooserDisplay)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jpLeftLayout.setVerticalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlTitle)
                .addGap(18, 18, 18)
                .addComponent(jlChooserYear)
                .addGap(18, 18, 18)
                .addComponent(cbChooserYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlChooserDisplay)
                .addGap(18, 18, 18)
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbTable)
                    .addComponent(jrbChart))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        add(jpLeft);

        jpRight.setBackground(new java.awt.Color(255, 255, 255));
        jpRight.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jpRightLayout = new javax.swing.GroupLayout(jpRight);
        jpRight.setLayout(jpRightLayout);
        jpRightLayout.setHorizontalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        jpRightLayout.setVerticalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        add(jpRight);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTableActionPerformed
        Statistical_Product_Table_GUI statistical_Product_Table_GUI = new Statistical_Product_Table_GUI();
        jpRight.removeAll();

        jpRight.setLayout(new FlowLayout());
        jpRight.add(statistical_Product_Table_GUI);

        jpRight.revalidate();
        jpRight.repaint();
    }//GEN-LAST:event_jrbTableActionPerformed

    private void jrbChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbChartActionPerformed

        Statistical_Product_Chart_GUI statistical_Product_Chart_GUI = new Statistical_Product_Chart_GUI();
        jpRight.removeAll();

        jpRight.setLayout(new FlowLayout());
        jpRight.add(statistical_Product_Chart_GUI);

        jpRight.revalidate();
        jpRight.repaint();
    }//GEN-LAST:event_jrbChartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.ComboBoxSuggestion cbChooserYear;
    private javax.swing.JLabel jlChooserDisplay;
    private javax.swing.JLabel jlChooserYear;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpRight;
    private javax.swing.JRadioButton jrbChart;
    private javax.swing.JRadioButton jrbTable;
    // End of variables declaration//GEN-END:variables
}
