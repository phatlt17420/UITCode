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
public class HashMap_ArrayList_Object {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();
        HashMap<String, Object> student1=new HashMap<>();
        student1.put("name", "Le Tan Phat");
        student1.put("age", 33);
        student1.put("trinhDo", "Cao Hoc");
        list.add(student1);
        // tạo học sinh 2:
        HashMap<String, Object> student2=new HashMap<>();
        student2.put("name", "Nguyen Thi Hoai Thuong");
        student2.put("age", 31);
        student2.put("trinhDo", "CKI");
        list.add(student2);
        
        for (HashMap i :list){
            System.out.println(i.get("name")+ "-" +i.get("age")+ "-" +i.get("trinhDo"));
        }
    }
    
}
