package dao;

import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Province_DAO {

    private static Province_DAO instance = new Province_DAO();

    public Province_DAO() {
    }

    public static Province_DAO getInstence() {
        return instance;
    }

    public String getProvinceNameByID(String id) {
        String sql = "SELECT province FROM province where id = ?";
        String provinceName = "";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                provinceName = resultSet.getString("province");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return provinceName;
    }
}
