package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class QuanLyKhoHangView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyKhoHangView frame = new QuanLyKhoHangView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuanLyKhoHangView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1236, 874);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nhập kho");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Xuất kho");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Thống kê");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("About");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNewMenu_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Sản Phẩm Tồn Kho");
		label.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		label.setBounds(507, 10, 222, 30);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 704, 1191, 92);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton jButton_Insert = new JButton("Insert");
		jButton_Insert.setBackground(UIManager.getColor("Button.background"));
		jButton_Insert.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButton_Insert.setBounds(74, 30, 152, 52);
		panel.add(jButton_Insert);
		
		JButton jButton_Edit = new JButton("Edit");
		jButton_Edit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Edit.setBounds(297, 30, 152, 52);
		panel.add(jButton_Edit);
		
		JButton jButton_Delete = new JButton("Delete");
		jButton_Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButton_Delete.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Delete.setBounds(521, 30, 152, 52);
		panel.add(jButton_Delete);
		
		JButton JButton_Save = new JButton("Save");
		JButton_Save.setBackground(UIManager.getColor("CheckBox.light"));
		JButton_Save.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		JButton_Save.setBounds(748, 30, 152, 52);
		panel.add(JButton_Save);
		
		JButton jButton_Cancel = new JButton("Cancel");
		jButton_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButton_Cancel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Cancel.setBounds(975, 30, 152, 52);
		panel.add(jButton_Cancel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 1202, 423);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		this.setVisible(true);
	}
}
