/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QLNhanVien_ClassObject;

/**
 *
 * @author Le Tan Phat
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        CongTy DataNV = new CongTy("PhatDat");
        DataNV.initDSNV(null);
        System.out.println("1. DS Nhan vien sau khi khoi tao");
        DataNV.printDSNV();
        System.out.println("2 va 3. Tinh Luong va xuat nhan vien");
        DataNV.tinhLuongCty();
        DataNV.printDSNV();
        System.out.println("4. Tim Nhan vien theo Ma Nhan Vien");
        DataNV.FindNVtheoMaNV();
        System.out.println("5. Tim Nhan vien luong hang thang cao nhat");
        DataNV.FindLuongHTMax();
        System.out.println("6. Tim Nhan vien ban hang co luong thap nhat");
        DataNV.FindLuongBHMin();
        
    }
    
}
