package gui;

import dao.Customer_DAO;
import dao.District_DAO;
import dao.Province_DAO;
import dao.Ward_DAO;
import entity.Customer;
import entity.District;
import entity.Flag;
import entity.Province;
import entity.Ward;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import lib2.ComboBoxSuggestion;
import lib2.TableCustom;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Utils;

public class Customer_GUI extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModel;
    private PurchaseHistory_GUI purchaseHistory_GUI;
    private Customer_DAO customer_DAO = new Customer_DAO();
    private Province_DAO province_DAO = new Province_DAO();
    private District_DAO district_DAO = new District_DAO();
    private Ward_DAO ward_DAO = new Ward_DAO();
    private Province province;
    private District district;
    private Ward ward;
    private boolean isEnabledEventWard = false;
    private boolean isEnabledEventDistrict = false;
    private boolean isEnabledEventProvince = false;

    public Customer_GUI() {
        initComponents();
        TableCustom.apply(jspTableCus, TableCustom.TableType.DEFAULT);
        defaultTableModel = (DefaultTableModel) jTableCus.getModel();
        ListSelectionModel selectionModel = jTableCus.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        loadData();
        setProvinceToComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTop = new javax.swing.JPanel();
        jlIDCus = new javax.swing.JLabel();
        jtfIDCus = new javax.swing.JTextField();
        jlNameCus = new javax.swing.JLabel();
        jlPhoneCus = new javax.swing.JLabel();
        jlAddress = new javax.swing.JLabel();
        cbProvince = new lib2.ComboBoxSuggestion();
        cbWard = new lib2.ComboBoxSuggestion();
        cbDistrict = new lib2.ComboBoxSuggestion();
        jlAddressDetails = new javax.swing.JLabel();
        jtfNameCus = new javax.swing.JTextField();
        jtfPhoneCus = new javax.swing.JTextField();
        jtfAddressDetails = new javax.swing.JTextField();
        jcReceivePromotion = new javax.swing.JCheckBox();
        btnAdd = new lib2.Button();
        btnSave = new lib2.Button();
        btnReload = new lib2.Button();
        jlEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        btnEdit = new lib2.Button();
        jpBottom = new javax.swing.JPanel();
        jpSelect = new javax.swing.JPanel();
        jpTable = new javax.swing.JPanel();
        jspTableCus = new javax.swing.JScrollPane();
        jTableCus = new javax.swing.JTable();
        jlFilterPhone = new javax.swing.JLabel();
        jtfFilterPhone = new javax.swing.JTextField();
        btnFilter = new lib2.Button();
        jButton1 = new javax.swing.JButton();
        btnFilter2 = new lib2.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jpTop.setBackground(new java.awt.Color(255, 255, 255));
        jpTop.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thiết lập thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jlIDCus.setText("Mã khách hàng : ");

        jtfIDCus.setEditable(false);
        jtfIDCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDCusActionPerformed(evt);
            }
        });

        jlNameCus.setText("Tên khách hàng :");

        jlPhoneCus.setText("Số điện thoại : ");

        jlAddress.setText("Địa chỉ : ");

        cbProvince.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tỉnh/Thành phố" }));
        cbProvince.setEnabled(false);
        cbProvince.setFocusCycleRoot(true);
        cbProvince.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProvinceItemStateChanged(evt);
            }
        });

        cbWard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Phường/Xã" }));
        cbWard.setEnabled(false);
        cbWard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbWardItemStateChanged(evt);
            }
        });
        cbWard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbWardActionPerformed(evt);
            }
        });

        cbDistrict.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quận/Huyện" }));
        cbDistrict.setEnabled(false);
        cbDistrict.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDistrictItemStateChanged(evt);
            }
        });
        cbDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDistrictActionPerformed(evt);
            }
        });

        jlAddressDetails.setText("Địa chỉ cụ thể :");

        jtfNameCus.setEditable(false);
        jtfNameCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameCusActionPerformed(evt);
            }
        });

        jtfPhoneCus.setEditable(false);
        jtfPhoneCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPhoneCusActionPerformed(evt);
            }
        });

        jtfAddressDetails.setEditable(false);
        jtfAddressDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAddressDetailsActionPerformed(evt);
            }
        });

        jcReceivePromotion.setBackground(new java.awt.Color(255, 255, 255));
        jcReceivePromotion.setText("Nhận thông tin chương trình khuyến mãi ?");

        btnAdd.setBackground(new java.awt.Color(135, 206, 235));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add24.png"))); // NOI18N
        btnAdd.setText("Thêm mới");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(135, 206, 235));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/done24.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReload.setBackground(new java.awt.Color(135, 206, 235));
        btnReload.setForeground(new java.awt.Color(255, 255, 255));
        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/refresh24.png"))); // NOI18N
        btnReload.setText("Làm mới");
        btnReload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        jlEmail.setText("Email:");

        jtfEmail.setEditable(false);
        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit24.png"))); // NOI18N
        btnEdit.setText("Cập nhập");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTopLayout = new javax.swing.GroupLayout(jpTop);
        jpTop.setLayout(jpTopLayout);
        jpTopLayout.setHorizontalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIDCus)
                            .addComponent(jlAddress)
                            .addComponent(jlPhoneCus)
                            .addComponent(jlAddressDetails))
                        .addGap(25, 25, 25)
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfAddressDetails)
                            .addGroup(jpTopLayout.createSequentialGroup()
                                .addComponent(jtfIDCus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170)
                                .addComponent(jlNameCus))
                            .addGroup(jpTopLayout.createSequentialGroup()
                                .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbWard, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpTopLayout.createSequentialGroup()
                                .addComponent(jtfPhoneCus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170)
                                .addComponent(jlEmail)))
                        .addGap(44, 44, 44)
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcReceivePromotion)))
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jpTopLayout.setVerticalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDCus)
                    .addComponent(jtfIDCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNameCus)
                    .addComponent(jtfNameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPhoneCus)
                    .addComponent(jtfPhoneCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEmail)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAddress)
                    .addComponent(jcReceivePromotion)
                    .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAddressDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAddressDetails))
                .addGap(18, 18, 18)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jpTop);

        jpBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpBottom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jpSelect.setLayout(new java.awt.GridLayout(1, 2));

        jpTable.setBackground(new java.awt.Color(255, 255, 255));

        jTableCus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Email", "Địa chỉ", "Điểm tích lũy", "Xếp hạng", "Tổng chi tiêu trong 6 tháng", "Nhận thông tin khuyến mãi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCusMouseClicked(evt);
            }
        });
        jspTableCus.setViewportView(jTableCus);

        jlFilterPhone.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlFilterPhone.setText("Tìm theo SDT :");

        jtfFilterPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFilterPhoneActionPerformed(evt);
            }
        });

        btnFilter.setBackground(new java.awt.Color(135, 206, 235));
        btnFilter.setForeground(new java.awt.Color(255, 255, 255));
        btnFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search24.png"))); // NOI18N
        btnFilter.setText("Tìm kiếm");
        btnFilter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Test lịch sử GD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnFilter2.setBackground(new java.awt.Color(135, 206, 235));
        btnFilter2.setForeground(new java.awt.Color(255, 255, 255));
        btnFilter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/outputfile24.png"))); // NOI18N
        btnFilter2.setText("Xuất file DSKH tiềm năng");
        btnFilter2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFilter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilter2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTableLayout = new javax.swing.GroupLayout(jpTable);
        jpTable.setLayout(jpTableLayout);
        jpTableLayout.setHorizontalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlFilterPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfFilterPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, Short.MAX_VALUE)
                .addComponent(btnFilter2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jspTableCus)
        );
        jpTableLayout.setVerticalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addComponent(jspTableCus, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jlFilterPhone)
                    .addComponent(jButton1)
                    .addComponent(jtfFilterPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilter2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jpBottomLayout = new javax.swing.GroupLayout(jpBottom);
        jpBottom.setLayout(jpBottomLayout);
        jpBottomLayout.setHorizontalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpBottomLayout.setVerticalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBottomLayout.createSequentialGroup()
                .addComponent(jpSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jpBottom);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIDCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDCusActionPerformed

    private void jtfNameCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameCusActionPerformed

    private void jtfPhoneCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPhoneCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPhoneCusActionPerformed

    private void jtfAddressDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAddressDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAddressDetailsActionPerformed

    private void jtfFilterPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFilterPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFilterPhoneActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        loadData();
        clearInput();
        JOptionPane.showMessageDialog(null, "Danh sách khách hàng đã được làm mới ");
    }//GEN-LAST:event_btnReloadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        purchaseHistory_GUI = new PurchaseHistory_GUI();
        purchaseHistory_GUI.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDistrictActionPerformed

    private void cbWardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbWardActionPerformed

    }//GEN-LAST:event_cbWardActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        jtfIDCus.setText(customer_DAO.createIDCustomer().toString());
        Flag.setFlagUpdateCustomer(1);
        if (btnAdd.getText().trim().equals("Thêm mới")) {
            onInput();
            btnSave.setEnabled(true);
            btnEdit.setEnabled(false);
            btnAdd.setText("Hủy");
            btnReload.setEnabled(false);
            if (!(jtfNameCus.getText().trim().equals(""))) {
//              nếu 1 trong các jtf có dữ liệu tức là có thao tác chọn index bên dưới jtbale => remove all 
                clearInput();
                jtfIDCus.setText(customer_DAO.createIDCustomer());
            }
        } else if (btnAdd.getText().trim().equals("Hủy")) {
            btnSave.setEnabled(false);
            btnEdit.setEnabled(true);
            btnAdd.setText("Thêm mới");
            btnReload.setEnabled(true);
            offInput();
            clearInput();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        String phoneFilter = jtfFilterPhone.getText().trim();
        if (phoneFilter.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số điện thoại khách hàng cần tìm !");
        } else {
            Customer customer = customer_DAO.getCustomerByPhone(phoneFilter);
            if (customer == null) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy khách hàng có số điện thoại: " + phoneFilter);
            } else {
                loadDataSearch(customer);
            }
        }
    }//GEN-LAST:event_btnFilterActionPerformed

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
        Customer_GUI.this.province = province;

        try {
            setDistrictToComboBox(Customer_GUI.this.province);
        } catch (SQLException ex) {

        }
        repaint();
        cbDistrict.setEnabled(true);
        isEnabledEventDistrict = true;
        isEnabledEventWard = true;
    }//GEN-LAST:event_cbProvinceItemStateChanged

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
            Customer_GUI.this.district = district;
            cbWard.setEnabled(true);
            setWardToComboBox(this.district);
        }
        isEnabledEventWard = true;
        isEnabledEventDistrict = true;
    }//GEN-LAST:event_cbDistrictItemStateChanged

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
        Customer_GUI.this.ward = ward;
        isEnabledEventWard = false;
    }//GEN-LAST:event_cbWardItemStateChanged

    private void jTableCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCusMouseClicked
        if (evt.getClickCount() == 1 && btnAdd.getText().equals("Thêm mới")) {
            int selectedRow = jTableCus.getSelectedRow();
            jtfIDCus.setText(jTableCus.getValueAt(selectedRow, 0).toString());
            jtfNameCus.setText(jTableCus.getValueAt(selectedRow, 1).toString());
            jtfPhoneCus.setText(jTableCus.getValueAt(selectedRow, 2).toString());
            jtfEmail.setText(jTableCus.getValueAt(selectedRow, 3).toString());

            int selectRow = jTableCus.getSelectedRow();
            Flag.setFlagIDCustomer(defaultTableModel.getValueAt(selectRow, 0).toString()); // lấy id nhà cung cấp cần chỉnh sửa 
//          cắt chuỗi bằng dấu phẩy (để lấy addressDetails)
            String input = jTableCus.getValueAt(selectedRow, 4).toString();
            String[] parts = input.split(",");
            if (parts.length >= 4) {
                jtfAddressDetails.setText(parts[3].trim()); // lấy chuỗi thứ 4
            }

//            chuyển đổi check trong table thành kiểu boolean
            Object value = jTableCus.getValueAt(selectRow, 8);
            Boolean boolValue = (Boolean) value;
            boolean resJCheck = boolValue.booleanValue();
            if (resJCheck) {
                jcReceivePromotion.setSelected(true);
            } else {
                jcReceivePromotion.setSelected(false);
            }

//          lấy province
            List<Province> listProvince = province_DAO.getListProvince();
            listProvince.sort(new Comparator<Province>() {
                @Override
                public int compare(Province o1, Province o2) {
                    return o1.getProvince().compareToIgnoreCase(o2.getProvince());
                }
            });
            listProvince.forEach(province -> {
                int index = listProvince.indexOf(province);
                cbProvince.addItem(province.getProvince());

                Customer CustomerTMP = customer_DAO.getCustomerByID(Flag.getFlagIDCustomer());
                if (province.getId().equals(CustomerTMP.getProvince().getId())) {
                    cbProvince.setSelectedIndex(index + 1);
                    Customer_GUI.this.province = province;
                }
            });
            cbDistrict.setEnabled(false);
        }

