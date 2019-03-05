package com.chainsys.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sun.rmi.runtime.NewThreadAction;

import com.chainsys.model.Chainsys;
import com.chainsys.dao.ChainsysDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		Chainsys chainsys = new Chainsys();
		chainsys.setUsername(request.getParameter("username"));
		chainsys.setPassword(request.getParameter("password"));
		chainsys.setUsername2(request.getParameter("username"));
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		
		
		
		try {
			if(chainsysDAO.login(chainsys)){
				
				chainsysDAO.get(chainsys);
				String ename=chainsys.getEmpname();
				request.setAttribute("Name", ename);
				String email=chainsys.getEmail2();
				request.setAttribute("email", email);
				RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
				rd.forward(request, response);
				
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("incorrectpassword.jsp");
				rd.forward(request, response);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
