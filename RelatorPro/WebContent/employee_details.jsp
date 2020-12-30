<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body bgcolor="#E6E6FA">
	<br>
	<center>
		<h1>Welcome to Empoyee Details Page</h1>
		<br> <a href="admin_home.jsp">Home</a> | <a
			href="employee_register.jsp">Employee Register</a> | <a
			href="employee_details.jsp">Employee Details</a> | <a
			href="add_plot.jsp">Add plot</a> | <a href="./index.html">Logout</a>
	</center>
	<br>
	<div class="container">
		<div class="row justify-content-center align-items-center">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="employee_details.jsp">
							<div class="form-group">
								By Address: <input type="text" class="form-control"
									name="address" placeholder="Enter Address">
							</div>
							<input type="submit" class="btn btn-primary" value="serach">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div><br>
	<div class="container">
		<%@page
			import="com.pojo.Employee,com.realtor.EmployeeBean,java.util.*"%>
		<table class="table table-bordered">
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
				String address = request.getParameter("address");
			List<Employee> l = null;
			if (address == null || address.equals("")) {
				l = EmployeeBean.viewEmployee();
			} else {
				l = EmployeeBean.search(address);
			}
			Iterator i = l.iterator();
			while (i.hasNext()) {
				Employee vab = (Employee) i.next();
			%>
			<tr>
				<td><%=vab.getEname()%></td>
				<td><%=vab.getEmail()%></td>
				<td><%=vab.getPhone()%></td>
				<td><%=vab.getAddress()%></td>
				<td><%=vab.getGender()%></td>
				<td><%=vab.getSalary()%></td>
				<td><a href="admin_update_employee.jsp?id=<%=vab.getId()%>">update</a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>