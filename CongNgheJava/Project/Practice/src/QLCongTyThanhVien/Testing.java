/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QLCongTyThanhVien;

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
        TongCongTy tongCtyA = new TongCongTy();
        System.out.println(tongCtyA.initCty(null));
        tongCtyA.printDSCty();
        System.out.println("Xet dong thu");
        tongCtyA.xetDoanhThuDSCty();
        tongCtyA.printDSCty();

    }

}
