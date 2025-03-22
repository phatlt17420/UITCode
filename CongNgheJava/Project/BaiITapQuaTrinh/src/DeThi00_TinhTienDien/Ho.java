/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi00_TinhTienDien;

/**
 *
 * @author phatlt17420
 */
public class Ho {

    protected int maKH;
    protected String tenChuHo;
    protected int chiSoCu;
    protected int chiSoMoi;
    protected int donGia;
    protected int tienDien;

    public Ho() {
        maKH = 0;
        tenChuHo = "";
        chiSoCu = 0;
        chiSoMoi = 0;
        donGia = 0;
        tienDien = 0;

    }

    public Ho(int maKH, String tenChuHo, int chiSoCu, int chiSoMoi) {
        this.maKH = maKH;
        this.tenChuHo = tenChuHo;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    @Override
    public String toString() {
        return String.format("%d, %s,%d,%d,%d,%d", this.maKH, this.tenChuHo, this.chiSoCu, this.chiSoMoi, this.donGia, this.tienDien);
    }


}
