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
import java.awt.Image;

import javax.swing.ImageIcon;
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
import model.ChiTietTonKho;
import model.HangHoaTaiKhoHang;
import model.KhoHang;
import model.ThongTinDonNhapHang;
import model.ThongTinDonXuatHang;

import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import java.awt.Color;

public class QuanLyKhoHangView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardLayout;
	public JTextField textField_KhoHang_maKhoHang;
	public JTextField textField_KhoHang_tenKhoHang;
	public JTextField textField_KhoHang_diaChi;
	public JTextField textField_NhapHang_maSanPham;
	public JTextField textField_NhapHang_tenSanPham;
	public JTextField textField_NhapHang_donViTinh;
	public JTextField textField_NhapHang_soLuong;
	public JTable table_KhoHang;
	public JTable table_NhapHang;
	public JTable table_XuatHang;
	public JTextField textField_NhapHang_maDonNhap;
	public JTextField textField_NhapHang_ngayNhap;
	public JTextField textField_NhapHang_chiTiet;
	public JTextField textField_NhapHang_loaiSanPham;
	public JTextField textField_NhapHang_donGia;
	public JComboBox comboBox_KhoHang;
	public JComboBox comboBox_ThongKeKhoHang_KhoHang;
	public JTextField textField_NhapHang_tenNguoiBan;
	public JLabel JLabel_NhapHang_tongGiaTri;
	public JTextField textField_XuatHang_maDonXuat;
	public JTextField textField_XuatHang_ngayXuat;
	public JTextField textField_XuatHang_tenNguoiMua;
	public JTextField textField_HangHoa_soLuongXuat;
	public JTextField textField_HangHoa_donGiaXuat;
	public JTable table_HangHoa;
	public JTextField textField_ThongKe_tuNgay;
	public JTextField textField_ThongKe_denNgay;

	public JLabel jLabel_ThongKe_GiaTriHangXuatKho;
	public JLabel jLabel_ThongKe_GiaTriHangNhapKho;
	public JLabel jLabel_ThongKe_ChenhLech;

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
		this.setTitle("QUẢN LÝ KHO HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		QuanLyKhoHangController quanLyKhoHangController = new QuanLyKhoHangController(this);
		setBounds(100, 100, 1024, 750);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnHThng = new JMenu("Hệ thống");
		mnHThng.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnHThng);
//tạo các icon
        ImageIcon buttonIcon = new ImageIcon(QuanLyKhoHangView.class.getResource("/icon/plus.png"));
        Image scaledImage = buttonIcon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon addButtonIcon = new ImageIcon(scaledImage);
		
        ImageIcon buttonIcon1 = new ImageIcon(QuanLyKhoHangView.class.getResource("/icon/edit.png"));
        Image scaledImage1 = buttonIcon1.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon addButtonIcon1 = new ImageIcon(scaledImage1);
		
        ImageIcon buttonIcon2 = new ImageIcon(QuanLyKhoHangView.class.getResource("/icon/delete.png"));
        Image scaledImage2 = buttonIcon2.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon addButtonIcon2 = new ImageIcon(scaledImage2);
        
        ImageIcon buttonIcon3 = new ImageIcon(QuanLyKhoHangView.class.getResource("/icon/save.png"));
        Image scaledImage3 = buttonIcon3.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon addButtonIcon3 = new ImageIcon(scaledImage3);
        
        ImageIcon buttonIcon4 = new ImageIcon(QuanLyKhoHangView.class.getResource("/icon/check.png"));
        Image scaledImage4 = buttonIcon4.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon addButtonIcon4 = new ImageIcon(scaledImage4);
        
        ImageIcon buttonIcon5 = new ImageIcon(QuanLyKhoHangView.class.getResource("/icon/analytics.png"));
        Image scaledImage5 = buttonIcon5.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon addButtonIcon5 = new ImageIcon(scaledImage5);
        
		//---------------------------
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
		mnHThng.add(Menu_File_KhoHang);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Nhập Hàng");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "name_273313665894499");
				comboBox_KhoHang.removeAllItems();
				ArrayList<KhoHang> listTenKhoHang = KhoHangDAO.getInstance().selectAll();
				for (KhoHang k : listTenKhoHang) {
					comboBox_KhoHang.addItem(k.getMaKhoHang());
				}

			}
		});

		JSeparator separator = new JSeparator();
		mnHThng.add(separator);
		mnHThng.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Xuất Hàng");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "name_273344758974400");

			}
		});

		JMenuItem mntmNewMenuItem = new JMenuItem("Hàng hoá");
		mntmNewMenuItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "name_58824523322500");

				comboBox_ThongKeKhoHang_KhoHang.removeAllItems();
				ArrayList<KhoHang> listTenKhoHang_ThongKeKhoHang = KhoHangDAO.getInstance().selectAll();
				for (KhoHang k : listTenKhoHang_ThongKeKhoHang) {
					comboBox_ThongKeKhoHang_KhoHang.addItem(k.getMaKhoHang());
				}

			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnHThng.add(mntmNewMenuItem);
		mnHThng.add(mntmNewMenuItem_2);

		JSeparator separator_1 = new JSeparator();
		mnHThng.add(separator_1);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Thu-Chi");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "name_362929623415800");

			}
		});

		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnHThng.add(mntmNewMenuItem_3);

		JSeparator separator_2 = new JSeparator();
		mnHThng.add(separator_2);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Exit");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnHThng.add(mntmNewMenuItem_4);
		cardLayout = new CardLayout();
		contentPane = new JPanel(cardLayout);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JPanel window_KhoHang = new JPanel();
		window_KhoHang.setLayout(null);
		contentPane.add(window_KhoHang, "name_272539212530300");

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 541, 1000, 72);
		window_KhoHang.add(panel_3);

		JButton jButton_KhoHang_Insert = new JButton("Thêm");
