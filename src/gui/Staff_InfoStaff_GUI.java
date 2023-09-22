package gui;

import com.raven.datechooser.DateChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import lib2.Button;

public class Staff_InfoStaff_GUI extends javax.swing.JFrame {
    
    private DateChooser dateChooser;
    
    private int flag = 0;
    
    public Staff_InfoStaff_GUI() {
        initComponents();
        setLocationRelativeTo(null);
        
        DateChooser dateChoose = new DateChooser();
        dateChoose.setDateFormat("dd/MM/yyyy");
        dateChoose.setTextRefernce(jtfDoB);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpMain = new javax.swing.JPanel();
        jpTop = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        jlNameShop = new javax.swing.JLabel();
        jpBottom = new javax.swing.JPanel();
        jpInfoStaff = new javax.swing.JPanel();
        jtfName = new lib2.TextField();
        jtfCitizenIdentification = new lib2.TextField();
        jtfPhone = new lib2.TextField();
        jtfDoB = new javax.swing.JTextField();
        jlIconCalendar = new javax.swing.JLabel();
        jlSex = new javax.swing.JLabel();
        jrbMale = new javax.swing.JRadioButton();
        jrbFemale = new javax.swing.JRadioButton();
        cbProvince = new lib2.ComboBoxSuggestion();
        cbCommune = new lib2.ComboBoxSuggestion();
        jtfAddress = new lib2.TextField();
        cbPosition = new lib2.ComboBoxSuggestion();
        cbDistrict = new lib2.ComboBoxSuggestion();
        jpAccStaff = new javax.swing.JPanel();
        btnAdd = new lib2.Button();
        btnBack = new lib2.Button();
        btnEdit = new lib2.Button();
        jtfPass = new javax.swing.JTextField();
        jlIDStaff = new javax.swing.JLabel();
        jtfIDStaff = new javax.swing.JTextField();
        jlPass = new javax.swing.JLabel();
        btnClear = new lib2.Button();

        buttonGroup1.add(jrbFemale);
        buttonGroup1.add(jrbMale);
        jrbMale.setSelected(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản lý nhân viên");
        setResizable(false);

        jpMain.setFocusCycleRoot(true);

        jpTop.setBackground(new java.awt.Color(0, 128, 128));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo64.png"))); // NOI18N

        jlNameShop.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jlNameShop.setForeground(new java.awt.Color(255, 255, 255));
        jlNameShop.setText("Fley Shop");

        javax.swing.GroupLayout jpTopLayout = new javax.swing.GroupLayout(jpTop);
        jpTop.setLayout(jpTopLayout);
        jpTopLayout.setHorizontalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTopLayout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addComponent(jlLogo)
                .addGap(18, 18, 18)
                .addComponent(jlNameShop, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(475, 475, 475))
        );
        jpTopLayout.setVerticalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jlNameShop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpBottom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jpBottom.setToolTipText("");
        jpBottom.setLayout(new javax.swing.BoxLayout(jpBottom, javax.swing.BoxLayout.Y_AXIS));

        jpInfoStaff.setBackground(new java.awt.Color(255, 255, 255));

        jtfName.setLabelText("Họ tên");

        jtfCitizenIdentification.setLabelText("CCCD");
        jtfCitizenIdentification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCitizenIdentificationActionPerformed(evt);
            }
        });

        jtfPhone.setLabelText("Số điện thoại");
        jtfPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPhoneActionPerformed(evt);
            }
        });

        jtfDoB.setEditable(false);
        jtfDoB.setText("Ngày sinh");

        jlIconCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar32.png"))); // NOI18N
        jlIconCalendar.setToolTipText("");
        jlIconCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlIconCalendarMouseClicked(evt);
            }
        });

        jlSex.setText("Giới tính :");

        jrbMale.setBackground(new java.awt.Color(255, 255, 255));
        jrbMale.setText("Nam");

        jrbFemale.setBackground(new java.awt.Color(255, 255, 255));
        jrbFemale.setText("Nữ");
        jrbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFemaleActionPerformed(evt);
            }
        });

        cbProvince.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tỉnh/Thành phố" }));

        cbCommune.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Phường/Xã" }));

        jtfAddress.setLabelText("Địa chỉ cụ thể");

        cbPosition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chức vụ", "Quản ly", "Nhân Viên" }));

        cbDistrict.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quận/Huyện" }));

        javax.swing.GroupLayout jpInfoStaffLayout = new javax.swing.GroupLayout(jpInfoStaff);
        jpInfoStaff.setLayout(jpInfoStaffLayout);
        jpInfoStaffLayout.setHorizontalGroup(
            jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoStaffLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInfoStaffLayout.createSequentialGroup()
                        .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(jtfName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpInfoStaffLayout.createSequentialGroup()
                                .addComponent(jtfDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlIconCalendar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpInfoStaffLayout.createSequentialGroup()
                                .addComponent(jlSex)
                                .addGap(18, 18, 18)
                                .addComponent(jrbMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(jrbFemale))
                            .addComponent(jtfCitizenIdentification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpInfoStaffLayout.createSequentialGroup()
                        .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(cbCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 240, Short.MAX_VALUE))))
        );
        jpInfoStaffLayout.setVerticalGroup(
            jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCitizenIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIconCalendar)
                    .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlSex, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrbMale)
                        .addComponent(jrbFemale)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jpBottom.add(jpInfoStaff);

        jpAccStaff.setBackground(new java.awt.Color(255, 255, 255));
        jpAccStaff.setBorder(javax.swing.BorderFactory.createTitledBorder("Tài khoản nhân viên"));

        btnAdd.setBackground(new java.awt.Color(135, 206, 235));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add24.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(135, 206, 235));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back24.png"))); // NOI18N
        btnBack.setText("Quay lại  ");
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit24.png"))); // NOI18N
        btnEdit.setText("Sủa thông tin ");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jlIDStaff.setText("Mã NV :");

        jlPass.setText("Mật khẩu :");

        btnClear.setBackground(new java.awt.Color(135, 206, 235));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear24.png"))); // NOI18N
        btnClear.setText("Xóa trắng");
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAccStaffLayout = new javax.swing.GroupLayout(jpAccStaff);
        jpAccStaff.setLayout(jpAccStaffLayout);
        jpAccStaffLayout.setHorizontalGroup(
            jpAccStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAccStaffLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlIDStaff)
                .addGap(18, 18, 18)
                .addComponent(jtfIDStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlPass)
                .addGap(18, 18, 18)
                .addComponent(jtfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jpAccStaffLayout.setVerticalGroup(
            jpAccStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAccStaffLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jpAccStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDStaff)
                    .addComponent(jtfIDStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPass)
                    .addComponent(jtfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jpBottom.add(jpAccStaff);

        javax.swing.GroupLayout jpMainLayout = new javax.swing.GroupLayout(jpMain);
        jpMain.setLayout(jpMainLayout);
        jpMainLayout.setHorizontalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpBottom, javax.swing.GroupLayout.DEFAULT_SIZE, 1172, Short.MAX_VALUE))
        );
        jpMainLayout.setVerticalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addComponent(jpTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 480, Short.MAX_VALUE))
            .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainLayout.createSequentialGroup()
                    .addGap(0, 101, Short.MAX_VALUE)
                    .addComponent(jpBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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

    private void jtfCitizenIdentificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCitizenIdentificationActionPerformed

    }//GEN-LAST:event_jtfCitizenIdentificationActionPerformed

    private void jtfPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPhoneActionPerformed

    }//GEN-LAST:event_jtfPhoneActionPerformed

    private void jrbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFemaleActionPerformed

    }//GEN-LAST:event_jrbFemaleActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        jtfAddress.setText("");
        jtfCitizenIdentification.setText("");
        jtfDoB.setText("Ngày sinh");
        jtfIDStaff.setText("");
        jtfName.setText("");
        jtfPass.setText("");
        jtfPhone.setText("");
        cbCommune.setSelectedIndex(0);
        cbDistrict.setSelectedIndex(0);
        cbPosition.setSelectedIndex(0);
        cbProvince.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void jlIconCalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconCalendarMouseClicked

    }//GEN-LAST:event_jlIconCalendarMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Khi thực hiện thao tác này thông tin nhân viên sẽ được lưu vào hệ thống?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed
    
    public void setFlag(int flag) {
//        this.isEditing = isEditing;
        this.flag = flag;
        checkEvents(); // Sau khi đặt trạng thái, kiểm tra và cập nhật giao diện người dùng
    }
    
    public void checkEvents() {
        if (flag == 1) {
            btnEdit.setText("Sửa thông tin  ");
            btnEdit.setVisible(false);
        } else if (flag == 2) {
            btnAdd.setVisible(false);
            btnEdit.setText("Cập nhập  ");
            jlIDStaff.setVisible(false);
            jlPass.setVisible(false);
            jtfPass.setVisible(false);
            jtfIDStaff.setVisible(false);
        }
    }

    public void setBtnAdd(boolean status) {
        btnAdd.setVisible(status);
    }

    public void setJlIDStaff(boolean status) {
        jlIDStaff.setVisible(status);
    }

    public void setJlPass(boolean status) {
        jlPass.setVisible(status);
    }

    public void setJtfIDStaff(boolean status) {
        jtfIDStaff.setVisible(status);
    }

    public void setJtfPass(boolean status) {
        jtfPass.setVisible(status);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnAdd;
    private lib2.Button btnBack;
    private lib2.Button btnClear;
    private lib2.Button btnEdit;
    private javax.swing.ButtonGroup buttonGroup1;
    private lib2.ComboBoxSuggestion cbCommune;
    private lib2.ComboBoxSuggestion cbDistrict;
    private lib2.ComboBoxSuggestion cbPosition;
    private lib2.ComboBoxSuggestion cbProvince;
    private javax.swing.JLabel jlIDStaff;
    private javax.swing.JLabel jlIconCalendar;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlNameShop;
    private javax.swing.JLabel jlPass;
    private javax.swing.JLabel jlSex;
    private javax.swing.JPanel jpAccStaff;
    private javax.swing.JPanel jpBottom;
    private javax.swing.JPanel jpInfoStaff;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpTop;
    private javax.swing.JRadioButton jrbFemale;
    private javax.swing.JRadioButton jrbMale;
    private lib2.TextField jtfAddress;
    private lib2.TextField jtfCitizenIdentification;
    private javax.swing.JTextField jtfDoB;
    private javax.swing.JTextField jtfIDStaff;
    private lib2.TextField jtfName;
    private javax.swing.JTextField jtfPass;
    private lib2.TextField jtfPhone;
    // End of variables declaration//GEN-END:variables
}
