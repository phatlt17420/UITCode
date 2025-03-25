/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QLNhanVien_FullTinhChat;

import java.util.ArrayList;

/**
 *
 * @author Le Tan Phat
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CongTy cty = new CongTy();
        System.out.println("1. Khoi tao tu dong cac nhan vien");
        cty.initDSNV(null);
        System.out.println("2. Xuat cac nhan vien");
        cty.printDSNV();
        System.out.println("3. Tinh luong cac nhan vien");
        System.out.println("4. Xuat cac nhan vien + ket qua tinh luong");
        cty.tinhLuongDSNV();
        cty.printDSNV();
        System.out.println("5. Tim Nhan vien theo maNV");
        System.out.println(cty.findNV_maNV(4));
        System.out.println("5. Tim Nhan vien co luongHT lon nhat");
        ArrayList<NhanVien> dsMax = cty.findNV_luongHTMax();
        for (NhanVien i : dsMax) {
            System.out.println(i);
        }
        System.out.println("6. Tim Nhan vien Ban Hang co luongHT thap nhat");
        ArrayList<NhanVien> dsMinNVBanHang = cty.findNVBanHang_luongHTMin();
        for (NhanVien i : dsMinNVBanHang) {
            System.out.println(i);
        }
        System.out.println("7. Sap xep danh sach theo luong hang thang tang dan");
        ArrayList<NhanVien> dssort = cty.sortList_luongHT_desc();
        for (NhanVien i : dssort) {
            System.out.println(i);
        }
    }

}
