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

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		int id = (int) session.getAttribute("id");
		// String name=(String)session.getAttribute("name");
		String email = (String) session.getAttribute("email");

		ArrayList<Chainsys> ulist = new ArrayList<>();
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		Chainsys chainsys = new Chainsys();
		chainsys.setEmployeeId(id);
		ulist = chainsysDAO.viewProfile(chainsys);
		request.setAttribute("email", email);
		request.setAttribute("PROFILE", ulist);
		request.setAttribute("ID", id);
		RequestDispatcher rd = request
				.getRequestDispatcher("UpdateProfile.jsp");
		rd.include(request, response);
	}

}
