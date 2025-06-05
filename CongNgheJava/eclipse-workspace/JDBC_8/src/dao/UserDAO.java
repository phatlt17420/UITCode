package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.User;

public class UserDAO implements DAOInterface<User> {
	public static UserDAO getInstance() {
		return new UserDAO();
	}

	@Override
	public int insert(User t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối database
			Connection con = JDBCUtil.getConnection();
			// Bước 2: tạo đối tượng statement
			
			// Bước 3: thực thi câu lệnh SQL
			String sql = "insert into userAccount (username,password,hoVaTen) values ( ?, ?, ?);";
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, t.getUsername());
			pst.setString(2, t.getPassword());
			pst.setString(3, t.getHoVaTen());
			
			ketQua=pst.executeUpdate();
			System.out.println("Bạn đã thực thi " + sql);

			// Bước 4: xử lý kết quả

			System.out.println("Có " + ketQua + " dòng bị thay đổi");
			// Bước 5: ngắt kết nối
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int update(User t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối database
			Connection con = JDBCUtil.getConnection();
			// Bước 2: tạo đối tượng statement
			
			// Bước 3: thực thi câu lệnh SQL
			String sql = "update User set password = ?, hoVaTen= ? where username=?";
						
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getPassword());
			pst.setString(2, t.getHoVaTen());
			pst.setString(3, t.getUsername());
			
			System.out.println(sql);
			ketQua = pst.executeUpdate();
			// Bước 4: xử lý kết quả
			System.out.println("Bạn đã thực thi " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi");
			// Bước 5: ngắt kết nối
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(User t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối database
			Connection con = JDBCUtil.getConnection();
			// Bước 2: tạo đối tượng statement
			
			// Bước 3: thực thi câu lệnh SQL
			String sql = "Delete from userAccount where username=?";
			
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, t.getUsername());
			
			
			System.out.println(sql);
			ketQua = pst.executeUpdate();
			// Bước 4: xử lý kết quả
			System.out.println("Bạn đã thực thi " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi");
			// Bước 5: ngắt kết nối
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<User> selectAll() {
		ArrayList<User> ketQua = new ArrayList<User>();

		try {
			// Bước 1: tạo kết nối database
			Connection con = JDBCUtil.getConnection();
			// Bước 2: tạo đối tượng statement

			// Bước 3: thực thi câu lệnh SQL
			String sql = "select * from userAccount";
			PreparedStatement pst = con.prepareStatement(sql);
			
			
			
			
			
			System.out.println(sql);
			ResultSet rs = pst.executeQuery();
			// Bước 4: xử lý kết quả
			while (rs.next()) {

				String username = rs.getString("username");
				String password = rs.getString("password");
				String hoVaTen = rs.getString("hoVaTen");
				User user = new User(username, password, hoVaTen);
				ketQua.add(user);

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
	public User selectByID(User t) {
		User ketQua = null;

		try {
			// Bước 1: tạo kết nối database
			Connection con = JDBCUtil.getConnection();
			// Bước 2: tạo đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "select * from userAccount where username = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUsername());
			
			System.out.println(sql);
			ResultSet rs = pst.executeQuery();
			// Bước 4: xử lý kết quả
			while (rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				String hoVaTen = rs.getString("hoVaTen");
				ketQua = new User(username, password, hoVaTen);

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
	public ArrayList<User> selectByCondition(String condition) {
		ArrayList<User> ketQua = new ArrayList<User>();

		return ketQua;
	}

}
