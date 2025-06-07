package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import model.ChiTietDonNhapHang;

public class ChiTietDonNhapHangDAO implements DAOInterface<ChiTietDonNhapHang> {
	public static ChiTietDonNhapHangDAO getInstance() {
		return new ChiTietDonNhapHangDAO();
	}

	@Override
	public void insert(ChiTietDonNhapHang t) {
		int ketQua;
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: câu lệnh SQL
			String sql = "INSERT INTO ChiTietDonNhapHang(MaDonNhap, MaSanPham, SoLuong, DonGia) VALUES (?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaDonNhap());
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
	public void update(ChiTietDonNhapHang t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ChiTietDonNhapHang t) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<ChiTietDonNhapHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getSoLuong(String maDonNhap, String maSanPham) {
	    double soLuong = 0;
	    try {
	        Connection conn = JDBCUtil.getConnection();
	        String sql = "SELECT SoLuong FROM ChiTietDonNhapHang WHERE MaDonNhap = ? AND MaSanPham = ?";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        pst.setString(1, maDonNhap);
	        pst.setString(2, maSanPham);

	        ResultSet rs = pst.executeQuery();
	        if (rs.next()) {
	            soLuong = rs.getDouble("SoLuong");
	        }

	        JDBCUtil.closeConnection(conn);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return soLuong;
	}
	public void update(String maDonNhap, String maSanPham, double soLuong) {
		
		int ketQua;
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();
			
			
			
			// Bước 2: câu lệnh SQL
			String sql = "update ChiTietDonNhapHang set SoLuong = ? where MaDonNhap=? and MaSanPham=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setDouble(1, soLuong);
			pst.setString(2, maDonNhap);
			pst.setString(3, maSanPham);

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
}
