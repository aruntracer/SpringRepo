package com.pro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://192.168.26.120:3306/mysql?useSSL=false&serverTimezone=UTC";
		String userId = "root";
		String userPassword = "root";
		
		try {
			System.out.println("Connect to db: "+jdbcUrl);
			@SuppressWarnings("unused")
			Connection myConn = DriverManager.getConnection(jdbcUrl,userId,userPassword);
			System.out.println("Connection successful!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
