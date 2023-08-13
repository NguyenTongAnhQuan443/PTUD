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

    private Revenue_GUI revenue_GUI;
    public HomeManager_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        cbLanguage = new GUI.Combobox();
        jlDisplay = new javax.swing.JLabel();
        cbDisplay = new GUI.Combobox();
        jpTop = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        lbNameShop = new javax.swing.JLabel();
        jpCenter = new javax.swing.JPanel();
        jpStatistical1 = new javax.swing.JPanel();
        jpOrder1 = new javax.swing.JPanel();
        jlTitleOrder1 = new javax.swing.JLabel();
        jlNumOrder1 = new javax.swing.JLabel();
        jlUnitOrder1 = new javax.swing.JLabel();
        jlIconOrder1 = new javax.swing.JLabel();
        jpRevenueDay1 = new javax.swing.JPanel();
        jlTitleRevenueDay1 = new javax.swing.JLabel();
        jlDayMoney1 = new javax.swing.JLabel();
        jlVND4 = new javax.swing.JLabel();
        jlIconDay1 = new javax.swing.JLabel();
        jpRevenueMonth1 = new javax.swing.JPanel();
        jlTitleRevenueMonth1 = new javax.swing.JLabel();
        jlVND5 = new javax.swing.JLabel();
        jlMonthMoney1 = new javax.swing.JLabel();
        jlIconMonthMoney1 = new javax.swing.JLabel();
        jpRevenueYear1 = new javax.swing.JPanel();
        jlTitleRevenueYear1 = new javax.swing.JLabel();
        jlYearMoney1 = new javax.swing.JLabel();
        jlVND6 = new javax.swing.JLabel();
        jlIconYear1 = new javax.swing.JLabel();
        jlSearch1 = new javax.swing.JLabel();
        jtfStartDay1 = new javax.swing.JTextField();
        jlStartDay1 = new javax.swing.JLabel();
        jlEndDay1 = new javax.swing.JLabel();
        jtfEndDay1 = new javax.swing.JTextField();
        jlIconStartDay1 = new javax.swing.JLabel();
        jlIconEndDay1 = new javax.swing.JLabel();
        btnSearch1 = new GUI.Button();
        jpStatistical2 = new javax.swing.JPanel();
        btnRevenue = new GUI.Button();
        btnProduct = new GUI.Button();
        jpTMP = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fley shop quản lý bán hàng");
        setResizable(false);

        jpMain.setBackground(new java.awt.Color(204, 255, 255));
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
        jlSale.setText("Khuyễn mãi");

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
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jpLeftLayout.setVerticalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlLanguage)
                    .addComponent(cbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlLogout)
                .addGap(18, 18, 18)
                .addComponent(jlExit)
                .addGap(14, 14, 14))
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

        jpCenter.setBackground(new java.awt.Color(255, 255, 255));

        jpStatistical1.setBackground(new java.awt.Color(255, 255, 255));
        jpStatistical1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jpOrder1.setBackground(new java.awt.Color(204, 204, 255));

        jlTitleOrder1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlTitleOrder1.setForeground(new java.awt.Color(255, 255, 255));
        jlTitleOrder1.setText("Tổng số đơn hàng");

        jlNumOrder1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlNumOrder1.setForeground(new java.awt.Color(255, 255, 255));
        jlNumOrder1.setText("0");

        jlUnitOrder1.setBackground(new java.awt.Color(255, 255, 255));
        jlUnitOrder1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlUnitOrder1.setForeground(new java.awt.Color(255, 255, 255));
        jlUnitOrder1.setText("đơn hàng");

        jlIconOrder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/market64.png"))); // NOI18N

        javax.swing.GroupLayout jpOrder1Layout = new javax.swing.GroupLayout(jpOrder1);
        jpOrder1.setLayout(jpOrder1Layout);
        jpOrder1Layout.setHorizontalGroup(
            jpOrder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOrder1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlNumOrder1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jlUnitOrder1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlIconOrder1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOrder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitleOrder1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpOrder1Layout.setVerticalGroup(
            jpOrder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOrder1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jlTitleOrder1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpOrder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumOrder1)
                    .addComponent(jlUnitOrder1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOrder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconOrder1)
                .addContainerGap())
        );

        jpRevenueDay1.setBackground(new java.awt.Color(255, 204, 255));

        jlTitleRevenueDay1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlTitleRevenueDay1.setForeground(new java.awt.Color(255, 255, 255));
        jlTitleRevenueDay1.setText("Tổng doanh thu ngày");

        jlDayMoney1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlDayMoney1.setForeground(new java.awt.Color(255, 255, 255));
        jlDayMoney1.setText("0");

        jlVND4.setBackground(new java.awt.Color(255, 255, 255));
        jlVND4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlVND4.setForeground(new java.awt.Color(255, 255, 255));
        jlVND4.setText("VND");

        jlIconDay1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/day64.png"))); // NOI18N

        javax.swing.GroupLayout jpRevenueDay1Layout = new javax.swing.GroupLayout(jpRevenueDay1);
        jpRevenueDay1.setLayout(jpRevenueDay1Layout);
        jpRevenueDay1Layout.setHorizontalGroup(
            jpRevenueDay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRevenueDay1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpRevenueDay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpRevenueDay1Layout.createSequentialGroup()
                        .addComponent(jlTitleRevenueDay1)
                        .addGap(49, 49, 49))
                    .addGroup(jpRevenueDay1Layout.createSequentialGroup()
                        .addComponent(jlDayMoney1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlVND4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconDay1)
                        .addContainerGap())))
        );
        jpRevenueDay1Layout.setVerticalGroup(
            jpRevenueDay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRevenueDay1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitleRevenueDay1)
                .addGroup(jpRevenueDay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRevenueDay1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpRevenueDay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDayMoney1)
                            .addComponent(jlVND4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRevenueDay1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlIconDay1)
                        .addContainerGap())))
        );

        jpRevenueMonth1.setBackground(new java.awt.Color(153, 204, 255));

        jlTitleRevenueMonth1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlTitleRevenueMonth1.setForeground(new java.awt.Color(255, 255, 255));
        jlTitleRevenueMonth1.setText("Tổng doanh thu tháng");

        jlVND5.setBackground(new java.awt.Color(255, 255, 255));
        jlVND5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlVND5.setForeground(new java.awt.Color(255, 255, 255));
        jlVND5.setText("VND");

        jlMonthMoney1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlMonthMoney1.setForeground(new java.awt.Color(255, 255, 255));
        jlMonthMoney1.setText("0");

        jlIconMonthMoney1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mounth64.png"))); // NOI18N

        javax.swing.GroupLayout jpRevenueMonth1Layout = new javax.swing.GroupLayout(jpRevenueMonth1);
        jpRevenueMonth1.setLayout(jpRevenueMonth1Layout);
        jpRevenueMonth1Layout.setHorizontalGroup(
            jpRevenueMonth1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRevenueMonth1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRevenueMonth1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRevenueMonth1Layout.createSequentialGroup()
                        .addComponent(jlTitleRevenueMonth1)
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(jpRevenueMonth1Layout.createSequentialGroup()
                        .addComponent(jlMonthMoney1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlVND5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconMonthMoney1)))
                .addContainerGap())
        );
        jpRevenueMonth1Layout.setVerticalGroup(
            jpRevenueMonth1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRevenueMonth1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitleRevenueMonth1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRevenueMonth1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRevenueMonth1Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jlIconMonthMoney1))
                    .addGroup(jpRevenueMonth1Layout.createSequentialGroup()
                        .addGroup(jpRevenueMonth1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlVND5)
                            .addComponent(jlMonthMoney1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpRevenueYear1.setBackground(new java.awt.Color(0, 204, 204));

        jlTitleRevenueYear1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlTitleRevenueYear1.setForeground(new java.awt.Color(255, 255, 255));
        jlTitleRevenueYear1.setText("Tổng doanh thu năm");

        jlYearMoney1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlYearMoney1.setForeground(new java.awt.Color(255, 255, 255));
        jlYearMoney1.setText("0");

        jlVND6.setBackground(new java.awt.Color(255, 255, 255));
        jlVND6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlVND6.setForeground(new java.awt.Color(255, 255, 255));
        jlVND6.setText("VND");

        jlIconYear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/year64.png"))); // NOI18N

        javax.swing.GroupLayout jpRevenueYear1Layout = new javax.swing.GroupLayout(jpRevenueYear1);
        jpRevenueYear1.setLayout(jpRevenueYear1Layout);
        jpRevenueYear1Layout.setHorizontalGroup(
            jpRevenueYear1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRevenueYear1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRevenueYear1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRevenueYear1Layout.createSequentialGroup()
                        .addComponent(jlTitleRevenueYear1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpRevenueYear1Layout.createSequentialGroup()
                        .addComponent(jlYearMoney1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVND6)
                        .addGap(18, 18, 18)
                        .addComponent(jlIconYear1)))
                .addContainerGap())
        );
        jpRevenueYear1Layout.setVerticalGroup(
            jpRevenueYear1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRevenueYear1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitleRevenueYear1)
                .addGroup(jpRevenueYear1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRevenueYear1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpRevenueYear1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlVND6)
                            .addComponent(jlYearMoney1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRevenueYear1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlIconYear1)
                        .addContainerGap())))
        );

        jlSearch1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlSearch1.setText("Lọc theo thời gian :");

        jtfStartDay1.setEditable(false);
        jtfStartDay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfStartDay1ActionPerformed(evt);
            }
        });

        jlStartDay1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlStartDay1.setText("Ngày bắt đầu :");

        jlEndDay1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlEndDay1.setText("Ngày kết thúc :");

        jtfEndDay1.setEditable(false);
        jtfEndDay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEndDay1ActionPerformed(evt);
            }
        });

        jlIconStartDay1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar24.png"))); // NOI18N
        jlIconStartDay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlIconStartDay1MouseClicked(evt);
            }
        });

        jlIconEndDay1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar24.png"))); // NOI18N
        jlIconEndDay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlIconEndDay1MouseClicked(evt);
            }
        });

        btnSearch1.setBackground(new java.awt.Color(255, 204, 204));
        btnSearch1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search24.png"))); // NOI18N
        btnSearch1.setText("Tìm kiếm");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpStatistical1Layout = new javax.swing.GroupLayout(jpStatistical1);
        jpStatistical1.setLayout(jpStatistical1Layout);
        jpStatistical1Layout.setHorizontalGroup(
            jpStatistical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatistical1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpStatistical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpStatistical1Layout.createSequentialGroup()
                        .addComponent(jlSearch1)
                        .addGap(143, 143, 143)
                        .addComponent(jlStartDay1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfStartDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconStartDay1))
                    .addGroup(jpStatistical1Layout.createSequentialGroup()
                        .addComponent(jpOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpRevenueDay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jpStatistical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpStatistical1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jlEndDay1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEndDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconEndDay1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jpStatistical1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpRevenueMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpRevenueYear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jpStatistical1Layout.setVerticalGroup(
            jpStatistical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatistical1Layout.createSequentialGroup()
                .addGroup(jpStatistical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpRevenueMonth1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpRevenueYear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpRevenueDay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpOrder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpStatistical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpStatistical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpStatistical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEndDay1)
                            .addComponent(jtfEndDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpStatistical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIconStartDay1)
                            .addGroup(jpStatistical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlSearch1)
                                .addComponent(jlStartDay1)
                                .addComponent(jtfStartDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpStatistical1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jlIconEndDay1))))
        );

        jpStatistical2.setBackground(new java.awt.Color(255, 255, 255));

        btnRevenue.setBackground(new java.awt.Color(204, 204, 255));
        btnRevenue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRevenue.setText("Doanh thu");
        btnRevenue.setEffectColor(new java.awt.Color(0, 0, 0));
        btnRevenue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevenueActionPerformed(evt);
            }
        });

        btnProduct.setBackground(new java.awt.Color(204, 204, 255));
        btnProduct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProduct.setText("Sản phẩm");
        btnProduct.setEffectColor(new java.awt.Color(0, 0, 0));
        btnProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        jpTMP.setBackground(new java.awt.Color(255, 255, 255));
        jpTMP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jpTMPLayout = new javax.swing.GroupLayout(jpTMP);
        jpTMP.setLayout(jpTMPLayout);
        jpTMPLayout.setHorizontalGroup(
            jpTMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpTMPLayout.setVerticalGroup(
            jpTMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpStatistical2Layout = new javax.swing.GroupLayout(jpStatistical2);
        jpStatistical2.setLayout(jpStatistical2Layout);
        jpStatistical2Layout.setHorizontalGroup(
            jpStatistical2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatistical2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(931, Short.MAX_VALUE))
            .addComponent(jpTMP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpStatistical2Layout.setVerticalGroup(
            jpStatistical2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatistical2Layout.createSequentialGroup()
                .addGroup(jpStatistical2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpCenterLayout = new javax.swing.GroupLayout(jpCenter);
        jpCenter.setLayout(jpCenterLayout);
        jpCenterLayout.setHorizontalGroup(
            jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCenterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpStatistical1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpStatistical2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpCenterLayout.setVerticalGroup(
            jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCenterLayout.createSequentialGroup()
                .addComponent(jpStatistical1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpStatistical2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMain.add(jpCenter, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
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
            jpCenter.setBackground(Color.BLACK);
            System.out.println("đen nè");
            JOptionPane.showMessageDialog(this, "đen nè");
            this.repaint();
        }
    }//GEN-LAST:event_cbDisplayActionPerformed

    private void jlChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlChangePassMouseClicked

    }//GEN-LAST:event_jlChangePassMouseClicked

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void jlIconEndDay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconEndDay1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlIconEndDay1MouseClicked

    private void jlIconStartDay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconStartDay1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlIconStartDay1MouseClicked

    private void jtfEndDay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEndDay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEndDay1ActionPerformed

    private void jtfStartDay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfStartDay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfStartDay1ActionPerformed

    private void btnRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevenueActionPerformed
//        Show panel doanh thu
revenue_GUI = new Revenue_GUI();
    jpTMP.removeAll();

    jpTMP.setLayout(new FlowLayout());
    jpTMP.add(revenue_GUI);

    jpTMP.revalidate();
    jpTMP.repaint();
    }//GEN-LAST:event_btnRevenueActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductActionPerformed

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
    private GUI.Button btnProduct;
    private GUI.Button btnRevenue;
    private GUI.Button btnSearch1;
    private GUI.Combobox cbDisplay;
    private GUI.Combobox cbLanguage;
    private javax.swing.JLabel jlBill;
    private javax.swing.JLabel jlChangePass;
    private javax.swing.JLabel jlCustomer;
    private javax.swing.JLabel jlDayMoney1;
    private javax.swing.JLabel jlDisplay;
    private javax.swing.JLabel jlEndDay1;
    private javax.swing.JLabel jlExit;
    private javax.swing.JLabel jlHistory;
    private javax.swing.JLabel jlIconDay1;
    private javax.swing.JLabel jlIconEndDay1;
    private javax.swing.JLabel jlIconMonthMoney1;
    private javax.swing.JLabel jlIconOrder1;
    private javax.swing.JLabel jlIconStartDay1;
    private javax.swing.JLabel jlIconYear1;
    private javax.swing.JLabel jlLanguage;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlLogout;
    private javax.swing.JLabel jlMonthMoney1;
    private javax.swing.JLabel jlNumOrder1;
    private javax.swing.JLabel jlProduct;
    private javax.swing.JLabel jlSale;
    private javax.swing.JLabel jlSearch1;
    private javax.swing.JLabel jlStaff;
    private javax.swing.JLabel jlStartDay1;
    private javax.swing.JLabel jlTitleOrder1;
    private javax.swing.JLabel jlTitleRevenueDay1;
    private javax.swing.JLabel jlTitleRevenueMonth1;
    private javax.swing.JLabel jlTitleRevenueYear1;
    private javax.swing.JLabel jlUnitOrder1;
    private javax.swing.JLabel jlVND4;
    private javax.swing.JLabel jlVND5;
    private javax.swing.JLabel jlVND6;
    private javax.swing.JLabel jlYearMoney1;
    private javax.swing.JPanel jpCenter;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpOrder1;
    private javax.swing.JPanel jpRevenueDay1;
    private javax.swing.JPanel jpRevenueMonth1;
    private javax.swing.JPanel jpRevenueYear1;
    private javax.swing.JPanel jpStatistical1;
    private javax.swing.JPanel jpStatistical2;
    private javax.swing.JPanel jpTMP;
    private javax.swing.JPanel jpTop;
    private javax.swing.JTextField jtfEndDay1;
    private javax.swing.JTextField jtfStartDay1;
    private javax.swing.JLabel lbNameShop;
    private javax.swing.JLabel lbStatistical;
    // End of variables declaration//GEN-END:variables
}
