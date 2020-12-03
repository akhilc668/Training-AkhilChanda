<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br>
<center><h1>Welcome to Appointment Details Page</h1>
<br><br>
<a href="./doctor_home.html">Home</a> |
<a href="./doctor_profile.jsp">Profile</a> |
<a href="view_appointment.jsp">Appointment Details</a> |
<a href="./index.html">Logout</a>
</center>
<br><br>
<%@include file="connect.jsp" %>
<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Patient Name</td>
			<td>Phone</td>
			<td>Email</td>
			<td>Gender</td>
			<td>Blood_group</td>
			<td>Specialist</td>
			<td>Date of appointment</td>
			<td>Time of appointment</td>
			<td>Doctor Name</td>
			<td>Status</td>
			<td>Action</td>
		</tr>
<%
String specialist=(String) session.getAttribute("specialist");
ps=con.prepareStatement("select * from appointment where specialist=?");
ps.setString(1,specialist);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getInt(3) %></td>
			<td><%=rs.getString(4) %></td>
			<td><%=rs.getString(5) %></td>
			<td><%=rs.getString(6) %></td>
			<td><%=rs.getString(7) %></td>
			<td><%=rs.getString(8) %></td>
			<td><%=rs.getString(9) %></td>
			<td><%=rs.getString(10) %></td>
			<td><%=rs.getString(11) %></td>
			<%if(rs.getString(11).equalsIgnoreCase("Accepted")){ %>
			<td>Accepted</td>
			<%}else{ %>
			<td><a href="accpet_appointment.jsp?id=<%=rs.getInt(1)%>">Accept</a></td>
			<%} %>
		</tr>
<%} %>
</table>
</body>
</html>