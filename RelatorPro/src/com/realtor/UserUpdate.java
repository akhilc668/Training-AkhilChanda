package com.realtor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.User;


public class UserUpdate extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u=new User();
		u.setId(Integer.parseInt(request.getParameter("id")));
		u.setUname(request.getParameter("uname"));
		u.setEmail(request.getParameter("email"));
		u.setPassword(request.getParameter("password"));
		u.setPhone(request.getParameter("phone"));
		u.setGender(request.getParameter("gender"));
		u.setAddress(request.getParameter("address"));
		u=UserUpdateBean.update(u);
		HttpSession hs=request.getSession();
		if(u!=null) {
			hs.setAttribute("user", u);
			response.sendRedirect("./update_user.jsp?msg=Update sucessfully");
		}
		else
			response.sendRedirect("./update_user.jsp?msg=update failed");
	}

}
