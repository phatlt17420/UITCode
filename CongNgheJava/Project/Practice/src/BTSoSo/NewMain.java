/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTSoSo;

import java.lang.classfile.ClassFile;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author phatlt17420
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers=daySoTuNhap();
        System.out.println(numbers);
        
        
        
    }
    // tạo dãy số tự nhập
    public static ArrayList<Integer> daySoTuNhap(){
        ArrayList <Integer> ds = new ArrayList<>();
        int n=0;
        Scanner ip = new Scanner(System.in);
        while (n<6){
            System.out.print("Nhap so thu " +n+ ":");
            int number = ip.nextInt();
            if(number>-1 && number <46 && !ds.contains(number)) {
                ds.add(number);
                n++;
            }
        }
        return ds;
    }
    
    // tạo dãy số tự động
    public static ArrayList<Integer> daySoRandom (){
        ArrayList<Integer> ds = new ArrayList<>();
        Random rd=new Random();
        int n =0;
        do {
            int number=rd.nextInt(46)+1;
            if(!ds.contains(number)){
                ds.add(number);
                n++;
            }
        } while (n<6);
        return ds;
    }
}
