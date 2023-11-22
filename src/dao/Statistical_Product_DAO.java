package dao;

import connectDB.ConnectDB;
import entity.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Statistical_Product_DAO {

    private Product_DAO product_DAO = new Product_DAO();

    private String productId;
    private String productName;
    private int totalSoldQuantity;
//get set constructor 

    public Product_DAO getProduct_DAO() {
        return product_DAO;
    }

    public void setProduct_DAO(Product_DAO product_DAO) {
        this.product_DAO = product_DAO;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getTotalSoldQuantity() {
        return totalSoldQuantity;
    }

    public void setTotalSoldQuantity(int totalSoldQuantity) {
        this.totalSoldQuantity = totalSoldQuantity;
    }

    public Statistical_Product_DAO() {
    }

    public Statistical_Product_DAO(String productId) {
        this.productId = productId;
    }

    public Statistical_Product_DAO(String productId, String productName, int totalSoldQuantity) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.totalSoldQuantity = totalSoldQuantity;
    }
//    

    public List<Statistical_Product_DAO> getTopSellingProducts() {
        List<Statistical_Product_DAO> topSellingProducts = new ArrayList<>();
        String sql = "SELECT TOP 10 product AS ProductID, "
                + "              p.productName AS ProductName, "
                + "              SUM(quantity) AS TotalSoldQuantity "
                + "FROM InvoiceDetails id "
                + "JOIN Product p ON id.product = p.idProduct "
                + "GROUP BY product, p.productName "
                + "ORDER BY TotalSoldQuantity DESC";

        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Statistical_Product_DAO productReport = new Statistical_Product_DAO();
                productReport.setProductId(resultSet.getString("ProductID"));
                productReport.setProductName(resultSet.getString("ProductName"));
                productReport.setTotalSoldQuantity(resultSet.getInt("TotalSoldQuantity"));
                topSellingProducts.add(productReport);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return topSellingProducts;
    }
}
