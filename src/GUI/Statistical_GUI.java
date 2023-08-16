// 1081, 600
package GUI;

public class Statistical_GUI extends javax.swing.JPanel {

    public Statistical_GUI() {
        initComponents();
        
        Revenue_GUI revenue_GUI = new Revenue_GUI();
        add(revenue_GUI);
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
        jpSearchTime = new javax.swing.JPanel();
        jlTitleSearch = new javax.swing.JLabel();
        jpBeginTime = new javax.swing.JPanel();
        jlStartDay = new javax.swing.JLabel();
        jtfStartDay = new javax.swing.JTextField();
        jlIconStartDay = new javax.swing.JLabel();
        jpEndTime = new javax.swing.JPanel();
        jlEndDay = new javax.swing.JLabel();
        jtfEndDay = new javax.swing.JTextField();
        jlIconEndDay = new javax.swing.JLabel();
        jpButtomS = new javax.swing.JPanel();
        btnSearch = new Customs.Button();
        jpBottom = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        button1 = new Customs.Button();
        button2 = new Customs.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jpTop.setBackground(new java.awt.Color(204, 204, 255));
        jpTop.setLayout(new javax.swing.BoxLayout(jpTop, javax.swing.BoxLayout.Y_AXIS));

        jpToptop.setBackground(new java.awt.Color(255, 255, 255));
        jpToptop.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

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
                    .addComponent(jlCard1Title)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard1Layout.createSequentialGroup()
                        .addComponent(jlNumOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCard1Unit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jlIconOrder)
                .addContainerGap())
        );
        jpCard1Layout.setVerticalGroup(
            jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard1Title)
                .addGap(18, 18, 18)
                .addGroup(jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlNumOrder)
                        .addComponent(jlCard1Unit))
                    .addComponent(jlIconOrder))
                .addContainerGap(7, Short.MAX_VALUE))
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
                        .addComponent(jlMoneyDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCard2Unit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconMoneyDay))
                    .addGroup(jpCard2Layout.createSequentialGroup()
                        .addComponent(jlCard2Title)
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpCard2Layout.setVerticalGroup(
            jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard2Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIconMoneyDay)
                    .addGroup(jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlMoneyDay)
                        .addComponent(jlCard2Unit)))
                .addContainerGap())
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
                        .addComponent(jlMoneyMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCard3Unit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconMoneyMonth))
                    .addGroup(jpCard3Layout.createSequentialGroup()
                        .addComponent(jlCard3Title)
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpCard3Layout.setVerticalGroup(
            jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard3Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIconMoneyMonth)
                    .addGroup(jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlMoneyMonth)
                        .addComponent(jlCard3Unit)))
                .addContainerGap())
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
                        .addComponent(jlMoneyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCard4Unit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconMoneyYear))
                    .addComponent(jlCard14Title))
                .addContainerGap())
        );
        jpCard4Layout.setVerticalGroup(
            jpCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard14Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jpCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIconMoneyYear)
                    .addGroup(jpCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlCard4Unit)
                        .addComponent(jlMoneyYear)))
                .addContainerGap())
        );

        jpToptop.add(jpCard4);

        jpTop.add(jpToptop);

        jpTopBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpTopBottom.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jpTopBottom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 5));

        jpSearchTime.setBackground(new java.awt.Color(255, 255, 255));

        jlTitleSearch.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlTitleSearch.setText("Lọc theo thời gian :");

        javax.swing.GroupLayout jpSearchTimeLayout = new javax.swing.GroupLayout(jpSearchTime);
        jpSearchTime.setLayout(jpSearchTimeLayout);
        jpSearchTimeLayout.setHorizontalGroup(
            jpSearchTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSearchTimeLayout.createSequentialGroup()
                .addComponent(jlTitleSearch)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jpSearchTimeLayout.setVerticalGroup(
            jpSearchTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSearchTimeLayout.createSequentialGroup()
                .addComponent(jlTitleSearch)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jpTopBottom.add(jpSearchTime);

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
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jpBeginTimeLayout.setVerticalGroup(
            jpBeginTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBeginTimeLayout.createSequentialGroup()
                .addGroup(jpBeginTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBeginTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlStartDay)
                        .addComponent(jtfStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlIconStartDay))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jpTopBottom.add(jpBeginTime);

        jpEndTime.setBackground(new java.awt.Color(255, 255, 255));

        jlEndDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlEndDay.setText("Ngày kết thúc :");

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
                .addComponent(jtfEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlIconEndDay)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jpEndTimeLayout.setVerticalGroup(
            jpEndTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEndTimeLayout.createSequentialGroup()
                .addGroup(jpEndTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEndTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlEndDay)
                        .addComponent(jtfEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlIconEndDay))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jpTopBottom.add(jpEndTime);

        jpButtomS.setBackground(new java.awt.Color(255, 255, 255));

        btnSearch.setBackground(new java.awt.Color(255, 204, 204));
        btnSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search24.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpButtomSLayout = new javax.swing.GroupLayout(jpButtomS);
        jpButtomS.setLayout(jpButtomSLayout);
        jpButtomSLayout.setHorizontalGroup(
            jpButtomSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButtomSLayout.createSequentialGroup()
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jpButtomSLayout.setVerticalGroup(
            jpButtomSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButtomSLayout.createSequentialGroup()
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jpTopBottom.add(jpButtomS);

        jpTop.add(jpTopBottom);

        add(jpTop);

        jpBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpBottom.setLayout(new javax.swing.BoxLayout(jpBottom, javax.swing.BoxLayout.Y_AXIS));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 0));

        button1.setBackground(new java.awt.Color(204, 204, 255));
        button1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button1.setText("Doanh thu");
        button1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel14.add(button1);

        button2.setBackground(new java.awt.Color(204, 204, 255));
        button2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button2.setText("Sản phẩm");
        button2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel14.add(button2);

        jpBottom.add(jPanel14);

        add(jpBottom);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfStartDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfStartDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfStartDayActionPerformed

    private void jlIconStartDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconStartDayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlIconStartDayMouseClicked

    private void jtfEndDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEndDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEndDayActionPerformed

    private void jlIconEndDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconEndDayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlIconEndDayMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Customs.Button btnSearch;
    private Customs.Button button1;
    private Customs.Button button2;
    private javax.swing.JPanel jPanel14;
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
    private javax.swing.JPanel jpBottom;
    private javax.swing.JPanel jpButtomS;
    private javax.swing.JPanel jpCard1;
    private javax.swing.JPanel jpCard2;
    private javax.swing.JPanel jpCard3;
    private javax.swing.JPanel jpCard4;
    private javax.swing.JPanel jpEndTime;
    private javax.swing.JPanel jpSearchTime;
    private javax.swing.JPanel jpTop;
    private javax.swing.JPanel jpTopBottom;
    private javax.swing.JPanel jpToptop;
    private javax.swing.JTextField jtfEndDay;
    private javax.swing.JTextField jtfStartDay;
    // End of variables declaration//GEN-END:variables
}
