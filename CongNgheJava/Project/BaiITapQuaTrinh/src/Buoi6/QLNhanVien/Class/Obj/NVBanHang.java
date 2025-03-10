/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi6.QLNhanVien.Class.Obj;

/**
 *
 * @author phatlt17420
 */
public class NVBanHang {
     public int maNV;
    public String hoTen;
    public double luongCB;
    public int soSanPham;
    public double luongHangThang;

    public NVBanHang(int maNV, String hoTen, double luongCB, int soSanPham) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.soSanPham = soSanPham;
        this.luongHangThang = 0;
    }

    @Override
    public String toString() {
        return "%d, %s, %9.2f,%9.2f".formatted(maNV, hoTen, luongCB, luongHangThang);
    }
    
    public double tinhLuongHT_BH(){
        luongHangThang=luongCB+soSanPham*18000;
        
        
        return luongHangThang;
    }
}
