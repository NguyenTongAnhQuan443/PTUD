package dao;

import connectDB.ConnectDB;
import entity.District;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entity.Product;
import entity.ProductColor;
import entity.ProductMaterial;
import entity.ProductSize;
import entity.ProductType;
import entity.Promotion;
import entity.Supplier;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Product_DAO {
//    Thêm một product mới

    public boolean addProduct(Product product) {
        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "INSERT INTO Product (idProduct, name, costPrice, originalPrice, quantity, status, supplier, productType, color, size, material, imageProduct) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getIdProduct());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setDouble(3, product.getCostPrice());
            preparedStatement.setDouble(4, product.getOriginalPrice());
            preparedStatement.setInt(5, product.getQuantity());
            preparedStatement.setString(6, Product.convertStatusToString(product.getStatus()));
            preparedStatement.setString(7, product.getSupplier().getIdSupplier());
            preparedStatement.setInt(8, product.getProductType().getIdProductType());
            preparedStatement.setInt(9, product.getProductColor().getIdColor());
            preparedStatement.setInt(10, product.getProductSize().getIdSize());
            preparedStatement.setInt(11, product.getProductMaterial().getIdMaterial());
            preparedStatement.setString(12, product.getPathImageProduct());
            preparedStatement.execute();
            preparedStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

//    Tạo mã sản phẩm 
    public String createIDProduct() {
        try {
            String sql = "SELECT TOP 1 [idProduct] FROM [dbo].[Product] ORDER BY [idProduct] DESC";
            Statement statement = ConnectDB.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String idProduct = resultSet.getString(1).trim();
                int number = Integer.parseInt(idProduct.substring(2));
                number++;
                String idProductNew = number + "";

                while (idProductNew.length() < 4) {
                    idProductNew = "0" + idProductNew;
                }

                return "SP" + idProductNew;
            } else {
                return "SP0001";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//    Lấy toàn bộ danh sách sản phẩm
    public List<Product> getListProduct() {
        List<Product> listProduct = new ArrayList<Product>();
        String sql = "SELECT * FROM Product";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String idProduct = resultSet.getString("idProduct");
                String name = resultSet.getString("name");
                double costPrice = resultSet.getDouble("costPrice");
                double originalPrice = resultSet.getDouble("originalPrice");
                int quantity = resultSet.getInt("quantity");
                String status = resultSet.getString("status");
                String supplier = resultSet.getString("supplier");
                int productType = resultSet.getInt("productType");
                int color = resultSet.getInt("color");
                int size = resultSet.getInt("size");
                int material = resultSet.getInt("material");
                String imageProduct = resultSet.getString("imageProduct");

                Product product = new Product(idProduct, name, costPrice, originalPrice, quantity, Product.convertStringToStatus(status), new Supplier(supplier), new ProductType(productType), new ProductColor(color), new ProductSize(size), new ProductMaterial(material), imageProduct);

                listProduct.add(product);
            }
        } catch (Exception e) {
        }
        return listProduct;
    }
}
