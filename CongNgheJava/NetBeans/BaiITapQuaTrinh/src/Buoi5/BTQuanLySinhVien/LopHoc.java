/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5.BTQuanLySinhVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phatlt17420
 */
public class LopHoc {

    public String TenLop;
    public ArrayList<SinhVien> ds;

    public LopHoc(String LopHoc) {
        this.TenLop = LopHoc;
        this.ds = new ArrayList<>();

    }

    // 1. Khởi tạo sinh viên
    public int initDataDSSV(ArrayList<SinhVien> ds) {
        if (this.ds.isEmpty()) {
            this.ds.add(new SinhVien(123, "Nguyen Van A", 7.8));
            this.ds.add(new SinhVien(124, "Nguyen Van B", 9.0));
            this.ds.add(new SinhVien(125, "Nguyen Van C", 9.5));
            this.ds.add(new SinhVien(126, "Nguyen Van D", 5.0));
            this.ds.add(new SinhVien(127, "Nguyen Van E", 6.5));
        } else if (!this.ds.isEmpty()) {
            this.ds.addAll(ds); // sao chép toàn bộ dữ liệu. Tìm hiểu
        }

        return this.ds.size();
    }

    public void printDSSV() {
        for (SinhVien i : ds) {
            System.out.println(i);
        }
    }

    public void XepLoaiLopHoc() {
        for (SinhVien i : this.ds) {
            i.XepLoai();
        }
    }

    public void diemTBlonNhat() {
        SinhVien svMax = this.ds.get(0);
        for (SinhVien i : this.ds){
            if(svMax.diemTB < i.diemTB){
                svMax = i;
            }
        }
        System.out.println(svMax);
    }

    void FindSV() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien can tim: ");
        int MaSVCanTim = ip.nextInt();
        boolean k = false;
        for (SinhVien i : ds){
            if(i.maSV==MaSVCanTim){
                System.out.println(i);
                k=true;
            }

        }
        if (k==false)
            System.out.println("Khong tim thay");
    }

    void FindHoTen() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap ho va ten sinh vien can tim: ");
        String HoTenSVCanTim = ip.nextLine();
        boolean k = false;
        for (SinhVien i : ds){
            if(i.hoTen.equals(HoTenSVCanTim)){
                System.out.println(i);
                k=true;
            }

        }
        if (k==false)
            System.out.println("Khong tim thay");
    }

}
