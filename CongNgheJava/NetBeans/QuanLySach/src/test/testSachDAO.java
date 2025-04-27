/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import ClassFinal.Sach;
import ClassFinal.Sach;
import DAO.SachDAO;
/**
 *
 * @author Le Tan Phat
 */
public class testSachDAO {

    public static void main(String[] args) {
//        Sach sach1 = new Sach("1", "Lap trinh java", 12000, 2022);
//        Sach sach2 = new Sach("2", "Lap trinh python", 18000, 2024);
//        SachDAO.getInstance().insert(sach2);
        for (int i = 0; i < 1000; i++) {
            Sach sach = new Sach("LT" +i, "Lap trinh java" +i, 12000, 2025);
            SachDAO.getInstance().insert(sach);
        }
        
    }
}
