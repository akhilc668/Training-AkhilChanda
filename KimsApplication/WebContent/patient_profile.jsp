<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Patient Profile Page</h1>
		<br> <br> <a href="patient_home.html">Home</a> | <a
			href="patient_profile.jsp">Profile</a> | <a href="index.html">Logout</a>
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
			<td>Action</td>
		</tr>

		<%
			int id = (int) session.getAttribute("id");
		String sql = "select * from patient where pid=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt("pid")%></td>
			<td><%=rs.getString("pname")%></td>
			<td><%=rs.getString("email")%></td>
			<td><%=rs.getInt("phone")%></td>
			<td><%=rs.getString("gender")%></td>
			<td><%=rs.getString("address")%></td>
			<td><a
				href="update_patient_profile.jsp?id=<%=rs.getInt("pid")%>">update</a>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>