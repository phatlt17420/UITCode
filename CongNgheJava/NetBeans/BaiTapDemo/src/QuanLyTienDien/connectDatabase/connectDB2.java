/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuanLyTienDien.connectDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Le Tan Phat
 */
public class connectDB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String connectionUrl = "jdbc:sqlserver://DESKTOP-SG\\SQLEXPRESS:1433;"
                + "databaseName=QuanLyTienDien;"
                + "user=sa;"
                + "password=sa";
        
        try {
            Connection con = DriverManager.getConnection(connectionUrl);
            Statement stmt = con.createStatement();
            String SQL = "select * from HoDan";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                System.out.println(rs.getString("TenHo") + " " + rs.getString("ChiSoCu"));                
                
            }
            
        } catch (SQLException ex) {
            System.err.println("Loi ket noi du lieu: " + ex);
        }
        
    }
    
}
