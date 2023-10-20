package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;        
public class District_DAO {
    private static District_DAO instance = new District_DAO();

    public District_DAO() {
    }
    public static District_DAO getInstence(){
        return instance;
    }
    public String getDistrictNameByID(String id){
        String sql = "SELECT district FROM district WHERE id = ?";
        String districtName = "";
        
        try {
            Connection connection = connectDB.ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()){
                districtName = resultSet.getString("district");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return districtName;
    }
}
