package dao;

import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.ProductType;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entity.ProductColor;
import entity.ProductMaterial;
import entity.ProductSize;

public class ProductProperties_DAO {
//    LOẠI SẢN PHẨM

//  Lấy toàn bộ productType
    public List<ProductType> getListProductType() {
        List<ProductType> listProductType = new ArrayList<ProductType>();
        String sql = "SELECT * FROM ProductType ORDER BY idProductType ASC";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idProductType = resultSet.getInt("idProductType");
                String name = resultSet.getString("name");
                ProductType productType = new ProductType(idProductType, name);
                listProductType.add(productType);
            }
        } catch (Exception e) {
        }
        return listProductType;
    }

//    Thêm 1 loại sản phẩm mới
    public boolean addProductType(ProductType productType) {
        try {
            java.sql.Connection connection = ConnectDB.getConnection();
            if (!isProductTypeExists(connection, productType)) {
                String sql = "INSERT ProductType VALUES (?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, productType.getName());
                preparedStatement.execute();
                preparedStatement.close();
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

//    Kiểm tra sự tồn tại thuộc tính đó trong hệ thống
    private boolean isProductTypeExists(Connection connection, ProductType productType) throws SQLException {
        String query = "SELECT COUNT(*) FROM ProductType WHERE name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, productType.getName());
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        preparedStatement.close();
        return count > 0;
    }

//     Sửa thông tin loại sản phẩm
    public boolean updateProductType(ProductType productType) {

        try {
            if (!isProductTypeExists(ConnectDB.getConnection(), productType)) {
                String sql = "Update ProductType SET name = ? WHERE idProductType = ?";
                PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
                preparedStatement.setString(1, productType.getName());
                preparedStatement.setInt(2, productType.getIdProductType());
                return preparedStatement.executeUpdate() > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//    MÀU SẮC
//  Lấy toàn bộ ProductColor
    public List<ProductColor> getListProductColor() {
        List<ProductColor> listProductColor = new ArrayList<ProductColor>();
        String sql = "SELECT * FROM ProductColor ORDER BY idColor ASC";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idColor = resultSet.getInt("idColor");
                String name = resultSet.getString("name");
                ProductColor productColor = new ProductColor(idColor, name);
                listProductColor.add(productColor);
            }
        } catch (Exception e) {
        }
        return listProductColor;
    }

//    Thêm 1 màu sắc mới
    public boolean addProductColor(ProductColor productColor) {
        try {
            java.sql.Connection connection = ConnectDB.getConnection();
            if (!isProductColorExists(connection, productColor)) {
                String sql = "INSERT ProductColor VALUES (?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, productColor.getName());
                preparedStatement.execute();
                preparedStatement.close();
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //    Kiểm tra sự tồn tại thuộc tính đó trong hệ thống
    private boolean isProductColorExists(Connection connection, ProductColor productColor) throws SQLException {
        String query = "SELECT COUNT(*) FROM ProductColor WHERE name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, productColor.getName());
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        preparedStatement.close();
        return count > 0;
    }

//     Sửa thông tin loại sản phẩm
    public boolean updateProductColor(ProductColor productColor) {

        try {
            if (!isProductColorExists(ConnectDB.getConnection(), productColor)) {
                String sql = "Update ProductColor SET name = ? WHERE idColor = ?";
                PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
                preparedStatement.setString(1, productColor.getName());
                preparedStatement.setInt(2, productColor.getIdColor());
                return preparedStatement.executeUpdate() > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//    KÍCH THƯỚC
    //  Lấy toàn bộ ProductSize
    public List<ProductSize> getListProductSize() {
        List<ProductSize> listProductSize = new ArrayList<ProductSize>();
        String sql = "SELECT * FROM ProductSize ORDER BY idSize ASC";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idSize = resultSet.getInt("idSize");
                String name = resultSet.getString("name");
                ProductSize productSize = new ProductSize(idSize, name);
                listProductSize.add(productSize);
            }
        } catch (Exception e) {
        }
        return listProductSize;
    }

//    Thêm 1 kích thước mới
    public boolean addProductSize(ProductSize productSize) {
        try {
            java.sql.Connection connection = ConnectDB.getConnection();
            if (!isProductSizeExists(connection, productSize)) {
                String sql = "INSERT ProductSize VALUES (?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, productSize.getName());
                preparedStatement.execute();
                preparedStatement.close();
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //    Kiểm tra sự tồn tại thuộc tính đó trong hệ thống
    private boolean isProductSizeExists(Connection connection, ProductSize productSize) throws SQLException {
        String query = "SELECT COUNT(*) FROM ProductSize WHERE name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, productSize.getName());
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        preparedStatement.close();
        return count > 0;
    }

//     Sửa thông tin kích thước
    public boolean updateProductSize(ProductSize productSize) {
        try {
            if (!isProductSizeExists(ConnectDB.getConnection(), productSize)) {
                String sql = "Update ProductSize SET name = ? WHERE idSize = ?";
                PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
                preparedStatement.setString(1, productSize.getName());
                preparedStatement.setInt(2, productSize.getIdSize());
                return preparedStatement.executeUpdate() > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//    CHẤT LIỆU
    //  Lấy toàn bộ ProductMaterial
    public List<ProductMaterial> getListProductMaterial() {
        List<ProductMaterial> listProductMaterial = new ArrayList<ProductMaterial>();
        String sql = "SELECT * FROM ProductMaterial ORDER BY idMaterial ASC";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idMaterial = resultSet.getInt("idMaterial");
                String name = resultSet.getString("name");
                ProductMaterial productMaterial = new ProductMaterial(idMaterial, name);
                listProductMaterial.add(productMaterial);
            }
        } catch (Exception e) {
        }
        return listProductMaterial;
    }

//    Thêm 1 chất liệu mới
    public boolean addProductMaterial(ProductMaterial productMaterial) {
        try {
            java.sql.Connection connection = ConnectDB.getConnection();
            if (!isProductMaterialExists(connection, productMaterial)) {
                String sql = "INSERT ProductMaterial VALUES (?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, productMaterial.getName());
                preparedStatement.execute();
                preparedStatement.close();
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //    Kiểm tra sự tồn tại thuộc tính đó trong hệ thống
    private boolean isProductMaterialExists(Connection connection, ProductMaterial productMaterial) throws SQLException {
        String query = "SELECT COUNT(*) FROM ProductMaterial WHERE name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, productMaterial.getName());
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        preparedStatement.close();
        return count > 0;
    }

//     Sửa thông tin chất liệu
    public boolean updateProductMaterial(ProductMaterial productMaterial) {

        try {
            if (!isProductMaterialExists(ConnectDB.getConnection(), productMaterial)) {
                String sql = "Update ProductMaterial SET name = ? WHERE idMaterial = ?";
                PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
                preparedStatement.setString(1, productMaterial.getName());
                preparedStatement.setInt(2, productMaterial.getIdMaterial());
                return preparedStatement.executeUpdate() > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
