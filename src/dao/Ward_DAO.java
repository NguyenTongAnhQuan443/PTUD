package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ward_DAO {

    private static Ward_DAO instance = new Ward_DAO();

    public Ward_DAO() {
    }

    public static Ward_DAO getInstence() {
        return instance;
    }

    public String getWardNameByID(String id) {
        String sql = "SELECT ward FROM ward WHERE id = ?";
        String wardName = "";

        try {
            Connection connection = connectDB.ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                wardName = resultSet.getString("district");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wardName;
    }
}
