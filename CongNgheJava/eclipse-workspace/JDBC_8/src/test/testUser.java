package test;

import java.util.ArrayList;

import dao.UserDAO;
import model.User;

public class testUser {
	public static void main(String[] args) {
//		USER U3 = NEW USER("U2", "U123", "UUU");
//		USERDAO.GETINSTANCE().INSERT(U3);
//		
		User u_find = new User("x\'or 1=1; --", "", "");
		System.out.println("-----------------");
		User u_result = UserDAO.getInstance().selectByID(u_find);
		System.out.println(u_result);
//		
	}
}
