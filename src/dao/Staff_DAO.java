package dao;

import java.sql.Connection; //
import connectDB.ConnectDB; //
import java.sql.PreparedStatement;//
import java.sql.ResultSet;//
import java.sql.Statement; //
import entity.Staff;
import entity.Ward;
import entity.District;
import entity.Province;
import java.sql.SQLException;
import java.time.LocalDate;
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

public class Staff_DAO extends DAO {

    public Staff_DAO() {
    }

//    thêm nhân viên
    public boolean addStaff(Staff staff) {
        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "INSERT Staff VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, staff.getIdStaff());
            preparedStatement.setString(2, staff.getName());
            preparedStatement.setString(3, staff.getCic());
            preparedStatement.setString(4, staff.getPhone());
            preparedStatement.setString(5, staff.getEmail());
            preparedStatement.setDate(6, java.sql.Date.valueOf(staff.getDayofbirth()));
            preparedStatement.setBoolean(7, staff.isSex());
            preparedStatement.setString(8, staff.getProvince().getId());
            preparedStatement.setString(9, staff.getDistrict().getId());
            preparedStatement.setString(10, staff.getWard().getId());
            preparedStatement.setString(11, staff.getAddress());
            preparedStatement.setString(12, staff.convertRightsToString(staff.getRights()));
            preparedStatement.setString(13, staff.convertStatusToString(staff.getStatus()));
            preparedStatement.setString(14, staff.getPassword());
            preparedStatement.execute();
            preparedStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

// tạo mã nhân viên
    public String createIDStaff() {
        try {
            String sql = "SELECT TOP 1 [idStaff] FROM [dbo].[Staff] ORDER BY [idStaff] DESC";
            Statement statement = ConnectDB.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String idStaff = resultSet.getString(1).trim();
                int number = Integer.parseInt(idStaff.substring(2));
                number++;
                String idStaffNew = number + "";

                while (idStaffNew.length() < 4) {
                    idStaffNew = "0" + idStaffNew;
                }

                return "NV" + idStaffNew;
            } else {
                return "NV0001";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //    lấy nhân viên bằng mã nhân viên
    public Staff getStaffByID(String idStaff) {
        String sql = "SELECT * FROM Staff WHERE idStaff = ?";

        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, idStaff);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
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
                return staff;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    Cập nhập thông tin nhân viên
    public boolean updateInfoStaff(Staff staff) {
        String sql = "Update Staff SET name = ?, cic = ?, phone = ?, email = ?, dayofbirth = ?, sex = ?, province = ?, district = ?, ward = ?, address = ?, rights = ?, status = ? WHERE idStaff = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, staff.getName());
            preparedStatement.setString(2, staff.getCic());
            preparedStatement.setString(3, staff.getPhone());
            preparedStatement.setString(4, staff.getEmail());
            preparedStatement.setDate(5, java.sql.Date.valueOf(staff.getDayofbirth()));
            preparedStatement.setBoolean(6, staff.isSex());
            preparedStatement.setString(7, staff.getProvince().getId());
            preparedStatement.setString(8, staff.getDistrict().getId());
            preparedStatement.setString(9, staff.getWard().getId());
            preparedStatement.setString(10, staff.getAddress());
            preparedStatement.setString(11, staff.convertRightsToString(staff.getRights()));
            preparedStatement.setString(12, staff.convertStatusToString(staff.getStatus()));
            preparedStatement.setString(13, staff.getIdStaff());
            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

// thêm vào một danh sách nhân viên (dùng cho hàm import file excel)
    public boolean addStaffList(List<Staff> staffList) {
        if (staffList == null || staffList.isEmpty()) {
            return false; // Không thể thêm nếu danh sách trống hoặc null.
        }

        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "INSERT INTO Staff VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            for (Staff staff : staffList) {
                preparedStatement.setString(1, staff.getIdStaff());
                preparedStatement.setString(2, staff.getName());
                preparedStatement.setString(3, staff.getCic());
                preparedStatement.setString(4, staff.getPhone());
                preparedStatement.setString(5, staff.getEmail());
                preparedStatement.setDate(6, java.sql.Date.valueOf(staff.getDayofbirth()));
                preparedStatement.setBoolean(7, staff.isSex());
                preparedStatement.setString(8, staff.getProvince().getId());
                preparedStatement.setString(9, staff.getDistrict().getId());
                preparedStatement.setString(10, staff.getWard().getId());
                preparedStatement.setString(11, staff.getAddress());
                preparedStatement.setString(12, staff.convertRightsToString(staff.getRights()));
                preparedStatement.setString(13, staff.convertStatusToString(staff.getStatus()));
                preparedStatement.setString(14, staff.getPassword());
                preparedStatement.addBatch();
            }

            preparedStatement.executeBatch();
            preparedStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

//    khôi phục trạng thái làm việc của nhân viên
    public boolean setStatusWorking(String idStaff) {
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE Staff SET status = N'Đang làm' WHERE idStaff = ?";
        try {
            preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, idStaff);

            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement);
        }
        return false;
    }

//    lấy những nhân viên có theo trạng thái làm việc
    public List<Staff> getListStaffByStatus(String sqlStatus) {
        List<Staff> listStaff = new ArrayList<Staff>();
        String sql = sqlStatus;
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
            e.printStackTrace();
        }

        return listStaff;
    }

    //Tìm nhân viên theo mã nhân viên và trạng thái làm việc
    public Staff getStaffByIDAndStatus(String idStaff, String statusWorking) {
        String sql = "SELECT * FROM Staff WHERE idStaff = ? AND status = ?";
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, idStaff);
            preparedStatement.setString(2, statusWorking);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String id = resultSet.getString("idStaff");
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
                return staff;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

// Lấy toàn bộ nhân viên
    public List<Staff> getListStaff() {
        List<Staff> listStaff = new ArrayList<Staff>();
        String sql = "SELECT * FROM Staff";
        try {
            connectDB.ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
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

    public static String randomPassword() {
        Random random = new Random();
        int length = 8;
        StringBuffer passwordBuffer = new StringBuffer();

        for (int i = 0; i < length; i++) {
            int digit = Math.abs(random.nextInt(10)); // Sinh số ngẫu nhiên từ 0 đến 9
            passwordBuffer.append(digit);
        }

        return passwordBuffer.toString();
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

// kiểm tả số điện thoại tồn tại
    public boolean checkPhoneExist(String phoneCheck) {
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection()
                    .prepareStatement("SELECT * FROM [dbo].[Staff] WHERE [phone] = ?");
            preparedStatement.setString(1, phoneCheck);

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

//    kiểm tra số CCCD tồn tại
    public boolean checkCICExist(String cic) {
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection()
                    .prepareStatement("SELECT * FROM [dbo].[Staff] WHERE [cic] = ?");
            preparedStatement.setString(1, cic);

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    //    kiểm tra Email tồn tại
    public boolean checkEmailExist(String emailCheck) {
        try {
            PreparedStatement preparedStatement = ConnectDB.getConnection()
                    .prepareStatement("SELECT * FROM [dbo].[Staff] WHERE [email] = ?");
            preparedStatement.setString(1, emailCheck);

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
