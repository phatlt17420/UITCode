/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTienDien.MVC;


import java.util.ArrayList;

/**
 *
 * @author Le Tan Phat
 */
public class View {
    public static void inDSHoDan(ArrayList ds) {
        System.out.println("In danh sach toan bo ho dan: ");
        for (Object i:ds){
            System.out.println(i);
        }
    }
}
