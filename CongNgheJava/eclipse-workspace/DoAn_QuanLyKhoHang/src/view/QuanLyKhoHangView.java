package view;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.QuanLyKhoHangController;
import dao.KhoHangDAO;
import database.JDBCUtil;
import model.KhoHang;

public class QuanLyKhoHangView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardLayout;
	public JTextField textField_KhoHang_maKhoHang;
	public JTextField textField_KhoHang_tenKhoHang;
	public JTextField textField_KhoHang_diaChi;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	public JTable table_KhoHang;
	private JTable table_1;
	private JTable table_2;

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
		QuanLyKhoHangController quanLyKhoHangController = new QuanLyKhoHangController(this);
		setBounds(100, 100, 1024, 768);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu Menu_File = new JMenu("File");
		Menu_File.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(Menu_File);

		JMenuItem Menu_File_KhoHang = new JMenuItem("Kho Hàng");
		Menu_File_KhoHang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Menu_File_KhoHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "name_272539212530300");
				// Viết load dữ liệu kho hàng khi nhấn vào menu File_KhoHang

				ArrayList<KhoHang> list = KhoHangDAO.getInstance().selectAll(); // lấy dữ liệu từ database

				String[] columnName = { "Mã kho hàng", "Tên kho hàng", "Địa chỉ kho hàng" }; // tạo tên cột cho bảng

				DefaultTableModel model = new DefaultTableModel(columnName, 0);
				for (KhoHang k : list) {
					model.addRow(new Object[] { k.getMaKhoHang(), k.getTenKhoHang(), k.getDiaChi() });
				}
				table_KhoHang.setModel(model);
			}
		});
		Menu_File.add(Menu_File_KhoHang);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Nhập Hàng");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "name_273313665894499");
			}
		});

		JSeparator separator = new JSeparator();
		Menu_File.add(separator);
		Menu_File.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Xuất Hàng");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "name_273344758974400");
			}
		});
		Menu_File.add(mntmNewMenuItem_2);

		JSeparator separator_1 = new JSeparator();
		Menu_File.add(separator_1);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Thống Kê");
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Menu_File.add(mntmNewMenuItem_3);

		JSeparator separator_2 = new JSeparator();
		Menu_File.add(separator_2);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Exit");
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Menu_File.add(mntmNewMenuItem_4);
		cardLayout = new CardLayout();
		contentPane = new JPanel(cardLayout);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JPanel window_KhoHang = new JPanel();
		window_KhoHang.setLayout(null);
		contentPane.add(window_KhoHang, "name_272539212530300");

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 605, 1000, 72);
		window_KhoHang.add(panel_3);

		JButton jButton_KhoHang_Insert = new JButton("Insert");
		jButton_KhoHang_Insert.addActionListener(quanLyKhoHangController);
		jButton_KhoHang_Insert.setActionCommand("KhoHang_Insert");
		jButton_KhoHang_Insert.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_KhoHang_Insert.setBackground(UIManager.getColor("Button.background"));
		jButton_KhoHang_Insert.setBounds(61, 10, 152, 52);
		panel_3.add(jButton_KhoHang_Insert);

		JButton jButton_KhoHang_Edit = new JButton("Edit");
		jButton_KhoHang_Edit.addActionListener(quanLyKhoHangController);
		jButton_KhoHang_Edit.setActionCommand("KhoHang_Edit");
		jButton_KhoHang_Edit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_KhoHang_Edit.setBounds(237, 10, 152, 52);
		panel_3.add(jButton_KhoHang_Edit);

		JButton jButton_KhoHang_Delete = new JButton("Delete");
		jButton_KhoHang_Delete.addActionListener(quanLyKhoHangController);
		jButton_KhoHang_Delete.setActionCommand("KhoHang_Delete");
		jButton_KhoHang_Delete.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_KhoHang_Delete.setBounds(417, 10, 152, 52);
		panel_3.add(jButton_KhoHang_Delete);

		JButton JButton_KhoHang_Save = new JButton("Save");
		JButton_KhoHang_Save.addActionListener(quanLyKhoHangController);
		JButton_KhoHang_Save.setActionCommand("KhoHang_Save");
		JButton_KhoHang_Save.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		JButton_KhoHang_Save.setBackground(UIManager.getColor("Button.light"));
		JButton_KhoHang_Save.setBounds(600, 10, 152, 52);
		panel_3.add(JButton_KhoHang_Save);

		JButton jButton_KhoHang_Cancel = new JButton("Cancel");
		jButton_KhoHang_Cancel.addActionListener(quanLyKhoHangController);
		jButton_KhoHang_Cancel.setActionCommand("KhoHang_Cancel");
		jButton_KhoHang_Cancel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_KhoHang_Cancel.setBounds(777, 10, 152, 52);
		panel_3.add(jButton_KhoHang_Cancel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 36, 1000, 364);
		window_KhoHang.add(scrollPane);

		table_KhoHang = new JTable();
		table_KhoHang.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "M\u00E3 kho h\u00E0ng", "T\u00EAn kho h\u00E0ng", "\u0110\u1ECBa ch\u1EC9" }));
		table_KhoHang.getColumnModel().getColumn(0).setPreferredWidth(90);
		table_KhoHang.getColumnModel().getColumn(1).setPreferredWidth(182);
		table_KhoHang.getColumnModel().getColumn(2).setPreferredWidth(357);
		table_KhoHang.getColumnModel().getColumn(2).setMinWidth(200);
		scrollPane.setViewportView(table_KhoHang);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 417, 998, 121);
		window_KhoHang.add(panel_1_1);

		JLabel lblNewLabel = new JLabel("Mã kho hàng:");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel.setBounds(0, 0, 145, 30);
		panel_1_1.add(lblNewLabel);

		textField_KhoHang_maKhoHang = new JTextField();
		textField_KhoHang_maKhoHang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_KhoHang_maKhoHang.setColumns(10);
		textField_KhoHang_maKhoHang.setBounds(136, 0, 329, 30);
		panel_1_1.add(textField_KhoHang_maKhoHang);

		JLabel lblNewLabel_1 = new JLabel("Tên kho hàng:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(0, 40, 145, 30);
		panel_1_1.add(lblNewLabel_1);

		textField_KhoHang_tenKhoHang = new JTextField();
		textField_KhoHang_tenKhoHang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_KhoHang_tenKhoHang.setColumns(10);
		textField_KhoHang_tenKhoHang.setBounds(136, 40, 329, 30);
		panel_1_1.add(textField_KhoHang_tenKhoHang);

		JLabel lblNewLabel_1_1 = new JLabel("Địa chỉ:");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(0, 80, 145, 30);
		panel_1_1.add(lblNewLabel_1_1);

		textField_KhoHang_diaChi = new JTextField();
		textField_KhoHang_diaChi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_KhoHang_diaChi.setColumns(10);
		textField_KhoHang_diaChi.setBounds(136, 80, 329, 30);
		panel_1_1.add(textField_KhoHang_diaChi);

		JLabel lblNewLabel_4 = new JLabel("Kho Hàng");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_4.setBounds(442, 1, 93, 25);
		window_KhoHang.add(lblNewLabel_4);

		JPanel window_NhapHang = new JPanel();
		window_NhapHang.setLayout(null);
		contentPane.add(window_NhapHang, "name_273313665894499");

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(0, 605, 1000, 72);
		window_NhapHang.add(panel_3_1);

		JButton jButton_Insert_1 = new JButton("Insert");
		jButton_Insert_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Insert_1.setBackground(UIManager.getColor("Button.background"));
		jButton_Insert_1.setBounds(61, 10, 152, 52);
		panel_3_1.add(jButton_Insert_1);

		JButton jButton_Edit_1 = new JButton("Edit");
		jButton_Edit_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Edit_1.setBounds(237, 10, 152, 52);
		panel_3_1.add(jButton_Edit_1);

		JButton jButton_Delete_1 = new JButton("Delete");
		jButton_Delete_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Delete_1.setBounds(417, 10, 152, 52);
		panel_3_1.add(jButton_Delete_1);

		JButton JButton_Save_1 = new JButton("Save");
		JButton_Save_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		JButton_Save_1.setBackground(UIManager.getColor("Button.light"));
		JButton_Save_1.setBounds(600, 10, 152, 52);
		panel_3_1.add(JButton_Save_1);

		JButton jButton_Cancel_1 = new JButton("Cancel");
		jButton_Cancel_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Cancel_1.setBounds(777, 10, 152, 52);
		panel_3_1.add(jButton_Cancel_1);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 36, 1000, 364);
		window_NhapHang.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(new Object[][] { { null, null, null }, { null, null, null }, },
				new String[] { "New column", "New column", "New column" }));
		scrollPane_1.setViewportView(table_1);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(10, 417, 998, 121);
		window_NhapHang.add(panel_1_1_1);

		JLabel lblNewLabel_2 = new JLabel("Mã sản phẩm:");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(0, 0, 145, 30);
		panel_1_1_1.add(lblNewLabel_2);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(136, 0, 329, 30);
		panel_1_1_1.add(textField_5);

		JLabel lblNewLabel_1_3 = new JLabel("Tên sản phẩm:");
		lblNewLabel_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(0, 40, 145, 30);
		panel_1_1_1.add(lblNewLabel_1_3);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(136, 40, 329, 30);
		panel_1_1_1.add(textField_6);

		JLabel lblNewLabel_1_1_1 = new JLabel("Đơn vị tính:");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(0, 80, 145, 30);
		panel_1_1_1.add(lblNewLabel_1_1_1);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(136, 80, 329, 30);
		panel_1_1_1.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(659, 0, 329, 30);
		panel_1_1_1.add(textField_8);

		JLabel lblTnKhoHng_1 = new JLabel("Tên kho hàng:");
		lblTnKhoHng_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblTnKhoHng_1.setBounds(523, 0, 145, 30);
		panel_1_1_1.add(lblTnKhoHng_1);

		JLabel lblNewLabel_1_2_1 = new JLabel("Số lượng: ");
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_1_2_1.setBounds(523, 40, 145, 30);
		panel_1_1_1.add(lblNewLabel_1_2_1);

		textField_9 = new JTextField();
		textField_9.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(659, 40, 329, 30);
		panel_1_1_1.add(textField_9);

		JLabel lblNewLabel_4_1 = new JLabel("Nhập Hàng");
		lblNewLabel_4_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(442, 1, 123, 25);
		window_NhapHang.add(lblNewLabel_4_1);

		JPanel window_XuatHang = new JPanel();
		window_XuatHang.setLayout(null);
		contentPane.add(window_XuatHang, "name_273344758974400");

		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(0, 605, 1000, 72);
		window_XuatHang.add(panel_3_2);

		JButton jButton_Insert_2 = new JButton("Insert");
		jButton_Insert_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Insert_2.setBackground(UIManager.getColor("Button.background"));
		jButton_Insert_2.setBounds(61, 10, 152, 52);
		panel_3_2.add(jButton_Insert_2);

		JButton jButton_Edit_2 = new JButton("Edit");
		jButton_Edit_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Edit_2.setBounds(237, 10, 152, 52);
		panel_3_2.add(jButton_Edit_2);

		JButton jButton_Delete_2 = new JButton("Delete");
		jButton_Delete_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Delete_2.setBounds(417, 10, 152, 52);
		panel_3_2.add(jButton_Delete_2);

		JButton JButton_Save_2 = new JButton("Save");
		JButton_Save_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		JButton_Save_2.setBackground(UIManager.getColor("Button.light"));
		JButton_Save_2.setBounds(600, 10, 152, 52);
		panel_3_2.add(JButton_Save_2);

		JButton jButton_Cancel_2 = new JButton("Cancel");
		jButton_Cancel_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_Cancel_2.setBounds(777, 10, 152, 52);
		panel_3_2.add(jButton_Cancel_2);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 36, 1000, 364);
		window_XuatHang.add(scrollPane_2);

		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column", "New column" }));
		scrollPane_2.setViewportView(table_2);

		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBounds(10, 417, 998, 121);
		window_XuatHang.add(panel_1_1_2);

		JLabel lblNewLabel_3 = new JLabel("Mã sản phẩm:");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(0, 0, 145, 30);
		panel_1_1_2.add(lblNewLabel_3);

		textField_10 = new JTextField();
		textField_10.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_10.setColumns(10);
		textField_10.setBounds(136, 0, 329, 30);
		panel_1_1_2.add(textField_10);

		JLabel lblNewLabel_1_4 = new JLabel("Tên sản phẩm:");
		lblNewLabel_1_4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(0, 40, 145, 30);
		panel_1_1_2.add(lblNewLabel_1_4);

		textField_11 = new JTextField();
		textField_11.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_11.setColumns(10);
		textField_11.setBounds(136, 40, 329, 30);
		panel_1_1_2.add(textField_11);

		JLabel lblNewLabel_1_1_2 = new JLabel("Đơn vị tính:");
		lblNewLabel_1_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(0, 80, 145, 30);
		panel_1_1_2.add(lblNewLabel_1_1_2);

		textField_12 = new JTextField();
		textField_12.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_12.setColumns(10);
		textField_12.setBounds(136, 80, 329, 30);
		panel_1_1_2.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_13.setColumns(10);
		textField_13.setBounds(659, 0, 329, 30);
		panel_1_1_2.add(textField_13);

		JLabel lblTnKhoHng_2 = new JLabel("Tên kho hàng:");
		lblTnKhoHng_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblTnKhoHng_2.setBounds(523, 0, 145, 30);
		panel_1_1_2.add(lblTnKhoHng_2);

		JLabel lblNewLabel_1_2_2 = new JLabel("Số lượng: ");
		lblNewLabel_1_2_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_1_2_2.setBounds(523, 40, 145, 30);
		panel_1_1_2.add(lblNewLabel_1_2_2);

		textField_14 = new JTextField();
		textField_14.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_14.setColumns(10);
		textField_14.setBounds(659, 40, 329, 30);
		panel_1_1_2.add(textField_14);

		JLabel lblNewLabel_4_2 = new JLabel("Xuất Hàng");
		lblNewLabel_4_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(442, 1, 93, 25);
		window_XuatHang.add(lblNewLabel_4_2);
		this.setVisible(true);
	}
