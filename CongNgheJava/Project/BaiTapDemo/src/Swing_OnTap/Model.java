/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing_OnTap;

/**
 *
 * @author phatlt17420
 */
public class Model {

    public Model() {
    }

    public String giaiPTB1(double a, double b) {
        String nghiem = "";
        if (a == 0) {
            nghiem = "Vo so nghiem";
        } else if (b == 0) {
            nghiem = "Vo nghiem";
        } else {
            nghiem = "Nghiem x = %f".formatted(-b / a);
        }

        // có thể gọi cơ sở dữ liệu ở đây
        // 
        return nghiem;
    }
}
