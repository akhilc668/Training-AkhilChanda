<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Doctor Profile Page</h1>
		<br> <br> <a href="doctor_home.html">Home</a>| <a
			href="doctor_profile.jsp">Profile</a> | <a href="index.html">Logout</a>
	</center>
	<br><br>
	<%@include file="connect.jsp"%>
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>Specialization</td>
			<td>Experiance</td>
			<td>Address</td>
			<td>Action</td>
		</tr>
		<%
		int id = (int) session.getAttribute("id");
		String sql = "select * from doctor where did=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt("did")%></td>
			<td><%=rs.getString("dname")%></td>
			<td><%=rs.getString("email")%></td>
			<td><%=rs.getString("phone")%></td>
			<td><%=rs.getString("gender")%></td>
			<td><%=rs.getString("specialization")%></td>
			<td><%=rs.getInt("experiance")%></td>
			<td><%=rs.getString("address")%></td>
			<td><a href="update_doctor_profile.jsp?id=<%=rs.getInt("did")%>">update</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>