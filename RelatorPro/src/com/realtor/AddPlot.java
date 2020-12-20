package com.realtor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Plot;


public class AddPlot extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Plot p=new Plot();
		p.setPlotNo(request.getParameter("plotNo"));
		p.setOwnerName(request.getParameter("ownerName"));
		p.setEmail(request.getParameter("email"));
		p.setPhone(request.getParameter("phone"));
		int amount=Integer.parseInt(request.getParameter("amount"));
		p.setAmount(amount);
		p.setVenture(request.getParameter("venture"));
		p.setAddress(request.getParameter("address"));
		p.setStatus("vacant");
		boolean status=false;
		status=AddPlotBean.add(p);
		if(status) {
			response.sendRedirect("./admin_home.jsp?msg=added sucessfully");
		}
		else
			response.sendRedirect("./add_plot.jsp?msg=added failed");
	}

}
