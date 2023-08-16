package GUI;

/*
Thống kê :
+ Tổng số đơn hàng mặc định là đơn hàng trong ngày, nếu lọc thì sẽ từ ngày A -> ngày B
+ Tổng doanh thu ngày mặc định là doanh thu của ngày đó, nếu lọc thì sẽ từ ngày A -> ngày B
+ Tổng doanh thu tháng mặc định là doanh thu của tháng đó, nếu lọc thì sẽ từ tháng A -> tháng B
+ Tổng doanh thu năm mặc định là doanh thu của năm đó, nếu lọc thì sẽ từ năm A -> năm B
+ Biến jlNumOrder để gắn giá trị đơn hàng
+ Biến jlDayMoney để gắn giá trị doanh thu ngày
+ Biến jlMonthMoney để gắn giá trị doanh thu tháng
+ Biến jlYearMoney để gắn giá trị doanh thu năm
 */
import com.raven.datechooser.DateChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utils.Utils;

public class HomeManager_GUI extends javax.swing.JFrame {

//    private l statistical_GUI;
    public HomeManager_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);

        Statistical_GUI statistical_GUI = new Statistical_GUI();
        jpMain.add(statistical_GUI, BorderLayout.CENTER);
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jpLeft = new javax.swing.JPanel();
        jlProduct = new javax.swing.JLabel();
        jlStaff = new javax.swing.JLabel();
        jlBill = new javax.swing.JLabel();
        jlCustomer = new javax.swing.JLabel();
        jlHistory = new javax.swing.JLabel();
        jlSale = new javax.swing.JLabel();
        jlChangePass = new javax.swing.JLabel();
        jlLanguage = new javax.swing.JLabel();
        jlLogout = new javax.swing.JLabel();
        lbStatistical = new javax.swing.JLabel();
        jlExit = new javax.swing.JLabel();
        cbLanguage = new Customs.Combobox();
        jlDisplay = new javax.swing.JLabel();
        cbDisplay = new Customs.Combobox();
        jpTop = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        lbNameShop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fley shop quản lý bán hàng");

        jpMain.setBackground(new java.awt.Color(255, 255, 255));
        jpMain.setLayout(new java.awt.BorderLayout());

        jpLeft.setBackground(new java.awt.Color(0, 128, 128));

        jlProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlProduct.setForeground(new java.awt.Color(255, 255, 255));
        jlProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product32.png"))); // NOI18N
        jlProduct.setText("Sản phẩm");

        jlStaff.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlStaff.setForeground(new java.awt.Color(255, 255, 255));
        jlStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/staff32.png"))); // NOI18N
        jlStaff.setText("Nhân viên");

        jlBill.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlBill.setForeground(new java.awt.Color(255, 255, 255));
        jlBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bill32.png"))); // NOI18N
        jlBill.setText("Hóa đơn");

        jlCustomer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCustomer.setForeground(new java.awt.Color(255, 255, 255));
        jlCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer32.png"))); // NOI18N
        jlCustomer.setText("Khách hàng");

        jlHistory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlHistory.setForeground(new java.awt.Color(255, 255, 255));
        jlHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/history32.png"))); // NOI18N
        jlHistory.setText("Lịch sử");

        jlSale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlSale.setForeground(new java.awt.Color(255, 255, 255));
        jlSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sale32.png"))); // NOI18N
        jlSale.setText("Khuyến mãi");

        jlChangePass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlChangePass.setForeground(new java.awt.Color(255, 255, 255));
        jlChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key32.png"))); // NOI18N
        jlChangePass.setText("Đổi mật khẩu");
        jlChangePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlChangePassMouseClicked(evt);
            }
        });

        jlLanguage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlLanguage.setForeground(new java.awt.Color(255, 255, 255));
        jlLanguage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/language32.png"))); // NOI18N

        jlLogout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlLogout.setForeground(new java.awt.Color(255, 255, 255));
        jlLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout32.png"))); // NOI18N
        jlLogout.setText("Đăng xuất");

        lbStatistical.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbStatistical.setForeground(new java.awt.Color(255, 255, 255));
        lbStatistical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chart32.png"))); // NOI18N
        lbStatistical.setText("Thống kê");
        lbStatistical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbStatisticalMouseClicked(evt);
            }
        });

        jlExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlExit.setForeground(new java.awt.Color(255, 255, 255));
        jlExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit32.png"))); // NOI18N
        jlExit.setText("Thoát");

        cbLanguage.setBackground(new java.awt.Color(0, 128, 128));
        cbLanguage.setForeground(new java.awt.Color(255, 255, 255));
        cbLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ngôn ngữ", "Tiếng Việt", "English" }));
        cbLanguage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbLanguage.setLabeText("");
        cbLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLanguageActionPerformed(evt);
            }
        });

        jlDisplay.setForeground(new java.awt.Color(255, 255, 255));
        jlDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/display32.png"))); // NOI18N

        cbDisplay.setBackground(new java.awt.Color(0, 128, 128));
        cbDisplay.setForeground(new java.awt.Color(255, 255, 255));
        cbDisplay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Giao diện", "Tối", "Sáng" }));
        cbDisplay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbDisplay.setLabeText("");
        cbDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLeftLayout = new javax.swing.GroupLayout(jpLeft);
        jpLeft.setLayout(jpLeftLayout);
        jpLeftLayout.setHorizontalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLeftLayout.createSequentialGroup()
                        .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlLanguage)
                            .addComponent(jlDisplay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jlLogout)
                    .addComponent(jlHistory)
                    .addComponent(jlBill)
                    .addComponent(jlStaff)
                    .addComponent(lbStatistical)
                    .addComponent(jlProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlChangePass)
                    .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jlSale, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlExit))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpLeftLayout.setVerticalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbStatistical)
                .addGap(18, 18, 18)
                .addComponent(jlProduct)
                .addGap(18, 18, 18)
                .addComponent(jlStaff)
                .addGap(18, 18, 18)
                .addComponent(jlBill)
                .addGap(18, 18, 18)
                .addComponent(jlCustomer)
                .addGap(18, 18, 18)
                .addComponent(jlHistory)
                .addGap(18, 18, 18)
                .addComponent(jlSale)
                .addGap(18, 18, 18)
                .addComponent(jlChangePass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlDisplay)
                    .addComponent(cbDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlLanguage)
                    .addComponent(cbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlLogout)
                .addGap(18, 18, 18)
                .addComponent(jlExit)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jpMain.add(jpLeft, java.awt.BorderLayout.LINE_START);

        jpTop.setBackground(new java.awt.Color(0, 128, 128));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo64.png"))); // NOI18N

        lbNameShop.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lbNameShop.setForeground(new java.awt.Color(255, 255, 255));
        lbNameShop.setText("Fley Shop");

        javax.swing.GroupLayout jpTopLayout = new javax.swing.GroupLayout(jpTop);
        jpTop.setLayout(jpTopLayout);
        jpTopLayout.setHorizontalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jlLogo)
                .addGap(18, 18, 18)
                .addComponent(lbNameShop, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1001, Short.MAX_VALUE))
        );
        jpTopLayout.setVerticalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTopLayout.createSequentialGroup()
                        .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTopLayout.createSequentialGroup()
                        .addComponent(lbNameShop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        jpMain.add(jpTop, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLanguageActionPerformed
        if (cbLanguage.getSelectedIndex() == 1) {
            Utils.dd(0);
            setText();
        } else if (cbLanguage.getSelectedIndex() == 2) {
            Utils.dd(1);
            setText();
        }
    }//GEN-LAST:event_cbLanguageActionPerformed

    private void cbDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDisplayActionPerformed
        if (cbDisplay.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(this, "đen nè");
            this.repaint();
        }
    }//GEN-LAST:event_cbDisplayActionPerformed

    private void jlChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlChangePassMouseClicked

    }//GEN-LAST:event_jlChangePassMouseClicked

    private void lbStatisticalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbStatisticalMouseClicked

    }//GEN-LAST:event_lbStatisticalMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeManager_GUI().setVisible(true);
            }
        });
    }

    public void setText() {
        lbStatistical.setText(Utils.thongKe);
        jlProduct.setText(Utils.sanPham);
        jlStaff.setText(Utils.nhanVien);
        jlBill.setText(Utils.hoaDon);
        jlCustomer.setText(Utils.khachHang);
        jlHistory.setText(Utils.lichSu);
        jlSale.setText(Utils.khuyenMai);
        jlChangePass.setText(Utils.doiMK);
        jlLogout.setText(Utils.dangXuat);
        String obj[] = {Utils.giaoDien, Utils.toi, Utils.sang};
        DefaultComboBoxModel model = new DefaultComboBoxModel(obj);
        cbDisplay.setModel(model);

        String objEnglish[] = {Utils.ngonNgu, Utils.vietNam, Utils.english};
        DefaultComboBoxModel modelEnglish = new DefaultComboBoxModel(objEnglish);
        cbLanguage.setModel(modelEnglish);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Customs.Combobox cbDisplay;
    private Customs.Combobox cbLanguage;
    private javax.swing.JLabel jlBill;
    private javax.swing.JLabel jlChangePass;
    private javax.swing.JLabel jlCustomer;
    private javax.swing.JLabel jlDisplay;
    private javax.swing.JLabel jlExit;
    private javax.swing.JLabel jlHistory;
    private javax.swing.JLabel jlLanguage;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlLogout;
    private javax.swing.JLabel jlProduct;
    private javax.swing.JLabel jlSale;
    private javax.swing.JLabel jlStaff;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpTop;
    private javax.swing.JLabel lbNameShop;
    private javax.swing.JLabel lbStatistical;
    // End of variables declaration//GEN-END:variables
}
