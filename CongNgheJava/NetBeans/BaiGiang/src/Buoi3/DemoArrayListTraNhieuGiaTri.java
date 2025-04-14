/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi3;

/**
 *
 * @author phatlt17420
 */
import java.util.ArrayList;
public class DemoArrayListTraNhieuGiaTri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Double> b = new ArrayList<>();
        b=tinh(4.5, 5.5);
        System.out.println(b);
        
        
    }

    private static ArrayList<Double> tinh(double a, double b) {
        double x = a+b;
        double y = a-b;
        ArrayList<Double> r = new ArrayList<>();
        r.add(x);
        r.add(y);
        return r;
        
    }
    
}
