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
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import utils.Utils;

public class HomeManager_GUI extends javax.swing.JFrame {

    private Statistical_GUI statistical_GUI;
    private Product_GUI product_GUI;
    public HomeManager_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        
//          statistical_GUI = new Statistical_GUI();
openStatistical();
          jpCenter.add(statistical_GUI);
          jpCenter.revalidate();
          jpCenter.repaint();
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
        jlStatistical = new javax.swing.JLabel();
        jlExit = new javax.swing.JLabel();
        cbLanguage = new Customs.Combobox();
        jlDisplay = new javax.swing.JLabel();
        cbDisplay = new Customs.Combobox();
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
        jlProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product32.png"))); // NOI18N
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
        jlStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/staff32.png"))); // NOI18N
        jlStaff.setText("Nhân viên");
        jlStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlStaffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlStaffMouseExited(evt);
            }
        });

        jlBill.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlBill.setForeground(new java.awt.Color(255, 255, 255));
        jlBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bill32.png"))); // NOI18N
        jlBill.setText("Hóa đơn");
        jlBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlBillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlBillMouseExited(evt);
            }
        });

        jlCustomer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCustomer.setForeground(new java.awt.Color(255, 255, 255));
        jlCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer32.png"))); // NOI18N
        jlCustomer.setText("Khách hàng");
        jlCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCustomerMouseExited(evt);
            }
        });

        jlHistory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlHistory.setForeground(new java.awt.Color(255, 255, 255));
        jlHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/history32.png"))); // NOI18N
        jlHistory.setText("Lịch sử");
        jlHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlHistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlHistoryMouseExited(evt);
            }
        });

        jlSale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlSale.setForeground(new java.awt.Color(255, 255, 255));
        jlSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sale32.png"))); // NOI18N
        jlSale.setText("Khuyến mãi");
        jlSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlSaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlSaleMouseExited(evt);
            }
        });

        jlChangePass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlChangePass.setForeground(new java.awt.Color(255, 255, 255));
        jlChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key32.png"))); // NOI18N
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
        jlLanguage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/language32.png"))); // NOI18N

        jlLogout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlLogout.setForeground(new java.awt.Color(255, 255, 255));
        jlLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout32.png"))); // NOI18N
        jlLogout.setText("Đăng xuất");
        jlLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlLogoutMouseExited(evt);
            }
        });

        jlStatistical.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlStatistical.setForeground(new java.awt.Color(255, 255, 255));
        jlStatistical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chart32.png"))); // NOI18N
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
        jlExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit32.png"))); // NOI18N
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
                .addContainerGap()
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlStatistical)
                    .addComponent(jlProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlStaff)
                    .addComponent(jlBill)
                    .addComponent(jlCustomer)
                    .addComponent(jlHistory)
                    .addComponent(jlSale)
                    .addComponent(jlChangePass)
                    .addGroup(jpLeftLayout.createSequentialGroup()
                        .addComponent(jlDisplay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpLeftLayout.createSequentialGroup()
                        .addComponent(jlLanguage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlLogout)
                    .addComponent(jlExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpLeftLayout.setVerticalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addComponent(jlStatistical)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlBill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlSale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlChangePass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlLanguage)
                    .addComponent(cbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlExit)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jpMain.add(jpLeft, java.awt.BorderLayout.LINE_START);

        jpTop.setBackground(new java.awt.Color(0, 128, 128));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo64.png"))); // NOI18N

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

        jpCenter.setLayout(new java.awt.GridLayout());
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

    private void cbDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDisplayActionPerformed
        if (cbDisplay.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(this, "đen nè");
            this.repaint();
        }
    }//GEN-LAST:event_cbDisplayActionPerformed

    private void jlChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlChangePassMouseClicked

    }//GEN-LAST:event_jlChangePassMouseClicked

    private void jlStatisticalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlStatisticalMouseClicked
        openStatistical();
       jpCenter.removeAll();
       jpCenter.add(statistical_GUI);
       jpCenter.revalidate();
       jpCenter.repaint();
    }//GEN-LAST:event_jlStatisticalMouseClicked

    private void jlProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlProductMouseClicked
        jpCenter.removeAll();
        Product_GUI product_GUI = new Product_GUI();


          jpCenter.add(product_GUI);
          jpCenter.revalidate();
          jpCenter.repaint();
    }//GEN-LAST:event_jlProductMouseClicked

    private void jlStatisticalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlStatisticalMouseEntered
        jlStatistical.setForeground(Color.ORANGE);
        jlStatistical.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jlStatisticalMouseEntered

    private void jlStatisticalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlStatisticalMouseExited
        jlStatistical.setForeground(Color.WHITE);
        jlStatistical.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jlStatisticalMouseExited

    private void jlProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlProductMouseEntered
        jlProduct.setForeground(Color.ORANGE);
        jlProduct.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jlProductMouseEntered

    private void jlProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlProductMouseExited
        jlProduct.setForeground(Color.WHITE);
        jlProduct.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jlProductMouseExited

    private void jlStaffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlStaffMouseEntered
        jlStaff.setForeground(Color.ORANGE);
        jlStaff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jlStaffMouseEntered

    private void jlStaffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlStaffMouseExited
        jlStaff.setForeground(Color.WHITE);
        jlStaff.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jlStaffMouseExited

    private void jlBillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBillMouseEntered
        jlBill.setForeground(Color.ORANGE);
        jlBill.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_jlBillMouseEntered

    private void jlBillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBillMouseExited

        jlBill.setForeground(Color.WHITE);
        jlBill.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jlBillMouseExited

    private void jlCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCustomerMouseEntered
        jlCustomer.setForeground(Color.ORANGE);
        jlCustomer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jlCustomerMouseEntered

    private void jlCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCustomerMouseExited

        jlCustomer.setForeground(Color.WHITE);
        jlCustomer.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jlCustomerMouseExited

    private void jlHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlHistoryMouseEntered
        jlHistory.setForeground(Color.ORANGE);
        jlHistory.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_jlHistoryMouseEntered

    private void jlHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlHistoryMouseExited

        jlHistory.setForeground(Color.WHITE);
        jlHistory.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jlHistoryMouseExited

    private void jlSaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSaleMouseEntered
        jlSale.setForeground(Color.ORANGE);
        jlSale.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jlSaleMouseEntered

    private void jlSaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSaleMouseExited

        jlSale.setForeground(Color.WHITE);
        jlSale.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jlSaleMouseExited

    private void jlChangePassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlChangePassMouseEntered
        jlChangePass.setForeground(Color.ORANGE);
        jlChangePass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_jlChangePassMouseEntered

    private void jlChangePassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlChangePassMouseExited
        jlChangePass.setForeground(Color.WHITE);
        jlChangePass.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jlChangePassMouseExited

    private void jlLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLogoutMouseEntered
        jlLogout.setForeground(Color.ORANGE);
        jlLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jlLogoutMouseEntered

    private void jlLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLogoutMouseExited

        jlLogout.setForeground(Color.WHITE);
        jlLogout.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jlLogoutMouseExited

    private void jlExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlExitMouseEntered
        jlExit.setForeground(Color.ORANGE);
        jlExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_jlExitMouseEntered

    private void jlExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlExitMouseExited

        jlExit.setForeground(Color.WHITE);
        jlExit.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jlExitMouseExited

    private void jlExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlExitMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát chương trình hay không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jlExitMouseClicked

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeManager_GUI().setVisible(true);
            }
        });
    }
    
//    private void beginHover
private void openStatistical(){
    statistical_GUI = new Statistical_GUI();
}
    private void setText() {
        jlStatistical.setText(Utils.thongKe);
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
    private javax.swing.JLabel jlNameShop;
    private javax.swing.JLabel jlProduct;
    private javax.swing.JLabel jlSale;
    private javax.swing.JLabel jlStaff;
    private javax.swing.JLabel jlStatistical;
    private javax.swing.JPanel jpCenter;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpTop;
    // End of variables declaration//GEN-END:variables
}
