package gui;

import entity.Flag;
import java.awt.Desktop;
import java.net.URI;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lib2.MenuEvent;

public class Home_GUI extends javax.swing.JFrame {

    private Supplier_GUI supplier_GUI;
    private Staff_GUI staff_GUI;
    private History_GUI history_GUI;
    private Staff_InfoStaff_GUI staff_InfoStaff_GUI;
    private ChangePassword_GUI changePassword_GUI;
    private Customer_GUI customer_GUI;
    private Sell_GUI sell_GUI;
    private ExchangeProduct_GUI exchangeProduct_GUI;

    private Revenue_Statistics_GUI revenueStatistics_GUI;
    private Product_Statistics_GUI product_Statistics_GUI;
    private Staff_Statistics_GUI staff_Statistics_GUI;
    private Customer_Statistics_GUI customer_Statistics_GUI;
    private Product_GUI product_GUI;

    public Home_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        jpCenter.removeAll();
        URL url = getClass().getResource("/images/icons/Home.jpg");
        ImageIcon icon = new ImageIcon(url);
        JLabel iconLabel = new JLabel(icon);
        jpCenter.add(iconLabel);

        menu1.setEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex) {
                if (index == 0 && subIndex == 1) {
                    // sự kiện menu thống kê - doanh thu
                    if (chekRights()) {
                        stopWebcam1();
                        stopWebcam2();
                        jpCenter.removeAll();
                        revenueStatistics_GUI = new Revenue_Statistics_GUI();
                        addJPanel(revenueStatistics_GUI);
                    } else {
                        JOptionPane.showMessageDialog(null, "Chức năng này chỉ dành cho tài nhân viên quản lý trân trọng !");
                    }
                } else if (index == 0 && subIndex == 2) {
                    // sự kiện menu thống kê - nhân viên
                    if (chekRights()) {
                        stopWebcam1();
                        stopWebcam2();
                        jpCenter.removeAll();
                        staff_Statistics_GUI = new Staff_Statistics_GUI();
                        addJPanel(staff_Statistics_GUI);
                    } else {
                        JOptionPane.showMessageDialog(null, "Chức năng này chỉ dành cho tài nhân viên quản lý trân trọng !");
                    }
                } else if (index == 0 && subIndex == 3) {
                    // sự kiện menu thống kê - sản phẩm
                    stopWebcam1();
                    stopWebcam2();
                    jpCenter.removeAll();
                    product_Statistics_GUI = new Product_Statistics_GUI();
                    addJPanel(product_Statistics_GUI);
                } else if (index == 0 && subIndex == 4) {
                    // sự kiện menu thống kê - khách hàng
                    stopWebcam1();
                    stopWebcam2();
                    jpCenter.removeAll();
                    customer_Statistics_GUI = new Customer_Statistics_GUI();
                    addJPanel(customer_Statistics_GUI);
                } else if (index == 1) {
                    // sự kiện menu nhà cung cấp
                    if (chekRights()) {
                        stopWebcam1();
                        stopWebcam2();
                        jpCenter.removeAll();
                        supplier_GUI = new Supplier_GUI();
                        addJPanel(supplier_GUI);
                    } else {
                        JOptionPane.showMessageDialog(null, "Chức năng này chỉ dành cho tài nhân viên quản lý trân trọng !");
                    }
                } else if (index == 2) {
                    // sự kiện menu sản phẩm
                    stopWebcam1();
                    stopWebcam2();
                    jpCenter.removeAll();
                    product_GUI = new Product_GUI();
                    addJPanel(product_GUI);
                } else if (index == 3) {
                    // sự kiện menu nhân viên - danh sách nhân viên
                    if (chekRights()) {
                        if (subIndex == 1) {
                            Flag.setFlagStaffGUI(true);
                            stopWebcam1();
                            stopWebcam2();
                            jpCenter.removeAll();
                            staff_GUI = new Staff_GUI();
                            addJPanel(staff_GUI);
                        } else if (subIndex == 2) {
                            Flag.setFlagStaffGUI(false);
                            stopWebcam1();
                            stopWebcam2();
                            jpCenter.removeAll();
                            staff_GUI = new Staff_GUI();
                            addJPanel(staff_GUI);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Chức năng này chỉ dành cho tài nhân viên quản lý trân trọng !");
                    }

                } else if (index == 4) {
                    // sự kiện mở menu bán hàng
                    if (subIndex == 1) {
                        stopWebcam1();
                        stopWebcam2();
                        jpCenter.removeAll();
                        sell_GUI = new Sell_GUI();
                        addJPanel(sell_GUI);
                    } else if (subIndex == 2) {
                        if (chekRights()) {
                            stopWebcam1();
                            stopWebcam2();
                            jpCenter.removeAll();
                            exchangeProduct_GUI = new ExchangeProduct_GUI();
                            addJPanel(exchangeProduct_GUI);
                        } else {
                            JOptionPane.showMessageDialog(null, "Chức năng này chỉ dành cho tài nhân viên quản lý trân trọng !");
                        }
                    }
                } else if (index == 5) {
                    // sự kiện menu lịch sử bán hàng
                    stopWebcam1();
                    stopWebcam2();
                    jpCenter.removeAll();
                    history_GUI = new History_GUI();
                    addJPanel(history_GUI);
                } else if (index == 6) {
                    // sự kiện menu khách hàng
                    stopWebcam1();
                    stopWebcam2();
                    jpCenter.removeAll();
                    customer_GUI = new Customer_GUI();
                    addJPanel(customer_GUI);
                } else if (index == 7) {
                    // sự kiện menu khuyễn mãi
                    stopWebcam1();
                    stopWebcam2();
                    jpCenter.removeAll();
                    Promotion_GUI promotion_GUI = new Promotion_GUI();
                    addJPanel(promotion_GUI);
                } else if (index == 8 && subIndex == 1) {
                    // sự kiện menu tài khoản - thông tin tài khoản
                    Flag.setFlagStaffInfo(3);
                    stopWebcam1();
                    stopWebcam2();
                    jpCenter.removeAll();
                    staff_InfoStaff_GUI = new Staff_InfoStaff_GUI();
                    addJPanel(staff_InfoStaff_GUI);
                } else if (index == 8 && subIndex == 2) {
                    // sự kiện menu tài khoản - đổi mật khẩu
                    stopWebcam1();
                    stopWebcam2();
                    jpCenter.removeAll();
                    changePassword_GUI = new ChangePassword_GUI();
                    addJPanel(changePassword_GUI);
                } else if (index == 9 && subIndex == 1) {
                    // sự kiện mở menu đổi phí VAT
                    if (chekRights()) {
                        stopWebcam1();
                        stopWebcam2();
                        VAT_GUI vat_gui = new VAT_GUI();
                        vat_gui.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Chức năng này chỉ dành cho tài nhân viên quản lý trân trọng !");
                    }
                } else if (index == 10) {
                    // Sự kiện mở menu giúp đỡ
                    if (subIndex == 1) {
                    } else if (subIndex == 2) {
                        openBrowser("https://www.facebook.com");
                    } else if (subIndex == 3) {
                        openBrowser("https://www.youtobe.com");
                    }
                } else if (index == 11) {
                    // sự kiện menu thoát
                    int option = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thoát không !", "Xác nhận kết thúc phiên làm vi", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }
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
        setTitle("Phần mềm quản lý bán quần áo FleyShop");
        setResizable(false);

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
                .addGap(121, 121, 121)
                .addComponent(jlLogo)
                .addGap(18, 18, 18)
                .addComponent(jlNameShop, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(834, Short.MAX_VALUE))
        );
        jpTopLayout.setVerticalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTopLayout.createSequentialGroup()
                .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpTopLayout.createSequentialGroup()
                .addGap(15, 15, 15)
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

    public void stopWebcam1() {
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
    }

    public void stopWebcam2() {
        if (exchangeProduct_GUI != null) {
            exchangeProduct_GUI.stopWebcam();
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

    public static void openBrowser(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean chekRights() {
        return Flag.isStaffManagerment();
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
