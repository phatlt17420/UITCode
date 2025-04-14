/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi2;

/**
 *
 * @author phatlt17420
 */
import java.util.Scanner;
public class Demo_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nhap vao so thuc duong:");
        Scanner ip = new Scanner (System.in);
        double SoNhap= ip.nextDouble();
        while (SoNhap <=0) 
        {
            System.out.println("Nhap lai: ");
            SoNhap=ip.nextDouble();
        }
            
        System.out.println("So ban da nhap la:" + SoNhap);
    }
    
}
