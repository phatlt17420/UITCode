package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUtil;

public class TestJBDCUtil {
	public static void main(String[] args) {
		try {
			// Bước 1: Khởi tạo kết nối
			Connection connection = JDBCUtil.getConnection();

			// Bước 2: Tạo ra đối tượng statement
			Statement st = connection.createStatement();
			
			// Bước 3: Thực thi câu lệnh SQL

			String sql = "insert into Persons (last_name,first_name,dob,gender,income)" + "values"
					+ "('Le','Tan Phat','1992-12-30','Nam',20000)," + "('Le','Tan Dat','1994-12-30','Nam',20000),"
					+ "('Nguyen','Thi Hoai Thuong','1994-07-26','Nu',20000);";

			int check =  st.executeUpdate(sql);
			
			// Bước 4: xử lý kết quả
			System.out.println("Số dòng thay đổi: "+ check);
			if (check>0) {
				System.out.println("Thêm dữ liệu thành công");
			}else {
				System.out.println("Thêm dữ liệu thất bại");
			}
			

			// Bước 5: Ngắt kết nối
			JDBCUtil.closeConnection(connection);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
