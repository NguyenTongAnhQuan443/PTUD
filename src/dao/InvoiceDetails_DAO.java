package dao;

import connectDB.ConnectDB;
import entity.Invoice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import entity.InvoiceDetails;

public class InvoiceDetails_DAO extends DAO {

//    Tạo IDInvoiceDateils
    public String createIDInvoiceDetails() {
        try {
            String sql = "SELECT TOP 1 [idInvoiceDetails] FROM [dbo].[InvoiceDetails] ORDER BY [idInvoiceDetails] DESC";
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

                return "CTHĐ" + idProductNew;
            } else {
                return "CTHĐ0001";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
//    Tạo chi tiết hóa đơn

    public boolean createInvoice(InvoiceDetails invoiceDetails) {
        Connection connection = null;
        PreparedStatement invoiceStatement = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectDB.getConnection();
            connection.setAutoCommit(false);

            String invoiceSql = "INSERT INTO InvoiceDetails (idInvoiceDetails, invoice, product, unitPrice, returnQuantity, returnReason) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            invoiceStatement = connection.prepareStatement(invoiceSql);
            invoiceStatement.setString(1, invoiceDetails.getIdInvoiceDetails());
            invoiceStatement.setString(2, invoiceDetails.getInvoice().getIdInvoice());
            invoiceStatement.setString(3, invoiceDetails.getProduct().getIdProduct());
            invoiceStatement.setDouble(4, invoiceDetails.getUnitPrice());
            invoiceStatement.setInt(5, invoiceDetails.getReturnQuantity());
            invoiceStatement.setString(6, invoiceDetails.getReturnReasonl());
            invoiceStatement.executeUpdate();
            preparedStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
