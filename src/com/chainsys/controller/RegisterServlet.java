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

import com.chainsys.model.Chainsys;
import com.chainsys.dao.ChainsysDAO;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Chainsys chainsys = new Chainsys();
		chainsys.setName(request.getParameter("name"));
		chainsys.setPosition(request.getParameter("position"));
		chainsys.setUsername(request.getParameter("username"));
		chainsys.setPassword(request.getParameter("password"));
		chainsys.setPhonenumber(Long.parseLong(request.getParameter("phonenumber")));
		chainsys.setEmail(request.getParameter("email"));
		chainsys.setDob(LocalDate.parse(request.getParameter("dob")));
		
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		try {
			chainsysDAO.register(chainsys);
			RequestDispatcher rd = request.getRequestDispatcher("SignupSucessfull.jsp");
			rd.include(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
