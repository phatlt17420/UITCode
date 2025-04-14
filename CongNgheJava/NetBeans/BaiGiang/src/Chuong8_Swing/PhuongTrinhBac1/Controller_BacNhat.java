/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chuong8_Swing.PhuongTrinhBac1;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author phatlt17420
 */
public class Controller_BacNhat {

    public ViewBacNhat view;
    public ModelBacNhat model;

    public Controller_BacNhat(ViewBacNhat view, ModelBacNhat model) {
        this.view = view;
        this.model = model;
    }
    
    
    

    /**
     */


    public void giaiPhuongTrinhBacNhat (){
        view.setVisible(true);
        view.ActionListener_btn_GiaiPhuongTrinh2(new A());
        
        
    }
    
    
    class A implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Giai phuong trinh cach 2" + view.getA() + " " + view.getB());

            
            double ketQua = -view.getB()/view.getA();
            view.setAreaKetQua(ketQua); // set lại kết quả
        }

    }



}
