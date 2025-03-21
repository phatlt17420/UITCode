/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi11_QLNhanVienClass_KeThua_TruuTuong_FullTruuTuong;

import java.util.ArrayList;

/**
 *
 * @author phatlt17420
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CongTy cty = new CongTy();
        cty.initDataDSNV(null);
        System.out.println("Danh sach truoc khi tinh luong");
        cty.printDSNV();
        System.out.println("Danh sach sau khi tinh luong");
        cty.tinhLuongDSNV_V2();
        cty.printDSNV();
        System.out.println("Tim nhan vien theo ma NhanVien");
        Object nv = cty.timNVtheomaNV(119);
        if (nv instanceof NVVanPhong) {
            System.out.println("Tim thay NVVanPhong " + nv);
        } else if (nv instanceof NVBanHang) {
            System.out.println("Tim thay NVBanHang " + nv);
        } else {
            System.out.println("Khong tim thay");
        }
// tìm lương hàng tháng cao nhất có xét lương bằng nhau
        System.out.println("Nhan vien co luong HT cao nhat: ");
        ArrayList luongMax = new ArrayList<>();
        luongMax = cty.timNVLuongMax_1();
        for (Object i : luongMax) {
            System.out.println(i);
        }

    

//////////
    }

}
