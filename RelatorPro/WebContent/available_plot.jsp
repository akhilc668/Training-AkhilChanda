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
<%@page import="com.pojo.Plot,com.realtor.ViewPlotBean,java.util.*" %>
<table border="2px;" align="center" width="1000" hight="300">
		<tr>
			<td>PlotNo</td>
			<td>OwnerName</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Venture</td>
			<td>amount</td>
			<td>Address</td>
			<td>Status</td>
			<td>Action</td>
		</tr>
<%
List<Plot> l=ViewPlotBean.viewByStatus("vacant");
Iterator i=l.iterator();
while(i.hasNext()){
Plot vab=(Plot)i.next();
%>
<tr>
			<td><%=vab.getPlotNo() %></td>
			<td><%=vab.getOwnerName() %></td>
			<td><%=vab.getEmail() %></td>
			<td><%=vab.getPhone() %></td>
			<td><%=vab.getVenture() %></td>
			<td><%=vab.getAmount() %></td>
			<td><%=vab.getAddress() %></td>
			<td><%=vab.getStatus() %></td>
			<td><a href="buy_plot.jsp?pid=<%=vab.getId()%>">Buy</a></td>
		</tr>
<%} %>
</table>
</body>
</html>