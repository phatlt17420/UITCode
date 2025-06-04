package test;

import java.util.ArrayList;

import dao.KhoHangDAO;
import model.KhoHang;

public class test_DAO_KhoHang {
public static void main(String[] args) {
	ArrayList<KhoHang> list = KhoHangDAO.getInstance().selectAll();
	for(KhoHang k:list) {
		System.out.println(k);
	}
}
}
