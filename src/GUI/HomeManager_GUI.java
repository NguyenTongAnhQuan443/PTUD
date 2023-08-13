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
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utils.Utils;

public class HomeManager_GUI extends javax.swing.JFrame {

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
        jpStatistical = new javax.swing.JPanel();
        jpOrder = new javax.swing.JPanel();
        jlTitleOrder = new javax.swing.JLabel();
        jlNumOrder = new javax.swing.JLabel();
        jlUnitOrder = new javax.swing.JLabel();
        jlIconOrder = new javax.swing.JLabel();
        jpRevenueDay = new javax.swing.JPanel();
        jlTitleRevenueDay = new javax.swing.JLabel();
        jlDayMoney = new javax.swing.JLabel();
        jlVND1 = new javax.swing.JLabel();
        jlIconDay = new javax.swing.JLabel();
        jpRevenueMonth = new javax.swing.JPanel();
        jlTitleRevenueMonth = new javax.swing.JLabel();
        jlVND2 = new javax.swing.JLabel();
        jlMonthMoney = new javax.swing.JLabel();
        jlIconMonthMoney = new javax.swing.JLabel();
        jpRevenueYear = new javax.swing.JPanel();
        jlTitleRevenueYear = new javax.swing.JLabel();
        jlYearMoney = new javax.swing.JLabel();
        jlVND3 = new javax.swing.JLabel();
        jlIconYear = new javax.swing.JLabel();
        jlSearch = new javax.swing.JLabel();
        jtfStartDay = new javax.swing.JTextField();
        jlStartDay = new javax.swing.JLabel();
        jlEndDay = new javax.swing.JLabel();
        jtfEndDay = new javax.swing.JTextField();
        jlIconStartDay = new javax.swing.JLabel();
        jlIconEndDay = new javax.swing.JLabel();
        btnSearch = new GUI.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(1004, Short.MAX_VALUE))
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

        jpCenter.setBackground(new java.awt.Color(0, 255, 0));

        jpStatistical.setBackground(new java.awt.Color(255, 255, 255));
        jpStatistical.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jpOrder.setBackground(new java.awt.Color(204, 204, 255));

        jlTitleOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlTitleOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlTitleOrder.setText("Tổng số đơn hàng");

        jlNumOrder.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlNumOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlNumOrder.setText("0");

        jlUnitOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlUnitOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlUnitOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlUnitOrder.setText("đơn hàng");

        jlIconOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/market64.png"))); // NOI18N

        javax.swing.GroupLayout jpOrderLayout = new javax.swing.GroupLayout(jpOrder);
        jpOrder.setLayout(jpOrderLayout);
        jpOrderLayout.setHorizontalGroup(
            jpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOrderLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlNumOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jlUnitOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlIconOrder)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitleOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpOrderLayout.setVerticalGroup(
            jpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOrderLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jlTitleOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumOrder)
                    .addComponent(jlUnitOrder))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOrderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconOrder)
                .addContainerGap())
        );

        jpRevenueDay.setBackground(new java.awt.Color(255, 204, 255));

        jlTitleRevenueDay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlTitleRevenueDay.setForeground(new java.awt.Color(255, 255, 255));
        jlTitleRevenueDay.setText("Tổng doanh thu ngày");

        jlDayMoney.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlDayMoney.setForeground(new java.awt.Color(255, 255, 255));
        jlDayMoney.setText("0");

        jlVND1.setBackground(new java.awt.Color(255, 255, 255));
        jlVND1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlVND1.setForeground(new java.awt.Color(255, 255, 255));
        jlVND1.setText("VND");

        jlIconDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/day64.png"))); // NOI18N

        javax.swing.GroupLayout jpRevenueDayLayout = new javax.swing.GroupLayout(jpRevenueDay);
        jpRevenueDay.setLayout(jpRevenueDayLayout);
        jpRevenueDayLayout.setHorizontalGroup(
            jpRevenueDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRevenueDayLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpRevenueDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpRevenueDayLayout.createSequentialGroup()
                        .addComponent(jlTitleRevenueDay)
                        .addGap(49, 49, 49))
                    .addGroup(jpRevenueDayLayout.createSequentialGroup()
                        .addComponent(jlDayMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlVND1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconDay)
                        .addContainerGap())))
        );
        jpRevenueDayLayout.setVerticalGroup(
            jpRevenueDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRevenueDayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitleRevenueDay)
                .addGroup(jpRevenueDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRevenueDayLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpRevenueDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDayMoney)
                            .addComponent(jlVND1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRevenueDayLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlIconDay)
                        .addContainerGap())))
        );

        jpRevenueMonth.setBackground(new java.awt.Color(153, 204, 255));

        jlTitleRevenueMonth.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlTitleRevenueMonth.setForeground(new java.awt.Color(255, 255, 255));
        jlTitleRevenueMonth.setText("Tổng doanh thu tháng");

        jlVND2.setBackground(new java.awt.Color(255, 255, 255));
        jlVND2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlVND2.setForeground(new java.awt.Color(255, 255, 255));
        jlVND2.setText("VND");

        jlMonthMoney.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlMonthMoney.setForeground(new java.awt.Color(255, 255, 255));
        jlMonthMoney.setText("0");

        jlIconMonthMoney.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mounth64.png"))); // NOI18N

        javax.swing.GroupLayout jpRevenueMonthLayout = new javax.swing.GroupLayout(jpRevenueMonth);
        jpRevenueMonth.setLayout(jpRevenueMonthLayout);
        jpRevenueMonthLayout.setHorizontalGroup(
            jpRevenueMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRevenueMonthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRevenueMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRevenueMonthLayout.createSequentialGroup()
                        .addComponent(jlTitleRevenueMonth)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(jpRevenueMonthLayout.createSequentialGroup()
                        .addComponent(jlMonthMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlVND2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconMonthMoney)))
                .addContainerGap())
        );
        jpRevenueMonthLayout.setVerticalGroup(
            jpRevenueMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRevenueMonthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitleRevenueMonth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRevenueMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRevenueMonthLayout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jlIconMonthMoney))
                    .addGroup(jpRevenueMonthLayout.createSequentialGroup()
                        .addGroup(jpRevenueMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlVND2)
                            .addComponent(jlMonthMoney))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpRevenueYear.setBackground(new java.awt.Color(0, 204, 204));

        jlTitleRevenueYear.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlTitleRevenueYear.setForeground(new java.awt.Color(255, 255, 255));
        jlTitleRevenueYear.setText("Tổng doanh thu năm");

        jlYearMoney.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlYearMoney.setForeground(new java.awt.Color(255, 255, 255));
        jlYearMoney.setText("0");

        jlVND3.setBackground(new java.awt.Color(255, 255, 255));
        jlVND3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlVND3.setForeground(new java.awt.Color(255, 255, 255));
        jlVND3.setText("VND");

        jlIconYear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/year64.png"))); // NOI18N

        javax.swing.GroupLayout jpRevenueYearLayout = new javax.swing.GroupLayout(jpRevenueYear);
        jpRevenueYear.setLayout(jpRevenueYearLayout);
        jpRevenueYearLayout.setHorizontalGroup(
            jpRevenueYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRevenueYearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRevenueYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRevenueYearLayout.createSequentialGroup()
                        .addComponent(jlTitleRevenueYear)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(jpRevenueYearLayout.createSequentialGroup()
                        .addComponent(jlYearMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVND3)
                        .addGap(18, 18, 18)
                        .addComponent(jlIconYear)))
                .addContainerGap())
        );
        jpRevenueYearLayout.setVerticalGroup(
            jpRevenueYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRevenueYearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitleRevenueYear)
                .addGroup(jpRevenueYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRevenueYearLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpRevenueYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlVND3)
                            .addComponent(jlYearMoney))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRevenueYearLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlIconYear)
                        .addContainerGap())))
        );

        jlSearch.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlSearch.setText("Lọc theo thời gian :");

        jtfStartDay.setEditable(false);
        jtfStartDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfStartDayActionPerformed(evt);
            }
        });

        jlStartDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlStartDay.setText("Ngày bắt đầu :");

        jlEndDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlEndDay.setText("Ngày kết thúc :");

        jtfEndDay.setEditable(false);
        jtfEndDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEndDayActionPerformed(evt);
            }
        });

        jlIconStartDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar24.png"))); // NOI18N
        jlIconStartDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlIconStartDayMouseClicked(evt);
            }
        });

        jlIconEndDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar24.png"))); // NOI18N
        jlIconEndDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlIconEndDayMouseClicked(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 204, 204));
        btnSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search24.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpStatisticalLayout = new javax.swing.GroupLayout(jpStatistical);
        jpStatistical.setLayout(jpStatisticalLayout);
        jpStatisticalLayout.setHorizontalGroup(
            jpStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatisticalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpStatisticalLayout.createSequentialGroup()
                        .addComponent(jpOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpRevenueDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpStatisticalLayout.createSequentialGroup()
                        .addComponent(jlSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlStartDay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconStartDay)))
                .addGap(40, 40, 40)
                .addGroup(jpStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpStatisticalLayout.createSequentialGroup()
                        .addComponent(jlEndDay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEndDay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconEndDay))
                    .addComponent(jpRevenueMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpStatisticalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpRevenueYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpStatisticalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jpStatisticalLayout.setVerticalGroup(
            jpStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatisticalLayout.createSequentialGroup()
                .addGroup(jpStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpRevenueMonth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpRevenueYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpRevenueDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEndDay)
                            .addComponent(jtfEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIconStartDay)
                            .addGroup(jpStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlSearch)
                                .addComponent(jlStartDay)
                                .addComponent(jtfStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpStatisticalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jlIconEndDay)))
                .addContainerGap(431, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpCenterLayout = new javax.swing.GroupLayout(jpCenter);
        jpCenter.setLayout(jpCenterLayout);
        jpCenterLayout.setHorizontalGroup(
            jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpStatistical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCenterLayout.setVerticalGroup(
            jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpStatistical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            jpCenter.setBackground(Color.BLACK);
            System.out.println("đen nè");
            JOptionPane.showMessageDialog(this, "đen nè");
            this.repaint();
        }
    }//GEN-LAST:event_cbDisplayActionPerformed

    private void jlChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlChangePassMouseClicked

    }//GEN-LAST:event_jlChangePassMouseClicked

    private void jtfEndDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEndDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEndDayActionPerformed

    private void jtfStartDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfStartDayActionPerformed

    }//GEN-LAST:event_jtfStartDayActionPerformed

    private void jlIconStartDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconStartDayMouseClicked
