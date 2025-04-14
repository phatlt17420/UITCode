/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chuong9_ConnectDatabase;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phatlt17420
 */
public class ConnectDB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create datasource.tạo nguồn làm chìa khóa kết nối
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("sa");
        ds.setServerName("LAPASUSTOP");
        ds.setPortNumber(Integer.parseInt("1433")); // cổng port 1433 dành cho java kết nối
        ds.setDatabaseName("QuanLyDeTai");

        try {
            Connection con = ds.getConnection();

            try {
                CallableStatement cstmt = con.prepareCall("select * from CHUYENNGANH");

                ResultSet rs = stmt.executeQuery(SQL);

                while (rs.next()) {
                    System.out.println(rs.getString("MSCN") + " " + rs.getString("TENCN"));
                }

            } catch (SQLException ex) {
                System.out.println("Loi truy van: " + ex);
            }

        } catch (SQLServerException ex) {
            System.out.println("Loi ket noi: " + ex);
        }

    }

}
