/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi8_KeThua_DongGoi_Get_Set;

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
        SinhVien sv = new SinhVien(123, "Nguyen Van A", 8.5);
        System.out.println(sv.getMaSV());
        sv.setDiemTB(9.7);
        System.out.println(sv);
    }

}
