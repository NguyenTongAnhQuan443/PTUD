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

public class Customer_Statistics_DAO {
// get number customer

    public int calculateTotalCustomer() {
        int totalQuantity = 0;
        String sql = "SELECT COUNT(*) AS TotalCount FROM Customer";
        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                totalQuantity = resultSet.getInt("TotalCount");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalQuantity;
    }
    
//    get number customer this year
    public int calculateTotalCustomerThisYear() {
//        int totalQuantity = 0;
//        String sql = "SELECT COUNT(*) AS TotalCount FROM Customer";
//        try {
//            Connection connection = ConnectDB.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                totalQuantity = resultSet.getInt("TotalCount");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return totalQuantity;
    }
//    get All Invoice Years

    public List<Integer> getAllInvoiceYears() {
        List<Integer> years = new ArrayList<>();
        String sql = "SELECT DISTINCT YEAR(dateCreated) AS InvoiceYear FROM Invoice";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int year = resultSet.getInt("InvoiceYear");
                years.add(year);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return years;
    }

//    get number customers, number products sold, and revenue
    public List<Customer_Statistics> getListCustomer_Statistics(int year) {
        List<Customer_Statistics> listCustomer_Statistics = new ArrayList<>();
        String sql = "WITH AllMonths AS ("
                + "    SELECT MonthNumber FROM (VALUES (1), (2), (3), (4), (5), (6), (7), (8), (9), (10), (11), (12)) AS Months(MonthNumber)"
                + "),"
                + "MonthlySales AS ("
                + "    SELECT"
                + "        MONTH(i.dateCreated) AS MonthNumber,"
                + "        COUNT(DISTINCT i.customer) AS CustomerCount,"
                + "        SUM(i.amountReceived) AS TotalRevenue,"
                + "        SUM(id.quantity) AS TotalQuantitySold"
                + "    FROM InvoiceDetails id"
                + "    RIGHT JOIN Invoice i ON id.invoice = i.idInvoice"
                + "    WHERE (i.status = N'Đã thanh toán' OR i.status IS NULL) AND YEAR(i.dateCreated) = ?"
                + "    GROUP BY YEAR(i.dateCreated), MONTH(i.dateCreated)"
                + ")"
                + "SELECT"
                + "    am.MonthNumber,"
                + "    COALESCE(m.CustomerCount, 0) AS CustomerCount,"
                + "    COALESCE(m.TotalQuantitySold, 0) AS TotalQuantitySold,"
                + "    COALESCE(m.TotalRevenue, 0) AS TotalRevenue"
                + " FROM AllMonths am"
                + " LEFT JOIN MonthlySales m ON am.MonthNumber = m.MonthNumber"
                + " ORDER BY am.MonthNumber";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, year);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int monthNumber = resultSet.getInt("MonthNumber");
                int customerCount = resultSet.getInt("CustomerCount");
                int totalQuantitySold = resultSet.getInt("TotalQuantitySold");
                double totalRevenue = resultSet.getDouble("TotalRevenue");

                Customer_Statistics customer_Statistics = new Customer_Statistics(monthNumber, customerCount, totalQuantitySold, totalRevenue);
                listCustomer_Statistics.add(customer_Statistics);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listCustomer_Statistics;
    }
    /*
        1) DECLARE @Year INT = 2023; nhận vào giá trị năm muốn selected

        2) WITH AllMonths AS (...): Sử dụng CTE (Common Table Expression) để tạo một bảng tạm thời chứa các tháng từ 1 đến 12.

        3) MonthlySales AS (...): Sử dụng CTE tính toán số liệu hàng tháng từ bảng InvoiceDetails và Invoice.
            + COUNT(DISTINCT i.customer): Đếm số lượng khách hàng mỗi tháng.
            + SUM(i.amountReceived): Tổng doanh thu mỗi tháng.
            + SUM(id.quantity): Tổng số lượng sản phẩm bán được trong mỗi tháng.
    
        4) SELECT ... FROM AllMonths: LEFT JOIN kết hợp dữ liệu từ AllMonths và MonthlySales dựa trên cột MonthNumber.
            + COALESCE(m.CustomerCount, 0): Nếu không có dữ liệu tương ứng trong MonthlySales, giá trị trả về là 0.
            + ORDER BY am.MonthNumber : Sắp xếp kết quả theo thứ tự tăng dần của MonthNumber.
     */
}
