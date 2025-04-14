/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyNhanVien.QLNhanVien_MVC;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class View {

    public static void printDSNV(ArrayList ds) {
        System.out.println("In nhan vien");
        for (Object nv : ds) {
            System.out.println(nv);
        }
    }
}
