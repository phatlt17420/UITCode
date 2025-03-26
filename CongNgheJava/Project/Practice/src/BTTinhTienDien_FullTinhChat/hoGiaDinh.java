/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTinhTienDien_FullTinhChat;

/**
 *
 * @author Le Tan Phat
 */
public class hoGiaDinh extends hoDan {

    public hoGiaDinh(int maKH, String tenChuHo, int chiSoCu, int chiSoMoi) {
        super(maKH, tenChuHo, chiSoCu, chiSoMoi);
    }

    @Override
    public void tinhTienDien() {
        if (chiSoSuDung > 100) {
            tienDien = chiSoSuDung * hoDan.loai2;
        } else {
            tienDien = chiSoSuDung * hoDan.loai1;
        }
    }
    @Override
    public String toString() {
        return String.format("HoGiaDinh: [%d, %s, %d, %d, %d, %.0f]", maKH, tenChuHo, chiSoCu, chiSoMoi, chiSoSuDung, tienDien);
    }
}
