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

public class ProductProperties_DAO extends DAO {
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

//    Lấy name producType bằng ID
    public String getProductNameById(int id) {
        String productName = null;

        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "SELECT name FROM ProductType WHERE idProductType = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                productName = resultSet.getString("name");
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return productName;
    }

//    lấy ProductType bằng tên productType
    public ProductType getProductTypeByNameProductType(String nameProductType) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM ProductType WHERE name = ?";
        try {
            preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, nameProductType);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new ProductType(resultSet.getInt(1), resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement, resultSet);
        }

        return null;
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

//    Lấy ProductColor bằng tên ProductColor
    public ProductColor getProductColorByNameProductColor(String nameProductColor) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM ProductColor WHERE name = ?";
        try {
            preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, nameProductColor);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                ProductColor productColor = new ProductColor(resultSet.getInt(1), resultSet.getString(2));
                return productColor;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement, resultSet);
        }

        return null;
    }

//    Lấy product Color = ID (dùng load id màu thành thên màu)
    public ProductColor getProductColorByID(String idColor) {
        String sql = "SELECT * FROM ProductColor WHERE idColor = ?";

        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, idColor);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                ProductColor productColor = new ProductColor(id, name);
                return productColor;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
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

    //    Lấy ProductSize bằng tên ProductSize
    public ProductSize getProductSizeByNameProductSize(String nameProductSize) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM ProductSize WHERE name = ?";
        try {
            preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, nameProductSize);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new ProductSize(resultSet.getInt(1), resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement, resultSet);
        }
        return null;
    }

//    Lấy ProductSize = id
    public ProductSize getProductSizeByID(String idSize) {
        String sql = "SELECT * FROM ProductSize WHERE idSize = ?";

        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, idSize);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                ProductSize productSize = new ProductSize(id, name);
                return productSize;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
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

//    Lấy ProductMaterial bằng tên Material
    public ProductMaterial getProductMaterialByNameProductMaterial(String nameProductMaterial) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM ProductMaterial WHERE name = ?";
        try {
            preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, nameProductMaterial);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new ProductMaterial(resultSet.getInt(1), resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement, resultSet);
        }
        return null;
    }

//    Lấy ProductMaterial = ID
    public ProductMaterial getProductMaterialByID(String idMaterial) {
        String sql = "SELECT * FROM ProductMaterial WHERE idMaterial = ?";

        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, idMaterial);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                ProductMaterial productMaterial = new ProductMaterial(id, name);
                return productMaterial;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
