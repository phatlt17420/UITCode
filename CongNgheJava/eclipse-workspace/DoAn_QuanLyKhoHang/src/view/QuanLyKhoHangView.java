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
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.CardLayout;

public class QuanLyKhoHangView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table_1;

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
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nhập hàng");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Xuất hàng");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Kho hàng");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Thống kê");
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem_4);
		
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
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, "name_4424368419400");
		panel_2.setLayout(null);
		
		Label label = new Label("Sản phẩm tồn kho");
		label.setBounds(265, 0, 592, 30);
		panel_2.add(label);
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 694, 1191, 92);
		panel_2.add(panel);
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
		scrollPane.setBounds(0, 36, 1202, 359);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "\u0110\u01A1n v\u1ECB t\u00EDnh", "T\u00EAn Kho H\u00E0ng", "S\u1ED1 l\u01B0\u1EE3ng"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(17, 429, 1091, 181);
		panel_2.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã sản phẩm:");
		lblNewLabel.setBounds(0, 0, 145, 30);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		
		textField = new JTextField();
		textField.setBounds(136, 0, 329, 30);
		panel_1.add(textField);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tên sản phẩm:");
		lblNewLabel_1.setBounds(0, 73, 145, 30);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 73, 329, 30);
		panel_1.add(textField_1);
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Đơn vị tính:");
		lblNewLabel_1_1.setBounds(0, 151, 145, 30);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 151, 329, 30);
		panel_1.add(textField_2);
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(762, 0, 329, 30);
		panel_1.add(textField_3);
		textField_3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_3.setColumns(10);
		
		JLabel lblTnKhoHng = new JLabel("Tên kho hàng:");
		lblTnKhoHng.setBounds(626, 0, 145, 30);
		panel_1.add(lblTnKhoHng);
		lblTnKhoHng.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1_2 = new JLabel("Số lượng: ");
		lblNewLabel_1_2.setBounds(626, 73, 145, 30);
		panel_1.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		textField_4 = new JTextField();
		textField_4.setBounds(762, 73, 329, 30);
		panel_1.add(textField_4);
		textField_4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_4.setColumns(10);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		contentPane.add(panel_2_1, "name_4424381662000");
		
		Label label_1 = new Label("Tồn kho");
		label_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(265, 0, 592, 30);
		panel_2_1.add(label_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 694, 1191, 92);
		panel_2_1.add(panel_3);
		
		JButton jButton_Insert_1 = new JButton("Insert");
		jButton_Insert_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Insert_1.setBackground(UIManager.getColor("Button.background"));
		jButton_Insert_1.setBounds(74, 30, 152, 52);
		panel_3.add(jButton_Insert_1);
		
		JButton jButton_Edit_1 = new JButton("Edit");
		jButton_Edit_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Edit_1.setBounds(297, 30, 152, 52);
		panel_3.add(jButton_Edit_1);
		
		JButton jButton_Delete_1 = new JButton("Delete");
		jButton_Delete_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Delete_1.setBounds(521, 30, 152, 52);
		panel_3.add(jButton_Delete_1);
		
		JButton JButton_Save_1 = new JButton("Save");
		JButton_Save_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		JButton_Save_1.setBackground(UIManager.getColor("Button.light"));
		JButton_Save_1.setBounds(748, 30, 152, 52);
		panel_3.add(JButton_Save_1);
		
		JButton jButton_Cancel_1 = new JButton("Cancel");
		jButton_Cancel_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Cancel_1.setBounds(975, 30, 152, 52);
		panel_3.add(jButton_Cancel_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 36, 1202, 359);
		panel_2_1.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(17, 429, 1091, 181);
		panel_2_1.add(panel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mã sản phẩm:");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(0, 0, 145, 30);
		panel_1_1.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(136, 0, 329, 30);
		panel_1_1.add(textField_5);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tên sản phẩm:");
		lblNewLabel_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(0, 73, 145, 30);
		panel_1_1.add(lblNewLabel_1_3);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(136, 73, 329, 30);
		panel_1_1.add(textField_6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Đơn vị tính:");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(0, 151, 145, 30);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(136, 151, 329, 30);
		panel_1_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(762, 0, 329, 30);
		panel_1_1.add(textField_8);
		
		JLabel lblTnKhoHng_1 = new JLabel("Tên kho hàng:");
		lblTnKhoHng_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblTnKhoHng_1.setBounds(626, 0, 145, 30);
		panel_1_1.add(lblTnKhoHng_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Số lượng: ");
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_1_2_1.setBounds(626, 73, 145, 30);
		panel_1_1.add(lblNewLabel_1_2_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(762, 73, 329, 30);
		panel_1_1.add(textField_9);
		this.setVisible(true);
	}
}
