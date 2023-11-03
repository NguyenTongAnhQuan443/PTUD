package dao;

import java.sql.Connection;
import connectDB.ConnectDB;
import entity.Supplier;
import connectDB.ConnectDB; //
import entity.District;
import entity.Province;
import java.sql.PreparedStatement;//
import java.sql.ResultSet; //
import java.sql.Statement; //
import java.sql.SQLException;
import entity.Supplier;
import entity.Ward;
import java.util.ArrayList;
import java.util.List;

public class Supplier_DAO extends DAO {

    public Supplier_DAO() {
    }

//    Thêm 1 nhà cung cấp mới
    public boolean addSupplier(Supplier supplier) {
        try {
            java.sql.Connection connection = ConnectDB.getConnection();
            String sql = "INSERT Supplier VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, supplier.getIdSupplier());
            preparedStatement.setString(2, supplier.getName());
            preparedStatement.setString(3, supplier.getEmail());
            preparedStatement.setString(4, supplier.getPhone());
            preparedStatement.setString(5, Supplier.convertStatusToString(supplier.getStatus()));
            preparedStatement.setString(6, supplier.getProvince().getId());
            preparedStatement.setString(7, supplier.getDistrict().getId());
            preparedStatement.setString(8, supplier.getWard().getId());
            preparedStatement.setString(9, supplier.getAddress());

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

    // Lấy toàn bộ nhân viên
    public List<Supplier> getListSupplier() {
        List<Supplier> listSupplier = new ArrayList<Supplier>();
        String sql = "SELECT * FROM Supplier";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String idSupplier = resultSet.getString("idSupplier");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String status = resultSet.getString("status");
                String province = resultSet.getString("province");
                String district = resultSet.getString("district");
                String ward = resultSet.getString("ward");
                String address = resultSet.getString("address");
                Supplier supplier = new Supplier(idSupplier, name, email, phone, Supplier.convertStringToStatus(status), new Province(province), new District(district), new Ward(ward), address);
                listSupplier.add(supplier);
            }
        } catch (Exception e) {
        }
        return listSupplier;
    }

    //    kiểm tra số Email tồn tại
    public boolean checkEmailExist(String emailCheck) {
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection()
                    .prepareStatement("SELECT * FROM [dbo].[Supplier] WHERE [email] = ?");
            preparedStatement.setString(1, emailCheck);

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // kiểm tả số điện thoại tồn tại
    public boolean checkPhoneExist(String phoneCheck) {
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection()
                    .prepareStatement("SELECT * FROM [dbo].[Supplier] WHERE [phone] = ?");
            preparedStatement.setString(1, phoneCheck);

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //    lấy nhà cung cấp bằng mã nahf cung cấp
    public Supplier getSupplierByID(String idSupplier) {
        String sql = "SELECT * FROM Supplier WHERE idSupplier = ?";

        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, idSupplier);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String status = resultSet.getString("status");
                String province = resultSet.getString("province");
                String district = resultSet.getString("district");
                String ward = resultSet.getString("ward");
                String address = resultSet.getString("address");
                Supplier supplier = new Supplier(idSupplier.trim(), name, email, phone, Supplier.convertStringToStatus(status), new Province(province), new District(district), new Ward(ward), address);
                return supplier;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //    Cập nhập thông tin nhà cung cấp
    public boolean updateInfoSupplier(Supplier supplier) {
        String sql = "Update Supplier SET name = ?, email = ?, phone = ?, status = ?, province = ?, district = ?, ward = ?, address = ? WHERE idSupplier = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, supplier.getName());
            preparedStatement.setString(2, supplier.getEmail());
            preparedStatement.setString(3, supplier.getPhone());
            preparedStatement.setString(4, Supplier.convertStatusToString(supplier.getStatus()));
            preparedStatement.setString(5, supplier.getProvince().getId());
            preparedStatement.setString(6, supplier.getDistrict().getId());
            preparedStatement.setString(7, supplier.getWard().getId());
            preparedStatement.setString(8, supplier.getAddress());

            preparedStatement.setString(9, supplier.getIdSupplier());
            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//    lọc supplier theo phone hoặc email
    public Supplier getSupplierByPhoneOrEmail(String phoneOrEmail) {
        String sql = "SELECT * FROM Supplier WHERE phone = ? OR email = ?";

        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, phoneOrEmail);
            preparedStatement.setString(2, phoneOrEmail);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String idSupplier = resultSet.getString("idSupplier");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String status = resultSet.getString("status");
                String province = resultSet.getString("province");
                String district = resultSet.getString("district");
                String ward = resultSet.getString("ward");
                String address = resultSet.getString("address");
                Supplier supplier = new Supplier(idSupplier, name, email, phone, Supplier.convertStringToStatus(status), new Province(province), new District(district), new Ward(ward), address);
                return supplier;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //    lấy danh sách nhà cung cấp theo trạng thái làm việc
    public List<Supplier> getListSupplierByStatus(String sqlStatus) {
        List<Supplier> listSupplier = new ArrayList<Supplier>();
        String sql = sqlStatus;
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = (Connection) ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String idSupplier = resultSet.getString("idSupplier");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String status = resultSet.getString("status");
                String province = resultSet.getString("province");
                String district = resultSet.getString("district");
                String ward = resultSet.getString("ward");
                String address = resultSet.getString("address");
                Supplier supplier = new Supplier(idSupplier, name, email, phone, Supplier.convertStringToStatus(status), new Province(province), new District(district), new Ward(ward), address);
                listSupplier.add(supplier);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSupplier;
    }

    // thêm vào một danh sách nhà cung cấp (dùng cho hàm import file excel)
    public boolean addSupplierList(List<Supplier> supplierList) {
        if (supplierList == null || supplierList.isEmpty()) {
            return false; // Không thể thêm nếu danh sách trống hoặc null.
        }

        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "INSERT INTO Supplier VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            for (Supplier supplier : supplierList) {
                preparedStatement.setString(1, supplier.getIdSupplier());
                preparedStatement.setString(2, supplier.getName());
                preparedStatement.setString(3, supplier.getEmail());
                preparedStatement.setString(4, supplier.getPhone());
                preparedStatement.setString(5, supplier.convertStatusToString(supplier.getStatus()));

                preparedStatement.setString(6, supplier.getProvince().getId());
                preparedStatement.setString(7, supplier.getDistrict().getId());
                preparedStatement.setString(8, supplier.getWard().getId());
                preparedStatement.setString(9, supplier.getAddress());

                preparedStatement.addBatch();
            }

            preparedStatement.executeBatch();
            preparedStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
