<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br>
<center><h1>Welcome to Appointment Stauts  Page</h1>
<br><br>
<a href="./patient_home.html">Home</a> |
<a href="./patient_profile.jsp">Profile</a> |
<a href="./appointment.jsp">Appointment</a> |
<a href="appointment_status.jsp">Appointment status</a> |
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
		</tr>
<%
int id=(Integer)session.getAttribute("id");
ps=con.prepareStatement("select * from appointment where pid=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getString(4) %></td>
			<td><%=rs.getString(5) %></td>
			<td><%=rs.getString(6) %></td>
			<td><%=rs.getString(7) %></td>
			<td><%=rs.getString(8) %></td>
			<td><%=rs.getString(9) %></td>
			<td><%=rs.getString(10) %></td>
			<td><%=rs.getString(11) %></td>
		</tr>
<%} %>
</table>
</body>
</html>