package com.chainsys.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/TimesheetServlet")
public class TimesheetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TimesheetServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Chainsys chainsys = new Chainsys();
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		LocalDate from = LocalDate.parse(request.getParameter("from"));
		LocalDate to = LocalDate.parse(request.getParameter("to"));
		chainsys.setFromDate(from);
		chainsys.setTodate(to);

		int eid = chainsys.getId();
		String ename = chainsys.getEmpname();
		ArrayList<Chainsys> tlist = new ArrayList<>();
		try {
			tlist = chainsysDAO.viewTimeSheet(chainsys);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("Name", ename);
		request.setAttribute("ID", eid);
		request.setAttribute("TIMESHEET", tlist);
		RequestDispatcher rd = request
				.getRequestDispatcher("ShowTimesheet.jsp");
		rd.include(request, response);
	}

}
