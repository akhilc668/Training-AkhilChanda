<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<h1>Welcome to Admin Home Page</h1><br><br>
<a href="admin_home.jsp">Home</a> |
<a href="employee_register.jsp">Employee Register</a> |
<a href="employee_details.jsp">Employee Details</a> |
<a href="add_plot.jsp">Add plot</a> |
<a href="./index.html">Logout</a>
</center>
<br><br><br>
<form action="search_employee.jsp" align="center">
By Address: <input type="text" name="address">
<input type="submit" value="search">
</form>
<%@page import="com.pojo.Employee,com.realtor.EmployeeBean,java.util.*" %>
<table border="2px;" align="center" width="1000" hight="300">
		<tr>
			<td>Employee Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Address</td>
			<td>Gender</td>
			<td>Salary</td>
			<td>Action</td>
		</tr>
<%
String address=request.getParameter("address");
List<Employee> l=null;
if(address.equals("")){
l=EmployeeBean.viewEmployee();
}else{
	l=EmployeeBean.search(address);
}
Iterator i=l.iterator();
while(i.hasNext()){
Employee vab=(Employee)i.next();
%>
<tr>
			<td><%=vab.getEname() %></td>
			<td><%=vab.getEmail() %></td>
			<td><%=vab.getPhone() %></td>
			<td><%=vab.getAddress() %></td>
			<td><%=vab.getGender() %></td>
			<td><%=vab.getSalary() %></td>
			<td><a href="update_employee.jsp?id=<%=vab.getId()%>">update</a></td>
		</tr>
<%} %>
</table>
</body>
</html>