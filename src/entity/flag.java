package entity;

public class Flag {

    private static Flag instence = new Flag();
    public static boolean flagStaffGUI; // kiểm tra mở gui danh sách nhân viên đang làm hay nghỉ làm
    public  static int flagStaffInfo;
    // 0 là mặc định
    // 1 là mở chức năng thêm nhân viên

//    constructor
    public Flag() {
        flagStaffGUI = false;
        flagStaffInfo = 0;
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

    
}
