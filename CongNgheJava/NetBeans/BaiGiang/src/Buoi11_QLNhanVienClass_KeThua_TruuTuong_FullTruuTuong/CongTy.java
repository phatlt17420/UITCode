/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi11_QLNhanVienClass_KeThua_TruuTuong_FullTruuTuong;


import java.util.ArrayList;
import 
/**
 *
 * @author phatlt17420
 */
public class CongTy extends AbsCongTy{

    protected String tenCty;
    protected ArrayList<NhanVien> DSNV;

    public CongTy() {
        tenCty = "PhatDat";
        DSNV = new ArrayList<>();
    }

    public int initDataDSNV(ArrayList<NhanVien> ds) {
        if (DSNV.isEmpty()) {
            this.DSNV.add(new NVVanPhong(120, "Nguyen Van A", 1500000, 30));
            this.DSNV.add(new NVBanHang(121, "Nguyen Van B", 15000000, 5));
            this.DSNV.add(new NVBanHang(122, "Nguyen Van C", 15000000, 5));
            this.DSNV.add(new NVVanPhong(123, "Nguyen Van D", 15000000, 5));
            this.DSNV.add(new NVVanPhong(124, "Nguyen Van E", 15000000, 5));
            this.DSNV.add(new NVBanHang(125, "Nguyen Van F", 15000000, 5));
        } else if (!(DSNV.isEmpty())) {
            ds.addAll(ds);
        }

        return DSNV.size();
    }

    public void printDSNV() {
        for (Object i : DSNV) {
            System.out.println(i);

        }
    }

    @Override
    public void tinhLuongDSNV() {
        for (Object i : DSNV) {
            if (i instanceof NVBanHang) {
                ((NVBanHang) i).tinhLuongHT();
            } else {
                ((NVVanPhong) i).tinhLuongHT();
            }

        }
    }

    public void tinhLuongDSNV_V2() {
        for (NhanVien i : DSNV) {
            i.tinhluongHT();

        }
    }

    @Override
    public Object timNVtheomaNV(int maNV) {

        for (Object i : DSNV) {
            if (((NhanVien) i).maNV == maNV) {
                return i;
            }
        }

        return null;
    }

    @Override
    public ArrayList timNVLuongMax_1() {
// Bước 1: tìm lương hàng tháng cao nhất
        double m = ((NhanVien) this.DSNV.get(0)).luongHT;
        for (Object nv : DSNV) {
            if (((NhanVien) nv).luongHT > m) {
                m = ((NhanVien) nv).luongHT;
            }
        }
        ArrayList<Object> dsNVLuongMax = new ArrayList<>();
        for (Object nv : DSNV) {
            if (((NhanVien) nv).luongHT == m) {
                dsNVLuongMax.add(nv);
            }
        }

        return dsNVLuongMax;
    }

    @Override
    public double timluongHTMax() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }







////////
}
