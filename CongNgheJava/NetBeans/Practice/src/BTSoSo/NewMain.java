/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTSoSo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author phatlt17420
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbersMay = daySoRandom();
        System.out.print("Day so random cua may: ");
        System.out.println(numbersMay);
        ArrayList<ArrayList<Integer>> numbersNguoi = new ArrayList<>();
        numbersNguoi = veSo();
        System.out.println(numbersNguoi);
        System.out.print("Ket qua khi do: ");
        System.out.println(tinhKetQua(numbersNguoi, numbersMay));

    }

    // tạo dãy số tự nhập
    public static ArrayList<Integer> daySoTuNhap() {
        ArrayList<Integer> ds = new ArrayList<>();
        int n = 0;
        Scanner ip = new Scanner(System.in);
        while (n < 6) {
            System.out.print("Nhap so thu " + n + ":");
            int number = ip.nextInt();
            if (number > -1 && number < 46 && !ds.contains(number)) {
                ds.add(number);
                n++;
            }
        }
        return ds;
    }

    // tạo dãy số tự động
    public static ArrayList<Integer> daySoRandom() {
        ArrayList<Integer> ds = new ArrayList<>();
        Random rd = new Random();
        int n = 0;
        do {
            int number = rd.nextInt(45) + 1;
            if (!ds.contains(number)) {
                ds.add(number);
                n++;
            }
        } while (n < 6);
        return ds;
    }

    /// tạo danh sách vé số
   public static ArrayList<ArrayList<Integer>> veSo() {
        System.out.println("Nhap so luong day so muon mua");
        Scanner ip = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ds = new ArrayList<>();
        int n = ip.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Day so thu " + (i + 1) + ": ");
            ds.add(daySoTuNhap());
        }

        return ds;
    }

    public static int soSanh(ArrayList<Integer> a, ArrayList<Integer> b) {
        int k = 0;
        for (int i = 0; i < 6; i++) {
            if (b.contains(a.get(i))) {
                k++;
            }
        }
        return k;
    }

    public static double tinhKetQua(ArrayList<ArrayList<Integer>> dsNguoi, ArrayList<Integer> dsMay) {
        double ketQua = 0;
        for (int i = 0; i < dsNguoi.size(); i++) {
            switch (soSanh(dsNguoi.get(i), dsMay)) {
                case 3:
                    ketQua += 30000;
                    break;
                case 4:
                    ketQua += 300000;
                    break;
                case 5:
                    ketQua += 10000000;
                    break;
                case 6:
                    ketQua += 1000000000;
                    break;
            }
        }
        return ketQua;
    }
}
