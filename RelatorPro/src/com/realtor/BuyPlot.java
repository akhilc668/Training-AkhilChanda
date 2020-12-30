package com.realtor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Plot;
import com.pojo.Sales;

public class BuyPlot extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int plotId = Integer.parseInt(request.getParameter("plotId"));
		String ownerName = request.getParameter("ownerName");
		String buyerName = request.getParameter("buyerName");
		String bPhone = request.getParameter("bPhone");
		int paidAmount = Integer.parseInt(request.getParameter("paidAmount"));
		int uid = Integer.parseInt(request.getParameter("uid"));
		Plot p = ViewPlotBean.getById(plotId);
		Sales s = new Sales();
		if (paidAmount > p.getAmount()) {
			response.sendRedirect("./buy_plot.jsp?pid=" + plotId + "&msg=Paid amount is more than actual amount");
		} else {
			int remainingAmount = p.getAmount() - paidAmount;
			String paymentStatus = "";
			if (paidAmount < p.getAmount()) {
				paymentStatus = "incomplete";
			} else {
				paymentStatus = "completed";
			}
			String status = "none";
			s.setPlotId(plotId);
			s.setOwnerName(ownerName);
			s.setBuyerName(buyerName);
			s.setbPhone(bPhone);
			s.setPaidAmount(paidAmount);
			s.setRemainingAmount(remainingAmount);
			s.setPaymentStatus(paymentStatus);
			s.setStatus(status);
			s.setUid(uid);
			boolean bstatus = false;
			bstatus = BuyPlotBean.buy(s);
			if (bstatus) {
				response.sendRedirect("./user_home.jsp?msg=buyed sucessfully");
			} else
				response.sendRedirect("./buy_plot.jsp?pid=" + plotId + "&msg=buyed failed");
		}
	}

}
