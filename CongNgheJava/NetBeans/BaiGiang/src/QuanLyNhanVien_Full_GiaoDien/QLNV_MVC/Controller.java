/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyNhanVien_Full_GiaoDien.QLNV_MVC;

import QuanLyNhanVien_Full_GiaoDien.QLNV_ConnectDB.Database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phatlt17420
 */
public class Controller {

    public View v;
    public Model m;

    public Controller(View v, Model m) {
        this.v = v;
        this.m = m;
        this.v.setVisible(true);
    }

    //1. Xem thông tin các nhân viên
    public void connectDBinitData() {
        v.btnXemActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // 1. kết nối cơ sở dữ liệu.(chưa chuẩn bị nên sử dụng dự liệu mặc định.
               // m.ConnectDataseDSNV();
                //2. Có được dữ liệu kết nối thì sẽ init Luong
                m.cty.initDSNV(null);
                //3. lấy danh sách nhân viên hiển thị qua view (cụ thể là table)
                v.setTableNV(m.cty.ds);  // đúng là phải get nhan viên
            }

        });

    }

    // tính lương
    public void tinhLuongHT() {
        v.btnTinhLuongActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //m.cty.initDSNV(null);
                m.cty.tinhLuongDSNV();
                v.setTableNVTinhLuong(m.cty.ds);
            }

        });
    }
}
