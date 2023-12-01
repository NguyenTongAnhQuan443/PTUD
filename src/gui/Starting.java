package gui;

public class Starting {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_GUI().setVisible(true);
//                new Login_GUI_V2().setVisible(true);
            }
        });
    }
}
