/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5;

/**
 *
 * @author phatlt17420
 */
public class PhuongTrinhBac1 {
    //Thuộc tính
    public Double a;
    public Double b;
    public Double x;
    
    // constructor

    public PhuongTrinhBac1(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public  void inPhuongTrinh(){
        System.out.printf("%fx+%f",this.a,this.b);
    }

        
    //Phương thức
    
    public boolean GiaiPhuongTrinh(){
        if (a == 0){
            if (b== 0) {
                
                return true;
            }
            else if (b!=0){
                return false;
            }
                
        }
        else if(a!=0){
            
            return true;
        }

        return false;
    }
}
