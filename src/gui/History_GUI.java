package gui;

import com.raven.datechooser.DateChooser;
import dao.InvoiceDetails_DAO;
import dao.Invoice_DAO;
import dao.Product_DAO;
import dao.Staff_DAO;
import entity.Invoice;
import entity.InvoiceDetails;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import lib2.TableCustom;
import entity.Flag;
import entity.Staff;

public class History_GUI extends javax.swing.JPanel {

    private static final SimpleDateFormat INPUT_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat SQL_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private DefaultTableModel defaultTableModelListInvoice;
    private DefaultTableModel defaultTableModelListProduct;
    private ExchangeProduct_GUI exchangeProduct_GUI;
    private Invoice_DAO invoice_DAO = new Invoice_DAO();
    private Product_DAO product_DAO = new Product_DAO();
    private Staff_DAO staff_DAO = new Staff_DAO();
    private InvoiceDetails_DAO invoiceDetails_DAO = new InvoiceDetails_DAO();

    public History_GUI() {
        initComponents();
        TableCustom.apply(jspListInvoice, TableCustom.TableType.DEFAULT);
        defaultTableModelListInvoice = (DefaultTableModel) jTableListInvoice.getModel();
        ListSelectionModel selectionModel_1 = jTableListInvoice.getSelectionModel();
        selectionModel_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        TableCustom.apply(jspListProduct, TableCustom.TableType.DEFAULT);
        defaultTableModelListProduct = (DefaultTableModel) jTableListProduct.getModel();
        ListSelectionModel selectionModel_2 = jTableListProduct.getSelectionModel();
        selectionModel_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        DateChooser dateChoose_1 = new DateChooser();
        dateChoose_1.setDateFormat("dd/MM/yyyy");
        dateChoose_1.setTextRefernce(jtfFilterTime1);

        DateChooser dateChoose_2 = new DateChooser();
        dateChoose_2.setDateFormat("dd/MM/yyyy");
        dateChoose_2.setTextRefernce(jtfFilterTime2);

        loadListInvoice();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLeft = new javax.swing.JPanel();
        jpLeftListInvoice = new javax.swing.JPanel();
        jspListInvoice = new javax.swing.JScrollPane();
        jTableListInvoice = new javax.swing.JTable();
        jlSearchID = new javax.swing.JLabel();
        jtfIDInvoiceSearch = new javax.swing.JTextField();
        btnSearch = new lib2.Button();
        jtfFilterTime1 = new javax.swing.JTextField();
        jlFilterTime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfFilterTime2 = new javax.swing.JTextField();
        btnFilterTime = new lib2.Button();
        jpLeftInfoProduct = new javax.swing.JPanel();
        jspListProduct = new javax.swing.JScrollPane();
        jTableListProduct = new javax.swing.JTable();
        jpRight = new javax.swing.JPanel();
        jlNameCus = new javax.swing.JLabel();
        jlIDStaff = new javax.swing.JLabel();
        jlNameStaff = new javax.swing.JLabel();
        jlIDInvoice = new javax.swing.JLabel();
        jtfNameCus = new javax.swing.JTextField();
        jlPhoneCus = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jlDateCreate = new javax.swing.JLabel();
        jlStatus = new javax.swing.JLabel();
        jtfIDInvoice = new javax.swing.JTextField();
        jtfIDStaff = new javax.swing.JTextField();
        jtfNameStaff = new javax.swing.JTextField();
        jtfPhoneCus = new javax.swing.JTextField();
        jtfTotal = new javax.swing.JTextField();
        jtfDateCreate = new javax.swing.JTextField();
        jtfStatusDetails = new javax.swing.JTextField();
        button1 = new lib2.Button();

        setLayout(new java.awt.GridLayout());

        jpLeft.setLayout(new javax.swing.BoxLayout(jpLeft, javax.swing.BoxLayout.Y_AXIS));

        jpLeftListInvoice.setBackground(new java.awt.Color(255, 255, 255));
        jpLeftListInvoice.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTableListInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hóa đơn", "Tên khách hàng", "Tên nhân viên", "Ngày tạo", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListInvoice.setToolTipText("");
        jTableListInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListInvoiceMouseClicked(evt);
            }
        });
        jspListInvoice.setViewportView(jTableListInvoice);

        jlSearchID.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlSearchID.setText("Mã hóa đơn :");

        btnSearch.setBackground(new java.awt.Color(135, 206, 235));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search24.png"))); // NOI18N
        btnSearch.setText("Tìm");
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jtfFilterTime1.setEditable(false);

        jlFilterTime.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlFilterTime.setText("Lọc theo thời gian: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Đến: ");

        jtfFilterTime2.setEditable(false);

        btnFilterTime.setBackground(new java.awt.Color(135, 206, 235));
        btnFilterTime.setForeground(new java.awt.Color(255, 255, 255));
        btnFilterTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search24.png"))); // NOI18N
        btnFilterTime.setText("Tìm");
        btnFilterTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFilterTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLeftListInvoiceLayout = new javax.swing.GroupLayout(jpLeftListInvoice);
        jpLeftListInvoice.setLayout(jpLeftListInvoiceLayout);
        jpLeftListInvoiceLayout.setHorizontalGroup(
            jpLeftListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftListInvoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlSearchID)
                .addGap(18, 18, 18)
                .addComponent(jtfIDInvoiceSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlFilterTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfFilterTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfFilterTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFilterTime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpLeftListInvoiceLayout.createSequentialGroup()
                .addComponent(jspListInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpLeftListInvoiceLayout.setVerticalGroup(
            jpLeftListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftListInvoiceLayout.createSequentialGroup()
                .addComponent(jspListInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLeftListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLeftListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfFilterTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jpLeftListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFilterTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLeftListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfIDInvoiceSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlSearchID)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpLeftListInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfFilterTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlFilterTime))))
        );

        jpLeft.add(jpLeftListInvoice);

        jpLeftInfoProduct.setBackground(new java.awt.Color(255, 255, 255));
        jpLeftInfoProduct.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTableListProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng", "Giá gốc", "Giá giảm", "Thành tiền", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspListProduct.setViewportView(jTableListProduct);

        javax.swing.GroupLayout jpLeftInfoProductLayout = new javax.swing.GroupLayout(jpLeftInfoProduct);
        jpLeftInfoProduct.setLayout(jpLeftInfoProductLayout);
        jpLeftInfoProductLayout.setHorizontalGroup(
            jpLeftInfoProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
        );
        jpLeftInfoProductLayout.setVerticalGroup(
            jpLeftInfoProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspListProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );

        jpLeft.add(jpLeftInfoProduct);

        add(jpLeft);

        jpRight.setBackground(new java.awt.Color(255, 255, 255));
        jpRight.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jlNameCus.setText("Tên khách hàng :");

        jlIDStaff.setText("Mã nhân viên :");

        jlNameStaff.setText("Tên nhân viên :");

        jlIDInvoice.setText("Mã hóa đơn : ");

        jtfNameCus.setEditable(false);
        jtfNameCus.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jtfNameCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameCusActionPerformed(evt);
            }
        });

        jlPhoneCus.setText("Số điện thoại  :");

        jlTotal.setText("Tổng tiền hàng :");

        jlDateCreate.setText("Ngày tạo :");

        jlStatus.setText("Trạng thái :");

        jtfIDInvoice.setEditable(false);

        jtfIDStaff.setEditable(false);

        jtfNameStaff.setEditable(false);

        jtfPhoneCus.setEditable(false);

        jtfTotal.setEditable(false);

        jtfDateCreate.setEditable(false);

        jtfStatusDetails.setEditable(false);

        button1.setBackground(new java.awt.Color(135, 206, 235));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/refresh24.png"))); // NOI18N
        button1.setText("Làm mới danh sách hóa đơn");
        button1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpRightLayout = new javax.swing.GroupLayout(jpRight);
        jpRight.setLayout(jpRightLayout);
        jpRightLayout.setHorizontalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addComponent(jlIDInvoice)
                        .addGap(27, 27, 27)
                        .addComponent(jtfIDInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE))
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIDStaff)
                            .addComponent(jlNameStaff)
                            .addComponent(jlNameCus)
                            .addComponent(jlPhoneCus)
                            .addComponent(jlTotal)
                            .addComponent(jlDateCreate)
                            .addComponent(jlStatus))
                        .addGap(12, 12, 12)
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfStatusDetails, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfDateCreate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfIDStaff, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfNameStaff, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfPhoneCus, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfNameCus)))
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpRightLayout.setVerticalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDInvoice)
                    .addComponent(jtfIDInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDStaff)
                    .addComponent(jtfIDStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNameStaff)
                    .addComponent(jtfNameStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNameCus)
                    .addComponent(jtfNameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPhoneCus)
                    .addComponent(jtfPhoneCus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTotal)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDateCreate)
                    .addComponent(jtfDateCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlStatus)
                    .addComponent(jtfStatusDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jpRight);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String idInvoice = jtfIDInvoiceSearch.getText().trim();
        if (idInvoice.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập mã hóa đơn trước khi tìm kiếm !");
        } else {
            Invoice invoiceTMP = invoice_DAO.getInvoiceById(idInvoice);
            if (invoiceTMP == null) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy hóa đơn có mã: " + idInvoice);
            } else {
                loadInvoiceSearch(invoiceTMP);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jtfNameCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameCusActionPerformed

    private void jTableListInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListInvoiceMouseClicked
        if (evt.getClickCount() == 2) {
            int selectedRow = jTableListInvoice.getSelectedRow();
            String idInvoice = (String) defaultTableModelListInvoice.getValueAt(selectedRow, 1);
            loadDataToPanel(invoice_DAO.getInvoiceById(idInvoice));
            loadListProductInvoice(idInvoice);
        }
    }//GEN-LAST:event_jTableListInvoiceMouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        loadListInvoice();
        JOptionPane.showMessageDialog(null, "Danh sách hóa đơn đã được làm mới !");
    }//GEN-LAST:event_button1ActionPerformed

    private void btnFilterTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterTimeActionPerformed
        Date startDate = parseDate(jtfFilterTime1.getText());
        Date endDate = parseDate(jtfFilterTime2.getText());
        if (endDate.before(startDate)) {
            JOptionPane.showMessageDialog(null, "Ngày kết thúc phải sau ngày bắt đầu !");
        } else {
            List<Invoice> listInvoiceTMP = new ArrayList<>();
            listInvoiceTMP = invoice_DAO.getListInvoiceWithinDateRange(startDate, endDate);
            loadListInvoiceWithinDateRange(listInvoiceTMP);
        }
    }//GEN-LAST:event_btnFilterTimeActionPerformed

