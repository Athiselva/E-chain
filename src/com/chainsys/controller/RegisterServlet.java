package com.chainsys.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.ChainsysDAO;
import com.chainsys.model.Chainsys;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Chainsys chainsys = new Chainsys();

		if ((request.getParameter("name").length() > 2)
				&& (request.getParameter("position").length() > 2)
				&& (request.getParameter("username").length() > 2)
				&& (request.getParameter("password").length() > 2)
				&& (request.getParameter("email").length() > 2)
				&& (request.getParameter("dob").length() > 2)) {
			chainsys.setName(request.getParameter("name"));
			chainsys.setPosition(request.getParameter("position"));
			chainsys.setUsername(request.getParameter("username"));
			chainsys.setPassword(request.getParameter("password"));
			chainsys.setPhonenumber(Long.parseLong(request
					.getParameter("phonenumber")));
			chainsys.setEmail(request.getParameter("email"));
			chainsys.setDob(LocalDate.parse(request.getParameter("dob")));

			ChainsysDAO chainsysDAO = new ChainsysDAO();
			chainsysDAO.register(chainsys);
			RequestDispatcher rd = request
					.getRequestDispatcher("SignupSucessfull.jsp");
			rd.include(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
			rd.include(request, response);
		}

	}

}
