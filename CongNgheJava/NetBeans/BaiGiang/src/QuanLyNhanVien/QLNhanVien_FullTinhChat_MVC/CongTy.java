/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyNhanVien.QLNhanVien_FullTinhChat_MVC;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Le Tan Phat
 */
public class CongTy implements InterfaceCongTy {

    public ArrayList<NhanVien> ds;

    public CongTy() {
        ds = new ArrayList<>();
    }
// khởi tạo danh sách nhân viên mẫu

    public int initDSNV(ArrayList<NhanVien> data) {
        if (data == null) {
            ds.add(new NVBanHang(1, "Nguyen Van 1", 3_000_000, 10));
            ds.add(new NVBanHang(2, "Nguyen Van 2", 5_000_000, 9));
            ds.add(new NVBanHang(3, "Nguyen Van 3", 3_000_000, 9));
            ds.add(new NVBanHang(4, "Nguyen Van 4", 4_000_000, 8));
            ds.add(new NVVanPhong(5, "Nguyen Van 5", 3_000_000, 20));
            ds.add(new NVVanPhong(6, "Nguyen Van 6", 3_000_000, 20));
            ds.add(new NVVanPhong(7, "Nguyen Van 7", 1_000_000, 15));
            ds.add(new NVVanPhong(8, "Nguyen Van 8", 3_000_000, 10));
        } else if (data != null) {
            ds.addAll(data);
        }
        return ds.size();
    }

// Xuất thông tin các nhân viên
    public void printDSNV() {
        for (NhanVien i : ds) {
            System.out.println(i);
        }
    }
// Hàm tính lương các nhân viên

    @Override
    public void tinhLuongDSNV() {
        for (NhanVien i : ds) {
            i.tinhLuong();
        }
    }

    public NhanVien findNV_maNV(int ma) {
        for (NhanVien i : ds) {
            if (i.maNV == ma) {
                return i;
            }
        }
        return null;
    }

    // list nhân vien có lương hàng tháng cao nhất
    public ArrayList<NhanVien> findNV_luongHTMax() {
        double luongMax = Double.MIN_VALUE;
        ArrayList<NhanVien> dsluongHTMax = new ArrayList<>();
        for (NhanVien i : ds) {
            if (i.luongHT > luongMax) {
                luongMax = i.luongHT;
            }
        }
        for (NhanVien i : ds) {
            if (i.luongHT == luongMax) {
                dsluongHTMax.add(i);
            }
        }
        return dsluongHTMax;
    }

    // list nhân viên bán hàng có lương hàng tháng thấp nhất
    public ArrayList<NhanVien> findNVBanHang_luongHTMin() {

        double luongMin = Double.MAX_VALUE;
        ArrayList<NhanVien> dsluongHTNVBanHangMin = new ArrayList<>();
        for (NhanVien i : ds) {
            if (i.luongHT < luongMin && i instanceof NVBanHang) {
                luongMin = i.luongHT;
            }
        }
        for (NhanVien i : ds) {
            if (i.luongHT == luongMin) {
                dsluongHTNVBanHangMin.add(i);
            }
        }
        return dsluongHTNVBanHangMin;

    }
    // sort danh sách theo luong hàng tháng tăng dần

    public ArrayList<NhanVien> sortList_luongHT_desc() {
        ArrayList<NhanVien> result = new ArrayList<>(ds);
        result.sort(Comparator.comparingDouble(NhanVien::getLuongHT));
        return result;
    }
}
