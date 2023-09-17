package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
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
                System.out.println("Tệp không tồn tại hayx kiểm tra lại ! ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
