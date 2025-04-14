/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTinhTienDien_FullTinhChat;

/**
 *
 * @author Le Tan Phat
 */
public class hoSanXuat extends hoDan {

    protected double heSoSuDung;

    public hoSanXuat(int maKH, String tenChuHo, int chiSoCu, int chiSoMoi, double heSoSuDung) {
        super(maKH, tenChuHo, chiSoCu, chiSoMoi);
        this.heSoSuDung = heSoSuDung;
    }

    @Override
    public void tinhTienDien() {
        tienDien = chiSoSuDung * hoDan.loai3 * heSoSuDung;
    }
    @Override
    public String toString() {
        return String.format("HoSanXuat: [%d, %s, %d, %d, %d, %.0f]", maKH, tenChuHo, chiSoCu, chiSoMoi, chiSoSuDung, tienDien);
    }
}
