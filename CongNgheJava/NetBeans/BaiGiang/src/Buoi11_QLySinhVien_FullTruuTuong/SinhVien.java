/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi11_QLySinhVien_FullTruuTuong;



/**
 *
 * @author phatlt17420
 */
public class SinhVien extends AbsSinhVien{

    private int maSV;
    private int soTC;
    private double diemTL;
    private boolean ttTotNghiep;
    private boolean ngoaiNgu;
    private String xepLoaiTN;

    public SinhVien(int maSV, int soTC, double diemTL, double diemRL, boolean ngoaiNgu) {
        this.maSV = maSV;
        this.soTC = soTC;
        this.diemTL = diemTL;
        this.ttTotNghiep = false;
        this.ngoaiNgu = ngoaiNgu;
        this.xepLoaiTN = "Chua xep tot nghiep";
    }

    @Override
    public String toString() {
        return "%d, %d, %f, %s".formatted(maSV, soTC, diemTL, xepLoaiTN);
    }

    public double getDiemTL() {
        return diemTL;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setTtTotNghiep(boolean ttTotNghiep) {
        this.ttTotNghiep = ttTotNghiep;
    }

    public void setXepLoaiTN(String xepLoaiTN) {
        this.xepLoaiTN = xepLoaiTN;
    }

    public boolean getngoaiNgu() {
        return this.ngoaiNgu;
    }

    public  void xeploaiTN() {
        if (ttTotNghiep) {
            if (diemTL >= 8) {
                this.xepLoaiTN = "Gioi";
            } else if (diemTL >= 6 && diemTL < 8) {
                this.xepLoaiTN = "Kha";
            } else {
                this.xepLoaiTN = "Trung Binh";
            }
        } else {

        }
    }

    @Override
    public void xetTN() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
