package gui;

import dao.VAT_DAO;
import entity.Flag;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VAT_GUI extends javax.swing.JFrame {

    private VAT_DAO vat_dao = new VAT_DAO();

    public VAT_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        JTFVATOld.setText(vat_dao.getVAT() + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPMain = new javax.swing.JPanel();
        JPLogo = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        jlNameShop = new javax.swing.JLabel();
        JLVATNew = new javax.swing.JLabel();
        JTFVATOld = new javax.swing.JTextField();
        JLPercent_1 = new javax.swing.JLabel();
        JLVATOld = new javax.swing.JLabel();
        JTFVATNew = new javax.swing.JTextField();
        JLPercent_2 = new javax.swing.JLabel();
        BTNEdit = new lib2.Button();
        BTNClose = new lib2.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cập nhập thuế VAT");
        setResizable(false);

        JPMain.setBackground(new java.awt.Color(255, 255, 255));

        JPLogo.setBackground(new java.awt.Color(0, 128, 128));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/Logo64.png"))); // NOI18N

        jlNameShop.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jlNameShop.setForeground(new java.awt.Color(255, 255, 255));
        jlNameShop.setText("Fley Shop");

        javax.swing.GroupLayout JPLogoLayout = new javax.swing.GroupLayout(JPLogo);
        JPLogo.setLayout(JPLogoLayout);
        JPLogoLayout.setHorizontalGroup(
            JPLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPLogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlLogo)
                .addGap(18, 18, 18)
                .addComponent(jlNameShop, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        JPLogoLayout.setVerticalGroup(
            JPLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPLogoLayout.createSequentialGroup()
                .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JPLogoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlNameShop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JLVATNew.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        JLVATNew.setText("Phí VAT mới:");

        JTFVATOld.setEditable(false);
        JTFVATOld.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        JLPercent_1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        JLPercent_1.setText("%");

        JLVATOld.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        JLVATOld.setText("Phí VAT hiện tại:");

        JLPercent_2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        JLPercent_2.setText("%");

        BTNEdit.setBackground(new java.awt.Color(135, 206, 235));
        BTNEdit.setForeground(new java.awt.Color(255, 255, 255));
        BTNEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit24.png"))); // NOI18N
        BTNEdit.setText("Cập nhập");
        BTNEdit.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        BTNEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEditActionPerformed(evt);
            }
        });

        BTNClose.setBackground(new java.awt.Color(135, 206, 235));
        BTNClose.setForeground(new java.awt.Color(255, 255, 255));
        BTNClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/x24.png"))); // NOI18N
        BTNClose.setText("Đóng");
        BTNClose.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        BTNClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Cập nhập phí VAT hệ thống FleyShop");

        jLabel2.setText("Trân trọng cảm ơn !");

        javax.swing.GroupLayout JPMainLayout = new javax.swing.GroupLayout(JPMain);
        JPMain.setLayout(JPMainLayout);
        JPMainLayout.setHorizontalGroup(
            JPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPMainLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(JPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLVATOld)
                    .addComponent(JLVATNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JTFVATOld, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFVATNew, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPMainLayout.createSequentialGroup()
                        .addComponent(BTNClose, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTNEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLPercent_1)
                    .addComponent(JLPercent_2))
                .addGap(191, 191, 191))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPMainLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPMainLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );
        JPMainLayout.setVerticalGroup(
            JPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMainLayout.createSequentialGroup()
                .addComponent(JPLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLVATOld)
                    .addComponent(JTFVATOld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLPercent_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLVATNew)
                    .addComponent(JTFVATNew, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLPercent_1))
                .addGap(18, 18, 18)
                .addGroup(JPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCloseActionPerformed
        dispose();
    }//GEN-LAST:event_BTNCloseActionPerformed

    private void BTNEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEditActionPerformed
        if (validator()) {
            boolean res = vat_dao.updateVAT(Double.parseDouble(JTFVATNew.getText().trim()));
            if (res) {
                JTFVATOld.setText(vat_dao.getVAT() + "");
                JTFVATNew.setText("");
                dispose();
                JOptionPane.showMessageDialog(null, "Cập nhập phí VAT thành công !");
            }

        }
    }//GEN-LAST:event_BTNEditActionPerformed
    private boolean showERROR(JTextField jtf, String mess) {
        jtf.selectAll();
        jtf.requestFocus();
        JOptionPane.showMessageDialog(null, mess);
        return false;
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean validator() {
        if (JTFVATNew.getText().trim().equals("")) {
            return showERROR(JTFVATNew, "Vui lòng nhập phí VAT mới trước khi cập nhập !");
        }
        if (!isDouble(JTFVATNew.getText().trim())) {
            return showERROR(JTFVATNew, "Số VAT nhập vào sai vui lòng kiểm tra lại");
        }
        double VAT = Double.parseDouble(JTFVATNew.getText().trim());
        if (VAT < 0 || VAT > 100) {
            return showERROR(JTFVATNew, "Phí VAT không phù hợp vui lòng kiểm tra lại (0 -> 100%)");
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button BTNClose;
    private lib2.Button BTNEdit;
    private javax.swing.JLabel JLPercent_1;
    private javax.swing.JLabel JLPercent_2;
    private javax.swing.JLabel JLVATNew;
    private javax.swing.JLabel JLVATOld;
    private javax.swing.JPanel JPLogo;
    private javax.swing.JPanel JPMain;
    private javax.swing.JTextField JTFVATNew;
    private javax.swing.JTextField JTFVATOld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlNameShop;
    // End of variables declaration//GEN-END:variables
}
