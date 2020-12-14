<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<center>
		<h1>Welcome to Employee Profile Page</h1>
		<a href="./employee_home.html">Home</a> | <a
			href="./employee_profile.jsp">Profile</a> | <a href="./index.html">logout</a>
	</center>
	<br>
	<br>
	<%@include file="connect.jsp"%>
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>Address</td>
			<td>Designation</td>
			<td>Experience</td>
			<td>No of Leaves Taken</td>
			<td>No of remaining leaves</td>
			<td>Action</td>
		</tr>
	<%
		int id = (int) session.getAttribute("id");
	ps = con.prepareStatement("select * from employee where eid=?");
	ps.setInt(1, id);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
	%>
	<tr>
		<td><%=rs.getInt("eid")%></td>
		<td><%=rs.getString("ename")%></td>
		<td><%=rs.getString("email")%></td>
		<td><%=rs.getString("phone")%></td>
		<td><%=rs.getString("gender")%></td>
		<td><%=rs.getString("address")%></td>
		<td><%=rs.getString("designation")%></td>
		<td><%=rs.getInt("experience")%></td>
		<td><%=rs.getInt("no_of_leaves_taken") %></td>
		<td><%=20-rs.getInt("no_of_leaves_taken") %></td>
		<td><a href="update_employee_profile.jsp?id=<%=rs.getInt("eid")%>">update</a></td>
	</tr>
	<%
		}
	%>
	</table>
</body>
</html>