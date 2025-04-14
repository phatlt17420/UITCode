/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTinhTienDien_FullTinhChat;

/**
 *
 * @author Le Tan Phat
 */
public class hoKinhDoanh extends hoDan {

    protected double heSoSuDung;

    public hoKinhDoanh(int maKH, String tenChuHo, int chiSoCu, int chiSoMoi, double heSoSuDung) {
        super(maKH, tenChuHo, chiSoCu, chiSoMoi);
        this.heSoSuDung = heSoSuDung;
    }

    @Override
    public void tinhTienDien() {
        if (chiSoSuDung > 500) {
            tienDien = hoDan.loai3 * heSoSuDung * chiSoSuDung;
        } else {
            tienDien = hoDan.loai2 * heSoSuDung * chiSoSuDung;
        }
    }
    @Override
    public String toString() {
        return String.format("HoKinhDoanh: [%d, %s, %d, %d, %d, %.0f]", maKH, tenChuHo, chiSoCu, chiSoMoi, chiSoSuDung, tienDien);
    }
    
    
    
}
