/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi11_QLNhanVienClass_KeThua_TruuTuong;

import Buoi11_QLNhanVienClass_KeThua_TruuTuong_FullTruuTuong.NhanVien;

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

    public void tinhLuongVP() {
        luongHT = luongCB + soNgay * 150000;
        
    }
    @Override
    public double tinhluongHT() {
        return luongCB + soNgay * 150000;
    }

    @Override
    public double xetThuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
