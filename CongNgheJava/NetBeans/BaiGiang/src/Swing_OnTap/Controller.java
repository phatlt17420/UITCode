/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing_OnTap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author phatlt17420
 */
public class Controller {
    
    public ViewGPT v;
    public Model m;
    
    public Controller(ViewGPT v, Model m) {
        this.v = v;
        this.m = m;
        this.v.setVisible(true);
    }
    
    public void giaiPT() {
        // lấy dữ liệu từ giao diện.
        // có kết quả chuyển về giao diện

        // gọi dữ liệu từ view
        v.btnGiaiPT_MVC_actionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ban da giai phuong trinh co ap dung MVC");
                double a = v.getA();
                double b = v.getB();
                
                String nghiem = m.giaiPTB1(a, b);
                
                v.setAreaKetQua(nghiem);
            }
            
        });
        
    }
    
}
