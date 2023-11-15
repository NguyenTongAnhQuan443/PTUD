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

    public boolean createInvoice(Invoice invoice) {
        Connection connection = null;
        PreparedStatement invoiceStatement = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectDB.getConnection();
            connection.setAutoCommit(false);

            String invoiceSql = "INSERT INTO Invoice (idInvoice, staff, customer, promotion, amountReceived, changeAmount, totalAmount, dateCreated, status) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            invoiceStatement = connection.prepareStatement(invoiceSql);
            invoiceStatement.setString(1, invoice.getIdInvoice());
            invoiceStatement.setString(2, invoice.getStaff().getIdStaff());
            invoiceStatement.setString(3, invoice.getCustomer().getIdCustomer());
            invoiceStatement.setString(4, invoice.getPromotion().getIdPromotion());
            invoiceStatement.setDouble(5, invoice.getAmountReceived());
            invoiceStatement.setDouble(6, invoice.getChangeAmount());
            invoiceStatement.setDouble(7, invoice.getTotalAmount());
            invoiceStatement.setDate(8, java.sql.Date.valueOf(LocalDate.now()));
            invoiceStatement.setString(9, Invoice.convertStatusToString(invoice.getStatus()));
            invoiceStatement.executeUpdate();
            preparedStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
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
