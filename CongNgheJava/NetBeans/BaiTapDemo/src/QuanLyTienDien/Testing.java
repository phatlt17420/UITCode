/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuanLyTienDien;

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

        Phuong PhuongA = new Phuong();
        System.out.println("1.Khoi tao danh sach 7 khach hang");
        int soHo = PhuongA.initHoDan(null);
        System.out.println("Danh sach " + soHo + " khach hang da tao: ");
        PhuongA.printDSHoDan();
        System.out.println("2.Tinh tien dien cho tung khach hang");
        PhuongA.tinhTienDienHoDan();
        PhuongA.printDSHoDan();
        System.out.println("3.Tim khach hang theo ma KH");
        System.out.println(PhuongA.find_maKH(125));
        System.out.println("4.Tinh trung binh tien dien");
        System.out.println(PhuongA.Cal_tienDienTB());
        System.out.println("5.tim tien dien max ho dan");
        System.out.println(PhuongA.find_tienDienMax());
        System.out.println("5.tim tien dien max ho san xuat");
        System.out.println(PhuongA.find_hoSanXuat_tienDienMax());
        
        
    }

}
