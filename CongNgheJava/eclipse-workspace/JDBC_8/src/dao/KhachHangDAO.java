package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhachHang;
import model.Sach;

public class KhachHangDAO implements DAOInterface<KhachHang> {
	public static KhachHangDAO getInstance() {
		return new KhachHangDAO();
	}

	@Override
	public int insert(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		ArrayList<KhachHang> ketQua = new ArrayList<KhachHang>();

		try {
			// Bước 1: tạo kết nối database
			Connection con = JDBCUtil.getConnection();
			// Bước 2: tạo đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "select * from KhachHang";
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			// Bước 4: xử lý kết quả
			while (rs.next()) {
				int id = rs.getInt("id");
				String hoVaTen = rs.getString("hoVaTen");
				Date sqlngaySinh = rs.getDate("ngaySinh");
				LocalDate ngaySinh = sqlngaySinh.toLocalDate();
				String diaChi = rs.getString("diaChi");
				KhachHang khachhang = new KhachHang(id, hoVaTen, ngaySinh, diaChi);
				ketQua.add(khachhang);

			}

			// Bước 5: ngắt kết nối
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public KhachHang selectByID(KhachHang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