//-----------------------------------------------------------

		// Gán icon đã thay đổi kích thước cho JButton
		jButton_KhoHang_Insert.setIcon(addButtonIcon);

		// ----------------------------------------------------
		jButton_KhoHang_Insert.addActionListener(quanLyKhoHangController);
		jButton_KhoHang_Insert.setActionCommand("KhoHang_Insert");
		jButton_KhoHang_Insert.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_KhoHang_Insert.setBackground(UIManager.getColor("Button.background"));
		jButton_KhoHang_Insert.setBounds(163, 10, 152, 52);
		panel_3.add(jButton_KhoHang_Insert);

		JButton jButton_KhoHang_Edit = new JButton("Sửa");
		jButton_KhoHang_Edit.setIcon(addButtonIcon1);
		jButton_KhoHang_Edit.addActionListener(quanLyKhoHangController);
		jButton_KhoHang_Edit.setActionCommand("KhoHang_Edit");
		jButton_KhoHang_Edit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_KhoHang_Edit.setBounds(339, 10, 152, 52);
		panel_3.add(jButton_KhoHang_Edit);

		JButton jButton_KhoHang_Delete = new JButton("Xoá");
		jButton_KhoHang_Delete.setIcon(addButtonIcon2);
		
		jButton_KhoHang_Delete.addActionListener(quanLyKhoHangController);
		jButton_KhoHang_Delete.setActionCommand("KhoHang_Delete");
		jButton_KhoHang_Delete.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_KhoHang_Delete.setBounds(519, 10, 152, 52);
		panel_3.add(jButton_KhoHang_Delete);

		JButton JButton_KhoHang_Save = new JButton("Lưu");
		JButton_KhoHang_Save.setIcon(addButtonIcon3);
		JButton_KhoHang_Save.addActionListener(quanLyKhoHangController);
		JButton_KhoHang_Save.setActionCommand("KhoHang_Save");
		JButton_KhoHang_Save.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		JButton_KhoHang_Save.setBackground(UIManager.getColor("Button.light"));
		JButton_KhoHang_Save.setBounds(702, 10, 152, 52);
		panel_3.add(JButton_KhoHang_Save);


		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 95, 1000, 305);
		window_KhoHang.add(scrollPane);

		table_KhoHang = new JTable();
		table_KhoHang.setRowHeight(30);
		table_KhoHang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		table_KhoHang.setModel(new DefaultTableModel(new Object[][] {}, new String[] {}));
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

		JLabel lblNewLabel_4 = new JLabel("DANH SÁCH KHO HÀNG ĐANG QUẢN LÝ");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_4.setBounds(320, 33, 371, 25);
		window_KhoHang.add(lblNewLabel_4);

		JPanel window_NhapHang = new JPanel();
		window_NhapHang.setLayout(null);
		contentPane.add(window_NhapHang, "name_273313665894499");

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(0, 576, 1000, 72);
		window_NhapHang.add(panel_3_1);

		JButton JButton_NhapHang_Save = new JButton("Duyệt Nhập Hàng");
		JButton_NhapHang_Save.addActionListener(quanLyKhoHangController);
		JButton_NhapHang_Save.setActionCommand("NhapHang_Save");
		JButton_NhapHang_Save.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		JButton_NhapHang_Save.setBackground(UIManager.getColor("Button.light"));
		JButton_NhapHang_Save.setBounds(401, 10, 187, 52);
		panel_3_1.add(JButton_NhapHang_Save);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 125, 1000, 247);
		window_NhapHang.add(scrollPane_1);

		table_NhapHang = new JTable();
		table_NhapHang.setRowHeight(30);
		table_NhapHang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		table_NhapHang.setModel(new DefaultTableModel(new Object[][] {}, new String[] {}));
		scrollPane_1.setViewportView(table_NhapHang);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(0, 383, 990, 195);
		window_NhapHang.add(panel_1_1_1);

		JLabel lblNewLabel_2 = new JLabel("Mã sản phẩm:");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(0, 0, 145, 30);
		panel_1_1_1.add(lblNewLabel_2);

		textField_NhapHang_maSanPham = new JTextField();
		textField_NhapHang_maSanPham.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_NhapHang_maSanPham.setColumns(10);
		textField_NhapHang_maSanPham.setBounds(136, 0, 329, 30);
		panel_1_1_1.add(textField_NhapHang_maSanPham);

		JLabel lblNewLabel_1_3 = new JLabel("Tên sản phẩm:");
		lblNewLabel_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(0, 40, 145, 30);
		panel_1_1_1.add(lblNewLabel_1_3);

		textField_NhapHang_tenSanPham = new JTextField();
		textField_NhapHang_tenSanPham.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_NhapHang_tenSanPham.setColumns(10);
		textField_NhapHang_tenSanPham.setBounds(136, 40, 329, 30);
		panel_1_1_1.add(textField_NhapHang_tenSanPham);

		JLabel lblNewLabel_1_1_1 = new JLabel("Đơn vị tính:");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(0, 80, 145, 30);
		panel_1_1_1.add(lblNewLabel_1_1_1);

		textField_NhapHang_donViTinh = new JTextField();
		textField_NhapHang_donViTinh.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_NhapHang_donViTinh.setColumns(10);
		textField_NhapHang_donViTinh.setBounds(136, 80, 329, 30);
		panel_1_1_1.add(textField_NhapHang_donViTinh);

		JLabel lblNewLabel_1_2_1 = new JLabel("Số lượng: ");
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_1_2_1.setBounds(525, 0, 145, 30);
		panel_1_1_1.add(lblNewLabel_1_2_1);

		textField_NhapHang_soLuong = new JTextField();
		textField_NhapHang_soLuong.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_NhapHang_soLuong.setColumns(10);
		textField_NhapHang_soLuong.setBounds(661, 0, 329, 30);
		panel_1_1_1.add(textField_NhapHang_soLuong);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Chi tiết:");
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(0, 160, 145, 30);
		panel_1_1_1.add(lblNewLabel_1_1_1_1);

		textField_NhapHang_chiTiet = new JTextField();
		textField_NhapHang_chiTiet.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_NhapHang_chiTiet.setColumns(10);
		textField_NhapHang_chiTiet.setBounds(136, 160, 329, 30);
		panel_1_1_1.add(textField_NhapHang_chiTiet);

		JLabel lblNewLabel_1_3_1 = new JLabel("Loại sản phẩm:");
		lblNewLabel_1_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1_3_1.setBounds(0, 120, 145, 30);
		panel_1_1_1.add(lblNewLabel_1_3_1);

		textField_NhapHang_loaiSanPham = new JTextField();
		textField_NhapHang_loaiSanPham.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_NhapHang_loaiSanPham.setColumns(10);
		textField_NhapHang_loaiSanPham.setBounds(136, 120, 329, 30);
		panel_1_1_1.add(textField_NhapHang_loaiSanPham);

		JButton jButton_themSP = new JButton("Thêm SP");
		jButton_themSP.setIcon(addButtonIcon);
		jButton_themSP.addActionListener(quanLyKhoHangController);
		jButton_themSP.setActionCommand("NhapHang_themSP");
		jButton_themSP.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_themSP.setBackground(UIManager.getColor("Button.background"));
		jButton_themSP.setBounds(568, 120, 188, 52);
		panel_1_1_1.add(jButton_themSP);

		JButton jButton_xoaSP = new JButton("Xóa SP");
		jButton_xoaSP.setIcon(addButtonIcon2);
		jButton_xoaSP.addActionListener(quanLyKhoHangController);
		jButton_xoaSP.setActionCommand("NhapHang_xoaSP");
		jButton_xoaSP.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_xoaSP.setBackground(UIManager.getColor("Button.background"));
		jButton_xoaSP.setBounds(792, 120, 188, 52);
		panel_1_1_1.add(jButton_xoaSP);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("Đơn giá:");
		lblNewLabel_1_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_1_2_1_1.setBounds(525, 40, 145, 30);
		panel_1_1_1.add(lblNewLabel_1_2_1_1);

		textField_NhapHang_donGia = new JTextField();
		textField_NhapHang_donGia.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_NhapHang_donGia.setColumns(10);
		textField_NhapHang_donGia.setBounds(661, 40, 329, 30);
		panel_1_1_1.add(textField_NhapHang_donGia);

		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Tổng giá trị:");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1.setBounds(525, 80, 145, 30);
		panel_1_1_1.add(lblNewLabel_1_2_1_1_1);

		JLabel_NhapHang_tongGiaTri = new JLabel("");
		JLabel_NhapHang_tongGiaTri.setFont(new Font("Segoe UI", Font.BOLD, 18));
		JLabel_NhapHang_tongGiaTri.setBounds(661, 80, 329, 30);
		panel_1_1_1.add(JLabel_NhapHang_tongGiaTri);

		JLabel lblNewLabel_4_1 = new JLabel("ĐƠN NHẬP HÀNG");
		lblNewLabel_4_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(434, 1, 190, 25);
		window_NhapHang.add(lblNewLabel_4_1);

		JPanel panel = new JPanel();
		panel.setBounds(0, 33, 1000, 91);
		window_NhapHang.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2_1 = new JLabel("Mã đơn nhập:");
		lblNewLabel_2_1.setBounds(10, 13, 114, 25);
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel.add(lblNewLabel_2_1);

		textField_NhapHang_maDonNhap = new JTextField();
		textField_NhapHang_maDonNhap.setBounds(134, 10, 173, 31);
		textField_NhapHang_maDonNhap.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_NhapHang_maDonNhap.setColumns(10);
		panel.add(textField_NhapHang_maDonNhap);

		JLabel lblNewLabel_2_1_1 = new JLabel("Ngày nhập:");
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(316, 10, 114, 25);
		panel.add(lblNewLabel_2_1_1);

		textField_NhapHang_ngayNhap = new JTextField();
		textField_NhapHang_ngayNhap.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_NhapHang_ngayNhap.setColumns(10);
		textField_NhapHang_ngayNhap.setBounds(426, 10, 166, 31);
		panel.add(textField_NhapHang_ngayNhap);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("Kho Hàng:");
		lblNewLabel_2_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1.setBounds(616, 16, 114, 25);
		panel.add(lblNewLabel_2_1_1_1);
		// tạo list chọn Kho Hàng cho Bảng Nhập hàng
		comboBox_KhoHang = new JComboBox();
		comboBox_KhoHang.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		comboBox_KhoHang.setBounds(717, 11, 262, 37);
		panel.add(comboBox_KhoHang);

		JLabel lblNewLabel_2_1_2 = new JLabel("Người bán:");
		lblNewLabel_2_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2_1_2.setBounds(10, 52, 114, 25);
		panel.add(lblNewLabel_2_1_2);

		textField_NhapHang_tenNguoiBan = new JTextField();
		textField_NhapHang_tenNguoiBan.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_NhapHang_tenNguoiBan.setColumns(10);
		textField_NhapHang_tenNguoiBan.setBounds(134, 49, 173, 31);
		panel.add(textField_NhapHang_tenNguoiBan);

		JPanel window_XuatHang = new JPanel();
		window_XuatHang.setLayout(null);
		contentPane.add(window_XuatHang, "name_273344758974400");

		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(0, 583, 1000, 72);
		window_XuatHang.add(panel_3_2);

		JButton JButton_Save_2 = new JButton("Duyệt Xuất Hàng");
		JButton_Save_2.addActionListener(quanLyKhoHangController);
		JButton_Save_2.setActionCommand("XuatHang_DuyetXuatHang");
		JButton_Save_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		JButton_Save_2.setBackground(UIManager.getColor("Button.light"));
		JButton_Save_2.setBounds(246, 10, 228, 52);
		panel_3_2.add(JButton_Save_2);

		JButton JButton_Save_2_1 = new JButton("Huỷ bỏ");
		JButton_Save_2_1.addActionListener(quanLyKhoHangController);
		JButton_Save_2_1.setActionCommand("jButton_XuatHang_HuyBo");
		JButton_Save_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		JButton_Save_2_1.setBackground(UIManager.getColor("Button.light"));
		JButton_Save_2_1.setBounds(507, 10, 228, 52);
		panel_3_2.add(JButton_Save_2_1);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 140, 1000, 349);
		window_XuatHang.add(scrollPane_2);

		table_XuatHang = new JTable();
		table_XuatHang.setRowHeight(30);
		table_XuatHang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		table_XuatHang.setModel(new DefaultTableModel(new Object[][] { {}, {}, }, new String[] {}));
		scrollPane_2.setViewportView(table_XuatHang);

		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBounds(10, 500, 998, 72);
		window_XuatHang.add(panel_1_1_2);

		JButton jButton_XuatHang_XoaSanPham = new JButton("Xoá sản phẩm");
		jButton_XuatHang_XoaSanPham.setIcon(addButtonIcon2);
		jButton_XuatHang_XoaSanPham.addActionListener(quanLyKhoHangController);
		jButton_XuatHang_XoaSanPham.setActionCommand("XuatHang_XoaSanPham");
		jButton_XuatHang_XoaSanPham.setBounds(770, 10, 189, 52);
		panel_1_1_2.add(jButton_XuatHang_XoaSanPham);

		jButton_XuatHang_XoaSanPham.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lblNewLabel_4_2 = new JLabel("ĐƠN XUẤT HÀNG");
		lblNewLabel_4_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(426, 1, 171, 25);
		window_XuatHang.add(lblNewLabel_4_2);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(0, 28, 1000, 102);
		window_XuatHang.add(panel_2_1);

		JLabel lblNewLabel_2_1_3_1 = new JLabel("Mã đơn xuất:");
		lblNewLabel_2_1_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2_1_3_1.setBounds(10, 13, 114, 25);
		panel_2_1.add(lblNewLabel_2_1_3_1);

		textField_XuatHang_maDonXuat = new JTextField();
		textField_XuatHang_maDonXuat.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_XuatHang_maDonXuat.setColumns(10);
		textField_XuatHang_maDonXuat.setBounds(134, 10, 173, 31);
		panel_2_1.add(textField_XuatHang_maDonXuat);

		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("Ngày xuất:");
		lblNewLabel_2_1_1_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2_1_1_2_1.setBounds(316, 10, 114, 25);
		panel_2_1.add(lblNewLabel_2_1_1_2_1);

		textField_XuatHang_ngayXuat = new JTextField();
		textField_XuatHang_ngayXuat.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_XuatHang_ngayXuat.setColumns(10);
		textField_XuatHang_ngayXuat.setBounds(426, 10, 166, 31);
		panel_2_1.add(textField_XuatHang_ngayXuat);

		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("Người mua:");
		lblNewLabel_2_1_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2_1_2_1_1.setBounds(10, 64, 114, 25);
		panel_2_1.add(lblNewLabel_2_1_2_1_1);

		textField_XuatHang_tenNguoiMua = new JTextField();
		textField_XuatHang_tenNguoiMua.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_XuatHang_tenNguoiMua.setColumns(10);
		textField_XuatHang_tenNguoiMua.setBounds(134, 61, 173, 31);
		panel_2_1.add(textField_XuatHang_tenNguoiMua);

		JPanel window_HangHoaTaiKhoHang = new JPanel();
		window_HangHoaTaiKhoHang.setLayout(null);
		contentPane.add(window_HangHoaTaiKhoHang, "name_58824523322500");

		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(0, 145, 1000, 356);
		window_HangHoaTaiKhoHang.add(scrollPane_1_1);

		table_HangHoa = new JTable();
		table_HangHoa.setRowHeight(30);
		table_HangHoa.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		table_HangHoa.setModel(new DefaultTableModel(new Object[][] {}, new String[] {}));
		scrollPane_1_1.setViewportView(table_HangHoa);

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBounds(10, 508, 990, 100);
		window_HangHoaTaiKhoHang.add(panel_1_1_1_1);

		JLabel lblNewLabel_1_2_1_2 = new JLabel("Số lượng xuất: ");
		lblNewLabel_1_2_1_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_1_2_1_2.setBounds(250, 10, 145, 30);
		panel_1_1_1_1.add(lblNewLabel_1_2_1_2);

		textField_HangHoa_soLuongXuat = new JTextField();
		textField_HangHoa_soLuongXuat.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_HangHoa_soLuongXuat.setColumns(10);
		textField_HangHoa_soLuongXuat.setBounds(386, 10, 329, 30);
		panel_1_1_1_1.add(textField_HangHoa_soLuongXuat);

		JLabel lblNewLabel_1_2_1_1_2 = new JLabel("Đơn giá xuất:");
		lblNewLabel_1_2_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_2.setBounds(250, 50, 145, 30);
		panel_1_1_1_1.add(lblNewLabel_1_2_1_1_2);

		textField_HangHoa_donGiaXuat = new JTextField();
		textField_HangHoa_donGiaXuat.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_HangHoa_donGiaXuat.setColumns(10);
		textField_HangHoa_donGiaXuat.setBounds(386, 50, 329, 30);
		panel_1_1_1_1.add(textField_HangHoa_donGiaXuat);

		JLabel JLabel_NhapHang_tongGiaTri_1 = new JLabel("");
		JLabel_NhapHang_tongGiaTri_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		JLabel_NhapHang_tongGiaTri_1.setBounds(661, 80, 329, 30);
		panel_1_1_1_1.add(JLabel_NhapHang_tongGiaTri_1);

		JButton jButton_HangHoa_ThemVaoDonXuat = new JButton("Thêm vào Đơn xuất");
		jButton_HangHoa_ThemVaoDonXuat.setIcon(addButtonIcon);
		jButton_HangHoa_ThemVaoDonXuat.addActionListener(quanLyKhoHangController);
		jButton_HangHoa_ThemVaoDonXuat.setActionCommand("HangHoa_ThemHangHoaVaoDonXuat");
		jButton_HangHoa_ThemVaoDonXuat.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_HangHoa_ThemVaoDonXuat.setBackground(UIManager.getColor("Button.background"));
		jButton_HangHoa_ThemVaoDonXuat.setBounds(746, 14, 234, 52);
		panel_1_1_1_1.add(jButton_HangHoa_ThemVaoDonXuat);

		JLabel lblNewLabel_4_1_1 = new JLabel("HÀNG HOÁ TẠI CÁC KHO");
		lblNewLabel_4_1_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_4_1_1.setBounds(373, 10, 296, 25);
		window_HangHoaTaiKhoHang.add(lblNewLabel_4_1_1);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 55, 1000, 65);
		window_HangHoaTaiKhoHang.add(panel_1);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Chọn kho hàng:");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1_1.setBounds(42, 15, 176, 25);
		panel_1.add(lblNewLabel_2_1_1_1_1);

		comboBox_ThongKeKhoHang_KhoHang = new JComboBox();
		comboBox_ThongKeKhoHang_KhoHang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		comboBox_ThongKeKhoHang_KhoHang.setBounds(239, 9, 262, 37);
		panel_1.add(comboBox_ThongKeKhoHang_KhoHang);

		JButton jButton_HangHoa_KiemTraHang = new JButton("Kiểm tra hàng");
		jButton_HangHoa_KiemTraHang.setIcon(addButtonIcon4);
		jButton_HangHoa_KiemTraHang.addActionListener(quanLyKhoHangController);
		jButton_HangHoa_KiemTraHang.setActionCommand("HangHoa_KiemTraHang");
		jButton_HangHoa_KiemTraHang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_HangHoa_KiemTraHang.setBackground(UIManager.getColor("Button.background"));
		jButton_HangHoa_KiemTraHang.setBounds(552, 1, 201, 52);
		panel_1.add(jButton_HangHoa_KiemTraHang);

		JPanel window_ThongKe = new JPanel();
		window_ThongKe.setLayout(null);
		contentPane.add(window_ThongKe, "name_362929623415800");

		JLabel lblNewLabel_4_3 = new JLabel("THỐNG KÊ");
		lblNewLabel_4_3.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_4_3.setBounds(430, 27, 265, 50);
		window_ThongKe.add(lblNewLabel_4_3);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 526, 990, 72);
		window_ThongKe.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("Từ ngày:");
		lblNewLabel_2_1_3_1_1.setBounds(28, 25, 108, 25);
		lblNewLabel_2_1_3_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_2.add(lblNewLabel_2_1_3_1_1);

		textField_ThongKe_tuNgay = new JTextField();
		textField_ThongKe_tuNgay.setBounds(141, 22, 166, 31);
		textField_ThongKe_tuNgay.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_ThongKe_tuNgay.setColumns(10);
		panel_2.add(textField_ThongKe_tuNgay);

		JLabel lblNewLabel_2_1_1_2_1_1 = new JLabel("Đến ngày");
		lblNewLabel_2_1_1_2_1_1.setBounds(344, 24, 87, 25);
		lblNewLabel_2_1_1_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_2.add(lblNewLabel_2_1_1_2_1_1);

		textField_ThongKe_denNgay = new JTextField();
		textField_ThongKe_denNgay.setBounds(436, 21, 166, 31);
		textField_ThongKe_denNgay.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_ThongKe_denNgay.setColumns(10);
		panel_2.add(textField_ThongKe_denNgay);

		JButton jButton_KhoHang_Insert_1_1 = new JButton("Thống Kê");
		jButton_KhoHang_Insert_1_1.setIcon(addButtonIcon5);
		
		jButton_KhoHang_Insert_1_1.addActionListener(quanLyKhoHangController);
		jButton_KhoHang_Insert_1_1.setActionCommand("ThongKe_ThongKe");

		jButton_KhoHang_Insert_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jButton_KhoHang_Insert_1_1.setBackground(UIManager.getColor("Button.background"));
		jButton_KhoHang_Insert_1_1.setBounds(773, 10, 152, 52);
		panel_2.add(jButton_KhoHang_Insert_1_1);

		JLabel lblNewLabel_3 = new JLabel("Tổng giá trị hàng đã nhập kho:");
		lblNewLabel_3.setForeground(SystemColor.textHighlight);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3.setBounds(145, 144, 305, 50);
		window_ThongKe.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Tổng giá trị hàng đã xuất kho:");
		lblNewLabel_3_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(145, 223, 304, 50);
		window_ThongKe.add(lblNewLabel_3_1);

		jLabel_ThongKe_GiaTriHangNhapKho = new JLabel("");
		jLabel_ThongKe_GiaTriHangNhapKho.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_ThongKe_GiaTriHangNhapKho.setBounds(460, 144, 324, 50);
		window_ThongKe.add(jLabel_ThongKe_GiaTriHangNhapKho);

		jLabel_ThongKe_GiaTriHangXuatKho = new JLabel("");
		jLabel_ThongKe_GiaTriHangXuatKho.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_ThongKe_GiaTriHangXuatKho.setBounds(459, 223, 324, 50);
		window_ThongKe.add(jLabel_ThongKe_GiaTriHangXuatKho);

		JLabel lblNewLabel_3_1_1 = new JLabel("CHÊNH LỆCH THU - CHI:");
		lblNewLabel_3_1_1.setForeground(new Color(51, 51, 255));
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel_3_1_1.setBounds(194, 334, 256, 50);
		window_ThongKe.add(lblNewLabel_3_1_1);

		jLabel_ThongKe_ChenhLech = new JLabel("");
		jLabel_ThongKe_ChenhLech.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_ThongKe_ChenhLech.setBounds(460, 334, 324, 50);
		window_ThongKe.add(jLabel_ThongKe_ChenhLech);
		this.setVisible(true);
	}

