/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi3;

/**
 *
 * @author phatlt17420
 */
public class BaiTapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        So sánh 2 chuỗi
        input: 
            Chuỗi s1: string (20_30_31_8_10)
            Chuỗi s2: string; (20_40_8_17_39)
        output:
            + n: int (số lượng trùng nhau) ==> n=2
            + Lưu trữ các giá trị trùng nhau.
        */
        String s1 = "20_30_31_8_10";
        String s2 = "20_40_8_17_39";
        String[] arr1 = s1.split("_");
        String[] arr2 = s2.split("_");
        System.out.println(arr1);

        
    }
    
}
