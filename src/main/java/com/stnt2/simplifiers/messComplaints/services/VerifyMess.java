package com.stnt2.simplifiers.messComplaints.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.stnt2.simplifiers.messComplaints.dto.Mess;

public class VerifyMess {
	
	private static String databaseURL = "jdbc:mysql://remotemysql.com:3306/vaczCbtHZJ";
	private static String database_mess = "vaczCbtHZJ";
	private static String database_password = "91SvOZLrr9";

	static int pk;
	static boolean valid;

	public VerifyMess(String messname, String password) throws ClassNotFoundException {
		// TODO Auto-generated constructor stub
		pk = 0;
		valid = false;

		System.out.println(messname);

		Mess mess = new Mess();
		String pass;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(databaseURL, database_mess, database_password);
			Statement statement1 = connection.createStatement();
			System.out.println("Checking 01");
			ResultSet result1 = statement1.executeQuery("SELECT * FROM mess_table WHERE name=" + "\'" + messname + "\'");
			System.out.println("Checking 02");
			if (result1.next()) {
				mess.setMess_pk(result1.getInt("mess"));
				mess.setMess_id(result1.getString("mess_id"));
				mess.setMess_name(result1.getString("name"));
				
				if (password.equals(result1.getString("password"))) {
					valid = true;
					pk = mess.getMess_pk();
				}
				
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public VerifyMess() {
		// TODO Auto-generated constructor stub
		pk = 0;
		valid = false;
	}

	public int getPk() {
		return pk;
	}

	public boolean isValid() {
		return valid;
	}

}
