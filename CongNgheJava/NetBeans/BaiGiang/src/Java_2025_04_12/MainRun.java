/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chuong08_Swing_MVC_2;

/**
 *
 * @author sonpt
 */
public class MainRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model m = new Model();
        ViewGPT v = new ViewGPT();
        
        Controller c = new Controller(m, v);
        
        c.giaiPT();
    }
    
}
