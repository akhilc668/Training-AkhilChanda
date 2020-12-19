package com.realtor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.User;

public class UserRegister extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		user.setUname(request.getParameter("uname"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setPhone(request.getParameter("phone"));
		user.setGender(request.getParameter("gender"));
		user.setAddress(request.getParameter("address"));
		boolean status=false;
		status=UserRegisterBean.register(user);
		if(status) {
			response.sendRedirect("./user.jsp?msg=registered sucessfully");
		}
		else
			response.sendRedirect("./user_register.jsp?msg=register failed");
	}

}
