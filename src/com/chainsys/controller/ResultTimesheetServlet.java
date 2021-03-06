package com.chainsys.controller;

import java.io.IOException;
import java.time.LocalDate;
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

@WebServlet("/ResultTimesheetServlet")
public class ResultTimesheetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Chainsys chainsys = new Chainsys();
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		ArrayList<Chainsys> tlist = new ArrayList<>();
		HttpSession session = request.getSession();
		int id = (int) session.getAttribute("id");
		LocalDate ondate = (LocalDate) session.getAttribute("ondate");
		chainsys.setEmployeeId(id);
		chainsys.setOndate(ondate);
		tlist = chainsysDAO.ondateTimeSheet(chainsys);

		request.setAttribute("TIMESHEET", tlist);
		RequestDispatcher rd = request
				.getRequestDispatcher("UpdateTimesheet.jsp");
		rd.include(request, response);
	}

}
