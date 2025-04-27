/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Le Tan Phat
 */
public class testJDBCUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Bước 1:  tạo kết nối
            Connection connection = (Connection) JDBCUtil.getConnection();
            // Bước 2: tạo ra đối tượng statement
            Statement st = connection.createStatement();
            // Bước 3: thực thi statement
            String sql = "insert into HoDan values (N'Lê Tấn Phát',2500,3000,500,1000)";
            int check = st.executeUpdate(sql);
            // Bước 4: xử lý kết quả
            System.out.println("Số dòng thay đổi" + check);
            if (check >0 ) {
                System.out.println("Them du lieu thanh cong");
            } else {
                System.out.println("Them du lieu that bai");
            }
            // Bước 5: ngắt kết nối
            JDBCUtil.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(testJDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
