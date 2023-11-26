package dao;

import connectDB.ConnectDB;
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
}