//    Load list data invoice
    public void loadListInvoice() {
        defaultTableModelListInvoice.setRowCount(0);
        for (Invoice invoice : invoice_DAO.getListInvoice()) {
            int numberOrder = defaultTableModelListInvoice.getRowCount() + 1;
            String status = Invoice.convertStatusToString(invoice.getStatus());
            Object[] rowData = {numberOrder, invoice.getIdInvoice(), invoice.getCustomer().getName(), invoice.getStaff().getName(), invoice.getDateCreated().toLocalDate(), status};
            defaultTableModelListInvoice.addRow(rowData);
        }
    }

//    Load list produt of invoice
    public void loadListProductInvoice(String idInvoice) {
        defaultTableModelListProduct.setRowCount(0);
        for (InvoiceDetails invoiceDetails : invoiceDetails_DAO.getListInvoiceDetailsById(idInvoice)) {
            double currentPrice = (invoiceDetails.getProduct().getCurrentPrice() == null || invoiceDetails.getProduct().getCurrentPrice() == 0) ? invoiceDetails.getProduct().getOriginalPrice() : invoiceDetails.getProduct().getCurrentPrice();
            double total = invoiceDetails.getQuantity() * currentPrice;

            Object[] rowData = {invoiceDetails.getProduct().getIdProduct(), invoiceDetails.getProduct().getName(), invoiceDetails.getQuantity(), invoiceDetails.getProduct().getOriginalPrice() + "đ", invoiceDetails.getUnitPrice() + "đ", invoice_DAO.getInvoiceById(idInvoice).getTotalAmount() + "đ", Invoice.convertStatusToString(invoiceDetails.getInvoice().getStatus()), ""};
            defaultTableModelListProduct.addRow(rowData);
        }
    }

