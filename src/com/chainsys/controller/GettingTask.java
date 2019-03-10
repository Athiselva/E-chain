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


@WebServlet("/GettingTask")
public class GettingTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

				Chainsys chainsys = new Chainsys();
				ChainsysDAO chainsysDAO = new ChainsysDAO();
				
				if((request.getParameter("date").length()>2) && (request.getParameter("id").length()>2) && (request.getParameter("task").length()>2)){
					HttpSession session=request.getSession();
					int id=(int)session.getAttribute("id");
					String name=(String)session.getAttribute("name");
					String email=(String)session.getAttribute("email");
					LocalDate date=LocalDate.parse(request.getParameter("date"));
					chainsys.setOndate(date);
					chainsys.setEmployeeId(Integer.parseInt(request.getParameter("id")));
					chainsys.setTask(request.getParameter("task"));
					ArrayList<Chainsys> tlist = new ArrayList<>();
					tlist=chainsysDAO.adminViewTimesheet(chainsys);
					
					request.setAttribute("email", email);
					request.setAttribute("Name", name);
					request.setAttribute("ID", id);
					request.setAttribute("TIMESHEET", tlist);
					
					RequestDispatcher rd = request
							.getRequestDispatcher("TaskSetted.jsp");
					rd.forward(request, response);
					chainsysDAO.setTimesheet(chainsys);
				}
					
					else{
						RequestDispatcher rd = request
								.getRequestDispatcher("SetTimesheetServlet");
						rd.forward(request, response);
						
					}
				}
				
				
				
	
	}


