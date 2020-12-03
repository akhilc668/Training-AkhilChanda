<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br>
<center>
<h1>Welcome to Details Page</h1>
<a href="./manager_home.html">Home</a> |
<a href="./manager_profile.jsp">Profile</a> |
<a href="view_leave.jsp">Leave Details</a> |
<a href="./index.html">logout</a>
</center>
<%@include file="connect.jsp" %>
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
			<td>Action</td>
		</tr>
<%
String designation=(String) session.getAttribute("designation");
ps=con.prepareStatement("select * from leaves where designation=?");
ps.setString(1,designation);
ResultSet rs=ps.executeQuery();
while(rs.next()){
	String email=rs.getString(3);
	ps=con.prepareStatement("select * from employee where email=?");
	ps.setString(1,email);
	ResultSet rs1=ps.executeQuery();
	if(rs1.next()){
		int no_of_leaves_taken=rs1.getInt("no_of_leaves_taken"),eid=rs1.getInt(1);
%>
<tr>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getInt(4) %></td>
			<td><%=rs.getString(5) %></td>
			<td><%=rs.getInt(6) %></td>
			<td><%=rs.getString(7) %></td>
			<td><%=rs.getString(8) %></td>
			<td><%=rs.getString(10) %></td>
			<td><%=rs.getString(9) %></td>
			<%if(rs.getInt(6)<20-no_of_leaves_taken){
				if(rs.getString(9).equalsIgnoreCase("Accepted")){ %>
			<td>Accepted</td>
			<%}else{ %>
			<td><a href="accept_leave.jsp?id=<%=rs.getInt(1)%>&eid=<%=eid %>&no_of_days=<%=rs.getInt(6)%>">Accept</a></td>
			<%}
				}else{ 
					if(!rs.getString(9).equalsIgnoreCase("Accepted")){ %>
						<td>rejected</td>
			<%}else{ %>
				<td><a href="reject_leave.jsp?id=<%=rs.getInt(1)%>">Reject</a></td>
			<%}
				}%>
		</tr>
		<%} %>
<%} %>
</table>
<br><br>
</body>
</html>
