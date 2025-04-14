/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyNhanVien.QLNhanVien_FullTinhChat_MVC;

/**
 *
 * @author Le Tan Phat
 */
public class NhanVien extends AbsNhanVien {

    protected int maNV;
    protected String hoTen;
    protected double luongCB;
    protected double luongHT;

    public NhanVien(int maNV, String hoTen, double luongCB) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
    }

    @Override
    public String toString() {
        return String.format("[%d, %s, %.0f, %.0f]", this.maNV, hoTen, luongCB, luongHT);
    }

    @Override
    public void tinhLuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getLuongHT() {
        return luongHT;
    }

}
