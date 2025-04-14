/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi11_QLNhanVienClass_KeThua_TruuTuong;

import Buoi12_QLNhanVienClass_KeThua_TruuTuong_Interface.NhanVien;

/**
 *
 * @author phatlt17420
 */
public class NVBanHang extends NhanVien {

    private int soSP;

    public NVBanHang(int maNV, String hoTen, double luongCB) {
        super(maNV, hoTen, luongCB);
    }

    public NVBanHang(int maNV, String hoTen, double luongCB, int soSP) {
        super(maNV, hoTen, luongCB);
        this.soSP = soSP;
    }

    @Override
    public String toString() {
        return "NVBH: [%d, %s, %9.2f, %9.2f, %d]".formatted(maNV, hoTen, luongCB, luongHT, soSP);
    }

    public void tinhLuongBH() {
        luongHT = luongCB + soSP * 150000;

    }

    @Override
    public double tinhluongHT() {
        return luongCB + soSP * 150000;
    }

    @Override
    public double xetThuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
