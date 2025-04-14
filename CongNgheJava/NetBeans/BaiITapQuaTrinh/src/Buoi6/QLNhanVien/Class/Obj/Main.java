/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi6.QLNhanVien.Class.Obj;

/**
 *
 * @author phatlt17420
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CongTy cty =new CongTy("Phat Dat");
        cty.initDataDSNV(null);
        cty.tinhLuongHT();
        cty.printDSNV();
    }
    
}