//        lấy district
        List<District> listDistrict = district_DAO.getListDistrict(province);
        listDistrict.sort(new Comparator<District>() {
            @Override
            public int compare(District o1, District o2) {
                return o1.getDistrict().compareToIgnoreCase(o2.getDistrict());
            }
        });
        listDistrict.forEach(district -> {
            int index = listDistrict.indexOf(district);
            cbDistrict.addItem(district.getDistrict());
            Customer customerTMP = customer_DAO.getCustomerByID(Flag.getFlagIDCustomer());
            if (district.getId().equals(customerTMP.getDistrict().getId())) {
                cbDistrict.setSelectedIndex(index + 1);
                Customer_GUI.this.district = district;
            }
        });
        cbWard.setEnabled(false);

//        lấy ward
        List<Ward> listWard = ward_DAO.getListWard(district);
        listWard.sort(new Comparator<Ward>() {
            @Override
            public int compare(Ward o1, Ward o2) {
                return o1.getWard().compareToIgnoreCase(o2.getWard());
            }
        });
        listWard.forEach(ward -> {
            int index = listWard.indexOf(ward);
            cbWard.addItem(ward.getWard());
            Customer customerTMP = customer_DAO.getCustomerByID(Flag.getFlagIDCustomer());
            if (ward.getId().equals(customerTMP.getWard().getId())) {
                cbWard.setSelectedIndex(index + 1);
                Customer_GUI.this.ward = ward;
            }
        });
    }//GEN-LAST:event_jTableCusMouseClicked

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (Flag.getFlagUpdateCustomer() == 1) {
            if (btnAdd.getText().trim().equals("Hủy")) {
                if (validator()) {

                    String idCustomer = jtfIDCus.getText().trim();
                    String name = jtfNameCus.getText().trim();
                    String phone = jtfPhoneCus.getText().trim();
                    String email = jtfEmail.getText().trim();
                    String address = jtfAddressDetails.getText().trim();
                    if (jtfNameCus.getText().trim().equals("")) {
                        name = "Khách  hàng tạm";
                    }
                    Customer customer = new Customer(idCustomer, name, phone, email, province, district, ward, address, 0, Customer.convertStringToTypeRank("Khách hàng bạc"), 0, jcReceivePromotion.isSelected());
                    boolean res = customer_DAO.addCustomer(customer);
                    if (res) {
                        loadData();
                        clearInput();
                        btnSave.setEnabled(false);
                        btnAdd.setEnabled(true);
                        offInput();
                        btnEdit.setEnabled(true);
                        btnAdd.setText("Thêm mới");
                        btnReload.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Thêm khách hàng thành công !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Thêm khách hàng thất bại !");
                    }
                }
            }
        } else if (Flag.getFlagUpdateCustomer() == 2) {
            if (validator()) {
                String id = jtfIDCus.getText().trim();
                String name = jtfNameCus.getText().trim();
                String phone = jtfPhoneCus.getText().trim();
                String email = jtfEmail.getText().trim();
                String addressDetails = jtfAddressDetails.getText().trim();
                Customer customer = new Customer(jtfIDCus.getText().trim(), name, phone, email, province, district, ward, addressDetails, jcReceivePromotion.isSelected());
                int resultTMP = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn cập nhập lại thông tin khách hàng không ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (resultTMP == JOptionPane.YES_OPTION) {
                    boolean res = customer_DAO.updateInfoCustomer(customer);
                    if (res) {
                        loadData();
                        btnSave.setEnabled(false);
                        clearInput();
                        offInput();
                        btnAdd.setEnabled(true);
                        btnReload.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Đã cập nhập thông tin khách hàng");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cập nhập thông tin khách hàng thất bại vui lòng kiểm tra lại !");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Flag.setFlagUpdateCustomer(2);
        int selectRow = jTableCus.getSelectedRow();
        if (selectRow == -1) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn khách hàng muốn cập nhập thông tin !");
        } else {
            btnAdd.setEnabled(false);
            onInput();
            btnSave.setEnabled(true);
            btnReload.setEnabled(false);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnFilter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilter2ActionPerformed
        JOptionPane.showMessageDialog(null, "Hãy chọn nơi bạn muốn lưu");
        JFileChooser jFileChooser = new JFileChooser("D://");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xls", "xlsx");
        jFileChooser.setFileFilter(filter);
        int result = jFileChooser.showSaveDialog(null); // Sử dụng showSaveDialog để chọn nơi lưu

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            String pathname = file.getAbsolutePath();

            if (!pathname.toLowerCase().endsWith(".xlsx")) {
                pathname += ".xlsx";
            }
            List<Customer> customerList = customer_DAO.getListPotentialCustomers();
            // Kiểm tra nếu danh sách không rỗng, sau đó tiến hành ghi vào tệp Excel
            if (!customerList.isEmpty()) {
                writeExcel(pathname, customerList);
                JOptionPane.showMessageDialog(null, "Danh sách khách hàng tiềm năng đã được lưu vào " + pathname);
            } else {
                JOptionPane.showMessageDialog(null, "Không có dữ liệu nhân viên để lưu.");
            }
        }
    }//GEN-LAST:event_btnFilter2ActionPerformed

    public void onInput() {
        jtfNameCus.setEditable(true);
        jtfPhoneCus.setEditable(true);
        jtfEmail.setEditable(true);
        cbProvince.setEnabled(true);
        jtfAddressDetails.setEditable(true);
    }

    public void clearInput() {
        jtfIDCus.setText("");
        jtfNameCus.setText("");
        jtfPhoneCus.setText("");
        jtfEmail.setText("");
        jtfAddressDetails.setText("");
        jtfFilterPhone.setText("");
        cbDistrict.setSelectedIndex(0);
        cbWard.setSelectedIndex(0);
        cbProvince.setSelectedIndex(0);
        jcReceivePromotion.setSelected(false);
    }

    public void offInput() {
        jtfAddressDetails.setEditable(false);
        jtfEmail.setEditable(false);
        jtfNameCus.setEditable(false);
        jtfPhoneCus.setEditable(false);
        cbProvince.setEnabled(false);
    }

    //    load data lên jtable
    public void loadData() {
        defaultTableModel.setRowCount(0);
        for (Customer customer : customer_DAO.getListCustomers()) {
            String province = province_DAO.getProvinceNameByID(customer.getProvince().getId().toString());
            String district = district_DAO.getDistrictNameByID(customer.getDistrict().getId().toString());
            String ward = ward_DAO.getWardNameByID(customer.getWard().getId().toString());
            String address = customer.getAddress();
            String addressDetails = province + ", " + district + ", " + ward + ", " + address;
            Boolean receivePromotion = customer.isReceivePromotions();
            Object[] rowData = {customer.getIdCustomer(), customer.getName(), customer.getPhone(), customer.getEmail(), addressDetails, customer.getRewardPoints(), Customer.convertTypeRankToString(customer.getTypeRank()), customer.getTotalAmount6months(), receivePromotion};
            defaultTableModel.addRow(rowData);
        }
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
        int selectRow = jTableCus.getSelectedRow(); // lấy dòng được chọn trên table
        listProvince.forEach(province -> cbProvince.addItem(province.getProvince()));
        isEnabledEventProvince = true;
    }

    //    show error
    private boolean showERROR(JTextField jtf, String mess) {
        jtf.selectAll();
        jtf.requestFocus();
        JOptionPane.showMessageDialog(null, mess);
        return false;
    }

    //    check Regex
    private boolean checkRegex(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

//  Kiểm tả thông tin nhập
    public boolean validator() {
//        String vietNamese = Utils.getVietnameseDiacriticCharacters() + "A-Z";
//        String vietNameseLower = Utils.getVietnameseDiacriticCharactersLower() + "a-z";
//
//        String name = jtfNameCus.getText().trim();
//        if (name.length() <= 0) {
//            return showERROR(jtfNameCus, "Họ tên không được trống !");
//        }
//        if (checkRegex(name, "^[^\\d]*$") == false) {
//            return showERROR(jtfNameCus, "Họ tên không được chứa ký tự số !");
//        }
//        if (!Pattern.matches(
//                String.format("[%s][%s]*( [%s][%s]*)+", vietNamese, vietNameseLower, vietNamese, vietNameseLower),
//                name)) {
//            return showERROR(jtfNameCus, "Họ tên bắt đầu bằng ký tự hoa, có ít nhất 2 từ trong đó không chứa ký tự đặc biệt nào !");
//        }

//        String phone = jtfPhoneCus.getText().trim();
//        if (phone.length() <= 0) {
//            return showERROR(jtfPhoneCus, "Vui lòng nhập số điện thoại của khách hàng !");
//        }
//        if (checkRegex(phone, "^0\\d{9}$") == false) {
//            return showERROR(jtfPhoneCus, "Số điện thoại không đúng định dạng 0xx.xxxx.xxx vui lòng kiểm tra lại");
//        }
        String email = jtfEmail.getText().trim();
        String regexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
//        if (email.length() < 1) {
//            return showERROR(jtfEmail, "Vui lòng nhập địa chỉ Email !");
//        }
//        if (checkRegex(email, regexEmail) == false) {
//            return showERROR(jtfEmail, "Email không đúng định dạng, vui lòng kiểm tra lại !");
//        }
//        String province = (String) cbProvince.getSelectedItem();
//        if (province.equals(Province.getProvinceLabel())) {
//            JOptionPane.showMessageDialog(null, "Hãy chọn địa chỉ Tỉnh/Thành phố");
//            return false;
//        }
//        String district = (String) cbDistrict.getSelectedItem();
//        if (district.equals(District.getDistrictLabel())) {
//            JOptionPane.showMessageDialog(null, "Hãy chọn địa chỉ Quận/Huyện");
//            return false;
//        }
//        String ward = (String) cbWard.getSelectedItem();
//        if (ward.equals(Ward.getWardLabel())) {
//            JOptionPane.showMessageDialog(null, "Hãy chọn địa chỉ Phường/Xã");
//            return false;
//        }
//        String address = jtfAddressDetails.getText().trim();
//        if (address.length() <= 0) {
//            return showERROR(jtfAddressDetails, "Vui lòng nhập địa chỉ cụ thể");
//        }
//        if (Flag.getFlagUpdateCustomer() == 1) {
//
//            if (customer_DAO.checkPhoneExist(phone)) {
//                return showERROR(jtfPhoneCus, "Số điện thoại của khách hàng này đã được lưu trên hệ thống !");
//            }
//            if (customer_DAO.checkEmailExist(email)) {
//                return showERROR(jtfEmail, "Email này đã được lưu trên hệ thống vui lòng kiểm tra lại !");
//            }
//        } else if (Flag.getFlagUpdateCustomer() == 2) {
//        }
        if (jcReceivePromotion.isSelected() == true) {
            if (jtfEmail.getText().trim().equals("")) {
                return showERROR(jtfEmail, "Vui lòng nhập vào thông tin Email để được nhận thông tin chương trình khuyến mãi !");
            }
            if (checkRegex(email, regexEmail) == false) {
            return showERROR(jtfEmail, "Email không đúng định dạng, vui lòng kiểm tra lại !");
        }
        }
        if (province == null) {
            province = new Province("106008781098622");
            district = new District("106281379506480");
            ward = new Ward("106756471969301");
        }
        return true;
    }

    //    load dữ liệu khách hàng được khi nhấn nút tìm kiếm bằng số điện thoại
    public void loadDataSearch(Customer customer) {
        DefaultTableModel model = (DefaultTableModel) jTableCus.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String province = province_DAO.getProvinceNameByID(customer.getProvince().getId().toString());
        String district = district_DAO.getDistrictNameByID(customer.getDistrict().getId().toString());
        String ward = ward_DAO.getWardNameByID(customer.getWard().getId().toString());
        String address = customer.getAddress();
        String addressDetails = province + ", " + district + ", " + ward + ", " + address;
        Object[] rowData = {
            customer.getIdCustomer(),
            customer.getName(),
            customer.getPhone(),
            customer.getEmail(),
            addressDetails,
            customer.getRewardPoints(),
            Customer.convertTypeRankToString(customer.getTypeRank()),
            customer.getTotalAmount6months(),
            customer.isReceivePromotions()
        };
        model.addRow(rowData);
    }

    //    Xuất danh sánh khách hàng tiềm năng ra file Excel
    public void writeExcel(String filePath, List<Customer> customerList) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Danh sách khách hàng tiềm năng");
        // Tạo tiêu đề cho các cột
        Row headerRow = sheet.createRow(0);
        String[] headers = {"Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Email", "Tỉnh/Thành phố", "Quận/Huyện", "Phường/Xã", "Địa chỉ chi tiết", "Điểm tích lũy", "Xếp hạng", "Tổng mua trong 6 tháng gần nhất"};

        // Tạo kiểu dáng in đậm
        CellStyle headerCellStyle = workbook.createCellStyle();
        XSSFFont headerFont = workbook.createFont();
        headerFont.setBold(true); // Đặt in đậm
        headerCellStyle.setFont(headerFont);
        //      Đỗ mào cho ô tiêu đề
        headerCellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
            cell.setCellStyle(headerCellStyle);
            // Điều chỉnh kích thước cột tự động
            sheet.autoSizeColumn(i);
        }

        // Thêm dữ liệu từ danh sách vào tệp Excel
        for (int i = 0; i < customerList.size(); i++) {
            Row row = sheet.createRow(i + 1);
            Customer customer = customerList.get(i);

            // Thêm dữ liệu từ customer vào từng ô cột tương ứng
            Cell idSupplierCell = row.createCell(0);
            idSupplierCell.setCellValue(customer.getIdCustomer());

            Cell nameCell = row.createCell(1);
            nameCell.setCellValue(customer.getName());

            Cell phoneCell = row.createCell(2);
            phoneCell.setCellValue(customer.getPhone());

            Cell emailCell = row.createCell(3);
            emailCell.setCellValue(customer.getEmail());

            Cell provinceCell = row.createCell(4);
            String nameProvince = province_DAO.getProvinceNameByID(customer.getProvince().getId());
            provinceCell.setCellValue(nameProvince);

            Cell districtCell = row.createCell(5);
            String nameDistrict = district_DAO.getDistrictNameByID(customer.getDistrict().getId().toString());
            districtCell.setCellValue(nameDistrict);

            Cell wardCell = row.createCell(6);
            String nameWard = ward_DAO.getWardNameByID(customer.getWard().getId());
            wardCell.setCellValue(nameWard);

            Cell addressCell = row.createCell(7);
            addressCell.setCellValue(customer.getAddress()); 

            Cell rewardPoints = row.createCell(8);
            rewardPoints.setCellValue(customer.getRewardPoints());
            
            Cell typeRank = row.createCell(9);
            typeRank.setCellValue(Customer.convertTypeRankToString(customer.getTypeRank()));
            
            Cell totalAmount6months = row.createCell(10);
            totalAmount6months.setCellValue(customer.getTotalAmount6months() + " VNĐ");

        }

        // Lưu workbook vào tệp Excel
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnAdd;
    private lib2.Button btnEdit;
    private lib2.Button btnFilter;
    private lib2.Button btnFilter2;
    private lib2.Button btnReload;
    private lib2.Button btnSave;
    private lib2.ComboBoxSuggestion cbDistrict;
    private lib2.ComboBoxSuggestion cbProvince;
    private lib2.ComboBoxSuggestion cbWard;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jTableCus;
    private javax.swing.JCheckBox jcReceivePromotion;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlAddressDetails;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlFilterPhone;
    private javax.swing.JLabel jlIDCus;
    private javax.swing.JLabel jlNameCus;
    private javax.swing.JLabel jlPhoneCus;
    private javax.swing.JPanel jpBottom;
    private javax.swing.JPanel jpSelect;
    private javax.swing.JPanel jpTable;
    private javax.swing.JPanel jpTop;
    private javax.swing.JScrollPane jspTableCus;
    private javax.swing.JTextField jtfAddressDetails;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfFilterPhone;
    private javax.swing.JTextField jtfIDCus;
    private javax.swing.JTextField jtfNameCus;
    private javax.swing.JTextField jtfPhoneCus;
    // End of variables declaration//GEN-END:variables
}
