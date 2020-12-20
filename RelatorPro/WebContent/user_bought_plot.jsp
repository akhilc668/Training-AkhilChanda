<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<a href="user_home.jsp">Home</a> |
<a href="available_plot.jsp">Available plot</a> |
<a href="user_bought_plot.jsp">Bought plot</a> |
<a href="index.html">Logout</a> 
</center>
<br><br><br>
<%@page import="com.pojo.Plot,com.realtor.ViewPlotBean,com.pojo.Sales,com.realtor.ViewSalesBean,java.util.*" %>
<table border="2px;" align="center" width="1000" hight="300">
		<tr>
			<td>PlotNo</td>
			<td>OwnerName</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Venture</td>
			<td>amount</td>
			<td>Address</td>
			<td>Plot Status</td>
			<td>paidAmount</td>
			<td>RemainingAmount</td>
			<td>paymentStatus</td>
			<td>Sales Status</td>
			<td>Action</td>
		</tr>
<%
int uid=(Integer)session.getAttribute("uid");
List<Sales> l=ViewSalesBean.viewSalesByUser(uid);
Iterator i=l.iterator();
while(i.hasNext()){
Sales vab=(Sales)i.next();
Plot p=ViewPlotBean.getById(vab.getPlotId());
%>
<tr>
			<td><%=p.getPlotNo() %></td>
			<td><%=p.getOwnerName() %></td>
			<td><%=p.getEmail() %></td>
			<td><%=p.getPhone() %></td>
			<td><%=p.getVenture() %></td>
			<td><%=p.getAmount() %></td>
			<td><%=p.getAddress() %></td>
			<td><%=p.getStatus() %></td>
			<td><%=vab.getPaidAmount()%></td>
			<td><%=vab.getRemainingAmount() %></td>
			<td><%=vab.getPaymentStatus() %></td>
			<td><%=vab.getStatus() %></td>
			<%if(vab.getPaymentStatus().equals("incomplete")){ %>
			<td><a href="./complete_payment.jsp?id=<%=vab.getId()%>">Complete Payment</a></td>
			<%}else{ %>
			<td>Accepted and updated</td>
			<%} %>
		</tr>
<%} %>
</table>
</body>
</html>