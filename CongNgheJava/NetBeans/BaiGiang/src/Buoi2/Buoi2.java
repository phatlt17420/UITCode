package Buoi2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author phatlt17420
 */
import java.util.Scanner;

public class Buoi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nhap vao lua chon cua ban: ");
        Scanner ip = new Scanner(System.in);
        String NguoiChon = ip.nextLine();
        System.out.println(NguoiChon);
        double mayChon = Math.ceil(((Math.random() * 10) % 3));
        String mayChonTxt;
        if (mayChon == 1) {
            mayChonTxt = "Keo";
        } else if (mayChon == 2) {
            mayChonTxt = "Bua";
        } else {
            mayChonTxt = "Bao";
        }
        System.out.println(mayChonTxt);

        if (NguoiChon.equals("Keo")) {
            if (mayChonTxt.equals("Keo")) {
                System.out.println("Nguoi hoa May");
            } else if (mayChonTxt.equals("Bua")) {
                System.out.println("Nguoi Thua May");
            } else if (mayChonTxt.equals("Bao")) {
                System.out.println("Nguoi Thang May");
            }
        } else if (NguoiChon.equals("Bua")) {
            if (mayChonTxt.equals("Keo")) {
                System.out.println("Nguoi Thang May");
            } else if (mayChonTxt.equals("Bua")) {
                System.out.println("Nguoi Thua May");
            } else if (mayChonTxt.equals("Bao")) {
                System.out.println("Nguoi Thang May");
            }
        }

    }

}
