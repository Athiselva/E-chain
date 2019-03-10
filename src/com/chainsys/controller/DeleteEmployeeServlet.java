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

@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Chainsys chainsys = new Chainsys();
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		chainsys.setEmployeeId(Integer.parseInt(request.getParameter("id")));

		if (chainsysDAO.deleteEmployee(chainsys) != 0) {
			RequestDispatcher rd = request
					.getRequestDispatcher("EmployeeDeleted.jsp");
			rd.forward(request, response);

		} else {
			RequestDispatcher rd = request
					.getRequestDispatcher("AdminDeleteEmployee");
			rd.forward(request, response);

		}
	}

}
