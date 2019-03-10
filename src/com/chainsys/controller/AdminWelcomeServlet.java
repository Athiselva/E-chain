package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminWelcomeServlet")
public class AdminWelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		String name = (String) session.getAttribute("name");
		request.setAttribute("email", email);
		request.setAttribute("name", name);
		RequestDispatcher rd = request.getRequestDispatcher("AdminWelcome.jsp");
		rd.include(request, response);

	}

}
