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
		
		if((request.getParameter("from").length()>2 && (request.getParameter("to").length()>2))){
			LocalDate from = LocalDate.parse(request.getParameter("from"));
			LocalDate to = LocalDate.parse(request.getParameter("to"));
			

			HttpSession session=request.getSession();
			int id=(int)session.getAttribute("id");
			String name=(String)session.getAttribute("name");
			String email=(String)session.getAttribute("email");
			ArrayList<Chainsys> tlist = new ArrayList<>();
			try {
				chainsys.setFromDate(from);
				chainsys.setTodate(to);
				chainsys.setEmployeeId(id);
				
				tlist = chainsysDAO.viewTimeSheet(chainsys);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.setAttribute("email", email);
			request.setAttribute("Name", name);
			request.setAttribute("ID", id);
			request.setAttribute("TIMESHEET", tlist);
			RequestDispatcher rd = request
					.getRequestDispatcher("ShowTimesheet.jsp");
			rd.include(request, response);
		}
		else{
			RequestDispatcher rd = request
					.getRequestDispatcher("SearchTimesheet.jsp");
			rd.include(request, response);
		}
		
		}
		

}
