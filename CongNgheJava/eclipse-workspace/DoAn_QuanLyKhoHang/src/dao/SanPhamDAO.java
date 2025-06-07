package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhoHang;
import model.SanPham;

public class SanPhamDAO implements DAOInterface<SanPham> {
	public static SanPhamDAO getInstance() {
		return new SanPhamDAO();
	}

	@Override
	public void insert(SanPham t) {
		int ketQua;
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: câu lệnh SQL
			String sql = "INSERT INTO SanPham VALUES (?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaSanPham());
			pst.setString(2, t.getTenSanPham());
			pst.setString(3, t.getTenLoaiSanPham());
			pst.setString(4, t.getDonViTinh());
			pst.setString(5, t.getChiTiet());
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
	public void update(SanPham t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(SanPham t) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<SanPham> selectAll() {
		ArrayList<SanPham> list = new ArrayList<SanPham>();
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: câu lệnh SQL
			String sql = "SELECT * FROM SanPham";
			PreparedStatement pst = conn.prepareStatement(sql);
			// Bước 3: Thực thi SQL
			ResultSet rs = pst.executeQuery();
			// Bước 4: xử lý SQL
			while (rs.next()) {
				String maSanPham = rs.getString("MaSanPham");
				String tenSanPham = rs.getString("TenSanPham");
				String tenLoaiSanPham = rs.getString("TenLoaiSanPham");
				String donViTinh = rs.getString("DonViTinh");
				String chiTiet = rs.getString("ChiTiet");
				SanPham sanPham = new SanPham(maSanPham, tenSanPham, tenLoaiSanPham, donViTinh, chiTiet);
				list.add(sanPham);
			}

			// Bước 5: close connection
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			System.out.println("Lỗi truy vấn SQL_DAO_KhoHang");
			e.printStackTrace();
		}
		return list;
	}

}
