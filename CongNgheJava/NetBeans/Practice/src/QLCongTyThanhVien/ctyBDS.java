/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCongTyThanhVien;

/**
 *
 * @author Le Tan Phat
 */
public class ctyBDS extends congTy {

    protected int soCanHo;
    protected double giaCanHo;

    public ctyBDS(String maCty, double vonDieuHanh, int soCanHo, double giaCanHo, double thue) {
        super(maCty, vonDieuHanh, thue);
        this.soCanHo = soCanHo;
        this.giaCanHo = giaCanHo;
    }

    @Override
    public String toString() {
        return String.format("ctyBDS: \t[%s, %f, %2.2f, %s]", maCty, vonDieuHanh, thue, resultDT);

    }

    @Override
    public void xetDoanhThu() {
        if (vonDieuHanh - soCanHo * giaCanHo - giaCanHo * thue < 0) {
            resultDT = "Vuot";
        } else if ((vonDieuHanh - soCanHo * giaCanHo) > 50) {
            resultDT = "Dat";
        } else {
            resultDT = "Khong Dat";
        }
    }

}
