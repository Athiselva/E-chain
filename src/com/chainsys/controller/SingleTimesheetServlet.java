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
import javax.servlet.http.HttpSession;

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
		HttpSession session = request.getSession();
		session.setAttribute("ondate",ondate);

		ArrayList<Chainsys> tlist = new ArrayList<>();
		try {
			int id=(int)session.getAttribute("id");
			//String name=(String)session.getAttribute("name");
			chainsys.setEmployeeId(id);
			String email=(String)session.getAttribute("email");
			tlist = chainsysDAO.ondateTimeSheet(chainsys);
			request.setAttribute("TIMESHEET", tlist);
			request.setAttribute("email", email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		RequestDispatcher rd = request.getRequestDispatcher("EnterTimesheet.jsp");
		rd.include(request, response);
	}

}