// tạo phương thức show giúp cập nhật
	public void showKhoHang() {
		DefaultTableModel model_KhoHang=(DefaultTableModel) table_KhoHang.getModel();
		int i_row = table_KhoHang.getSelectedRow();
		String maKhoHang = model_KhoHang.getValueAt(i_row, 0).toString();
        String tenKhoHang = model_KhoHang.getValueAt(i_row, 1).toString();
        String diaChi = model_KhoHang.getValueAt(i_row, 2).toString();

        // Đặt các giá trị này vào các JTextField tương ứng trong giao diện của bạn
        this.textField_KhoHang_maKhoHang.setText(maKhoHang);
        this.textField_KhoHang_tenKhoHang.setText(tenKhoHang);
        this.textField_KhoHang_diaChi.setText(diaChi);	
	}
// tạo phương thức delete kho hàng
	public void deleteKhoHang() {
		DefaultTableModel model_KhoHang=(DefaultTableModel) table_KhoHang.getModel();
		int i_row = table_KhoHang.getSelectedRow();
		String maKhoHang = model_KhoHang.getValueAt(i_row, 0).toString();
        String tenKhoHang = model_KhoHang.getValueAt(i_row, 1).toString();
        String diaChi = model_KhoHang.getValueAt(i_row, 2).toString();
        int luaChon = JOptionPane.showConfirmDialog(contentPane, "Bạn có chắc muốn xóa");
        if (luaChon==JOptionPane.YES_OPTION) {
            KhoHangDAO.getInstance().delete(new KhoHang(maKhoHang, tenKhoHang,diaChi));
        }
        
        

        
		
		
	}
}
