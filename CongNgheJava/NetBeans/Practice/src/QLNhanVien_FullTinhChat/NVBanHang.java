/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNhanVien_FullTinhChat;

/**
 *
 * @author Le Tan Phat
 */
public class NVBanHang extends NhanVien {

    protected int soSP;

    public NVBanHang(int maNV, String hoTen, double luongCB, int soSP) {
        super(maNV, hoTen, luongCB);
        this.soSP = soSP;
    }

    @Override
    public void tinhLuong() {
        this.luongHT = luongCB + soSP * 18_000;
    }

    @Override
    public String toString() {
        return String.format("BanHang:\t[%d, %s, %.0f, %.0f]", this.maNV, hoTen, luongCB, luongHT);
    }
    
}

