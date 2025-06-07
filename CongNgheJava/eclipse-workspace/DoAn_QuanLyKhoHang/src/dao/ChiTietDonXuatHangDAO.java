package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.ChiTietDonNhapHang;
import model.ChiTietDonXuatHang;

public class ChiTietDonXuatHangDAO implements DAOInterface<ChiTietDonXuatHang> {
	public static ChiTietDonXuatHangDAO getInstance() {
		return new ChiTietDonXuatHangDAO();
	}

	@Override
	public void insert(ChiTietDonXuatHang t) {
		int ketQua;
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: câu lệnh SQL
			String sql = "INSERT INTO ChiTietDonXuatHang(MaDonXuat, MaSanPham, SoLuong, DonGia) VALUES (?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaDonXuat());
			pst.setString(2, t.getMaSanPham());
			pst.setDouble(3, t.getSoLuong());
			pst.setDouble(4, t.getDonGia());
			ketQua = pst.executeUpdate();
			// Bước 3: Thực thi SQL

			// Bước 4: xử lý SQL

			// Bước 5: close connection
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void update(ChiTietDonXuatHang t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ChiTietDonXuatHang t) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<ChiTietDonXuatHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
