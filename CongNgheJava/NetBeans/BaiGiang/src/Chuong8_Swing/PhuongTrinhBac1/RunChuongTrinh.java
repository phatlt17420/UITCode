/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chuong8_Swing.PhuongTrinhBac1;

/**
 *
 * @author phatlt17420
 */
public class RunChuongTrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ViewBacNhat v = new ViewBacNhat();
        ModelBacNhat m = new ModelBacNhat();
        Controller_BacNhat c = new Controller_BacNhat(v, m);
        c.giaiPhuongTrinhBacNhat();
        
    }
    
}
