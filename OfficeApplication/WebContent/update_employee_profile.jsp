<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<center>
		<h1>Welcome to Employee Profile Update Page</h1>
		<a href="./employee_home.html">Home</a> | <a
			href="./employee_profile.jsp">Profile</a> | <a href="./index.html">logout</a>
	</center>
	<br>
	<br>
	<%@include file="connect.jsp"%>
	<%
	   int id=Integer.parseInt(request.getParameter("id"));
	ps = con.prepareStatement("select * from employee where eid=?");
	ps.setInt(1, id);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
	%>
	<form action="./employee_profile_update.jsp" align="center">
	<input type="hidden" name="id" value="<%=rs.getInt("eid")%>">
<input type="text" name="ename" value="<%=rs.getString("ename")%>"><br><br>
<input type="email" name="email" value="<%=rs.getString("email")%>"><br><br>
<input type="number" name="phone" value="<%=rs.getInt("phone")%>"><br><br>
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female<br><br>
<select name="designation">
<option value="<%=rs.getString("designation")%>"><%=rs.getString("designation")%></option>
<option value="Developer">Developer</option>
<option value="Tester">Tester</option>
</select><br><br>
<input type="number" name="experience" value="<%=rs.getInt("experience")%>"><br><br>
<textarea rows="15" cols="15" name="address"><%=rs.getString("address")%></textarea><br><br>
<input type="submit" value="update">
	<%
		}
	%>
</body>
</html>