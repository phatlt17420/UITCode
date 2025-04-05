/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTienDien.connectDatabase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Le Tan Phat
 */
public class connectDB1 {

    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("sa");
        ds.setServerName("DESKTOP-SG\\SQLEXPRESS");
        ds.setPortNumber(Integer.parseInt("1433"));
        ds.setDatabaseName("QuanLyTienDien");

        try {
            Connection con = ds.getConnection();
            CallableStatement cstmt =con.prepareCall("select * from HoDan");
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()){
                System.out.println(rs.getString("ChiSoCu"));
            }
            
            
        } catch (SQLServerException e) {
            System.out.println("Loi ket noi " + e);
        } catch (SQLException ex) {
            System.err.println("Loi cau truy van " + ex);
        }

    }
}
