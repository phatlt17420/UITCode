package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.JLayeredPane;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class QLSVView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public QLSVModel model;
	public JTextField textField_maThiSinh;
	public JTable table;
	public JTextField textField_ThongTinThiSinh_ID;
	public JTextField textField_ThongTinThiSinh_hoVaTen;
	public JTextField textField_ThongTinThiSinh_ngaySinh;
	public JTextField textField_ThongTinThiSinh_mon3;
	public JTextField textField_ThongTinThiSinh_mon1;
	public JTextField textField_ThongTinThiSinh_mon2;
	public ButtonGroup btn_gioiTinh;
	public JComboBox comboBox_ThongTinThiSinh_queQuan;
	public JComboBox comboBox_queQuan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
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
	public QLSVView() {
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1289, 995);
		QLSVController ac = new QLSVController(this);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuFile);

		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuFile.add(menuOpen);

		JMenuItem menuClose = new JMenuItem("Close");
		menuClose.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuFile.add(menuClose);

		JSeparator separator = new JSeparator();
		menuFile.add(separator);

		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuFile.add(menuExit);

		JMenu mnNewMenu = new JMenu("About");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("About Me");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setVisible(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label_QueQuan = new JLabel("Quê quán");
		label_QueQuan.setBounds(29, 22, 105, 44);
		label_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label_QueQuan);

		JLabel lblMThSinh = new JLabel("Mã Thí Sinh");
		lblMThSinh.setBounds(539, 22, 171, 44);
		lblMThSinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblMThSinh);

		textField_maThiSinh = new JTextField();
		textField_maThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_maThiSinh.setBounds(666, 22, 406, 44);
		textField_maThiSinh.setColumns(10);
		contentPane.add(textField_maThiSinh);

		JButton jButton_filter = new JButton("Filter");
		jButton_filter.addActionListener(ac);
		jButton_filter.setBounds(1099, 22, 147, 44);
		jButton_filter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(jButton_filter);

		comboBox_queQuan = new JComboBox();
		comboBox_queQuan.addItem("");
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		for (Tinh tinh : listTinh) {
			comboBox_queQuan.addItem(tinh.getTenTinh());
		}
		comboBox_queQuan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_queQuan.setBounds(158, 22, 329, 44);
		contentPane.add(comboBox_queQuan);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(39, 76, 1207, 8);
		contentPane.add(separator_1);

		JLabel label_QueQuan_1 = new JLabel("Danh sách thí sinh");
		label_QueQuan_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_QueQuan_1.setBounds(29, 94, 183, 44);
		contentPane.add(label_QueQuan_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 152, 1255, 250);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null }, },
				new String[] { "STT", "M\u00E3 th\u00ED sinh", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n",
						"Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(38);
		table.getColumnModel().getColumn(1).setPreferredWidth(136);
		scrollPane.setViewportView(table);

		JLabel label_QueQuan_1_1 = new JLabel("Thông tin thí sinh");
		label_QueQuan_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_QueQuan_1_1.setBounds(29, 412, 183, 44);
		contentPane.add(label_QueQuan_1_1);

		JLabel label_ID = new JLabel("Mã Thí Sinh");
		label_ID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_ID.setBounds(10, 457, 105, 44);
		contentPane.add(label_ID);

		textField_ThongTinThiSinh_ID = new JTextField();
		textField_ThongTinThiSinh_ID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_ThongTinThiSinh_ID.setColumns(10);
		textField_ThongTinThiSinh_ID.setBounds(137, 457, 301, 44);
		contentPane.add(textField_ThongTinThiSinh_ID);

		JLabel lblMThSinh_1_1 = new JLabel("Họ và tên");
		lblMThSinh_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMThSinh_1_1.setBounds(10, 530, 105, 44);
		contentPane.add(lblMThSinh_1_1);

		textField_ThongTinThiSinh_hoVaTen = new JTextField();
		textField_ThongTinThiSinh_hoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_ThongTinThiSinh_hoVaTen.setColumns(10);
		textField_ThongTinThiSinh_hoVaTen.setBounds(137, 530, 301, 44);
		contentPane.add(textField_ThongTinThiSinh_hoVaTen);

		JLabel lblMThSinh_1_1_1 = new JLabel("Quê quán");
		lblMThSinh_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMThSinh_1_1_1.setBounds(10, 605, 105, 44);
		contentPane.add(lblMThSinh_1_1_1);

		textField_ThongTinThiSinh_ngaySinh = new JTextField();
		textField_ThongTinThiSinh_ngaySinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_ThongTinThiSinh_ngaySinh.setColumns(10);
		textField_ThongTinThiSinh_ngaySinh.setBounds(137, 688, 301, 44);
		contentPane.add(textField_ThongTinThiSinh_ngaySinh);

		JLabel lblMThSinh_1_1_1_1 = new JLabel("Ngày sinh");
		lblMThSinh_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMThSinh_1_1_1_1.setBounds(10, 688, 105, 44);
		contentPane.add(lblMThSinh_1_1_1_1);

		comboBox_ThongTinThiSinh_queQuan = new JComboBox();
		comboBox_ThongTinThiSinh_queQuan.addItem("");

		for (Tinh tinh : listTinh) {
			comboBox_ThongTinThiSinh_queQuan.addItem(tinh.getTenTinh());
		}

		comboBox_ThongTinThiSinh_queQuan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_ThongTinThiSinh_queQuan.setBounds(137, 605, 301, 44);
		contentPane.add(comboBox_ThongTinThiSinh_queQuan);

		textField_ThongTinThiSinh_mon3 = new JTextField();
		textField_ThongTinThiSinh_mon3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_ThongTinThiSinh_mon3.setColumns(10);
		textField_ThongTinThiSinh_mon3.setBounds(793, 688, 301, 44);
		contentPane.add(textField_ThongTinThiSinh_mon3);

		JLabel lblMThSinh_1_1_1_1_1 = new JLabel("Môn 3");
		lblMThSinh_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMThSinh_1_1_1_1_1.setBounds(666, 688, 105, 44);
		contentPane.add(lblMThSinh_1_1_1_1_1);

		JLabel lblMThSinh_1_1_1_2 = new JLabel("Môn 2");
		lblMThSinh_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMThSinh_1_1_1_2.setBounds(666, 605, 105, 44);
		contentPane.add(lblMThSinh_1_1_1_2);

		JLabel textBox_ThongTinThiSinh_Mon1 = new JLabel("Môn 1");
		textBox_ThongTinThiSinh_Mon1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textBox_ThongTinThiSinh_Mon1.setBounds(666, 530, 105, 44);
		contentPane.add(textBox_ThongTinThiSinh_Mon1);

		textField_ThongTinThiSinh_mon1 = new JTextField();
		textField_ThongTinThiSinh_mon1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_ThongTinThiSinh_mon1.setColumns(10);
		textField_ThongTinThiSinh_mon1.setBounds(793, 530, 301, 44);
		contentPane.add(textField_ThongTinThiSinh_mon1);

		JLabel label_ID_1 = new JLabel("Giới tính");
		label_ID_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_ID_1.setBounds(666, 457, 105, 44);
		contentPane.add(label_ID_1);

		JRadioButton jRadio_Nam = new JRadioButton("Nam");
		jRadio_Nam.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jRadio_Nam.setBounds(818, 460, 67, 33);
		contentPane.add(jRadio_Nam);

		JRadioButton jRadio_Nu = new JRadioButton("Nữ");
		jRadio_Nu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jRadio_Nu.setBounds(973, 460, 51, 33);
		contentPane.add(jRadio_Nu);

		btn_gioiTinh = new ButtonGroup();
		btn_gioiTinh.add(jRadio_Nam);
		btn_gioiTinh.add(jRadio_Nu);

		textField_ThongTinThiSinh_mon2 = new JTextField();
		textField_ThongTinThiSinh_mon2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_ThongTinThiSinh_mon2.setColumns(10);
		textField_ThongTinThiSinh_mon2.setBounds(793, 605, 301, 44);
		contentPane.add(textField_ThongTinThiSinh_mon2);

		JButton jButton_them = new JButton("Thêm");
		jButton_them.addActionListener(ac);
		jButton_them.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jButton_them.setBounds(137, 817, 147, 44);
		contentPane.add(jButton_them);

		JButton jButton_xoa = new JButton("Xóa");
		jButton_xoa.addActionListener(ac);
		jButton_xoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jButton_xoa.setBounds(329, 817, 147, 44);
		contentPane.add(jButton_xoa);

		JButton jButton_capNhat = new JButton("Cập nhật");
		jButton_capNhat.addActionListener(ac);
		jButton_capNhat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jButton_capNhat.setBounds(538, 817, 147, 44);
		contentPane.add(jButton_capNhat);

		JButton jButton_luu = new JButton("Lưu");
		jButton_luu.addActionListener(ac);
		jButton_luu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jButton_luu.setBounds(737, 817, 147, 44);
		contentPane.add(jButton_luu);

		JButton jButton_huyBo = new JButton("Hủy bỏ");
		jButton_huyBo.addActionListener(ac);
		jButton_huyBo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButton_huyBo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jButton_huyBo.setBounds(939, 817, 147, 44);
		contentPane.add(jButton_huyBo);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(39, 776, 1207, 8);
		contentPane.add(separator_1_1);
	}

	public void xoaForm() {
		textField_maThiSinh.setText("");
		textField_ThongTinThiSinh_ID.setText("");
		textField_ThongTinThiSinh_hoVaTen.setText("");
		textField_ThongTinThiSinh_ngaySinh.setText("");
		textField_ThongTinThiSinh_mon1.setText("");
		textField_ThongTinThiSinh_mon2.setText("");
		textField_ThongTinThiSinh_mon3.setText("");
		comboBox_queQuan.setSelectedIndex(-1);
		comboBox_ThongTinThiSinh_queQuan.setSelectedIndex(-1);
		btn_gioiTinh.clearSelection();
	}

	public void themThiSinh(ThiSinh ts) {
		// TODO Auto-generated method stub
		
	}

	public void capNhatThiSinh(ThiSinh ts) {
		// TODO Auto-generated method stub
		
	}
}
