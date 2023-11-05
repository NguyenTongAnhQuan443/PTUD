package gui;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import lib2.TableCustom;
import entity.ProductType;
import entity.ProductColor;
import entity.ProductMaterial;
import entity.ProductSize;
import dao.ProductProperties_DAO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Product_GUI extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModelProductColor;
    private DefaultTableModel defaultTableModelProductMaterial;
    private DefaultTableModel defaultTableModelProductSize;
    private DefaultTableModel defaultTableModelProductType;

    private ProductProperties_DAO productProperties_DAO = new ProductProperties_DAO();

    private boolean flagAddOrUpdate;
    private int flagIDProductColor;
    private int flagIDProductSize;
    private int flagIDProductType;
    private int flagIDProductMaterial;

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
        JP3 = new javax.swing.JPanel();

        buttonGroup1.add(jrbColor);
        buttonGroup1.add(jrbMaterial);
        buttonGroup1.add(jrbSize);
        buttonGroup1.add(jrbType);
        jrbType.setSelected(true);

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPaneMain.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPaneMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
                .addContainerGap(171, Short.MAX_VALUE))
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
            .addComponent(jSPProductType, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE)
        );
        jPProductTypeLayout.setVerticalGroup(
            jPProductTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPProductType, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
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
            .addComponent(jSPProductSize, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE)
        );
        jPProductSizeLayout.setVerticalGroup(
            jPProductSizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPProductSize, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
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
            .addComponent(jSPProductColor, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE)
        );
        jPProductColorLayout.setVerticalGroup(
            jPProductColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPProductColor, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
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
            .addComponent(jSPProductMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE)
        );
        jPProductMaterialLayout.setVerticalGroup(
            jPProductMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPProductMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
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

        javax.swing.GroupLayout JP2Layout = new javax.swing.GroupLayout(JP2);
        JP2.setLayout(JP2Layout);
        JP2Layout.setHorizontalGroup(
            JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1096, Short.MAX_VALUE)
        );
        JP2Layout.setVerticalGroup(
            JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        jTabbedPaneMain.addTab("Danh sách sản phẩm", JP2);

        javax.swing.GroupLayout JP3Layout = new javax.swing.GroupLayout(JP3);
        JP3.setLayout(JP3Layout);
        JP3Layout.setHorizontalGroup(
            JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1096, Short.MAX_VALUE)
        );
        JP3Layout.setVerticalGroup(
            JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        jTabbedPaneMain.addTab("Lọc sản phẩm", JP3);

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

    private void jrbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTypeActionPerformed
        SelectedJRB();
    }//GEN-LAST:event_jrbTypeActionPerformed

    private void jrbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSizeActionPerformed
        SelectedJRB();
    }//GEN-LAST:event_jrbSizeActionPerformed

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
                        JOptionPane.showMessageDialog(null, "Thêm thuộc tính thất bại vui lòng kiểm tra lại");
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
                        JOptionPane.showMessageDialog(null, "Thêm kích thước thất bại vui lòng kiểm tra lại");
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
                        JOptionPane.showMessageDialog(null, "Thêm màu sắc thất bại vui lòng kiểm tra lại");
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
                        JOptionPane.showMessageDialog(null, "Thêm chất liệu thất bại vui lòng kiểm tra lại");
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
                            JOptionPane.showMessageDialog(null, "Cập nhập thất bại !");
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
                            JOptionPane.showMessageDialog(null, "Cập nhập thất bại !");
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
                            JOptionPane.showMessageDialog(null, "Cập nhập thất bại !");
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
                            JOptionPane.showMessageDialog(null, "Cập nhập thất bại !");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jrbColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbColorActionPerformed
        SelectedJRB();
    }//GEN-LAST:event_jrbColorActionPerformed

    private void jrbMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMaterialActionPerformed
        SelectedJRB();
    }//GEN-LAST:event_jrbMaterialActionPerformed

    private void jTabbedPaneChildStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneChildStateChanged
        int selectedIndex = jTabbedPaneChild.getSelectedIndex();
        if (selectedIndex == 0) {
            jrbType.setSelected(true);
            loadDataProductType();
        } else if (selectedIndex == 1) {
            jrbSize.setSelected(true);
            loadDataProductSize();
        } else if (selectedIndex == 2) {
            jrbColor.setSelected(true);
            loadDataProductColor();
        } else if (selectedIndex == 3) {
            jrbMaterial.setSelected(true);
            loadDataProductMaterial();
        }
    }//GEN-LAST:event_jTabbedPaneChildStateChanged

    private void jTableProductSizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductSizeMouseClicked
        if (evt.getClickCount() == 1 && btnAdd.getText().trim().equals("Thêm mới")) {
            int selectRow = jTableProductSize.getSelectedRow();
            flagIDProductSize = Integer.parseInt(jTableProductSize.getValueAt(selectRow, 0).toString());
            jtfInputName.setText((String) jTableProductSize.getValueAt(selectRow, 1));
        }
    }//GEN-LAST:event_jTableProductSizeMouseClicked

    private void jTableProductColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductColorMouseClicked
        if (evt.getClickCount() == 1 && btnAdd.getText().trim().equals("Thêm mới")) {
            int selectRow = jTableProductColor.getSelectedRow();
            flagIDProductColor = Integer.parseInt(jTableProductColor.getValueAt(selectRow, 0).toString());
            jtfInputName.setText((String) jTableProductColor.getValueAt(selectRow, 1));
        }
    }//GEN-LAST:event_jTableProductColorMouseClicked

    private void jTabbedPaneChildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneChildMouseClicked

    }//GEN-LAST:event_jTabbedPaneChildMouseClicked

    private void jTableProductMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductMaterialMouseClicked
        if (evt.getClickCount() == 1 && btnAdd.getText().trim().equals("Thêm mới")) {
            int selectRow = jTableProductMaterial.getSelectedRow();
            flagIDProductMaterial = Integer.parseInt(jTableProductMaterial.getValueAt(selectRow, 0).toString());
            jtfInputName.setText((String) jTableProductMaterial.getValueAt(selectRow, 1));
        }
    }//GEN-LAST:event_jTableProductMaterialMouseClicked

