/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1_PhanSo;

import java.util.Scanner;

/**
 *
 * @author phatlt17420
 */
public class PhanSo {

    private int tuSo;
    private int mauSo;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public static PhanSo nhapPhanSo() {

        PhanSo ps = new PhanSo();
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        ps.tuSo = ip.nextInt();
        System.out.println("Nhap mau so: ");
        ps.mauSo = ip.nextInt();
        return ps;
    }

    @Override
    public String toString() {
        return String.format("%d/ %d", this.tuSo, this.mauSo);
    }

}
