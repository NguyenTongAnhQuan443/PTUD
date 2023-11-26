package dao;

import entity.*;
import connectDB.ConnectDB;
import dao.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Product_Statistics_DAO {

//    sum quantity product
    public int calculateTotalQuantity() {
        int totalQuantity = 0;
        String sql = "SELECT SUM(quantity) AS totalQuantity FROM Product";
        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                totalQuantity = resultSet.getInt("totalQuantity");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return totalQuantity;
    }

//    sum number of products sold today
    public int calculateTotalSalesToday() {
        int totalSales = 0;

        String sql = "SELECT SUM(InvoiceDetails.quantity) AS TotalQuantitySold "
                + "FROM Invoice "
                + "JOIN InvoiceDetails ON Invoice.idInvoice = InvoiceDetails.invoice "
                + "WHERE CONVERT(DATE, Invoice.dateCreated) = CONVERT(DATE, GETDATE())";
        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                totalSales = resultSet.getInt("TotalQuantitySold");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return totalSales;
    }

    //    sum number of products sold month
    public int calculateTotalSalesThisMonth() {
        int totalSales = 0;

        String sql = "SELECT SUM(InvoiceDetails.quantity) AS TotalQuantitySold "
                + "FROM Invoice "
                + "JOIN InvoiceDetails ON Invoice.idInvoice = InvoiceDetails.invoice "
                + "WHERE MONTH(Invoice.dateCreated) = MONTH(GETDATE()) "
                + "AND YEAR(Invoice.dateCreated) = YEAR(GETDATE())";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                totalSales = resultSet.getInt("TotalQuantitySold");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return totalSales;
    }

    //    sum number of products sold year
    public int calculateTotalSalesThisYear() {
        int totalSales = 0;

        String sql = "SELECT SUM(InvoiceDetails.quantity) AS TotalQuantitySold "
                + "FROM Invoice "
                + "JOIN InvoiceDetails ON Invoice.idInvoice = InvoiceDetails.invoice "
                + "WHERE YEAR(Invoice.dateCreated) = YEAR(GETDATE())";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                totalSales = resultSet.getInt("TotalQuantitySold");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return totalSales;
    }

//    get top 10 low stock products
    public List<Product> getLowStockProducts() {
        List<Product> listLowStockProducts = new ArrayList<>();
        String sql = "SELECT TOP 10 "
                + "P.idProduct, "
                + "P.name, "
                + "P.costPrice, "
                + "P.originalPrice, "
                + "P.quantity, "
                + "P.status, "
                + "P.supplier, "
                + "P.productType, "
                + "P.color, "
                + "P.size, "
                + "P.material, "
                + "P.imageProduct, "
                + "SUM(ID.quantity) AS TotalQuantitySold "
                + "FROM Product P "
                + "LEFT JOIN InvoiceDetails ID ON P.idProduct = ID.product "
                + "GROUP BY P.idProduct, P.name, P.costPrice, P.originalPrice, P.quantity, P.status, P.supplier, P.productType, P.color, P.size, P.material, P.imageProduct "
                + "ORDER BY P.quantity ASC";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

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
                int totalQuantitySold = resultSet.getInt("TotalQuantitySold");

                Product product = new Product(idProduct, name, costPrice, originalPrice, quantity, Product.convertStringToStatus(status), new Supplier(supplier), new ProductType(productType), new ProductColor(color), new ProductSize(size), new ProductMaterial(material), imageProduct, totalQuantitySold);
                listLowStockProducts.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listLowStockProducts;
    }

//    get top 10 high stock products
    public List<Product> getHighStockProducts() {
        List<Product> listHighStockProducts = new ArrayList<>();
        String sql = "SELECT TOP 10 "
                + "P.idProduct, "
                + "P.name, "
                + "P.costPrice, "
                + "P.originalPrice, "
                + "P.quantity, "
                + "P.status, "
                + "P.supplier, "
                + "P.productType, "
                + "P.color, "
                + "P.size, "
                + "P.material, "
                + "P.imageProduct, "
                + "SUM(ID.quantity) AS TotalQuantitySold "
                + "FROM Product P "
                + "LEFT JOIN InvoiceDetails ID ON P.idProduct = ID.product "
                + "GROUP BY P.idProduct, P.name, P.costPrice, P.originalPrice, P.quantity, P.status, P.supplier, P.productType, P.color, P.size, P.material, P.imageProduct "
                + "ORDER BY P.quantity DESC";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

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
                int totalQuantitySold = resultSet.getInt("TotalQuantitySold");

                Product product = new Product(idProduct, name, costPrice, originalPrice, quantity, Product.convertStringToStatus(status), new Supplier(supplier), new ProductType(productType), new ProductColor(color), new ProductSize(size), new ProductMaterial(material), imageProduct, totalQuantitySold);
                listHighStockProducts.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listHighStockProducts;
    }

//    Top 10 best seller
    public List<Product> getTop10SellingProducts() {
        List<Product> topSellingProducts = new ArrayList<>();
        String sql = "SELECT TOP 10 "
                + "Product.idProduct, "
                + "Product.name, "
                + "Product.costPrice, "
                + "Product.originalPrice, "
                + "Product.quantity, "
                + "Product.status, "
                + "Product.supplier, "
                + "Product.productType, "
                + "Product.color, "
                + "Product.size, "
                + "Product.material, "
                + "Product.imageProduct, "
                + "SUM(InvoiceDetails.quantity) AS TotalQuantitySold "
                + "FROM InvoiceDetails "
                + "JOIN Product ON InvoiceDetails.product = Product.idProduct "
                + "GROUP BY Product.idProduct, Product.name, Product.costPrice, Product.originalPrice, Product.quantity, Product.status, Product.supplier, Product.productType, Product.color, Product.size, Product.material, Product.imageProduct "
                + "ORDER BY TotalQuantitySold DESC";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

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

                int totalQuantitySold = resultSet.getInt("TotalQuantitySold");

                Product product = new Product(idProduct, name, costPrice, originalPrice, quantity, Product.convertStringToStatus(status), new Supplier(supplier), new ProductType(productType), new ProductColor(color), new ProductSize(size), new ProductMaterial(material), imageProduct, totalQuantitySold);
                topSellingProducts.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return topSellingProducts;
    }

//    Top 10 low selling
    public List<Product> getTop10LowestSellingProducts() {
        List<Product> listTop10lowestSellingProducts = new ArrayList<>();
        String sql = "SELECT TOP 10 "
                + "Product.idProduct, "
                + "Product.name, "
                + "Product.costPrice, "
                + "Product.originalPrice, "
                + "Product.quantity, "
                + "Product.status, "
                + "Product.supplier, "
                + "Product.productType, "
                + "Product.color, "
                + "Product.size, "
                + "Product.material, "
                + "Product.imageProduct, "
                + "SUM(InvoiceDetails.quantity) AS TotalQuantitySold "
                + "FROM InvoiceDetails "
                + "JOIN Product ON InvoiceDetails.product = Product.idProduct "
                + "GROUP BY Product.idProduct, Product.name, Product.costPrice, Product.originalPrice, Product.quantity, Product.status, Product.supplier, Product.productType, Product.color, Product.size, Product.material, Product.imageProduct "
                + "ORDER BY TotalQuantitySold ASC";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

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

                int totalQuantitySold = resultSet.getInt("TotalQuantitySold");

                Product product = new Product(idProduct, name, costPrice, originalPrice, quantity, Product.convertStringToStatus(status), new Supplier(supplier), new ProductType(productType), new ProductColor(color), new ProductSize(size), new ProductMaterial(material), imageProduct, totalQuantitySold);
                listTop10lowestSellingProducts.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listTop10lowestSellingProducts;
    }
}
