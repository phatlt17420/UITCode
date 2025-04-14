/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi3;

/**
 *
 * @author phatlt17420
 */
public class MethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float x = myMethod(2, 4);
        float y =myMethod();

    }

    static float myMethod(int x, float y) { //static: sử dụng bên trong, không phải của đối tượng.
        return x + y;
    }
        // java không có kỹ thuật tham số mặc định, nhưng có nạp chồng
    static float myMethod(){
        return 0;
    }

}
