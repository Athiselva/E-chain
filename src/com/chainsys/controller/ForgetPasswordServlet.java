package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.ChainsysDAO;
import com.chainsys.model.Chainsys;


@WebServlet("/ForgetPasswordServlet")
public class ForgetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Chainsys chainsys = new Chainsys();
		ChainsysDAO chainsysDAO = new ChainsysDAO();

		if ((request.getParameter("employeeid").length() > 2)
				&& (request.getParameter("username").length() > 4)
				&& (request.getParameter("email").length() > 4)
				&& (request.getParameter("phonenumber").length() > 4)
				&& (request.getParameter("password").length() > 4)) {

			chainsys.setName(request.getParameter("name"));
			chainsys.setEmployeeId(Integer.parseInt(request
					.getParameter("employeeid")));
			chainsys.setPosition(request.getParameter("position"));
			chainsys.setUsername(request.getParameter("username"));
			chainsys.setEmail(request.getParameter("email"));
			chainsys.setPhonenumber(Long.parseLong(request
					.getParameter("phonenumber")));
			chainsys.setPassword(request.getParameter("password"));

			if ((chainsysDAO.forgetPassword(chainsys)) != 0) {
				RequestDispatcher rd2 = request
						.getRequestDispatcher("PasswordReseted.jsp");
				rd2.include(request, response);
			} else {
				RequestDispatcher rd2 = request
						.getRequestDispatcher("ForgetPassword.jsp");
				rd2.include(request, response);
			}
		}
		else{
			RequestDispatcher rd2 = request
					.getRequestDispatcher("ForgetPassword.jsp");
			rd2.include(request, response);
		}

		

	}

}
