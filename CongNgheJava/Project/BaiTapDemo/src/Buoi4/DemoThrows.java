/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi4;

/**
 *
 * @author phatlt17420
 */
public class DemoThrows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            method(70);
        } catch (Exception e) {
            System.err.println("Loi: " + e);
        }
    }

    static void method(double t) throws Exception {

        if (t < 80) {
            System.out.println("He Thogn An toan");
        } else {
            throw new Exception("Nhiet do cao");
        }

    }
}
