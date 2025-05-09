/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi11_QLNhanVienClass_KeThua_TruuTuong;

/**
 *
 * @author phatlt17420
 */
public abstract class NhanVien {

    protected int maNV;
    protected String hoTen;
    protected double luongCB;
    protected double luongHT;

//    public NhanVien(){
//        
//    }
    public NhanVien(int maNV, String hoTen, double luongCB) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.luongHT = 0;
    }

    @Override
    public String toString() {
        return "NV: [%d, %s, %9.2f, %9.2f]".formatted(maNV, hoTen, luongCB, luongHT);
    }

    public abstract double tinhluongHT();
    public abstract double xetThuong();

}
