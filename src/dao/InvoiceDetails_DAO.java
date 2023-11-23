package dao;

import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import entity.InvoiceDetails;
import java.util.ArrayList;
import java.util.List;
import entity.InvoiceDetails;

public class InvoiceDetails_DAO extends DAO {

    private Invoice_DAO invoice_DAO = new Invoice_DAO();
    private Product_DAO product_DAO = new Product_DAO();
//    Tạo IDInvoiceDateils

    public String createIDInvoiceDetails() {
        try {
            String sql = "SELECT TOP 1 [idInvoiceDetails] FROM [dbo].[InvoiceDetails] ORDER BY [idInvoiceDetails] DESC";
            Statement statement = ConnectDB.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String idInvoiceDetails = resultSet.getString(1).trim();
                int number = Integer.parseInt(idInvoiceDetails.substring(4)); // Bắt đầu từ vị trí 4 để lấy phần số
                number++;
                String idInvoiceDetailsNew = String.format("CTHĐ%04d", number); // Định dạng lại chuỗi

                return idInvoiceDetailsNew;
            } else {
                return "CTHĐ0001";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//    Tạo chi tiết hóa đơn
    public boolean createInvoiceDetails(InvoiceDetails invoiceDetails) {
        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "INSERT INTO InvoiceDetails (idInvoiceDetails, invoice, product, quantity, unitPrice, returnQuantity, returnReason) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, invoiceDetails.getIdInvoiceDetails());
            preparedStatement.setString(2, invoiceDetails.getInvoice().getIdInvoice());
            preparedStatement.setString(3, invoiceDetails.getProduct().getIdProduct());
            preparedStatement.setInt(4, invoiceDetails.getQuantity());
            preparedStatement.setDouble(5, invoiceDetails.getUnitPrice());
            preparedStatement.setInt(6, invoiceDetails.getReturnQuantity());
            preparedStatement.setString(7, invoiceDetails.getReturnReason());
            preparedStatement.executeUpdate();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace(); // Thay bằng log hoặc xử lý ngoại lệ một cách chính xác
        }
        return false;
    }

//    lấy danh sách ch tiết hóa đơn bằng id hóa đơn 
    public List<InvoiceDetails> getListInvoiceDetailsById(String idInvoice) {
        String sql = "SELECT * FROM invoicedetails WHERE Invoice = ?";
        List<InvoiceDetails> invoiceDetailsList = new ArrayList<>();
        try {
            Connection connection = ConnectDB.getConnection();
            if (connection != null) {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, idInvoice);
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    String idInvoiceDetail = resultSet.getString("idInvoiceDetails");
                    String idProduct = resultSet.getString("product");
                    int quantity = resultSet.getInt("quantity");
                    double unitPrice = resultSet.getDouble("unitPrice");
                    InvoiceDetails invoiceDetails = new InvoiceDetails(idInvoiceDetail, invoice_DAO.getInvoiceById(idInvoice), product_DAO.getProductByID(idProduct), quantity, unitPrice);
                    invoiceDetailsList.add(invoiceDetails);
                }
            } else {
                System.out.println("Connection is null.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return invoiceDetailsList;
    }

//    Xóa danh sách chi tiết hóa đơn 
    public boolean deleteInvoiceDetailsByInvoiceId(String idInvoice) {
        String sql = "DELETE FROM InvoiceDetails WHERE invoice = ?";
        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, idInvoice);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
