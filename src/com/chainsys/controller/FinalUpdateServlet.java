package com.chainsys.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.dao.ChainsysDAO;
import com.chainsys.model.Chainsys;

@WebServlet("/FinalUpdateServlet")
public class FinalUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FinalUpdateServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Chainsys chainsys = new Chainsys();

		ChainsysDAO chainsysDAO = new ChainsysDAO();
		chainsys.setName(request.getParameter("name"));
		chainsys.setUsername(request.getParameter("username"));
		chainsys.setPassword(request.getParameter("password"));
		chainsys.setPhonenumber(Long.parseLong(request
				.getParameter("phonenumber")));

		if ((chainsys.getName().length() < 4)
				|| (chainsys.getUsername().length() < 4)
				|| (chainsys.getPassword().length() < 4)) {
			RequestDispatcher rd2 = request
					.getRequestDispatcher("UpdateServlet");
			rd2.include(request, response);
		} else {
			HttpSession session = request.getSession();
			int id = (int) session.getAttribute("id");
			String email = (String) session.getAttribute("email");
			chainsys.setEmployeeId(id);

			chainsysDAO.updateProfile(chainsys);
			ArrayList<Chainsys> ulist = new ArrayList<>();
			chainsys.setEmployeeId(id);
			ulist = chainsysDAO.viewProfile(chainsys);
			request.setAttribute("PROFILE", ulist);
			request.setAttribute("email", email);
			RequestDispatcher rd2 = request
					.getRequestDispatcher("UpdatedSuccessfully.jsp");
			rd2.include(request, response);
		}

	}
}
