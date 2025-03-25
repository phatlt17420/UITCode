/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapQuanLySinhVien_FullTinhChat;

import java.util.ArrayList;

/**
 *
 * @author Le Tan Phat
 */
public class Lop {

    ArrayList<SinhVien> DSSV;

    public Lop() {
        this.DSSV = new ArrayList<SinhVien>();
    }

    public int initDSSV(ArrayList<SinhVien> ds) {
        if (ds == null) {
            DSSV.add(new SinhVien(120, "Nguyen Van 1", 5.6));
            DSSV.add(new SinhVien(121, "Nguyen Van 2", 9));
            DSSV.add(new SinhVien(122, "Nguyen Van 3", 9));
            DSSV.add(new SinhVien(123, "Nguyen Van 4", 9));
            DSSV.add(new SinhVien(124, "Nguyen Van 5", 5.9));
            DSSV.add(new SinhVien(125, "Nguyen Van 6", 6));
            DSSV.add(new SinhVien(126, "Nguyen Van 7", 5));
            DSSV.add(new SinhVien(127, "Nguyen Van 8", 5));
            DSSV.add(new SinhVien(128, "Nguyen Van 9", 5));
        } else {
            DSSV.addAll(ds);
        }
        return DSSV.size();
    }

    public void printDSSV() {
        for (SinhVien i : DSSV) {
            System.out.println(i);
        }
    }

    // xpế loại danh sách sinh vien
    public void xepLoaiDSSV() {
        for (SinhVien i : DSSV) {
            i.xepLoaiHocLuc();
        }
    }

    // tìm điểm trung bình Max
    public double diemTBMax() {
        double diemMax = Double.MIN_VALUE;
        for (SinhVien i : DSSV) {
            if (i.diemTB > diemMax) {
                diemMax = i.diemTB;
            }
        }
        return diemMax;
    }

    // tìm list sinh vien co diemTrungBinh max
    public ArrayList<SinhVien> findListSV_diemTBMax() {
        ArrayList<SinhVien> danhsach = new ArrayList<>();
        double max = this.diemTBMax();
        for (SinhVien i : DSSV) {
            if (i.diemTB == max) {
                danhsach.add(i);
            }
        }

        return danhsach;
    }

}
