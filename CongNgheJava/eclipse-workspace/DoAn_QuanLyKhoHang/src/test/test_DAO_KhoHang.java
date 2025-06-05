package test;

import java.util.ArrayList;

import dao.KhoHangDAO;
import database.JDBCUtil;
import model.KhoHang;

public class test_DAO_KhoHang {
	public static void main(String[] args) {
		KhoHang khoHang = new KhoHang("K03", "Kho 5", "Láng Hạ, Hồ Chí Minh");
		KhoHangDAO.getInstance().delete(khoHang);
	}
}
