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
<%@page import="com.kims.ViewAppointmentBean,java.util.*" %>
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
List<ViewAppointmentBean> l=new ViewAppointmentBean().view(specialist);
Iterator i=l.iterator();
while(i.hasNext()){
ViewAppointmentBean vab=(ViewAppointmentBean)i.next();
%>
<tr>
			<td><%=vab.getPname() %></td>
			<td><%=vab.getPhone() %></td>
			<td><%=vab.getEmail() %></td>
			<td><%=vab.getGender() %></td>
			<td><%=vab.getBlood_group() %></td>
			<td><%=vab.getSpecialist() %></td>
			<td><%=vab.getDate_of_appointment() %></td>
			<td><%=vab.getTime_of_appointment() %></td>
			<td><%=vab.getDname() %></td>
			<td><%=vab.getStatus() %></td>
			<%if(vab.getStatus().equalsIgnoreCase("Accepted")){ %>
			<td>Accepted</td>
			<%}else{ %>
			<td><form action="./accept_appointment" method="post"><input type="hidden" name="id" value="<%=vab.getId()%>"> 
			<input type="submit" value="accept">
			</form></td>
			<%} %>
		</tr>
<%} %>
</table>
</body>
</html>