package gui;

import lib2.ModelChart;
import java.awt.Color;
import lib2.Chart;

public class Statistical_Revenue_Chart_GUI extends javax.swing.JPanel {

    public Statistical_Revenue_Chart_GUI() {
        initComponents();

        jpChart.addLegend("Income", new Color(245, 189, 135));
        jpChart.addLegend("Expense", new Color(135, 189, 245));
        jpChart.addLegend("Profit", new Color(189, 135, 245));
        jpChart.addLegend("Cost", new Color(139, 229, 222));
        jpChart.addData(new ModelChart("January", new double[]{500, 200, 80, 89}));
        jpChart.addData(new ModelChart("February", new double[]{600, 750, 90, 150}));
        jpChart.addData(new ModelChart("March", new double[]{200, 350, 460, 900}));
        jpChart.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
        jpChart.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
        jpChart.addData(new ModelChart("June", new double[]{190, 280, 81, 200}));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpChart = new lib2.Chart();

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpChart, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jpChart, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Chart jpChart;
    // End of variables declaration//GEN-END:variables
}
