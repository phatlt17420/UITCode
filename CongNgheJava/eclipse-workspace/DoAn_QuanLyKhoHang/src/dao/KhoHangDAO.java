package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhoHang;

public class KhoHangDAO implements DAOInterface<KhoHang> {
	public static KhoHangDAO getInstance() {
		return new KhoHangDAO();
	}

	@Override
	public void insert(KhoHang t) {
		int ketQua;
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: câu lệnh SQL
			String sql = "INSERT INTO KhoHang VALUES (?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaKhoHang());
			pst.setString(2, t.getTenKhoHang());
			pst.setString(3, t.getDiaChi());
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
	public void update(KhoHang t) {
		int ketQua;
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: câu lệnh SQL
			String sql = "UPDATE KhoHang SET tenKhoHang =?, diaChi=? WHERE maKhoHang = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getTenKhoHang());
			pst.setString(2, t.getDiaChi());
			pst.setString(3, t.getMaKhoHang());

			ketQua = pst.executeUpdate();
			// Bước 3: Thực thi SQL

			// Bước 4: xử lý SQL

			// Bước 5: close connection
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			System.out.println("Lỗi truy vấn SQL_DAO_KhoHang");
			e.printStackTrace();
		}

	}

	@Override
	public void delete(KhoHang t) {
		int ketQua;
		try {
			// Bước 1: tạo connection
			Connection conn = JDBCUtil.getConnection();
			//Bước 2: tao câu lệnh SQL
			String sql = "DELETE FROM KhoHang WHERE maKhoHang = ?";
			//Bước 3: tạo PreparedStatement
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaKhoHang());
			// Bước 4: thực thi + xứ lý kết quả
			ketQua = pst.executeUpdate();
			//Bước 5: Đóng connection
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<KhoHang> selectAll() {
		ArrayList<KhoHang> list = new ArrayList<KhoHang>();
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: câu lệnh SQL
			String sql = "SELECT * FROM KhoHang";
			PreparedStatement pst = conn.prepareStatement(sql);
			// Bước 3: Thực thi SQL
			ResultSet rs = pst.executeQuery();
			// Bước 4: xử lý SQL
			while (rs.next()) {
				String maKhoHang = rs.getString("MaKhoHang");
				String tenKhoHang = rs.getString("TenKhoHang");
				String diaChi = rs.getString("DiaChi");
				KhoHang khoHang = new KhoHang(maKhoHang, tenKhoHang, diaChi);
				list.add(khoHang);
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
