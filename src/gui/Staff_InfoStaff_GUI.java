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
import javax.swing.table.DefaultTableModel;
import lib2.ComboBoxSuggestion;
import entity.Flag;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPanel;
import lib2.TextField;

public class Staff_InfoStaff_GUI extends javax.swing.JPanel {

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
    private Sell_GUI sell_GUI;
    private Staff_GUI staff_GUI;
    private Home_GUI home_GUI;

    public Staff_InfoStaff_GUI() {
        initComponents();

        DateChooser dateChoose = new DateChooser();
        dateChoose.setDateFormat("dd/MM/yyyy");
        dateChoose.setTextRefernce(jtfDoB);

        staff_DAO = new Staff_DAO();

        cbRights.setModel(new DefaultComboBoxModel<>(new String[]{Staff.convertRightsToString(Rights.NhanVienQuanLy),
            Staff.convertRightsToString(Rights.NhanVienBanHang)}));
        cbStatus.setModel(new DefaultComboBoxModel<>(new String[]{Staff.convertStatusToString(Status.DangLam),
            Staff.convertStatusToString(Status.NghiLam)}));

        cbDistrict.setEnabled(false);
        cbWard.setEnabled(false);

//        kiểm tra mở gui Staff info từ chức năng nào
        if (Flag.getFlagStaffInfo() == 1) {
//            nếu mở chức năng thêm nhân viên
            setProvinceToComboBox();
            btnEdit.setVisible(false);
//            btnBack.setVisible(false);

            // default Account
            jtfIDStaff.setText(staff_DAO.createIDStaff()); // tạo mã nhân viên
            jtfPass.setText("1234Abc@");
        } else if (Flag.getFlagStaffInfo() == 2) {
            try {
//             nếu mở chức năng chỉnh sữa thông tin nhân viên
                btnAdd.setVisible(false);
                setProvinceToComboBox();
                setDistrictToComboBox(province);
                setWardToComboBox(district);

                cbDistrict.setEnabled(true);
                cbWard.setEnabled(true);
                jlIDStaff.setVisible(false);
                jlPass.setVisible(false);
                jtfIDStaff.setVisible(false);
                jtfPass.setVisible(false);
                btnClear.setVisible(false);
                loadDataEdit(Flag.getFlagIDStaff());
            } catch (SQLException ex) {
                Logger.getLogger(Staff_InfoStaff_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpMain = new javax.swing.JPanel();
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
        cbRights = new lib2.ComboBoxSuggestion();
        cbDistrict = new lib2.ComboBoxSuggestion();
        cbStatus = new lib2.ComboBoxSuggestion();
        jtfEmail = new lib2.TextField();
        jPFunction = new javax.swing.JPanel();
        jtfIDStaff = new javax.swing.JTextField();
        jlIDStaff = new javax.swing.JLabel();
        jlPass = new javax.swing.JLabel();
        jtfPass = new javax.swing.JTextField();
        btnAdd = new lib2.Button();
        btnEdit = new lib2.Button();
        btnClear = new lib2.Button();
        btnBack = new lib2.Button();

        buttonGroup1.add(jrbFemale);
        buttonGroup1.add(jrbMale);
        jrbMale.setSelected(true);

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14)))); // NOI18N

        jpMain.setBackground(new java.awt.Color(255, 255, 255));
        jpMain.setLayout(new javax.swing.BoxLayout(jpMain, javax.swing.BoxLayout.Y_AXIS));

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
        cbProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProvinceActionPerformed(evt);
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

