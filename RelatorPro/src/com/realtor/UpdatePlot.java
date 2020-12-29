package com.realtor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Plot;


public class UpdatePlot extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Plot p=new Plot();
		p.setId(Integer.parseInt(request.getParameter("id")));
		p.setPlotNo(request.getParameter("plotNo"));
		p.setOwnerName(request.getParameter("ownerName"));
		p.setEmail(request.getParameter("email"));
		p.setPhone(request.getParameter("phone"));
		int amount=Integer.parseInt(request.getParameter("amount"));
		p.setAmount(amount);
		p.setVenture(request.getParameter("venture"));
		p.setAddress(request.getParameter("address"));
		p.setStatus(request.getParameter("status"));
		p.setArea(request.getParameter("area")+" sqft");
		boolean status=false;
		status=UpdatePlotBean.update(p);
		if(status) {
			response.sendRedirect("./view_plot.jsp?msg=updated sucessfully");
		}
		else
			response.sendRedirect("./update_plot.jsp?id="+p.getId()+"msg=update failed");
	}

}
