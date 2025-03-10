/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi6_Demo.Static;

import java.util.ArrayList;

/**
 *
 * @author phatlt17420
 */
public class Diem {

    public double x;
    public double y;
    
    public static  double c =0; // khai báo biến tĩnh, nằm ngoài class Diem. Biến đếm

    public Diem() {
        this.x = 0;
        this.y = 0;
        Diem.c++;
    }

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
        Diem.c++; // tăng lên 1 đơn vị;
    }

    @Override
    public String toString() {
        return "(%3.2f ,%3.2f)".formatted(this.x, this.y);
    }

    public void printDiem() {
        System.out.println("%3.2f ,%3.2f)".formatted(this.x, this.y));
    }

    public double khoangCach(Diem B) {
        // sử dụng qua con trỏ this => đại diện cho A
        return 0;
    }

    public static void FuncA() {
        System.out.println("1");
        // System.out.println("" + this.x); // static => nằm ngoài đối tượng. 
        //2 cách gọi: dùng tên đối tượng hoặc tên class
    }

    public static double khoangCach(Diem A, Diem B) {

        return 0;
    }

    static Diem timDiemXaTamO(ArrayList<Diem> al) {
        
   
        
        
        return null;

    }

}
