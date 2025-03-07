/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5;

/**
 *
 * @author phatlt17420
 */
public class SinhVien {
    // Thuộc tính
    public int MaSV;
    public String hoTen;
    public Double diemTB;
      
    // Constructor: phương thức đặc biệt, phương thức khởi tạo.
    public SinhVien(){
        MaSV = 123;
        hoTen = "Nguyễn Văn A";
        diemTB = 8.6;
    }

    public SinhVien(int MaSV, String hoTen, Double diemTB) {
        this.MaSV = MaSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    

    //Phương thức


    @Override
    public String toString() {
        
        return "[%d,%s,%f]".formatted(MaSV,hoTen,diemTB);
        
    }
//    public void printSV() {
//        System.out.println("---In thong tin sinh vien: ---");
//        System.out.println("\t + Ma SV: "+ MaSV);
//        System.out.println("\t + Ho Ten: "+ hoTen);
//        System.out.println("\t + Diem TB: "+ diemTB);
//        System.err.println("\t + Dia chi: " + this);
//    }
    
    
}
