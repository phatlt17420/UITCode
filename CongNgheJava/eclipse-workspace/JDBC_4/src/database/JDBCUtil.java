package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection c = null;
		try {
			DriverManager.registerDriver(new SQLServerDriver());
			
			String connectionUrl = "jdbc:sqlserver://DESKTOP-SG\\SQLEXPRESS:1433;" + "databaseName=JDBC;"
					+ "user=sa;" + "password=sa";
			c = DriverManager.getConnection(connectionUrl);


		} catch (SQLException e) {
			System.out.println("Lỗi kết nối SQL");
			e.printStackTrace();
		}
		return c;
	}

	public static void closeConnection(Connection c) {
		try {
			if (c != null) {
				c.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
