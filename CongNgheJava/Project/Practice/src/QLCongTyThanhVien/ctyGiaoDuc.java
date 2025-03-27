/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCongTyThanhVien;

/**
 *
 * @author Le Tan Phat
 */
public class ctyGiaoDuc extends congTy {

    public double tongThu;

    public ctyGiaoDuc(String maCty, double vonDieuHanh, double tongThu, double thue) {
        super(maCty, vonDieuHanh, thue);
        this.tongThu = tongThu;

    }

    @Override
    public String toString() {
        return String.format("ctyGiaoDuc: \t[%s, %f, %2.2f, %s]", maCty, vonDieuHanh, thue, resultDT);

    }

    @Override
    public void xetDoanhThu() {
        if (vonDieuHanh > tongThu) {
            resultDT = "Khong Dat";
        } else if (tongThu * thue > 10) {
            resultDT = "Vuot";
        } else {
            resultDT = "Dat";
        }
    }

}
