/*
1072x372
 */
package GUI;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Revenue_GUI extends javax.swing.JPanel {


    public Revenue_GUI() {
        initComponents();
    }

    ButtonGroup buttonGroup = new ButtonGroup();


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLeft = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        comboBoxSuggestion1 = new GUI.ComboBoxSuggestion();
        jpRight = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jpLeft.setBackground(new java.awt.Color(255, 255, 255));
        jpLeft.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Hãy chọn năm");

        jLabel2.setText("Hãy chọn kiểu hiển thị");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Dạng bảng");
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Dạng biểu đồ");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLeftLayout = new javax.swing.GroupLayout(jpLeft);
        jpLeft.setLayout(jpLeftLayout);
        jpLeftLayout.setHorizontalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jpLeftLayout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(57, 57, 57)
                        .addComponent(jRadioButton2))
                    .addComponent(comboBoxSuggestion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpLeftLayout.setVerticalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(comboBoxSuggestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jpRight.setBackground(new java.awt.Color(255, 255, 255));
        jpRight.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TableRevenueDetails_GUI tableRevenueDetails_GUI = new TableRevenueDetails_GUI();
        jpRight.removeAll();

        jpRight.setLayout(new FlowLayout());
        jpRight.add(tableRevenueDetails_GUI);

        jpRight.revalidate();
        jpRight.repaint();

        javax.swing.GroupLayout jpRightLayout = new javax.swing.GroupLayout(jpRight);
        jpRight.setLayout(jpRightLayout);
        jpRightLayout.setHorizontalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
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

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    TableRevenueDetails_GUI tableRevenueDetails_GUI = new TableRevenueDetails_GUI();
    jpRight.removeAll();

    jpRight.setLayout(new FlowLayout());
    jpRight.add(tableRevenueDetails_GUI);

    jpRight.revalidate();
    jpRight.repaint();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    ChartRevenue_GUI chartRevenue_GUI = new ChartRevenue_GUI();
    jpRight.removeAll();

    jpRight.setLayout(new FlowLayout());
    jpRight.add(chartRevenue_GUI);

    jpRight.revalidate();
    jpRight.repaint();
    }//GEN-LAST:event_jRadioButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.ComboBoxSuggestion comboBoxSuggestion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpRight;
    // End of variables declaration//GEN-END:variables
}
