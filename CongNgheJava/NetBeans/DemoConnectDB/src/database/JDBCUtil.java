/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Le Tan Phat
 */
public class JDBCUtil {
    
    public static Connection getConnection() {
        Connection c = null;
        
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String connectionUrl = "jdbc:sqlserver://DESKTOP-SG\\SQLEXPRESS:1433;"
                    + "databaseName=QuanLyTienDien;"
                    + "user=sa;"
                    + "password=sa";
            c = DriverManager.getConnection(connectionUrl);




        } catch (SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }
    // dong connection trong 
    public static void closeConnection(Connection c) {
        try {
            if (c!=null){
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void printInfo (Connection c) {
        if (c!=null)
        {
            try {
                System.out.println(c.getMetaData().toString());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
