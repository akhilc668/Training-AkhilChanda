package com.realtor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Sales;

public class CompletePayment extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		int paidAmount = Integer.parseInt(request.getParameter("paidAmount"));
		Sales s = ViewSalesBean.getById(id);
		if (s.getRemainingAmount() >= paidAmount) {
			int remainingAmount = s.getRemainingAmount() - paidAmount;
			paidAmount = s.getPaidAmount() + paidAmount;
			s.setPaidAmount(paidAmount);
			s.setRemainingAmount(remainingAmount);
			boolean status = false;
			status = CompletePaymentBean.updateSales(s);
			if (status) {
				response.sendRedirect("./user_bought_plot.jsp?msg=completed sucessfully");
			} else
				response.sendRedirect("./user_bought_plot.jsp?msg=complete failed");
		} else
			response.sendRedirect("./user_bought_plot.jsp?msg=amount is more than the remaining amount");
	}

}
