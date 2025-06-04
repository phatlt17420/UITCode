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
		// Bước 1: Tạo connection
		Connection conn = JDBCUtil.getConnection();

		// Bước 2: câu lệnh SQL

		// Bước 3: Thực thi SQL

		// Bước 4: xử lý SQL

		// Bước 5: close connection
		JDBCUtil.closeConnection(conn);
	}

	@Override
	public void update(KhoHang t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(KhoHang t) {
		// TODO Auto-generated method stub

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