//        Sự kiện mở DateChooser
        DateChooser dateChoose = new DateChooser();
        dateChoose.setDateFormat("dd/MM/yyyy");
        dateChoose.setTextRefernce(jtfStartDay);
    }//GEN-LAST:event_jlIconStartDayMouseClicked

    private void jlIconEndDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconEndDayMouseClicked
        //        Sự kiện mở DateChooser
        DateChooser dateChoose = new DateChooser();
        dateChoose.setDateFormat("dd/MM/yyyy");
        dateChoose.setTextRefernce(jtfEndDay);
    }//GEN-LAST:event_jlIconEndDayMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

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
    private GUI.Button btnSearch;
    private GUI.Combobox cbDisplay;
    private GUI.Combobox cbLanguage;
    private javax.swing.JLabel jlBill;
    private javax.swing.JLabel jlChangePass;
    private javax.swing.JLabel jlCustomer;
    private javax.swing.JLabel jlDayMoney;
    private javax.swing.JLabel jlDisplay;
    private javax.swing.JLabel jlEndDay;
    private javax.swing.JLabel jlExit;
    private javax.swing.JLabel jlHistory;
    private javax.swing.JLabel jlIconDay;
    private javax.swing.JLabel jlIconEndDay;
    private javax.swing.JLabel jlIconMonthMoney;
    private javax.swing.JLabel jlIconOrder;
    private javax.swing.JLabel jlIconStartDay;
    private javax.swing.JLabel jlIconYear;
    private javax.swing.JLabel jlLanguage;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlLogout;
    private javax.swing.JLabel jlMonthMoney;
    private javax.swing.JLabel jlNumOrder;
    private javax.swing.JLabel jlProduct;
    private javax.swing.JLabel jlSale;
    private javax.swing.JLabel jlSearch;
    private javax.swing.JLabel jlStaff;
    private javax.swing.JLabel jlStartDay;
    private javax.swing.JLabel jlTitleOrder;
    private javax.swing.JLabel jlTitleRevenueDay;
    private javax.swing.JLabel jlTitleRevenueMonth;
    private javax.swing.JLabel jlTitleRevenueYear;
    private javax.swing.JLabel jlUnitOrder;
    private javax.swing.JLabel jlVND1;
    private javax.swing.JLabel jlVND2;
    private javax.swing.JLabel jlVND3;
    private javax.swing.JLabel jlYearMoney;
    private javax.swing.JPanel jpCenter;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpOrder;
    private javax.swing.JPanel jpRevenueDay;
    private javax.swing.JPanel jpRevenueMonth;
    private javax.swing.JPanel jpRevenueYear;
    private javax.swing.JPanel jpStatistical;
    private javax.swing.JPanel jpTop;
    private javax.swing.JTextField jtfEndDay;
    private javax.swing.JTextField jtfStartDay;
    private javax.swing.JLabel lbNameShop;
    private javax.swing.JLabel lbStatistical;
    // End of variables declaration//GEN-END:variables
}
