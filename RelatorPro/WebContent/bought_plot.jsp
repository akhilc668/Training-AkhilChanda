<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<h1>Welcome to Sales Book Page</h1><br><br>
<a href="employee_home.jsp">Home</a> |
<a href="view_plot.jsp">View plot</a> |
<a href="bought_plot.jsp">Sales Book</a> |
<a href="./index.html">Logout</a>
</center>
<br><br><br>
<%@page import="com.pojo.Plot,com.realtor.ViewPlotBean,com.pojo.Sales,com.realtor.ViewSalesBean,java.util.*" %>
<table border="2px;" align="center" width="1000" hight="300">
		<tr>
			<td>plotId</td>
			<td>OwnerName</td>
			<td>BuyerName</td>
			<td>BuyerPhone</td>
			<td>paidAmount</td>
			<td>RemainingAmount</td>
			<td>paymentStatus</td>
			<td>Status</td>
			<td>Action</td>
		</tr>
<%
List<Sales> l=ViewSalesBean.viewSales();
Iterator i=l.iterator();
while(i.hasNext()){
Sales vab=(Sales)i.next();
Plot p=ViewPlotBean.getById(vab.getPlotId());
%>
<tr>
			<td><%=vab.getPlotId() %></td>
			<td><%=vab.getOwnerName() %></td>
			<td><%=vab.getBuyerName() %></td>
			<td><%=vab.getbPhone() %></td>
			<td><%=vab.getPaidAmount()%></td>
			<td><%=vab.getRemainingAmount() %></td>
			<td><%=vab.getPaymentStatus() %></td>
			<td><%=vab.getStatus() %></td>
			<%if(vab.getRemainingAmount()>=0&&(p.getStatus().equals("reserved")||p.getStatus().equals("vacant"))){ %>
			<td><a href="./sales_book?id=<%=vab.getId()%>">Accept and update plot</a></td>
			<%}else{ %>
			<td>Accepted and updated</td>
			<%} %>
		</tr>
<%} %>
</table>
</body>
</html>