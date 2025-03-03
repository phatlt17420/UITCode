/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi4;

import java.lang.classfile.ClassFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author phatlt17420
 */
public class BaiTapSoso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        HashMap nguoi = initNguoi();

        ArrayList may = initMay();
        
//        soSanh(may, nguoi);

    }

    private static HashMap initNguoi() {

        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static ArrayList initMay() {
        ArrayList<Integer> daySoMay = new ArrayList<>();
        int n = 0;
        do {
            Random value = new Random();
            int so = value.nextInt(46) + 1;
            if (daySoMay.contains(so)) {

            } else {
                daySoMay.add(so);
                n++;
            }
        } while (n < 6);
        return daySoMay;

    }

    private static void soSanh(ArrayList may, HashMap nguoi) {

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