//    Load data search ID Invoice
    public void loadInvoiceSearch(Invoice invoice) {
        defaultTableModelListInvoice.setRowCount(0);
        String status = Invoice.convertStatusToString(invoice.getStatus());
        Object[] rowData = {defaultTableModelListInvoice.getRowCount() + 1, invoice.getIdInvoice(), invoice.getCustomer().getName(), invoice.getStaff().getName(), invoice.getDateCreated().toLocalDate(), status};
        defaultTableModelListInvoice.addRow(rowData);
    }

//    Parser DATE
    private static Date parseDate(String dateString) {
        try {
            return INPUT_DATE_FORMAT.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

//    Load list invoice WithinDateRange
    public void loadListInvoiceWithinDateRange(List<Invoice> listInvoice) {
        defaultTableModelListInvoice.setRowCount(0);
        for (Invoice invoice : listInvoice) {
            int numberOrder = defaultTableModelListInvoice.getRowCount() + 1;
            String status = Invoice.convertStatusToString(invoice.getStatus());
            Object[] rowData = {numberOrder, invoice.getIdInvoice(), invoice.getCustomer().getName(), invoice.getStaff().getName(), invoice.getDateCreated().toLocalDate(), status};
            defaultTableModelListInvoice.addRow(rowData);
        }
    }

//    Load data to panel
    private void loadDataToPanel(Invoice invoice) {
        jtfIDInvoice.setText(invoice.getIdInvoice());
        jtfIDStaff.setText(invoice.getStaff().getIdStaff());
        jtfNameStaff.setText(invoice.getStaff().getName());
        jtfNameCus.setText(invoice.getCustomer().getName());
        jtfPhoneCus.setText(invoice.getCustomer().getPhone());
        jtfTotal.setText(invoice.getTotalAmount() + "VNĐ");
        jtfDateCreate.setText(invoice.getDateCreated().toLocalDate() + "");
        jtfStatusDetails.setText(Invoice.convertStatusToString(invoice.getStatus()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnFilterTime;
    private lib2.Button btnSearch;
    private lib2.Button button1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTable jTableListInvoice;
    private javax.swing.JTable jTableListProduct;
    private javax.swing.JLabel jlDateCreate;
    private javax.swing.JLabel jlFilterTime;
    private javax.swing.JLabel jlIDInvoice;
    private javax.swing.JLabel jlIDStaff;
    private javax.swing.JLabel jlNameCus;
    private javax.swing.JLabel jlNameStaff;
    private javax.swing.JLabel jlPhoneCus;
    private javax.swing.JLabel jlSearchID;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpLeftInfoProduct;
    private javax.swing.JPanel jpLeftListInvoice;
    private javax.swing.JPanel jpRight;
    private javax.swing.JScrollPane jspListInvoice;
    private javax.swing.JScrollPane jspListProduct;
    private javax.swing.JTextField jtfDateCreate;
    private javax.swing.JTextField jtfFilterTime1;
    private javax.swing.JTextField jtfFilterTime2;
    private javax.swing.JTextField jtfIDInvoice;
    private javax.swing.JTextField jtfIDInvoiceSearch;
    private javax.swing.JTextField jtfIDStaff;
    private javax.swing.JTextField jtfNameCus;
    private javax.swing.JTextField jtfNameStaff;
    private javax.swing.JTextField jtfPhoneCus;
    private javax.swing.JTextField jtfStatusDetails;
    private javax.swing.JTextField jtfTotal;
    // End of variables declaration//GEN-END:variables
}
