/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTienDien.MVC;

/**
 *
 * @author Le Tan Phat
 */
public class Controller {

    public Model m;
    public View v;
    
    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;
    }

    // load và hiển thị
    public void loadAndShow() {
        m.connectDB();
        View.inDSHoDan(m.p.DSHoDan);
    }
    public void tinhTienDienToanBoHoDan(){
        m.connectDB();
        m.tinhTienDienToanBo();
        View.inDSHoDan(m.p.DSHoDan);
    }
    
}
