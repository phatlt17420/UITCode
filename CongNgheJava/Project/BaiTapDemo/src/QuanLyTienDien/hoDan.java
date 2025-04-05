/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTienDien;

import java.awt.PrintGraphics;

/**
 *
 * @author Le Tan Phat
 */
public class hoDan extends AbsHoDan {

    protected static double loai1 = 3_500;
    protected static double loai2 = 5_500;
    protected static double loai3 = 7_000;
    protected int maKH;
    protected String tenChuHo;
    protected int chiSoCu;
    protected int chiSoMoi;
    protected int chiSoSuDung;
    protected double tienDien;

    public hoDan() {
        this.maKH = 0;
        this.tenChuHo = "Chua co thong tin";
        this.chiSoCu = 0;
        this.chiSoMoi = 0;
        this.chiSoSuDung = chiSoMoi - chiSoCu;
        this.tienDien = 0;
    }

    public hoDan(int maKH, String tenChuHo, int chiSoCu, int chiSoMoi) {
        this.maKH = maKH;
        this.tenChuHo = tenChuHo;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.chiSoSuDung = chiSoMoi - chiSoCu;
    }

    @Override
    public void tinhTienDien() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return String.format("[%d, %s, %d, %d, %d, %f]", maKH, tenChuHo, chiSoCu, chiSoMoi, chiSoSuDung, tienDien);
    }

}
