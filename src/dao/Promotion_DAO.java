package dao;

import connectDB.ConnectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Promotion_DAO {
    
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
}
