/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuanLyNhanVien.QLNhanVien_MVC;

/**
 *
 * @author user
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Model m = new Model();
        View v = new View();
        Controller c =new Controller(m, v);
        
        //c.loadShowDSNV();
        c.tinhLuongloadShowDSNV();
        
        
    }
    
}
