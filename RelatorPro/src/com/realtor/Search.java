package com.realtor;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.Plot;

public class Search extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String address=request.getParameter("address");
		String venture=request.getParameter("venture");
		List<Plot> l=SearchBean.search(address,venture);
		HttpSession hs=request.getSession();
		if(l!=null) {
			hs.setAttribute("list", l);
			response.sendRedirect("./search.jsp");
		}
		else
			response.sendRedirect("./available_plot.jsp");
	}

}
