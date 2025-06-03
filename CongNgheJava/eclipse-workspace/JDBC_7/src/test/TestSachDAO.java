package test;

import java.util.ArrayList;

import dao.SachDAO;
import model.Sach;

public class TestSachDAO {
	public static void main(String[] args) {
		ArrayList<Sach> list = SachDAO.getInstance().selectAll();
		for (Sach sach : list) {
			System.out.println(sach);
		}
		Sach find = new Sach();
		find.setId("2");
		
		Sach sach2=SachDAO.getInstance().selectByID(find);
		
		System.out.println(sach2);
		
		System.out.println("----------------------------");
		ArrayList<Sach> list2 = SachDAO.getInstance().selectByCondition("giaban > 2000");
		for (Sach sach : list2) {
			System.out.println(sach.toString());
		}
		
	}
}
