package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Utils {

    public static String thongKe = "Thống Kê";
    public static String sanPham = "Sản Phẩm";
    public static String nhanVien = "Nhân Viên";
    public static String hoaDon = "Hóa Đơn";
    public static String khachHang = "Khách Hàng";
    public static String lichSu = "Lịch Sử";
    public static String khuyenMai = "Khuyên Mãi";
    public static String doiMK = "Đổi Mật Khẩu";
    public static String dangXuat = "Đăng Xuất";
    public static String giaoDien = "Giao Diện";
    public static String ngonNgu = "Ngôn Ngữ";
    public static String sang = "Sáng";
    public static String toi = "Tối";
    public static String vietNam = "Việt Nam";
    public static String english = "English";

    public static void dd(int so) {
        ResourceBundle mybundle;
        if (so == 0) {
            Locale.setDefault(new Locale("vi", "VN"));
            mybundle = ResourceBundle.getBundle("Lng");
        } else {
            Locale.setDefault(new Locale("en", "US"));
            mybundle = ResourceBundle.getBundle("Lng");
        }

        thongKe = mybundle.getString("thongKe");
        sanPham = mybundle.getString("sanPham");
        nhanVien = mybundle.getString("nhanVien");
        hoaDon = mybundle.getString("hoaDon");
        khachHang = mybundle.getString("khachHang");
        lichSu = mybundle.getString("lichSu");
        khuyenMai = mybundle.getString("khuyenMai");
        doiMK = mybundle.getString("doiMK");
        dangXuat = mybundle.getString("dangXuat");
        giaoDien = mybundle.getString("giaoDien");
        ngonNgu = mybundle.getString("ngonNgu");
        sang = mybundle.getString("sang");
        toi = mybundle.getString("toi");
        vietNam = mybundle.getString("vietNam");
        english = mybundle.getString("english");
    }

    public static void openPDF(String filePath) {
        File pdfFile = new File(filePath);
        try {
            if (pdfFile.exists()) {
                Desktop.getDesktop().open(pdfFile);
            } else {
                System.out.println("Tệp không tồn tại hãy kiểm tra lại ! ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LocalDate getLocalDate(String date) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(date.contains("/") ? "dd/MM/yyyy" : "dd-MM-yyyy");
        String dates[] = date.split(date.contains("/") ? "/" : "-");
        for (int i = 0; i < 2; ++i) {
            if (dates[i].length() == 1) {
                dates[i] = '0' + dates[i];
            }
        }
        if (dates[2].length() == 2) {
            dates[2] = "19" + dates[2];
        }
        return LocalDate
                .parse(String.format(date.contains("/") ? "%s/%s/%s" : "%s-%s-%s", dates[0], dates[1], dates[2]), dtf);
    }

    /**
     * Get các từ tiếng Việt hoa có dấu
     *
     * @return
     */
    public static String getVietnameseDiacriticCharacters() {
        return "ẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ";
    }

    /**
     * Get các từ tiếng Việt thường có dấu
     *
     * @return
     */
    public static String getVietnameseDiacriticCharactersLower() {
        return getVietnameseDiacriticCharacters().toLowerCase();
    }
//    chuyển đổi định dạng ngày tháng năm từ yyyy/mm/dd sang dd/mm/yyyy

    public static String convertDateFormat(String inputDate) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");

            Date date = inputFormat.parse(inputDate);
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

//    Định dạng kiểu tiền 
    public static String formatMoney(int amount) {
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        return format.format(amount);
    }

    public static String formatMoney(double amount) {
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        return format.format(amount);
    }
    
    public static double parseMoney(String moneyString) throws ParseException {
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        Number number = format.parse(moneyString);
        return number.doubleValue();
    }
}
