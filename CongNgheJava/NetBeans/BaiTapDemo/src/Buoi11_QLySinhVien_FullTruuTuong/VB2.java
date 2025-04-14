/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi11_QLySinhVien_FullTruuTuong;





/**
 *
 * @author phatlt17420
 */
public class VB2 extends SinhVien {

    public VB2(int maSV, int soTC, double diemTL, double diemRL, boolean ngoaiNgu) {
        super(maSV, soTC, diemTL, diemRL, ngoaiNgu);
    }

    @Override
    public String toString() {
        return "VB2: "+ super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public void xetTN(){
        if (this.getDiemTL()>=5 && this.getSoTC()>=74 && this.getngoaiNgu()){
            this.setTtTotNghiep(true);
            if (this.getDiemTL()>=8){
                this.setXepLoaiTN("Gioi");
            }
            else if (this.getDiemTL()>=6){
                this.setXepLoaiTN("Kha");
            }
            else {
                this.setXepLoaiTN("Trung Binh");
            }
                
            
        }
    
    
}}
