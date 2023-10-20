// 1120, 439
package gui;

import dao.District_DAO;
import dao.Province_DAO;
import dao.Staff_DAO;
import dao.Ward_DAO;
import entity.District;
import entity.Province;
import entity.Staff;
import entity.Ward;
import entity.flag;
import javax.swing.table.DefaultTableModel;
import lib2.TableCustom;

public class Staff_Table_GUI extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModel;
    private Staff staff = new Staff();
    private Staff_DAO staff_DAO = new Staff_DAO();
    private Province province;
    private District district;
    private Ward ward;
    private Province_DAO province_DAO = new Province_DAO();
    private District_DAO district_DAO = new District_DAO();
    private Ward_DAO ward_DAO = new Ward_DAO();

    public Staff_Table_GUI() {
        initComponents();
        TableCustom.apply(jspTable, TableCustom.TableType.DEFAULT);
        defaultTableModel = (DefaultTableModel) jTable.getModel();
        if (flag.isFlagStaffGUI() == false) {
            loadData("SELECT * FROM Staff WHERE status = N'Nghỉ làm'");
        }else{
            loadData("SELECT * FROM Staff WHERE status = N'Đang làm'");
        }

    }

    public void loadData(String sql) {
        defaultTableModel.setRowCount(0);
        for (Staff staff : staff_DAO.getListStaffByStatus(sql)) {
            String sex = "";
            if (staff.isSex()) {
                sex = "Nam";
            } else {
                sex = "Nữ";
            }
            String province = province_DAO.getProvinceNameByID(staff.getProvince().getId().toString());
            String district = district_DAO.getDistrictNameByID(staff.getDistrict().getId().toString());
            String ward = district_DAO.getDistrictNameByID(staff.getWard().getId().toString());
            String address = staff.getAddress();
            String addressDetails = province + ", " + district + ", " + district + ", " + address;
            String[] rowData = {staff.getIdStaff(), staff.getName(), staff.getCic(), staff.getPhone(), staff.getEmail(), staff.getDayofbirth().toString(), sex, addressDetails, staff.convertRightsToString(staff.getRights())};
            defaultTableModel.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspTable = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dánh sách nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "CCCD", "SDT", "Email", "Ngày sinh", "Giới tính", "Địa chỉ", "Chức vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspTable.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspTable, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jTable;
    private javax.swing.JScrollPane jspTable;
    // End of variables declaration//GEN-END:variables
}
