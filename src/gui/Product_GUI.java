package gui;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import lib2.TableCustom;
import entity.ProductType;
import entity.ProductColor;
import entity.ProductMaterial;
import entity.ProductSize;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import dao.ProductProperties_DAO;
import dao.Product_DAO;
import dao.Supplier_DAO;
import entity.Product;
import entity.Promotion;
import entity.Supplier;
import entity.Ward;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO; // đọc hình ảnh
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon; // set hình ảnh thành icon để add vào label
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import lib2.ComboBoxSuggestion;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Utils;

public class Product_GUI extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModelProductColor;
    private DefaultTableModel defaultTableModelProductMaterial;
    private DefaultTableModel defaultTableModelProductSize;
    private DefaultTableModel defaultTableModelProductType;
    private DefaultTableModel defaultTableModelListProduct;

    private ProductProperties_DAO productProperties_DAO = new ProductProperties_DAO();
    private Supplier_DAO supplier_DAO = new Supplier_DAO();
    private Product_DAO product_DAO = new Product_DAO();

    private boolean flagAddOrUpdate;
    private int flagIDProductColor;
    private int flagIDProductSize;
    private int flagIDProductType;
    private int flagIDProductMaterial;

    private Product product;
    private String imageProductPath;

    private List<Product> listProduct = new ArrayList<Product>();
    private List<Supplier> listSupplier = new ArrayList<Supplier>();
    private List<ProductColor> listProductColor = new ArrayList<ProductColor>();
    private List<ProductMaterial> listProductMaterial = new ArrayList<ProductMaterial>();

    private DefaultComboBoxModel<String> supplierModel = new DefaultComboBoxModel<>();
    private DefaultComboBoxModel<String> productTypeModel = new DefaultComboBoxModel<>();
    private DefaultComboBoxModel<String> productColorModel = new DefaultComboBoxModel<>();
    private DefaultComboBoxModel<String> productSizeModel = new DefaultComboBoxModel<>();
    private DefaultComboBoxModel<String> productMaterialModel = new DefaultComboBoxModel<>();

    private int flag = 0;

    public Product_GUI() {
        initComponents();

        TableCustom.apply(jSPProductColor, TableCustom.TableType.DEFAULT);
        defaultTableModelProductColor = (DefaultTableModel) jTableProductColor.getModel();
        ListSelectionModel selectionModel_1 = jTableProductColor.getSelectionModel();
        selectionModel_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        TableCustom.apply(jSPProductMaterial, TableCustom.TableType.DEFAULT);
        defaultTableModelProductMaterial = (DefaultTableModel) jTableProductMaterial.getModel();
        ListSelectionModel selectionModel_2 = jTableProductMaterial.getSelectionModel();
        selectionModel_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        TableCustom.apply(jSPProductSize, TableCustom.TableType.DEFAULT);
        defaultTableModelProductSize = (DefaultTableModel) jTableProductSize.getModel();
        ListSelectionModel selectionModel_3 = jTableProductSize.getSelectionModel();
        selectionModel_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        TableCustom.apply(jSPProductType, TableCustom.TableType.DEFAULT);
        defaultTableModelProductType = (DefaultTableModel) jTableProductType.getModel();
        ListSelectionModel selectionModel_4 = jTableProductType.getSelectionModel();
        selectionModel_4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        TableCustom.apply(jSPTableListProduct, TableCustom.TableType.DEFAULT);
        defaultTableModelListProduct = (DefaultTableModel) jTableListProduct.getModel();
        ListSelectionModel selectionModel_5 = jTableListProduct.getSelectionModel();
        selectionModel_5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        addSupplierToModel();
        setIndexFirstCBB(cbSupplier, supplierModel);

        addProductTypeToModel();
        setIndexFirstCBB(cbType, productTypeModel);

        addProductColorToModel();
        setIndexFirstCBB(cbColor, productColorModel);

        addProductSizeToModel();
        setIndexFirstCBB(cbSize, productSizeModel);

        addProductMaterialToModel();
        setIndexFirstCBB(cbMaterial, productMaterialModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPaneMain = new javax.swing.JTabbedPane();
        JP1 = new javax.swing.JPanel();
        JP1_Main = new javax.swing.JPanel();
        JP1M_Top = new javax.swing.JPanel();
        JP1MT_Left = new javax.swing.JPanel();
        jrbType = new javax.swing.JRadioButton();
        jrbColor = new javax.swing.JRadioButton();
        jrbSize = new javax.swing.JRadioButton();
        jrbMaterial = new javax.swing.JRadioButton();
        jlNote1 = new javax.swing.JLabel();
        JP1MT_Right = new javax.swing.JPanel();
        jtfInputName = new lib2.TextField();
        btnAdd = new lib2.Button();
        btnEdit = new lib2.Button();
        btnSave = new lib2.Button();
        jTabbedPaneChild = new javax.swing.JTabbedPane();
        jPProductType = new javax.swing.JPanel();
        jSPProductType = new javax.swing.JScrollPane();
        jTableProductType = new javax.swing.JTable();
        jPProductSize = new javax.swing.JPanel();
        jSPProductSize = new javax.swing.JScrollPane();
        jTableProductSize = new javax.swing.JTable();
        jPProductColor = new javax.swing.JPanel();
        jSPProductColor = new javax.swing.JScrollPane();
        jTableProductColor = new javax.swing.JTable();
        jPProductMaterial = new javax.swing.JPanel();
        jSPProductMaterial = new javax.swing.JScrollPane();
        jTableProductMaterial = new javax.swing.JTable();
        JP2 = new javax.swing.JPanel();
        jPTop = new javax.swing.JPanel();
        jtfIDProduct = new lib2.TextField();
        jtfPrice = new lib2.TextField();
        cbColor = new lib2.ComboBoxSuggestion();
        jtfNameProduct = new lib2.TextField();
        jtfQuantity = new lib2.TextField();
        cbType = new lib2.ComboBoxSuggestion();
        cbMaterial = new lib2.ComboBoxSuggestion();
        cbSize = new lib2.ComboBoxSuggestion();
        jcStopBusiness = new javax.swing.JCheckBox();
        btnIMGProduct = new lib2.Button();
        btnSaveProduct = new lib2.Button();
        btnReloadProduct = new lib2.Button();
        jtfCostPrice = new lib2.TextField();
        cbSupplier = new lib2.ComboBoxSuggestion();
        btnAddProduct = new lib2.Button();
        jPIMGProduct = new javax.swing.JPanel();
        jLIMGProduct = new javax.swing.JLabel();
        btnEditProduct = new lib2.Button();
        jPBottom = new javax.swing.JPanel();
        jSPTableListProduct = new javax.swing.JScrollPane();
        jTableListProduct = new javax.swing.JTable();
        btnInputFile = new lib2.Button();
        btnOutputFile = new lib2.Button();
        btnSearchProductByID = new lib2.Button();
        jLSearchProductByID = new javax.swing.JLabel();
        jtfSearchProductByID = new javax.swing.JTextField();

        buttonGroup1.add(jrbColor);
        buttonGroup1.add(jrbMaterial);
        buttonGroup1.add(jrbSize);
        buttonGroup1.add(jrbType);
        jrbType.setSelected(true);

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPaneMain.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPaneMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPaneMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneMainMouseClicked(evt);
            }
        });

        JP1.setBackground(new java.awt.Color(255, 255, 255));

        JP1_Main.setBackground(new java.awt.Color(255, 255, 255));
        JP1_Main.setLayout(new javax.swing.BoxLayout(JP1_Main, javax.swing.BoxLayout.Y_AXIS));

        JP1M_Top.setBackground(new java.awt.Color(255, 255, 255));

        JP1MT_Left.setBackground(new java.awt.Color(255, 255, 255));
        JP1MT_Left.setBorder(javax.swing.BorderFactory.createTitledBorder("Hãy chọn loại thuộc tính"));

        jrbType.setBackground(new java.awt.Color(255, 255, 255));
        jrbType.setText("Loại sản phẩm");
        jrbType.setToolTipText("Quấn, Áo, Váy, Nón, Phụ kiện ...");
        jrbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTypeActionPerformed(evt);
            }
        });

        jrbColor.setBackground(new java.awt.Color(255, 255, 255));
        jrbColor.setText("Màu sắc");
        jrbColor.setToolTipText("Vàng, Xanh, Đỏ ...");
        jrbColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbColorActionPerformed(evt);
            }
        });

        jrbSize.setBackground(new java.awt.Color(255, 255, 255));
        jrbSize.setText("Kích thước");
        jrbSize.setToolTipText("S, M, L, XL, 2XL, 3XL ...");
        jrbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSizeActionPerformed(evt);
            }
        });

        jrbMaterial.setBackground(new java.awt.Color(255, 255, 255));
        jrbMaterial.setText("Chất liệu");
        jrbMaterial.setToolTipText("Cotton, Kaki, Jean ...");
        jrbMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMaterialActionPerformed(evt);
            }
        });

        jlNote1.setText("(Hãy chọn loại thuộc tính trước khi nhập tên thuộc tính)");

        javax.swing.GroupLayout JP1MT_LeftLayout = new javax.swing.GroupLayout(JP1MT_Left);
        JP1MT_Left.setLayout(JP1MT_LeftLayout);
        JP1MT_LeftLayout.setHorizontalGroup(
            JP1MT_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP1MT_LeftLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(JP1MT_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNote1)
                    .addGroup(JP1MT_LeftLayout.createSequentialGroup()
                        .addComponent(jrbType)
                        .addGap(18, 18, 18)
                        .addComponent(jrbSize)
                        .addGap(18, 18, 18)
                        .addComponent(jrbColor)
                        .addGap(18, 18, 18)
                        .addComponent(jrbMaterial)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        JP1MT_LeftLayout.setVerticalGroup(
            JP1MT_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP1MT_LeftLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(JP1MT_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMaterial)
                    .addComponent(jrbColor)
                    .addComponent(jrbSize)
                    .addComponent(jrbType))
                .addGap(28, 28, 28)
                .addComponent(jlNote1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        JP1MT_Right.setBackground(new java.awt.Color(255, 255, 255));
        JP1MT_Right.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhập tên thuộc tính"));

        jtfInputName.setEditable(false);
        jtfInputName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfInputName.setLabelText("Hãy nhập tên thuộc tính");
        jtfInputName.setLineColor(new java.awt.Color(204, 204, 255));
        jtfInputName.setSelectionColor(new java.awt.Color(204, 204, 255));

        btnAdd.setBackground(new java.awt.Color(135, 206, 235));
        btnAdd.setBorder(null);
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add24.png"))); // NOI18N
        btnAdd.setText("Thêm mới");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setBorder(null);
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit24.png"))); // NOI18N
        btnEdit.setText("Sửa thuộc tính");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(135, 206, 235));
        btnSave.setBorder(null);
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/done24.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.setEnabled(false);
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP1MT_RightLayout = new javax.swing.GroupLayout(JP1MT_Right);
        JP1MT_Right.setLayout(JP1MT_RightLayout);
        JP1MT_RightLayout.setHorizontalGroup(
            JP1MT_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP1MT_RightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP1MT_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfInputName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JP1MT_RightLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        JP1MT_RightLayout.setVerticalGroup(
            JP1MT_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP1MT_RightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfInputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JP1MT_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JP1M_TopLayout = new javax.swing.GroupLayout(JP1M_Top);
        JP1M_Top.setLayout(JP1M_TopLayout);
        JP1M_TopLayout.setHorizontalGroup(
            JP1M_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP1M_TopLayout.createSequentialGroup()
                .addComponent(JP1MT_Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP1MT_Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP1M_TopLayout.setVerticalGroup(
            JP1M_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP1MT_Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(JP1MT_Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        JP1_Main.add(JP1M_Top);

        jTabbedPaneChild.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneChildStateChanged(evt);
            }
        });
        jTabbedPaneChild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneChildMouseClicked(evt);
            }
        });

        jTableProductType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "STT", "Tên loại sản phẩm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProductType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductTypeMouseClicked(evt);
            }
        });
        jSPProductType.setViewportView(jTableProductType);

        javax.swing.GroupLayout jPProductTypeLayout = new javax.swing.GroupLayout(jPProductType);
        jPProductType.setLayout(jPProductTypeLayout);
        jPProductTypeLayout.setHorizontalGroup(
            jPProductTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPProductType, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
        );
        jPProductTypeLayout.setVerticalGroup(
            jPProductTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPProductType, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        jTabbedPaneChild.addTab("Loại sản phẩm", jPProductType);

        jTableProductSize.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "STT", "Loại kích thước"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProductSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductSizeMouseClicked(evt);
            }
        });
        jSPProductSize.setViewportView(jTableProductSize);

        javax.swing.GroupLayout jPProductSizeLayout = new javax.swing.GroupLayout(jPProductSize);
        jPProductSize.setLayout(jPProductSizeLayout);
        jPProductSizeLayout.setHorizontalGroup(
            jPProductSizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPProductSize, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
        );
        jPProductSizeLayout.setVerticalGroup(
            jPProductSizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPProductSize, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        jTabbedPaneChild.addTab("Kích thước", jPProductSize);

        jTableProductColor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "STT", "Tên màu sắc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProductColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductColorMouseClicked(evt);
            }
        });
        jSPProductColor.setViewportView(jTableProductColor);

        javax.swing.GroupLayout jPProductColorLayout = new javax.swing.GroupLayout(jPProductColor);
        jPProductColor.setLayout(jPProductColorLayout);
        jPProductColorLayout.setHorizontalGroup(
            jPProductColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPProductColor, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
        );
        jPProductColorLayout.setVerticalGroup(
            jPProductColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPProductColor, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        jTabbedPaneChild.addTab("Màu sắc", jPProductColor);

        jTableProductMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "STT", "Tên chất liệu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProductMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductMaterialMouseClicked(evt);
            }
        });
        jSPProductMaterial.setViewportView(jTableProductMaterial);

        javax.swing.GroupLayout jPProductMaterialLayout = new javax.swing.GroupLayout(jPProductMaterial);
        jPProductMaterial.setLayout(jPProductMaterialLayout);
        jPProductMaterialLayout.setHorizontalGroup(
            jPProductMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPProductMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
        );
        jPProductMaterialLayout.setVerticalGroup(
            jPProductMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPProductMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        jTabbedPaneChild.addTab("Chất liệu", jPProductMaterial);

        JP1_Main.add(jTabbedPaneChild);

        javax.swing.GroupLayout JP1Layout = new javax.swing.GroupLayout(JP1);
        JP1.setLayout(JP1Layout);
        JP1Layout.setHorizontalGroup(
            JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP1_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JP1Layout.setVerticalGroup(
            JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP1_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneMain.addTab("Thuộc tính sản phẩm", JP1);

        JP2.setBackground(new java.awt.Color(255, 255, 255));
        JP2.setLayout(new javax.swing.BoxLayout(JP2, javax.swing.BoxLayout.Y_AXIS));

        jPTop.setBackground(new java.awt.Color(255, 255, 255));
        jPTop.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jtfIDProduct.setEditable(false);
        jtfIDProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfIDProduct.setLabelText("Mã sản phẩm");
        jtfIDProduct.setLineColor(new java.awt.Color(204, 204, 255));
        jtfIDProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDProductActionPerformed(evt);
            }
        });

        jtfPrice.setEditable(false);
        jtfPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfPrice.setLabelText("Giá bán");
        jtfPrice.setLineColor(new java.awt.Color(204, 204, 255));
        jtfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPriceActionPerformed(evt);
            }
        });

        cbColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Màu sắc" }));
        cbColor.setEnabled(false);
        cbColor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfNameProduct.setEditable(false);
        jtfNameProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNameProduct.setLabelText("Tên sản phẩm");
        jtfNameProduct.setLineColor(new java.awt.Color(204, 204, 255));
        jtfNameProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameProductActionPerformed(evt);
            }
        });

        jtfQuantity.setEditable(false);
        jtfQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfQuantity.setLabelText("Số lượng");
        jtfQuantity.setLineColor(new java.awt.Color(204, 204, 255));
        jtfQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfQuantityActionPerformed(evt);
            }
        });

        cbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Loại sản phẩm" }));
        cbType.setEnabled(false);
        cbType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTypeItemStateChanged(evt);
            }
        });

        cbMaterial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chất liệu" }));
        cbMaterial.setEnabled(false);
        cbMaterial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kích thước" }));
        cbSize.setEnabled(false);
        cbSize.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jcStopBusiness.setBackground(new java.awt.Color(255, 255, 255));
        jcStopBusiness.setText("Ngừng kinh doanh");
        jcStopBusiness.setEnabled(false);

        btnIMGProduct.setBackground(new java.awt.Color(135, 206, 235));
        btnIMGProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnIMGProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add24.png"))); // NOI18N
        btnIMGProduct.setText("Chọn ảnh");
        btnIMGProduct.setEnabled(false);
        btnIMGProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIMGProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMGProductActionPerformed(evt);
            }
        });

        btnSaveProduct.setBackground(new java.awt.Color(135, 206, 235));
        btnSaveProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/done24.png"))); // NOI18N
        btnSaveProduct.setText("Lưu");
        btnSaveProduct.setEnabled(false);
        btnSaveProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSaveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProductActionPerformed(evt);
            }
        });

        btnReloadProduct.setBackground(new java.awt.Color(135, 206, 235));
        btnReloadProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnReloadProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/refresh24.png"))); // NOI18N
        btnReloadProduct.setText("Làm mới DS");
        btnReloadProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReloadProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadProductActionPerformed(evt);
            }
        });

        jtfCostPrice.setEditable(false);
        jtfCostPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCostPrice.setLabelText("Giá nhập");
        jtfCostPrice.setLineColor(new java.awt.Color(204, 204, 255));
        jtfCostPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCostPriceActionPerformed(evt);
            }
        });

        cbSupplier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nhà cung cấp" }));
        cbSupplier.setEnabled(false);
        cbSupplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSupplier.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSupplierItemStateChanged(evt);
            }
        });
        cbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSupplierActionPerformed(evt);
            }
        });

        btnAddProduct.setBackground(new java.awt.Color(135, 206, 235));
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add24.png"))); // NOI18N
        btnAddProduct.setText("Thêm");
        btnAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        jPIMGProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Ảnh sản phẩm"));

        javax.swing.GroupLayout jPIMGProductLayout = new javax.swing.GroupLayout(jPIMGProduct);
        jPIMGProduct.setLayout(jPIMGProductLayout);
        jPIMGProductLayout.setHorizontalGroup(
            jPIMGProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLIMGProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPIMGProductLayout.setVerticalGroup(
            jPIMGProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLIMGProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnEditProduct.setBackground(new java.awt.Color(135, 206, 235));
        btnEditProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnEditProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit24.png"))); // NOI18N
        btnEditProduct.setText("Cập nhập");
        btnEditProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPTopLayout = new javax.swing.GroupLayout(jPTop);
        jPTop.setLayout(jPTopLayout);
        jPTopLayout.setHorizontalGroup(
            jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTopLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jcStopBusiness)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPTopLayout.createSequentialGroup()
                        .addGroup(jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfIDProduct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSize, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbSupplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jtfNameProduct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPTopLayout.createSequentialGroup()
                                .addGroup(jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfCostPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbType, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbColor, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                            .addGroup(jPTopLayout.createSequentialGroup()
                                .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSaveProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReloadProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIMGProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jPIMGProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPTopLayout.setVerticalGroup(
            jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPTopLayout.createSequentialGroup()
                        .addGroup(jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfIDProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSupplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPIMGProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIMGProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSaveProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReloadProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcStopBusiness)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        JP2.add(jPTop);

        jPBottom.setBackground(new java.awt.Color(255, 255, 255));
        jPBottom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTableListProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Đơn giá", "Số lượng", "Nhà cung cấp", "Màu sắc", "Kích thước", "Chất liệu", "Ngừng kinh doanh"
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
        jTableListProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListProductMouseClicked(evt);
            }
        });
        jSPTableListProduct.setViewportView(jTableListProduct);

        btnInputFile.setBackground(new java.awt.Color(135, 206, 235));
        btnInputFile.setForeground(new java.awt.Color(255, 255, 255));
        btnInputFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/inputfile24.png"))); // NOI18N
        btnInputFile.setText("Nhập DSSP");
        btnInputFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInputFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputFileActionPerformed(evt);
            }
        });

        btnOutputFile.setBackground(new java.awt.Color(135, 206, 235));
        btnOutputFile.setForeground(new java.awt.Color(255, 255, 255));
        btnOutputFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/outputfile24.png"))); // NOI18N
        btnOutputFile.setText("Xuất DSSP");
        btnOutputFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOutputFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutputFileActionPerformed(evt);
            }
        });

        btnSearchProductByID.setBackground(new java.awt.Color(135, 206, 235));
        btnSearchProductByID.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchProductByID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search24.png"))); // NOI18N
        btnSearchProductByID.setText("Tìm kiếm");
        btnSearchProductByID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearchProductByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductByIDActionPerformed(evt);
            }
        });

        jLSearchProductByID.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLSearchProductByID.setText("Tìm SP theo mã : ");

        javax.swing.GroupLayout jPBottomLayout = new javax.swing.GroupLayout(jPBottom);
        jPBottom.setLayout(jPBottomLayout);
        jPBottomLayout.setHorizontalGroup(
            jPBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPTableListProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE)
            .addGroup(jPBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLSearchProductByID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfSearchProductByID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchProductByID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInputFile, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOutputFile, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPBottomLayout.setVerticalGroup(
            jPBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSPTableListProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInputFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOutputFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBottomLayout.createSequentialGroup()
                        .addGroup(jPBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchProductByID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSearchProductByID)
                            .addComponent(jtfSearchProductByID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        JP2.add(jPBottom);

        jTabbedPaneMain.addTab("Danh sách sản phẩm", JP2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMain)
        );

        jTabbedPaneMain.getAccessibleContext().setAccessibleName("Thuộc tính sản phẩm");
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPaneMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneMainMouseClicked
        loadDataProduct();
    }//GEN-LAST:event_jTabbedPaneMainMouseClicked

    private void btnSearchProductByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductByIDActionPerformed
        String idProduct = jtfSearchProductByID.getText().trim();
        if (idProduct.equals("")) {
            showERROR(jtfSearchProductByID, "Vui lòng nhập mã sản phẩm trước khi tìm kiếm !");
        } else {
            Product product = product_DAO.getProductByID(idProduct);
            if (product != null) {
                loadDataSearch(product);
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy sản phẩm nào có mã " + idProduct + " trong danh sách");
            }
        }
    }//GEN-LAST:event_btnSearchProductByIDActionPerformed

    private void btnOutputFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutputFileActionPerformed
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
            List<Product> productList = product_DAO.getListProduct();

            // Kiểm tra nếu danh sách không rỗng, sau đó tiến hành ghi vào tệp Excel
            if (!productList.isEmpty()) {
                writeExcel(pathname, productList);
                JOptionPane.showMessageDialog(null, "Danh sách sản phẩm đã được lưu vào " + pathname);
            } else {
                JOptionPane.showMessageDialog(null, "Không có dữ liệu sản phẩm để lưu vui lòng kiểm tra lại");
            }
        }
    }//GEN-LAST:event_btnOutputFileActionPerformed

    private void btnInputFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputFileActionPerformed
        JFileChooser jFileChooser = new JFileChooser("D://");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xls", "xlsx");
        jFileChooser.setFileFilter(filter);
        int result = jFileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            String pathname = file.getPath();
            if (Pattern.matches(".*\\.xls", pathname) || Pattern.matches(".*\\.xlsx", pathname)) {
                List<Product> listproduct = readExcel(pathname);
                boolean res = product_DAO.addProductList(listproduct);
                if (res) {
                    loadDataProduct();
                    JOptionPane.showMessageDialog(null, "Đã hoàn thành nhập danh sách sản phẩm từ file!");
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng kiểm tra lại định dạng file về: Mã sản phẩm, Tên sản phẩm, Đơn giá, Số lượng, Nhà cung cấp, Chất liệu, Màu sắc, Kích thước V.V !");
                }
                readExcel(pathname);
            } else {
                JOptionPane.showMessageDialog(null, "File không hợp lệ, vui lòng kiểm tra lại!");
            }
        }
    }//GEN-LAST:event_btnInputFileActionPerformed

    private void jTableListProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListProductMouseClicked
        if (evt.getClickCount() == 1 && btnAddProduct.getText().equals("Thêm")) {
            int selectRow = jTableListProduct.getSelectedRow();
            String idProduct = jTableListProduct.getValueAt(selectRow, 0).toString().trim();

            for (Product product : listProduct) {
                if (idProduct.equals(product.getIdProduct().trim())) {
                    jtfIDProduct.setText(product.getIdProduct().trim());
                    jtfNameProduct.setText(product.getName().trim());
                    String costPrice = product.getCostPrice() + "";
                    String[] parts_1 = costPrice.split("\\.");
                    jtfCostPrice.setText(parts_1[0]);
                    String price = product.getOriginalPrice() + "";
                    parts_1 = price.split("\\.");
                    jtfPrice.setText(parts_1[0]);
                    jtfQuantity.setText(product.getQuantity() + "");
                    if (product.getStatus().equals(product.getStatus().NgungKinhDoanh)) {
                        jcStopBusiness.setSelected(true);
                    } else {
                        jcStopBusiness.setSelected(false);
                    }
                    String pathIMG = "";
                    if (product.getPathImageProduct() != null) {
                        pathIMG = product.getPathImageProduct().toString().trim();
                    }
                    if (!pathIMG.isEmpty()) {
                        Image image;
                        try {
                            image = ImageIO.read(new File(product.getPathImageProduct().trim()));
                            int width = jLIMGProduct.getWidth();
                            int height = jLIMGProduct.getHeight();
                            Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                            Icon icon = new ImageIcon(scaledImage);
                            jLIMGProduct.setIcon(icon);

                        } catch (IOException ex) {
                            Logger.getLogger(Product_GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        jLIMGProduct.setIcon(null);
                    }

                    // Chọn tên nhà cung cấp trên combobox theo ID
                    String idSupplier = product.getSupplier().getIdSupplier().trim();
                    int indexSupplier = 0;
                    for (int i = 1; i < supplierModel.getSize(); i++) {
                        if (supplier_DAO.getListSupplier().get(i - 1).getIdSupplier().toString().trim().equals(idSupplier)) {
                            indexSupplier = i;
                            break;
                        }
                    }
                    cbSupplier.setSelectedIndex(indexSupplier);

                    // Chọn loại sản phâm trên combobox theo ID
                    int idProductType = product.getProductType().getIdProductType();
                    int indexProducType = 0;
                    for (int i = 1; i < productTypeModel.getSize(); i++) {
                        if (productProperties_DAO.getListProductType().get(i - 1).getIdProductType() == idProductType) {
                            indexProducType = i;
                            break;
                        }
                    }
                    cbType.setSelectedIndex(indexProducType);

                    // Chọn loại sản phâm trên combobox theo ID
                    int idProductColor = product.getProductColor().getIdColor();
                    int indexProducColor = 0;
                    for (int i = 1; i < productColorModel.getSize(); i++) {
                        if (productProperties_DAO.getListProductColor().get(i - 1).getIdColor() == idProductColor) {
                            indexProducColor = i;
                            break;
                        }
                    }
                    cbColor.setSelectedIndex(indexProducColor);

                    // Chọn loại sản phâm trên combobox theo ID
                    int idProductSize = product.getProductSize().getIdSize();
                    int indexProducSize = 0;
                    for (int i = 1; i < productSizeModel.getSize(); i++) {
                        if (productProperties_DAO.getListProductSize().get(i - 1).getIdSize() == idProductSize) {
                            indexProducSize = i;
                            break;
                        }
                    }
                    cbSize.setSelectedIndex(indexProducSize);

                    // Chọn chất liệu trên combobox theo ID
                    int idProductMaterial = product.getProductMaterial().getIdMaterial();
                    int indexProducMaterial = 0;
                    for (int i = 1; i < productMaterialModel.getSize(); i++) {
                        if (productProperties_DAO.getListProductMaterial().get(i - 1).getIdMaterial() == idProductMaterial) {
                            indexProducMaterial = i;
                            break;
                        }
                    }
                    cbMaterial.setSelectedIndex(indexProducMaterial);

                }
            }
        }
    }//GEN-LAST:event_jTableListProductMouseClicked

    private void btnEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProductActionPerformed
        if (btnEditProduct.getText().equals("Cập nhập")) {
            onInput();
            btnAddProduct.setEnabled(false);
            btnSaveProduct.setEnabled(true);
            btnEditProduct.setText("Hủy");
            jcStopBusiness.setEnabled(true);
            btnIMGProduct.setEnabled(true);
            flag = 2;
        } else if (btnEditProduct.getText().equals("Hủy")) {
            btnAddProduct.setEnabled(true);
            btnSaveProduct.setEnabled(false);
            btnEditProduct.setText("Cập nhập");
            btnIMGProduct.setEnabled(false);
            flag = 0;
            offInput();
            clearInput();
        }
    }//GEN-LAST:event_btnEditProductActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        if (btnAddProduct.getText().trim().equals("Thêm")) {
            onInput();
            clearInput();
            btnSaveProduct.setEnabled(true);
            btnIMGProduct.setEnabled(true);
            jtfIDProduct.setText(product_DAO.createIDProduct().toString());
            btnAddProduct.setText("Hủy");
            btnReloadProduct.setEnabled(false);
            flag = 1;
        } else if (btnAddProduct.getText().trim().equals("Hủy")) {
            offInput();
            clearInput();
            btnSaveProduct.setEnabled(false);
            btnIMGProduct.setEnabled(false);
            btnAddProduct.setText("Thêm");
            btnReloadProduct.setEnabled(true);
            flag = 0;
        }
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void cbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSupplierActionPerformed

    private void cbSupplierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSupplierItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSupplierItemStateChanged

    private void jtfCostPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCostPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCostPriceActionPerformed

    private void btnReloadProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadProductActionPerformed
        loadDataProduct();
        JOptionPane.showMessageDialog(null, "Danh sách đã được làm mới");
    }//GEN-LAST:event_btnReloadProductActionPerformed

    private void btnSaveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProductActionPerformed
        if (flag == 1) {
            if (validatorProduct()) {
                String idProduct = jtfIDProduct.getText().trim();
                String name = jtfNameProduct.getText().trim();
                double costPrice = Double.parseDouble(jtfCostPrice.getText().trim());
                double originalPrice = Double.parseDouble(jtfPrice.getText().trim());
                int quantity = Integer.parseInt(jtfQuantity.getText().trim());
                Supplier supplier = supplier_DAO.getSupplierByNameSupplier(cbSupplier.getSelectedItem().toString().trim());
                ProductType productType = productProperties_DAO.getProductTypeByNameProductType(cbType.getSelectedItem().toString().trim());
                ProductColor productColor = productProperties_DAO.getProductColorByNameProductColor(cbColor.getSelectedItem().toString().trim());
                ProductSize productSize = productProperties_DAO.getProductSizeByNameProductSize(cbSize.getSelectedItem().toString().trim());
                ProductMaterial productMaterial = productProperties_DAO.getProductMaterialByNameProductMaterial(cbMaterial.getSelectedItem().toString().trim());
                String status = "";

                if (jcStopBusiness.isSelected()) {

                    status = "Ngừng kinh doanh";
                } else {
                    status = "Đang kinh doanh";
                }
                Product product = new Product(idProduct, name, costPrice, originalPrice, quantity, Product.convertStringToStatus(status), supplier, productType, productColor, productSize, productMaterial, imageProductPath);
                boolean res = product_DAO.addProduct(product);
                if (res) {
                    offInput();
                    clearInput();
                    btnAddProduct.setText("Thêm");
                    btnSaveProduct.setEnabled(false);
                    btnIMGProduct.setEnabled(false);
                    jLIMGProduct.setIcon(null);
                    loadDataProduct();
                    JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công");
                } else {
                    JOptionPane.showMessageDialog(null, "Thêm sản phẩm thất bại");
                }
            }
        } else if (flag == 2) {
            if (validatorProduct()) {
                String idProduct = jtfIDProduct.getText().trim();
                String name = jtfNameProduct.getText().trim();
                double costPrice = Double.parseDouble(jtfCostPrice.getText().trim());
                double originalPrice = Double.parseDouble(jtfPrice.getText().trim());
                int quantity = Integer.parseInt(jtfQuantity.getText().trim());
                Supplier supplier = supplier_DAO.getSupplierByNameSupplier(cbSupplier.getSelectedItem().toString().trim());
                ProductType productType = productProperties_DAO.getProductTypeByNameProductType(cbType.getSelectedItem().toString().trim());
                ProductColor productColor = productProperties_DAO.getProductColorByNameProductColor(cbColor.getSelectedItem().toString().trim());
                ProductSize productSize = productProperties_DAO.getProductSizeByNameProductSize(cbSize.getSelectedItem().toString().trim());
                ProductMaterial productMaterial = productProperties_DAO.getProductMaterialByNameProductMaterial(cbMaterial.getSelectedItem().toString().trim());
                String status = "";

                if (jcStopBusiness.isSelected()) {

                    status = "Ngừng kinh doanh";
                } else {
                    status = "Đang kinh doanh";
                }
                Product product = new Product(idProduct, name, costPrice, originalPrice, quantity, Product.convertStringToStatus(status), supplier, productType, productColor, productSize, productMaterial, imageProductPath);
                int resultTMP = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn cập nhập lại thông tin sản phẩm không ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (resultTMP == JOptionPane.YES_OPTION) {
                    boolean res = product_DAO.updateInfoProduct(product);
                    if (res) {
                        btnAddProduct.setEnabled(true);
                        btnSaveProduct.setEnabled(false);
                        btnEditProduct.setText("Cập nhập");
                        btnIMGProduct.setEnabled(false);
                        jLIMGProduct.setIcon(null);
                        jcStopBusiness.setEnabled(false);
                        jcStopBusiness.setSelected(false);
                        offInput();
                        clearInput();
                        loadDataProduct();
                        JOptionPane.showMessageDialog(null, "Cập nhập thông tin sản phẩm thành công !");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveProductActionPerformed

    private void btnIMGProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMGProductActionPerformed
        JFileChooser jFileChooser = new JFileChooser("D://");
        int result = jFileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            imageProductPath = file.getPath();
            if (imageProductPath != null) {
                Image image;
                try {
                    image = ImageIO.read(new File(imageProductPath));

                    if (image != null) {
                        // Đảm bảo kích thước hình ảnh vừa với JLabel
                        int width = jLIMGProduct.getWidth();
                        int height = jLIMGProduct.getHeight();
                        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

                        // Chuyển hình ảnh đã điều chỉnh thành biểu tượng (Icon)
                        Icon icon = new ImageIcon(scaledImage);

                        // Đặt biểu tượng cho JLabel
                        jLIMGProduct.setIcon(icon);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace(); // Handle the exception appropriately, e.g., log or display an error message
                }
            }
        }
    }//GEN-LAST:event_btnIMGProductActionPerformed

    private void cbTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTypeItemStateChanged

    }//GEN-LAST:event_cbTypeItemStateChanged

    private void jtfQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfQuantityActionPerformed

    private void jtfNameProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameProductActionPerformed

    private void jtfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPriceActionPerformed

    private void jtfIDProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDProductActionPerformed

    private void jTabbedPaneChildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneChildMouseClicked

    }//GEN-LAST:event_jTabbedPaneChildMouseClicked

    private void jTabbedPaneChildStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneChildStateChanged
        int selectedIndex = jTabbedPaneChild.getSelectedIndex();
        if (selectedIndex == 0) {
            jrbType.setSelected(true);
            loadDataProductType();
            btnStock();
        } else if (selectedIndex == 1) {
            jrbSize.setSelected(true);
            loadDataProductSize();
            btnStock();
        } else if (selectedIndex == 2) {
            jrbColor.setSelected(true);
            loadDataProductColor();
            btnStock();
        } else if (selectedIndex == 3) {
            jrbMaterial.setSelected(true);
            loadDataProductMaterial();
            btnStock();
        }
    }//GEN-LAST:event_jTabbedPaneChildStateChanged

    private void jTableProductMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductMaterialMouseClicked
        if (evt.getClickCount() == 1 && btnAdd.getText().trim().equals("Thêm mới")) {
            int selectRow = jTableProductMaterial.getSelectedRow();
            flagIDProductMaterial = Integer.parseInt(jTableProductMaterial.getValueAt(selectRow, 0).toString());
            jtfInputName.setText((String) jTableProductMaterial.getValueAt(selectRow, 1));
        }
    }//GEN-LAST:event_jTableProductMaterialMouseClicked

    private void jTableProductColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductColorMouseClicked
        if (evt.getClickCount() == 1 && btnAdd.getText().trim().equals("Thêm mới")) {
            int selectRow = jTableProductColor.getSelectedRow();
            flagIDProductColor = Integer.parseInt(jTableProductColor.getValueAt(selectRow, 0).toString());
            jtfInputName.setText((String) jTableProductColor.getValueAt(selectRow, 1));
        }
    }//GEN-LAST:event_jTableProductColorMouseClicked

    private void jTableProductSizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductSizeMouseClicked
        if (evt.getClickCount() == 1 && btnAdd.getText().trim().equals("Thêm mới")) {
            int selectRow = jTableProductSize.getSelectedRow();
            flagIDProductSize = Integer.parseInt(jTableProductSize.getValueAt(selectRow, 0).toString());
            jtfInputName.setText((String) jTableProductSize.getValueAt(selectRow, 1));
        }
    }//GEN-LAST:event_jTableProductSizeMouseClicked

    private void jTableProductTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductTypeMouseClicked
        if (evt.getClickCount() == 1 && btnAdd.getText().trim().equals("Thêm mới")) {
            int selectRow = jTableProductType.getSelectedRow();
            flagIDProductType = Integer.parseInt(jTableProductType.getValueAt(selectRow, 0).toString());
            jtfInputName.setText((String) jTableProductType.getValueAt(selectRow, 1));
        }
    }//GEN-LAST:event_jTableProductTypeMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (flagAddOrUpdate) { // nếu lưu từ chức năng thêm mới
            if (jrbType.isSelected()) { // thêm thuộc tính loại sản phẩm
                if (validator()) {
                    String name = jtfInputName.getText().trim();
                    ProductType productType = new ProductType(name);
                    boolean res = productProperties_DAO.addProductType(productType);
                    if (res) {
                        jtfInputName.setText("");
                        loadDataProductType();
                        btnSave.setEnabled(false);
                        btnAdd.setText("Thêm mới");
                        btnEdit.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Thêm thuộc tính thành công");
                    } else {
                        JOptionPane.showMessageDialog(null, "Loại sản phẩm này đã tồn tại vui lòng kiểm tra lại");
                    }
                }
            } else if (jrbSize.isSelected()) { // thêm thuộc tính kích thước
                if (validator()) {
                    String name = jtfInputName.getText().trim();
                    ProductSize productSize = new ProductSize(name);
                    boolean res = productProperties_DAO.addProductSize(productSize);
                    if (res) {
                        jtfInputName.setText("");
                        loadDataProductSize();
                        btnSave.setEnabled(false);
                        btnAdd.setText("Thêm mới");
                        btnEdit.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Thêm kích thước thành công");
                    } else {
                        JOptionPane.showMessageDialog(null, "Kích thước này đã tồn tại vui lòng kiểm tra lại");
                    }
                }
            } else if (jrbColor.isSelected()) { // thêm màu sắc mới
                if (validator()) {
                    String name = jtfInputName.getText().trim();
                    ProductColor productColor = new ProductColor(name);
                    boolean res = productProperties_DAO.addProductColor(productColor);
                    if (res) {
                        jtfInputName.setText("");
                        loadDataProductColor();
                        btnSave.setEnabled(false);
                        btnAdd.setText("Thêm mới");
                        btnEdit.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Thêm màu sắc thành công");
                    } else {
                        JOptionPane.showMessageDialog(null, "Màu sắc này đã tồn tại vui lòng kiểm tra lại");
                    }
                }
            } else if (jrbMaterial.isSelected()) { // thêm chất liệu mới
                if (validator()) {
                    String name = jtfInputName.getText().trim();
                    ProductMaterial productMaterial = new ProductMaterial(name);
                    boolean res = productProperties_DAO.addProductMaterial(productMaterial);
                    if (res) {
                        jtfInputName.setText("");
                        loadDataProductMaterial();
                        btnSave.setEnabled(false);
                        btnAdd.setText("Thêm mới");
                        btnEdit.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Thêm chất liệu thành công");
                    } else {
                        JOptionPane.showMessageDialog(null, "Chất liệu này đã tồn tại vui lòng kiểm tra lại");
                    }
                }
            }
        } else { // nếu lưu từ chức năng cập nhập
            int selectedIndex = jTabbedPaneChild.getSelectedIndex();
            if (selectedIndex == 0) {
                int selectRow = jTableProductType.getSelectedRow();
                if (selectRow == -1) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa chọn loại sản phẩm muốn cập nhập thông tin!");
                } else {
                    if (validator()) {
                        int id = flagIDProductType;
                        String nameNew = jtfInputName.getText().trim();
                        ProductType productType = new ProductType(id, nameNew);
                        boolean res = productProperties_DAO.updateProductType(productType);
                        if (res) {
                            btnEdit.setText("Sửa thuộc tính");
                            btnSave.setEnabled(false);
                            btnAdd.setEnabled(true);
                            jtfInputName.setText("");
                            jtfInputName.setEditable(false);
                            loadDataProductType();
                            JOptionPane.showMessageDialog(null, "Cập nhập thành công !");
                        } else {
                            JOptionPane.showMessageDialog(null, "Tên loại sản phẩm này không có sự khác biệt so với ban đầu hoặc đã tồn tại trong hệ thống");
                        }
                    }
                }
            } else if (selectedIndex == 1) {
                int selectRow = jTableProductSize.getSelectedRow();
                if (selectRow == -1) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa chọn loại kích thước muốn cập nhập thông tin!");
                } else {
                    if (validator()) {
                        int id = flagIDProductSize;
                        String nameNew = jtfInputName.getText().trim();
                        ProductSize productSize = new ProductSize(id, nameNew);
                        boolean res = productProperties_DAO.updateProductSize(productSize);
                        if (res) {
                            btnEdit.setText("Sửa thuộc tính");
                            btnSave.setEnabled(false);
                            btnAdd.setEnabled(true);
                            jtfInputName.setText("");
                            jtfInputName.setEditable(false);
                            loadDataProductSize();
                            JOptionPane.showMessageDialog(null, "Cập nhập thành công !");
                        } else {
                            JOptionPane.showMessageDialog(null, "Tên loại kích thước này không có sự khác biệt so với ban đầu hoặc đã tồn tại trong hệ thống");
                        }
                    }
                }
            } else if (selectedIndex == 2) {
                int selectRow = jTableProductColor.getSelectedRow();
                if (selectRow == -1) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa chọn loại màu sắc muốn cập nhập thông tin!");
                } else {
                    if (validator()) {
                        int id = flagIDProductColor;
                        String nameNew = jtfInputName.getText().trim();
                        ProductColor productColor = new ProductColor(id, nameNew);
                        boolean res = productProperties_DAO.updateProductColor(productColor);
                        if (res) {
                            btnEdit.setText("Sửa thuộc tính");
                            btnSave.setEnabled(false);
                            btnAdd.setEnabled(true);
                            jtfInputName.setText("");
                            jtfInputName.setEditable(false);
                            loadDataProductColor();
                            JOptionPane.showMessageDialog(null, "Cập nhập thành công !");
                        } else {
                            JOptionPane.showMessageDialog(null, "Tên loại màu sắc này không có sự khác biệt so với ban đầu hoặc đã tồn tại trong hệ thống");
                        }
                    }
                }
            } else if (selectedIndex == 3) {
                int selectRow = jTableProductMaterial.getSelectedRow();
                if (selectRow == -1) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa chọn loại chất liệu muốn cập nhập thông tin!");
                } else {
                    if (validator()) {
                        int id = flagIDProductMaterial;
                        String nameNew = jtfInputName.getText().trim();
                        ProductMaterial productMaterial = new ProductMaterial(id, nameNew);
                        boolean res = productProperties_DAO.updateProductMaterial(productMaterial);
                        if (res) {
                            btnEdit.setText("Sửa thuộc tính");
                            btnSave.setEnabled(false);
                            btnAdd.setEnabled(true);
                            jtfInputName.setText("");
                            jtfInputName.setEditable(false);
                            loadDataProductMaterial();
                            JOptionPane.showMessageDialog(null, "Cập nhập thành công !");
                        } else {
                            JOptionPane.showMessageDialog(null, "Tên loại chất liệu này không có sự khác biệt so với ban đầu hoặc đã tồn tại trong hệ thống");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectRow_1 = jTableProductType.getSelectedRow();
        int selectRow_2 = jTableProductMaterial.getSelectedRow();
        int selectRow_3 = jTableProductSize.getSelectedRow();
        int selectRow_4 = jTableProductColor.getSelectedRow();

        if (btnEdit.getText().trim().equals("Sửa thuộc tính")) {
            btnAdd.setEnabled(false);
            btnSave.setEnabled(true);
            jtfInputName.setEditable(true);
            btnEdit.setText("Hủy");
        } else if (btnEdit.getText().trim().equals("Hủy")) {
            btnAdd.setEnabled(true);
            btnSave.setEnabled(false);
            jtfInputName.setText("");
            jtfInputName.setEditable(false);
            btnEdit.setText("Sửa thuộc tính");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (btnAdd.getText().trim().equals("Thêm mới")) {
            btnSave.setEnabled(true);
            btnAdd.setText("Hủy");
            btnEdit.setEnabled(false);
            flagAddOrUpdate = true;
            jtfInputName.setText("");
            jtfInputName.setEditable(true);

        } else if (btnAdd.getText().trim().equals("Hủy")) {
            btnSave.setEnabled(false);
            jtfInputName.setText("");
            btnAdd.setText("Thêm mới");
            btnEdit.setEnabled(true);
            jtfInputName.setEditable(false);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jrbMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMaterialActionPerformed
        SelectedJRB();
    }//GEN-LAST:event_jrbMaterialActionPerformed

    private void jrbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSizeActionPerformed
        SelectedJRB();
    }//GEN-LAST:event_jrbSizeActionPerformed

    private void jrbColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbColorActionPerformed
        SelectedJRB();
    }//GEN-LAST:event_jrbColorActionPerformed

    private void jrbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTypeActionPerformed
        SelectedJRB();
    }//GEN-LAST:event_jrbTypeActionPerformed

    //-----------------------------------------Tab_1------------------------------
//    Selected JRB
    public void SelectedJRB() {
        if (jrbType.isSelected()) {
            jTabbedPaneChild.setSelectedIndex(0);
            btnStock();
        } else if (jrbSize.isSelected()) {
            jTabbedPaneChild.setSelectedIndex(1);
            btnStock();
        } else if (jrbColor.isSelected()) {
            jTabbedPaneChild.setSelectedIndex(2);
            btnStock();
        } else if (jrbMaterial.isSelected()) {
            jTabbedPaneChild.setSelectedIndex(3);
            btnStock();
        }
    }

//          khi chuyển tap các button quay lại trạng thái ban đầu
    private void btnStock() {
        jtfInputName.setText("");
        jtfInputName.setEditable(false);
        btnAdd.setEnabled(true);
        btnAdd.setText("Thêm mới");
        btnSave.setEnabled(false);
        btnEdit.setText("Sửa thuộc tính");
        btnEdit.setEnabled(true);
    }

//    Show ERROR
    private boolean showERROR(JTextField jtf, String mess) {
        jtf.selectAll();
        jtf.requestFocus();
        JOptionPane.showMessageDialog(null, mess);
        return false;
    }
//    Validator

    public boolean validator() {
        if (jtfInputName.getText().trim().trim().equals("")) {
            return showERROR(jtfInputName, "Vui lòng nhập tên thuộc tính !");
        }
        return true;
    }

    //-------------------------------Tap_2-------------------------------------
//    Loaddata ProductType
    public void loadDataProductType() {
        defaultTableModelProductType = (DefaultTableModel) jTableProductType.getModel();
        defaultTableModelProductType.setRowCount(0);
        for (ProductType productType : productProperties_DAO.getListProductType()) {
            String[] rowData = {productType.getIdProductType() + "", productType.getName().trim()};
            defaultTableModelProductType.addRow(rowData);
        }
    }

    //    Loaddata ProductColor
    public void loadDataProductColor() {
        defaultTableModelProductColor = (DefaultTableModel) jTableProductColor.getModel();
        defaultTableModelProductColor.setRowCount(0);
        for (ProductColor productColor : productProperties_DAO.getListProductColor()) {
            String[] rowData = {productColor.getIdColor() + "", productColor.getName().trim()};
            defaultTableModelProductColor.addRow(rowData);
        }
    }

    //    Loaddata ProductSize
    public void loadDataProductSize() {
        defaultTableModelProductSize = (DefaultTableModel) jTableProductSize.getModel();
        defaultTableModelProductSize.setRowCount(0);
        for (ProductSize productSize : productProperties_DAO.getListProductSize()) {
            String[] rowData = {productSize.getIdSize() + "", productSize.getName().trim()};
            defaultTableModelProductSize.addRow(rowData);
        }
    }

    //    Loaddata ProductMaterial
    public void loadDataProductMaterial() {
        defaultTableModelProductMaterial = (DefaultTableModel) jTableProductMaterial.getModel();
        defaultTableModelProductMaterial.setRowCount(0);
        for (ProductMaterial productMaterial : productProperties_DAO.getListProductMaterial()) {
            String[] rowData = {productMaterial.getIdMaterial() + "", productMaterial.getName().trim()};
            defaultTableModelProductMaterial.addRow(rowData);
        }
    }

//
    private void clearInput() {
        jtfIDProduct.setText("");
        jtfNameProduct.setText("");
        jtfCostPrice.setText("");
        jtfPrice.setText("");
        jtfQuantity.setText("");

        cbColor.setSelectedIndex(0);
        cbMaterial.setSelectedIndex(0);
        cbSize.setSelectedIndex(0);
        cbSupplier.setSelectedIndex(0);
        cbType.setSelectedIndex(0);
    }

    private void offInput() {
        jtfNameProduct.setEditable(false);
        jtfCostPrice.setEditable(false);
        jtfPrice.setEditable(false);
        jtfQuantity.setEditable(false);

        cbColor.setEnabled(false);
        cbMaterial.setEnabled(false);
        cbSize.setEnabled(false);
        cbSupplier.setEnabled(false);
        cbType.setEnabled(false);
    }

    private void onInput() {
        jtfNameProduct.setEditable(true);
        jtfCostPrice.setEditable(true);
        jtfPrice.setEditable(true);
        jtfQuantity.setEditable(true);

        cbColor.setEnabled(true);
        cbMaterial.setEnabled(true);
        cbSize.setEnabled(true);
        cbSupplier.setEnabled(true);
        cbType.setEnabled(true);
    }

    private boolean isNumber(String number) {
        try {
            int num = Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }

    private boolean validatorProduct() {
        if (jtfNameProduct.getText().trim().equals("")) {
            return showERROR(jtfInputName, "Tên sản phẩm không được trống !");
        }
        if (jtfCostPrice.getText().trim().equals("")) {
            return showERROR(jtfCostPrice, "Giá nhập không được trống !");
        }
        String costPrice = jtfCostPrice.getText().trim();
        if (!isNumber(costPrice)) {
            return showERROR(jtfCostPrice, "Giá nhập có kiểu dữ liệu nhập vào không phải số vui lòng kiếm tra lại");
        }
        double costPrice_1 = Double.parseDouble(jtfCostPrice.getText().trim());
        if (costPrice_1 < 1) {
            return showERROR(jtfPrice, "Giá nhập không được nhỏ hơn 1 VNĐ !");
        }
        if (jtfPrice.getText().trim().equals("")) {
            return showERROR(jtfPrice, "Giá bán không được trống !");
        }
        String price = jtfPrice.getText().trim();
        if (!isNumber(price)) {
            return showERROR(jtfPrice, "Giá bán có kiểu dữ liệu nhập vào không phải số vui lòng kiếm tra lại");
        }
        double price_1 = Double.parseDouble(jtfPrice.getText().trim());
        if (price_1 < 1) {
            return showERROR(jtfPrice, "Giá bán không được nhỏ hơn 1 VNĐ !");
        }
        if (costPrice_1 > price_1) {
            return showERROR(jtfPrice, "Giá bán không được nhỏ hơn giá nhập");
        }
        if (jtfQuantity.getText().trim().equals("")) {
            return showERROR(jtfQuantity, "Số lượng không được trống !");
        }
        String quantity = jtfQuantity.getText().trim();
        if (!isNumber(quantity)) {
            return showERROR(jtfQuantity, "Số lượng nhập vào không phải số, vui lòng kiểm tra lại !");
        }
        int quantity_1 = Integer.parseInt(jtfQuantity.getText().trim());
        if (quantity_1 < 1) {
            return showERROR(jtfQuantity, "Số lượng sản phẩm phải lớn hơn 1 !");
        }
        if (cbColor.getSelectedIndex() == 0 || cbMaterial.getSelectedIndex() == 0 || cbSize.getSelectedIndex() == 0 || cbSupplier.getSelectedIndex() == 0 || cbType.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn các thuộc tính nhà cung cấp, loại sản phẩm, màu sắc, kích thước, chất liệu của sản phẩm !");
            return false;
        }
        return true;
    }

    private void loadDataProduct() {
        defaultTableModelListProduct.setRowCount(0);
        listProduct = product_DAO.getListProduct();
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
            Object[] rowData = {idProduct, name, Utils.formatMoney(originalPrice) + "", quantity + "", suppplier, color, size, material, bool};
            defaultTableModelListProduct.addRow(rowData);
        }
    }

    private void loadDataProduct_1(List<Product> listProduct) {
        defaultTableModelListProduct.setRowCount(0);
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
            Object[] rowData = {idProduct, name, Utils.formatMoney(originalPrice) + "", quantity + "", suppplier, color, size, material, bool};
            defaultTableModelListProduct.addRow(rowData);
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

//    Thêm loại sản phẩm vào model
    private void addProductTypeToModel() {
        List<ProductType> listProductType = productProperties_DAO.getListProductType();
        for (ProductType productType : listProductType) {
            productTypeModel.addElement(productType.getName());
//            productTypeMAP.put(productType.getName(), productType.getIdProductType());
        }
    }

    //    Thêm màu sắc vào model
    private void addProductColorToModel() {
        List<ProductColor> listProductColor = productProperties_DAO.getListProductColor();
        for (ProductColor productColor : listProductColor) {
            productColorModel.addElement(productColor.getName());
//            productColorMAP.put(productColor.getName(), productColor.getIdColor());
        }
    }

    //    Thêm kích thước vào model
    private void addProductSizeToModel() {
        List<ProductSize> listProductSize = productProperties_DAO.getListProductSize();
        for (ProductSize productSize : listProductSize) {
            productSizeModel.addElement(productSize.getName());
//            productSizeMAP.put(productSize.getName(), productSize.getIdSize());
        }
    }

    //    Thêm chất liệu vào model
    private void addProductMaterialToModel() {
        List<ProductMaterial> listProductMaterial = productProperties_DAO.getListProductMaterial();
        for (ProductMaterial productMaterial : listProductMaterial) {
            productMaterialModel.addElement(productMaterial.getName());
//            productMaterialMAP.put(productMaterial.getName(), productMaterial.getIdMaterial());
        }
    }

//    Thêm Supplier vào model
    private void addSupplierToModel() {
        List<Supplier> listSupplier = supplier_DAO.getListSupplier();
        for (Supplier supplier : listSupplier) {
            supplierModel.addElement(supplier.getName());
        }
    }

//    Load dữ liệu tìm kiếm sản phẩm
    public void loadDataSearch(Product product) {
        DefaultTableModel model = (DefaultTableModel) jTableListProduct.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
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
        Object[] rowData = {idProduct, name, originalPrice + "", quantity + "", suppplier, color, size, material, bool};
        model.addRow(rowData);
    }

//    Ghi file excel
    public void writeExcel(String filePath, List<Product> productList) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Danh sách nhà cung cấp");
        // Tạo tiêu đề cho các cột
        Row headerRow = sheet.createRow(0);
        String[] headers = {"Mã sản phẩm", "Tên sản phẩm", "Đơn giá", "Số lượng", "Nhà cung cấp", "Màu sắc", "Kích thước", "Chất liệu"};

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
        for (int i = 0; i < productList.size(); i++) {
            Row row = sheet.createRow(i + 1);
            Product product = productList.get(i);

            // Thêm dữ liệu từ supplier vào từng ô cột tương ứng
            Cell idProductCell = row.createCell(0);
            idProductCell.setCellValue(product.getIdProduct());

            Cell nameCell = row.createCell(1);
            nameCell.setCellValue(product.getName());

            Cell costPriceCell = row.createCell(2);
            costPriceCell.setCellValue(product.getCostPrice());

            Cell quantityCell = row.createCell(3);
            quantityCell.setCellValue(product.getQuantity());

            Cell supplierCell = row.createCell(4);
            Supplier supplier = supplier_DAO.getSupplierByID(product.getSupplier().getIdSupplier());
            supplierCell.setCellValue(supplier.getName());

            Cell productColorCell = row.createCell(5);
            ProductColor productColor = productProperties_DAO.getProductColorByID(product.getProductColor().getIdColor() + "");
            productColorCell.setCellValue(productColor.getName());

            Cell ProductSizeCell = row.createCell(6);
            ProductSize productSize = productProperties_DAO.getProductSizeByID(product.getProductSize().getIdSize() + "");
            ProductSizeCell.setCellValue(productSize.getName());

            Cell productMaterialCell = row.createCell(7);
            ProductMaterial productMaterial = productProperties_DAO.getProductMaterialByID(product.getProductMaterial().getIdMaterial() + "");
            productMaterialCell.setCellValue(productMaterial.getName());

        }

        // Lưu workbook vào tệp Excel
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    Đọc file excel
    public List<Product> readExcel(String filePath) {
        List<Product> listProduct = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(new File(filePath)); XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream)) {
            XSSFSheet sheet = workbook.getSheetAt(0); // Sử dụng sheet đầu tiên (index 0)

            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);

                String idProduct = row.getCell(0).getStringCellValue();
                String name = row.getCell(1).getStringCellValue();
                double costPrice = row.getCell(2).getNumericCellValue();
                double originalPrice = row.getCell(3).getNumericCellValue();
                int quantity = (int) row.getCell(4).getNumericCellValue();
                String status = row.getCell(5).getStringCellValue();
                String supplier = row.getCell(6).getStringCellValue();

                String productTypeSTR = row.getCell(7).getStringCellValue();
                ProductType productType = productProperties_DAO.getProductTypeByNameProductType(productTypeSTR);
                if (productType == null) {
                    // Nếu ProductType chưa tồn tại, tạo mới
                    productType = new ProductType(productTypeSTR);
                    // Thêm ProductType mới vào cơ sở dữ liệu (nếu cần)
                    productProperties_DAO.addProductType(productType);
                }
                String productColorSTR = row.getCell(8).getStringCellValue();
                ProductColor productColor = productProperties_DAO.getProductColorByNameProductColor(productColorSTR);
                if (productColor == null) {
                    productColor = new ProductColor(productColorSTR);
                    productProperties_DAO.addProductColor(productColor);
                }
                String productSizeSTR = row.getCell(9).getStringCellValue();
                ProductSize productSize = productProperties_DAO.getProductSizeByNameProductSize(productSizeSTR);
                if (productSize == null) {
                    productSize = new ProductSize(productSizeSTR);
                    productProperties_DAO.addProductSize(productSize);
                }
                String productMaterialSTR = row.getCell(10).getStringCellValue();
                ProductMaterial productMaterial = productProperties_DAO.getProductMaterialByNameProductMaterial(productMaterialSTR);
                if (productMaterial == null) {
                    productMaterial = new ProductMaterial(productMaterialSTR);
                    productProperties_DAO.addProductMaterial(productMaterial);
                }
                String imageproductSTR = "";
                Cell cell = row.getCell(11);

                if (cell != null) {
                    imageproductSTR = cell.getStringCellValue();
                } else {
                    imageproductSTR = "";
                }
                Product product = new Product(idProduct, name, costPrice, originalPrice, quantity, Product.convertStringToStatus(status), new Supplier(supplier), productType, productColor, productSize, productMaterial, imageproductSTR);
                listProduct.add(product);
            }
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listProduct;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP1;
    private javax.swing.JPanel JP1MT_Left;
    private javax.swing.JPanel JP1MT_Right;
    private javax.swing.JPanel JP1M_Top;
    private javax.swing.JPanel JP1_Main;
    private javax.swing.JPanel JP2;
    private lib2.Button btnAdd;
    private lib2.Button btnAddProduct;
    private lib2.Button btnEdit;
    private lib2.Button btnEditProduct;
    private lib2.Button btnIMGProduct;
    private lib2.Button btnInputFile;
    private lib2.Button btnOutputFile;
    private lib2.Button btnReloadProduct;
    private lib2.Button btnSave;
    private lib2.Button btnSaveProduct;
    private lib2.Button btnSearchProductByID;
    private javax.swing.ButtonGroup buttonGroup1;
    private lib2.ComboBoxSuggestion cbColor;
    private lib2.ComboBoxSuggestion cbMaterial;
    private lib2.ComboBoxSuggestion cbSize;
    private lib2.ComboBoxSuggestion cbSupplier;
    private lib2.ComboBoxSuggestion cbType;
    private javax.swing.JLabel jLIMGProduct;
    private javax.swing.JLabel jLSearchProductByID;
    private javax.swing.JPanel jPBottom;
    private javax.swing.JPanel jPIMGProduct;
    private javax.swing.JPanel jPProductColor;
    private javax.swing.JPanel jPProductMaterial;
    private javax.swing.JPanel jPProductSize;
    private javax.swing.JPanel jPProductType;
    private javax.swing.JPanel jPTop;
    private javax.swing.JScrollPane jSPProductColor;
    private javax.swing.JScrollPane jSPProductMaterial;
    private javax.swing.JScrollPane jSPProductSize;
    private javax.swing.JScrollPane jSPProductType;
    private javax.swing.JScrollPane jSPTableListProduct;
    private javax.swing.JTabbedPane jTabbedPaneChild;
    private javax.swing.JTabbedPane jTabbedPaneMain;
    private javax.swing.JTable jTableListProduct;
    private javax.swing.JTable jTableProductColor;
    private javax.swing.JTable jTableProductMaterial;
    private javax.swing.JTable jTableProductSize;
    private javax.swing.JTable jTableProductType;
    private javax.swing.JCheckBox jcStopBusiness;
    private javax.swing.JLabel jlNote1;
    private javax.swing.JRadioButton jrbColor;
    private javax.swing.JRadioButton jrbMaterial;
    private javax.swing.JRadioButton jrbSize;
    private javax.swing.JRadioButton jrbType;
    private lib2.TextField jtfCostPrice;
    private lib2.TextField jtfIDProduct;
    private lib2.TextField jtfInputName;
    private lib2.TextField jtfNameProduct;
    private lib2.TextField jtfPrice;
    private lib2.TextField jtfQuantity;
    private javax.swing.JTextField jtfSearchProductByID;
    // End of variables declaration//GEN-END:variables
}
