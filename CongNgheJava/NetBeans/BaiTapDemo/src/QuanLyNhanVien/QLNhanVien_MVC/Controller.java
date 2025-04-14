/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyNhanVien.QLNhanVien_MVC;

/**
 *
 * @author user
 */
public class Controller {

    public Model m;
    public View v;

    // kích hoạt model và view
    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;
    }

    // load và hiển thị
    public void loadShowDSNV() {
        m.connectDatabase();
        View.printDSNV(m.ct.ds);
        
    }
    public void tinhLuongloadShowDSNV() {
        m.connectDatabase();
        m.ct.tinhLuongDSNV();
        View.printDSNV(m.ct.ds);
        
    }
    
    
}
