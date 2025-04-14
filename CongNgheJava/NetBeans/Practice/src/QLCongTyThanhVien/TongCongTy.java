/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCongTyThanhVien;

import java.util.ArrayList;

/**
 *
 * @author Le Tan Phat
 */
public class TongCongTy {

    ArrayList<congTy> dsdataCty;
// constructor

    public TongCongTy() {
        dsdataCty = new ArrayList<>();

    }

    public int initCty(ArrayList<congTy> dsCty) {

        if (dsCty == null) {
            dsdataCty.add(new ctyBDS("B111", 108.5, 65, 1.3, 0.19));
            dsdataCty.add(new ctyBDS("B112", 158.6, 50, 1.2, 0.15));
            dsdataCty.add(new ctyBDS("B113", 130.8, 67, 1.1, 0.02));
            dsdataCty.add(new ctyVanTai("V201", 50.9, 61.1, 30.2, 0.06));
            dsdataCty.add(new ctyVanTai("V202", 80.5, 71.1, 0, 0.08));
            dsdataCty.add(new ctyGiaoDuc("G301", 39.3, 30.2, 0.02));
            dsdataCty.add(new ctyGiaoDuc("G302", 59.2, 65.6, 0.03));

        } else {
            dsdataCty.addAll(dsCty);
        }
        return dsdataCty.size();
    }

    public void printDSCty() {
        for (congTy i : dsdataCty) {
            System.out.println(i);
        }
    }

    public void xetDoanhThuDSCty() {
        for (congTy i : dsdataCty) {
            i.xetDoanhThu();
        }
    }
}
