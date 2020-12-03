<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<center>
		<h1>Welcome to Manager Profile Page</h1>
		<a href="./manager_home.html">Home</a> | <a
			href="./manager_profile.jsp">Profile</a> | <a href="./index.html">logout</a>
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
			<td>Experience</td>
			<td>Designation</td>
			<td>Action</td>
		</tr>
	<%
		int id = (int) session.getAttribute("id");
	ps = con.prepareStatement("select * from manager where mid=?");
	ps.setInt(1, id);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
	%>
	<tr>
		<td><%=rs.getInt("mid")%></td>
		<td><%=rs.getString("mname")%></td>
		<td><%=rs.getString("email")%></td>
		<td><%=rs.getInt("phone")%></td>
		<td><%=rs.getString("gender")%></td>
		<td><%=rs.getString("address")%></td>
		<td><%=rs.getInt("experience")%></td>
		<td><%=rs.getString("designation") %></td>
		<td><a href="update_manager_profile.jsp?id=<%=rs.getInt("mid")%>">update</a></td>
	</tr>
	<%
		}
	%>
	</table>
</body>
</html>