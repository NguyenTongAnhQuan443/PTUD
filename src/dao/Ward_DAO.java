package dao;

import connectDB.ConnectDB;
import entity.District;
import entity.Ward;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ward_DAO extends DAO{

    private static Ward_DAO instance = new Ward_DAO();

    public Ward_DAO() {
    }

    public static Ward_DAO getInstence() {
        return instance;
    }

//	lấy danh sách phường theo quận
    public List<Ward> getListWard(District district) {
        List<Ward> listWard = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM Ward WHERE district = ?";
        try {
            preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, district.getId());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listWard.add(new Ward(resultSet.getString(1), resultSet.getString(2), district));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement, resultSet);
        }
        return listWard;
    }
//
////    get phường theo id của phường và theo địa chỉ tỉnh
//    public Ward getWard(District district, Ward ward) {
//        PreparedStatement preparedStatement = null;
//        ResultSet resultSet = null;
//        String sql = "SELECT * FROM Ward WHERE id = ? and district = ?";
//        try {
//            preparedStatement = ConnectDB.getConnection()
//                    .prepareStatement(sql);
//            preparedStatement.setString(1, ward.getId());
//            preparedStatement.setString(2, district.getId());
//            resultSet = preparedStatement.executeQuery();
//
//            if (resultSet.next()) {
//                return new Ward(ward.getId(), resultSet.getString(2), district);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//           close(preparedStatement, resultSet);
//        }
//
//        return null;
//    }

//	 Get phường theo quận, tên phường
    public Ward getWardByNameWard(District district, String nameWard) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM Ward WHERE ward = ? and district = ?";
        try {
            preparedStatement = ConnectDB.getConnection()
                    .prepareStatement(sql);
            preparedStatement.setString(1, nameWard);
            preparedStatement.setString(2, district.getId());
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new Ward(resultSet.getString(1), resultSet.getString(2), district);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement, resultSet);
        }
        return null;
    }

// lấy phường theo id
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
