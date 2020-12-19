package com.realtor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLogin extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		boolean status=false;
		status=AdminLoginBean.login(username, password);
		if(status) {
			response.sendRedirect("./admin_home.jsp?msg=login sucessfully");
		}
		else
			response.sendRedirect("./admin_login.jsp?msg=login failed");
	}

}
