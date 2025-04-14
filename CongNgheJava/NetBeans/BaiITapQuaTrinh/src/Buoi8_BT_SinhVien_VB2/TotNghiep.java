/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi8_BT_SinhVien_VB2;

import Buoi8_BT_SinhVien_VB2_DaHinh.SV1;
import Buoi8_BT_SinhVien_VB2_DaHinh.SinhVien;
import Buoi8_BT_SinhVien_VB2_DaHinh.VB2;
import java.util.ArrayList;

/**
 *
 * @author phatlt17420
 */
public class TotNghiep {

    private String dotXetTN;
    private ArrayList<SinhVien> ds;

    public TotNghiep(String dotXetTN) {
        this.dotXetTN = dotXetTN;
        this.ds = new ArrayList<>();
    }

    //1. Khởi tạo dữ liệu
    public int initDataDSSV(ArrayList<SinhVien> ds) {
        if (ds == null) {
            this.ds.add(new SV1(123, 60, 5.6, true, 60));
            this.ds.add(new VB2(124, 119, 8.0, 60, true));
            this.ds.add(new SV1(125, 80, 7.5, true, 90));
            this.ds.add(new SV1(126, 50, 5.6, true, 60));
            this.ds.add(new VB2(127, 90, 8.0, 60, true));
            this.ds.add(new SV1(128, 115, 7.5, true, 90));
        } else {
            this.ds.addAll(ds);
        }
        return this.ds.size();
    }
    public void printDataDSSV(){
        for(SinhVien i : ds){
            System.out.println(i);
        }
    }
    public  void xetTNDSSV(){
        for(SinhVien i : ds){
            if (i instanceof SV1){
                ((SV1) i).xetTN_SV1();
            }
            else if (i instanceof VB2){
                ((VB2) i).xetTNVB2();
            }
        }
    }

}
