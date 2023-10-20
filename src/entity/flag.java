package entity;

public class flag {

    private static flag instence = new flag();
    public static boolean flagStaffGUI;

    public flag() {
        flagStaffGUI = false;
    }

    public static flag getInstence() {
        return instence;
    }

    public static boolean isFlagStaffGUI() {
        return flagStaffGUI;
    }

    public static void setFlagStaffGUI(boolean flagStaffGUI) {
        flag.flagStaffGUI = flagStaffGUI;
    }

}
