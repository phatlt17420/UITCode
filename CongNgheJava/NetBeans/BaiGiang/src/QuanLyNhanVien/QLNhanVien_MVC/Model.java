/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyNhanVien.QLNhanVien_MVC;

import QuanLyNhanVien.QLNhanVien_FullTinhChat_MVC.CongTy;

/**
 *
 * @author user
 */
public class Model {

    public CongTy ct;

    public Model() {
        ct = new CongTy();
    }

    public void connectDatabase() {
        ct.initDSNV(null);
    }

    public void tinhLuongDB() {
        ct.tinhLuongDSNV();
    }
}
