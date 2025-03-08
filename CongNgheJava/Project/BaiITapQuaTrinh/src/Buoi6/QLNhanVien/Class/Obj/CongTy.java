/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi6.QLNhanVien.Class.Obj;

import java.util.ArrayList;

/**
 *
 * @author phatlt17420
 */
public class CongTy {
    public String tenCty;
    public ArrayList <Object> ds;

    public CongTy(String tenCty) {
        this.tenCty = tenCty;
        this.ds = new ArrayList<>();
    }
    public void initDataDSNV (ArrayList<Object> ds) {
        if (this.ds.isEmpty()) {
            this.ds.add(new NVBanHang(123, "Nguyen VAn A",2000000,50));
            this.ds.add(new NVBanHang(124, "Nguyen VAn B",2000000,50));
            this.ds.add(new NVVanPhong(125, "Nguyen VAn C",2000000,50));
            this.ds.add(new NVVanPhong(126, "Nguyen VAn D",2000000,50));
            this.ds.add(new NVVanPhong(127, "Nguyen VAn E",2000000,50));
        } else if (!this.ds.isEmpty()) {
            this.ds.addAll(ds); // sao chép toàn bộ dữ liệu. Tìm hiểu
        }

    }
    
    public void printDSNV () {
        for(Object i : ds){
            System.out.println(i);
        }
    }
    // Tính lương các nhân viên
    public void tinhLuongHT (){
        for(Object nv : ds){
            // instanceof : kiểm tra đối tuogn75 tạo ra từ class nào
            if(nv instanceof NVBanHang){
                ((NVBanHang) nv).tinhLuongHT_BH();
            }
            else if (nv instanceof NVVanPhong){
                ((NVVanPhong) nv).tinhLuongHT_VP();
            }
        }
    }
    
}
