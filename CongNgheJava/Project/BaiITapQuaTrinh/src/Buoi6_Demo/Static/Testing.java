/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi6_Demo.Static;

import java.util.ArrayList;

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
        
        Diem a = new Diem(3.5,7.5);
        Diem b = new Diem(5,9);
        b.FuncA();
        a.FuncA();
        Diem.FuncA(); // hàm tĩnh
        Diem.khoangCach(a, b); // gọi theo phương thức tĩnh
        a.khoangCach(b); // gọi theo phương thức gắn liền với đối tượng
        ArrayList<Diem> al = new ArrayList<>();
       // Diem m =Diem.timDiemXaTamO(al);
        
        System.out.println("So luong Diem da duoc tao: " + Diem.c); // có thể gọi qua class hoặc đối tượng
        System.out.println("So luong Diem da duoc tao: " + a.c); // có thể gọi qua class hoặc đối tượng
    }
    
}
