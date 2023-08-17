package GUI;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Login_GUI extends javax.swing.JFrame {

    private HomeManager_GUI HomeManager_GUI;

    public Login_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLeft = new javax.swing.JPanel();
        jpContent = new javax.swing.JPanel();
        jlHello = new javax.swing.JLabel();
        jlContent1 = new javax.swing.JLabel();
        jlContent2 = new javax.swing.JLabel();
        jpRight = new javax.swing.JPanel();
        jpFormLogin = new javax.swing.JPanel();
        btnLogin = new Customs.Button();
        jpfPass = new Customs.PasswordField();
        jtfUser = new Customs.TextField();
        jlTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jpLeft.setBackground(new java.awt.Color(0, 128, 128));

        jpContent.setBackground(new java.awt.Color(0, 128, 128));

        jlHello.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlHello.setForeground(new java.awt.Color(255, 255, 255));
        jlHello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHello.setText("Xin Chào !");

        jlContent1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlContent1.setForeground(new java.awt.Color(255, 255, 255));
        jlContent1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlContent1.setText("Hãy nhập thông tin của bạn");

        jlContent2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlContent2.setForeground(new java.awt.Color(255, 255, 255));
        jlContent2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlContent2.setText("và cùng nhau bán hàng nào !");

        javax.swing.GroupLayout jpContentLayout = new javax.swing.GroupLayout(jpContent);
        jpContent.setLayout(jpContentLayout);
        jpContentLayout.setHorizontalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContentLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlHello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addComponent(jlContent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlContent2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpContentLayout.setVerticalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContentLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlHello, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlContent1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlContent2)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpLeftLayout = new javax.swing.GroupLayout(jpLeft);
        jpLeft.setLayout(jpLeftLayout);
        jpLeftLayout.setHorizontalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jpContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpLeftLayout.setVerticalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jpContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(190, 190, 190))
        );

        jpRight.setBackground(new java.awt.Color(255, 255, 255));

        jpFormLogin.setBackground(new java.awt.Color(255, 255, 255));

        btnLogin.setBackground(new java.awt.Color(0, 128, 128));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("ĐĂNG NHẬP");
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jpfPass.setLabelText("Mật Khẩu");

        jtfUser.setLabelText("Tài Khoản");

        jlTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(0, 128, 128));
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("Đăng Nhập");

        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("Bạn quên mật khẩu ?");

        javax.swing.GroupLayout jpFormLoginLayout = new javax.swing.GroupLayout(jpFormLogin);
        jpFormLogin.setLayout(jpFormLoginLayout);
        jpFormLoginLayout.setHorizontalGroup(
            jpFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFormLoginLayout.createSequentialGroup()
                        .addGroup(jpFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpfPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormLoginLayout.createSequentialGroup()
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );
        jpFormLoginLayout.setVerticalGroup(
            jpFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormLoginLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jpRightLayout = new javax.swing.GroupLayout(jpRight);
        jpRight.setLayout(jpRightLayout);
        jpRightLayout.setHorizontalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jpFormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jpRightLayout.setVerticalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jpFormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addComponent(jpRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        boolean userEmpty = jtfUser.getText().trim().isEmpty();
        boolean passEmpty = jpfPass.getText().isEmpty();
        if (userEmpty) {
            jtfUser.setHelperText("Hãy nhập tài khoản của bạn");
            jtfUser.grabFocus();
        }
        if (passEmpty) {
            jpfPass.setHelperText("Hãy nhập mật khẩu của bạn");
            if (!userEmpty) {
                jpfPass.grabFocus();
            }
        }
        if (!userEmpty && !passEmpty) {
            jtfUser.setHelperText(null);
            jpfPass.setHelperText(null);
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
            this.dispose();

            HomeManager_GUI = (HomeManager_GUI) SwingUtilities.getWindowAncestor(Login_GUI.this);
            HomeManager_GUI = new HomeManager_GUI();
            HomeManager_GUI.setVisible(true);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Customs.Button btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlContent1;
    private javax.swing.JLabel jlContent2;
    private javax.swing.JLabel jlHello;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpFormLogin;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpRight;
    private Customs.PasswordField jpfPass;
    private Customs.TextField jtfUser;
    // End of variables declaration//GEN-END:variables
}
