package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vidu extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public vidu() {
        // Thiết lập JFrame
        setTitle("Menu Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo JMenuBar
        JMenuBar menuBar = new JMenuBar();
        JMenu windowMenu = new JMenu("Windows");
        
        // Tạo các JMenuItem
        JMenuItem window1Item = new JMenuItem("Window 1");
        JMenuItem window2Item = new JMenuItem("Window 2");
        
        // Thêm JMenuItem vào JMenu
        windowMenu.add(window1Item);
        windowMenu.add(window2Item);
        menuBar.add(windowMenu);
        setJMenuBar(menuBar);

        // Tạo CardLayout và mainPanel
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Tạo các panel cho các "cửa sổ"
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);
        panel1.add(new JLabel("This is Window 1"));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.add(new JLabel("This is Window 2"));

        // Thêm các panel vào mainPanel với tên định danh
        mainPanel.add(panel1, "Window1");
        mainPanel.add(panel2, "Window2");

        // Thêm mainPanel vào JFrame
        add(mainPanel);

        // Xử lý sự kiện cho JMenuItem
        window1Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Window1"); // Chuyển sang panel1
            }
        });

        window2Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Window2"); // Chuyển sang panel2
            }
        });
        this.setVisible(true);
    }

}