// tạo phương thức show giúp cập nhật
	public void showKhoHang() {
		DefaultTableModel model_KhoHang = (DefaultTableModel) table_KhoHang.getModel();
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
		DefaultTableModel model_KhoHang = (DefaultTableModel) table_KhoHang.getModel();
		int i_row = table_KhoHang.getSelectedRow();
		String maKhoHang = model_KhoHang.getValueAt(i_row, 0).toString();
		String tenKhoHang = model_KhoHang.getValueAt(i_row, 1).toString();
		String diaChi = model_KhoHang.getValueAt(i_row, 2).toString();
		int luaChon = JOptionPane.showConfirmDialog(contentPane, "Bạn có chắc muốn xóa");
		if (luaChon == JOptionPane.YES_OPTION) {
			KhoHangDAO.getInstance().delete(new KhoHang(maKhoHang, tenKhoHang, diaChi));
		}

	}

	public void showTable_NhapHang(ArrayList<ThongTinDonNhapHang> thongTinDonNhapHang) {
		String[] columnName = { "Mã sản phẩm", "Tên sản phẩm", "ĐVT", "Loại sản phẩm", "Chi Tiết", "Số lượng",
				"Đơn giá" }; // tạo tên cột cho bảng

		DefaultTableModel model_NhapHang = new DefaultTableModel(columnName, 0);

		for (ThongTinDonNhapHang k : thongTinDonNhapHang) {
			model_NhapHang.addRow(new Object[] { k.getDonNhapHang_maSanPham(), k.getDonNhapHang_tenSanPham(),
					k.getDonNhapHang_donViTinh(), k.getDonNhapHang_tenLoaiSanPham(), k.getDonNhapHang_chiTiet(),
					k.getDonNhapHang_soLuong(), k.getDonNhapHang_donGia() });
		}
		table_NhapHang.setModel(model_NhapHang);

	}

	public void deleteTable_NhapHang(ArrayList<ThongTinDonNhapHang> thongTinDonNhapHang) {
		DefaultTableModel model_NhapHang = (DefaultTableModel) table_NhapHang.getModel();
		int i_row = table_NhapHang.getSelectedRow();
		String maSanPhamXoa = table_NhapHang.getValueAt(i_row, 0).toString();
		thongTinDonNhapHang.removeIf(k -> k.getDonNhapHang_maSanPham().equals(maSanPhamXoa));
		System.out.println(maSanPhamXoa);
		int luaChon = JOptionPane.showConfirmDialog(contentPane, "Bạn có chắc muốn xóa");
		if (luaChon == JOptionPane.YES_OPTION) {
			model_NhapHang.removeRow(luaChon);
		}

	}

	public void deleteTable_XuatHang(ArrayList<ThongTinDonXuatHang> thongTinDonXuatHang) {
		DefaultTableModel model_XuatHang = (DefaultTableModel) table_XuatHang.getModel();
		int i_row = table_XuatHang.getSelectedRow();
		String maSanPhamXoa = table_XuatHang.getValueAt(i_row, 0).toString();
		thongTinDonXuatHang.removeIf(k -> k.getDonXuatHang_maSanPham().equals(maSanPhamXoa));
		System.out.println(maSanPhamXoa);
		int luaChon = JOptionPane.showConfirmDialog(contentPane, "Bạn có chắc muốn xóa");
		if (luaChon == JOptionPane.YES_OPTION) {
			model_XuatHang.removeRow(luaChon);
		}

	}

	public void showTable_HangHoa(ArrayList<ChiTietTonKho> listChiTietTonKho) {

		String[] columnName = { "Mã Kho Hàng", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số lượng tồn kho" };
		DefaultTableModel model_HangHoa = new DefaultTableModel(columnName, 0);
		for (ChiTietTonKho hh : listChiTietTonKho) {
			model_HangHoa.addRow(
					new Object[] { hh.getMaKhoHang(), hh.getMaSanPham(), hh.getTenSanPHam(), hh.getSoLuongTonKho() });
		}
		table_HangHoa.setModel(model_HangHoa);

	}

	public void showThongTinDonXuatHang(ArrayList<ThongTinDonXuatHang> list) {

		String[] columnName = { "Mã Kho Hàng", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số lượng xuất kho", "Đơn giá xuất kho" };
		DefaultTableModel model_XuatHang = new DefaultTableModel(columnName, 0);

		for (ThongTinDonXuatHang ttdxh : list) {
			model_XuatHang.addRow(new Object[] { ttdxh.getDonXuatHang_maKhoHang(), ttdxh.getDonXuatHang_maSanPham(),
					ttdxh.getDonXuatHang_tenSanPham(), ttdxh.getDonXuatHang_soLuongXuatKho(),
					ttdxh.getDonXuatHang_donGia() });
		}

		table_XuatHang.setModel(model_XuatHang);
	}
}
