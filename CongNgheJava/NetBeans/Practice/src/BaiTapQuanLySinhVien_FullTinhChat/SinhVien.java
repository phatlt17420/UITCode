/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapQuanLySinhVien_FullTinhChat;

/**
 *
 * @author Le Tan Phat
 */
public class SinhVien extends AbsSinhVien {

    protected int maSV;
    protected String hoTen;
    protected double diemTB;
    protected String hocLuc;

    public SinhVien() {
        maSV = 0;
        hoTen = "Chua co ten";
        diemTB = 0;
        hocLuc = "Chua xet";
    }

    public SinhVien(int maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    @Override
    public void xepLoaiHocLuc() {
        if (this.diemTB >= 8) {
            this.hocLuc = "Gioi";
        } else if (this.diemTB > 8 && this.diemTB >= 6) {
            this.hocLuc = "Kha";
        } else {
            this.hocLuc = "Trung Binh";
        }
    }

    @Override
    public String toString() {
        return String.format("[%d, %s, %.2f, %s]", maSV,hoTen,diemTB,hocLuc);
    }

    public double getDiemTB() {
        return diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }
    


}
