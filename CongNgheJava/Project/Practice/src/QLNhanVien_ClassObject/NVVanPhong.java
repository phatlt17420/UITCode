/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNhanVien_ClassObject;

/**
 *
 * @author Le Tan Phat
 */
public class NVVanPhong {
    public int maNV;
    public String hoTen;
    public double luongCB;
    public double luongHT;
    public int soNgay;
    public NVVanPhong(){
        this.maNV=0;
        this.hoTen="Chua Nhap";
        this.luongCB=0;
        this.luongHT=0;
        this.soNgay=0;
    }
    public NVVanPhong(int maNV, String hoTen, double luongCB, int soNgay){
        this.maNV=maNV;
        this.hoTen=hoTen;
        this.luongCB=luongCB;
        this.soNgay=soNgay;
    }
    public void tinhLuongNVVanPhong(){
        luongHT=luongCB + soNgay*150000;
    }
    @Override
        public String toString(){
            return "[%d, %s, %f, %f]".formatted(this.maNV,this.hoTen, this.luongCB, this.luongHT);
        }
        
     
}
