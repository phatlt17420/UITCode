package test;

import java.util.ArrayList;
import java.util.Iterator;

import dao.KhachHangDAO;
import model.KhachHang;

public class testKhachHangDAO {
	public static void main(String[] args) {
		ArrayList<KhachHang> list = KhachHangDAO.getInstance().selectAll();
		for(KhachHang khachhang:list) {
			System.out.println(khachhang);
		}
		

	}
}
