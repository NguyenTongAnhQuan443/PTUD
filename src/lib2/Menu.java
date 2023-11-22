package lib2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class Menu extends JComponent {

    private MenuItem currentSubMenu;
    private MenuItem previousSubMenu;

    public MenuEvent getEvent() {
        return event;
    }

    public void setEvent(MenuEvent event) {
        this.event = event;
    }

    private MenuEvent event;
    private MigLayout layout;
    private String[][] menuItems = new String[][]{
        {"Thống kê", "Thống kê doanh thu", "Thống kê nhân viên", "Thống kê sản phẩm", "Thống kê khách hàng"},
        {"Nhà cung cấp"},
        {"Sản phẩm"},
        {"Nhân viên", "Danh sách nhân viên", "Danh sách thôi việc"},
        {"Bán hàng"},
        {"Lịch sử bán hàng"},
        {"Khách hàng"},
        {"Khuyến mãi"},
        {"Tài khoản", "Thông tin tài khoản", "Đổi mật khẩu"},
        {"Chức năng khác", "Thay đổi phí VAT"},
        {"Ngôn ngữ", "Tiếng Việt", "English"},
        {"Giúp đỡ", "Hướng dẫn", "Báo lỗi", "Đóng góp ý kiến"},
        {"Thoát"}
    };

    public Menu() {
        init();
    }

    private void init() {
        layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2", "fill");
        setLayout(layout);
        setOpaque(true);
        //  Init MenuItem
        for (int i = 0; i < menuItems.length; i++) {
            addMenu(menuItems[i][0], i);
        }
    }

    private Icon getIcon(int index) {
        URL url = getClass().getResource("/images/icons/" + index + ".png");
        if (url != null) {
            return new ImageIcon(url);
        } else {
            return null;
        }
    }

    private void addMenu(String menuName, int index) {
        int length = menuItems[index].length;
        MenuItem item = new MenuItem(menuName, index, length > 1);
        Icon icon = getIcon(index);
        if (icon != null) {
            item.setIcon(icon);
        }
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (length > 1) {
                    if (!item.isSelected()) {
                        if (currentSubMenu != null) {
                            // Đóng menu con hiện tại nếu có
                            hideMenu(currentSubMenu, currentSubMenu.getIndex());
                            currentSubMenu.setSelected(false);
                            currentSubMenu.setForeground(Color.WHITE);
                        }
                        // Mở menu mới
                        item.setSelected(true);
                        item.setForeground(Color.ORANGE);
                        addSubMenu(item, index, length, getComponentZOrder(item));
                        // Cập nhật currentSubMenu
                        currentSubMenu = item;
                    } else {
                        //  Hide menu
                        hideMenu(item, index);
                        item.setSelected(false);
                        item.setForeground(Color.WHITE);
                    }
                } else {
                    if (!item.isSelected()) {
                        if (currentSubMenu != null) {
                            hideMenu(currentSubMenu, currentSubMenu.getIndex());
                            currentSubMenu.setSelected(false);
                            currentSubMenu.setForeground(Color.WHITE);
                        }
                        item.setSelected(true);
                        item.setForeground(Color.ORANGE);
                        addSubMenu(item, index, length, getComponentZOrder(item));
                        currentSubMenu = item;
                    } else {
                        hideMenu(item, index);
                        item.setSelected(false);
                        item.setForeground(Color.WHITE);
                    }
                    if (event != null) {
                        event.selected(index, 0);
                    }
                }
            }
        });
        add(item);
        revalidate();
        repaint();
    }

    private void addSubMenu(MenuItem item, int index, int length, int indexZorder) {
        JPanel panel = new JPanel(new MigLayout("wrap 1, fillx, inset 0, gapy 0", "fill"));
        panel.setName(index + "");
        panel.setBackground(new Color(18, 99, 63));
        for (int i = 1; i < length; i++) {
            MenuItem subItem = new MenuItem(menuItems[index][i], i, false);
            subItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (event != null) {
                        event.selected(index, subItem.getIndex());
                    }
                }
            });
            subItem.initSubMenu(i, length);
            panel.add(subItem);
        }
        add(panel, "h 0!", indexZorder + 1);
        revalidate();
        repaint();
        MenuAnimation.showMenu(panel, item, layout, true);
    }

    private void hideMenu(MenuItem item, int index) {
        for (Component com : getComponents()) {
            if (com instanceof JPanel && com.getName() != null && com.getName().equals(index + "")) {
                com.setName(null);
                MenuAnimation.showMenu(com, item, layout, false);
                break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setColor(new Color(0, 128, 128));
        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        super.paintComponent(grphcs);
    }

}
