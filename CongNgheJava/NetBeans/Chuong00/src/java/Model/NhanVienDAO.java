/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import ConnDB.DBConnection;
import java.sql.*;
import java.util.*;

public class NhanVienDAO {

    public List<NhanVien> getAll() throws Exception {
        List<NhanVien> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        String sql = "SELECT * FROM NhanVien";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            list.add(new NhanVien(
                    rs.getString("maNV"),
                    rs.getString("hoTen"),
                    rs.getDouble("luongCB"),
                    rs.getDouble("luongHT")
            ));
        }

        rs.close();
        ps.close();
        conn.close();
        return list;
    }

    public void add(NhanVien nv) throws Exception {
        Connection conn = DBConnection.getConnection();
        String sql = "INSERT INTO NhanVien VALUES (?, ?, ?, ?)";
        
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setString(1, nv.getMaNV());
        ps.setString(2, nv.getHoTen());
        ps.setDouble(3, nv.getLuongCB());
        ps.setDouble(4, nv.getLuongHT());
        
        ps.executeUpdate();
        
        ps.close();
        conn.close();
    }
    
}
