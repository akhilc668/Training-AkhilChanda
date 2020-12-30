<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body bgcolor="#E6E6FA">
	<br>
	<center>
		<h1>Welcome to Employee Register Page</h1>
		<br>  <a href="admin_home.jsp">Home</a> | <a
			href="employee_register.jsp">Employee Register</a> | <a
			href="employee_details.jsp">Employee Details</a> | <a
			href="add_plot.jsp">Add plot</a> | <a href="./index.html">Logout</a>
	</center>
	<br>
	<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="./employee_register" method="post" >
							<div class="form-group">
								Employee name: <input type="text" class="form-control"
									name="ename" placeholder="Enter Employee Name">
							</div>
							<div class="form-group">
								Email: <input type="email" class="form-control" name="email" placeholder="Enter Email">
							</div>
							<div class="form-group">
								Password: <input type="password" class="form-control"
									name="password" placeholder="Enter Password">
							</div>
							<div class="form-group">
								phone: <input type="number" class="form-control" name="phone" placeholder="Enter Phone Number">
							</div>
							<div class="form-group">
								Gender: <br><input type="radio" name="gender" value="Male">Male
								<input type="radio" name="gender" value="Female">Female
							</div>
							<div class="form-group">
								Address: <input type="text" class="form-control" name="address" placeholder="Enter Address">
							</div>
							<div class="form-group">
								Salary: <input type="number" class="form-control" name="salary" placeholder="Enter Salary per Month">
							</div>
							<input type="submit" class="btn btn-primary" value="register">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>