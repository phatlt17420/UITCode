/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi00_TinhTienDien;

import java.util.ArrayList;

/**
 *
 * @author phatlt17420
 */
public class Phuong {
    protected String tenPhuong;
    protected ArrayList<Ho> ds;

    public Phuong() {
        this.tenPhuong="Phuong 1";
        this.ds=new ArrayList<>();
    }

    public Phuong(ArrayList<Ho> ds) {
        if (ds.isEmpty()){
            ds.add(new hoGiaDinh())
        }
        
    }
    
    
}
