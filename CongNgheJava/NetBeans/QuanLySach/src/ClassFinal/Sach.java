/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClassFinal;

/**
 *
 * @author Le Tan Phat
 */
public class Sach {

    private String id;
    private String tenSach;
    private double giaBan;
    private int namXuatBan;

    public Sach() {
        super();
    }

    public Sach(String id, String tenSach, double giaBan, int namXuatBan) {
        super();
        this.id = id;
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public String getId() {
        return id;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }




}
