package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import database.JDBCUtil;
import model.ChiTietTonKho;
import model.SanPham;

public class ChiTietTonKhoDAO implements DAOInterface<ChiTietTonKho> {
	public static ChiTietTonKhoDAO getInstance() {
		return new ChiTietTonKhoDAO();
	}

	@Override
	public void insert(ChiTietTonKho t) {
		int ketQua;
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: câu lệnh SQL
			String sql = "INSERT INTO ChiTietTonKho VALUES (?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaSanPham());
			pst.setString(2, t.getMaKhoHang());
			pst.setDouble(3, t.getSoLuongTonKho());
			// xử lý LocalDate để lưu vào SQL
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
	public void update(ChiTietTonKho t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ChiTietTonKho t) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<ChiTietTonKho> selectAll() {
		ArrayList<ChiTietTonKho> list = new ArrayList<ChiTietTonKho>();
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: câu lệnh SQL
			String sql = "SELECT * FROM ChiTietTonKho";
			PreparedStatement pst = conn.prepareStatement(sql);
			// Bước 3: Thực thi SQL
			ResultSet rs = pst.executeQuery();
			// Bước 4: xử lý SQL
			while (rs.next()) {
				String maSanPham = rs.getString("MaSanPham");
				String maKhoHang = rs.getString("MaKhoHang");
				double soLuongTonKho = rs.getDouble("SoLuongTonKho");
				ChiTietTonKho tonKho = new ChiTietTonKho(maSanPham, maKhoHang, soLuongTonKho);
				list.add(tonKho);
			}

			// Bước 5: close connection
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			System.out.println("Lỗi truy vấn SQL_DAO_KhoHang");
			e.printStackTrace();
		}
		return list;
	}

	public void update(String maSanPhamFind, String maKhoHangFind, double soLuongSanPham) {

		int ketQua;
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: câu lệnh SQL
			String sql = "UPDATE ChiTietKhoHang SET SoLuongTonKho =SoLuongTonKho + ? WHERE MaSanPham = ? and maKhoHang = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setDouble(1, soLuongSanPham);
			pst.setString(2, maSanPhamFind);
			pst.setString(3, maKhoHangFind);

			ketQua = pst.executeUpdate();
			// Bước 3: Thực thi SQL

			// Bước 4: xử lý SQL

			// Bước 5: close connection
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			System.out.println("Lỗi truy vấn SQL_DAO chi tiet ton kho");
			e.printStackTrace();
		}

	}

}
