package com.realtor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Plot;
import com.pojo.Sales;

public class SalesBook extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Sales s = ViewSalesBean.getById(id);
		Plot p = ViewPlotBean.getById(s.getPlotId());
		s.setStatus("Accepted");
		if (s.getPaidAmount() < p.getAmount()) {
			s.setPaymentStatus("incomplete");
			p.setStatus("reserved");
		}else {
			s.setPaymentStatus("completed");
			p.setStatus("sold");
		}
		boolean status = false;
		status = SalesBean.updateSales(s, p);
		if (status) {
			response.sendRedirect("./bought_plot.jsp?msg=accept sucessfully");
		} else
			response.sendRedirect("./bought_plot.jsp?msg=accept failed");
	}

}
