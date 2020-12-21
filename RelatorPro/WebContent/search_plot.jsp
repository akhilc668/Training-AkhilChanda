<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<br>
	<%int id=(Integer)session.getAttribute("eid");%>
	<center>
		<h1>Welcome to View Plot Page</h1>
		<br>
		<br> <a href="employee_home.jsp">Home</a> | 
		<a href="update_employee?id=<%=id %>">Update employee</a> |
		<a href="view_plot.jsp">View plot</a> | 
		<a href="bought_plot.jsp">Sales Book</a> | 
		<a href="./index.html">Logout</a>
	</center>
	<br>
	<br>
	<br>
	<%@page import="com.pojo.Plot,com.realtor.ViewPlotBean,java.util.*"%>
	<form action="./search_plot.jsp" align="center">
		<select name="status">
			<option value="select">Select</option>
			<option value="vacant">Vacant</option>
			<option value="reserved">Reserved</option>
			<option value="sold">Sold</option>
		</select>
		<input type="submit" value="submit">
	</form>
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
			String status = request.getParameter("status");
		List<Plot> l = null;
		if (status.equals("select")) {
			l = ViewPlotBean.view();
		} else {
			l = ViewPlotBean.viewByStatus(status);
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
			<td><%=vab.getAmount()%></td>
			<td><%=vab.getAddress()%></td>
			<td><%=vab.getStatus()%></td>
			<td><a href="update_plot.jsp?id=<%=vab.getId()%>">update</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>