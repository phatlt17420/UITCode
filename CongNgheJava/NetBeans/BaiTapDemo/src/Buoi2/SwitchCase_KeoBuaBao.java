/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author phatlt17420
 */
public class SwitchCase_KeoBuaBao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int diemNguoi = 0;
        int diemMay = 0;
        int n = 1;
        Scanner ip = new Scanner(System.in);
        do {
            System.out.println("------------------------");
            System.out.println("Luot choi thu " + n + ":");
            final String arr[] = {"Keo", "Bua", "Bao"};
            Random rd = new Random();
            int i = rd.nextInt(3);
            String MayChon = arr[i];
            System.out.println("May Chon: " + MayChon);

            System.out.println("Nhap vao lua chon cua Ban: ");

            String NguoiChon = ip.nextLine();
            while (!(NguoiChon.equals("Keo") || NguoiChon.equals("Bua") || NguoiChon.equals("Bao"))) {
                System.out.println("Nguoi choi nhap lai: ");
                NguoiChon = ip.nextLine();
            }
            System.out.println("Nguoi Chon: " + NguoiChon);
            n++;
            switch (NguoiChon) {
                case "Keo" -> {
                    switch (MayChon) {
                        case "Keo" ->
                            System.out.println("Nguoi hoa May");
                        case "Bua" -> {
                            System.out.println("Nguoi thua May");
                            diemMay++;
                        }
                        case "Bao" -> {
                            System.out.println("Nguoi thang May");
                            diemNguoi++;
                        }
                    }
                }
                case "Bua" -> {
                    switch (MayChon) {
                        case "Keo":
                            System.out.println("Nguoi thang May");
                            diemNguoi++;
                            break;
                        case "Bua":
                            System.out.println("Nguoi Hoa May");
                            break;
                        case "Bao":
                            System.out.println("Nguoi thua May");
                            diemMay++;
                            break;
                    }
                }
                case "Bao" -> {
                    switch (MayChon) {
                        case "Keo":
                            System.out.println("Nguoi thua May");
                            diemMay++;
                            break;
                        case "Bua":
                            System.out.println("Nguoi thang May");
                            diemNguoi++;
                            break;
                        case "Bao":
                            System.out.println("Nguoi hoa May");
                            break;
                    }
                }

            }
            System.out.println("Diem Nguoi: " + diemNguoi);
            System.out.println("Diem May: " + diemMay);
        } while (Math.abs(diemNguoi - diemMay) <= 2);
        System.out.println("Ket Qua Tong Hop");
        if (diemNguoi > diemMay) {
            System.out.println("Nguoi Thang May");
        } else {
            System.out.println("Nguoi Thua May");
        }
    }

}
