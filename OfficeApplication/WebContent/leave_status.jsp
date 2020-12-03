<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<center>
		<h1>Welcome to Leave status Page</h1>
		<a href="./employee_home.html">Home</a> | <a
			href="./employee_profile.jsp">Profile</a> | <a href="leave.jsp">Leave
			Application</a> | <a href="leave_status.jsp">Leave status</a> | <a
			href="./index.html">logout</a>
	</center>
	<%@include file="connect.jsp"%>
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Employee Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>No of days</td>
			<td>Date of leave</td>
			<td>Desgination</td>
			<td>Manager Name</td>
			<td>Status</td>
		</tr>
		<%
			String email = (String) session.getAttribute("email");
		ps = con.prepareStatement("select * from leaves where email=?");
		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getInt(4) %></td>
			<td><%=rs.getString(5) %></td>
			<td><%=rs.getInt(6) %></td>
			<td><%=rs.getString(7) %></td>
			<td><%=rs.getString(8) %></td>
			<td><%=rs.getString(9) %></td>
			<td><%=rs.getString(10) %></td>
		</tr>

		<%
			}
		%>
	</table>
	<br>
	<br>
</body>
</html>