package dao;

import connectDB.ConnectDB;
import entity.District;
import entity.Province;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import dao.DAO;


public class District_DAO extends DAO{
    private static District_DAO instance = new District_DAO();

    public District_DAO() {
    }

    public static District_DAO getInstence() {
        return instance;
    }

//  Get danh sách quận theo tỉnh
    public List<District> getListDistrict(Province province){
        List<District> listDistrict = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM District WHERE province = ?";
        try {
            preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, province.getId());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listDistrict.add(new District(resultSet.getString(1), resultSet.getString(2), province));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement, resultSet);
        }

        return listDistrict;
    }
//
////    get quận bằng tỉnh + quận
//    public District getDistrict(Province province, District district) {
//        PreparedStatement preparedStatement = null;
//        ResultSet resultSet = null;
//        String sql = "SELECT * FROM District WHERE id = ? and province = ?";
//        try {
//            preparedStatement = ConnectDB.getConnection()
//                    .prepareStatement(sql);
//            preparedStatement.setString(1, district.getId());
//            preparedStatement.setString(2, province.getId());
//            resultSet = preparedStatement.executeQuery();
//
//            if (resultSet.next()) {
//                return new District(province.getId(), resultSet.getString(2), province);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(preparedStatement, resultSet);
//        }
//
//        return null;
//    }
//
//  Get quận theo tỉnh + tên quận
    public District getDistrictByNameDistrict(Province province, String nameDistrict) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM District WHERE district = ? and province = ?";
        try {
            preparedStatement = ConnectDB.getConnection()
                    .prepareStatement(sql);
            preparedStatement.setString(1, nameDistrict);
            preparedStatement.setString(2, province.getId());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new District(resultSet.getString(1), resultSet.getString(2), province);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement, resultSet);
        }

        return null;
    }

// get quận bằng id quận
    public String getDistrictNameByID(String id) {
        String sql = "SELECT district FROM district WHERE id = ?";
        String districtName = "";

        try {
            Connection connection = connectDB.ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                districtName = resultSet.getString("district");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return districtName;
    }
}
