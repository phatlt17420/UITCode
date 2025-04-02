/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCongTyThanhVien;

/**
 *
 * @author Le Tan Phat
 */
public class congTy implements InterfaceCongTy {

    protected String maCty;
    protected double vonDieuHanh;
    protected double thue;
    protected String resultDT;

    public congTy() {
        this.maCty="";
        this.vonDieuHanh=0;
        this.thue=0;
        this.resultDT="ChuaXet";
    }

    
    public congTy(String maCty, double vonDieuHanh, double thue) {
        this.maCty = maCty;
        this.vonDieuHanh = vonDieuHanh;
        this.thue = thue;

    }

    public void setVonDieuHanh(double vonDieuHanh) {
        this.vonDieuHanh = vonDieuHanh;
    }

    @Override
    public void xetDoanhThu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




}
