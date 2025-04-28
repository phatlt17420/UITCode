/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ClassFinal.Sach;
import ConnectDatabase.JDBCUtil;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Le Tan Phat
 */
public class SachDAO implements DAOInterface<Sach> {

    public static SachDAO getInstance() {
        return new SachDAO();
    }

    @Override
    public int insert(Sach t) {
        int ketQua = 0;
        try {
            // Bước 1: Tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();
            // Bước 2: tạo đối tượng Statement
            Statement st = con.createStatement();
            // Bước 3: thực thi câu lệnh SQL
            String sql = "insert into Sach(ID,TenSach,GiaBan,NamXuatBan)"
                    + " values('" + t.getId()
                    + "','" + t.getTenSach()
                    + "','" + t.getGiaBan()
                    + "','" + t.getNamXuatBan()
                    + "' )";

            ketQua = st.executeUpdate(sql);
            //Bước 4: xử lý kết quả
            System.out.println("Ban da thuc thi " + sql);
            System.out.println("Co " + ketQua + " dong bi thay doi");
            // Bước 5: Ngắt kết nối
            JDBCUtil.closeConnection(con);
        } catch (SQLException sQLException) {
            System.out.println("Loi cau truy van insert du lieu " + sQLException.getMessage());
        }
        return ketQua;

    }

    @Override
    public int update(Sach t) {
        int kq = 0;
        try {
            // Bước 1: tạo kết nối
            Connection con = JDBCUtil.getConnection();
            // Bước 2: tạo đối tượng satatement
            Statement st = con.createStatement();
            // Bước 3: Thực thi
            String sql = "update Sach SET TenSach="
                    + "'" + t.getTenSach() + "'"
                    + "," + "GiaBan=" + t.getGiaBan()
                    + "," + "NamXuatBan=" + t.getNamXuatBan()
                    + " where ID ="
                    + "'" + t.getId() + "'" + ";";
            System.out.println(sql);
            kq = st.executeUpdate(sql);
            // Bước 4: Xử lý kết quả

            // Bước 5: Đóng kết nối
            JDBCUtil.closeConnection(con);

        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    @Override
    public int delete(Sach t) {
        int kq = 0;
        try {
            // Bước 1: tạo kết nối
            Connection con = JDBCUtil.getConnection();
            //Bước 2: tạo statement
            Statement st = con.createStatement();
            //Bước 3: Thực thi statement
            String sql = "delete from Sach"
                    + " where ID ="
                    + "'" + t.getId() + "'" + ";";
            st.executeUpdate(sql);
            System.out.println(sql);
            // Bước 4: xử lý kết quả

            //Bước 5: đ8óng kết nối
        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    @Override
    public ArrayList<Sach> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Sach selectByID(Sach t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Sach> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
