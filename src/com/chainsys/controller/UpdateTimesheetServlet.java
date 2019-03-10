package com.chainsys.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.dao.ChainsysDAO;
import com.chainsys.model.Chainsys;

@WebServlet("/UpdateTimesheetServlet")
public class UpdateTimesheetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateTimesheetServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Chainsys chainsys = new Chainsys();
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		
		
		HttpSession session=request.getSession();
		int id=(int)session.getAttribute("id");
		//String name=(String)session.getAttribute("name");
		String email=(String)session.getAttribute("email");
		LocalDate ondate=(LocalDate)session.getAttribute("ondate");
		
		if(((request.getParameter("tsnumber")))!=null){
		
			try {
			
			chainsys.setTimesheetNumber(Integer.parseInt(request.getParameter("tsnumber")));
			chainsys.setTaskStatus(request.getParameter("timesheet"));
			chainsys.setEmployeeId(id);
			chainsys.setOndate(ondate);
			chainsysDAO.timeSheets(chainsys);
			request.setAttribute("email", email);
			RequestDispatcher rd = request.getRequestDispatcher("ResultTimesheetServlet");
			rd.include(request, response);
		
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else{
			RequestDispatcher rd = request.getRequestDispatcher("EnterTimesheet.jsp");
			rd.include(request, response);
		}
	}

}
