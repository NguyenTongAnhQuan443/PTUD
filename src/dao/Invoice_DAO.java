package dao;

import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import entity.Invoice;
import entity.InvoiceDetails;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

public class Invoice_DAO extends DAO {

//    Tạo hóa đơn
//    public boolean createInvoice(Invoice invoice) {
//        try (Connection connection = ConnectDB.getConnection(); PreparedStatement invoiceStatement = connection.prepareStatement(
//                "INSERT INTO Invoice (idInvoice, staff, customer, promotion, amountReceived, changeAmount, totalAmount, dateCreated, status) "
//                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
//
//            connection.setAutoCommit(false);
//
//            invoiceStatement.setString(1, invoice.getIdInvoice());
//            invoiceStatement.setString(2, invoice.getStaff().getIdStaff());
//            invoiceStatement.setString(3, invoice.getCustomer().getIdCustomer());
//            invoiceStatement.setString(4, invoice.getPromotion() != null ? invoice.getPromotion().getIdPromotion() : null);
//            invoiceStatement.setDouble(5, invoice.getAmountReceived());
//            invoiceStatement.setDouble(6, invoice.getChangeAmount());
//            invoiceStatement.setDouble(7, invoice.getTotalAmount());
//            invoiceStatement.setDate(8, java.sql.Date.valueOf(LocalDate.now()));
//            invoiceStatement.setString(9, Invoice.convertStatusToString(invoice.getStatus()));
//            invoiceStatement.executeUpdate();
//
//            connection.commit();
//            return true;
//        } catch (SQLException ex) {
//            ex.printStackTrace(); // Thay bằng log hoặc xử lý ngoại lệ một cách chính xác
//        }
//        return false;
//    }
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
}
