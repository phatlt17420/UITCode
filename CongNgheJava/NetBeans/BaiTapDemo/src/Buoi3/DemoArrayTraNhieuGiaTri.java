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
public class DemoArrayTraNhieuGiaTri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arr = tinh(1, 5);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }

    private static int[] tinh(int a, int b) {
        return new int[] {a+b,a-b,a*b};
    }

}
