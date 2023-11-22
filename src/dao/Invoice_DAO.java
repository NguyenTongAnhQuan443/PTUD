package dao;

import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entity.Invoice;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import entity.Staff;
import entity.Customer;
import entity.Promotion;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Invoice_DAO extends DAO {

    private Staff_DAO staff_DAO = new Staff_DAO();
    private Customer_DAO customer_DAO = new Customer_DAO();
    private Promotion_DAO promotion_DAO = new Promotion_DAO();

//    Tạo hóa đơn
    public boolean createInvoice(Invoice invoice) {
        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "INSERT INTO Invoice (idInvoice, staff, customer, promotion, amountReceived, changeAmount, totalAmount, dateCreated, status) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, invoice.getIdInvoice());
            preparedStatement.setString(2, invoice.getStaff().getIdStaff());
            preparedStatement.setString(3, invoice.getCustomer().getIdCustomer());
            preparedStatement.setString(4, invoice.getPromotion() != null ? invoice.getPromotion().getIdPromotion() : null);
            preparedStatement.setDouble(5, invoice.getAmountReceived());
            preparedStatement.setDouble(6, invoice.getChangeAmount());
            preparedStatement.setDouble(7, invoice.getTotalAmount());
            preparedStatement.setDate(8, java.sql.Date.valueOf(LocalDate.now()));
            preparedStatement.setString(9, Invoice.convertStatusToString(invoice.getStatus()));
            preparedStatement.executeUpdate();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace(); // Thay bằng log hoặc xử lý ngoại lệ một cách chính xác
        }
        return false;
    }

//    Tạo id hóa đơn
    public String createIDInvoice() {
        try {
            String sql = "SELECT TOP 1 [idInvoice] FROM [dbo].[Invoice] ORDER BY [idInvoice] DESC";
            Statement statement = ConnectDB.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String idProduct = resultSet.getString(1).trim();
                int number = Integer.parseInt(idProduct.substring(2));
                number++;
                String idProductNew = number + "";

                while (idProductNew.length() < 4) {
                    idProductNew = "0" + idProductNew;
                }

                return "HĐ" + idProductNew;
            } else {
                return "HĐ0001";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

// Lấy hóa đơn bằng id hóa đơn
    public Invoice getInvoiceById(String id) {
        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "SELECT * FROM Invoice WHERE idInvoice = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String idInvoice = resultSet.getString("idInvoice");

                // Kiểm tra và xử lý null cho staff, customer, và promotion
                Staff staff = resultSet.getString("staff") != null ? staff_DAO.getStaffByID(resultSet.getString("staff")) : null;
                Customer customer = resultSet.getString("customer") != null ? customer_DAO.getCustomerByID(resultSet.getString("customer")) : null;
                Promotion promotion = resultSet.getString("promotion") != null ? promotion_DAO.getPromotionByID(resultSet.getString("promotion")) : null;

                double amountReceived = resultSet.getDouble("amountReceived");
                double changeAmount = resultSet.getDouble("changeAmount");
                double totalAmount = resultSet.getDouble("totalAmount");

                java.sql.Timestamp timestamp = resultSet.getTimestamp("dateCreated");
                LocalDateTime dateCreated = null;
                if (timestamp != null) {
                    dateCreated = timestamp.toLocalDateTime();
                }

                // Kiểm tra và xử lý null cho status
                String status = resultSet.getString("status");
                Invoice invoice = new Invoice(idInvoice, staff, customer, promotion, amountReceived, changeAmount, totalAmount, dateCreated, status != null ? Invoice.convertStringToStatus(status) : null);

                return invoice;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Thay bằng log hoặc xử lý ngoại lệ một cách chính xác
        }

        return null;
    }

//    Load list data pending invoice
    public List<Invoice> getListPendingInvoice(String status) {
        List<Invoice> listPendingInvoice = new ArrayList<Invoice>();
        String sql = "select * from Invoice where status = ?";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = (Connection) ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, status);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String idInvoice = resultSet.getString("idInvoice");
                String staff = resultSet.getString("staff");
                String customer = resultSet.getString("customer");
                String promotion = resultSet.getString("promotion");
                double amountReceived = resultSet.getDouble("amountReceived");
                double changeAmount = resultSet.getDouble("changeAmount");
                double totalAmount = resultSet.getDouble("totalAmount");
                java.sql.Timestamp timestamp = resultSet.getTimestamp("dateCreated");
                LocalDateTime dateCreated = null;
                if (timestamp != null) {
                    dateCreated = timestamp.toLocalDateTime();
                }
                String status1 = resultSet.getString("status");
                Invoice invoice = new Invoice(idInvoice, staff_DAO.getStaffByID(staff), customer_DAO.getCustomerByID(customer), promotion_DAO.getPromotionByID(promotion), amountReceived, changeAmount, totalAmount, dateCreated, Invoice.convertStringToStatus(status1));
                listPendingInvoice.add(invoice);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listPendingInvoice;
    }

//    Cập nhập trạng thái hóa đơn
    public boolean updateInvoiceStatus(String idInvoice, String newStatus) {
        String sql = "UPDATE Invoice SET status = ? WHERE idInvoice = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, newStatus);
            preparedStatement.setString(2, idInvoice);
            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//    Update money pending invoice
    public boolean updateInvoiceMoney(String idInvoice, double amountReceived, double changeAmount, double totalAmount) {
        String sql = "UPDATE Invoice SET amountReceived = ?, changeAmount = ?, totalAmount = ? WHERE idInvoice = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setDouble(1, amountReceived);
            preparedStatement.setDouble(2, changeAmount);
            preparedStatement.setDouble(3, totalAmount);
            preparedStatement.setString(4, idInvoice);

            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
//    Load list data invoice

    public List<Invoice> getListInvoice() {
        List<Invoice> listPendingInvoice = new ArrayList<Invoice>();
        String sql = "select * from Invoice";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = (Connection) ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String idInvoice = resultSet.getString("idInvoice");
                String staff = resultSet.getString("staff");
                String customer = resultSet.getString("customer");
                String promotion = resultSet.getString("promotion");
                double amountReceived = resultSet.getDouble("amountReceived");
                double changeAmount = resultSet.getDouble("changeAmount");
                double totalAmount = resultSet.getDouble("totalAmount");
                java.sql.Timestamp timestamp = resultSet.getTimestamp("dateCreated");
                LocalDateTime dateCreated = null;
                if (timestamp != null) {
                    dateCreated = timestamp.toLocalDateTime();
                }
                String status1 = resultSet.getString("status");
                Invoice invoice = new Invoice(idInvoice, staff_DAO.getStaffByID(staff), customer_DAO.getCustomerByID(customer), promotion_DAO.getPromotionByID(promotion), amountReceived, changeAmount, totalAmount, dateCreated, Invoice.convertStringToStatus(status1));
                listPendingInvoice.add(invoice);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listPendingInvoice;
    }
}
