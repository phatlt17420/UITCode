/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassFinal;

import java.sql.Date;

/**
 *
 * @author Le Tan Phat
 */
public class KhachHang {

    private String id;
    private String hoVaTen;
    private Date ngaySinh;
    private String diaChi;

    public KhachHang() {
        super();
    }

    public KhachHang(String id, String hoVaTen, Date ngaySinh, String diaChi) {
        super();
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public String getId() {
        return id;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    
    
    
    
    
    
    
}


