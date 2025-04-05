/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chuong9_ConnectDatabase;

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
public class ConnectDB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String connectionUrl = "jdbc:sqlserver://LAPASUSTOP\\SQLEXPRESS:1433;"
                + "databaseName=QuanLyDeTai;user=sa;password=sa;";
        try {
            Connection con = DriverManager.getConnection(connectionUrl);

            Statement stmt = con.createStatement(); // tạo câu truy vấn

            String SQL = "select * from GIAOVIEN";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                System.out.println(rs.getString("MSGV") + " " + rs.getString("TENGV"));
            }

        } catch (SQLException ex) {
            System.out.println("Loi ket noi: " + ex);
        }

    }

}
