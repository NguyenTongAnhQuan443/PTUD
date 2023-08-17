//1013, 549
package GUI;

import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.JOptionPane;

public class Statistical_GUI extends javax.swing.JPanel {

    SRevenue_GUI revenue_GUI = new SRevenue_GUI();
    SProduct_GUI productDetails_GUI = new SProduct_GUI();

    public Statistical_GUI() {
        initComponents();

        jpTmp.setLayout(new FlowLayout());
        jpTmp.add(revenue_GUI);
        jpTmp.revalidate();
        jpTmp.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTop = new javax.swing.JPanel();
        jpToptop = new javax.swing.JPanel();
        jpCard1 = new javax.swing.JPanel();
        jlCard1Title = new javax.swing.JLabel();
        jlNumOrder = new javax.swing.JLabel();
        jlCard1Unit = new javax.swing.JLabel();
        jlIconOrder = new javax.swing.JLabel();
        jpCard2 = new javax.swing.JPanel();
        jlIconMoneyDay = new javax.swing.JLabel();
        jlCard2Title = new javax.swing.JLabel();
        jlMoneyDay = new javax.swing.JLabel();
        jlCard2Unit = new javax.swing.JLabel();
        jpCard3 = new javax.swing.JPanel();
        jlIconMoneyMonth = new javax.swing.JLabel();
        jlCard3Title = new javax.swing.JLabel();
        jlMoneyMonth = new javax.swing.JLabel();
        jlCard3Unit = new javax.swing.JLabel();
        jpCard4 = new javax.swing.JPanel();
        jlIconMoneyYear = new javax.swing.JLabel();
        jlCard14Title = new javax.swing.JLabel();
        jlCard4Unit = new javax.swing.JLabel();
        jlMoneyYear = new javax.swing.JLabel();
        jpTopBottom = new javax.swing.JPanel();
        jpBtnSearch = new javax.swing.JPanel();
        jpSearchTime = new javax.swing.JPanel();
        btnSearch = new Customs.Button();
        jlTitleSearch = new javax.swing.JLabel();
        jpBeginTime = new javax.swing.JPanel();
        jlStartDay = new javax.swing.JLabel();
        jtfStartDay = new javax.swing.JTextField();
        jlIconStartDay = new javax.swing.JLabel();
        jpEndTime = new javax.swing.JPanel();
        jlEndDay = new javax.swing.JLabel();
        jtfEndDay = new javax.swing.JTextField();
        jlIconEndDay = new javax.swing.JLabel();
        jpMainSearch = new javax.swing.JPanel();
        bynRevenue = new Customs.Button();
        btnProduct = new Customs.Button();
        jpTmp = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jpTop.setBackground(new java.awt.Color(204, 204, 255));
        jpTop.setLayout(new javax.swing.BoxLayout(jpTop, javax.swing.BoxLayout.Y_AXIS));

        jpToptop.setBackground(new java.awt.Color(255, 255, 255));
        jpToptop.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jpToptop.setLayout(new javax.swing.BoxLayout(jpToptop, javax.swing.BoxLayout.X_AXIS));

        jpCard1.setBackground(new java.awt.Color(204, 204, 255));
        jpCard1.setForeground(new java.awt.Color(255, 255, 255));
        jpCard1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlCard1Title.setBackground(new java.awt.Color(255, 255, 255));
        jlCard1Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlCard1Title.setForeground(new java.awt.Color(255, 255, 255));
        jlCard1Title.setText("Tổng số đơn hàng");

        jlNumOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlNumOrder.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlNumOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlNumOrder.setText("0");

        jlCard1Unit.setBackground(new java.awt.Color(255, 255, 255));
        jlCard1Unit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlCard1Unit.setForeground(new java.awt.Color(255, 255, 255));
        jlCard1Unit.setText("Đơn hàng");

        jlIconOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/market64.png"))); // NOI18N

        javax.swing.GroupLayout jpCard1Layout = new javax.swing.GroupLayout(jpCard1);
        jpCard1.setLayout(jpCard1Layout);
        jpCard1Layout.setHorizontalGroup(
            jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard1Layout.createSequentialGroup()
                        .addComponent(jlNumOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCard1Unit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconOrder))
                    .addGroup(jpCard1Layout.createSequentialGroup()
                        .addComponent(jlCard1Title)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpCard1Layout.setVerticalGroup(
            jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard1Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumOrder)
                    .addComponent(jlCard1Unit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jlIconOrder)
                .addContainerGap())
        );

