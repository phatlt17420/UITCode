package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.ChiTietDonNhapHangDAO;
import dao.ChiTietDonXuatHangDAO;
import dao.ChiTietTonKhoDAO;
import dao.DonNhapHangDAO;
import dao.DonXuatHangDAO;

import dao.KhoHangDAO;
import dao.SanPhamDAO;
import database.JDBCUtil;
import model.ChiTietDonNhapHang;
import model.ChiTietDonXuatHang;
import model.ChiTietTonKho;
import model.DonNhapHang;
import model.DonXuatHang;
import model.HangHoaTaiKhoHang;
import model.KhoHang;
import model.SanPham;
import model.ThongTinDonNhapHang;
import model.ThongTinDonXuatHang;
import view.QuanLyKhoHangView;

public class QuanLyKhoHangController implements ActionListener {
	private QuanLyKhoHangView quanLyKhoHangView;
	public ArrayList<ThongTinDonNhapHang> thongTinDonNhapHang = new ArrayList<ThongTinDonNhapHang>();
	public ArrayList<ThongTinDonXuatHang> thongTinDonXuatHang = new ArrayList<ThongTinDonXuatHang>();

	public QuanLyKhoHangController(QuanLyKhoHangView quanLyKhoHangView) {
		this.quanLyKhoHangView = quanLyKhoHangView;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String pressButton = e.getActionCommand();
		if (pressButton.equals("KhoHang_Insert")) {
			quanLyKhoHangView.textField_KhoHang_maKhoHang.setText("");
			quanLyKhoHangView.textField_KhoHang_tenKhoHang.setText("");
			quanLyKhoHangView.textField_KhoHang_diaChi.setText("");
		} else if (pressButton.equals("KhoHang_Edit")) {
			this.quanLyKhoHangView.showKhoHang();

		} else if (pressButton.equals("KhoHang_Delete")) {
			this.quanLyKhoHangView.deleteKhoHang();
			this.refreshKhoHang();
		} else if (pressButton.equals("KhoHang_Save")) {
			// lấy dữ liệu từ database
			ArrayList<KhoHang> list = KhoHangDAO.getInstance().selectAll();

			String maKhoHang = quanLyKhoHangView.textField_KhoHang_maKhoHang.getText();
			String tenKhoHang = quanLyKhoHangView.textField_KhoHang_tenKhoHang.getText();
			String diaChi = quanLyKhoHangView.textField_KhoHang_diaChi.getText();

			// Kiểm tra mã kho hàng đã tồn tại chưa
			if (KhoHang.checkExit(list, maKhoHang)) {
				// nếu đã tồn tại thì thực hiện edit
				String tenKhoHang1 = quanLyKhoHangView.textField_KhoHang_tenKhoHang.getText();
				String diaChi1 = quanLyKhoHangView.textField_KhoHang_diaChi.getText();
				KhoHangDAO.getInstance().update(new KhoHang(maKhoHang, tenKhoHang1, diaChi1));
				this.refreshKhoHang();
			} else {
				// nếu chưa tồn tại thì thêm vào
				KhoHangDAO.getInstance().insert(new KhoHang(maKhoHang, tenKhoHang, diaChi));
				this.refreshKhoHang();
				// cho load danh sách kho hàng lên ==> tạo hàm riêng
//				ArrayList<KhoHang> list2 = KhoHangDAO.getInstance().selectAll();
//				String[] columnName = { "Mã kho hàng", "Tên kho hàng", "Địa chỉ kho hàng" }; // tạo tên cột cho bảng
//				DefaultTableModel model = new DefaultTableModel(columnName, 0);
//				for (KhoHang k : list2) {
//					model.addRow(new Object[] { k.getMaKhoHang(), k.getTenKhoHang(), k.getDiaChi() });
//				}
//				quanLyKhoHangView.table_KhoHang.setModel(model);
			}
		} else if (pressButton.equals("KhoHang_Cancel")) {

		} else if (pressButton.equals("NhapHang_themSP")) {

			// thêm sản phẩm vào table_nhập hàng
			String maKhoHang = quanLyKhoHangView.comboBox_KhoHang.getSelectedItem().toString();
			String maDonNhap = quanLyKhoHangView.textField_NhapHang_maDonNhap.getText();
			String tenSanPham = quanLyKhoHangView.textField_NhapHang_tenSanPham.getText();
			String maSanPham = quanLyKhoHangView.textField_NhapHang_maSanPham.getText().toUpperCase();
			String tenLoaiSanPham = quanLyKhoHangView.textField_NhapHang_loaiSanPham.getText();

			String donViTinh = quanLyKhoHangView.textField_NhapHang_donViTinh.getText();

			String chiTiet = quanLyKhoHangView.textField_NhapHang_chiTiet.getText();
			int soLuong = 0;
			try {
				soLuong = Integer.parseInt(quanLyKhoHangView.textField_NhapHang_soLuong.getText() + "");
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int donGia = Integer.parseInt(quanLyKhoHangView.textField_NhapHang_donGia.getText() + "");
			this.thongTinDonNhapHang.add(new ThongTinDonNhapHang(maKhoHang, maDonNhap, tenSanPham, maSanPham,
					tenLoaiSanPham, donViTinh, chiTiet, soLuong, donGia));

			this.quanLyKhoHangView.showTable_NhapHang(thongTinDonNhapHang);

		} else if (pressButton.equals("NhapHang_xoaSP")) {
			this.quanLyKhoHangView.deleteTable_NhapHang(thongTinDonNhapHang);
			for (ThongTinDonNhapHang k : thongTinDonNhapHang) {
				System.out.println(k);
			}
		} else if (pressButton.equals("NhapHang_Save")) {
			// tính toán tổng giá trị đơn hàng
			double tongGiaTriDongHang = 0;
			for (ThongTinDonNhapHang k : thongTinDonNhapHang) {
				tongGiaTriDongHang += (k.getDonNhapHang_donGia() * k.getDonNhapHang_soLuong());
			}
			// hiện thông tin lên
			this.quanLyKhoHangView.JLabel_NhapHang_tongGiaTri.setText(tongGiaTriDongHang + "");

			// hiển thị thông tin để show bảng xác nhận
			int luaChon = JOptionPane.showConfirmDialog(quanLyKhoHangView,
					"Tổng giá trị Đơn hàng: " + tongGiaTriDongHang + ". Bạn có muốn nhập đơn hàng?");
			if (luaChon == JOptionPane.YES_OPTION) {
				// Cập nhật dữ liệu vào Database
				// ------- 1. Nhập liệu Đơn Nhập Hàng vào DAtaBase--------//////
				String maDonNhap = quanLyKhoHangView.textField_NhapHang_maDonNhap.getText();
				String maKhoHang = quanLyKhoHangView.comboBox_KhoHang.getSelectedItem().toString();
				String tenNguoiBan = quanLyKhoHangView.textField_NhapHang_tenNguoiBan.getText();
				// xử lý chuyển từ String sang LocalDate
				String preNgayTao = quanLyKhoHangView.textField_NhapHang_ngayNhap.getText();
				LocalDate ngayTao = null;
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				try {
					ngayTao = LocalDate.parse(preNgayTao, formatter);
				} catch (DateTimeParseException e1) {
					System.err.println("Lỗi định dạng ngày: " + e1.getMessage());
					JOptionPane.showMessageDialog(quanLyKhoHangView,
							"Ngày nhập không hợp lệ. Vui lòng nhập ngày theo định dạng dd/MM/yyyy.");
				}
				double tongGiaTri = Double.parseDouble(quanLyKhoHangView.JLabel_NhapHang_tongGiaTri.getText());
				DonNhapHangDAO.getInstance()
						.insert(new DonNhapHang(maDonNhap, maKhoHang, tenNguoiBan, ngayTao, tongGiaTri));

				// -------- 2. Nhập liệu SanPham vào DAtaBase----------//

				for (ThongTinDonNhapHang nh : thongTinDonNhapHang) {
					// kiểm tra mã sản phẩm đã tồn tại chưa
					ArrayList<SanPham> listSanPhamDB = SanPhamDAO.getInstance().selectAll(); // lấy dữ liệu từ Database

					String maSanPhamCanTim = nh.getDonNhapHang_maSanPham();
					boolean found = false;

					for (SanPham sp : listSanPhamDB) {
						// Kiểm tra xem đối tượng sp có null không và mã sản phẩm có null không
						// Sau đó so sánh bằng phương thức .equals()
						if (sp != null && sp.getMaSanPham() != null && sp.getMaSanPham().equals(maSanPhamCanTim)) {
							found = true;

							break; // Tìm thấy rồi thì thoát vòng lặp
						}
					}

					if (found) {
						// chuyển đoạn sau sang dang show dialog hiện thông báo
						System.out.println(
								"Mã sản phẩm đã tồn tại. Không thêm mã sản phẩm" + maSanPhamCanTim + " vào Database");
						JOptionPane.showMessageDialog(quanLyKhoHangView,
								"Mã sản phẩm " + maSanPhamCanTim + " đã tồn tại.");
					} else {
						// không tìm thấy thì thêm vào Database
						SanPhamDAO.getInstance()
								.insert(new SanPham(nh.getDonNhapHang_maSanPham(), nh.getDonNhapHang_tenSanPham(),
										nh.getDonNhapHang_tenLoaiSanPham(), nh.getDonNhapHang_donViTinh(),
										nh.getDonNhapHang_chiTiet()));
					}
				}
				// -------- 3. Nhập liệu Chi tiết đơn hàng vào DataBase----------//

				// duyệt từng hàng trong table lấy dữ liệu chuyển vào database. dữ liệu đã được
				// lưu trong thongTinDonNhapHang. còn mã đơn nhập thì trong textField
				for (ThongTinDonNhapHang ttdnh : thongTinDonNhapHang) {
					ChiTietDonNhapHangDAO.getInstance()
							.insert(new ChiTietDonNhapHang(maDonNhap, ttdnh.getDonNhapHang_maSanPham(),
									ttdnh.getDonNhapHang_soLuong(), ttdnh.getDonNhapHang_donGia()));
				}
				// ---------------4. Update Chi tiết tồn kho-----------------------------
				for (ThongTinDonNhapHang ttdnh : thongTinDonNhapHang) {
					// nếu mã sản phẩm và mã kho hàng có trong ChiTietTonKho rồi thì

					// Hai chuỗi bạn muốn kiểm tra
					String maSanPhamFind = ttdnh.getDonNhapHang_maSanPham().toString();
					String maKhoHangFind = ttdnh.getDonNhapHang_maKhoHang().toString();
					String tenSanPhamind = SanPhamDAO.getInstance().getTenSanPhamByID(maSanPhamFind);
					double soLuongSanPham = ttdnh.getDonNhapHang_soLuong();

					boolean found = false; // Biến cờ để lưu kết quả
					ArrayList<ChiTietTonKho> listDSTonKho = ChiTietTonKhoDAO.getInstance().selectAll();
					for (ChiTietTonKho tonKho : listDSTonKho) {
						// Kiểm tra nếu ID của sản phẩm khớp VÀ id của kho cũng khớp thì mới đưa vào
						if (tonKho.getMaSanPham().equals(maSanPhamFind)
								&& tonKho.getMaKhoHang().equals(maKhoHangFind)) {
							found = true; // Đặt cờ thành true
							break; // Tìm thấy, không cần duyệt tiếp, thoát vòng lặp
						}
					}

					if (found) {
						// thực hiện + số lượng vào SoLuongTonKho
						ChiTietTonKhoDAO.getInstance().update(maSanPhamFind, maKhoHangFind, soLuongSanPham);
					} else {
						// nếu khồng tìm thấy thì thực hiện thêm vào bảng chi tiết tồn kho
						ChiTietTonKhoDAO.getInstance()
								.insert(new ChiTietTonKho(maKhoHangFind, maSanPhamFind, tenSanPhamind, soLuongSanPham));
					}

				}
				thongTinDonNhapHang.clear();
			}
		} else if (pressButton.equals("HangHoa_KiemTraHang")) {
			// viết truy vấn dữ liệu và tạo hiện lên table_HangHoa
			ArrayList<ChiTietTonKho> listChiTietTonKho = ChiTietTonKhoDAO.getInstance()
					.selectAll(quanLyKhoHangView.comboBox_ThongKeKhoHang_KhoHang.getSelectedItem().toString());
			// cập nhật vào table Hàng hoá trong view. tạo hàm trong view
			this.quanLyKhoHangView.showTable_HangHoa(listChiTietTonKho);

		} else if (pressButton.equals("HangHoa_ThemHangHoaVaoDonXuat")) {
			// viết chức năng khi ấn thêm vào đơn xuất tại HangHoa.
			// 1. lấy thông tin từ table_HangHoa ra
			DefaultTableModel model_HangHoa = (DefaultTableModel) quanLyKhoHangView.table_HangHoa.getModel();
			int i_row = quanLyKhoHangView.table_HangHoa.getSelectedRow();
			String table_HangHoa_maKhoHang = model_HangHoa.getValueAt(i_row, 0).toString();
			String table_HangHoa_maSanPham = model_HangHoa.getValueAt(i_row, 1).toString();
			String table_HangHoa_tenSanPham = model_HangHoa.getValueAt(i_row, 2).toString();
			double table_HangHoa_soLuongXuatKho = Double
					.parseDouble(quanLyKhoHangView.textField_HangHoa_soLuongXuat.getText());
			double table_HangHoa_donGiaXuatKho = Double
					.parseDouble(quanLyKhoHangView.textField_HangHoa_donGiaXuat.getText());

			ThongTinDonXuatHang itemAddVaoDonXuat = new ThongTinDonXuatHang(table_HangHoa_maKhoHang,
					table_HangHoa_maSanPham, table_HangHoa_tenSanPham, table_HangHoa_soLuongXuatKho,
					table_HangHoa_donGiaXuatKho);
			int luaChon = JOptionPane.showConfirmDialog(quanLyKhoHangView, "Bạn muốn chuyển: "
					+ table_HangHoa_soLuongXuatKho + " " + table_HangHoa_tenSanPham + "với giá: " + "vào Đơn xuất");
			if (luaChon == JOptionPane.YES_OPTION) {
				thongTinDonXuatHang.add(itemAddVaoDonXuat); // thêm vào model, ArrayList để lưu xử lý
				this.quanLyKhoHangView.showThongTinDonXuatHang(thongTinDonXuatHang); // thêm vào giao diện
			}

		} else if (pressButton.equals("XuatHang_DuyetXuatHang")) {

			// làm duyệt xuất hàng
			// tính toán tổng giá trị đơn hàng
			double tongGiaTriDonHangXuat = 0;
			for (ThongTinDonXuatHang k : thongTinDonXuatHang) {
				tongGiaTriDonHangXuat += (k.getDonXuatHang_donGia() * k.getDonXuatHang_soLuongXuatKho());
			}
			// hiện thông tin lên để xác nhận
			this.quanLyKhoHangView.JLabel_NhapHang_tongGiaTri.setText(tongGiaTriDonHangXuat + "");

			// hiển thị thông tin để show bảng xác nhận
			int luaChon = JOptionPane.showConfirmDialog(quanLyKhoHangView,
					"Tổng giá trị Đơn hàng xuất: " + tongGiaTriDonHangXuat + ". Bạn có muốn xuất đơn hàng?");
			if (luaChon == JOptionPane.YES_OPTION) {
				// Cập nhật dữ liệu vào Database
				// ------- 1. Nhập liệu Đơn Xuất Hàng vào DAtaBase--------//////
				String maDonXuat = quanLyKhoHangView.textField_XuatHang_maDonXuat.getText();

				String tenNguoiMua = quanLyKhoHangView.textField_XuatHang_tenNguoiMua.getText();
				// xử lý chuyển từ String sang LocalDate
				String preNgayTao = quanLyKhoHangView.textField_XuatHang_ngayXuat.getText();
				LocalDate ngayTao = null;
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				try {
					ngayTao = LocalDate.parse(preNgayTao, formatter);
				} catch (DateTimeParseException e1) {
					System.err.println("Lỗi định dạng ngày: " + e1.getMessage());
					JOptionPane.showMessageDialog(quanLyKhoHangView,
							"Ngày nhập không hợp lệ. Vui lòng nhập ngày theo định dạng dd/MM/yyyy.");
				}
				DonXuatHangDAO.getInstance()
						.insert(new DonXuatHang(maDonXuat, tenNguoiMua, ngayTao, tongGiaTriDonHangXuat));

				// -------- 2. Nhập liệu Chi tiết đơn xuất hàng vào DAtaBase----------//

				// duyệt từng hàng trong table lấy dữ liệu chuyển vào database. dữ liệu đã được
				// lưu trong thongTinDonXuatHang
				for (ThongTinDonXuatHang ttdxh : thongTinDonXuatHang) {

					ChiTietDonXuatHangDAO.getInstance()
							.insert(new ChiTietDonXuatHang(maDonXuat, ttdxh.getDonXuatHang_maSanPham(),
									ttdxh.getDonXuatHang_soLuongXuatKho(), ttdxh.getDonXuatHang_donGia()));
				}
				// Thực hiện cập nhật ở ChiTietTonKho
				for (ThongTinDonXuatHang ttdxh : thongTinDonXuatHang) {
					// tìm mã kho và mã sản phẩm trung sau đó thực hiện điều chỉnh
					ArrayList<ChiTietTonKho> listDSTonKho = ChiTietTonKhoDAO.getInstance().selectAll();
					for (ChiTietTonKho tonKho : listDSTonKho) {
						// Kiểm tra nếu ID của sản phẩm khớp VÀ id của kho cũng khớp thì mới đưa vào
						if (tonKho.getMaSanPham().equals(ttdxh.getDonXuatHang_maSanPham())
								&& tonKho.getMaKhoHang().equals(ttdxh.getDonXuatHang_maKhoHang())) {

							ChiTietTonKhoDAO.getInstance().updateXuatKho(ttdxh.getDonXuatHang_maSanPham(), // hàm thực
																											// hiện
																											// update
																											// xuat kho
									ttdxh.getDonXuatHang_maKhoHang(), ttdxh.getDonXuatHang_soLuongXuatKho());
						}
					}
				}
				thongTinDonXuatHang.clear();
			}
		} else if (pressButton.equals("XuatHang_XoaSanPham")) {
			this.quanLyKhoHangView.deleteTable_XuatHang(thongTinDonXuatHang);
		} else if (pressButton.equals("ThongKe_ThongKe")) {
			// lấy dự liệu ngày từ các textFields
			String preTuNgay = quanLyKhoHangView.textField_ThongKe_tuNgay.getText();
			LocalDate tuNgay = null;
			String preDenNgay = quanLyKhoHangView.textField_ThongKe_denNgay.getText();
			LocalDate denNgay = null;

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			try {
				tuNgay = LocalDate.parse(preTuNgay, formatter);
				denNgay = LocalDate.parse(preDenNgay, formatter);
			} catch (DateTimeParseException e1) {
				System.err.println("Lỗi định dạng ngày: " + e1.getMessage());
				JOptionPane.showMessageDialog(quanLyKhoHangView,
						"Ngày nhập không hợp lệ. Vui lòng nhập ngày theo định dạng dd/MM/yyyy.");
			}
			double tongGiaTriNhapHang = DonNhapHangDAO.getInstance().getTongGiaTriDonNhap(tuNgay, denNgay);
			double tongGiaTriXuatHang = DonXuatHangDAO.getInstance().getTongGiaTriDonXuat(tuNgay, denNgay);
			double chenhLech = tongGiaTriXuatHang - tongGiaTriNhapHang;

			quanLyKhoHangView.jLabel_ThongKe_GiaTriHangNhapKho.setText(String.format("%,.0f VND", tongGiaTriNhapHang));
			quanLyKhoHangView.jLabel_ThongKe_GiaTriHangXuatKho.setText(String.format("%,.0f VND", tongGiaTriXuatHang));
			quanLyKhoHangView.jLabel_ThongKe_ChenhLech.setText(String.format("%,.0f VND", chenhLech));

		}

	}

	public void refreshKhoHang() {
		ArrayList<KhoHang> list2 = KhoHangDAO.getInstance().selectAll();
		String[] columnName = { "Mã kho hàng", "Tên kho hàng", "Địa chỉ kho hàng" }; // tạo tên cột cho bảng
		DefaultTableModel model = new DefaultTableModel(columnName, 0);
		for (KhoHang k : list2) {
			model.addRow(new Object[] { k.getMaKhoHang(), k.getTenKhoHang(), k.getDiaChi() });
		}
		quanLyKhoHangView.table_KhoHang.setModel(model);
	}

}
