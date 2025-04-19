/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sonpt
 */
public class NhanVien {

    private String maNV;
    private String hoTen;
    private double luongCB;
    private double luongHT;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luongCB, double luongHT) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.luongHT = luongHT;
    }

    // Getters và Setters
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public double getLuongHT() {
        return luongHT;
    }

    public void setLuongHT(double luongHT) {
        this.luongHT = luongHT;
    }
    
    
}
