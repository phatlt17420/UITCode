package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;

import model.ThiSinh;
import model.Tinh;
import view.QLSVView;

public class QLSVController implements ActionListener {
	private QLSVView view;

	public QLSVController(QLSVView view) {

		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		// JOptionPane.showMessageDialog(view, src);
		if (src.equals("Thêm")) {
			this.view.xoaForm();
			this.view.model.setLuaChon("Thêm");
		} else if (src.equals("Lưu")) {
			try {
				this.view.thuHienThemThiSinh();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
			// private int maThiSinh;
//			private String tenThiSinh;
//			private Tinh queQuan;
//			private Date ngaySinh;
//			private boolean gioiTinh;
//			private float diemMon1, diemMon2, diemMon3;

		} else if (src.equals("Cập nhật")) {
			this.view.hienThiThongTinThiSinhDaChon();

		} else if (src.equals("Xóa")) {
			this.view.thucHienXoa();

		} else if (src.equals("Hủy bỏ")) {
			this.view.xoaForm();
		}else if (src.equals("Tìm")) {
			this.view.thucHienTim();
			
		}else if (src.equals("Hủy tìm")) {
			this.view.huyTimKiem();
			
		}


	}

}
