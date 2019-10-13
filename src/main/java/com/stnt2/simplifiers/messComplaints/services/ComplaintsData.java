package com.stnt2.simplifiers.messComplaints.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.stnt2.simplifiers.messComplaints.dto.ComplaintDTO;

public class ComplaintsData {

	static DevelopConnection conn = new DevelopConnection();

	public static List<ComplaintDTO> fetch(int mess_pk) {

		List<ComplaintDTO> list = new ArrayList<ComplaintDTO>();

		try {
			conn.open();

			String sql = "SELECT u.user_name, u.user_id, m.name, c.meal, c.date, c.complaint_description FROM complaint_table as c JOIN user_table as u JOIN mess_table as m on c.user = u.user AND c.mess = m.mess WHERE c.mess = "
					+ mess_pk;
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				
				System.out.println(result.getString("complaint_description"));

				ComplaintDTO obj = new ComplaintDTO(null, null, result.getString("complaint_description"),
						result.getString("user_name"), result.getString("user_id"), result.getString("name"),
						result.getString("meal"), null, mess_pk, result.getString("date"));
				
				list.add(obj);
			}
			

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

}
