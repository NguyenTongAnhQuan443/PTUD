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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.Supplier;

public class Product_DAO {
//    Thêm một product mới

    public boolean addProduct(Product product) {
        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "INSERT INTO Product (idProduct, name, costPrice, originalPrice, quantity, status, supplier, productType, color, size, material, imageProduct) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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

//    Lấy danh sách sản phẩm đang kinh doanh => dùng cho hiển thị danh sách sản phẩm trogn khuyến mãi
    public List<Product> getListProductAreTrading() {
        List<Product> listProduct = new ArrayList<Product>();
        String sql = "SELECT * FROM Product WHERE status = N'Đang kinh doanh'";

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
                double currentPrice = resultSet.getDouble("currentPrice");
                int quantity = resultSet.getInt("quantity");
                String status = resultSet.getString("status");
                String supplier = resultSet.getString("supplier");
                int productType = resultSet.getInt("productType");
                int color = resultSet.getInt("color");
                int size = resultSet.getInt("size");
                int material = resultSet.getInt("material");
                String imageProduct = resultSet.getString("imageProduct");

                Product product = new Product(idProduct, name, costPrice, originalPrice, currentPrice, quantity, Product.convertStringToStatus(status), new Supplier(supplier), new ProductType(productType), new ProductColor(color), new ProductSize(size), new ProductMaterial(material), imageProduct);

                listProduct.add(product);
            }
        } catch (Exception e) {
        }
        return listProduct;
    }

//    Lấy danh sách sản phẩm thông qua id productType và status là đang kinh doanh
    public List<Product> getListProductByProductTypeAndStatus(int productType) {
        List<Product> listProduct = new ArrayList<>();
        String sql = "SELECT * FROM Product WHERE productType = ? AND status = N'Đang kinh doanh'";

        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, productType);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String idProduct = resultSet.getString("idProduct");
                String name = resultSet.getString("name");
                double costPrice = resultSet.getDouble("costPrice");
                double originalPrice = resultSet.getDouble("originalPrice");
                int quantity = resultSet.getInt("quantity");
                String status = resultSet.getString("status");
                String supplier = resultSet.getString("supplier");
                int color = resultSet.getInt("color");
                int size = resultSet.getInt("size");
                int material = resultSet.getInt("material");
                String imageProduct = resultSet.getString("imageProduct");

                Product product = new Product(idProduct, name, costPrice, originalPrice, quantity, Product.convertStringToStatus(status), new Supplier(supplier), new ProductType(productType), new ProductColor(color), new ProductSize(size), new ProductMaterial(material), imageProduct);

                listProduct.add(product);
            }
        } catch (Exception e) {
            // Xử lý ngoại lệ nếu cần
            e.printStackTrace();
        }
        return listProduct;
    }

    public boolean updateInfoProduct(Product product) {
        String sql = "UPDATE Product SET name = ?, costPrice = ?, originalPrice = ?, quantity = ?, status = ?, supplier = ?, productType = ?, color = ?, size = ?, material = ?, imageProduct = ? WHERE idProduct = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getCostPrice());
            preparedStatement.setDouble(3, product.getOriginalPrice());
            preparedStatement.setInt(4, product.getQuantity());
            preparedStatement.setString(5, Product.convertStatusToString(product.getStatus()));
            preparedStatement.setString(6, product.getSupplier().getIdSupplier());

            preparedStatement.setInt(7, product.getProductType().getIdProductType());
            preparedStatement.setInt(8, product.getProductColor().getIdColor());
            preparedStatement.setInt(9, product.getProductSize().getIdSize());
            preparedStatement.setInt(10, product.getProductMaterial().getIdMaterial());
            preparedStatement.setString(11, product.getPathImageProduct());

            preparedStatement.setString(12, product.getIdProduct());
            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//    Lấy product thông qua id
    public Product getProductByID(String id) {
        String sql = "select * from Product where idProduct = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
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
                return product;
            }
        } catch (Exception e) {
        }
        return null;
    }

//    Thêm danh sách sản phẩm
    public boolean addProductList(List<Product> productList) {
        if (productList == null || productList.isEmpty()) {
            return false; // Không thể thêm nếu danh sách trống hoặc null.
        }

        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "INSERT INTO Product (idProduct, name, costPrice, originalPrice, quantity, status, supplier, productType, color, size, material, imageProduct) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            for (Product product : productList) {
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

                preparedStatement.addBatch();
            }

            preparedStatement.executeBatch();
            preparedStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

//    Lấy sản phẩm đang nằm trong chương trình khuyến mãi theo % bằng ID sản phẩm trả về mã KM
    public String getPromotionIDForProduct(String productID) {
        String promotionID = null;
        try {
            Connection connection = ConnectDB.getConnection();
            // Thực hiện truy vấn để lấy mã chương trình khuyến mãi cho sản phẩm
            String sql = "SELECT P.idPromotion "
                    + "FROM Promotion P "
                    + "JOIN ProductPromotion PP ON P.idPromotion = PP.idPromotion "
                    + "JOIN Product PD ON PP.idProduct = PD.idProduct "
                    + "WHERE PD.idProduct = ? AND P.typePromotion = 'KM theo %' AND PD.currentPrice IS NOT NULL AND PD.currentPrice > 0";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, productID);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    promotionID = resultSet.getString("idPromotion");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return promotionID;
    }

//    Lấy danh sách sản phẩm của khuyến mãi nào đó
    public List<String> getListIDProductInPromotion(String idPromotionSearch) {
        List<String> listIDProduct = new ArrayList<>();
        String sql = "select * from ProductPromotion where idPromotion = ?";

        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, idPromotionSearch);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String idProduct = resultSet.getString("idProduct");
                listIDProduct.add(idProduct);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listIDProduct;
    }

}
