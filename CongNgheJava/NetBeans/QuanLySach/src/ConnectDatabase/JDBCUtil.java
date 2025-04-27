/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
                    + "databaseName=NhaSach;"
                    + "user=sa;"
                    + "password=sa";
            c = DriverManager.getConnection(connectionUrl);
        } catch (SQLException ex) {
            System.out.println("Loi ket noi SQL " + ex.getMessage());
        }

        return c;
    }

    public static void closeConnection(Connection c) throws SQLException {
        if (c != null && !c.isClosed()) {
            c.close();
        }
    }
}
