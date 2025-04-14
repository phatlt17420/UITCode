/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNhanVien_FullTinhChat;

/**
 *
 * @author Le Tan Phat
 */
public class NVVanPhong extends NhanVien {

    protected int soNgayLamViec;

    public NVVanPhong(int maNV, String hoTen, double luongCB, int soNgayLamViec) {
        super(maNV, hoTen, luongCB);
        this.soNgayLamViec = soNgayLamViec;
    }

    @Override
    public void tinhLuong() {
        this.luongHT = luongCB + this.soNgayLamViec * 150_000;
    }
    @Override
    public String toString() {
        return String.format("VanPhong: \t[%d, %s, %.0f, %.0f]", this.maNV, hoTen, luongCB, luongHT);
    }
}
