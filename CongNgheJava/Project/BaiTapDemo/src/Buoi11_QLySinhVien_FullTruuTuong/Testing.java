/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi11_QLySinhVien_FullTruuTuong;



/**
 *
 * @author phatlt17420
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TotNghiep tn = new TotNghiep("Dot 1 nam 2026");
        System.out.println("1. Tao du lieu SV de xet");
        System.out.println("Ket qua: " + tn.initDataDSSV(null) + " sinh vien");
        System.out.println("2. In thong tin sinh vien");
        tn.initDataDSSV(null);
        tn.printDataDSSV();
        tn.xetTNDSSV();
        
        tn.printDataDSSV();
    }

}
