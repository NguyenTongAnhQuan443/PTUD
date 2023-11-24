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

public class Revenue_Statistics_DAO {

//    count total invoice
//    public int countInvoicesForDateRange(String startDate, String endDate) throws SQLException {
//        int numberOfInvoices = 0;
//        String sql = "SELECT COUNT(*) AS NumberOfInvoices FROM Invoice WHERE dateCreated >= ? AND dateCreated < ?";
//        try {
//            Connection connection = ConnectDB.getInstance().getConnection();
//            if (connection != null) {
//                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//                    preparedStatement.setString(1, startDate);
//                    preparedStatement.setString(2, endDate);
//
//                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                        if (resultSet.next()) {
//                            numberOfInvoices = resultSet.getInt("NumberOfInvoices");
//                        }
//                    }
//                }
//            } else {
//                System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
//            }
//        } catch (SQLException e) {
//            throw e;
//        }
//
//        return numberOfInvoices;
//    }

}
