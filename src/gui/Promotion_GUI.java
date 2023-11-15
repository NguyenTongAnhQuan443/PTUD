package gui;

import com.raven.datechooser.DateChooser;
import dao.Customer_DAO;
import dao.ProductProperties_DAO;
import dao.Product_DAO;
import dao.Promotion_DAO;
import dao.Supplier_DAO;
import entity.Product;
import entity.Promotion;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import jdk.jshell.execution.Util;
import lib2.TableCustom;
import utils.Utils;
import entity.ProductType;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import entity.Customer;
import java.io.File;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import static org.bridj.Platform.getResource;

public class Promotion_GUI extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModelListPromotion;
    private DefaultTableModel defaultTableModel1ListProduct;
    private DefaultComboBoxModel<String> productTypeModel = new DefaultComboBoxModel<>();

    private int flag;

    private Product_DAO product_DAO = new Product_DAO();
    private Supplier_DAO supplier_DAO = new Supplier_DAO();
    private ProductProperties_DAO productProperties_DAO = new ProductProperties_DAO();
    private Customer_DAO customer_DAO = new Customer_DAO();
    private Promotion_DAO promotion_DAO = new Promotion_DAO();
    private List<String> listIDProduct = new ArrayList<>();

    public Promotion_GUI() {
        initComponents();

        TableCustom.apply(jspListPromotion, TableCustom.TableType.DEFAULT);
        defaultTableModelListPromotion = (DefaultTableModel) jTableListPromotion.getModel();
        ListSelectionModel selectionModel_1 = jTableListPromotion.getSelectionModel();
        selectionModel_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        TableCustom.apply(jspListProduct, TableCustom.TableType.DEFAULT);
        defaultTableModel1ListProduct = (DefaultTableModel) jTableListProduct.getModel();
        ListSelectionModel selectionModel_2 = jTableListProduct.getSelectionModel();
        selectionModel_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        DateChooser dateChoose_1 = new DateChooser();
        dateChoose_1.setDateFormat("dd/MM/yyyy");
        dateChoose_1.setTextRefernce(jtfStartPromotion);

        DateChooser dateChoose_2 = new DateChooser();
        dateChoose_2.setDateFormat("dd/MM/yyyy");
        dateChoose_2.setTextRefernce(jtfEndPromotion);

        defaultTableModelListPromotion = (DefaultTableModel) jTableListPromotion.getModel();
        defaultTableModel1ListProduct = (DefaultTableModel) jTableListProduct.getModel();

        addProductTypeToModel();
        setIndexFirstCBB(cbProductType, productTypeModel);
        loadDataPromotion(promotion_DAO.getListPromotion());
        loadDataProduct(product_DAO.getListProductAreTrading());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpRight = new javax.swing.JPanel();
        jlTypePromotion = new javax.swing.JLabel();
        cbTypePromotion = new lib2.ComboBoxSuggestion();
        jlIDPromotion = new javax.swing.JLabel();
        jtfIDPromotion = new javax.swing.JTextField();
        jlNamePromotion = new javax.swing.JLabel();
        jtfNamePromotion = new javax.swing.JTextField();
        jlStartPromotion = new javax.swing.JLabel();
        jtfStartPromotion = new javax.swing.JTextField();
        jlEndPromotion = new javax.swing.JLabel();
        jtfEndPromotion = new javax.swing.JTextField();
        jlDiscount = new javax.swing.JLabel();
        jtfDiscount = new javax.swing.JTextField();
        jlPriceRange = new javax.swing.JLabel();
        jtfPriceRange = new javax.swing.JTextField();
        jlDescribe = new javax.swing.JLabel();
        jspDescribe = new javax.swing.JScrollPane();
        jtaDescription = new javax.swing.JTextArea();
        btnSave = new lib2.Button();
        btnEdit = new lib2.Button();
        btnAddPromotion = new lib2.Button();
        jtfQuantity = new javax.swing.JTextField();
        jlQuantity = new javax.swing.JLabel();
        jlUnit = new javax.swing.JLabel();
        jPListPromotion = new javax.swing.JPanel();
        jspListPromotion = new javax.swing.JScrollPane();
        jTableListPromotion = new javax.swing.JTable();
        btnSendprodmotion = new lib2.Button();
        cbStatusPromotion = new lib2.ComboBoxSuggestion();
        hPListProductPromotion = new javax.swing.JPanel();
        jlTypeApply = new javax.swing.JLabel();
        jcSelectAll = new java.awt.Checkbox();
        jspListProduct = new javax.swing.JScrollPane();
        jTableListProduct = new javax.swing.JTable();
        cbProductType = new lib2.ComboBoxSuggestion();

        jpRight.setBackground(new java.awt.Color(255, 255, 255));
        jpRight.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jlTypePromotion.setText("Hình thức :");

        cbTypePromotion.setEditable(false);
        cbTypePromotion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KM theo %", "KM theo tổng tiền" }));
        cbTypePromotion.setEnabled(false);
        cbTypePromotion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTypePromotionItemStateChanged(evt);
            }
        });
        cbTypePromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypePromotionActionPerformed(evt);
            }
        });

        jlIDPromotion.setText("Mã khuyễn mãi :");

        jtfIDPromotion.setEditable(false);

        jlNamePromotion.setText("Tên chương trình :");

        jtfNamePromotion.setEditable(false);

        jlStartPromotion.setText("Thời gian bắt đầu :");

        jtfStartPromotion.setEditable(false);

        jlEndPromotion.setText("Thời gian kết thúc :");

        jtfEndPromotion.setEditable(false);

        jlDiscount.setText("Mức giảm giá : ");

        jtfDiscount.setEditable(false);

        jlPriceRange.setText("Hóa đơn trên :");

        jtfPriceRange.setEditable(false);

        jlDescribe.setText("Mô tả :");

        jtaDescription.setEditable(false);
        jtaDescription.setColumns(20);
        jtaDescription.setRows(5);
        jspDescribe.setViewportView(jtaDescription);

        btnSave.setBackground(new java.awt.Color(135, 206, 235));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/save24.png"))); // NOI18N
        btnSave.setText("    Lưu    ");
        btnSave.setEnabled(false);
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit24.png"))); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAddPromotion.setBackground(new java.awt.Color(135, 206, 235));
        btnAddPromotion.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPromotion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add24.png"))); // NOI18N
        btnAddPromotion.setText("Tạo khuyến mãi");
        btnAddPromotion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddPromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPromotionActionPerformed(evt);
            }
        });

        jtfQuantity.setEditable(false);

        jlQuantity.setText("Số lượng mã: ");

        jlUnit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlUnit.setText("%");

        javax.swing.GroupLayout jpRightLayout = new javax.swing.GroupLayout(jpRight);
        jpRight.setLayout(jpRightLayout);
        jpRightLayout.setHorizontalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addComponent(jlTypePromotion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTypePromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRightLayout.createSequentialGroup()
                        .addComponent(jlDescribe)
                        .addGap(18, 18, 18)
                        .addComponent(jspDescribe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlDiscount)
                            .addComponent(jlPriceRange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpRightLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jlUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpRightLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jtfPriceRange)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlStartPromotion)
                            .addComponent(jlEndPromotion)
                            .addComponent(jlNamePromotion)
                            .addComponent(jlQuantity))
                        .addGap(18, 18, 18)
                        .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpRightLayout.createSequentialGroup()
                                .addComponent(jtfDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfQuantity)
                            .addComponent(jtfNamePromotion)
                            .addComponent(jtfEndPromotion)
                            .addComponent(jtfStartPromotion)))
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlIDPromotion)
                        .addGap(18, 18, 18)
                        .addComponent(jtfIDPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpRightLayout.setVerticalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTypePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTypePromotion))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIDPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIDPromotion))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNamePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNamePromotion))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfStartPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlStartPromotion))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEndPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEndPromotion))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlQuantity))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDiscount)
                    .addComponent(jlUnit))
                .addGap(18, 18, 18)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPriceRange, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPriceRange))
                .addGap(34, 34, 34)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspDescribe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpRightLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jlDescribe)))
                .addGap(144, 144, 144)
                .addComponent(btnAddPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPListPromotion.setBackground(new java.awt.Color(255, 255, 255));
        jPListPromotion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jTableListPromotion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KM", "Tên KM", "Hình thức", "Mức giảm", "Áp dụng cho HĐ trên", "Số lượng", "Ngày bắt đầu", "Ngày kết thúc", "Trạng thái", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListPromotion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListPromotionMouseClicked(evt);
            }
        });
        jspListPromotion.setViewportView(jTableListPromotion);

        btnSendprodmotion.setBackground(new java.awt.Color(135, 206, 235));
        btnSendprodmotion.setForeground(new java.awt.Color(255, 255, 255));
        btnSendprodmotion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/save24.png"))); // NOI18N
        btnSendprodmotion.setText("Gửi thông tin khuyến mãi");
        btnSendprodmotion.setToolTipText("Hệ thống sẽ gửi thông tin các chương trình khuyến mãi hiện có đến khách hàng qua Email");
        btnSendprodmotion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSendprodmotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendprodmotionActionPerformed(evt);
            }
        });

        cbStatusPromotion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả", "Còn hạn", "Hết hạn" }));
        cbStatusPromotion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbStatusPromotionItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPListPromotionLayout = new javax.swing.GroupLayout(jPListPromotion);
        jPListPromotion.setLayout(jPListPromotionLayout);
        jPListPromotionLayout.setHorizontalGroup(
            jPListPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPListPromotionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbStatusPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSendprodmotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jspListPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
        );
        jPListPromotionLayout.setVerticalGroup(
            jPListPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListPromotionLayout.createSequentialGroup()
                .addComponent(jspListPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPListPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendprodmotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatusPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        hPListProductPromotion.setBackground(new java.awt.Color(255, 255, 255));
        hPListProductPromotion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jlTypeApply.setText("Áp dụng cho :");

        jcSelectAll.setEnabled(false);
        jcSelectAll.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jcSelectAll.setLabel("Tất cả sản phẩm");
        jcSelectAll.setName(""); // NOI18N
        jcSelectAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcSelectAllItemStateChanged(evt);
            }
        });

        jTableListProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Giá gốc", "Giá KM", "Số lượng", "Nhà cung cấp", "Màu sắc", "Kích thước", "Chất liệu", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListProduct.setEnabled(false);
        jspListProduct.setViewportView(jTableListProduct);

        cbProductType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả" }));
        cbProductType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProductTypeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout hPListProductPromotionLayout = new javax.swing.GroupLayout(hPListProductPromotion);
        hPListProductPromotion.setLayout(hPListProductPromotionLayout);
        hPListProductPromotionLayout.setHorizontalGroup(
            hPListProductPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hPListProductPromotionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTypeApply)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcSelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jspListProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
        );
        hPListProductPromotionLayout.setVerticalGroup(
            hPListProductPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hPListProductPromotionLayout.createSequentialGroup()
                .addGroup(hPListProductPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hPListProductPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlTypeApply)
                        .addComponent(cbProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcSelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspListProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hPListProductPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPListPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPListPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hPListProductPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jpRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbTypePromotionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTypePromotionItemStateChanged
        if (cbTypePromotion.getSelectedIndex() == 0) {
            jtfNamePromotion.setEditable(true);
            jtfDiscount.setEditable(true);
            jtaDescription.setEditable(true);
            jlUnit.setText("%");
            jTableListProduct.setEnabled(true);
            repaint();
            jcSelectAll.setEnabled(true);
            jtfPriceRange.setEditable(false);
        } else if (cbTypePromotion.getSelectedIndex() == 1) {
            jtfNamePromotion.setText("");
            jtfDiscount.setText("");
            jtfPriceRange.setText("");
            jtaDescription.setText("");
            jtfNamePromotion.setEditable(true);
            jtfDiscount.setEditable(true);
            jtfPriceRange.setEditable(true);
            jlUnit.setText("VNĐ");
            jTableListProduct.setEnabled(false);
            repaint();
            checkOrNncheckAllCells(defaultTableModel1ListProduct, false);
            jcSelectAll.setEnabled(false);
            jcSelectAll.setState(false);
        }
    }//GEN-LAST:event_cbTypePromotionItemStateChanged

    private void cbTypePromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypePromotionActionPerformed

    }//GEN-LAST:event_cbTypePromotionActionPerformed

    private void btnAddPromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPromotionActionPerformed
        if (btnAddPromotion.getText().equals("Tạo khuyến mãi")) {
            flag = 1;
            cbTypePromotion.setEnabled(true);
            jtfIDPromotion.setText(promotion_DAO.createIDPromotion());
            jtfNamePromotion.setEditable(true);
            jtfQuantity.setEditable(true);
            jtfDiscount.setEditable(true);
            jtaDescription.setEditable(true);
            btnSave.setEnabled(true);

            btnAddPromotion.setText("Hủy");
            jTableListProduct.setEnabled(true);
            jcSelectAll.setEnabled(true);

            jtfNamePromotion.setText("");
            jtfQuantity.setText("");
            jtfDiscount.setText("");
            jtfPriceRange.setText("");
            jtaDescription.setText("");

        } else if (btnAddPromotion.getText().equals("Hủy")) {
            flag = 0;
            clearInput();
            jtfIDPromotion.setText("");
            jtfQuantity.setEditable(false);
            cbTypePromotion.setSelectedIndex(0);
            offInput();
            btnSave.setEnabled(false);
            btnAddPromotion.setText("Tạo khuyến mãi");
            jlUnit.setText("%");
            jTableListProduct.setEnabled(false);
            jcSelectAll.setEnabled(false);
            jcSelectAll.setState(false);
            checkOrNncheckAllCells(defaultTableModel1ListProduct, false);
        }
    }//GEN-LAST:event_btnAddPromotionActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        int selectRow = jTableListPromotion.getSelectedRow();
        if (selectRow == -1) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn khuyến mãi muốn cập nhập thông tin !");
        } else {
            if (btnEdit.getText().equals("Sửa")) {
                flag = 2;
                btnEdit.setText("Hủy");
                btnAddPromotion.setEnabled(false);
                btnSave.setEnabled(true);

                cbTypePromotion.setEnabled(true);
                jtfNamePromotion.setEditable(true);
                jtfQuantity.setEditable(true);
                jtfDiscount.setEditable(true);
                jtaDescription.setEditable(true);
                if (cbTypePromotion.getSelectedIndex() == 1) {
                    jtfPriceRange.setEnabled(true);
                }
            } else if (btnEdit.getText().equals("Hủy")) {
                flag = 0;
                btnEdit.setText("Sửa");
                btnAddPromotion.setEnabled(true);
                btnSave.setEnabled(false);
                offInput();
                clearInput();
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (flag == 1) {
            listIDProduct = getListIDProduct();
            if (validator()) {
                // Kiểm tra xem danh sách sản phẩm được chọn vào có sản phẩm nào đã có KM hay không
                boolean canAddProduct = true;
                String IDproductDuplicate = null; // id sản phẩm trùng

                for (String productID : listIDProduct) {
                    // Lấy mã chương trình khuyến mãi của sản phẩm
                    String existingPromotionID = product_DAO.getPromotionIDForProduct(productID);

                    // Kiểm tra xem sản phẩm đã nằm trong chương trình khuyến mãi nào chưa
                    if (existingPromotionID != null) {
                        canAddProduct = false;
                        IDproductDuplicate = productID;
                        break;
                    }
                }

                // Kiểm tra điều kiện mới trước khi thêm sản phẩm vào chương trình khuyến mãi
                if (!canAddProduct) {
                    JOptionPane.showMessageDialog(null, "Sản phẩm " + IDproductDuplicate + " Đã nằm trong một chương trình khuyến mãi khác vui lòng kiểm tra lại !");
                    return;
                }
                String typePromotion = cbTypePromotion.getSelectedItem().toString();
                String idPromotion = jtfIDPromotion.getText().trim();
                String name = jtfNamePromotion.getText().trim();
                LocalDate dayStar = Utils.getLocalDate(jtfStartPromotion.getText().trim());
                LocalDate dayEnd = Utils.getLocalDate(jtfEndPromotion.getText().trim());
                String qtt = jtfQuantity.getText().trim();
                int quantity = Integer.parseInt(qtt);
                String dis = jtfDiscount.getText().trim();
                double disCount = Double.parseDouble(dis);

                String describe = jtaDescription.getText().trim();

                Promotion promotion = null;
                if (cbTypePromotion.getSelectedIndex() == 0) {
//                  Tạo khuyến mãi theo %
                    promotion = new Promotion(idPromotion, name, Promotion.convertStringToTypePromotion(typePromotion), disCount, quantity, dayStar, dayEnd, Promotion.convertStringToStatus("Còn hạn"), describe);
                } else if (cbTypePromotion.getSelectedIndex() == 1) {
//                  Tạo khuyến mãi theo tổng tiền hóa đơn
                    String pr = jtfPriceRange.getText().trim();
                    double priceRange = Double.parseDouble(pr);
                    promotion = new Promotion(idPromotion, name, Promotion.convertStringToTypePromotion(typePromotion), disCount, priceRange, quantity, dayStar, dayEnd, Promotion.convertStringToStatus("Còn hạn"), describe);
                }
                boolean res = promotion_DAO.addPromotionWithProduct(promotion, listIDProduct);
                if (res) {
                    btnAddPromotion.setText("Tạo khuyến mãi");
                    btnSave.setEnabled(false);
                    jcSelectAll.setState(false);
                    cbProductType.setSelectedIndex(0);
                    clearInput();
                    offInput();
                    loadDataPromotion(promotion_DAO.getListPromotion());
                    loadDataProduct(product_DAO.getListProductAreTrading());
                    JOptionPane.showMessageDialog(null, "Tạo chương trình khuyến mãi thành công !");
                } else {
                    JOptionPane.showMessageDialog(null, "Tạo chương trình khuyến mãi thất bại vui lòng kiểm tra lại !");
                }
            }
        } else if (flag == 2) {
            listIDProduct = getListIDProduct();
            if (validator()) {
                // Kiểm tra xem danh sách sản phẩm được chọn vào có sản phẩm nào đã có KM hay không
                boolean canAddProduct = true;
                String IDproductDuplicate = null; // id sản phẩm trùng

                for (String productID : listIDProduct) {
                    // Lấy mã chương trình khuyến mãi của sản phẩm
                    String existingPromotionID = product_DAO.getPromotionIDForProduct(productID);

                    // Kiểm tra xem sản phẩm đã nằm trong chương trình khuyến mãi nào chưa
                    if (existingPromotionID != null) {
                        canAddProduct = false;
                        IDproductDuplicate = productID;
                        break;
                    }
                }

                // Kiểm tra điều kiện mới trước khi thêm sản phẩm vào chương trình khuyến mãi
                if (!canAddProduct) {
                    JOptionPane.showMessageDialog(null, "Sản phẩm " + IDproductDuplicate + " Đã nằm trong một chương trình khuyến mãi khác vui lòng kiểm tra lại !");
                    return;
                }
                String typePromotion = cbTypePromotion.getSelectedItem().toString();
                String idPromotion = jtfIDPromotion.getText().trim();
                String name = jtfNamePromotion.getText().trim();
                LocalDate dayStar = Utils.getLocalDate(jtfStartPromotion.getText().trim());
                LocalDate dayEnd = Utils.getLocalDate(jtfEndPromotion.getText().trim());
                String qtt = jtfQuantity.getText().trim();
                int quantity = Integer.parseInt(qtt);
                String dis = jtfDiscount.getText().trim();
                double disCount = Double.parseDouble(dis);

                String describe = jtaDescription.getText().trim();

                Promotion promotion = null;
                if (cbTypePromotion.getSelectedIndex() == 0) {
//                  Tạo khuyến mãi theo %
                    promotion = new Promotion(idPromotion, name, Promotion.convertStringToTypePromotion(typePromotion), disCount, quantity, dayStar, dayEnd, Promotion.convertStringToStatus("Còn hạn"), describe);
                } else if (cbTypePromotion.getSelectedIndex() == 1) {
//                  Tạo khuyến mãi theo tổng tiền hóa đơn
                    String pr = jtfPriceRange.getText().trim();
                    double priceRange = Double.parseDouble(pr);
                    promotion = new Promotion(idPromotion, name, Promotion.convertStringToTypePromotion(typePromotion), disCount, priceRange, quantity, dayStar, dayEnd, Promotion.convertStringToStatus("Còn hạn"), describe);
                }
                int resultTMP = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn cập nhập thông tin khuyến mãi này không ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (resultTMP == JOptionPane.YES_OPTION) {
                    boolean res = promotion_DAO.updateInfoPromotion(promotion);
                    if (res) {
                        btnEdit.setText("Sửa");
                        btnAddPromotion.setEnabled(true);
                        btnSave.setEnabled(false);
                        jcSelectAll.setState(false);
                        clearInput();
                        offInput();
                        loadDataPromotion(promotion_DAO.getListPromotion());
                        loadDataProduct(product_DAO.getListProductAreTrading());
                        JOptionPane.showMessageDialog(null, "Cập nhập thông tin chương trình khuyến mãi thành công !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cập nhập chương trình khuyến mãi thất bại vui lòng kiểm tra lại !");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jcSelectAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcSelectAllItemStateChanged
        if (evt.getStateChange() == 1) {
            checkOrNncheckAllCells(defaultTableModel1ListProduct, true);
        } else {
            checkOrNncheckAllCells(defaultTableModel1ListProduct, false);
        }
    }//GEN-LAST:event_jcSelectAllItemStateChanged

    private void cbProductTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProductTypeItemStateChanged
        if (cbProductType.getSelectedIndex() == 0) {
            loadDataProduct(product_DAO.getListProductAreTrading());
        } else {
            String nameProductType = cbProductType.getSelectedItem().toString().trim();
            ProductType productType = productProperties_DAO.getProductTypeByNameProductType(nameProductType);
            loadDataProduct(product_DAO.getListProductByProductTypeAndStatus(productType.getIdProductType()));
        }
    }//GEN-LAST:event_cbProductTypeItemStateChanged

    private void jTableListPromotionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListPromotionMouseClicked
        if (evt.getClickCount() == 1 && btnAddPromotion.getText().equals("Tạo khuyến mãi")) {
            int selectedRow = jTableListPromotion.getSelectedRow();
            String idPromotion = jTableListPromotion.getValueAt(selectedRow, 0).toString().trim();
            Promotion promotion = promotion_DAO.getPromotionByID(idPromotion);

            if (promotion.getTypePromotion().equals(Promotion.TypePromotion.KhuyenMaiTheoPhanTram)) {
                cbTypePromotion.setSelectedIndex(0);
            } else if (promotion.getTypePromotion().equals(Promotion.TypePromotion.KhuyenMaiTongTienHoaDon)) {
                cbTypePromotion.setSelectedIndex(1);
            }
            jtfIDPromotion.setText(promotion.getIdPromotion().trim());
            jtfNamePromotion.setText(promotion.getName());
            jtfStartPromotion.setText(Utils.convertDateFormat(promotion.getDayStart().toString().trim()));
            jtfEndPromotion.setText(Utils.convertDateFormat(promotion.getDayEnd().toString().trim()));
            jtfQuantity.setText(promotion.getQuantity() + "");
            String[] discountTMP = (promotion.getDiscount() + "").split("\\.");
            jtfDiscount.setText(discountTMP[0]);

            if (cbTypePromotion.getSelectedIndex() == 1) {
                String[] priceRangeTMP = (promotion.getPriceRange() + "").split("\\.");
                jtfPriceRange.setText(priceRangeTMP[0]);
            } else if (cbTypePromotion.getSelectedIndex() == 0) {
                jtfPriceRange.setText("");
            }
            jtaDescription.setText(promotion.getDecription().trim());

            List<String> listIDProductPromotion = new ArrayList<>();
            listIDProductPromotion = product_DAO.getListIDProductInPromotion(idPromotion);

            // mỗi lần chọn idPromotion khác sẽ set false mặc định cho check của tableProduct
            for (int row = 0; row < defaultTableModel1ListProduct.getRowCount(); row++) {
                defaultTableModel1ListProduct.setValueAt(false, row, 9); // Giả sử cột checkbox là cột thứ 10
            }

//          Tích vào sản phẩm nằm trong danh sách khuyến mãi
            if (!listIDProductPromotion.isEmpty()) {
                for (String idproduct : listIDProductPromotion) {
                    int rowCount = defaultTableModel1ListProduct.getRowCount();
                    int columnCount = defaultTableModel1ListProduct.getColumnCount();

                    for (int row = 0; row < rowCount; row++) {
                        for (int col = 0; col < columnCount; col++) {

                            if (idproduct.equals(jTableListProduct.getValueAt(row, 0))) {
                                defaultTableModel1ListProduct.setValueAt(true, row, 9);

                            }
                        }
                    }
                }
                defaultTableModel1ListProduct.fireTableDataChanged(); // làm mới dữ liểu bảng
            }
            if (btnEdit.getText().equals("Sửa")) {
                offInput();
            }
        }
    }//GEN-LAST:event_jTableListPromotionMouseClicked

    private void cbStatusPromotionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbStatusPromotionItemStateChanged
        if (cbStatusPromotion.getSelectedIndex() == 0) {
            loadDataPromotion(promotion_DAO.getListPromotion());
        } else if (cbStatusPromotion.getSelectedIndex() == 1) {
            loadDataPromotion(promotion_DAO.getListPromotionsByStatus("Còn hạn"));
        } else if (cbStatusPromotion.getSelectedIndex() == 2) {
            loadDataPromotion(promotion_DAO.getListPromotionsByStatus("Hết hạn"));
        }
    }//GEN-LAST:event_cbStatusPromotionItemStateChanged

    private void btnSendprodmotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendprodmotionActionPerformed
        JOptionPane.showMessageDialog(null, "Trước tiên bạn hãy chọn file đính kèm để gửi cho khách hàng nhé");
        JFileChooser jFileChooser = new JFileChooser("D://");
        int result = jFileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            String pathname = file.getPath();

            if (!pathname.isEmpty() && !pathname.equals("")) {
                JOptionPane.showMessageDialog(null, "Thông tin khuyến mãi đang được gửi vui lòng chờ ");
//        Lấy danh sách khách hàng nhận thông tin khuyến mãi
                List<String> listEmailCustomer = new ArrayList<>();
                for (Customer customer : customer_DAO.getListCustomers()) {
                    if (customer.isReceivePromotions() == true) {
                        listEmailCustomer.add(customer.getEmail().trim());
                    }
                }

                String title = "Chào đón mùa đông với ưu đãi hấp dẫn! FleyShop vô số khuyến mãi đang đợi bạn !!!";
                StringBuilder contentBuilder = new StringBuilder();

                for (Promotion promotion : promotion_DAO.getListPromotionsByStatus("Còn hạn")) {
                    if (promotion.getTypePromotion().equals(Promotion.TypePromotion.KhuyenMaiTongTienHoaDon)) {
                        if (contentBuilder.length() > 0) {
                            contentBuilder.append("<br>");  // Xuống dòng trước mỗi chương trình khuyến mãi
                        }
                        contentBuilder.append("- ")
                                .append(promotion.getName())
                                .append("<b>" + " Giảm ngay " + "</b>")
                                .append("<b>" + promotion.getDiscount() + "</b>")
                                .append("VND cho đơn hàng từ ")
                                .append(promotion.getPriceRange())
                                .append("VND");
                    }
                }

                String content1 = "Các chương trình khuyến mãi bao gồm:<br>" + contentBuilder.toString() + "<br> <br>Ngoài ra còn có vô số các khuyến mãi khác áp dụng trực tiếp vào giá bán sản phẩm." + "<br><br> <b>Trân trọng thông tin đến quý khách</b>";
                boolean res = promotion_DAO.sendEmailWithAttachment(listEmailCustomer, content1, title, pathname);
                if (res) {
                    JOptionPane.showMessageDialog(null, "Các chương trình khuyến mãi đã được gửi đến khách hàng Trân trọng !");
                } else {
                    JOptionPane.showMessageDialog(null, "Gửi thông tin khuyến mãi thất bại vui lòng kiểm tra lại email của khách hàng !");
                }
    }//GEN-LAST:event_btnSendprodmotionActionPerformed
        }
    }

    private void clearInput() {
        jtfIDPromotion.setText("");
        jtfNamePromotion.setText("");
        jtfDiscount.setText("");
        jtfPriceRange.setText("");
        jtaDescription.setText("");
        jtfQuantity.setText("");
    }

    private void offInput() {
        cbTypePromotion.setEnabled(false);
        jtfNamePromotion.setEditable(false);
        jtfDiscount.setEditable(false);
        jtfPriceRange.setEditable(false);
        jtaDescription.setEditable(false);
        jtfQuantity.setEditable(false);
    }

    private void loadDataPromotion(List<Promotion> listPromotion) {
        defaultTableModelListPromotion.setRowCount(0);
        for (Promotion promotion : listPromotion) {
            String discout = "";
            String priceRange = "";
            if (Promotion.convertTypePromotionToString(promotion.getTypePromotion()).equals("KM theo %")) {
                discout = promotion.getDiscount() + "%";
                priceRange = "";
            } else if (Promotion.convertTypePromotionToString(promotion.getTypePromotion()).equals("KM theo tổng tiền")) {
                discout = Utils.formatMoney(promotion.getDiscount());
                priceRange = Utils.formatMoney(promotion.getPriceRange());
            }
            Object[] rowData = {promotion.getIdPromotion(), promotion.getName(), Promotion.convertTypePromotionToString(promotion.getTypePromotion()), discout, priceRange, promotion.getQuantity(), promotion.getDayStart(), promotion.getDayEnd(), Promotion.convertStatusToString(promotion.getStatus()), promotion.getDecription()};
            defaultTableModelListPromotion.addRow(rowData);
        }
    }

    private void loadDataProduct(List<Product> listProduct) {
        defaultTableModel1ListProduct.setRowCount(0);

        for (Product product : listProduct) {
            String idProduct = product.getIdProduct().trim();
            String name = product.getName();
            double originalPrice = product.getOriginalPrice();
            int quantity = product.getQuantity();
            String suppplier = supplier_DAO.getSupplierByID(product.getSupplier().getIdSupplier().trim()).getName().trim();
            String color = productProperties_DAO.getProductColorByID(product.getProductColor().getIdColor() + "").getName().toString().trim();
            String size = productProperties_DAO.getProductSizeByID(product.getProductSize().getIdSize() + "").getName().toString().trim();
            String material = productProperties_DAO.getProductMaterialByID(product.getProductMaterial().getIdMaterial() + "").getName().toString().trim();
            boolean bool;
            if (product.getStatus().equals(Product.convertStringToStatus("Đang kinh doanh"))) {
                bool = false;
            } else {
                bool = true;
            }
            double currentPrice;
            if (product.getCurrentPrice() == null) {
                currentPrice = 0;
            } else {
                currentPrice = product.getCurrentPrice();
            }
            Object[] rowData = {idProduct, name, Utils.formatMoney(originalPrice), Utils.formatMoney(currentPrice), quantity + "", suppplier, color, size, material, bool};
            defaultTableModel1ListProduct.addRow(rowData);
        }
    }

