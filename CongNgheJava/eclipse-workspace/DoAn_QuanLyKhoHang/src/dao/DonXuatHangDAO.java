package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import database.JDBCUtil;
import model.DonNhapHang;
import model.DonXuatHang;

public class DonXuatHangDAO implements DAOInterface<DonXuatHang> {
	public static DonXuatHangDAO getInstance() {
		return new DonXuatHangDAO();
	}

	@Override
	public void insert(DonXuatHang t) {
		int ketQua;
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: câu lệnh SQL
			String sql = "INSERT INTO DonXuatHang VALUES (?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaDonXuat());
			pst.setString(2, t.getTenNguoiMua());

			// xử lý LocalDate để lưu vào SQL
			LocalDate ngayTaoLocalDate = t.getNgayTao();
			Date sqlDate = Date.valueOf(ngayTaoLocalDate);

			// Gán vào PreparedStatement
			pst.setDate(3, sqlDate);
			pst.setDouble(4, t.getTongGiaTri());
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
	public void update(DonXuatHang t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(DonXuatHang t) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<DonXuatHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getTongGiaTriDonXuat(LocalDate tuNgay, LocalDate denNgay) {
		double tongGiaTriDonXuat = 0;
		try {
			Connection conn = JDBCUtil.getConnection();

			String sql = "SELECT SUM(TongGiaTri) AS TONG FROM DonXuatHang WHERE NgayTao BETWEEN ? AND ?;";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setDate(1, Date.valueOf(tuNgay));
			pst.setDate(2, Date.valueOf(denNgay));
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				tongGiaTriDonXuat = rs.getDouble("TONG");
			}
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			System.out.println("Lỗi truy vấn getTenSanPhamByID");
			e.printStackTrace();
		}

		return tongGiaTriDonXuat;
	}

}
