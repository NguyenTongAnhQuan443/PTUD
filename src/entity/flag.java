package entity;

public class Flag {

    private static Flag instence = new Flag();
    public static boolean flagStaffGUI;
    // kiểm tra mở gui danh sách nhân viên đang làm hay nghỉ làm
    public static int flagStaffInfo;
    // 0 là mặc định
    // 1 là mở chức năng thêm nhân viên
    // 2 là mở chức năng sửa thông tin nhân viên
    // 3 là mở từ menu tài khoản
    public static String flagIDStaff; // lấy idStaff cho chức năng cập nhập

    public static int flagUpdateSupplier;
    // 0 là mặc định
    // 1 là mở chức năng thêm nhà cung cấp
    // 2 là mở chức năng cập nhập nhà cung cấp
    public static String flagIDSupplier; // lấy id supplier cho chức năng cập nhập

    public static int flagUpdateCustomer;
    // 0 là mặc định
    // 1 là mở chức năng thêm Khách hàng
    // 2 là mở chức năng cập nhập Khách hàng
    public static String flagIDCustomer;

    //Lưu thông tin nhân viên đăng nhập
    protected static String idStaff;
    protected static String passStaff;

    public static int flagSell_GUI;
    // 0 mặc định 
    // 1 từ GUI khách hàng quay lại gui bán hàng
    public static String idCusForSell_GUI;
//    Lưu ID khách hàng từ nút thêm mới 

//    constructor
    public Flag() {
        flagStaffGUI = false;
        flagStaffInfo = 0;
        flagIDStaff = "";
        flagUpdateSupplier = 0;
        flagIDSupplier = "";
        flagUpdateCustomer = 0;
        flagIDCustomer = "";

        idStaff = "";
        passStaff = "";

        flagSell_GUI = 0;
        idCusForSell_GUI = "";
    }

//
    public static Flag getInstence() {
        return instence;
    }

// getset
    public static boolean isFlagStaffGUI() {
        return flagStaffGUI;
    }

    public static void setFlagStaffGUI(boolean flagStaffGUI) {
        Flag.flagStaffGUI = flagStaffGUI;
    }

    public static int getFlagStaffInfo() {
        return flagStaffInfo;
    }

    public static void setFlagStaffInfo(int flagStaffInfo) {
        Flag.flagStaffInfo = flagStaffInfo;
    }

    public static String getFlagIDStaff() {
        return flagIDStaff;
    }

    public static void setFlagIDStaff(String flagIDStaff) {
        Flag.flagIDStaff = flagIDStaff;
    }

    public static int getFlagUpdateSupplier() {
        return flagUpdateSupplier;
    }

    public static void setFlagUpdateSupplier(int flagUpdateSupplier) {
        Flag.flagUpdateSupplier = flagUpdateSupplier;
    }

    public static String getFlagIDSupplier() {
        return flagIDSupplier;
    }

    public static void setFlagIDSupplier(String flagIDSupplier) {
        Flag.flagIDSupplier = flagIDSupplier;
    }

    public static int getFlagUpdateCustomer() {
        return flagUpdateCustomer;
    }

    public static void setFlagUpdateCustomer(int flagUpdateCustomer) {
        Flag.flagUpdateCustomer = flagUpdateCustomer;
    }

    public static String getFlagIDCustomer() {
        return flagIDCustomer;
    }

    public static void setFlagIDCustomer(String flagIDCustomer) {
        Flag.flagIDCustomer = flagIDCustomer;
    }

    public static String getIdStaff() {
        return idStaff;
    }

    public static void setIdStaff(String idStaff) {
        Flag.idStaff = idStaff;
    }

    public static String getPassStaff() {
        return passStaff;
    }

    public static void setPassStaff(String passStaff) {
        Flag.passStaff = passStaff;
    }

    public static int getFlagSell_GUI() {
        return flagSell_GUI;
    }

    public static void setFlagSell_GUI(int flagSell_GUI) {
        Flag.flagSell_GUI = flagSell_GUI;
    }

    public static String getIdCusForSell_GUI() {
        return idCusForSell_GUI;
    }

    public static void setIdCusForSell_GUI(String idCusForSell_GUI) {
        Flag.idCusForSell_GUI = idCusForSell_GUI;
    }

}
