/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi3;

/**
 *
 * @author phatlt17420
 */
import java.util.HashMap;
import java.util.ArrayList;
// import java.util.Scanner;

public class BT_QuanLyNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Mỗi nhân viên HashMap
        Lưu trữ nhân viên ArrayList
         */
        ArrayList<HashMap> ds = new ArrayList<>();
        HashMap<Integer, Object> NV = new HashMap<>(); // kiểu object
//        ds.add(initNVVP(121, "Nguyen Van A", 65000000, 22));
//        ds.add(initNVBH(120, "Nguyen Van B", 67000000, 92));
        initDSNV(ds);
//        tinhLuongHT(ds); // làm lại
        printDSNV(ds);
        HashMap nv = timNVTheoMaNV(ds, 123);
        if (nv!= null){
            System.out.println("Co");}
            else {
                    
                    }
        
    }

    private static void initDSNV(ArrayList<HashMap> ds) {
        if (ds.isEmpty()) {
            ds.add(initNVVP(123, "Nguyen Van A", 65000000, 0, 22));
            ds.add(initNVBH(124, "Nguyen Van B", 67000000, 0, 92));
            ds.add(initNVBH(125, "Nguyen Van C", 80000000, 0, 34));
            ds.add(initNVVP(126, "Nguyen Van D", 85000000, 0, 22));
            ds.add(initNVVP(128, "Nguyen Van E", 10000000, 0, 22));
            ds.add(initNVBH(129, "Nguyen Van F", 220000000, 0, 34));
        } else {

        }
// test mở rộng. có trong danh sách rồi thì không thêm, còn nếu chưa thì thêm vào

    }

    private static HashMap initNVVP(int maNV, String hoTen, int luongCB, int luongHT, int soNgay) {
        HashMap<String, Object> nv = new HashMap<>();
        nv.put("maNV", maNV);
        nv.put("hoTen", hoTen);
        nv.put("luongCB", luongCB);
        nv.put("luongHT", luongHT);
        nv.put("soNgay", soNgay);

        return nv;

    }

    private static HashMap initNVBH(int maNV, String hoTen, int luongCB, int luongHT, int soSP) {
        HashMap<String, Object> nv = new HashMap<>();
        nv.put("maNV", maNV);
        nv.put("hoTen", hoTen);
        nv.put("luongCB", luongCB);
        nv.put("luongHT", luongHT);
        nv.put("soSP", soSP);

        return nv;

    }

    private static void printDSNV(ArrayList<HashMap> ds) {
        for (HashMap<String, Object> nv : ds) {
            System.out.println("%d, %s, %d, %d, %d,%d".formatted(nv.get("maNV"),
                    nv.get("hoTen"),
                    nv.get("luongCB"),
                    nv.get("luongHT"),
                    nv.get("soNgay"),
                    nv.get("soSP")));

// System.out.println(nv.get("hoTen") + nv.get(nv));
        }
    }

//    private static void tinhLuongHT(ArrayList<HashMap> ds) {
//        for(HashMap nv:ds)
//        {
//            if (nv.containsKey("soNgay"))
//            {Integer tongLuong = (Integer)nv.get("luongCB") + ((int) nv.get("soNgay") * 180000);
//            nv.put("luongHT",tongLuong);
//            }
//            else
//            {Integer tongLuong = (Integer)nv.get("luongCB") + ((int) nv.get("soSP") * 18000);
//            nv.put("luongHT",tongLuong);
//            }
//        }
//    }
    private static HashMap timNVTheoMaNV(ArrayList<HashMap> ds, int maNV) {
        for (HashMap nv : ds) {
            if ((int) nv.get("maNv") == maNV) {
                return nv;
            }
        }
        return null;

    }

}
