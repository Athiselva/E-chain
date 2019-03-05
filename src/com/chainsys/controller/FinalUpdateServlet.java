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

/**
 * Servlet implementation class FinalUpdateServlet
 */
@WebServlet("/FinalUpdateServlet")
public class FinalUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FinalUpdateServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Chainsys chainsys = new Chainsys();
		
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		chainsys.setName(request.getParameter("name"));
		chainsys.setUsername(request.getParameter("username"));
		chainsys.setPassword(request.getParameter("password"));
		chainsys.setPhonenumber(Long.parseLong(request.getParameter("phonenumber")));
		try {
			chainsysDAO.updateProfile(chainsys);
			ArrayList<Chainsys> ulist=new ArrayList<>();
			ulist=chainsysDAO.viewProfile(chainsys);
			request.setAttribute("PROFILE", ulist);
			RequestDispatcher rd2 = request.getRequestDispatcher("UpdatedSuccessfully.jsp");
			rd2.include(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
