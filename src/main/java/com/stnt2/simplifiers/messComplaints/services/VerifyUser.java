package com.stnt2.simplifiers.messComplaints.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.stnt2.simplifiers.messComplaints.dto.User;

public class VerifyUser {

	private static String databaseURL = "jdbc:mysql://remotemysql.com:3306/vaczCbtHZJ";
	private static String database_user = "vaczCbtHZJ";
	private static String database_password = "91SvOZLrr9";

	static String id;
	static boolean valid;
	static int pk;

	public VerifyUser(String username, String password) throws ClassNotFoundException {
		// TODO Auto-generated constructor stub
		id = new String();
		pk = -1;
		valid = false;

		System.out.println(username);

		User user = new User();
		String pass;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(databaseURL, database_user, database_password);
			Statement statement1 = connection.createStatement();
			System.out.println("Checking 01");
			ResultSet result1 = statement1.executeQuery("SELECT * FROM user_table WHERE user_name=" + "\'" + username + "\'");
			System.out.println("Checking 02");
			if (result1.next()) {
				user.setUser_pk(result1.getInt("user"));
				user.setUser_id(result1.getString("user_id"));
				user.setUser_name(result1.getString("user_name"));
				user.setPassword(result1.getString("password"));
				System.out.println("Checking 03");
				System.out.println(user.getUser_id());
				System.out.println(user.getPassword());
				System.out.println(password);
				
				if (password.equals(user.getPassword())) {
					valid = true;
					id = user.getUser_id();
					pk = user.getUser_pk();
					System.out.println("Checking 04");
				}
				
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public VerifyUser() {
		// TODO Auto-generated constructor stub
		id = new String();
		valid = false;
	}

	public String getId() {
		return id;
	}
	
	public int getUser_Pk() {
		return pk;
	}

	public boolean isValid() {
		return valid;
	}

}
