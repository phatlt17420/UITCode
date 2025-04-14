/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTienDien.MVC;

import QuanLyTienDien.Phuong;

/**
 *
 * @author Le Tan Phat
 */
public class Model {

    public Phuong p;

    public Model() {
        this.p = new Phuong();
    }

    public void connectDB() {
        p.initHoDan(null);
    }

    public void tinhTienDienToanBo() {
        p.tinhTienDienHoDan();
    }

}