// Lấy danh sách các sản phẩm áp dụng chương trình khuyến mãi 
    private List<String> getListIDProduct() {
        List<String> listIDProduct = new ArrayList<>();
        for (int row = 0; row < jTableListProduct.getRowCount(); row++) {
            if (jTableListProduct.getValueAt(row, 9).equals(true)) {
                listIDProduct.add((String) jTableListProduct.getValueAt(row, 0));
            }
        }
        return listIDProduct;
    }

    private void checkOrNncheckAllCells(DefaultTableModel model, boolean status) {
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                model.setValueAt(status, row, 9);
            }
        }
    }

//    Thêm loại sản phẩm vào model
    private void addProductTypeToModel() {
        List<ProductType> listProductType = productProperties_DAO.getListProductType();
        for (ProductType productType : listProductType) {
            productTypeModel.addElement(productType.getName());
        }
    }

    // Set First Item to Default CBB Model Supplier
    private void setIndexFirstCBB(JComboBox jComboBox, DefaultComboBoxModel defaultComboBoxModel) {
        // Lưu trữ item đầu tiên ban đầu
        String firstItem = (String) jComboBox.getItemAt(0);
        jComboBox.setModel(defaultComboBoxModel); // Set model
        jComboBox.insertItemAt(firstItem, 0); // Chèn item đầu tiên
        jComboBox.setSelectedIndex(0); // Đặt ComboBox để hiển thị tên tương ứng
        jComboBox.setModel(defaultComboBoxModel);
    }

    //    Show ERROR
    private boolean showERROR(JTextField jtf, String mess) {
        jtf.selectAll();
        jtf.requestFocus();
        JOptionPane.showMessageDialog(null, mess);
        return false;
    }

