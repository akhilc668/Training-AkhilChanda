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
		<h1>Welcome to Employee Update Page</h1>
		<br> <a href="admin_home.jsp">Home</a> | <a
			href="employee_register.jsp">Employee Register</a> | <a
			href="employee_details.jsp">Employee Details</a> | <a
			href="add_plot.jsp">Add plot</a> | <a href="./index.html">Logout</a>
	</center>
	<br>
	<%@page import="com.pojo.Employee,com.realtor.EmployeeBean"%>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
	Employee p = EmployeeBean.getById(id);
	%>
	<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="./admin_update_employee" method="post">
							<input type="hidden" name="id" value="<%=p.getId()%>"> <input
								type="hidden" name="password" value="<%=p.getPassword()%>">
							<div class="form-group">
								Employee name: <input type="text" class="form-control"
									name="ename" value="<%=p.getEname()%>">
							</div>
							<div class="form-group">
								Email: <input type="email" class="form-control" name="email"
									value="<%=p.getEmail()%>">
							</div>
							<div class="form-group">
								phone: <input type="number" class="form-control" name="phone"
									value="<%=p.getPhone()%>">
							</div>
							<div class="form-group">
								<%
									if (p.getGender().equals("Male")) {
								%>
								Gender:<br> <input type="radio"  name="gender"
									value="Male" checked="checked">Male <input type="radio"
									 name="gender" value="Female">Female
								<%
									} else {
								%>
								Gender: <input type="radio"  name="gender"
									value="Male">Male <input type="radio" name="gender"
									 value="Female" checked="checked">Female
								<%
									}
								%>
							</div>
							<div class="form-group">
								Address: <input type="text" class="form-control" name="address"
									value="<%=p.getAddress()%>">
							</div>
							<div class="form-group">
								Desgination: <input type="text" class="form-control" name="designation"
									value="<%=p.getDesignation()%>">
							</div>
							<div class="form-group">
								Salary: <input type="number" class="form-control" name="salary"
									value="<%=p.getSalary()%>">
							</div>
							<input type="submit" class="btn btn-primary" value="update">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>