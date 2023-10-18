package gui;

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
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lib2.Combobox;
import utils.Utils;

public class HomeManager_GUI extends javax.swing.JFrame {
    
    private Statistical_GUIX statistical_GUI;
    private Product_GUI product_GUI;
    private Sell_GUI sell_GUI;
    private Staff_GUI staff_GUI;
    private Customer_GUI customer_GUI;
    private History_GUI history_GUI;
    private Promotion_GUI promotion_GUI;
    private ChangePassword_GUI changePassword_GUI;
    private Supplier_GUI supplier_GUI;
    private Staff_InfoStaff_GUI staff_InfoStaff_GUI;

    public HomeManager_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);

//        Nếu là chức vụ nhân viên quản lý
        statistical_GUI = new Statistical_GUIX();
        jpCenter.add(statistical_GUI);
        jpCenter.revalidate();
        jpCenter.repaint();
        jlStatistical.setForeground(Color.ORANGE);

//        Nếu là chức vụ nhân viên bán hàng
//        statistical_GUI = new Statistical_GUIX();
//        jpCenter.add(statistical_GUI);
//        jpCenter.revalidate();
//        jpCenter.repaint();
//        jlSupplier.setVisible(false);
//        jlPromotion.setVisible(false);
//        jlStaff.setVisible(false);
//        jlStatistical.setForeground(Color.ORANGE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jpLeft = new javax.swing.JPanel();
        jlProduct = new javax.swing.JLabel();
        jlStaff = new javax.swing.JLabel();
        jlSell = new javax.swing.JLabel();
        jlCustomer = new javax.swing.JLabel();
        jlHistory = new javax.swing.JLabel();
        jlPromotion = new javax.swing.JLabel();
        jlChangePass = new javax.swing.JLabel();
        jlLanguage = new javax.swing.JLabel();
        jlLogout = new javax.swing.JLabel();
        jlStatistical = new javax.swing.JLabel();
        jlExit = new javax.swing.JLabel();
        cbLanguage = new lib2.Combobox();
        jlSupplier = new javax.swing.JLabel();
        jlAccount = new javax.swing.JLabel();
        jpTop = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        jlNameShop = new javax.swing.JLabel();
        jpCenter = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fley shop quản lý bán hàng");

        jpMain.setBackground(new java.awt.Color(255, 255, 255));
        jpMain.setLayout(new java.awt.BorderLayout());

        jpLeft.setBackground(new java.awt.Color(0, 128, 128));

        jlProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlProduct.setForeground(new java.awt.Color(255, 255, 255));
        jlProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/product32.png"))); // NOI18N
        jlProduct.setText("Sản phẩm");
        jlProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlProductMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlProductMouseExited(evt);
            }
        });

        jlStaff.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlStaff.setForeground(new java.awt.Color(255, 255, 255));
        jlStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/staff32.png"))); // NOI18N
        jlStaff.setText("Nhân viên");
        jlStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlStaffMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlStaffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlStaffMouseExited(evt);
            }
        });

        jlSell.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlSell.setForeground(new java.awt.Color(255, 255, 255));
        jlSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/sell32.png"))); // NOI18N
        jlSell.setText("Bán hàng");
        jlSell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSellMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlSellMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlSellMouseExited(evt);
            }
        });

        jlCustomer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCustomer.setForeground(new java.awt.Color(255, 255, 255));
        jlCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/Customer32.png"))); // NOI18N
        jlCustomer.setText("Khách hàng");
        jlCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCustomerMouseExited(evt);
            }
        });

        jlHistory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlHistory.setForeground(new java.awt.Color(255, 255, 255));
        jlHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/history32.png"))); // NOI18N
        jlHistory.setText("Lịch sử bán hàng");
        jlHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlHistoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlHistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlHistoryMouseExited(evt);
            }
        });

        jlPromotion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlPromotion.setForeground(new java.awt.Color(255, 255, 255));
        jlPromotion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/sale32.png"))); // NOI18N
        jlPromotion.setText("Khuyến mãi");
        jlPromotion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlPromotionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlPromotionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlPromotionMouseExited(evt);
            }
        });

        jlChangePass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlChangePass.setForeground(new java.awt.Color(255, 255, 255));
        jlChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/key32.png"))); // NOI18N
        jlChangePass.setText("Đổi mật khẩu");
        jlChangePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlChangePassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlChangePassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlChangePassMouseExited(evt);
            }
        });

        jlLanguage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlLanguage.setForeground(new java.awt.Color(255, 255, 255));
        jlLanguage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/language32.png"))); // NOI18N

        jlLogout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlLogout.setForeground(new java.awt.Color(255, 255, 255));
        jlLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/logout32.png"))); // NOI18N
        jlLogout.setText("Đăng xuất");
        jlLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlLogoutMouseExited(evt);
            }
        });

        jlStatistical.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlStatistical.setForeground(new java.awt.Color(255, 255, 255));
        jlStatistical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/chart32.png"))); // NOI18N
        jlStatistical.setText("Thống kê");
        jlStatistical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlStatisticalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlStatisticalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlStatisticalMouseExited(evt);
            }
        });

        jlExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlExit.setForeground(new java.awt.Color(255, 255, 255));
        jlExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/exit32.png"))); // NOI18N
        jlExit.setText("Thoát");
        jlExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlExitMouseExited(evt);
            }
        });

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

        jlSupplier.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlSupplier.setForeground(new java.awt.Color(255, 255, 255));
        jlSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/Supplier32.png"))); // NOI18N
        jlSupplier.setText("Nhà cung cấp");
        jlSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSupplierMouseClicked(evt);
            }
        });

        jlAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlAccount.setForeground(new java.awt.Color(255, 255, 255));
        jlAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/user32.png"))); // NOI18N
        jlAccount.setText("Tài khoản");
        jlAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlAccountMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpLeftLayout = new javax.swing.GroupLayout(jpLeft);
        jpLeft.setLayout(jpLeftLayout);
        jpLeftLayout.setHorizontalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLeftLayout.createSequentialGroup()
                        .addComponent(jlLanguage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlStatistical, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSupplier)
                    .addComponent(jlProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlStaff)
                    .addComponent(jlSell)
                    .addComponent(jlHistory)
                    .addComponent(jlChangePass)
                    .addComponent(jlLogout)
                    .addComponent(jlExit)
                    .addComponent(jlCustomer)
                    .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jlAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlPromotion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jpLeftLayout.setVerticalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addComponent(jlStatistical)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlSell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCustomer)
                .addGap(12, 12, 12)
                .addComponent(jlPromotion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlChangePass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLanguage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlExit)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jpMain.add(jpLeft, java.awt.BorderLayout.LINE_START);

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
                .addGap(77, 77, 77)
                .addComponent(jlLogo)
                .addGap(18, 18, 18)
                .addComponent(jlNameShop, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(878, Short.MAX_VALUE))
        );
        jpTopLayout.setVerticalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlNameShop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMain.add(jpTop, java.awt.BorderLayout.PAGE_START);

        jpCenter.setLayout(new java.awt.GridLayout(1, 0));
        jpMain.add(jpCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpMain, java.awt.BorderLayout.CENTER);

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

    private void jlChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlChangePassMouseClicked
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
        selectMenu(jlChangePass);
        changePassword_GUI = new ChangePassword_GUI();
        openJPanel(changePassword_GUI);
    }//GEN-LAST:event_jlChangePassMouseClicked

    private void jlStatisticalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlStatisticalMouseClicked
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
        selectMenu(jlStatistical);
        statistical_GUI = new Statistical_GUIX();
        openJPanel(statistical_GUI);
    }//GEN-LAST:event_jlStatisticalMouseClicked

    private void jlProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlProductMouseClicked
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
        selectMenu(jlProduct);
        product_GUI = new Product_GUI();
        openJPanel(product_GUI);
    }//GEN-LAST:event_jlProductMouseClicked

    private void jlStatisticalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlStatisticalMouseEntered

    }//GEN-LAST:event_jlStatisticalMouseEntered

    private void jlStatisticalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlStatisticalMouseExited

    }//GEN-LAST:event_jlStatisticalMouseExited

    private void jlProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlProductMouseEntered

    }//GEN-LAST:event_jlProductMouseEntered

    private void jlProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlProductMouseExited

    }//GEN-LAST:event_jlProductMouseExited

    private void jlStaffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlStaffMouseEntered

    }//GEN-LAST:event_jlStaffMouseEntered

    private void jlStaffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlStaffMouseExited

    }//GEN-LAST:event_jlStaffMouseExited

    private void jlSellMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSellMouseEntered

    }//GEN-LAST:event_jlSellMouseEntered

    private void jlSellMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSellMouseExited

    }//GEN-LAST:event_jlSellMouseExited

    private void jlCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCustomerMouseEntered

    }//GEN-LAST:event_jlCustomerMouseEntered

    private void jlCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCustomerMouseExited

    }//GEN-LAST:event_jlCustomerMouseExited

    private void jlHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlHistoryMouseEntered

    }//GEN-LAST:event_jlHistoryMouseEntered

    private void jlHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlHistoryMouseExited

    }//GEN-LAST:event_jlHistoryMouseExited

    private void jlPromotionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlPromotionMouseEntered

    }//GEN-LAST:event_jlPromotionMouseEntered

    private void jlPromotionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlPromotionMouseExited

    }//GEN-LAST:event_jlPromotionMouseExited

    private void jlChangePassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlChangePassMouseEntered

    }//GEN-LAST:event_jlChangePassMouseEntered

    private void jlChangePassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlChangePassMouseExited

    }//GEN-LAST:event_jlChangePassMouseExited

    private void jlLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLogoutMouseEntered

    }//GEN-LAST:event_jlLogoutMouseEntered

    private void jlLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLogoutMouseExited

    }//GEN-LAST:event_jlLogoutMouseExited

    private void jlExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlExitMouseEntered

    }//GEN-LAST:event_jlExitMouseEntered

    private void jlExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlExitMouseExited

    }//GEN-LAST:event_jlExitMouseExited

    private void jlExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlExitMouseClicked
        selectMenu(jlExit);
        if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát chương trình hay không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jlExitMouseClicked

    private void jlSellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSellMouseClicked
        selectMenu(jlSell);
        sell_GUI = new Sell_GUI();
        openJPanel(sell_GUI);
    }//GEN-LAST:event_jlSellMouseClicked

    private void jlStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlStaffMouseClicked
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
        selectMenu(jlStaff);
        staff_GUI = new Staff_GUI();
        openJPanel(staff_GUI);
    }//GEN-LAST:event_jlStaffMouseClicked

    private void jlCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCustomerMouseClicked
        selectMenu(jlCustomer);
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
        customer_GUI = new Customer_GUI();
        openJPanel(customer_GUI);
    }//GEN-LAST:event_jlCustomerMouseClicked

    private void jlHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlHistoryMouseClicked
        selectMenu(jlHistory);
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
        history_GUI = new History_GUI();
        openJPanel(history_GUI);
    }//GEN-LAST:event_jlHistoryMouseClicked

    private void jlPromotionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlPromotionMouseClicked
        selectMenu(jlPromotion);
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
        promotion_GUI = new Promotion_GUI();
        openJPanel(promotion_GUI);
    }//GEN-LAST:event_jlPromotionMouseClicked

    private void jlLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLogoutMouseClicked
        selectMenu(jlLogout);
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
        if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn đăng xuất hay không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            dispose();
            Login_GUI login_GUI = new Login_GUI();
            login_GUI.setVisible(true);
        }
    }//GEN-LAST:event_jlLogoutMouseClicked

    private void jlSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSupplierMouseClicked
        selectMenu(jlSupplier);
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
        supplier_GUI = new Supplier_GUI();
        openJPanel(supplier_GUI);
    }//GEN-LAST:event_jlSupplierMouseClicked

    private void jlAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAccountMouseClicked
        staff_InfoStaff_GUI = new Staff_InfoStaff_GUI();
        staff_InfoStaff_GUI.setVisible(true);
        
        staff_InfoStaff_GUI.setJlIDStaff(false);
        staff_InfoStaff_GUI.setJlPass(false);
        staff_InfoStaff_GUI.setJtfIDStaff(false);
        staff_InfoStaff_GUI.setJtfPass(false);
        staff_InfoStaff_GUI.setBtnAdd(false);
    }//GEN-LAST:event_jlAccountMouseClicked

    private void jlAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAccountMouseEntered
        jlAccount.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jlAccountMouseEntered

    private void jlAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAccountMouseExited
        jlAccount.setForeground(Color.WHITE);
    }//GEN-LAST:event_jlAccountMouseExited
    
    public HomeManager_GUI(Statistical_GUIX statistical_GUI, Product_GUI product_GUI, Sell_GUI bill_GUI, Combobox cbDisplay, Combobox cbLanguage, JLabel jlSell, JLabel jlChangePass, JLabel jlCustomer, JLabel jlDisplay, JLabel jlExit, JLabel jlHistory, JLabel jlLanguage, JLabel jlLogo, JLabel jlLogout, JLabel jlNameShop, JLabel jlProduct, JLabel jlSale, JLabel jlStaff, JLabel jlStatistical, JPanel jpCenter, JPanel jpLeft, JPanel jpMain, JPanel jpTop) throws HeadlessException {
        this.statistical_GUI = statistical_GUI;
        this.product_GUI = product_GUI;
        this.sell_GUI = sell_GUI;
        this.cbLanguage = cbLanguage;
        this.jlSell = jlSell;
        this.jlChangePass = jlChangePass;
        this.jlCustomer = jlCustomer;
        this.jlExit = jlExit;
        this.jlHistory = jlHistory;
        this.jlLanguage = jlLanguage;
        this.jlLogo = jlLogo;
        this.jlLogout = jlLogout;
        this.jlNameShop = jlNameShop;
        this.jlProduct = jlProduct;
        this.jlPromotion = jlSale;
        this.jlStaff = jlStaff;
        this.jlStatistical = jlStatistical;
        this.jpCenter = jpCenter;
        this.jpLeft = jpLeft;
        this.jpMain = jpMain;
        this.jpTop = jpTop;
    }
    
    private void selectMenu(JLabel label) {
        jlStatistical.setForeground(Color.WHITE);
        jlProduct.setForeground(Color.WHITE);
        jlStaff.setForeground(Color.WHITE);
        jlSell.setForeground(Color.WHITE);
        jlCustomer.setForeground(Color.WHITE);
        jlHistory.setForeground(Color.WHITE);
        jlPromotion.setForeground(Color.WHITE);
        jlChangePass.setForeground(Color.WHITE);
        jlLogout.setForeground(Color.WHITE);
        jlExit.setForeground(Color.WHITE);
        jlSupplier.setForeground(Color.WHITE);
        label.setForeground(Color.ORANGE);
    }
    
    private void setText() {
        jlStatistical.setText(Utils.thongKe);
        jlProduct.setText(Utils.sanPham);
        jlStaff.setText(Utils.nhanVien);
        jlSell.setText(Utils.hoaDon);
        jlCustomer.setText(Utils.khachHang);
        jlHistory.setText(Utils.lichSu);
        jlPromotion.setText(Utils.khuyenMai);
        jlChangePass.setText(Utils.doiMK);
        jlLogout.setText(Utils.dangXuat);
        String obj[] = {Utils.giaoDien, Utils.toi, Utils.sang};
        DefaultComboBoxModel model = new DefaultComboBoxModel(obj);
        
        String objEnglish[] = {Utils.ngonNgu, Utils.vietNam, Utils.english};
        DefaultComboBoxModel modelEnglish = new DefaultComboBoxModel(objEnglish);
        cbLanguage.setModel(modelEnglish);
    }
    
    private void openJPanel(JPanel panel) {
        jpCenter.removeAll();
        jpCenter.add(panel);
        jpCenter.revalidate();
        jpCenter.repaint();
    }
    
    private void functionStaff() {
// Thay đổi panel thống kê
// Thay đổi panel nhân viên
// Chỉ xem được chương trình khuyến mãi không thêm và sửa
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Combobox cbLanguage;
    private javax.swing.JLabel jlAccount;
    private javax.swing.JLabel jlChangePass;
    private javax.swing.JLabel jlCustomer;
    private javax.swing.JLabel jlExit;
    private javax.swing.JLabel jlHistory;
    private javax.swing.JLabel jlLanguage;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlLogout;
    private javax.swing.JLabel jlNameShop;
    private javax.swing.JLabel jlProduct;
    private javax.swing.JLabel jlPromotion;
    private javax.swing.JLabel jlSell;
    private javax.swing.JLabel jlStaff;
    private javax.swing.JLabel jlStatistical;
    private javax.swing.JLabel jlSupplier;
    private javax.swing.JPanel jpCenter;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpTop;
    // End of variables declaration//GEN-END:variables
}
