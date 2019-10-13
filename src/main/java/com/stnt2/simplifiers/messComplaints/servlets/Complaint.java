package com.stnt2.simplifiers.messComplaints.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stnt2.simplifiers.messComplaints.services.ComplaintsTableUpdate;

/**
 * Servlet implementation class Complaint
 */
@WebServlet("/Complaint")
public class Complaint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Complaint() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("username") == null) {
			RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
			rs.forward(request, response);
		}
		
		String username = (String) session.getAttribute("username");
		String id = (String) session.getAttribute("id");
		int pk = (int) session.getAttribute("pk");
		
		request.setAttribute("username", username);
		request.setAttribute("id", id);
		request.setAttribute("pk", pk);
		
		RequestDispatcher rs = request.getRequestDispatcher("complaint.jsp");
		rs.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		HttpSession session = request.getSession(false);
		String name, id, date, meal, complaint_text;
		int user_pk, mess_pk;
		
		name = request.getParameter("name");
		id = request.getParameter("id");
		date = request.getParameter("date");
		meal = request.getParameter("meal");
		complaint_text = request.getParameter("complaint_text");
		user_pk = (int)(session.getAttribute("pk"));
		mess_pk = Integer.parseInt(request.getParameter("mess_pk"));
		
		ComplaintsTableUpdate.insert("comp_" + id + date + (int)(Math.random()*((1000-1)+1))+1, user_pk, mess_pk, date, meal, complaint_text);
		
		RequestDispatcher rs = request.getRequestDispatcher("complaint.jsp");
		rs.forward(request, response);
	}

}
