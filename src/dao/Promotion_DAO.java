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
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

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

//    Lấy danh sách theo status promotion
    public List<Promotion> getListPromotionsByStatus(String status) {
        List<Promotion> listPromotion = new ArrayList<>();
        String sql = "SELECT * FROM promotion WHERE status = ?";

        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, status);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String idPromotion = resultSet.getString("idPromotion");
                String name = resultSet.getString("name");
                String typePromotion = resultSet.getString("typePromotion");
                float discount = resultSet.getFloat("discount");
                float priceRange = resultSet.getFloat("priceRange");
                int quantity = resultSet.getInt("quantity");
                LocalDate dayStart = resultSet.getDate("dayStart").toLocalDate();
                LocalDate dayEnd = resultSet.getDate("dayEnd").toLocalDate();
                String promotionStatus = resultSet.getString("status");
                String description = resultSet.getString("description");

                Promotion promotion = new Promotion(idPromotion, name, Promotion.convertStringToTypePromotion(typePromotion), discount, priceRange, quantity, dayStart, dayEnd, Promotion.convertStringToStatus(promotionStatus), description);
                listPromotion.add(promotion);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listPromotion;
    }
// Lấy khuyến mãi theo tổng tiền với trạng thái còn hạn, và hóa đơn áp dụng  trên một giá trị cụ thể
    public List<Promotion> getListPromotionsByStatusAndTypePromotion2(double minPriceRange) {
    List<Promotion> listPromotion = new ArrayList<>();
    String sql = "SELECT * FROM promotion WHERE status = N'Còn hạn' AND typePromotion = N'KM theo tổng tiền' AND ? >= priceRange";

    try {
        connectDB.ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDouble(1, minPriceRange);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String idPromotion = resultSet.getString("idPromotion");
            String name = resultSet.getString("name");
            String typePromotion = resultSet.getString("typePromotion");
            float discount = resultSet.getFloat("discount");
            float priceRange = resultSet.getFloat("priceRange");
            int quantity = resultSet.getInt("quantity");
            LocalDate dayStart = resultSet.getDate("dayStart").toLocalDate();
            LocalDate dayEnd = resultSet.getDate("dayEnd").toLocalDate();
            String promotionStatus = resultSet.getString("status");
            String description = resultSet.getString("description");

            Promotion promotion = new Promotion(idPromotion, name, Promotion.convertStringToTypePromotion(typePromotion), discount, priceRange, quantity, dayStart, dayEnd, Promotion.convertStringToStatus(promotionStatus), description);
            listPromotion.add(promotion);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return listPromotion;
}

//    Lấy khuyến mãi bằng id
    public Promotion getPromotionByID(String id) {
        String sql = "SELECT * FROM promotion WHERE idPromotion = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
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
                return promotion;
            }
        } catch (Exception e) {
        }
        return null;
    }

// Lấy Promotion bằng tên promotion
    public Promotion getPromotionByNamePromotion(String namePromotion) {
        String sql = "select * from Promotion Where  name = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, namePromotion);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
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
                return promotion;
            }
        } catch (Exception e) {
        }
        return null;
    }

//   Cập nhập khuyến mãi
    public boolean updateInfoPromotion(Promotion promotion) {
        String sql = "UPDATE Promotion SET name = ?, typePromotion = ?, discount = ?, priceRange = ?, quantity = ?, dayStart = ?, dayEnd = ?, description = ? WHERE idPromotion = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);

            preparedStatement.setString(1, promotion.getName());
            preparedStatement.setString(2, Promotion.convertTypePromotionToString(promotion.getTypePromotion()));
            preparedStatement.setDouble(3, promotion.getDiscount());
            preparedStatement.setDouble(4, promotion.getPriceRange());
            preparedStatement.setInt(5, promotion.getQuantity());
            preparedStatement.setDate(6, java.sql.Date.valueOf(promotion.getDayStart()));
            preparedStatement.setDate(7, java.sql.Date.valueOf(promotion.getDayEnd()));
            preparedStatement.setString(8, promotion.getDecription());

            preparedStatement.setString(9, promotion.getIdPromotion());
            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean sendEmailWithAttachment(List<String> emailReceivers, String contentEmail, String titleEmail, String attachmentPath) {
        final String fromEmail = "fleyteam@gmail.com";
        final String pass = "bthrqkwfyiadlrkb";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Xác thực tài khoản để có quyền gửi email
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, pass);
            }
        };

        // Tạo phiên (session) để gửi email
        Session session = Session.getInstance(props, auth);

        boolean isEmailSent = true;

        // Lặp qua danh sách người nhận để gửi email cho từng người
        for (String emailReceiver : emailReceivers) {
            MimeMessage msg = new MimeMessage(session);

            try {
                // Thiết lập các thuộc tính cho email
                msg.addHeader("content-type", "text/HTML; charset = UTF-8");
                msg.setFrom(new InternetAddress(fromEmail));
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailReceiver, false));
                msg.setSubject(titleEmail);
                msg.setSentDate(new Date());

                // Tạo phần nội dung của email
                BodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setContent(contentEmail, "text/HTML; charset = UTF-8");

                // Tạo một đối tượng Multipart để chứa cả nội dung và phần đính kèm
                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);

                // Nếu có đường dẫn của ảnh, thêm ảnh vào email
                if (attachmentPath != null && !attachmentPath.isEmpty()) {
                    addAttachment(multipart, attachmentPath);
                }

                // Đặt nội dung của email là đối tượng Multipart
                msg.setContent(multipart);

                // Gửi email
                Transport.send(msg);
                System.out.println("Email sent to: " + emailReceiver);
            } catch (MessagingException e1) {
                e1.printStackTrace();
                isEmailSent = false;
            }
        }

        return isEmailSent;
    }

// Phương thức thêm phần đính kèm vào email
    private static void addAttachment(Multipart multipart, String filePath) throws MessagingException {
        BodyPart attachmentBodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource(filePath);
        attachmentBodyPart.setDataHandler(new DataHandler(source));
        attachmentBodyPart.setFileName(filePath);
        multipart.addBodyPart(attachmentBodyPart);
    }
    
//    Cập nhập trạng thái promotion
    public boolean updatePromotionStatus(String promotionId, String newStatus) {
        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "UPDATE Promotion SET status = ? WHERE idPromotion = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, newStatus);
                preparedStatement.setString(2, promotionId);
                return preparedStatement.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
