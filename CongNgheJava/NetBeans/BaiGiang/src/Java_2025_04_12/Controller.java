/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong08_Swing_MVC_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author sonpt
 */
public class Controller {
    public Model m;
    public ViewGPT v;

    public Controller(Model m, ViewGPT v) {
        this.m = m;
        this.v = v;
        this.v.setVisible(true);
    }
    
    public void giaiPT(){
        v.btnGiaiPT_MVC_ActionListener(new ActionListener(){
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
