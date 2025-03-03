/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author phatlt17420
 */
public class ArrayList_HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <HashMap<String,String>> list = new ArrayList<>();
        HashMap<String,String> phanTu1 = new HashMap<>();
        phanTu1.put("name", "Phat");
        phanTu1.put("age", "18");
        phanTu1.put("MaSo", "123");
        list.add(phanTu1);
        //Tạo phần tử 2
        HashMap<String, String> phanTu2 = new HashMap<>();
        phanTu2.put("name", "Thuong");
        phanTu2.put("age", "18");
        phanTu2.put("MaSo", "124");
        list.add(phanTu2);
        
        for(HashMap i : list){
            System.out.println(i.get("name") +"-" +i.get("age") +"-" +i.get("MaSo"));
        }
            
    }
    
}
