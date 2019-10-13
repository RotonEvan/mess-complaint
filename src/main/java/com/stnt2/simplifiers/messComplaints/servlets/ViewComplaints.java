package com.stnt2.simplifiers.messComplaints.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stnt2.simplifiers.messComplaints.dto.ComplaintDTO;
import com.stnt2.simplifiers.messComplaints.services.ComplaintsData;

/**
 * Servlet implementation class ViewComplaints
 */
@WebServlet("/ViewComplaints")
public class ViewComplaints extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewComplaints() {
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
		int mess_pk = (int) session.getAttribute("mess_pk");
		List<ComplaintDTO> list = ComplaintsData.fetch(mess_pk);
		
		request.setAttribute("complaintList", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("view-complaints.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
