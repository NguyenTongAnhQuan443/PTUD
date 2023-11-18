package dao;

import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import entity.InvoiceDetails;

public class InvoiceDetails_DAO extends DAO {

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
}
