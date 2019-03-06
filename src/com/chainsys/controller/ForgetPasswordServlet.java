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

/**
 * Servlet implementation class ForgetPasswordServlet
 */
@WebServlet("/ForgetPasswordServlet")
public class ForgetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgetPasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Chainsys chainsys=new Chainsys();
		ChainsysDAO chainsysDAO = new ChainsysDAO();
		
		chainsys.setName(request.getParameter("name"));
		chainsys.setEmployeeId(Integer.parseInt(request.getParameter("employeeid")));
		chainsys.setPosition(request.getParameter("position"));
		chainsys.setUsername(request.getParameter("username"));
		chainsys.setEmail(request.getParameter("email"));
		chainsys.setPhonenumber(Long.parseLong(request.getParameter("phonenumber")));
		chainsys.setPassword(request.getParameter("password"));
		
		try {
			chainsysDAO.forgetPassword(chainsys);
			RequestDispatcher rd2 = request.getRequestDispatcher("PasswordReseted.jsp");
			rd2.include(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