        jpToptop.add(jpCard1);

        jpCard2.setBackground(new java.awt.Color(255, 204, 255));

        jlIconMoneyDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/day64.png"))); // NOI18N

        jlCard2Title.setBackground(new java.awt.Color(255, 255, 255));
        jlCard2Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlCard2Title.setForeground(new java.awt.Color(255, 255, 255));
        jlCard2Title.setText("Tổng doanh thu ngày");

        jlMoneyDay.setBackground(new java.awt.Color(255, 255, 255));
        jlMoneyDay.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlMoneyDay.setForeground(new java.awt.Color(255, 255, 255));
        jlMoneyDay.setText("0");

        jlCard2Unit.setBackground(new java.awt.Color(255, 255, 255));
        jlCard2Unit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlCard2Unit.setForeground(new java.awt.Color(255, 255, 255));
        jlCard2Unit.setText("VND");

        javax.swing.GroupLayout jpCard2Layout = new javax.swing.GroupLayout(jpCard2);
        jpCard2.setLayout(jpCard2Layout);
        jpCard2Layout.setHorizontalGroup(
            jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard2Layout.createSequentialGroup()
                        .addComponent(jlCard2Title)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(jpCard2Layout.createSequentialGroup()
                        .addComponent(jlMoneyDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCard2Unit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconMoneyDay)))
                .addContainerGap())
        );
        jpCard2Layout.setVerticalGroup(
            jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard2Title)
                .addGroup(jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMoneyDay)
                            .addComponent(jlCard2Unit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlIconMoneyDay)
                        .addContainerGap())))
        );

        jpToptop.add(jpCard2);

        jpCard3.setBackground(new java.awt.Color(153, 204, 255));

        jlIconMoneyMonth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mounth64.png"))); // NOI18N

        jlCard3Title.setBackground(new java.awt.Color(255, 255, 255));
        jlCard3Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlCard3Title.setForeground(new java.awt.Color(255, 255, 255));
        jlCard3Title.setText("Tổng doanh thu tháng");

        jlMoneyMonth.setBackground(new java.awt.Color(255, 255, 255));
        jlMoneyMonth.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlMoneyMonth.setForeground(new java.awt.Color(255, 255, 255));
        jlMoneyMonth.setText("0");

        jlCard3Unit.setBackground(new java.awt.Color(255, 255, 255));
        jlCard3Unit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlCard3Unit.setForeground(new java.awt.Color(255, 255, 255));
        jlCard3Unit.setText("VND");

        javax.swing.GroupLayout jpCard3Layout = new javax.swing.GroupLayout(jpCard3);
        jpCard3.setLayout(jpCard3Layout);
        jpCard3Layout.setHorizontalGroup(
            jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard3Layout.createSequentialGroup()
                        .addComponent(jlCard3Title)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(jpCard3Layout.createSequentialGroup()
                        .addComponent(jlMoneyMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCard3Unit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconMoneyMonth)))
                .addContainerGap())
        );
        jpCard3Layout.setVerticalGroup(
            jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard3Title)
                .addGroup(jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMoneyMonth)
                            .addComponent(jlCard3Unit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlIconMoneyMonth)
                        .addContainerGap())))
        );

        jpToptop.add(jpCard3);

        jpCard4.setBackground(new java.awt.Color(0, 204, 204));

        jlIconMoneyYear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/year64.png"))); // NOI18N

        jlCard14Title.setBackground(new java.awt.Color(255, 255, 255));
        jlCard14Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlCard14Title.setForeground(new java.awt.Color(255, 255, 255));
        jlCard14Title.setText("Tổng doanh thu năm");

        jlCard4Unit.setBackground(new java.awt.Color(255, 255, 255));
        jlCard4Unit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlCard4Unit.setForeground(new java.awt.Color(255, 255, 255));
        jlCard4Unit.setText("VND");

        jlMoneyYear.setBackground(new java.awt.Color(255, 255, 255));
        jlMoneyYear.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlMoneyYear.setForeground(new java.awt.Color(255, 255, 255));
        jlMoneyYear.setText("0");

        javax.swing.GroupLayout jpCard4Layout = new javax.swing.GroupLayout(jpCard4);
        jpCard4.setLayout(jpCard4Layout);
        jpCard4Layout.setHorizontalGroup(
            jpCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard4Layout.createSequentialGroup()
                        .addComponent(jlCard14Title)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(jpCard4Layout.createSequentialGroup()
                        .addComponent(jlMoneyYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCard4Unit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconMoneyYear)))
                .addContainerGap())
        );
        jpCard4Layout.setVerticalGroup(
            jpCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard14Title)
                .addGroup(jpCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMoneyYear)
                            .addComponent(jlCard4Unit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlIconMoneyYear)
                        .addContainerGap())))
        );

        jpToptop.add(jpCard4);

        jpTop.add(jpToptop);

        add(jpTop);

        jpTopBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpTopBottom.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jpTopBottom.setLayout(new javax.swing.BoxLayout(jpTopBottom, javax.swing.BoxLayout.X_AXIS));

        jpBtnSearch.setBackground(new java.awt.Color(255, 255, 255));

        jpSearchTime.setBackground(new java.awt.Color(255, 255, 255));

        btnSearch.setBackground(new java.awt.Color(255, 204, 204));
        btnSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search24.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSearchTimeLayout = new javax.swing.GroupLayout(jpSearchTime);
        jpSearchTime.setLayout(jpSearchTimeLayout);
        jpSearchTimeLayout.setHorizontalGroup(
            jpSearchTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSearchTimeLayout.createSequentialGroup()
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jpSearchTimeLayout.setVerticalGroup(
            jpSearchTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jlTitleSearch.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlTitleSearch.setText("Lọc theo thời gian :");

        jpBeginTime.setBackground(new java.awt.Color(255, 255, 255));

        jlStartDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlStartDay.setText("Ngày bắt đầu :");

        jtfStartDay.setEditable(false);
        jtfStartDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfStartDayActionPerformed(evt);
            }
        });

        jlIconStartDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar24.png"))); // NOI18N
        jlIconStartDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlIconStartDayMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpBeginTimeLayout = new javax.swing.GroupLayout(jpBeginTime);
        jpBeginTime.setLayout(jpBeginTimeLayout);
        jpBeginTimeLayout.setHorizontalGroup(
            jpBeginTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBeginTimeLayout.createSequentialGroup()
                .addComponent(jlStartDay)
                .addGap(18, 18, 18)
                .addComponent(jtfStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlIconStartDay)
                .addGap(0, 70, Short.MAX_VALUE))
        );
        jpBeginTimeLayout.setVerticalGroup(
            jpBeginTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBeginTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jlStartDay)
                .addComponent(jtfStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jlIconStartDay)
        );

        jpEndTime.setBackground(new java.awt.Color(255, 255, 255));

        jlEndDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlEndDay.setText("Ngày bắt đầu :");

        jtfEndDay.setEditable(false);
        jtfEndDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEndDayActionPerformed(evt);
            }
        });

        jlIconEndDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar24.png"))); // NOI18N
        jlIconEndDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlIconEndDayMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpEndTimeLayout = new javax.swing.GroupLayout(jpEndTime);
        jpEndTime.setLayout(jpEndTimeLayout);
        jpEndTimeLayout.setHorizontalGroup(
            jpEndTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEndTimeLayout.createSequentialGroup()
                .addComponent(jlEndDay)
                .addGap(18, 18, 18)
                .addComponent(jtfEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlIconEndDay)
                .addGap(0, 70, Short.MAX_VALUE))
        );
        jpEndTimeLayout.setVerticalGroup(
            jpEndTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEndTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jlEndDay)
                .addComponent(jtfEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jlIconEndDay)
        );

        javax.swing.GroupLayout jpBtnSearchLayout = new javax.swing.GroupLayout(jpBtnSearch);
        jpBtnSearch.setLayout(jpBtnSearchLayout);
        jpBtnSearchLayout.setHorizontalGroup(
            jpBtnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBtnSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitleSearch)
                .addGap(28, 28, 28)
                .addComponent(jpBeginTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpSearchTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jpBtnSearchLayout.setVerticalGroup(
            jpBtnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBtnSearchLayout.createSequentialGroup()
                .addGroup(jpBtnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitleSearch)
                    .addComponent(jpBeginTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpSearchTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpTopBottom.add(jpBtnSearch);

        add(jpTopBottom);

        jpMainSearch.setBackground(new java.awt.Color(255, 255, 255));
        jpMainSearch.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 0));

        bynRevenue.setBackground(new java.awt.Color(204, 204, 255));
        bynRevenue.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bynRevenue.setText("Doanh thu");
        bynRevenue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bynRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bynRevenueActionPerformed(evt);
            }
        });
        jpMainSearch.add(bynRevenue);

        btnProduct.setBackground(new java.awt.Color(204, 204, 255));
        btnProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProduct.setText("Sản phẩm");
        btnProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        jpMainSearch.add(btnProduct);

        add(jpMainSearch);

        jpTmp.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpTmpLayout = new javax.swing.GroupLayout(jpTmp);
        jpTmp.setLayout(jpTmpLayout);
        jpTmpLayout.setHorizontalGroup(
            jpTmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
        );
        jpTmpLayout.setVerticalGroup(
            jpTmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        add(jpTmp);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfStartDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfStartDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfStartDayActionPerformed

    private void jlIconStartDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconStartDayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlIconStartDayMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void bynRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bynRevenueActionPerformed

        jpTmp.removeAll();
        jpTmp.add(revenue_GUI);
        jpTmp.revalidate();
        jpTmp.repaint();
    }//GEN-LAST:event_bynRevenueActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        jpTmp.removeAll();
        jpTmp.add(productDetails_GUI);
        jpTmp.revalidate();
        jpTmp.repaint();
    }//GEN-LAST:event_btnProductActionPerformed

    private void jtfEndDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEndDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEndDayActionPerformed

    private void jlIconEndDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconEndDayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlIconEndDayMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Customs.Button btnProduct;
    private Customs.Button btnSearch;
    private Customs.Button bynRevenue;
    private javax.swing.JLabel jlCard14Title;
    private javax.swing.JLabel jlCard1Title;
    private javax.swing.JLabel jlCard1Unit;
    private javax.swing.JLabel jlCard2Title;
    private javax.swing.JLabel jlCard2Unit;
    private javax.swing.JLabel jlCard3Title;
    private javax.swing.JLabel jlCard3Unit;
    private javax.swing.JLabel jlCard4Unit;
    private javax.swing.JLabel jlEndDay;
    private javax.swing.JLabel jlIconEndDay;
    private javax.swing.JLabel jlIconMoneyDay;
    private javax.swing.JLabel jlIconMoneyMonth;
    private javax.swing.JLabel jlIconMoneyYear;
    private javax.swing.JLabel jlIconOrder;
    private javax.swing.JLabel jlIconStartDay;
    private javax.swing.JLabel jlMoneyDay;
    private javax.swing.JLabel jlMoneyMonth;
    private javax.swing.JLabel jlMoneyYear;
    private javax.swing.JLabel jlNumOrder;
    private javax.swing.JLabel jlStartDay;
    private javax.swing.JLabel jlTitleSearch;
    private javax.swing.JPanel jpBeginTime;
    private javax.swing.JPanel jpBtnSearch;
    private javax.swing.JPanel jpCard1;
    private javax.swing.JPanel jpCard2;
    private javax.swing.JPanel jpCard3;
    private javax.swing.JPanel jpCard4;
    private javax.swing.JPanel jpEndTime;
    private javax.swing.JPanel jpMainSearch;
    private javax.swing.JPanel jpSearchTime;
    private javax.swing.JPanel jpTmp;
    private javax.swing.JPanel jpTop;
    private javax.swing.JPanel jpTopBottom;
    private javax.swing.JPanel jpToptop;
    private javax.swing.JTextField jtfEndDay;
    private javax.swing.JTextField jtfStartDay;
    // End of variables declaration//GEN-END:variables
}
