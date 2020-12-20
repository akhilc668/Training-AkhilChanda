<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<a href="employee_home.jsp">Home</a> |
<a href="view_plot.jsp">View plot</a> |
<a href="./index.html">Logout</a>
</center>
<br><br><br>
<%@page import="com.pojo.Plot,com.realtor.ViewPlotBean,java.util.*" %>
<table border="2px;" align="center" width="500" hight="300">
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
List<Plot> l=new ViewPlotBean().view();
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
			<td><a href="./update_plot.jsp&id=<%=vab.getId()%>"></a></td>
		</tr>
<%} %>
</table>
</body>
</html>