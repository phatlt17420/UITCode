/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNhanVien_ClassObject;

/**
 *
 * @author Le Tan Phat
 */
public class NVBanHang {
    public int maNV;
    public String hoTen;
    public double luongCB;
    public double luongHT;
    public int soSP;
    public NVBanHang(){
        this.maNV=0;
        this.hoTen="Chua Nhap";
        this.luongCB=0;
        this.luongHT=0;
        this.soSP=0;
    }
    public NVBanHang(int maNV, String hoTen, double luongCB, int soSP){
        this.maNV=maNV;
        this.hoTen=hoTen;
        this.luongCB=luongCB;
        this.soSP=soSP;
    }
    public void tinhLuongNVBanHang(){
        luongHT=luongCB + soSP*50000;
    }
    @Override
        public String toString(){
            return "[%d, %s, %f, %f]".formatted(this.maNV,this.hoTen, this.luongCB, this.luongHT);
        }
        
}
