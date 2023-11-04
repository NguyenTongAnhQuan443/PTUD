package dao;

import connectDB.ConnectDB;
import entity.Customer;
import entity.District;
import entity.Province;
import entity.Ward;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Customer_DAO {

    public Customer_DAO() {
    }

    // Lấy toàn bộ khách hàng
    public List<Customer> getListCustomers() {
        List<Customer> listCustomers = new ArrayList<Customer>();
        String sql = "SELECT * FROM Customer";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String idCustomer = resultSet.getString("idCustomer");
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String province = resultSet.getString("province");
                String district = resultSet.getString("district");
                String ward = resultSet.getString("ward");
                String address = resultSet.getString("address");
                int rewardPoints = resultSet.getInt("rewardPoints");
                String typeRank = resultSet.getString("typeRank");
                double totalAmount6months = resultSet.getDouble("totalAmount6months");
                boolean receivePromotions = resultSet.getBoolean("receivePromotions");
                Customer customer = new Customer(idCustomer, name, phone, email, new Province(province), new District(district), new Ward(ward), address, rewardPoints, Customer.convertStringToTypeRank(typeRank), totalAmount6months, receivePromotions);
                listCustomers.add(customer);
            }
        } catch (Exception e) {
        }
        return listCustomers;
    }

//    Thêm 1 khách hàng mới 
    public boolean addCustomer(Customer customer) {
        try {
            java.sql.Connection connection = ConnectDB.getConnection();
            String sql = "INSERT INTO Customer (idCustomer, name, phone, email, province, district, ward, address, rewardPoints, typeRank, totalAmount6months, receivePromotions) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customer.getIdCustomer());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getPhone());
            preparedStatement.setString(4, customer.getEmail());
            preparedStatement.setString(5, customer.getProvince().getId());
            preparedStatement.setString(6, customer.getDistrict().getId());
            preparedStatement.setString(7, customer.getWard().getId());
            preparedStatement.setString(8, customer.getAddress());
            preparedStatement.setInt(9, customer.getRewardPoints());
            preparedStatement.setString(10, Customer.convertTypeRankToString(customer.getTypeRank()));
            preparedStatement.setDouble(11, customer.getTotalAmount6months());
            preparedStatement.setBoolean(12, customer.isReceivePromotions());
            preparedStatement.execute();
            preparedStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

//    Tạo mã khánh hàng
    public String createIDCustomer() {
        try {
            String sql = "SELECT TOP 1 [idCustomer] FROM [dbo].[Customer] ORDER BY [idCustomer] DESC";
            Statement statement = ConnectDB.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String idSupplier = resultSet.getString(1).trim();
                int number = Integer.parseInt(idSupplier.substring(3));
                number++;
                if (number < 10000) {
                    String idSupplierNew = String.format("KH%04d", number);
                    return idSupplierNew;
                }
            }
            return "KH0001";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //    Cập nhập thông tin khách hàng
    public boolean updateInfoCustomer(Customer customer) {
        String sql = "UPDATE Customer SET name = ?, phone = ?, email = ?, province = ?, district = ?, ward = ?, address = ?, receivePromotions = ? WHERE idCustomer = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getPhone());
            preparedStatement.setString(3, customer.getEmail());
            preparedStatement.setString(4, customer.getProvince().getId());
            preparedStatement.setString(5, customer.getDistrict().getId());
            preparedStatement.setString(6, customer.getWard().getId());
            preparedStatement.setString(7, customer.getAddress());
            preparedStatement.setBoolean(8, customer.isReceivePromotions());

            preparedStatement.setString(9, customer.getIdCustomer());
            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //    lấy khách hàng bằng mã khách hàng
    public Customer getCustomerByID(String idCustomer) {
        String sql = "SELECT * FROM Customer WHERE idCustomer = ?";

        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, idCustomer);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String province = resultSet.getString("province");
                String district = resultSet.getString("district");
                String ward = resultSet.getString("ward");
                String address = resultSet.getString("address");
                int rewardPoints = resultSet.getInt("rewardPoints");
                String typeRank = resultSet.getString("typeRank");
                double totalAmount6months = resultSet.getDouble("totalAmount6months");
                boolean receivePromotions = resultSet.getBoolean("receivePromotions");
                Customer customer = new Customer(idCustomer, name, phone, email, new Province(province), new District(district), new Ward(ward), address, rewardPoints, Customer.convertStringToTypeRank(typeRank), totalAmount6months, receivePromotions);
                return customer;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //    lọc khách hàng theo phone
    public Customer getCustomerByPhone(String phoneSearch) {
        String sql = "SELECT * FROM Customer WHERE phone = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, phoneSearch);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String idCustomer = resultSet.getString("idCustomer");
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String province = resultSet.getString("province");
                String district = resultSet.getString("district");
                String ward = resultSet.getString("ward");
                String address = resultSet.getString("address");
                int rewardPoints = resultSet.getInt("rewardPoints");
                String typeRank = resultSet.getString("typeRank");
                double totalAmount6months = resultSet.getDouble("totalAmount6months");
                boolean receivePromotions = resultSet.getBoolean("receivePromotions");
                Customer customer = new Customer(idCustomer, name, phone, email, new Province(province), new District(district), new Ward(ward), address, rewardPoints, Customer.convertStringToTypeRank(typeRank), totalAmount6months, receivePromotions);

                return customer;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // kiểm tả số điện thoại tồn tại
    public boolean checkPhoneExist(String phoneCheck) {
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection()
                    .prepareStatement("SELECT * FROM [dbo].[Customer] WHERE [phone] = ?");
            preparedStatement.setString(1, phoneCheck);

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    //    kiểm tra Email tồn tại
    public boolean checkEmailExist(String emailCheck) {
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection()
                    .prepareStatement("SELECT * FROM [dbo].[Customer] WHERE [email] = ?");
            preparedStatement.setString(1, emailCheck);

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

//    lấy danh sách khách hàng tiềm năng (Khách hàng nhận thông tin khuyến mãi)
     public List<Customer> getListPotentialCustomers() {
        List<Customer> listCustomers = new ArrayList<Customer>();
        String sql = "SELECT * FROM Customer WHERE totalAmount6months >= 5000000 ORDER BY totalAmount6months DESC;";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String idCustomer = resultSet.getString("idCustomer");
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String province = resultSet.getString("province");
                String district = resultSet.getString("district");
                String ward = resultSet.getString("ward");
                String address = resultSet.getString("address");
                int rewardPoints = resultSet.getInt("rewardPoints");
                String typeRank = resultSet.getString("typeRank");
                double totalAmount6months = resultSet.getDouble("totalAmount6months");
                boolean receivePromotions = resultSet.getBoolean("receivePromotions");
                Customer customer = new Customer(idCustomer, name, phone, email, new Province(province), new District(district), new Ward(ward), address, rewardPoints, Customer.convertStringToTypeRank(typeRank), totalAmount6months, receivePromotions);
                listCustomers.add(customer);
            }
        } catch (Exception e) {
        }
        return listCustomers;
    }
}
