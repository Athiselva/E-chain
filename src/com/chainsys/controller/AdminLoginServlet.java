package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.dao.ChainsysDAO;
import com.chainsys.model.Chainsys;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Chainsys chainsys = new Chainsys();
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		chainsys.setAdminUsername(request.getParameter("username"));
		chainsys.setAdminPassword(request.getParameter("password"));

		if (chainsysDAO.adminLogin(chainsys)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", request.getParameter("username"));
			session.setAttribute("id", chainsysDAO.adminGetId(chainsys));
			session.setAttribute("name",
					chainsysDAO.adminGetEmployeeName(chainsys));
			session.setAttribute("email", chainsysDAO.adminGetEmail(chainsys));
			RequestDispatcher rd = request
					.getRequestDispatcher("AdminWelcomeServlet");
			rd.forward(request, response);
		}

		else {
			RequestDispatcher rd = request
					.getRequestDispatcher("AdminIncorrectPassword.jsp");
			rd.forward(request, response);
		}
	}

}
