package gui;

import com.raven.datechooser.DateChooser;
import dao.Staff_DAO;
import entity.District;
import entity.Province;
import entity.Staff;
import entity.Staff.Rights;
import entity.Staff.Status;
import entity.Ward;
import java.awt.event.ItemEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.management.Notification;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import lib2.Button;
import utils.Utils;
import dao.Province_DAO;
import dao.District_DAO;
import dao.Ward_DAO;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import lib2.ComboBoxSuggestion;

public class Staff_InfoStaff_GUI extends javax.swing.JFrame {

    private DateChooser dateChooser;
    private boolean isEnabledEventWard = false;
    private boolean isEnabledEventDistrict = false;
    private boolean isEnabledEventProvince = false;
    private int flag = 0;
    private Staff_DAO staff_DAO;
    private Staff staff;
    private Province province;
    private District district;
    private Ward ward;
    private Province_DAO province_DAO = new Province_DAO();
    private District_DAO district_DAO = new District_DAO();
    private Ward_DAO ward_DAO = new Ward_DAO();

    public Staff_InfoStaff_GUI() {
        initComponents();
        setLocationRelativeTo(null);

        DateChooser dateChoose = new DateChooser();
        dateChoose.setDateFormat("dd/MM/yyyy");
        dateChoose.setTextRefernce(jtfDoB);

        staff_DAO = new Staff_DAO();

        setProvinceToComboBox();
        cbPosition.setModel(new DefaultComboBoxModel<>(new String[]{Staff.convertRightsToString(Rights.NhanVienQuanLy),
            Staff.convertRightsToString(Rights.NhanVienBanHang)}));
        cbStatusWorking.setModel(new DefaultComboBoxModel<>(new String[]{Staff.convertStatusToString(Status.DangLam),
            Staff.convertStatusToString(Status.NghiLam)}));

        cbDistrict.setEnabled(false);
        cbWard.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSex = new javax.swing.ButtonGroup();
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
        cbWard = new lib2.ComboBoxSuggestion();
        jtfAddress = new lib2.TextField();
        cbPosition = new lib2.ComboBoxSuggestion();
        cbDistrict = new lib2.ComboBoxSuggestion();
        cbStatusWorking = new lib2.ComboBoxSuggestion();
        jtfEmail = new lib2.TextField();
        jpAccStaff = new javax.swing.JPanel();
        btnAdd = new lib2.Button();
        btnBack = new lib2.Button();
        btnEdit = new lib2.Button();
        jtfPass = new javax.swing.JTextField();
        jlIDStaff = new javax.swing.JLabel();
        jtfIDStaff = new javax.swing.JTextField();
        jlPass = new javax.swing.JLabel();
        btnClear = new lib2.Button();

        bgSex.add(jrbFemale);
        bgSex.add(jrbMale);
        jrbMale.setSelected(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản lý nhân viên");
        setResizable(false);

        jpMain.setFocusCycleRoot(true);

        jpTop.setBackground(new java.awt.Color(0, 128, 128));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/Logo64.png"))); // NOI18N

        jlNameShop.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jlNameShop.setForeground(new java.awt.Color(255, 255, 255));
        jlNameShop.setText("Fley Shop");

        javax.swing.GroupLayout jpTopLayout = new javax.swing.GroupLayout(jpTop);
        jpTop.setLayout(jpTopLayout);
        jpTopLayout.setHorizontalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTopLayout.createSequentialGroup()
                .addContainerGap(452, Short.MAX_VALUE)
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
        jtfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfNameKeyPressed(evt);
            }
        });

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

        jlIconCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/calendar32.png"))); // NOI18N
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
        cbProvince.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProvinceItemStateChanged(evt);
            }
        });

        cbWard.setEditable(false);
        cbWard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Phường/Xã" }));
        cbWard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbWardItemStateChanged(evt);
            }
        });

        jtfAddress.setLabelText("Địa chỉ cụ thể");
        jtfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAddressActionPerformed(evt);
            }
        });

        cbPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPositionActionPerformed(evt);
            }
        });

        cbDistrict.setEditable(false);
        cbDistrict.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quận/Huyện" }));
        cbDistrict.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDistrictItemStateChanged(evt);
            }
        });

        cbStatusWorking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusWorkingActionPerformed(evt);
            }
        });

        jtfEmail.setLabelText("Email");
        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInfoStaffLayout = new javax.swing.GroupLayout(jpInfoStaff);
        jpInfoStaff.setLayout(jpInfoStaffLayout);
        jpInfoStaffLayout.setHorizontalGroup(
            jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoStaffLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInfoStaffLayout.createSequentialGroup()
                        .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbWard, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpInfoStaffLayout.createSequentialGroup()
                        .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(jtfName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpInfoStaffLayout.createSequentialGroup()
                                .addComponent(jtfDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlIconCalendar))
                            .addComponent(cbStatusWorking, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfCitizenIdentification, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addGroup(jpInfoStaffLayout.createSequentialGroup()
                                .addComponent(jlSex)
                                .addGap(18, 18, 18)
                                .addComponent(jrbMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(jrbFemale))
                            .addComponent(cbPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(217, 217, 217))
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
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInfoStaffLayout.createSequentialGroup()
                        .addComponent(cbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoStaffLayout.createSequentialGroup()
                        .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlIconCalendar))
                        .addGap(24, 24, 24)))
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbStatusWorking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlSex, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrbMale)
                        .addComponent(jrbFemale)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpBottom.add(jpInfoStaff);

        jpAccStaff.setBackground(new java.awt.Color(255, 255, 255));
        jpAccStaff.setBorder(javax.swing.BorderFactory.createTitledBorder("Tài khoản nhân viên"));

        btnAdd.setBackground(new java.awt.Color(135, 206, 235));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add24.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(135, 206, 235));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/back24.png"))); // NOI18N
        btnBack.setText("Quay lại  ");
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit24.png"))); // NOI18N
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
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/clear24.png"))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
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
                .addContainerGap(12, Short.MAX_VALUE)
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
//        jtfIDStaff.setText("");
        jtfName.setText("");
        jtfPass.setText("");
        jtfPhone.setText("");
        cbWard.setSelectedIndex(0);
        cbDistrict.setSelectedIndex(0);
        cbPosition.setSelectedIndex(0);
        cbProvince.setSelectedIndex(0);
        jrbMale.setSelected(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void jlIconCalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconCalendarMouseClicked

    }//GEN-LAST:event_jlIconCalendarMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
