/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BaiTapQuanLySinhVien_FullTinhChat;

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
        Lop lh=new Lop();
        lh.initDSSV(null);
        lh.printDSSV();
        System.out.println("Xep loai hoc luc");
        lh.xepLoaiDSSV();
        lh.printDSSV();
        System.out.println("Tim diem trung binh cao nhat");
        System.out.println(lh.diemTBMax());
        System.out.println("DS sinhvien trung binh cao nhat");
        
        ArrayList<SinhVien> dsSVMax= lh.findListSV_diemTBMax();
        for(SinhVien i: dsSVMax){
            System.out.println(i);
        }
    }
    
}
