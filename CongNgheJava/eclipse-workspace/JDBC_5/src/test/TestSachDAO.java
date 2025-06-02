package test;

import dao.SachDAO;
import model.Sach;

public class TestSachDAO {
	public static void main(String[] args) {
		Sach sach1=new Sach("1", "Lập trình Java", 5000, 2012);
		Sach sach2=new Sach("2", "7 Thói Quen Hiệu Quả", 2000, 2025);
		//SachDAO.getInstance().insert(sach1);
		//SachDAO.getInstance().insert(sach2);
		
		// test update
		SachDAO.getInstance().delete(sach2);
		
	}
}
