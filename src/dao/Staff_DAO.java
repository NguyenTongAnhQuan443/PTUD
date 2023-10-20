package dao;

import java.sql.Connection; // 
import connectDB.ConnectDB; //
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement; //
import entity.Staff;
import entity.Ward;
import entity.District;
import entity.Province;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Staff_DAO {

    public Staff_DAO() {
    }

    public List<Staff> getListStaff() {
        List<Staff> listStaff = new ArrayList<Staff>();
        String sql = "SELECT * FROM Staff";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = (Connection) ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String idStaff = resultSet.getString("idStaff");
                String name = resultSet.getString("name");
                String cic = resultSet.getString("cic");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                LocalDate dayofbirth = resultSet.getDate("dayofbirth").toLocalDate();
                boolean sex = resultSet.getBoolean("sex");
                String province = resultSet.getString("province");
                String district = resultSet.getString("district");
                String ward = resultSet.getString("ward");
                String address = resultSet.getString("address");
                String rights = resultSet.getString("rights");
                String status = resultSet.getString("status");
                String password = resultSet.getString("password");
                Staff staff = new Staff(idStaff, name, cic, phone, email, dayofbirth, sex, new Province(province), new District(district), new Ward(ward), address, Staff.convertStringToRights(rights), Staff.convertStringToStatus(status), password);
                listStaff.add(staff);
            }
        } catch (Exception e) {
        }
        return listStaff;
    }

// kiểm tra tài khoản, mật khẩu đăng nhập
    public boolean isAccount(String idStaff, String password) {
        String sql = "SELECT * FROM Staff WHERE [idStaff] = ? AND [password] = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection()
                    .prepareStatement(sql);
            preparedStatement.setString(1, idStaff);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

// kiểm tả chức vụ nhân viên
    public boolean checkRightsAccount(String idStaff) {
        String sql = "SELECT rights FROM Staff WHERE idStaff = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, idStaff);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String rights = resultSet.getString("rights");
                if (rights.equals(Staff.convertRightsToString(Staff.Rights.NhanVienBanHang))) {
                    return false; // là nhân viên bán hàng
                } else {
                    return true; // là nhân viên quản lý
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

// lấy tên nhân viên
    public String getNameAccount(String idStaff) {
        String sql = "SELECT name FROM Staff WHERE idStaff = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, idStaff);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("name");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//lấy email nhân viên
    public String getEmailAccount(String idStaff) {
        String sql = "SELECT email FROM Staff WHERE idStaff = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, idStaff);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("email");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

// kiểm tra mã nhân viên nhập vào có tồn tại trong hệ thống hay không
    public boolean checkAccountExits(String idSearch) {

        try {
            String sql = "SELECT idStaff FROM Staff";
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String idStaff = resultSet.getString("idStaff");
                if (idStaff.trim().toString().equals(idSearch)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
        }
        return false;
    }

// send email
    public void sendPassToEmail(String emailReceiver, String contentEmail, String titleEmail) {
//        bthr qkwf yiad lrkb
        final String fromEmail = "fleyteam@gmail.com";
        final String pass = "bthrqkwfyiadlrkb";

        Properties props = new Properties(); // properties java util
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Authenticator auth = new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, pass);
            }
        };

        Session session = Session.getInstance(props, auth);

        MimeMessage msg = new MimeMessage(session);

        try {
            msg.addHeader("content-type", "text/HTML; charset = UTF-8");
            msg.setFrom(fromEmail);
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailReceiver, false));
            msg.setSubject(titleEmail);
            msg.setSentDate(new Date());
            msg.setContent(contentEmail, "text/HTML; charset = UTF-8");
            Transport.send(msg);
            System.out.println("send email success");
        } catch (MessagingException e1) {
            e1.printStackTrace();
        }
    }

// tạo mật khẩu ngẫu nhiên
    public static String randomPassword() {
        Random random = new Random();
        int length = 5 + (Math.abs(random.nextInt()) % 3);
        StringBuffer captchaStrBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int baseCharacterNumber = Math.abs(random.nextInt()) % 62;
            int characterNumber = 0;
            if (baseCharacterNumber < 26) {
                characterNumber = 65 + baseCharacterNumber;
            } else if (baseCharacterNumber < 52) {
                characterNumber = 97 + (baseCharacterNumber - 26);
            } else {
                characterNumber = 48 + (baseCharacterNumber - 52);
            }
            captchaStrBuffer.append((char) characterNumber);
        }
        return captchaStrBuffer.toString();
    }

// cập nhập mật khẩu
    public boolean changePass(String idStaff, String newPass) {
        String sql = "UPDATE Staff SET password = ? WHERE idStaff = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, newPass);
            preparedStatement.setString(2, idStaff);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
