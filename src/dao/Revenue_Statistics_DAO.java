package dao;

import connectDB.ConnectDB;
import entity.Revenue_Statistics;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Revenue_Statistics_DAO {

//    count number invoice today
    public int countInvoicesCreatedToday() {
        int count = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String currentDate = LocalDateTime.now().format(formatter);

        String sql = "SELECT COUNT(*) AS invoiceCount FROM Invoice WHERE CONVERT(date, dateCreated) = ?";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, currentDate);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                count = resultSet.getInt("invoiceCount");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

//    get revenue today
    public double calculateRevenueToday() {
        double revenue = 0.0;

        // Tạo định dạng cho ngày hiện tại
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String currentDate = LocalDateTime.now().format(formatter);

        String sql = "SELECT SUM(totalAmount) AS totalRevenue FROM Invoice WHERE CONVERT(date, dateCreated) = ?";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, currentDate);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                revenue = resultSet.getDouble("totalRevenue");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return revenue;
    }

//   get revenue this month
    public double calculateRevenueThisMonth() {
        double revenue = 0.0;

        // Tạo định dạng cho tháng và năm hiện tại
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
        String currentMonth = LocalDateTime.now().format(formatter);

        String sql = "SELECT SUM(totalAmount) AS totalRevenue FROM Invoice WHERE CONVERT(varchar(7), dateCreated, 120) = ?";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, currentMonth);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                revenue = resultSet.getDouble("totalRevenue");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return revenue;
    }

//    get total revenue this year
    public double calculateRevenueThisYear() {
        double revenue = 0.0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        String currentYear = LocalDateTime.now().format(formatter);

        String sql = "SELECT SUM(totalAmount) AS totalRevenue FROM Invoice WHERE YEAR(dateCreated) = ?";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, currentYear);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                revenue = resultSet.getDouble("totalRevenue");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return revenue;
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

//    get list revenue month (1-12)
    public List<Revenue_Statistics> getListRevenueMonth(int year) {
        List<Revenue_Statistics> list = new ArrayList<>();
        String sql = "SELECT "
                + "Months.Month, "
                + "COALESCE(SUM(id.quantity * id.unitPrice), 0) AS TotalSales, "
                + "COALESCE(SUM(id.quantity * p.costPrice), 0) AS TotalCost, "
                + "COALESCE(SUM(id.quantity * id.unitPrice) - SUM(id.quantity * p.costPrice), 0) AS Revenue "
                + "FROM ( "
                + "    SELECT 1 AS Month "
                + "    UNION SELECT 2 "
                + "    UNION SELECT 3 "
                + "    UNION SELECT 4 "
                + "    UNION SELECT 5 "
                + "    UNION SELECT 6 "
                + "    UNION SELECT 7 "
                + "    UNION SELECT 8 "
                + "    UNION SELECT 9 "
                + "    UNION SELECT 10 "
                + "    UNION SELECT 11 "
                + "    UNION SELECT 12 "
                + ") Months "
                + "LEFT JOIN Invoice i ON Months.Month = MONTH(i.dateCreated) AND YEAR(i.dateCreated) = ? "
                + "LEFT JOIN InvoiceDetails id ON i.idInvoice = id.invoice "
                + "LEFT JOIN Product p ON id.product = p.idProduct "
                + "GROUP BY Months.Month "
                + "ORDER BY Months.Month";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, year);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int month = resultSet.getInt("Month");
                double totalSales = resultSet.getDouble("TotalSales");
                double totalCost = resultSet.getDouble("TotalCost");
                double revenue = resultSet.getDouble("Revenue");

                Revenue_Statistics revenue_Statistics = new Revenue_Statistics(month, totalSales, totalCost, revenue);
                list.add(revenue_Statistics);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

}