//        if (JOptionPane.showConfirmDialog(null, "Khi thực hiện thao tác này thông tin nhân viên sẽ được lưu vào hệ thống?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//
//        }
        String idStaff = jtfIDStaff.getText().trim();
        String name = jtfName.getText().trim();
        String cic = jtfCitizenIdentification.getText().trim();
        String phone = jtfPhone.getText().trim();
        String email = jtfEmail.getText().trim();
        LocalDate dob = Utils.getLocalDate(jtfDoB.getText().trim());
        boolean sex;
        if (jrbMale.isSelected()) {
            sex = true;
        } else {
            sex = false;
        }

        String address = jtfAddress.getText().trim();
        Rights rights = Staff.convertStringToRights(cbPosition.getSelectedItem().toString());
        Status status = Staff.convertStringToStatus(cbStatusWorking.getSelectedItem().toString());
        String password = jtfPass.getText().trim();
        Staff staff = new Staff(idStaff, name, cic, phone, email, dob, sex, province, district, ward, address, rights, status, password);
        staff_DAO.addStaff(staff);
        JOptionPane.showConfirmDialog(null, "Thêm nhân viên thành công");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void jtfNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameKeyPressed

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void cbPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPositionActionPerformed

    private void cbStatusWorkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusWorkingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusWorkingActionPerformed

    private void cbDistrictItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDistrictItemStateChanged

        if (!isEnabledEventDistrict) {
            return;
        }
        isEnabledEventWard = false;
        isEnabledEventDistrict = false;
        String nameDistrictSelected = (String) cbDistrict.getSelectedItem();
        cbWard = (ComboBoxSuggestion) resizeComboBox(cbWard, District.getDistrictLabel());
        ward = null;

        if (nameDistrictSelected.equals(District.getDistrictLabel())) {
            cbWard.setSelectedIndex(0);
            cbWard.setEnabled(false);
            district = null;
        } else {
            District district = district_DAO.getDistrictByNameDistrict(province, nameDistrictSelected);
            Staff_InfoStaff_GUI.this.district = district;
            cbDistrict.setEnabled(true);
            setWardToComboBox(this.district);
        }
        cbWard.setEnabled(true);
        isEnabledEventWard = true;
        isEnabledEventDistrict = true;
    }//GEN-LAST:event_cbDistrictItemStateChanged

    private void cbProvinceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProvinceItemStateChanged
        if (!isEnabledEventProvince) {
            return;
        }
        isEnabledEventDistrict = false;
        isEnabledEventWard = false;
        String nameProvinceIsSelected = (String) cbProvince.getSelectedItem();

        cbWard.setSelectedIndex(0);
        cbWard.setEnabled(false);
        cbDistrict = (ComboBoxSuggestion) resizeComboBox(cbDistrict, District.getDistrictLabel());
        district = null;
        ward = null;

        if (nameProvinceIsSelected.equals(province.getProvinceLabel())) {
            cbDistrict.setSelectedIndex(0);
            cbDistrict.setEnabled(false);
            province = null;
            return;
        }
        Province province = province_DAO.getProvinceByNameProvince(nameProvinceIsSelected);
        Staff_InfoStaff_GUI.this.province = province;

        try {
            setDistrictToComboBox(Staff_InfoStaff_GUI.this.province);
        } catch (SQLException ex) {
            Logger.getLogger(Staff_InfoStaff_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        repaint();
        cbDistrict.setEnabled(true);
        isEnabledEventDistrict = true;
        isEnabledEventWard = true;

    }//GEN-LAST:event_cbProvinceItemStateChanged

    private void cbWardItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbWardItemStateChanged
        if (!isEnabledEventWard) {
            return;
        }
        isEnabledEventWard = false;
        String nameWardSelected = cbWard.getSelectedItem().toString();

        if (nameWardSelected.equals(Ward.getWardLabel())) {
            ward = null;
            return;
        }

        Ward ward = ward_DAO.getWardByNameWard(district, nameWardSelected);
        Staff_InfoStaff_GUI.this.ward = ward;
        isEnabledEventWard = false;
    }//GEN-LAST:event_cbWardItemStateChanged

    private void jtfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAddressActionPerformed

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

    /*
    public void itemStateChanged(ItemEvent e) throws SQLException {
        Object object = e.getSource();
        if (e.getStateChange() != ItemEvent.SELECTED) {
            return;
        }
        if (cbProvince.equals(object)) {
            if (!isEnabledEventProvince) {
                return;
            }
            isEnabledEventDistrict = false;
            isEnabledEventWard = false;
            String provinceSelected = (String) cbPosition.getSelectedItem();

            cbWard.setSelectedIndex(0);
            cbWard.setEnabled(false);
//			cbDistrict = resizeComboBox(cbDistrict, district.getDistrictLabel());
            district = null;
            ward = null;

            if (provinceSelected.equals(province.getProvinceLabel())) {
                cbDistrict.setSelectedIndex(0);
                cbDistrict.setEnabled(false);
                province = null;
                return;
            }
            Province province = province_DAO.getProvince(provinceSelected);
            Staff_InfoStaff_GUI.this.province = province;
            setDistrictToComboBox(Staff_InfoStaff_GUI.this.province);
            repaint();
            cbDistrict.setEnabled(true);
            isEnabledEventDistrict = true;
            isEnabledEventWard = true;
        } else if (cbDistrict.equals(object)) {
            if (!isEnabledEventDistrict) {
                return;
            }
            isEnabledEventWard = false;
            isEnabledEventDistrict = false;
            String districtSelected = (String) cbDistrict.getSelectedItem();
//            cmbPhuong = resizeComboBox(cmbPhuong, Quan.getQuanLabel());
            ward = null;

            if (districtSelected.equals(District.getDistrictLabel())) {
                cbWard.setSelectedIndex(0);
                cbWard.setEnabled(false);
                district = null;
            } else {
                District district = district_DAO.getDistrict(province, districtSelected);
                Staff_InfoStaff_GUI.this.district = district;
                cbDistrict.setEnabled(true);
                setWardToComboBox(this.district);
            }

            isEnabledEventWard = true;
            isEnabledEventDistrict = true;
        } else if (cbWard.equals(object)) {
            if (!isEnabledEventWard) {
                return;
            }
            isEnabledEventWard = false;
            String wardSelected = (String) cbWard.getSelectedItem();

            if (wardSelected.equals(Ward.getWardLabel())) {
                ward = null;
                return;
            }

            Ward ward = ward_DAO.getWard(district, wardSelected);
            Staff_InfoStaff_GUI.this.ward = ward;
            isEnabledEventWard = false;
        }

    }
     */
    /**
     * Set danh sách tỉnh vào JComboBox
     */
    private void setProvinceToComboBox() {
        isEnabledEventProvince = false;

        List<Province> listProvince = province_DAO.getListProvince();

        listProvince.sort(new Comparator<Province>() {
            @Override
            public int compare(Province o1, Province o2) {
                return o1.getProvince().compareToIgnoreCase(o2.getProvince());
            }
        });

        listProvince.forEach(province -> cbProvince.addItem(province.getProvince()));

        isEnabledEventProvince = true;
    }

    /**
     * Set danh sách quận của tỉnh vào JComboBox
     *
     * @param tinh tỉnh cần lấy quận
     */
    private void setDistrictToComboBox(Province province) throws SQLException {
        isEnabledEventDistrict = false;

        List<District> listDistrict = district_DAO.getListDistrict(province);
        listDistrict.sort(new Comparator<District>() {
            @Override
            public int compare(District o1, District o2) {
                return o1.getDistrict().compareToIgnoreCase(o2.getDistrict());
            }
        });
        listDistrict.forEach(district -> cbDistrict.addItem(district.getDistrict()));

        isEnabledEventDistrict = true;
    }

    /**
     * Set danh sách phường của quận vào JComboBox
     *
     * @param quan quận cần lấy phường
     */
    private void setWardToComboBox(District district) {
        isEnabledEventWard = false;

        List<Ward> listWard = ward_DAO.getListWard(district);

        listWard.sort(new Comparator<Ward>() {

            @Override
            public int compare(Ward o1, Ward o2) {
                return o1.getWard().compareToIgnoreCase(o2.getWard());
            }
        });

        listWard.forEach(ward -> cbWard.addItem(ward.getWard()));

        isEnabledEventWard = true;
    }

    /**
     * Xóa tất cả các items của JComboBox và thêm chuỗi vào JComboBox
     *
     * @param <E>
     * @param list JComboBox cần xóa
     * @param firstLabel chuỗi cần thêm
     * @return
     */
    @SuppressWarnings("unchecked")
    private <E> JComboBox<E> resizeComboBox(JComboBox<E> list, String firstLabel) {
        list.removeAllItems();
        list.addItem((E) firstLabel);
        return list;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSex;
    private lib2.Button btnAdd;
    private lib2.Button btnBack;
    private lib2.Button btnClear;
    private lib2.Button btnEdit;
    private lib2.ComboBoxSuggestion cbDistrict;
    private lib2.ComboBoxSuggestion cbPosition;
    private lib2.ComboBoxSuggestion cbProvince;
    private lib2.ComboBoxSuggestion cbStatusWorking;
    private lib2.ComboBoxSuggestion cbWard;
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
    private lib2.TextField jtfEmail;
    private javax.swing.JTextField jtfIDStaff;
    private lib2.TextField jtfName;
    private javax.swing.JTextField jtfPass;
    private lib2.TextField jtfPhone;
    // End of variables declaration//GEN-END:variables
}
