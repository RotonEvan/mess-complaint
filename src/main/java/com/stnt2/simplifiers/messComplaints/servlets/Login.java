package com.stnt2.simplifiers.messComplaints.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stnt2.simplifiers.messComplaints.services.VerifyMess;
import com.stnt2.simplifiers.messComplaints.services.VerifyUser;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
		rs.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String username, password;
		username = request.getParameter("username");
		password = request.getParameter("password");

		if (request.getParameter("user-radio-button") != null) {

			VerifyUser currentUser = new VerifyUser();
			try {
				currentUser = new VerifyUser(username, password);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			if (currentUser.isValid()) {
				String id = currentUser.getId();
				int pk = currentUser.getUser_Pk();
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				session.setAttribute("id", id);
				session.setAttribute("pk", pk);
				response.sendRedirect(request.getContextPath() + "/complaint");
			} else {

				request.setAttribute("message", "Invalid Credentials");
				RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
				rs.forward(request, response);

			}
		}
		else if (request.getParameter("mess-radio-button") != null) {
			VerifyMess currentUser = new VerifyMess();
			try {
				currentUser = new VerifyMess(username, password);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			if (currentUser.isValid()) {
				int pk = currentUser.getPk();
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				session.setAttribute("mess_pk", pk);
				response.sendRedirect(request.getContextPath() + "/ViewComplaints");
			} else {

				request.setAttribute("message", "Invalid Credentials");
				RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
				rs.forward(request, response);

			}
		}
		else {
			request.setAttribute("message", "Choose User or Mess");
			RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
			rs.forward(request, response);
		}
	}

}
