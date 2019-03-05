package com.chainsys.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.ChainsysDAO;
import com.chainsys.model.Chainsys;


@WebServlet("/UpdateTimesheetServlet")
public class UpdateTimesheetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateTimesheetServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Chainsys chainsys = new Chainsys();
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		String status=request.getParameter("timesheet");
		int number=Integer.parseInt(request.getParameter("tsnumber"));
		chainsys.setTaskStatus(status);
		chainsys.setTimesheetNumber(number);
		try {
			chainsysDAO.timeSheets(chainsys);
			RequestDispatcher rd = request.getRequestDispatcher("ResultTimesheetServlet");
			rd.include(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}