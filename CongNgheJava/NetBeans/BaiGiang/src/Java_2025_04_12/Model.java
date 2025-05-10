/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong08_Swing_MVC_2;

/**
 *
 * @author sonpt
 */
public class Model {
    Model(){
        
    }
    
    public String giaiPTB1(double a, double b){
        String nghiem = "";
        if(a == 0){
            if(b == 0)
                nghiem = "Vô số nghiệm";
            else
                nghiem = "Vô nghiệm";
        }
        else{
            nghiem = "Nghiệm x = %f".formatted(-b/a);
        }
        
        System.out.println("Ghi vao CSDL");
        
        return nghiem;
    }
            
}
