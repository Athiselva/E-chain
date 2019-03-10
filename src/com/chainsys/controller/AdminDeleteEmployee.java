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

@WebServlet("/AdminDeleteEmployee")
public class AdminDeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Chainsys chainsys = new Chainsys();
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		HttpSession session = request.getSession();
		int id = (int) session.getAttribute("id");
		String name = (String) session.getAttribute("name");
		String email = (String) session.getAttribute("email");
		ArrayList<Chainsys> elist = new ArrayList<>();
		elist = chainsysDAO.employeeList(chainsys);
		request.setAttribute("email", email);
		request.setAttribute("Name", name);
		request.setAttribute("ID", id);
		request.setAttribute("EMPLOYEES", elist);
		RequestDispatcher rd = request
				.getRequestDispatcher("AdminDeleteEmployee.jsp");
		rd.forward(request, response);
	}

}
