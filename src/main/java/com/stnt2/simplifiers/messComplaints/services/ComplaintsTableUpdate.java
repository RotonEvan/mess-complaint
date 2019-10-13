package com.stnt2.simplifiers.messComplaints.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComplaintsTableUpdate {

	static DevelopConnection conn = new DevelopConnection();

	public static void insert(String complaint_id, int user_pk, int mess_pk, String date, String meal,
			String complaint_text) {
		try {
			conn.open();
			String query = "insert into complaint_table (complaint, complaint_id, user, mess, meal, date, complaint_description)"
					+ " values (DEFAULT, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setString(1, complaint_id);
			preparedStmt.setInt(2, user_pk);
			preparedStmt.setInt(3, mess_pk);
			preparedStmt.setString(4, meal);
			preparedStmt.setString(5, date);
			preparedStmt.setString(6, complaint_text);
			preparedStmt.execute();
			
			conn.close();

			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
