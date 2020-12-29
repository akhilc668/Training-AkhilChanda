<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<br>
	<center>
		<h1>Welcome to Available Plot Page</h1>
		<br>
		<br> <a href="user_home.jsp">Home</a> | <a href="update_user.jsp">Update User</a> |<a
			href="available_plot.jsp">Available plot</a> | <a
			href="user_bought_plot.jsp">Bought plot</a> | <a href="index.html">Logout</a>
	</center>
	<br>
	<br>
	<br>
	<form action="./available_plot.jsp" method="post" align="center">
		By Address: <input type="text" name="address" placeholder="enter a place">
		Or By Venture: <input type="text" name="venture" placeholder="enter a venture">
		<input type="submit" value="search">
	</form><br><br>
	<%@page import="com.pojo.Plot,com.realtor.ViewPlotBean,java.util.*"%>
	<table border="2px;" align="center" width="1000" hight="300">
		<tr>
			<td>PlotNo</td>
			<td>OwnerName</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Venture</td>
			<td>Area</td>
			<td>amount</td>
			<td>Address</td>
			<td>Status</td>
			<td>Action</td>
		</tr>
		<%
		String address=request.getParameter("address");
		String venture=request.getParameter("venture");
		List<Plot> l =null;
		if((address==null&&venture==null)||(address.equals("")&&venture.equals(""))){
			l= ViewPlotBean.viewByStatus("vacant");
		}else{
		 l=ViewPlotBean.search(address,venture);
		}
		Iterator i = l.iterator();
		while (i.hasNext()) {
			Plot vab = (Plot) i.next();
		%>
		<tr>
			<td><%=vab.getPlotNo()%></td>
			<td><%=vab.getOwnerName()%></td>
			<td><%=vab.getEmail()%></td>
			<td><%=vab.getPhone()%></td>
			<td><%=vab.getVenture()%></td>
			<td><%=vab.getArea() %></td>
			<td><%=vab.getAmount()%></td>
			<td><%=vab.getAddress()%></td>
			<td><%=vab.getStatus()%></td>
			<td><a href="buy_plot.jsp?pid=<%=vab.getId()%>">Buy</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>