/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuanLyTienDien.MVC;

/**
 *
 * @author Le Tan Phat
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        View v = new View();
        Model m = new Model();
        Controller c = new Controller(m, v);
        //c.loadAndShow();
        c.tinhTienDienToanBoHoDan();
        
    }
    
}