        cbRights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRightsActionPerformed(evt);
            }
        });

        cbDistrict.setEditable(false);
        cbDistrict.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quận/Huyện" }));
        cbDistrict.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDistrictItemStateChanged(evt);
            }
        });

        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
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
                .addGap(147, 147, 147)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInfoStaffLayout.createSequentialGroup()
                        .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbWard, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                    .addGroup(jpInfoStaffLayout.createSequentialGroup()
                        .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpInfoStaffLayout.createSequentialGroup()
                                .addComponent(jtfDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlIconCalendar))
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfCitizenIdentification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpInfoStaffLayout.createSequentialGroup()
                                .addComponent(jlSex)
                                .addGap(18, 18, 18)
                                .addComponent(jrbMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbFemale))
                            .addComponent(cbRights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(207, 207, 207))
        );
        jpInfoStaffLayout.setVerticalGroup(
            jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoStaffLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCitizenIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIconCalendar)
                    .addComponent(cbRights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlSex, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrbMale)
                        .addComponent(jrbFemale)))
                .addGap(18, 18, 18)
                .addGroup(jpInfoStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jpMain.add(jpInfoStaff);

        jPFunction.setBackground(new java.awt.Color(255, 255, 255));
        jPFunction.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        jtfIDStaff.setEditable(false);

        jlIDStaff.setText("Mã NV :");

        jlPass.setText("Mật khẩu :");

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

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit24.png"))); // NOI18N
        btnEdit.setText("Cập nhập  ");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(135, 206, 235));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/clear24.png"))); // NOI18N
        btnClear.setText("Xóa trắng  ");
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
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

        javax.swing.GroupLayout jPFunctionLayout = new javax.swing.GroupLayout(jPFunction);
        jPFunction.setLayout(jPFunctionLayout);
        jPFunctionLayout.setHorizontalGroup(
            jPFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFunctionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlIDStaff)
                .addGap(18, 18, 18)
                .addComponent(jtfIDStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlPass)
                .addGap(18, 18, 18)
                .addComponent(jtfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPFunctionLayout.setVerticalGroup(
            jPFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFunctionLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlIDStaff)
                        .addComponent(jtfIDStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlPass)
                        .addComponent(jtfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jpMain.add(jPFunction);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameKeyPressed

    private void jtfCitizenIdentificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCitizenIdentificationActionPerformed

    }//GEN-LAST:event_jtfCitizenIdentificationActionPerformed

    private void jtfPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPhoneActionPerformed

    }//GEN-LAST:event_jtfPhoneActionPerformed

    private void jlIconCalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconCalendarMouseClicked
        DateChooser dateChoose = new DateChooser();
        dateChoose.setDateFormat("dd/MM/yyyy");
        dateChoose.setTextRefernce(jtfDoB);
    }//GEN-LAST:event_jlIconCalendarMouseClicked

    private void jrbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFemaleActionPerformed

    }//GEN-LAST:event_jrbFemaleActionPerformed

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

    private void cbRightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRightsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRightsActionPerformed

    private void cbDistrictItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDistrictItemStateChanged
        if (!isEnabledEventDistrict) {
            return;
        }
        isEnabledEventWard = false;
        isEnabledEventDistrict = false;
        String nameDistrictSelected = (String) cbDistrict.getSelectedItem();
        cbWard = (ComboBoxSuggestion) resizeComboBox(cbWard, Ward.getWardLabel());
        ward = null;

        if (nameDistrictSelected.equals(District.getDistrictLabel())) {
            cbWard.setSelectedIndex(0);
            cbWard.setEnabled(false);
            district = null;
        } else {
            District district = district_DAO.getDistrictByNameDistrict(province, nameDistrictSelected);
            Staff_InfoStaff_GUI.this.district = district;
            cbWard.setEnabled(true);
            setWardToComboBox(this.district);
        }
        isEnabledEventWard = true;
        isEnabledEventDistrict = true;
    }//GEN-LAST:event_cbDistrictItemStateChanged

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (validator()) {
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
            Rights rights = Staff.convertStringToRights(cbRights.getSelectedItem().toString());
            Status status = Staff.convertStringToStatus(cbStatus.getSelectedItem().toString());
            String password = jtfPass.getText().trim();
            Staff staff = new Staff(jtfIDStaff.getText().trim(), name, cic, phone, email, dob, sex, province, district, ward, address, rights, status, password);
            boolean res = staff_DAO.addStaff(staff);
            if (res) {
                JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công !");
                backToStaffGUI();
            } else {
                JOptionPane.showMessageDialog(null, "Thêm nhân viên thất bại !");
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (validator()) {
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
            Rights rights = Staff.convertStringToRights(cbRights.getSelectedItem().toString());
            Status status = Staff.convertStringToStatus(cbStatus.getSelectedItem().toString());
            String password = jtfPass.getText().trim();
            Staff staff = new Staff(jtfIDStaff.getText().trim(), name, cic, phone, email, dob, sex, province, district, ward, address, rights, status, password);
            int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn cập nhập lại thông tin nhân viên hay không ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                boolean res = staff_DAO.updateInfoStaff(staff);
                if (res) {
                    JOptionPane.showMessageDialog(null, "Cập nhập thông tin nhân viên thành công !");
                    backToStaffGUI();
                }
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        jtfAddress.setText("");
        jtfCitizenIdentification.setText("");
        jtfDoB.setText("Ngày sinh");
//        jtfIDStaff.setText("");
        jtfName.setText("");
//        jtfPass.setText("");
        jtfEmail.setText("");
        jtfPhone.setText("");
        cbWard.setSelectedIndex(0);
        cbDistrict.setSelectedIndex(0);
        cbRights.setSelectedIndex(0);
        cbProvince.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        backToStaffGUI();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProvinceActionPerformed
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
        if (Flag.getFlagStaffInfo() == 1) {
//          nếu mở chức năng thêm nhân viên
            listProvince.forEach(province -> cbProvince.addItem(province.getProvince()));
            isEnabledEventProvince = true;
        } else if (Flag.getFlagStaffInfo() == 2) {
//          nếu mở chức năng sửa thông tin nhân viên
            listProvince.forEach(province -> {
                int index = listProvince.indexOf(province);
                cbProvince.addItem(province.getProvince());

                Staff staffTMP = staff_DAO.getStaffByID(Flag.getFlagIDStaff());
                if (province.getId().equals(staffTMP.getProvince().getId())) {
                    cbProvince.setSelectedIndex(index + 1);
                    Staff_InfoStaff_GUI.this.province = province;
                }
            });

            isEnabledEventProvince = true;
        }
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
        if (Flag.getFlagStaffInfo() == 1) {
//            Nếu là mở chức năng thêm nhân viên
            listDistrict.forEach(district -> cbDistrict.addItem(district.getDistrict()));
            isEnabledEventDistrict = true;
        } else if (Flag.getFlagStaffInfo() == 2) {
//            Nếu mở chức năng chỉnh sửa thôn tin nhân viên
            listDistrict.forEach(district -> {
                int index = listDistrict.indexOf(district);
                cbDistrict.addItem(district.getDistrict());
                Staff staffTMP = staff_DAO.getStaffByID(Flag.getFlagIDStaff());
                if (district.getId().equals(staffTMP.getDistrict().getId())) {
                    cbDistrict.setSelectedIndex(index + 1);
                    Staff_InfoStaff_GUI.this.district = district;
                }
            });
            isEnabledEventDistrict = true;
        }
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
        if (Flag.getFlagStaffInfo() == 1) {
            //          nếu mở chức năng thêm nhân viên
            listWard.forEach(ward -> cbWard.addItem(ward.getWard()));
            isEnabledEventWard = true;
        } else if (Flag.getFlagStaffInfo() == 2) {
//            Nếu mở chức năng chỉnh sửa thông tin nhân viên
            listWard.forEach(ward -> {
                int index = listWard.indexOf(ward);
                cbWard.addItem(ward.getWard());
                Staff staffTMP = staff_DAO.getStaffByID(Flag.getFlagIDStaff());
                if (ward.getId().equals(staffTMP.getWard().getId())) {
                    cbWard.setSelectedIndex(index + 1);
                    Staff_InfoStaff_GUI.this.ward = ward;
                }
            });
            isEnabledEventWard = true;
        }
    }

//    show error
    private boolean showERROR(JTextField jtf, String mess) {
        jtf.selectAll();
        jtf.requestFocus();
        JOptionPane.showMessageDialog(null, mess);
        return false;
    }

//    load data lên các JTF nếu mở chức năng edit thông tin nhân viên
    public void loadDataEdit(String id) {
        Staff staff = staff_DAO.getStaffByID(id);
        jtfIDStaff.setText(staff.getIdStaff().trim());
        jtfName.setText(staff.getName().trim());
        jtfCitizenIdentification.setText(staff.getCic().trim());
        jtfPhone.setText(staff.getPhone().trim());
        jtfEmail.setText(staff.getEmail().trim());
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dob = "";
        try {
            Date date = inputDateFormat.parse(staff.getDayofbirth().toString());
            dob = outputDateFormat.format(date);
        } catch (ParseException e) {
            System.err.println("Lỗi xảy ra trong quá trình chuyển đổi định dạng.");
            e.printStackTrace();
        }
        jtfDoB.setText(dob);
        if (staff.getRights().toString().trim().equals("NhanVienQuanLy")) {
            cbRights.setSelectedIndex(0);
        } else if (staff.getRights().toString().trim().equals("NhanVienBanHang")) {
            cbRights.setSelectedIndex(1);
        }
        if (staff.getStatus().toString().trim().equals("DangLam")) {
            cbStatus.setSelectedIndex(0);
        } else if (staff.getStatus().toString().trim().equals("NghiLam")) {
            cbStatus.setSelectedIndex(1);
        }
        if (staff.isSex() == true) {
            jrbMale.setSelected(true);
        } else {
            jrbFemale.setSelected(true);
        }
        jtfAddress.setText(staff.getAddress().trim());
        jtfPass.setText(staff.getPassword().trim());
    }

    private boolean checkRegex(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Kiểm tra thông tin nhân viên
     *
     * @return true nếu thông tin nhân viên hợp lệ
     */
    private boolean validator() {
        String vietNamese = Utils.getVietnameseDiacriticCharacters() + "A-Z";
        String vietNameseLower = Utils.getVietnameseDiacriticCharactersLower() + "a-z";

        String name = jtfName.getText().trim();
        if (name.length() <= 0) {
            return showERROR(jtfName, "Họ tên không được trống !");
        }
        if (checkRegex(name, "^[^\\d]*$") == false) {
            return showERROR(jtfName, "Họ tên không được chứa ký tự số !");
        }
        if (!Pattern.matches(
                String.format("[%s][%s]*( [%s][%s]*)+", vietNamese, vietNameseLower, vietNamese, vietNameseLower),
                name)) {
            return showERROR(jtfName, "Họ tên bắt đầu bằng ký tự hoa, có ít nhất 2 từ trong đó không chứa ký tự đặc biệt nào !");
        }

        String cic = jtfCitizenIdentification.getText().trim();
        if (cic.length() <= 0) {
            return showERROR(jtfCitizenIdentification, "Vui lòng nhập đầy đủ số CCCD !");
        }
        if (checkRegex(cic, "^\\d{12}$") == false) {
            return showERROR(jtfCitizenIdentification, "CCCD phải là 12 ký tự số !");
        }

        String phone = jtfPhone.getText().trim();
        if (phone.length() <= 0) {
            return showERROR(jtfPhone, "Vui lòng nhập số điện thoại của nhân viên !");
        }
        if (checkRegex(phone, "^0\\d{9}$") == false) {
            return showERROR(jtfPhone, "Số điện thoại không đúng định dạng 0xx.xxxx.xxx vui lòng kiểm tra lại");
        }

        String email = jtfEmail.getText().trim();
        String regexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
        if(email.length() < 1){
            return showERROR(jtfEmail, "Vui lòng nhập địa chỉ Email !");
        }
        if (checkRegex(email, regexEmail) == false) {
            return showERROR(jtfEmail, "Email không đúng định dạng, vui lòng kiểm tra lại !");
        }

        String dob = jtfDoB.getText();
        long daysElapsed = java.time.temporal.ChronoUnit.DAYS.between(Utils.getLocalDate(dob), LocalDate.now());
        boolean checkAge = daysElapsed / (18 * 365) > 0;
        if (checkAge == false) {
            return showERROR(jtfDoB, "Nhân viên chưa đủ 18 tuổi !");
        }

        String province = (String) cbProvince.getSelectedItem();
        if (province.equals(Province.getProvinceLabel())) {
            JOptionPane.showMessageDialog(null, "Hãy chọn địa chỉ Tỉnh/Thành phố");
            return false;
        }
        String district = (String) cbDistrict.getSelectedItem();
        if (district.equals(District.getDistrictLabel())) {
            JOptionPane.showMessageDialog(null, "Hãy chọn địa chỉ Quận/Huyện");
            return false;
        }
        String ward = (String) cbWard.getSelectedItem();
        if (ward.equals(Ward.getWardLabel())) {
            JOptionPane.showMessageDialog(null, "Hãy chọn địa chỉ Phường/Xã");
            return false;
        }
        String address = jtfAddress.getText().trim();
        if (address.length() <= 0) {
            return showERROR(jtfAddress, "Vui lòng nhập địa chỉ cụ thể");
        }

        if (Flag.getFlagStaffInfo() == 1) {
            if (staff_DAO.checkCICExist(cic)) {
                return showERROR(jtfCitizenIdentification, "Số CCCD này đã tồn tại trên hệ thống vui lòng kiểm tra lại");
            }
            if (staff_DAO.checkPhoneExist(phone)) {
                return showERROR(jtfPhone, "Số điện thoại này đã được sử dụng trên hệ thống vui lòng kiểm tra lại !");
            }
            if(staff_DAO.checkEmailExist(email)){
                return showERROR(jtfPhone, "Email này đã được sử dụng trên hệ thống vui lòng kiểm tra lại !");
            }
            String pass = jtfPass.getText().trim();
            String regexPass = "^(?=.*[A-Z])(?=.*\\d)(?=.*\\W).{8,}$";
            if (checkRegex(pass, regexPass) == false) {
                return showERROR(jtfPass, "Password có ít nhất 8 ký tự, trong có có ít nhất một chữ in hoa, và một ký tự đặc biệt!");
            }
        } else if (Flag.getFlagStaffInfo() == 2) {

            String name1 = jtfName.getText().trim();
            String cic1 = jtfCitizenIdentification.getText().trim();
            String phone1 = jtfPhone.getText().trim();
            String email1 = jtfEmail.getText().trim();
            LocalDate dob1 = Utils.getLocalDate(jtfDoB.getText().trim());
            boolean sex1;
            if (jrbMale.isSelected()) {
                sex1 = true;
            } else {
                sex1 = false;
            }
            String address1 = jtfAddress.getText().trim();
            Rights rights1 = Staff.convertStringToRights(cbRights.getSelectedItem().toString());
            Status status1 = Staff.convertStringToStatus(cbStatus.getSelectedItem().toString());
            String password1 = jtfPass.getText().trim();
            Staff staffTMP1 = new Staff(jtfIDStaff.getText().trim(), name1, cic1, phone1, email1, dob1, sex1, this.province, this.district, this.ward, address, rights1, status1, password1);
            Staff staffTMP2 = staff_DAO.getStaffByID(jtfIDStaff.getText().trim());

            if (!staffTMP1.equals(staffTMP2)) {
                if (staff_DAO.checkCICExist(cic)) {
                    return showERROR(jtfCitizenIdentification, "Số CCCD này đã tồn tại trên hệ thống vui lòng kiểm tra lại");
                }
                if (staff_DAO.checkPhoneExist(phone)) {
                    return showERROR(jtfPhone, "Số điện thoại này đã được sử dụng trên hệ thống vui lòng kiểm tra lại !");
                }
                if (staff_DAO.checkEmailExist(email)) {
                    return showERROR(jtfPhone, "Email này đã được sử dụng trên hệ thống vui lòng kiểm tra lại !");
                }
            }
        }
        return true;
    }

    private void clear() {
        jtfAddress.setText("");
        jtfCitizenIdentification.setText("");
        jtfDoB.setText("Ngày sinh");
        jtfName.setText("");
        jtfPass.setText("");
        jtfPhone.setText("");
        cbWard.setSelectedIndex(0);
        cbDistrict.setSelectedIndex(0);
        cbRights.setSelectedIndex(0);
        cbProvince.setSelectedIndex(0);
        jrbMale.setSelected(true);
    }

    public void stopWebcam() {
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
    }

    public void backToStaffGUI() {
        JPanel parent = (JPanel) this.getParent();
        parent.remove(this);
        parent.add(new Staff_GUI()); // Thay "JPanel1()" bằng cách khởi tạo đúng của JPanel 1
        parent.revalidate();
        parent.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnAdd;
    private lib2.Button btnBack;
    private lib2.Button btnClear;
    private lib2.Button btnEdit;
    private javax.swing.ButtonGroup buttonGroup1;
    private lib2.ComboBoxSuggestion cbDistrict;
    private lib2.ComboBoxSuggestion cbProvince;
    private lib2.ComboBoxSuggestion cbRights;
    private lib2.ComboBoxSuggestion cbStatus;
    private lib2.ComboBoxSuggestion cbWard;
    private javax.swing.JPanel jPFunction;
    private javax.swing.JLabel jlIDStaff;
    private javax.swing.JLabel jlIconCalendar;
    private javax.swing.JLabel jlPass;
    private javax.swing.JLabel jlSex;
    private javax.swing.JPanel jpInfoStaff;
    private javax.swing.JPanel jpMain;
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