//    Selected JRB
    public void SelectedJRB() {
        if (jrbType.isSelected()) {
            jTabbedPaneChild.setSelectedIndex(0);
        } else if (jrbSize.isSelected()) {
            jTabbedPaneChild.setSelectedIndex(1);
        } else if (jrbColor.isSelected()) {
            jTabbedPaneChild.setSelectedIndex(2);
        } else if (jrbMaterial.isSelected()) {
            jTabbedPaneChild.setSelectedIndex(3);
        }
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP1;
    private javax.swing.JPanel JP1MT_Left;
    private javax.swing.JPanel JP1MT_Right;
    private javax.swing.JPanel JP1M_Top;
    private javax.swing.JPanel JP1_Main;
    private javax.swing.JPanel JP2;
    private javax.swing.JPanel JP3;
    private lib2.Button btnAdd;
    private lib2.Button btnEdit;
    private lib2.Button btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPProductColor;
    private javax.swing.JPanel jPProductMaterial;
    private javax.swing.JPanel jPProductSize;
    private javax.swing.JPanel jPProductType;
    private javax.swing.JScrollPane jSPProductColor;
    private javax.swing.JScrollPane jSPProductMaterial;
    private javax.swing.JScrollPane jSPProductSize;
    private javax.swing.JScrollPane jSPProductType;
    private javax.swing.JTabbedPane jTabbedPaneChild;
    private javax.swing.JTabbedPane jTabbedPaneMain;
    private javax.swing.JTable jTableProductColor;
    private javax.swing.JTable jTableProductMaterial;
    private javax.swing.JTable jTableProductSize;
    private javax.swing.JTable jTableProductType;
    private javax.swing.JLabel jlNote1;
    private javax.swing.JRadioButton jrbColor;
    private javax.swing.JRadioButton jrbMaterial;
    private javax.swing.JRadioButton jrbSize;
    private javax.swing.JRadioButton jrbType;
    private lib2.TextField jtfInputName;
    // End of variables declaration//GEN-END:variables
}
