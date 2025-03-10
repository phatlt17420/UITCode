
import java.io.*;
import java.util.*;

/**
 * 
 */
public class NVBH {

    public int maNV;
    public String hoTen;
    public double luongCB;
    public double luongHT;
    public int soSP;
    public NVBH() {
        maNV=0;
        hoTen="Chua nhap";
        luongCB = 0;
        luongHT=0;
        soSP=0;
    }
public NVBH(int maNV, String hoTen, double luongCB, int soSP){
    this.maNV=maNV;
    this.hoTen=hoTen;
    this.luongCB=luongCB;
    this.soSP=soSP;
    luongHT=0;
}

    public void tinhLuongNVBH() {
        luongHT=luongCB+soSP*150000;        
    }
    public void printNVBH() {
        // TODO implement here
        return null;
    }

}