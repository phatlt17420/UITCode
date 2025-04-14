/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chuong8_Swing.p1;

import Chuong8_Swing.p1.GUI;
import javax.swing.JFrame;

/**
 *
 * @author phatlt17420
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI g = new GUI();
        g.setVisible(true);
        
        
        JFrame gui = new JFrame("Login");
        
        gui.setSize(500, 500);
        gui.setVisible(true);
    }
    
}
