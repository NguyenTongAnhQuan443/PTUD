/*
1072x372
 */
package GUI;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SRevenue_GUI extends javax.swing.JPanel {

    public SRevenue_GUI() {
        initComponents();

        SRTable_GUI tableRevenueDetails_GUI = new SRTable_GUI();
        jpRight.removeAll();

        jpRight.setLayout(new FlowLayout());
        jpRight.add(tableRevenueDetails_GUI);

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
        cbChooserYear = new Customs.ComboBoxSuggestion();
        jpRight = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jpLeft.setBackground(new java.awt.Color(255, 255, 255));
        jpLeft.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlChooserYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlChooserYear.setText("Hãy chọn năm");

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

        javax.swing.GroupLayout jpLeftLayout = new javax.swing.GroupLayout(jpLeft);
        jpLeft.setLayout(jpLeftLayout);
        jpLeftLayout.setHorizontalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlChooserYear)
                    .addComponent(jlChooserDisplay)
                    .addGroup(jpLeftLayout.createSequentialGroup()
                        .addComponent(jrbTable)
                        .addGap(57, 57, 57)
                        .addComponent(jrbChart))
                    .addComponent(cbChooserYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpLeftLayout.setVerticalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlChooserYear)
                .addGap(14, 14, 14)
                .addComponent(cbChooserYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlChooserDisplay)
                .addGap(18, 18, 18)
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbTable)
                    .addComponent(jrbChart))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jpRight.setBackground(new java.awt.Color(255, 255, 255));
        jpRight.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GUI.SRTable_GUI tableRevenueDetails_GUI = new GUI.SRTable_GUI();
        jpRight.removeAll();

        jpRight.setLayout(new FlowLayout());
        jpRight.add(tableRevenueDetails_GUI);

        jpRight.revalidate();
        jpRight.repaint();

        javax.swing.GroupLayout jpRightLayout = new javax.swing.GroupLayout(jpRight);
        jpRight.setLayout(jpRightLayout);
        jpRightLayout.setHorizontalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jpRightLayout.setVerticalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jrbTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTableActionPerformed

        SRTable_GUI tableRevenueDetails_GUI = new SRTable_GUI();
        jpRight.removeAll();

        jpRight.setLayout(new FlowLayout());
        jpRight.add(tableRevenueDetails_GUI);

        jpRight.revalidate();
        jpRight.repaint();
    }//GEN-LAST:event_jrbTableActionPerformed

    private void jrbChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbChartActionPerformed

        SRChart_GUI chartRevenue_GUI = new SRChart_GUI();
        jpRight.removeAll();

        jpRight.setLayout(new FlowLayout());
        jpRight.add(chartRevenue_GUI);

        jpRight.revalidate();
        jpRight.repaint();
    }//GEN-LAST:event_jrbChartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Customs.ComboBoxSuggestion cbChooserYear;
    private javax.swing.JLabel jlChooserDisplay;
    private javax.swing.JLabel jlChooserYear;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpRight;
    private javax.swing.JRadioButton jrbChart;
    private javax.swing.JRadioButton jrbTable;
    // End of variables declaration//GEN-END:variables
}
