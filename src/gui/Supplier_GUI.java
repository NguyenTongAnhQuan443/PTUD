package gui;

import entity.District;
import entity.Province;
import entity.Ward;
import lib2.TableCustom;
import dao.Supplier_DAO;
import javax.swing.JComboBox;
import lib2.ComboBoxSuggestion;
import dao.District_DAO;
import dao.Province_DAO;
import dao.Ward_DAO;
import entity.Flag;
import entity.Supplier;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Supplier_GUI extends javax.swing.JPanel {

    private Province province;
    private District district;
    private Ward ward;
    private Supplier_DAO supplier_DAO = new Supplier_DAO();

    private boolean isEnabledEventWard = false;
    private boolean isEnabledEventDistrict = false;
    private boolean isEnabledEventProvince = false;

    private Province_DAO province_DAO = new Province_DAO();
    private District_DAO district_DAO = new District_DAO();
    private Ward_DAO ward_DAO = new Ward_DAO();

    private DefaultTableModel defaultTableModel;

    public Supplier_GUI() {
        initComponents();
        TableCustom.apply(jspTableSupplier, TableCustom.TableType.DEFAULT);
        defaultTableModel = (DefaultTableModel) jTableSupplier.getModel();
        ListSelectionModel selectionModel = jTableSupplier.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setProvinceToComboBox();
        offInput();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTop = new javax.swing.JPanel();
        jlIDSupplier = new javax.swing.JLabel();
        jtfIDSupplier = new javax.swing.JTextField();
        jlNameSupplier = new javax.swing.JLabel();
        jtfNameSupplier = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jlAddressPDW = new javax.swing.JLabel();
        cbProvince = new lib2.ComboBoxSuggestion();
        cbDistrict = new lib2.ComboBoxSuggestion();
        cbWard = new lib2.ComboBoxSuggestion();
        jlAddressDetails = new javax.swing.JLabel();
        jtfAddressDetails = new javax.swing.JTextField();
        btnEdit = new lib2.Button();
        jlStatus = new javax.swing.JLabel();
        btnAdd = new lib2.Button();
        cbStatus = new lib2.ComboBoxSuggestion();
        jLabel1 = new javax.swing.JLabel();
        jlPhoneSupplier = new javax.swing.JLabel();
        jtfPhoneSupplier = new javax.swing.JTextField();
        btnSave = new lib2.Button();
        btnReload = new lib2.Button();
        jpBottom = new javax.swing.JPanel();
        jspTableSupplier = new javax.swing.JScrollPane();
        jTableSupplier = new javax.swing.JTable();
        jpBottomFunction = new javax.swing.JPanel();
        jlFillterStatus = new javax.swing.JLabel();
        cbFillterStatus = new lib2.ComboBoxSuggestion();
        jlSearchPhone = new javax.swing.JLabel();
        jtfSearch = new javax.swing.JTextField();
        btnSearch = new lib2.Button();
        btnExportFile = new lib2.Button();
        btnImportFile = new lib2.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jpTop.setBackground(new java.awt.Color(255, 255, 255));
        jpTop.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jlIDSupplier.setText("Mã nhà cung cấp :");

        jtfIDSupplier.setEditable(false);

        jlNameSupplier.setText("Tên nhà cung cấp :");

        jlEmail.setText("Email :");

        jlAddressPDW.setText("Địa chỉ :");

        cbProvince.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tỉnh/Thành phố" }));
        cbProvince.setEnabled(false);
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

        cbWard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Phường/Xã" }));
        cbWard.setEnabled(false);
        cbWard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbWardItemStateChanged(evt);
            }
        });

        jlAddressDetails.setText("Địa chỉ cụ thể :");

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

        jlStatus.setText("Tình trạng hợp tác :");

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

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Đang hợp tác", "Ngưng hợp tác" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("(Vui lòng nhập đầy đủ các thông tin yêu cầu trước khi thêm nhà cung cấp mới !)");

        jlPhoneSupplier.setText("Số điện thoại:");

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

        javax.swing.GroupLayout jpTopLayout = new javax.swing.GroupLayout(jpTop);
        jpTop.setLayout(jpTopLayout);
        jpTopLayout.setHorizontalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlNameSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlIDSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfNameSupplier, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfIDSupplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addComponent(jlStatus)
                        .addGap(18, 18, 18)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpTopLayout.createSequentialGroup()
                            .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlAddressDetails)
                                .addComponent(jlAddressPDW))
                            .addGap(43, 43, 43)
                            .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfAddressDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpTopLayout.createSequentialGroup()
                                    .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbWard, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jpTopLayout.createSequentialGroup()
                            .addComponent(jlPhoneSupplier)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfPhoneSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTopLayout.setVerticalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDSupplier)
                    .addComponent(jtfIDSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAddressPDW)
                    .addComponent(cbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNameSupplier)
                    .addComponent(jtfNameSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAddressDetails)
                    .addComponent(jtfAddressDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEmail)
                    .addComponent(jlPhoneSupplier)
                    .addComponent(jtfPhoneSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlStatus)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        add(jpTop);

        jpBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpBottom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTableSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Email", "Phone", "Trạng thái hợp đồng", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSupplierMouseClicked(evt);
            }
        });
        jspTableSupplier.setViewportView(jTableSupplier);

        jpBottomFunction.setBackground(new java.awt.Color(255, 255, 255));
        jpBottomFunction.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        jlFillterStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlFillterStatus.setText("Lọc theo trạng thái :");

        cbFillterStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Trạng thái", "Đang hợp tác", "Ngưng hợp tác" }));
        cbFillterStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFillterStatusItemStateChanged(evt);
            }
        });
        cbFillterStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFillterStatusActionPerformed(evt);
            }
        });

        jlSearchPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlSearchPhone.setText("Lọc theo SDT / Email:");

        jtfSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfSearchMouseClicked(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(135, 206, 235));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search24.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm  ");
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnExportFile.setBackground(new java.awt.Color(135, 206, 235));
        btnExportFile.setForeground(new java.awt.Color(255, 255, 255));
        btnExportFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/outputfile24.png"))); // NOI18N
        btnExportFile.setText("Xuất  file dánh sách nhà cung cấp");
        btnExportFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportFileActionPerformed(evt);
            }
        });

        btnImportFile.setBackground(new java.awt.Color(135, 206, 235));
        btnImportFile.setForeground(new java.awt.Color(255, 255, 255));
        btnImportFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/inputfile24.png"))); // NOI18N
        btnImportFile.setText("Nhập file dánh sách nhà cung cấp");
        btnImportFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnImportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBottomFunctionLayout = new javax.swing.GroupLayout(jpBottomFunction);
        jpBottomFunction.setLayout(jpBottomFunctionLayout);
        jpBottomFunctionLayout.setHorizontalGroup(
            jpBottomFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBottomFunctionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlSearchPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImportFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExportFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jlFillterStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFillterStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpBottomFunctionLayout.setVerticalGroup(
            jpBottomFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBottomFunctionLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jpBottomFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBottomFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbFillterStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlFillterStatus))
                    .addGroup(jpBottomFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlSearchPhone)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnImportFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExportFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jpBottomLayout = new javax.swing.GroupLayout(jpBottom);
        jpBottom.setLayout(jpBottomLayout);
        jpBottomLayout.setHorizontalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTableSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
            .addComponent(jpBottomFunction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpBottomLayout.setVerticalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBottomLayout.createSequentialGroup()
                .addComponent(jspTableSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBottomFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jpBottom);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String phoneOrEmail = jtfSearch.getText().trim();
        if (jtfSearch.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số điện thoại hoặc email của nhà cung cấp cần tìm");
        } else {
            Supplier supplier = supplier_DAO.getSupplierByPhoneOrEmail(phoneOrEmail);
            if (supplier != null) {
                loadDataSearch(supplier);
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy NCC có Email / SDT" + phoneOrEmail + " trong danh sách");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Flag.setFlagUpdateSupplier(2);
        int selectRow = jTableSupplier.getSelectedRow();
        if (selectRow == -1) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn nhà cung cấp muốn cập nhập thông tin !");
        } else {
            btnAdd.setEnabled(false);
            onInput();
            btnSave.setEnabled(true);
            btnReload.setEnabled(false);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        jtfIDSupplier.setText(supplier_DAO.createIDSupplier().toString());
        Flag.setFlagUpdateSupplier(1);
        if (btnAdd.getText().trim().equals("Thêm mới")) {
            onInput();
            btnSave.setEnabled(true);
            btnEdit.setEnabled(false);
            btnAdd.setText("Hủy");
            btnReload.setEnabled(false);

            if (!(jtfNameSupplier.getText().trim().equals(""))) {
//              nếu 1 trong các jtf có dữ liệu tức là có thao tác chọn index bên dưới jtbale => remove all
                jtfAddressDetails.setText("");
                jtfEmail.setText("");
                jtfNameSupplier.setText("");
                jtfSearch.setText("");
                jtfPhoneSupplier.setText("");
                setIndexCB();
            }
        } else if (btnAdd.getText().trim().equals("Hủy")) {
            btnSave.setEnabled(false);
            btnEdit.setEnabled(true);
            btnAdd.setText("Thêm mới");
            btnReload.setEnabled(true);
            offInput();

            clearinput();
            setIndexCB();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void cbDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDistrictActionPerformed

    private void cbProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProvinceActionPerformed

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
        Supplier_GUI.this.province = province;

        try {
            setDistrictToComboBox(Supplier_GUI.this.province);
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
            Supplier_GUI.this.district = district;
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
        Supplier_GUI.this.ward = ward;
        isEnabledEventWard = false;
    }//GEN-LAST:event_cbWardItemStateChanged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (Flag.getFlagUpdateSupplier() == 1) {
            if (btnAdd.getText().trim().equals("Hủy")) {
                if (validator()) {
                    String idSupplier = jtfIDSupplier.getText().trim();
                    String name = jtfNameSupplier.getText().trim();
                    String email = jtfEmail.getText().trim();
                    String phone = jtfPhoneSupplier.getText().trim();
                    String addressDetails = jtfAddressDetails.getText().trim();
                    Supplier supplier = new Supplier(idSupplier, name, email, phone, Supplier.convertStringToStatus(cbStatus.getSelectedItem().toString()), Supplier_GUI.this.province, Supplier_GUI.this.district, Supplier_GUI.this.ward, addressDetails);
                    boolean res = supplier_DAO.addSupplier(supplier);
                    if (res) {
                        loadData();
                        clearinput();
                        btnSave.setEnabled(false);
                        btnAdd.setEnabled(true);
                        offInput();
                        setIndexCB();
                        btnEdit.setEnabled(true);
                        btnAdd.setText("Thêm mới");
                        btnReload.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Thêm nhà cung cấp thành công !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Thêm nhà cung cấp thất bại !");
                    }
                }
            }
        } else if (Flag.getFlagUpdateSupplier() == 2) {
            if (validator()) {
                String id = jtfIDSupplier.getText().trim();
                String name = jtfNameSupplier.getText().trim();
                String email = jtfEmail.getText().trim();
                String phone = jtfPhoneSupplier.getText().trim();
                String addressDetails = jtfAddressDetails.getText().trim();
                Supplier supplierUpdate = new Supplier(id, name, email, phone, Supplier.convertStringToStatus(cbStatus.getSelectedItem().toString()), Supplier_GUI.this.province, Supplier_GUI.this.district, Supplier_GUI.this.ward, addressDetails);
                int resultTMP = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn cập nhập lại thông tin NCC không ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (resultTMP == JOptionPane.YES_OPTION) {
                    boolean res = supplier_DAO.updateInfoSupplier(supplierUpdate);
                    if (res) {
                        loadData();
                        btnSave.setEnabled(false);
                        clearinput();
                        offInput();
                        setIndexCB();
                        btnAdd.setEnabled(true);
                        btnReload.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Đã cập nhập thông tin nhà cung cấp");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cập nhập thông tin nhà cung cấp thất bại vui lòng kiểm tra lại !");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jTableSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSupplierMouseClicked

        if (evt.getClickCount() == 1 && btnAdd.getText().equals("Thêm mới")) {
            Flag.setFlagUpdateSupplier(2);
            int selectedRow = jTableSupplier.getSelectedRow();
            jtfIDSupplier.setText(jTableSupplier.getValueAt(selectedRow, 0).toString());
            jtfNameSupplier.setText(jTableSupplier.getValueAt(selectedRow, 1).toString());
            jtfEmail.setText(jTableSupplier.getValueAt(selectedRow, 2).toString());
            jtfPhoneSupplier.setText(jTableSupplier.getValueAt(selectedRow, 3).toString());
            if (jTableSupplier.getValueAt(selectedRow, 4).toString().equals("Đang hợp tác")) {
                cbStatus.setSelectedIndex(0);
            } else if (jTableSupplier.getValueAt(selectedRow, 4).toString().equals("Ngưng hợp tác")) {
                cbStatus.setSelectedIndex(1);
            }

            int selectRow = jTableSupplier.getSelectedRow();
            Flag.setFlagIDSupplier(defaultTableModel.getValueAt(selectRow, 0).toString()); // lấy id nhà cung cấp cần chỉnh sửa
//          cắt chuỗi bằng dấu phẩy (để lấy addressDetails)
            String input = jTableSupplier.getValueAt(selectedRow, 5).toString();
            String[] parts = input.split(",");
            if (parts.length >= 4) {
                jtfAddressDetails.setText(parts[3].trim()); // lấy chuỗi thứ 4
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

                Supplier supplierTMP = supplier_DAO.getSupplierByID(Flag.getFlagIDSupplier());
                if (province.getId().equals(supplierTMP.getProvince().getId())) {
                    cbProvince.setSelectedIndex(index + 1);
                    Supplier_GUI.this.province = province;
                }
            });
            cbDistrict.setEnabled(false);

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
                Supplier supplierTMP = supplier_DAO.getSupplierByID(Flag.getFlagIDSupplier());
                if (district.getId().equals(supplierTMP.getDistrict().getId())) {
                    cbDistrict.setSelectedIndex(index + 1);
                    Supplier_GUI.this.district = district;
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
                Supplier supplierTMP = supplier_DAO.getSupplierByID(Flag.getFlagIDSupplier());
                if (ward.getId().equals(supplierTMP.getWard().getId())) {
                    cbWard.setSelectedIndex(index + 1);
                    Supplier_GUI.this.ward = ward;
                }
            });
        }
    }//GEN-LAST:event_jTableSupplierMouseClicked

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        loadData();
        clearinput();
        setIndexCB();
        JOptionPane.showMessageDialog(null, "Danh sách nhà cung cấp đã được làm mới ");
    }//GEN-LAST:event_btnReloadActionPerformed

    private void cbFillterStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFillterStatusActionPerformed
        int index = cbFillterStatus.getSelectedIndex();
        String sql1 = "SELECT * FROM Supplier WHERE status = N'Đang hợp tác'";
        String sql2 = "SELECT * FROM Supplier WHERE status = N'Ngưng hợp tác'";
        if (index == 1) {
            loadDataByStatus(sql1);
        } else if (index == 2) {
            loadDataByStatus(sql2);
        }
    }//GEN-LAST:event_cbFillterStatusActionPerformed

    private void cbFillterStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFillterStatusItemStateChanged

    }//GEN-LAST:event_cbFillterStatusItemStateChanged

    private void btnExportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportFileActionPerformed
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
            List<Supplier> supplierList = null;
            int selectedStatus = cbFillterStatus.getSelectedIndex();
            String sql = "";
            if (selectedStatus == 1) {
                sql = "SELECT * FROM Supplier WHERE status = N'Đang hợp tác'";
            } else if (selectedStatus == 2) {
                sql = "SELECT * FROM Supplier WHERE status = N'Ngưng hợp tác'";
            } else if (selectedStatus == 0) {
                supplierList = supplier_DAO.getListSupplier();
            }
            if (!sql.isEmpty()) {
                supplierList = supplier_DAO.getListSupplierByStatus(sql);
            }
            // Kiểm tra nếu danh sách không rỗng, sau đó tiến hành ghi vào tệp Excel
            if (!supplierList.isEmpty()) {
                writeExcel(pathname, supplierList);
                cbFillterStatus.setSelectedIndex(0); // mỗi lần xuất file xong set lại index để tránh lỗi
                JOptionPane.showMessageDialog(null, "Danh sách nhà cung cấp đã được lưu vào " + pathname);
            } else {
                JOptionPane.showMessageDialog(null, "Không có dữ liệu nhà cung cấp để lưu vui lòng kiểm tra lại");
            }
        }
    }//GEN-LAST:event_btnExportFileActionPerformed

    private void btnImportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportFileActionPerformed
        JFileChooser jFileChooser = new JFileChooser("D://");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xls", "xlsx");
        jFileChooser.setFileFilter(filter);
        int result = jFileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            String pathname = file.getPath();
            if (Pattern.matches(".*\\.xls", pathname) || Pattern.matches(".*\\.xlsx", pathname)) {
                List<Supplier> listSupplier = readExcel(pathname);
                boolean res = supplier_DAO.addSupplierList(listSupplier);
                if (res) {
                    loadData();
                    JOptionPane.showMessageDialog(null, "Đã hoàn thành nhập danh sách nhà cung cấp từ file");
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng kiểm tra lại định dạng file về: Mã nhà cung cấp, Tên nhà cung cấp, SDT, Email, Địa chỉ V.V !");
                }
                readExcel(pathname);
            } else {
                JOptionPane.showMessageDialog(null, "File không hợp lệ, vui lòng kiểm tra lại!");
            }
        }
    }//GEN-LAST:event_btnImportFileActionPerformed

    private void jtfSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfSearchMouseClicked
        jtfSearch.setText("");
    }//GEN-LAST:event_jtfSearchMouseClicked
    public void onInput() {
        jtfAddressDetails.setEditable(true);
        jtfEmail.setEditable(true);
        jtfNameSupplier.setEditable(true);
        jtfPhoneSupplier.setEditable(true);
        cbProvince.setEditable(true);

        cbProvince.setEnabled(true);
        cbStatus.setEnabled(true);
    }

    public void offInput() {
        jtfAddressDetails.setEditable(false);
        jtfEmail.setEditable(false);
        jtfNameSupplier.setEditable(false);
        jtfPhoneSupplier.setEditable(false);
        cbProvince.setEditable(false);

        cbDistrict.setEnabled(false);
        cbWard.setEnabled(false);
        btnSave.setEnabled(false);
        cbProvince.setEnabled(false);
        cbStatus.setEnabled(false);
    }

    public void setIndexCB() {
        cbWard.setSelectedIndex(0);
        cbDistrict.setSelectedIndex(0);
        cbProvince.setSelectedIndex(0);
        cbStatus.setSelectedIndex(0);

        cbProvince.setEditable(false);
        cbDistrict.setEditable(false);
        cbWard.setEditable(false);
    }

    public void clearinput() {
        jtfAddressDetails.setText("");
        jtfEmail.setText("");
        jtfIDSupplier.setText("");
        jtfNameSupplier.setText("");
        jtfSearch.setText("");
        jtfPhoneSupplier.setText("");
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
        int selectRow = jTableSupplier.getSelectedRow(); // lấy dòng được chọn trên table
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

//    load data lên jtable
    public void loadData() {
        defaultTableModel.setRowCount(0);
        for (Supplier supplier : supplier_DAO.getListSupplier()) {
            String province = province_DAO.getProvinceNameByID(supplier.getProvince().getId().toString());
            String district = district_DAO.getDistrictNameByID(supplier.getDistrict().getId().toString());
            String ward = ward_DAO.getWardNameByID(supplier.getWard().getId().toString());
            String address = supplier.getAddress();
            String addressDetails = province + ", " + district + ", " + ward + ", " + address;
            String[] rowData = {supplier.getIdSupplier(), supplier.getName(), supplier.getEmail(), supplier.getPhone(), Supplier.convertStatusToString(supplier.getStatus()), addressDetails};
            defaultTableModel.addRow(rowData);
        }
    }

    //    load data lên jtable
    public void loadDataByStatus(String sqlStatus) {
        defaultTableModel.setRowCount(0);
        for (Supplier supplier : supplier_DAO.getListSupplierByStatus(sqlStatus)) {
            String province = province_DAO.getProvinceNameByID(supplier.getProvince().getId().toString());
            String district = district_DAO.getDistrictNameByID(supplier.getDistrict().getId().toString());
            String ward = ward_DAO.getWardNameByID(supplier.getWard().getId().toString());
            String address = supplier.getAddress();
            String addressDetails = province + ", " + district + ", " + ward + ", " + address;
            String[] rowData = {supplier.getIdSupplier(), supplier.getName(), supplier.getEmail(), supplier.getPhone(), Supplier.convertStatusToString(supplier.getStatus()), addressDetails};
            defaultTableModel.addRow(rowData);
        }
    }
//    check regex

    private boolean checkRegex(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    //    show error
    private boolean showERROR(JTextField jtf, String mess) {
        jtf.selectAll();
        jtf.requestFocus();
        JOptionPane.showMessageDialog(null, mess);
        return false;
    }

//    check các thông tin nhập vào
    private boolean validator() {
        String name = jtfNameSupplier.getText().trim();
        if (name.length() < 1) {
            return showERROR(jtfNameSupplier, "Vui lòng nhập vào tên nhà cung cấp !");
        }
        String email = jtfEmail.getText().trim();
        String regexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (email.length() < 1) {
            return showERROR(jtfEmail, "Vui lòng nhập địa chỉ Email !");
        }
        if (checkRegex(email, regexEmail) == false) {
            return showERROR(jtfEmail, "Email không đúng định dạng, vui lòng kiểm tra lại !");
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
        String address = jtfAddressDetails.getText().trim();
        if (address.length() <= 0) {
            return showERROR(jtfAddressDetails, "Vui lòng nhập địa chỉ cụ thể");
        }
        String phone = jtfPhoneSupplier.getText().trim();
        if (phone.length() <= 0) {
            return showERROR(jtfPhoneSupplier, "Vui lòng nhập số điện thoại của nhà cung cấp !");
        }
        if (checkRegex(phone, "^0\\d{9}$") == false) {
            return showERROR(jtfPhoneSupplier, "Số điện thoại không đúng định dạng 0xx.xxxx.xxx vui lòng kiểm tra lại");
        }

        if (Flag.getFlagUpdateSupplier() == 1) {
            if (supplier_DAO.checkPhoneExist(phone)) {
                return showERROR(jtfPhoneSupplier, "Số điện thoại nhà cung cấp này đã được sử dụng trên hệ thống vui lòng kiểm tra lại !");
            }
            if (supplier_DAO.checkEmailExist(email)) {
                return showERROR(jtfEmail, "Email nhà cung cấp này đã được sử dụng trên hệ thống vui lòng kiểm tra lại !");
            }
        } else if (Flag.getFlagUpdateSupplier() == 2) {
            String currentIDSupplier = Flag.getFlagIDSupplier().trim();
            String currentPhone = jtfPhoneSupplier.getText().trim();
            String currentEmail = jtfEmail.getText().trim();
            boolean isCurrentSupplierPhone = false; // Biến để xác định xem số điện thoại hiện tại là của supplier đang cập nhật
            boolean isCurrentSupplierEmail = false; // Biến để xác định xem email hiện tại là của supplier đang cập nhật

            for (Supplier supplier : supplier_DAO.getListSupplier()) {
                if (supplier.getIdSupplier().trim().equals(currentIDSupplier)) {
                    // Nếu ID của supplier khớp với supplier đang cập nhật, kiểm tra số điện thoại và email
                    if (!supplier.getPhone().equals(currentPhone)) {
                        isCurrentSupplierPhone = true;
                    }
                    if (!supplier.getEmail().equals(currentEmail)) {
                        isCurrentSupplierEmail = true;
                    }
                } else {
                    if (supplier.getPhone().equals(currentPhone)) {
                        return showERROR(jtfPhoneSupplier, "Số điện thoại nhà cung cấp này đã được sử dụng trên hệ thống vui lòng kiểm tra lại !");
                    }
                    if (supplier.getEmail().equals(currentEmail)) {
                        return showERROR(jtfEmail, "Email nhà cung cấp này đã được sử dụng trên hệ thống vui lòng kiểm tra lại !");
                    }
                }
            }
        }
        return true;
    }

    //    load dữ liệu NCC được khi nhấn nút tìm kiếm
    public void loadDataSearch(Supplier supplier) {
        DefaultTableModel model = (DefaultTableModel) jTableSupplier.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String province = province_DAO.getProvinceNameByID(supplier.getProvince().getId().toString());
        String district = district_DAO.getDistrictNameByID(supplier.getDistrict().getId().toString());
        String ward = ward_DAO.getWardNameByID(supplier.getWard().getId().toString());
        String address = supplier.getAddress();
        String addressDetails = province + ", " + district + ", " + ward + ", " + address;
        String status = supplier.convertStatusToString(supplier.getStatus());
        Object[] rowData = {
            supplier.getIdSupplier(),
            supplier.getName(),
            supplier.getEmail(),
            supplier.getPhone(),
            status,
            addressDetails};
        model.addRow(rowData);
    }

    //    Đọc file Excel
    public List<Supplier> readExcel(String filePath) {
        List<Supplier> listSupplier = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(new File(filePath)); XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream)) {
            XSSFSheet sheet = workbook.getSheetAt(0); // Sử dụng sheet đầu tiên (index 0)

            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);

                String idSupplier = row.getCell(0).getStringCellValue();
                String name = row.getCell(1).getStringCellValue();
                String email = row.getCell(2).getStringCellValue();
                String phone = row.getCell(3).getStringCellValue();
                String status = row.getCell(4).getStringCellValue();

                String provinceSTR = row.getCell(5).getStringCellValue();
                String districtSTR = row.getCell(6).getStringCellValue();
                String wardSTR = row.getCell(7).getStringCellValue();
                Province province = province_DAO.getProvinceByNameProvince(provinceSTR);
                District district = district_DAO.getDistrictByNameDistrict(province, districtSTR);
                Ward ward = ward_DAO.getWardByNameWard(district, wardSTR);
                String address = row.getCell(8).getStringCellValue();
                Supplier supplier = new Supplier(idSupplier, name, email, phone, Supplier.convertStringToStatus(status), province, district, ward, address);
                listSupplier.add(supplier);
            }
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listSupplier;
    }

    //    Xuất danh sánh nhà cung cấp ra file Excel
    public void writeExcel(String filePath, List<Supplier> SupplierList) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Danh sách nhà cung cấp");
        // Tạo tiêu đề cho các cột
        Row headerRow = sheet.createRow(0);
        String[] headers = {"Mã nhà cung cấp", "Tên nhà cung cấp", "Email", "Số điện thoại", "Trạng thái hợp đồng", "Tỉnh/Thành phố", "Quận/Huyện", "Phường/Xã", "Địa chỉ chi tiết"};

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
        for (int i = 0; i < SupplierList.size(); i++) {
            Row row = sheet.createRow(i + 1);
            Supplier supplier = SupplierList.get(i);

            // Thêm dữ liệu từ supplier vào từng ô cột tương ứng
            Cell idSupplierCell = row.createCell(0);
            idSupplierCell.setCellValue(supplier.getIdSupplier());

            Cell nameCell = row.createCell(1);
            nameCell.setCellValue(supplier.getName());

            Cell emailCell = row.createCell(2);
            emailCell.setCellValue(supplier.getEmail());

            Cell phoneCell = row.createCell(3);
            phoneCell.setCellValue(supplier.getPhone());

            Cell statusCell = row.createCell(4);
            statusCell.setCellValue(Supplier.convertStatusToString(supplier.getStatus()));

            Cell provinceCell = row.createCell(5);
            String nameProvince = province_DAO.getProvinceNameByID(supplier.getProvince().getId());
            provinceCell.setCellValue(nameProvince);

            Cell districtCell = row.createCell(6);
            String nameDistrict = district_DAO.getDistrictNameByID(supplier.getDistrict().getId().toString());
            districtCell.setCellValue(nameDistrict);

            Cell wardCell = row.createCell(7);
            String nameWard = ward_DAO.getWardNameByID(supplier.getWard().getId());
            wardCell.setCellValue(nameWard);

            Cell addressCell = row.createCell(8);
            addressCell.setCellValue(supplier.getAddress());

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
    private lib2.Button btnExportFile;
    private lib2.Button btnImportFile;
    private lib2.Button btnReload;
    private lib2.Button btnSave;
    private lib2.Button btnSearch;
    private lib2.ComboBoxSuggestion cbDistrict;
    private lib2.ComboBoxSuggestion cbFillterStatus;
    private lib2.ComboBoxSuggestion cbProvince;
    private lib2.ComboBoxSuggestion cbStatus;
    private lib2.ComboBoxSuggestion cbWard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jTableSupplier;
    private javax.swing.JLabel jlAddressDetails;
    private javax.swing.JLabel jlAddressPDW;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlFillterStatus;
    private javax.swing.JLabel jlIDSupplier;
    private javax.swing.JLabel jlNameSupplier;
    private javax.swing.JLabel jlPhoneSupplier;
    private javax.swing.JLabel jlSearchPhone;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JPanel jpBottom;
    private javax.swing.JPanel jpBottomFunction;
    private javax.swing.JPanel jpTop;
    private javax.swing.JScrollPane jspTableSupplier;
    private javax.swing.JTextField jtfAddressDetails;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfIDSupplier;
    private javax.swing.JTextField jtfNameSupplier;
    private javax.swing.JTextField jtfPhoneSupplier;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
