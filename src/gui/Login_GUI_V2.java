package gui;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import dao.Staff_DAO;
import connectDB.ConnectDB;
import entity.Flag;
import entity.Staff;
import java.util.ArrayList;
import java.util.List;
import lib2.Menu;

public class Login_GUI_V2 extends javax.swing.JFrame {

    private Staff_DAO staff_DAO = new Staff_DAO();
    private Staff staff = new Staff();

    public Login_GUI_V2() {
//        connectDB
        try {
            new ConnectDB().connect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        initComponents();
        this.setLocationRelativeTo(null);
//        Account default
        jtfUser.setText("NV0001");
        jpfPass.setText("04042003");
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
        btnLogin = new lib2.Button();
        jpfPass = new lib2.PasswordField();
        jtfUser = new lib2.TextField();
        jlTitle = new javax.swing.JLabel();
        jlForgotPass = new javax.swing.JLabel();
        textField1 = new lib2.TextField();

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

        jlForgotPass.setForeground(new java.awt.Color(102, 204, 255));
        jlForgotPass.setText("Bạn quên mật khẩu ?");
        jlForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlForgotPassMouseClicked(evt);
            }
        });

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
                .addComponent(jlForgotPass)
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
                .addComponent(jlForgotPass)
                .addGap(9, 9, 9))
        );

        textField1.setLabelText("KEY bản quyền");

        javax.swing.GroupLayout jpRightLayout = new javax.swing.GroupLayout(jpRight);
        jpRight.setLayout(jpRightLayout);
        jpRightLayout.setHorizontalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpFormLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jpRightLayout.setVerticalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jpFormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jpLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

            staff_DAO = new Staff_DAO();
            String id = jtfUser.getText().trim();
            char[] passwordChars = jpfPass.getPassword();
            String password = new String(passwordChars);
            boolean checkAccount = staff_DAO.isAccount(id, password);
            boolean checkStatus;
            if (staff_DAO.getStaffByID(id).getStatus().equals(Staff.convertStringToStatus("Đang làm"))) {
                checkStatus = true;

            } else {
                checkStatus = false;

            }
            boolean checkRights;
            if (staff_DAO.getStaffByID(id).getRights().equals(Staff.convertStringToRights("Nhân viên quản lý"))) {
                Flag.setStaffManagerment(true);
            } else {
                Flag.setStaffManagerment(false);
            }
            if (checkAccount == true) {
                if (checkStatus == true) {
                    this.dispose();
                    String nameStaff = staff_DAO.getNameAccount(id);

                    // lưu tài khoản đăng nhập
                    Flag.setIdStaff(id);
                    Flag.setPassStaff(password);

                    JOptionPane.showMessageDialog(this, "Nhân viên : " + nameStaff + " đã nhập vào hệ thống !");
                    Home_GUI home_GUI = new Home_GUI();
                    home_GUI.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Bạn không còn là nhân viên của cửa hàng !");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không chính xác vui lòng thử lại");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jlForgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlForgotPassMouseClicked
        String id = jtfUser.getText().trim();
        JOptionPane.showMessageDialog(null, "Bạn quên mật khẩu của mình ?");
        if (staff_DAO.checkAccountExits(id)) {
            String emailReceiver = staff_DAO.getEmailAccount(id); // lấy địa chỉ email của tài khoản
            String newPass = staff_DAO.randomPassword(); // tạo mật khẩu mới
            String titleEmail = "Tin nhắn cấp lại mật khẩu từ hệ thống FleyShop";
            String contentEmail1 = "Mật khẩu mới của bạn là: <b>" + newPass + "</b>";
            String contentEmail2 = "Vui lòng không cung cấp mật khẩu này cho bất kỳ ai. Xin cảm ơn !";
            String contentEmail = contentEmail1 + "<br>" + contentEmail2;

            staff_DAO.changePass(id, newPass); // thay đổi mật khẩu
            staff_DAO.sendPassToEmail(emailReceiver, contentEmail, titleEmail);
            JOptionPane.showMessageDialog(null, "Mật khẩu đã được cấp lại thông qua Email của bạn !");
        } else {
            JOptionPane.showMessageDialog(null, "Tài khoản không hợp lệ hoặc không tồn tại trên hệ thống");
        }

    }//GEN-LAST:event_jlForgotPassMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnLogin;
    private javax.swing.JLabel jlContent1;
    private javax.swing.JLabel jlContent2;
    private javax.swing.JLabel jlForgotPass;
    private javax.swing.JLabel jlHello;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpFormLogin;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpRight;
    private lib2.PasswordField jpfPass;
    private lib2.TextField jtfUser;
    private lib2.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
