package com.chainsys.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.dao.ChainsysDAO;
import com.chainsys.model.Chainsys;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Chainsys chainsys = new Chainsys();
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		chainsys.setUsername(request.getParameter("username"));
		chainsys.setPassword(request.getParameter("password"));

		try {
			if (chainsysDAO.login(chainsys)) {
				HttpSession session = request.getSession();
				session.setAttribute("username",request.getParameter("username"));
				session.setAttribute("id", chainsysDAO.getId(chainsys));
				session.setAttribute("name", chainsysDAO.getEmployeeName(chainsys));
				session.setAttribute("email", chainsysDAO.getEmail(chainsys));
				
				RequestDispatcher rd = request
						.getRequestDispatcher("WelcomeServlet");
				rd.forward(request, response);

			} else {
				RequestDispatcher rd = request
						.getRequestDispatcher("incorrectpassword.jsp");
				rd.forward(request, response);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
