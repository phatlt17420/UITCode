package test;

import java.sql.Connection;

import database.JDBCUtil;

public class testDB {
public static void main(String[] args) {
	Connection connection = JDBCUtil.getConnection();
	System.out.println(connection);
}
}
