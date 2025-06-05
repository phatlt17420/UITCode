package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.KhoHangDAO;
import database.JDBCUtil;
import model.KhoHang;
import view.QuanLyKhoHangView;

public class QuanLyKhoHangController implements ActionListener {
	private QuanLyKhoHangView quanLyKhoHangView;

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
