/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi6.QLNhanVien.Class.Obj;

/**
 *
 * @author phatlt17420
 */
public class NVVanPhong {

    public int maNV;
    public String hoTen;
    public double luongCB;
    public int soNgay;
    public double luongHangThang;

    public NVVanPhong(int maNV, String hoTen, double luongCB, int soNgay) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.soNgay = soNgay;
        this.luongHangThang = 0;
    }

    @Override
    public String toString() {
        return "%d, %s, %9.2f,%9.2f".formatted(maNV, hoTen, luongCB, luongHangThang);
    }
    
    public double tinhLuongHT_VP(){
        luongHangThang=luongCB+soNgay*180000;
        
        
        return luongHangThang;
    }

}
