package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import database.JDBCUtil;
import model.HangHoaTaiKhoHang;
import model.KhoHang;

public class HangHoaTaiKhoHangDAO implements DAOInterface<HangHoaTaiKhoHang> {
	public static HangHoaTaiKhoHangDAO getInstance() {
		return new HangHoaTaiKhoHangDAO();
	}

	@Override
	public void insert(HangHoaTaiKhoHang t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(HangHoaTaiKhoHang t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(HangHoaTaiKhoHang t) {
		// TODO Auto-generated method stub
		
	}

	
	public ArrayList<HangHoaTaiKhoHang> selectAll(String t) {
		
		ArrayList<HangHoaTaiKhoHang> list = new ArrayList<HangHoaTaiKhoHang>();
		try {
			// Bước 1: Tạo connection
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: câu lệnh SQL
			String sql = "SELECT MaKhoHang,DonNhapHang.MaDonNhap, TenSanPham,SanPham.MaSanPham,TenLoaiSanPham,DonViTinh,ChiTiet,DonGia,SoLuong,NgayTao FROM SanPham Join ChiTietDonNhapHang on ChiTietDonNhapHang.MaSanPham=SanPham.MaSanPham Join DonNhapHang on DonNhapHang.MaDonNhap=ChiTietDonNhapHang.MaDonNhap where MaKhoHang =  ?  order by DonNhapHang.MaKhoHang";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t);
			// Bước 3: Thực thi SQL
			ResultSet rs = pst.executeQuery();
			// Bước 4: xử lý SQL
			while (rs.next()) {
				String maKhoHang = rs.getString("MaKhoHang");
				String maDonNhap = rs.getString("MaDonNhap");
				String tenSanPham = rs.getString("TenSanPham");
				String maSanPham = rs.getString("MaSanPham");
				String tenLoaiSanPham = rs.getString("TenLoaiSanPham");
				String donViTinh = rs.getString("DonViTinh");
				String chiTiet = rs.getString("ChiTiet");
				double donGia = rs.getDouble("DonGia");
				double soLuong = rs.getDouble("SoLuong");
				LocalDate ngayTao=rs.getDate("NgayTao").toLocalDate();
				
				HangHoaTaiKhoHang sp = new HangHoaTaiKhoHang(maKhoHang, maDonNhap, tenSanPham, maSanPham, tenLoaiSanPham, donViTinh, chiTiet, donGia, soLuong, ngayTao);
				list.add(sp);				
				
			}

			// Bước 5: close connection
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			System.out.println("Lỗi truy vấn SQL_DAO_HangHoaTaiKhoHang");
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<HangHoaTaiKhoHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
