/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTinhTienDien_FullTinhChat;

import java.util.ArrayList;

/**
 *
 * @author Le Tan Phat
 */
public class Phuong implements InterfacePhuong {

    protected ArrayList<hoDan> DSHoDan;

    public Phuong() {
        DSHoDan = new ArrayList<>();

    }

    // Khởi tạo danh sách các ho dan
    @Override
    public int initHoDan(ArrayList<hoDan> ds) {
        if (ds == null) {
            DSHoDan.add(new hoKinhDoanh(123, "A", 120, 960, 1.8));
            DSHoDan.add(new hoGiaDinh(124, "B", 400, 450));
            DSHoDan.add(new hoKinhDoanh(125, "C", 300, 689, 1.3));
            DSHoDan.add(new hoSanXuat(126, "D", 150, 965, 1.5));
            DSHoDan.add(new hoGiaDinh(127, "E", 500, 21999));
            DSHoDan.add(new hoSanXuat(128, "F", 350, 987, 1.6));
            DSHoDan.add(new hoSanXuat(129, "G", 100, 989, 1.9));
        }
        return DSHoDan.size();
    }
// xuất danh sách các hô dân

    public void printDSHoDan() {
        for (hoDan i : DSHoDan) {
            System.out.println(i);
        }
    }
// tính tiền điện cho toàn bộ hộ dân

    @Override
    public void tinhTienDienHoDan() {
        for (hoDan i : DSHoDan) {
            i.tinhTienDien();
        }
    }

    // tìm tên chủ hộ, số tiền điện theo mã khách hàng
    public hoDan find_maKH(int ma) {
        for (hoDan i : DSHoDan) {
            if (i.maKH == ma) {
                return i;
            }
        }
        return null;
    }

    public double Cal_tienDienTB() {
        double tongSoTienDien = 0;
        for (hoDan i : DSHoDan) {
            tongSoTienDien += i.tienDien;
        }
        return tongSoTienDien / DSHoDan.size();
    }

    public hoDan find_tienDienMax() {
        double tienDienMax = Double.MIN_VALUE;
        for (hoDan i : DSHoDan) {
            if (i.tienDien > tienDienMax) {
                tienDienMax = i.tienDien;
            }
        }
        for (hoDan i : DSHoDan) {
            if (i.tienDien == tienDienMax) {
                return i;
            }
        }
        return null;
    }
        public hoDan find_hoSanXuat_tienDienMax() {
        double tienDienMax = Double.MIN_VALUE;
        for (hoDan i : DSHoDan) {
            if ((i.tienDien > tienDienMax) && (i instanceof hoSanXuat)) {
                tienDienMax = i.tienDien;
            }
        }
        for (hoDan i : DSHoDan) {
            if (i.tienDien == tienDienMax) {
                return i;
            }
        }
        return null;
    }
}
