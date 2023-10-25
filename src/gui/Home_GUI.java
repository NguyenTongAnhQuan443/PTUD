package gui;

import dao.Province_DAO;
import dao.Staff_DAO;
import entity.Flag;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GraphicsDevice;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lib2.MenuEvent;

public class Home_GUI extends javax.swing.JFrame {

    private Statistical_GUI1 statistical_GUI;
    private Statistical_Revenue_GUI statistical_Revenue_GUI;
    private Statistical_Product_GUI statistical_Product_GUI;
    private Statistical_Staff_GUI statistical_Staff_GUI;
    private Sell_GUI sell_GUI;
    private Supplier_GUI supplier_GUI;
    private Product_GUI product_GUI;
//    private Staff_GUI staff_GUI;
    private Staff_GUI1 staff_GUI;
    private History_GUI history_GUI;
    private Promotion_GUI promotion_GUI;
    private Staff_InfoStaff_GUI_1 staff_InfoStaff_GUI;
    private ChangePassword_GUI changePassword_GUI;
    private Customer_GUI customer_GUI;

    public Home_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        jpCenter.removeAll();
        statistical_GUI = new Statistical_GUI1();
        statistical_GUI.setJPRevenue();
        addJPanel(statistical_GUI);

// Sụ kiện mở các menu
        menu1.setEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex) {
                if (index == 0 && subIndex == 1) { // sự kiện menu thống kê - doanh thu
                    stopWebcam();
                    jpCenter.removeAll();
                    statistical_GUI = new Statistical_GUI1();
                    statistical_GUI.setJPRevenue();
                    addJPanel(statistical_GUI);
                } else if (index == 0 && subIndex == 2) { // sự kiện menu thống kê - nhân viên
                    stopWebcam();
                    jpCenter.removeAll();
                    statistical_GUI = new Statistical_GUI1();
                    statistical_GUI.setJPStaff();
                    addJPanel(statistical_GUI);
                } else if (index == 0 && subIndex == 3) { // sự kiện menu thống kê - sản phẩm
                    stopWebcam();
                    jpCenter.removeAll();
                    statistical_GUI = new Statistical_GUI1();
                    statistical_GUI.setJPProduct();
                    addJPanel(statistical_GUI);
                } else if (index == 0 && subIndex == 4) { // sự kiện menu thống kê - khách hàng
                    stopWebcam();
                    jpCenter.removeAll();
                    statistical_GUI = new Statistical_GUI1();
                    statistical_GUI.setJPCustomer();
                    addJPanel(statistical_GUI);
                } else if (index == 1) { // sự kiện menu nhà cung cấp
                    stopWebcam();
                    jpCenter.removeAll();
                    supplier_GUI = new Supplier_GUI();
                    addJPanel(supplier_GUI);

                } else if (index == 2) { // sự kiện menu sản phẩm
                    stopWebcam();
                    jpCenter.removeAll();
                    product_GUI = new Product_GUI();
                    addJPanel(product_GUI);
                } else if (index == 3 && subIndex == 1) { // sự kiện menu nhân viên - danh sách nhân viên
                    Flag.setFlagStaffGUI(true); // mở GUI danh sách nhân viên
                    stopWebcam();
                    jpCenter.removeAll();
                    staff_GUI = new Staff_GUI1();
                    addJPanel(staff_GUI);
                } else if (index == 3 && subIndex == 2) { // sự kiện menu nhân viên - danh sách thôi việc nhân viên
                    Flag.setFlagStaffGUI(false); // mở GUI danh sách nghỉ việc
                    stopWebcam();
                    jpCenter.removeAll();
                    staff_GUI = new Staff_GUI1();
                    addJPanel(staff_GUI);
                } else if (index == 4) { // sự kiện memu bán hàng
                    stopWebcam();
                    jpCenter.removeAll();
                    sell_GUI = new Sell_GUI();
                    addJPanel(sell_GUI);
                } else if (index == 5 && subIndex == 1) { // sự kiện menu lịch sử bán hàng - danh sách hàng đã giao
                    stopWebcam();
                    jpCenter.removeAll();
                    history_GUI = new History_GUI();
                    addJPanel(history_GUI);
                } else if (index == 5 && subIndex == 2) { // sự kiện menu lịch sử bán hàng - danh sách hàng đang giao
                    stopWebcam();
                    jpCenter.removeAll();
//                    history_GUI = new History_GUI();
//                    addJPanel(history_GUI);
                    JOptionPane.showMessageDialog(null, "Chức năng này đang được phát triển. Xin cảm ơn !");
                } else if (index == 6) { // sự kiện menu khách hàng
                    stopWebcam();
                    jpCenter.removeAll();
                    customer_GUI = new Customer_GUI();
                    addJPanel(customer_GUI);
                } else if (index == 7) { // sự kiện menu khuyễn mãi
                    stopWebcam();
                    jpCenter.removeAll();
                    promotion_GUI = new Promotion_GUI();
                    addJPanel(promotion_GUI);
                } else if (index == 8 && subIndex == 1) { // sự kiện menu tài khoản - thông tin tài khoản
                    stopWebcam();
                    jpCenter.removeAll();
                    staff_InfoStaff_GUI = new Staff_InfoStaff_GUI_1();
                    addJPanel(staff_InfoStaff_GUI);
                } else if (index == 8 && subIndex == 2) { // sự kiện menu tài khoản - đổi mật khẩu
                    stopWebcam();
                    jpCenter.removeAll();
                    changePassword_GUI = new ChangePassword_GUI();
                    addJPanel(changePassword_GUI);
                }

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jpTop = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        jlNameShop = new javax.swing.JLabel();
        jpLeft = new javax.swing.JPanel();
        scrollPaneWin111 = new lib2.ScrollPaneWin11();
        menu1 = new lib2.Menu();
        jpCenter = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMain.setLayout(new java.awt.BorderLayout());

        jpTop.setBackground(new java.awt.Color(0, 128, 128));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/Logo64.png"))); // NOI18N

        jlNameShop.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jlNameShop.setForeground(new java.awt.Color(255, 255, 255));
        jlNameShop.setText("Fley Shop");

        javax.swing.GroupLayout jpTopLayout = new javax.swing.GroupLayout(jpTop);
        jpTop.setLayout(jpTopLayout);
        jpTopLayout.setHorizontalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jlLogo)
                .addGap(18, 18, 18)
                .addComponent(jlNameShop, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(871, Short.MAX_VALUE))
        );
        jpTopLayout.setVerticalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTopLayout.createSequentialGroup()
                .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlNameShop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMain.add(jpTop, java.awt.BorderLayout.PAGE_START);

        jpLeft.setBackground(new java.awt.Color(255, 204, 204));

        scrollPaneWin111.setViewportView(menu1);

        javax.swing.GroupLayout jpLeftLayout = new javax.swing.GroupLayout(jpLeft);
        jpLeft.setLayout(jpLeftLayout);
        jpLeftLayout.setHorizontalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );
        jpLeftLayout.setVerticalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        jpMain.add(jpLeft, java.awt.BorderLayout.LINE_START);

        jpCenter.setBackground(new java.awt.Color(255, 255, 255));
        jpCenter.setLayout(new java.awt.GridLayout(1, 0));
        jpMain.add(jpCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void stopWebcam() {
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
    }

    public void addJPanel(JPanel jPanel) {
        jpCenter.add(jPanel);
        jpCenter.revalidate();
        jpCenter.repaint();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_GUI().setVisible(true);
            }
        });
    }

    public JPanel getJpCenter() {
        return jpCenter;
    }

    public void setJpCenter(JPanel jpCenter) {
        this.jpCenter = jpCenter;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlNameShop;
    public javax.swing.JPanel jpCenter;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpTop;
    private lib2.Menu menu1;
    private lib2.ScrollPaneWin11 scrollPaneWin111;
    // End of variables declaration//GEN-END:variables
}
