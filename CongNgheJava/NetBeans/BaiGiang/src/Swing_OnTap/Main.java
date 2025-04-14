/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Swing_OnTap;

/**
 *
 * @author phatlt17420
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewGPT v = new ViewGPT();
        Model m = new Model();
        Controller c= new Controller(v, m);
        c.giaiPT();
        
    }
    
}
