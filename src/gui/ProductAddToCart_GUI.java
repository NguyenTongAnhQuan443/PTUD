package gui;

import entity.Product;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProductAddToCart_GUI extends javax.swing.JFrame {

    protected String idProduct;
    protected String nameProduct;
    protected String quantityProduct;
    protected String pathIMGProduct;
    protected String priceProduct;
    private Product product_1;

    public ProductAddToCart_GUI(Product product) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        jTFIDProduct.setText(product.getIdProduct());
        jTFNameProduct.setText(product.getName());
        jTFQuantityProduct.setText("1");
        double priceProduct;
        if (product.getCurrentPrice() == null || product.getCurrentPrice() == 0) {
            priceProduct = product.getOriginalPrice();
        } else {
            priceProduct = product.getCurrentPrice();
        }
        jTFPriceProduct.setText(priceProduct + "đ");
        String imgProduct = product.getPathImageProduct();

        if (imgProduct != null && !imgProduct.isEmpty()) {
            Image image;
            try {
                image = ImageIO.read(new File(imgProduct));
                int width = jLIMGProduct.getWidth();
                int height = jLIMGProduct.getHeight();
                Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                Icon icon = new ImageIcon(scaledImage);
                this.jLIMGProduct.setIcon(icon);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            this.jLIMGProduct.setIcon(null);
        }
        product_1 = product;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMain = new javax.swing.JPanel();
        jPIMGProduct = new javax.swing.JPanel();
        jLIMGProduct = new javax.swing.JLabel();
        jLIDProduct = new javax.swing.JLabel();
        jLNameProduct = new javax.swing.JLabel();
        jLQuantityProduct = new javax.swing.JLabel();
        jLPriceProduct = new javax.swing.JLabel();
        jTFIDProduct = new javax.swing.JTextField();
        jTFNameProduct = new javax.swing.JTextField();
        jTFQuantityProduct = new javax.swing.JTextField();
        jTFPriceProduct = new javax.swing.JTextField();
        btnCancel = new lib2.Button();
        btnAddProductToCart = new lib2.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thông tin sản phẩm");
        setResizable(false);

        jPMain.setBackground(new java.awt.Color(255, 255, 255));

        jPIMGProduct.setBackground(new java.awt.Color(255, 255, 255));
        jPIMGProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Ảnh sản phẩm"));

        javax.swing.GroupLayout jPIMGProductLayout = new javax.swing.GroupLayout(jPIMGProduct);
        jPIMGProduct.setLayout(jPIMGProductLayout);
        jPIMGProductLayout.setHorizontalGroup(
            jPIMGProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLIMGProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPIMGProductLayout.setVerticalGroup(
            jPIMGProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIMGProductLayout.createSequentialGroup()
                .addComponent(jLIMGProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLIDProduct.setText("Mã sản phẩm:");

        jLNameProduct.setText("Tên sản phẩm:");

        jLQuantityProduct.setText("Số lượng:");

        jLPriceProduct.setText("Đơn giá:");

        jTFIDProduct.setEditable(false);

        jTFNameProduct.setEditable(false);

        jTFQuantityProduct.setText("1");

        jTFPriceProduct.setEditable(false);

        btnCancel.setBackground(new java.awt.Color(135, 206, 235));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/x24.png"))); // NOI18N
        btnCancel.setText("Hủy");
        btnCancel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAddProductToCart.setBackground(new java.awt.Color(135, 206, 235));
        btnAddProductToCart.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProductToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add24.png"))); // NOI18N
        btnAddProductToCart.setText("Thêm sản phẩm");
        btnAddProductToCart.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAddProductToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductToCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPMainLayout = new javax.swing.GroupLayout(jPMain);
        jPMain.setLayout(jPMainLayout);
        jPMainLayout.setHorizontalGroup(
            jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMainLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPIMGProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddProductToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPMainLayout.createSequentialGroup()
                        .addGroup(jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPriceProduct)
                            .addGroup(jPMainLayout.createSequentialGroup()
                                .addGroup(jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIDProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLNameProduct)
                                    .addComponent(jLQuantityProduct))
                                .addGap(18, 18, 18)
                                .addGroup(jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFQuantityProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFIDProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFPriceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPMainLayout.setVerticalGroup(
            jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMainLayout.createSequentialGroup()
                .addGroup(jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMainLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLIDProduct)
                            .addComponent(jTFIDProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNameProduct))
                        .addGap(34, 34, 34)
                        .addGroup(jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFPriceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLPriceProduct))
                        .addGap(34, 34, 34)
                        .addGroup(jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFQuantityProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLQuantityProduct)))
                    .addGroup(jPMainLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPIMGProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProductToCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddProductToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductToCartActionPerformed
        if(validator(product_1)){
            System.out.println(product_1);
        }
    }//GEN-LAST:event_btnAddProductToCartActionPerformed
    private boolean isNumber(String number) {
        try {
            int num = Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
// Validator
    private boolean validator(Product product) {
        if (!isNumber(jTFQuantityProduct.getText().trim())) {
            return showERROR(jTFQuantityProduct, "Số lượng không hợp lệ vui lòng kiểm tra lại !");
        }
        int quanttity = Integer.parseInt(jTFQuantityProduct.getText().trim());
        if(quanttity < 1 ){
            return showERROR(jTFQuantityProduct, "Số lượng sản phẩm phải lớn hơn 1");
        }
        if(product.getQuantity() < quanttity){
            return showERROR(jTFQuantityProduct, "Số lượng sản phẩm trong kho không đủ, vui lòng kiểm tra lại !");
        }
        return true;
    }
//    Show ERROR

    private boolean showERROR(JTextField jtf, String mess) {
        jtf.selectAll();
        jtf.requestFocus();
        JOptionPane.showMessageDialog(null, mess);
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnAddProductToCart;
    private lib2.Button btnCancel;
    private javax.swing.JLabel jLIDProduct;
    private javax.swing.JLabel jLIMGProduct;
    private javax.swing.JLabel jLNameProduct;
    private javax.swing.JLabel jLPriceProduct;
    private javax.swing.JLabel jLQuantityProduct;
    private javax.swing.JPanel jPIMGProduct;
    private javax.swing.JPanel jPMain;
    private javax.swing.JTextField jTFIDProduct;
    private javax.swing.JTextField jTFNameProduct;
    private javax.swing.JTextField jTFPriceProduct;
    private javax.swing.JTextField jTFQuantityProduct;
    // End of variables declaration//GEN-END:variables
}
