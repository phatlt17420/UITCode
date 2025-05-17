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

	private

	public QLSVController(QLSVView view) {

		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		JOptionPane.showMessageDialog(view, src);
		if (src.equals("Thêm")) {
			this.view.xoaForm();
			this.view.model.setLuaChon("Thêm");
		} else if (src.equals("Lưu")) {
			try {
				// get dữ liệu
				int maThiSinh = Integer.valueOf(this.view.textField_ThongTinThiSinh_ID.getText());
				String tenThiSinh = this.view.textField_ThongTinThiSinh_hoVaTen.getText();
				int queQuan = this.view.comboBox_ThongTinThiSinh_queQuan.getSelectedIndex();
				Tinh tinh = Tinh.getTinhById(queQuan);

				String ngaySinh = new Date(this.view.textField_ThongTinThiSinh_ngaySinh.getText());
				String chonGioiTinh = this.view.btn_gioiTinh.getSelection();

				boolean gioiTinh = true;
				if (chonGioiTinh.equals("Nam")) {
					gioiTinh = true;
				} else {
					gioiTinh = false;
					;
				}
				float diemMon1 = Float.valueOf(this.view.textField_ThongTinThiSinh_mon1.getText());
				float diemMon2 = Float.valueOf(this.view.textField_ThongTinThiSinh_mon2.getText());
				float diemMon3 = Float.valueOf(this.view.textField_ThongTinThiSinh_mon3.getText());

			} catch (Exception e2) {
				e2.printStackTrace();
			}
			// private int maThiSinh;
//			private String tenThiSinh;
//			private Tinh queQuan;
//			private Date ngaySinh;
//			private boolean gioiTinh;
//			private float diemMon1, diemMon2, diemMon3;

			ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, queQuan, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);

			if (this.view.model.getLuaChon().equals("") || this.view.model.getLuaChon().equals("Thêm")) {
				this.view.themThiSinh(ts);
			} else if (this.view.model.getLuaChon().equals("Cập nhật")) {
				this.view.capNhatThiSinh(ts);
			}
		} else if (src.equals("")) {

		}

	}

}