//    Validator
    private boolean validator() {
        if (jtfNamePromotion.getText().trim().equals("")) {
            return showERROR(jtfNamePromotion, "Vui lòng nhập tên chương trình khuyến mãi");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dayStar = jtfStartPromotion.getText();
        String dayEnd = jtfEndPromotion.getText();
        LocalDate startDate = LocalDate.parse(dayStar, formatter);
        LocalDate endDate = LocalDate.parse(dayEnd, formatter);
        if (startDate.isBefore(LocalDate.now())) {
            return showERROR(jtfStartPromotion, "Ngày bắt đầu chương trình khuyến mãi gần nhất cho phép là ngày hiện tại !");
        }
        if (startDate.isEqual(endDate) || startDate.isAfter(endDate)) {
            return showERROR(jtfEndPromotion, "Ngày kết thúc chương trình phải sau ngày bắt đầu!");
        }

        if (!isNumber(jtfQuantity.getText().trim())) {
            return showERROR(jtfQuantity, "Dữ liệu nhập vào ô số lượng mã sai vui lòng kiểm tra lại !");
        }
        if (Integer.parseInt(jtfQuantity.getText().trim()) < 0) {
            return showERROR(jtfQuantity, "Số lượng mã khuyễn mãi phải lớn hơn 0");
        }
        if (cbTypePromotion.getSelectedIndex() == 0) {
            if (!isNumber(jtfDiscount.getText().trim())) {
                return showERROR(jtfDiscount, "Vui lòng kiểm tra lại kiểu dữ liệu mức giảm giá, Mức giảm giá từ 1 -> 100%");
            } else {
                double percent = Double.parseDouble(jtfDiscount.getText().trim());
                if (percent < 1 || percent > 100) {
                    return showERROR(jtfDiscount, "Vui lòng kiểm tra lại mức khuyến mãi hợp lệ là từ 1 -> 100%");
                }
            }
            if (listIDProduct.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn các các sản phẩm áp dụng đối với chương trình khuyến mãi này ở bảng sản phẩm bên dưới !");
                return false;
            }
        } else if (cbTypePromotion.getSelectedIndex() == 1) {
            if (!isNumber(jtfDiscount.getText().trim())) {
                return showERROR(jtfDiscount, "Vui lòng kiểm tra lại kiểu dữ liệu mức giảm giá");
            } else {
                double discount = Double.parseDouble(jtfDiscount.getText().trim());
                if (discount < 1) {
                    return showERROR(jtfDiscount, "Mức giảm phá phải lớn hơn 1 nghìn đồng !");
                }
            }

            if (!isNumber(jtfPriceRange.getText().trim())) {
                return showERROR(jtfPriceRange, "Kiểu dữ liệu Tổng tiền hóa đơn được phép áp chụng chưa đúng vui lòng kiểm tra lại");
            } else {
                double priceRange = Double.parseDouble(jtfPriceRange.getText().trim());
                if (priceRange < 1) {
                    return showERROR(jtfPriceRange, "Mức hóa đơn được phép áp dụng phải lớn hơn 1 !");
                } else {
                    if (Double.parseDouble(jtfDiscount.getText()) >= Double.parseDouble(jtfPriceRange.getText())) {
                        return showERROR(jtfDiscount, "Mức giảm phải nhỏ hơn tổng tiền hóa đơn được áp dụng mã giảm giá !");
                    }
                }
            }
        }
        if (jtaDescription.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập mô tả về chương trình khuyến mãi");
            return false;
        }
        return true;
    }

//    Kiểm tra kiểu dữ liệu số
    private boolean isNumber(String number) {
        try {
            int num = Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnAddPromotion;
    private lib2.Button btnEdit;
    private lib2.Button btnSave;
    private lib2.Button btnSendprodmotion;
    private lib2.ComboBoxSuggestion cbProductType;
    private lib2.ComboBoxSuggestion cbStatusPromotion;
    private lib2.ComboBoxSuggestion cbTypePromotion;
    private javax.swing.JPanel hPListProductPromotion;
    private javax.swing.JPanel jPListPromotion;
    private javax.swing.JTable jTableListProduct;
    private javax.swing.JTable jTableListPromotion;
    private java.awt.Checkbox jcSelectAll;
    private javax.swing.JLabel jlDescribe;
    private javax.swing.JLabel jlDiscount;
    private javax.swing.JLabel jlEndPromotion;
    private javax.swing.JLabel jlIDPromotion;
    private javax.swing.JLabel jlNamePromotion;
    private javax.swing.JLabel jlPriceRange;
    private javax.swing.JLabel jlQuantity;
    private javax.swing.JLabel jlStartPromotion;
    private javax.swing.JLabel jlTypeApply;
    private javax.swing.JLabel jlTypePromotion;
    private javax.swing.JLabel jlUnit;
    private javax.swing.JPanel jpRight;
    private javax.swing.JScrollPane jspDescribe;
    private javax.swing.JScrollPane jspListProduct;
    private javax.swing.JScrollPane jspListPromotion;
    private javax.swing.JTextArea jtaDescription;
    private javax.swing.JTextField jtfDiscount;
    private javax.swing.JTextField jtfEndPromotion;
    private javax.swing.JTextField jtfIDPromotion;
    private javax.swing.JTextField jtfNamePromotion;
    private javax.swing.JTextField jtfPriceRange;
    private javax.swing.JTextField jtfQuantity;
    private javax.swing.JTextField jtfStartPromotion;
    // End of variables declaration//GEN-END:variables
}
