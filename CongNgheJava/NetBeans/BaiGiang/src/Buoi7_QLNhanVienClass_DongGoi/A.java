/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi7_QLNhanVienClass_DongGoi;

/**
 *
 * @author phatlt17420
 */
public class A {
    private int x;
    protected int y;
    public int z;

    public A(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private void methodA() {
        System.out.println("Class A: Method A: Private");
        
    }
    protected void methodB() {
        System.out.println("Class A: Method B: Protected");
    }
    public void methodC() {
        System.out.println("Class A: Method C: Public");
    }
    
}
