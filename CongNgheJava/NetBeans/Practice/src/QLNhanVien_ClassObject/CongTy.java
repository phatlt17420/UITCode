/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNhanVien_ClassObject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Le Tan Phat
 */
public class CongTy {
    public String tenCty;
    public ArrayList<Object> DSNV;
    
    public CongTy(String tenCty){
        this.tenCty = tenCty;
        this.DSNV = new ArrayList<>();
    }
    
    public void initDSNV(ArrayList <Object> ds){
        if(this.DSNV.isEmpty()){
            this.DSNV.add(new NVVanPhong(120,"Nguyen Van A",5000000,50));
            this.DSNV.add(new NVBanHang(121,"Nguyen Van B",1000000,100));
            this.DSNV.add(new NVVanPhong(122,"Nguyen Van C",5000,50));
            this.DSNV.add(new NVBanHang(123,"Nguyen Van D",5000000,100));
            this.DSNV.add(new NVVanPhong(124,"Nguyen Van E",50000000,50));
            this.DSNV.add(new NVBanHang(125,"Nguyen Van F",5000000,100));
        }
        else {
            this.DSNV.addAll(ds);
        }
            
    }
    public void tinhLuongCty(){
        for (Object nv :DSNV){
            if(nv instanceof NVBanHang){
                ((NVBanHang) nv).tinhLuongNVBanHang();
            }
            else if (nv instanceof NVVanPhong) {
                ((NVVanPhong) nv).tinhLuongNVVanPhong();
            }
        }
    }
    public void printDSNV(){
        for(Object nv:DSNV){
            System.out.println(nv);
        }
    }

    public void FindNVtheoMaNV() {
        System.out.println("Nhap ma nhan vien can tim: ");
        Scanner ip = new Scanner (System.in);
        int maNVFind = ip.nextInt();
        boolean result = false;
        Object nv=new Object();
        for (Object i :DSNV){
            if (i instanceof NVVanPhong){
                if(((NVVanPhong) i).maNV == maNVFind){
                    result =true;
                    nv=i;
                }
            }
            else if(i instanceof NVBanHang) {
                if(((NVBanHang) i).maNV == maNVFind){
                    result =true;
                    nv=i;
                }
            }
                
        }
        if(result){
            if(nv instanceof NVBanHang){
                System.out.println((NVBanHang)nv);
            }
            else{
                System.out.println((NVVanPhong)nv);
            }
        }
        else {
            System.out.println("Khong tim thay");
        }
    }
    
    public void FindLuongHTMax(){
        Object nvCanTim = new Object();
        double luongMax = Double.MIN_VALUE;
        for (Object nv :DSNV){
            if(nv instanceof NVBanHang){
                if (((NVBanHang) nv).luongHT>luongMax){
                    nvCanTim = (NVBanHang)nv;
                    luongMax = ((NVBanHang) nv).luongHT;
                }
            }
            else if (nv instanceof NVVanPhong){
                if (((NVVanPhong) nv).luongHT>luongMax){
                    nvCanTim = (NVVanPhong)nv;
                    luongMax = ((NVVanPhong) nv).luongHT;
                }
            }
        }
        
            System.out.println(nvCanTim);
        
    }

    void FindLuongBHMin() {
double luongMin =Double.MAX_VALUE;
Object nvCanTim = new Object();
for (Object nv:DSNV){
    if(nv instanceof NVBanHang){
       if( ((NVBanHang) nv).luongHT < luongMin){
           luongMin = ((NVBanHang) nv).luongHT ;
           nvCanTim = (NVBanHang) nv;
       }
    }
        
}
System.out.println(nvCanTim);

    }
    
    
    
}
