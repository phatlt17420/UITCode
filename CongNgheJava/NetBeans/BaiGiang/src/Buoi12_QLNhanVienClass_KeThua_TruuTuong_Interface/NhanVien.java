/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi12_QLNhanVienClass_KeThua_TruuTuong_Interface;

/**
 *
 * @author phatlt17420
 */
public class NhanVien implements InterfaceNV{

    public int maNV;
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



    @Override
    public double xetThuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public double troCap() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double tinhluongHT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double tinhLuongHT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




}
