package com.realtor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.User;


public class UserLogin extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		User u=new User();
		u=UserLoginBean.login(email, password);
		HttpSession hs=request.getSession();
		if(u!=null) {
			hs.setAttribute("user", u);
			hs.setAttribute("uid", u.getId());
			response.sendRedirect("./user_home.jsp?msg=login sucessfully");
		}
		else
			response.sendRedirect("./user_login.jsp?msg=login failed");
	}

}
