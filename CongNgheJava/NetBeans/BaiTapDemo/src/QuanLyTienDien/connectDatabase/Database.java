/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTienDien.connectDatabase;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Le Tan Phat
 */
public class Database {

    private Connection connection;

    public Database() {
        String url = "jdbc:sqlserver://DESKTOP-SG\\SQLEXPRESS:1433;"
                + "databaseName=QuanLyTienDien;user=sa;password=sa;";
        String user = "sa";
        String password = "sa";
    }
// kết nối
    public void connect() {
        String url = "jdbc:sqlserver://DESKTOP-SG\\SQLEXPRESS:1433;"
                + "databaseName=QuanLyTienDien;user=sa;password=sa;";
        String user = "sa";
        String password = "sa";
        try {
            connection = DriverManager.getConnection(url, user, password);
            
            
            
            
        } catch (SQLException ex) {
            System.out.println("Loi ket noi co so du lieu: " +ex);
        }
        
    }
    // ngắt kết nối
    public void disconnect() throws SQLException{
        if(connection!=null && !connection.isClosed()){
            connection.close();
        }
    }
    
    
    // 
    public void select(String sql){
        
    }
    

}
