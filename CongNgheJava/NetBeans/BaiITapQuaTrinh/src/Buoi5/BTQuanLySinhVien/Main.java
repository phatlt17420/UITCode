/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi5.BTQuanLySinhVien;

/**
 *
 * @author phatlt17420
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc("12A9");
        System.out.println("TAo du lieu sinh vien");
        lopHoc.initDataDSSV(null); // khoing6 có dữ liệu
        System.out.println("In danh sach sinh vien");
        lopHoc.XepLoaiLopHoc();
        lopHoc.printDSSV();
        System.out.println("Tim diem trung binh lon nhat");
        lopHoc.diemTBlonNhat();
        System.out.println("Tim sinh vien theo maSV");
        lopHoc.FindSV();
        System.out.println("Tim sinh vien theo ho ten sinh vien:");
        lopHoc.FindHoTen();
        
    }

}
