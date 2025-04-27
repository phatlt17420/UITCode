/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuanLyNhanVien_Full_GiaoDien.QLNV_ConnectDB;

import Chuong9_ConnectDatabase.*;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phatlt17420
 */
public class Database {

    private Connection connection;

    public Database() {
        String url = "jdbc:sqlserver://DESKTOP-SG\\SQLEXPRESS:1433;"
                + "databaseName=QuanLyNhanVien;user=sa;password=sa;";
        String user = "sa";
        String password = "sa";
    }
// kết nối

    public void connect() {
        String url = "jdbc:sqlserver://DESKTOP-SG\\SQLEXPRESS:1433;"
                + "databaseName=QuanLyNhanVien;user=sa;password=sa;";
        String user = "sa";
        String password = "sa";
        try {
            connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException ex) {
            System.out.println("Loi ket noi co so du lieu: " + ex);
        }

    }

    // ngắt kết nối
    public void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
