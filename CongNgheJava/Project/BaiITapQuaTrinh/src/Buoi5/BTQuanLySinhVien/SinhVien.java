/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5.BTQuanLySinhVien;

/**
 *
 * @author phatlt17420
 */
public class SinhVien {

    public int maSV;
    public String hoTen;
    public Double diemTB;
    public String xepLoai;

    public SinhVien() {
        this.maSV = 0;
        this.hoTen = "";
        this.diemTB = 0.0;
        this.xepLoai = "";
    }

    public SinhVien(int maSV, String hoTen, Double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public void XepLoai() {
        if (this.diemTB >= 8) {
            this.xepLoai = "Gioi";
        } else if (this.diemTB >= 6 && this.diemTB < 8) {
            this.xepLoai = "Kha";
        } else {
            this.xepLoai = "Chua xep loai";
        }

    }

    @Override
    public String toString() {
        return "[%d,%s,%f,%s]".formatted(this.maSV, this.hoTen, this.diemTB, this.xepLoai);
    }

    public void printSinhVien() {
        System.out.println("--------------------");
        System.out.println("Ma SV: " + this.maSV);
        System.out.println("Ho va ten: " + this.hoTen);
        System.out.println("Diem TB: " + this.diemTB);
        System.err.println("Xep loai: " + this.xepLoai);
    }
}
