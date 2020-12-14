<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Patient Update Page</h1>
		<br> <br> <a href="patient_home.html">Home</a> | <a
			href="patient_profile.jsp">Profile</a> | <a href="index.html">Logout</a>
	</center>
	<br>
	<br>
	<%@include file="connect.jsp"%>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
	String sql = "select * from patient where pid=?";
	ps = con.prepareStatement(sql);
	ps.setInt(1, id);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
	%>
	<form action="patient_profile_update.jsp" align="center">
		<input type="hidden" name="id" value="<%=rs.getInt("pid")%>">
		<input type="text" name="pname" value="<%=rs.getString("pname")%>"><br>
		<br> <input type="email" name="email"
			value="<%=rs.getString("email")%>"><br> <br> <input
			type="number" name="phone" value="<%=rs.getLong("phone")%>"><br>
		<br>
		<%
			if (rs.getString("gender").equals("Male")) {
		%>
		<input type="radio" name="gender" value="Male" checked="checked">Male
		<input type="radio" name="gender" value="Female">Female
		<%
			} else {
		%>
		<input type="radio" name="gender" value="Male">Male <input
			type="radio" name="gender" value="Female" checked="checked">Female
		<%
			}
		%><br> <br>
		<textarea rows="15" cols="15" name="address"><%=rs.getString("address")%></textarea>
		<br> <br> <input type="submit" value="update">
	</form>
	<%
		}
	%>
	</table>
</body>
</html>