/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5.BTQuanLySinhVien;

import java.util.ArrayList;

/**
 *
 * @author phatlt17420
 */
public class LopHoc {
    public String TenLop;
    public ArrayList<SinhVien> ds;

    public LopHoc(String LopHoc) {
        this.TenLop="12A3";
        
    }
    // 1. Khởi tạo sinh viên
    public int initDataDSSV() {
        
        ds.add(new SinhVien(123,"Nguyen VAn A",7.8));
        
        return ds.size();
    }
    
    
    
    
}
