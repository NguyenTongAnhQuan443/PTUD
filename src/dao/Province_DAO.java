package dao;

import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.Province;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Province_DAO extends DAO{

    private static Province_DAO instance = new Province_DAO();

    public Province_DAO() {
    }

    public static Province_DAO getInstance() {
        return instance;
    }

//    lấy tên tất cả các tỉnh
    public List<Province> getListProvince() {
        List<Province> listProvince = new ArrayList<Province>();
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM Province";
        try {
            statement = ConnectDB.getConnection().createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Province province = new Province(resultSet.getString(1), resultSet.getString(2));
                listProvince.add(province);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(statement, resultSet);
        }
        return listProvince;
    }
    
//   Get tỉnh theo tên tỉnh
    public Province getProvinceByNameProvince(String nameProvince) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM Province WHERE province = ?";
        try {
            preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, nameProvince);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new Province(resultSet.getString(1), resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement, resultSet);
        }

        return null;
    }
//
////    get tỉnh
//    public Province getProvince(Province province) {
//        PreparedStatement preparedStatement = null;
//        ResultSet resultSet = null;
//        String sql = "SELECT * FROM Tinh WHERE id = ?";
//        try {
//            preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
//            preparedStatement.setString(1, province.getId());
//            resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                return new Province(province.getId(), resultSet.getString(2));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(preparedStatement, resultSet);
//        }
//
//        return null;
//    }

// lấy tên tỉnh theo id
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
