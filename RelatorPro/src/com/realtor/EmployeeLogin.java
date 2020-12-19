package com.realtor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeLogin extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		boolean status=false;
		status=EmployeeLoginBean.login(email, password);
		if(status) {
			response.sendRedirect("./employee_home.jsp?msg=login sucessfully");
		}
		else
			response.sendRedirect("./employee_login.jsp?msg=login failed");
	}

}
