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
import java.util.Random;
public class Thay_KeoBuaBao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String arr[]={"Keo","Bua","Bao"};
        Random rd = new Random();
        int i = rd.nextInt(3);
        String MayChon=arr[i];
        System.out.println(MayChon);
        Scanner ip = new Scanner (System.in);
        String NguoiChon = ip.nextLine();
        System.out.println(NguoiChon);
        
    }
    
}
