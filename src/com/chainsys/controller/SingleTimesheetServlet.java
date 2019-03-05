package com.chainsys.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.ChainsysDAO;
import com.chainsys.model.Chainsys;

@WebServlet("/SingleTimesheetServlet")
public class SingleTimesheetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SingleTimesheetServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Chainsys chainsys = new Chainsys();
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		LocalDate ondate = LocalDate.parse(request.getParameter("ondate"));

		chainsys.setOndate(ondate);
		chainsys.setOndate2(ondate);

		ArrayList<Chainsys> tlist = new ArrayList<>();
		try {
			tlist = chainsysDAO.ondateTimeSheet(chainsys);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("TIMESHEET", tlist);
		String email=chainsys.getEmail2();
		request.setAttribute("email", email);
		RequestDispatcher rd = request.getRequestDispatcher("EnterTimesheet.jsp");
		rd.include(request, response);
	}

}
