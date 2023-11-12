package dao;

import entity.Promotion;
import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Promotion_DAO extends DAO {

//    Tạo mã khuyễn mãi
    public String createIDPromotion() {
        try {
            String sql = "SELECT TOP 1 [idPromotion] FROM [dbo].[Promotion] ORDER BY [idPromotion] DESC";
            Statement statement = ConnectDB.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String idPromotion = resultSet.getString(1).trim();
                int number = Integer.parseInt(idPromotion.substring(2));
                number++;
                String idPromotionNew = number + "";

                while (idPromotionNew.length() < 4) {
                    idPromotionNew = "0" + idPromotionNew;
                }

                return "KM" + idPromotionNew;
            } else {
                return "KM0001";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//    Thêm khuyến mãi
    public boolean addPromotion(Promotion promotion) {
        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "INSERT INTO Promotion (idPromotion, name, typePromotion, discount, priceRange, quantity, dayStart, dayEnd, status,description) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, promotion.getIdPromotion());
            preparedStatement.setString(2, promotion.getName());
            preparedStatement.setString(3, Promotion.convertTypePromotionToString(promotion.getTypePromotion()));
            preparedStatement.setDouble(4, promotion.getDiscount());
            preparedStatement.setDouble(5, promotion.getPriceRange());
            preparedStatement.setInt(6, promotion.getQuantity());
            preparedStatement.setDate(7, java.sql.Date.valueOf(promotion.getDayStart()));
            preparedStatement.setDate(8, java.sql.Date.valueOf(promotion.getDayEnd()));
            preparedStatement.setString(9, Promotion.convertStatusToString(promotion.getStatus()));
            preparedStatement.setString(10, promotion.getDecription());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean addPromotionWithProduct(Promotion promotion, List<String> listIDProduct) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectDB.getConnection();
            connection.setAutoCommit(false); // Tắt chế độ tự động commit để đảm bảo giao dịch an toàn

            // Bước 1: Tạo khuyến mãi
            String promotionInsertSQL = "INSERT INTO Promotion (idPromotion, name, typePromotion, discount, priceRange, quantity, dayStart, dayEnd, status, description) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(promotionInsertSQL);
            preparedStatement.setString(1, promotion.getIdPromotion());
            preparedStatement.setString(2, promotion.getName());
            preparedStatement.setString(3, Promotion.convertTypePromotionToString(promotion.getTypePromotion()));
            preparedStatement.setDouble(4, promotion.getDiscount());
            preparedStatement.setDouble(5, promotion.getPriceRange());
            preparedStatement.setInt(6, promotion.getQuantity());
            preparedStatement.setDate(7, java.sql.Date.valueOf(promotion.getDayStart()));
            preparedStatement.setDate(8, java.sql.Date.valueOf(promotion.getDayEnd()));
            preparedStatement.setString(9, Promotion.convertStatusToString(promotion.getStatus()));
            preparedStatement.setString(10, promotion.getDecription());
            preparedStatement.executeUpdate();

            // Bước 2: Thêm sản phẩm vào bảng ProductPromotion
            String productPromotionInsertSQL = "INSERT INTO ProductPromotion (idProduct, idPromotion) VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(productPromotionInsertSQL);
            for (String idProduct : listIDProduct) {
                preparedStatement.setString(1, idProduct);
                preparedStatement.setString(2, promotion.getIdPromotion());
                preparedStatement.addBatch(); // Thêm câu lệnh vào batch để thực hiện nhiều câu lệnh INSERT cùng một lúc
            }
            preparedStatement.executeBatch();

            // Bước 3: Cập nhật giá của sản phẩm
            String updateProductPriceSQL = "UPDATE Product SET currentPrice = originalPrice * (1 - ? / 100) WHERE idProduct IN (SELECT idProduct FROM ProductPromotion WHERE idPromotion = ?)";
            preparedStatement = connection.prepareStatement(updateProductPriceSQL);
            preparedStatement.setDouble(1, promotion.getDiscount());
            preparedStatement.setString(2, promotion.getIdPromotion());
            preparedStatement.executeUpdate();

            // Bước 4: Commit giao dịch
            connection.commit();
            return true;
        } catch (SQLException ex) {
            // Rollback giao dịch nếu có lỗi
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }

            ex.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.setAutoCommit(true); // Mở lại chế độ tự động commit
                }
            } catch (SQLException closeEx) {
                closeEx.printStackTrace();
            }
        }

        return false;
    }

    private static void applyPromotionToProduct(Connection connection, int promotionKey, String productId) throws SQLException {
        // Cập nhật giá bán hiện tại của sản phẩm
        String updateProductSql = "UPDATE Product SET currentPrice = originalPrice - (originalPrice * ? / 100) WHERE idProduct = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateProductSql)) {
            preparedStatement.setInt(1, promotionKey);
            preparedStatement.setString(2, productId);
            preparedStatement.executeUpdate();
        }

        // Thêm bản ghi vào bảng trung gian ProductPromotion
        String insertProductPromotionSql = "INSERT INTO ProductPromotion (idProduct, idPromotion) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertProductPromotionSql)) {
            preparedStatement.setString(1, productId);
            preparedStatement.setInt(2, promotionKey);
            preparedStatement.executeUpdate();
        }

        // Tăng số lượng khuyến mãi áp dụng trong bảng Promotion
        String updatePromotionQuantitySql = "UPDATE Promotion SET quantity = quantity + 1 WHERE idPromotion = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updatePromotionQuantitySql)) {
            preparedStatement.setInt(1, promotionKey);
            preparedStatement.executeUpdate();
        }
    }

    //    Lấy danh dánh khuyến mãi
    public List<Promotion> getListPromotion() {
        List<Promotion> listPromotion = new ArrayList<Promotion>();
        String sql = "SELECT * FROM promotion";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String idPromotion = resultSet.getString("idPromotion");
                String name = resultSet.getString("name");
                String typePromotion = resultSet.getString("typePromotion");
                float discount = resultSet.getFloat("discount");
                float priceRange = resultSet.getFloat("priceRange");
                int quantity = resultSet.getInt("quantity");
                LocalDate dayStart = resultSet.getDate("dayStart").toLocalDate();
                LocalDate dayEnd = resultSet.getDate("dayEnd").toLocalDate();
                String status = resultSet.getString("status");
                String description = resultSet.getString("description");

                Promotion promotion = new Promotion(idPromotion, name, Promotion.convertStringToTypePromotion(typePromotion), discount, priceRange, quantity, dayStart, dayEnd, Promotion.convertStringToStatus(status), description);
                listPromotion.add(promotion);
            }
        } catch (Exception e) {
        }
        return listPromotion;
    }
}
