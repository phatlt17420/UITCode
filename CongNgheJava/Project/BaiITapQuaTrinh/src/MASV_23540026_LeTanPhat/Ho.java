/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MASV_23540026_LeTanPhat;

/**
 *
 * @author phatlt17420
 */
public class Ho {

    protected static int loai1 = 3500;
    protected static int loai2 = 5500;
    protected static int loai3 = 7000;
    protected int maKH;
    protected String tenChuHo;
    protected int chiSoCu;
    protected int chiSoMoi;
    protected int chiTieuThu;
    protected int donGia;
    protected int tienDien;

    public Ho(int maKH, String tenChuHo, int chiSoCu, int chiSoMoi, int donGia) {
        this.maKH = maKH;
        this.tenChuHo = tenChuHo;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.donGia = donGia;
        this.chiTieuThu = chiSoMoi - chiSoCu;
    }

}
