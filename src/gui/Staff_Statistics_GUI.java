package gui;

import dao.Customer_Statistics_DAO;
import dao.Staff_Statistics_DAO;
import entity.Customer_Statistics;
import entity.Staff_Statistics;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import lib2.ModelChart;
import lib2.TableCustom;

public class Staff_Statistics_GUI extends javax.swing.JPanel {

    private Staff_Statistics_DAO staff_Statistics_DAO = new Staff_Statistics_DAO();
    private DefaultTableModel defaultTableModel;

    public Staff_Statistics_GUI() {
        initComponents();

        TableCustom.apply(jspTable, TableCustom.TableType.DEFAULT);
        defaultTableModel = (DefaultTableModel) jTable.getModel();
        ListSelectionModel selectionModel = jTable.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

//        load data to panel
        loadDataToPanel();

//        load data to table
        List<Staff_Statistics> listStaffStatistics = new ArrayList<>();
        listStaffStatistics = staff_Statistics_DAO.getTop10RevenueCurrentMonth();
        loadDataToTable(listStaffStatistics);
        loadDataToChart(listStaffStatistics);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTop = new javax.swing.JPanel();
        jpCard1 = new javax.swing.JPanel();
        jlCard1Title = new javax.swing.JLabel();
        jLNumStaff = new javax.swing.JLabel();
        jlCard1Unit = new javax.swing.JLabel();
        jlIconOrder = new javax.swing.JLabel();
        jpCard2 = new javax.swing.JPanel();
        jlIconMoneyDay = new javax.swing.JLabel();
        jlCard2Title = new javax.swing.JLabel();
        jLNumStaffWorking = new javax.swing.JLabel();
        jlCard2Unit = new javax.swing.JLabel();
        jpCard3 = new javax.swing.JPanel();
        jlIconMoneyMonth = new javax.swing.JLabel();
        jlCard3Title = new javax.swing.JLabel();
        jLNumStaffOfWorking = new javax.swing.JLabel();
        jlCard3Unit = new javax.swing.JLabel();
        jTabbedPaneMain = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlTitle3 = new javax.swing.JLabel();
        jlChooserType1 = new javax.swing.JLabel();
        cbChooserChart = new lib2.ComboBoxSuggestion();
        jPanel4 = new javax.swing.JPanel();
        jpChart = new lib2.Chart();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        cbChooserTable = new lib2.ComboBoxSuggestion();
        jlChooserType2 = new javax.swing.JLabel();
        jlTitle4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jspTable = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPTop.setLayout(new javax.swing.BoxLayout(jPTop, javax.swing.BoxLayout.LINE_AXIS));

        jpCard1.setBackground(new java.awt.Color(204, 204, 255));
        jpCard1.setForeground(new java.awt.Color(255, 255, 255));
        jpCard1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlCard1Title.setBackground(new java.awt.Color(255, 255, 255));
        jlCard1Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlCard1Title.setForeground(new java.awt.Color(255, 255, 255));
        jlCard1Title.setText("Tổng số nhân viên");

        jLNumStaff.setBackground(new java.awt.Color(255, 255, 255));
        jLNumStaff.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLNumStaff.setForeground(new java.awt.Color(255, 255, 255));
        jLNumStaff.setText("0");

        jlCard1Unit.setBackground(new java.awt.Color(255, 255, 255));
        jlCard1Unit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlCard1Unit.setForeground(new java.awt.Color(255, 255, 255));
        jlCard1Unit.setText("Nhân viên");

        jlIconOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/employee64.png"))); // NOI18N

        javax.swing.GroupLayout jpCard1Layout = new javax.swing.GroupLayout(jpCard1);
        jpCard1.setLayout(jpCard1Layout);
        jpCard1Layout.setHorizontalGroup(
            jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard1Layout.createSequentialGroup()
                        .addComponent(jlCard1Title)
                        .addGap(0, 162, Short.MAX_VALUE))
                    .addGroup(jpCard1Layout.createSequentialGroup()
                        .addComponent(jLNumStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCard1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jlIconOrder))
                            .addGroup(jpCard1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlCard1Unit)))))
                .addContainerGap())
        );
        jpCard1Layout.setVerticalGroup(
            jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard1Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNumStaff)
                    .addComponent(jlCard1Unit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jlIconOrder)
                .addContainerGap())
        );

        jPTop.add(jpCard1);

        jpCard2.setBackground(new java.awt.Color(255, 204, 255));

        jlIconMoneyDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/employee64.png"))); // NOI18N

        jlCard2Title.setBackground(new java.awt.Color(255, 255, 255));
        jlCard2Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlCard2Title.setForeground(new java.awt.Color(255, 255, 255));
        jlCard2Title.setText("Nhân viên đang làm");

        jLNumStaffWorking.setBackground(new java.awt.Color(255, 255, 255));
        jLNumStaffWorking.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLNumStaffWorking.setForeground(new java.awt.Color(255, 255, 255));
        jLNumStaffWorking.setText("0");

        jlCard2Unit.setBackground(new java.awt.Color(255, 255, 255));
        jlCard2Unit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlCard2Unit.setForeground(new java.awt.Color(255, 255, 255));
        jlCard2Unit.setText("Nhân viên");

        javax.swing.GroupLayout jpCard2Layout = new javax.swing.GroupLayout(jpCard2);
        jpCard2.setLayout(jpCard2Layout);
        jpCard2Layout.setHorizontalGroup(
            jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCard2Title, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(jpCard2Layout.createSequentialGroup()
                        .addComponent(jLNumStaffWorking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCard2Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jlIconMoneyDay))
                            .addGroup(jpCard2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlCard2Unit)))
                        .addContainerGap())))
        );
        jpCard2Layout.setVerticalGroup(
            jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard2Title)
                .addGroup(jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard2Layout.createSequentialGroup()
                        .addGroup(jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNumStaffWorking)
                            .addComponent(jlCard2Unit))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpCard2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jlIconMoneyDay)))
                .addContainerGap())
        );

        jPTop.add(jpCard2);

        jpCard3.setBackground(new java.awt.Color(153, 204, 255));

        jlIconMoneyMonth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/employee64.png"))); // NOI18N

        jlCard3Title.setBackground(new java.awt.Color(255, 255, 255));
        jlCard3Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlCard3Title.setForeground(new java.awt.Color(255, 255, 255));
        jlCard3Title.setText("Nhân viên đã nghỉ");

        jLNumStaffOfWorking.setBackground(new java.awt.Color(255, 255, 255));
        jLNumStaffOfWorking.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLNumStaffOfWorking.setForeground(new java.awt.Color(255, 255, 255));
        jLNumStaffOfWorking.setText("0");

        jlCard3Unit.setBackground(new java.awt.Color(255, 255, 255));
        jlCard3Unit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlCard3Unit.setForeground(new java.awt.Color(255, 255, 255));
        jlCard3Unit.setText("Nhân viên");

        javax.swing.GroupLayout jpCard3Layout = new javax.swing.GroupLayout(jpCard3);
        jpCard3.setLayout(jpCard3Layout);
        jpCard3Layout.setHorizontalGroup(
            jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard3Layout.createSequentialGroup()
                        .addComponent(jlCard3Title)
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addGroup(jpCard3Layout.createSequentialGroup()
                        .addComponent(jLNumStaffOfWorking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCard3Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jlIconMoneyMonth))
                            .addGroup(jpCard3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlCard3Unit)))))
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
                            .addComponent(jLNumStaffOfWorking)
                            .addComponent(jlCard3Unit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jlIconMoneyMonth)
                        .addContainerGap())))
        );

        jPTop.add(jpCard3);

        add(jPTop, java.awt.BorderLayout.PAGE_START);

        jTabbedPaneMain.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTitle3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlTitle3.setText("Doanh thu nhân viên");

        jlChooserType1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlChooserType1.setText("Hãy chọn kiểu thống kê");

        cbChooserChart.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doanh thu cao nhất tháng", "Doanh thu thấp nhất tháng", "Doanh thu cao nhất năm", "Doanh thu thấp nhất năm" }));
        cbChooserChart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbChooserChart.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbChooserChartItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbChooserChart, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlChooserType1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jlTitle3)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jlTitle3)
                .addGap(18, 18, 18)
                .addComponent(jlChooserType1)
                .addGap(18, 18, 18)
                .addComponent(cbChooserChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpChart, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpChart, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneMain.addTab("Dạng biểu đồ", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbChooserTable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doanh thu cao nhất tháng", "Doanh thu thấp nhất tháng", "Doanh thu cao nhất năm", "Doanh thu thấp nhất năm" }));
        cbChooserTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbChooserTable.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbChooserTableItemStateChanged(evt);
            }
        });

        jlChooserType2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlChooserType2.setText("Hãy chọn tiêu chí kiểu thống kê");

        jlTitle4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlTitle4.setText("Doanh thu nhân viên");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbChooserTable, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlChooserType2)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jlTitle4)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jlTitle4)
                .addGap(18, 18, 18)
                .addComponent(jlChooserType2)
                .addGap(18, 18, 18)
                .addComponent(cbChooserTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã NV", "Tên NV", "SL đơn hàng", "Doanh thu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspTable.setViewportView(jTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspTable, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspTable, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneMain.addTab("Dạng bảng", jPanel5);

        add(jTabbedPaneMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cbChooserTableItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbChooserTableItemStateChanged
        if (cbChooserTable.getSelectedIndex() == 0) {
            List<Staff_Statistics> listStaffStatistics = new ArrayList<>();
            listStaffStatistics = staff_Statistics_DAO.getTop10RevenueCurrentMonth();
            loadDataToTable(listStaffStatistics);
        } else if (cbChooserTable.getSelectedIndex() == 1) {
            List<Staff_Statistics> listStaffStatistics = new ArrayList<>();
            listStaffStatistics = staff_Statistics_DAO.getTop10LowestRevenueMonth();
            loadDataToTable(listStaffStatistics);
        } else if (cbChooserTable.getSelectedIndex() == 2) {
            List<Staff_Statistics> listStaffStatistics = new ArrayList<>();
            listStaffStatistics = staff_Statistics_DAO.getTop10RevenueYear();
            loadDataToTable(listStaffStatistics);
        } else if (cbChooserTable.getSelectedIndex() == 3) {
            List<Staff_Statistics> listStaffStatistics = new ArrayList<>();
            listStaffStatistics = staff_Statistics_DAO.getTop10LowestRevenueYear();
            loadDataToTable(listStaffStatistics);
        }
    }//GEN-LAST:event_cbChooserTableItemStateChanged

    private void cbChooserChartItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbChooserChartItemStateChanged
        if (cbChooserChart.getSelectedIndex() == 0) {
            List<Staff_Statistics> listStaffStatistics = new ArrayList<>();
            listStaffStatistics = staff_Statistics_DAO.getTop10RevenueCurrentMonth();
            loadDataToChart(listStaffStatistics);
        } else if (cbChooserChart.getSelectedIndex() == 1) {
            List<Staff_Statistics> listStaffStatistics = new ArrayList<>();
            listStaffStatistics = staff_Statistics_DAO.getTop10LowestRevenueMonth();
            loadDataToChart(listStaffStatistics);
        } else if (cbChooserChart.getSelectedIndex() == 2) {
            List<Staff_Statistics> listStaffStatistics = new ArrayList<>();
            listStaffStatistics = staff_Statistics_DAO.getTop10RevenueYear();
            loadDataToChart(listStaffStatistics);
        } else if (cbChooserChart.getSelectedIndex() == 3) {
            List<Staff_Statistics> listStaffStatistics = new ArrayList<>();
            listStaffStatistics = staff_Statistics_DAO.getTop10LowestRevenueYear();
            loadDataToChart(listStaffStatistics);
        }
    }//GEN-LAST:event_cbChooserChartItemStateChanged

//    load data to panel
    private void loadDataToPanel() {
        jLNumStaff.setText(staff_Statistics_DAO.calculateTotalQuantityStaff() + "");
        jLNumStaffWorking.setText(staff_Statistics_DAO.calculateTotalQuantityStaffWithStatus("Đang làm") + "");
        jLNumStaffOfWorking.setText(staff_Statistics_DAO.calculateTotalQuantityStaffWithStatus("Nghỉ làm") + "");
    }

//    load data to table
    private void loadDataToTable(List<Staff_Statistics> listStaffStatistics) {
        defaultTableModel.setRowCount(0);
        for (Staff_Statistics staff_Statistics : listStaffStatistics) {
            Object[] data = {defaultTableModel.getRowCount() + 1, staff_Statistics.getIdStaff(), staff_Statistics.getName(), staff_Statistics.getNumberOfInvoices(), utils.Utils.formatMoney(staff_Statistics.getTotalRevenue())};
            defaultTableModel.addRow(data);
        }
    }

//    laod data to chart
    private void loadDataToChart(List<Staff_Statistics> list) {
        jpChart.clearData();
        jpChart.addLegend("Doanh thu nhân viên", new Color(189, 135, 245));

        for (Staff_Statistics staff_Statistics : list) {
            jpChart.addData(new ModelChart(staff_Statistics.getName(), new double[]{ staff_Statistics.getTotalRevenue()}));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.ComboBoxSuggestion cbChooserChart;
    private lib2.ComboBoxSuggestion cbChooserTable;
    private javax.swing.JLabel jLNumStaff;
    private javax.swing.JLabel jLNumStaffOfWorking;
    private javax.swing.JLabel jLNumStaffWorking;
    private javax.swing.JPanel jPTop;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPaneMain;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel jlCard1Title;
    private javax.swing.JLabel jlCard1Unit;
    private javax.swing.JLabel jlCard2Title;
    private javax.swing.JLabel jlCard2Unit;
    private javax.swing.JLabel jlCard3Title;
    private javax.swing.JLabel jlCard3Unit;
    private javax.swing.JLabel jlChooserType1;
    private javax.swing.JLabel jlChooserType2;
    private javax.swing.JLabel jlIconMoneyDay;
    private javax.swing.JLabel jlIconMoneyMonth;
    private javax.swing.JLabel jlIconOrder;
    private javax.swing.JLabel jlTitle3;
    private javax.swing.JLabel jlTitle4;
    private javax.swing.JPanel jpCard1;
    private javax.swing.JPanel jpCard2;
    private javax.swing.JPanel jpCard3;
    private lib2.Chart jpChart;
    private javax.swing.JScrollPane jspTable;
    // End of variables declaration//GEN-END:variables
}
