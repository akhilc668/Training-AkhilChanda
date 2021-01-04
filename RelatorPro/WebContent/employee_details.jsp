<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body, html {
	height: 100%;
	margin: 0;
}

.bg {
	/* The image used */
	background-image: url("background.png");
	/* Full height */
	height: 100%;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: repeat;
	background-size: cover;
}
</style>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body bgcolor="#E6E6FA" class="bg">
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
	</div>
	<br>
	<div class="container">
		<%@page
			import="com.pojo.Employee,com.realtor.EmployeeBean,java.util.*"%>
		<table class="table table-bordered table-light">
			<tr class="table-success">
				<td><b>Name</b></td>
				<td><b>Email</b></td>
				<td><b>Phone</b></td>
				<td><b>Address</b></td>
				<td><b>Gender</b></td>
				<td><b>Designation</b></td>
				<td><b>Salary</b></td>
				<td><b>Action</b></td>
			</tr>
			<%
				String address = request.getParameter("address");
			List<Employee> l = null;
			if (address == null || address.equals("")) {
				l = EmployeeBean.viewEmployee();
			} else {
				l = EmployeeBean.search(address);
			}
			if (l == null) {
			%>
			<tr>
			</tr>
			<%
				} else {
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
				<td><%=vab.getDesignation()%></td>
				<td><%=vab.getSalary()%></td>
				<td><a href="admin_update_employee.jsp?id=<%=vab.getId()%>">update</a></td>
			</tr>
			<%
				}
			}
			%>
		</table>
	</div>
</body>
</html>