/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi11_QLNhanVienClass_KeThua_TruuTuong_FullTruuTuong;

import Buoi12_QLNhanVienClass_KeThua_TruuTuong_Interface.NhanVien;

/**
 *
 * @author phatlt17420
 */
public class NVVanPhong extends NhanVien {

    private int soNgay;

    public NVVanPhong(int maNV, String hoTen, double luongCB) {
        super(maNV, hoTen, luongCB);
    }

    public NVVanPhong(int maNV, String hoTen, double luongCB, int soNgay) {
        super(maNV, hoTen, luongCB);
        this.soNgay = soNgay;
    }

    @Override
    public String toString() {
        return "NVVP: [%d, %s, %9.2f, %9.2f, %d]".formatted(maNV, hoTen, luongCB, luongHT, soNgay);
    }


    @Override
    public double tinhLuongHT(){
        return luongHT = luongCB + soNgay * 150000;
        
    }


}
