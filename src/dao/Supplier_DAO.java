package dao;

import com.sun.jdi.connect.spi.Connection;
import connectDB.ConnectDB;
import entity.Supplier;
import connectDB.ConnectDB; //
import java.sql.PreparedStatement;//
import java.sql.ResultSet; //
import java.sql.Statement; //
import java.sql.SQLException;
import entity.Supplier;

public class Supplier_DAO extends DAO {

    public Supplier_DAO() {
    }

//    Thêm 1 nhà cung cấp mới
    public boolean addSupplier(Supplier supplier) {
        try {
            java.sql.Connection connection = ConnectDB.getConnection();
            String sql = "INSERT Supplier VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, supplier.getIdSupplier());
            preparedStatement.setString(2, supplier.getName());
            preparedStatement.setString(3, supplier.getEmail());
            preparedStatement.setString(4, Supplier.convertStatusToString(supplier.getStatus()));
            preparedStatement.execute();
            preparedStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

//    Tạo mã nhà cung cấp
    public String createIDSupplier() {
        try {
            String sql = "SELECT TOP 1 [idSupplier] FROM [dbo].[Supplier] ORDER BY [idSupplier] DESC";
            Statement statement = ConnectDB.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String idSupplier = resultSet.getString(1).trim();
                int number = Integer.parseInt(idSupplier.substring(3));
                number++;
                if (number < 10000) {
                    String idSupplierNew = String.format("NCC%04d", number);
                    return idSupplierNew;
                }
            }
            return "NCC0001";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
