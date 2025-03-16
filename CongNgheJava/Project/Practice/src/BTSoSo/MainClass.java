/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTSoSo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Le Tan Phat
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList <Integer> nb = new ArrayList<>();
        System.out.println(initNumbersMachine());
    }

    public static ArrayList<Integer> initNumbersMachine() {
        ArrayList<Integer> daySo = new ArrayList<>();
        int n=0;
        do{
            Random ip = new Random();
            int r = ip.nextInt(46)+1;
            if (!daySo.contains(r)){
                n++;
                daySo.add(r);
            }
                
        } while (n<6);
        return  daySo;
    }

}
