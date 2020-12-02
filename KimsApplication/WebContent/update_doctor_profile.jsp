<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Doctor Update Page</h1>
		<br> <br> <a href="doctor_home.html">Home</a> | <a
			href="doctor_profile.jsp">Profile</a> | <a href="index.html">Logout</a>
	</center>
	<br>
	<br>
	<%@ include file="connect.jsp"%>
	<%
	int id = Integer.parseInt(request.getParameter("id"));
	String sql = "select * from doctor where did=?";
	ps = con.prepareStatement(sql);
	ps.setInt(1, id);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
	%>
	<form action="doctor_profile_update.jsp" align="center">
		<input type="hidden" name="id" value="<%=rs.getInt("did")%>">
		<input type="text" name="dname" value="<%=rs.getString("dname")%>"><br>
		<br> <input type="email" name="email"
			value="<%=rs.getString("email")%>"><br> <br> <input
			type="number" name="phone" value="<%=rs.getLong("phone")%>"><br>
		<br> <input type="radio" name="gender" value="Male">Male
		<input type="radio" name="gender" value="Female">Female<br>
		<br> <select name="specialization">
		 	<option value="<%=rs.getString("specialization")%>"><%=rs.getString("specialization")%></option>
			<option value="Dentist">Dentist</option>
			<option value="Cardio">Cardio</option>
			<option value="ENT">ENT</option>
		</select><br>
		<br> <input type="number" name="experiance" value="<%=rs.getInt("experiance")%>"><br>
		<br>
		<textarea rows="15" cols="15" name="address"><%=rs.getString("address")%></textarea>
		<br> <br> <input type="submit" value="update">
	</form>
	<%
		}
	%>
	</table>
</body>
</html>