/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi2;

/**
 *
 * @author phatlt17420
 */
import java.text.ChoiceFormat;
import java.util.Scanner;
public class DemoDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        double n;
        do {
            System.out.println("NHap vao so thuc duong: ");
            n=ip.nextDouble();
        
        } while(n<=0);
        System.out.println("So n= " + n);
    }
    
}
