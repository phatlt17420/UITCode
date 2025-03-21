/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi11_QLySinhVien_FullTruuTuong;



/**
 *
 * @author phatlt17420
 */
public class SV1 extends SinhVien {

    private double diemRL;

    public SV1(int maSV, int soTC, double diemTL, boolean ngoaiNgu, double diemRL) {
        super(maSV, soTC, diemTL, diemRL, ngoaiNgu);
        this.diemRL = diemRL;
    }

    public double getDiemRL() {
        return diemRL;
    }

    @Override
    public String toString() {
        return "SV1: " + super.toString();
    }

    @Override
    public void xetTN() {
        if (this.getDiemTL() >= 5 && this.getSoTC() >= 120 && this.diemRL >= 60 && this.getngoaiNgu()) {
            this.setTtTotNghiep(true);



        }
    }
// sử dụng static để xét điểm
}
