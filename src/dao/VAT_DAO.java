package dao;

import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


public class VAT_DAO {

    public boolean updateVAT(double vat) {
        try {
            String sql = "UPDATE VAT SET VAT = ? WHERE id = 0";
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDouble(1, vat);

            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public double getVAT() {
        double vatValue = 0.0;
        try {
            String sql = "SELECT VAT FROM VAT WHERE id = 0";
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    vatValue = resultSet.getDouble("VAT");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vatValue;
    }

}
