package gui;

import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ChangePassword_GUI extends javax.swing.JPanel {

    private Sell_GUI sell_GUI;
    private Statistical_GUIX statistical_GUI;

    public ChangePassword_GUI() {
        initComponents();
        jtfCaptcha.setText(createCaptcha());

        disableCopyPaste(jtfCaptcha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfIDStaff = new lib2.TextField();
        jtfOldPass = new lib2.TextField();
        jtfNewPass = new lib2.TextField();
        jtfConfirmPass = new lib2.TextField();
        jtfInputCaptcha = new lib2.TextField();
        jtfCaptcha = new javax.swing.JTextField();
        jlCaptch = new javax.swing.JLabel();
        jlIconRefresh = new javax.swing.JLabel();
        btnBack = new lib2.Button();
        btnSave = new lib2.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đổi mật khẩu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jtfIDStaff.setLabelText("Mã nhân viên");

        jtfOldPass.setLabelText("Nhập mật khẩu cũ");

        jtfNewPass.setLabelText("Nhập mật khẩu mới");

        jtfConfirmPass.setLabelText("Nhập lại mật khẩu mới");

        jtfInputCaptcha.setLabelText("Nhập mã Captcha");

        jtfCaptcha.setEditable(false);
        jtfCaptcha.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N

        jlCaptch.setText("Mã CAPTCHA :");

        jlIconRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/arrowblue24.png"))); // NOI18N
        jlIconRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlIconRefreshMouseClicked(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(135, 206, 235));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/back24.png"))); // NOI18N
        btnBack.setText("Quay lại trang chủ");
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(135, 206, 235));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/save24.png"))); // NOI18N
        btnSave.setText("Lưu thay đổi");
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfIDStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jtfNewPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlCaptch)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfOldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlIconRefresh))
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtfInputCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIDStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfOldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCaptch)
                    .addComponent(jlIconRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jtfInputCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jlIconRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconRefreshMouseClicked
        jtfCaptcha.setText(createCaptcha());
    }//GEN-LAST:event_jlIconRefreshMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();

        HomeManager_GUI homeManager_GUI = new HomeManager_GUI();
        homeManager_GUI.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed
// Hàm tạo mã Captcha

    private static String createCaptcha() {
        Random random = new Random();
        int length = 4 + (Math.abs(random.nextInt()) % 3);
        StringBuffer captchaStrBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int baseCharacterNumber = Math.abs(random.nextInt()) % 62;
            int characterNumber = 0;
            if (baseCharacterNumber < 26) {
                characterNumber = 65 + baseCharacterNumber;
            } else if (baseCharacterNumber < 52) {
                characterNumber = 97 + (baseCharacterNumber - 26);
            } else {
                characterNumber = 48 + (baseCharacterNumber - 52);
            }
            captchaStrBuffer.append((char) characterNumber);
        }
        return captchaStrBuffer.toString();
    }

// Hàm ngắn chặn sự kiện coppy Captcha
    private void disableCopyPaste(JTextField textField) {
        ActionMap actionMap = textField.getActionMap();
        actionMap.put("copy", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        actionMap.put("paste", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnBack;
    private lib2.Button btnSave;
    private javax.swing.JLabel jlCaptch;
    private javax.swing.JLabel jlIconRefresh;
    private javax.swing.JTextField jtfCaptcha;
    private lib2.TextField jtfConfirmPass;
    private lib2.TextField jtfIDStaff;
    private lib2.TextField jtfInputCaptcha;
    private lib2.TextField jtfNewPass;
    private lib2.TextField jtfOldPass;
    // End of variables declaration//GEN-END:variables

}
