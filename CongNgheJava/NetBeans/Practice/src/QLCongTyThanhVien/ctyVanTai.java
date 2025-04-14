/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCongTyThanhVien;

/**
 *
 * @author Le Tan Phat
 */
public class ctyVanTai extends congTy {

    public double tongThu;
    public double chiPhiMuaXe;

    public ctyVanTai(String maCty, double vonDieuHanh, double tongThu, double chiPhiMuaXe, double thue) {
        super(maCty, vonDieuHanh, thue);
        this.tongThu = tongThu;
        this.chiPhiMuaXe = chiPhiMuaXe;
    }

    @Override
    public String toString() {
        return String.format("ctyVanTai: \t[%s, %f, %2.2f, %s]", maCty, vonDieuHanh, thue, resultDT);

    }

    @Override
    public void xetDoanhThu() {
        if (vonDieuHanh < tongThu) {
            resultDT = "Khong Dat";
        } else if (chiPhiMuaXe * thue > tongThu) {
            resultDT = "Vuot";
        } else {
            resultDT = "Dat";
        }
    }
}
