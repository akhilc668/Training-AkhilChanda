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
		<h1>Welcome to Add Plot Page</h1>
		<br><a href="admin_home.jsp">Home</a> | <a
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
						<form action="./add_plot" method="post" enctype = "multipart/form-data">
							<div class="form-group">
								PlotNo: <input type="text" name="plotNo" class="form-control" placeholder="Enter plotNo" required="required">
							</div>
							<div class="form-group">
								OwnerName: <input type="text" name="ownerName"
									class="form-control" placeholder="Enter Owner Name" required="required">
							</div>
							<div class="form-group">
								Email: <input type="email" class="form-control" name="email" placeholder="Enter Email" required="required">
							</div>
							<div class="form-group">
								phone: <input type="number" class="form-control" name="phone" placeholder="Enter Phone Number" required="required">
							</div>
							<div class="form-group">
								Area: <input type="number" class="form-control" name="area" placeholder="Enter In sqft" required="required">
							</div>
							<div class="form-group">
								Amount: <input type="number" name="amount" class="form-control" placeholder="Enter Amount" required="required">
							</div>
							<div class="form-group">
								Venture: <input type="text" class="form-control" name="venture" placeholder="Enter Venture" required="required">
							</div>
							<div class="form-group">
								Address: <input type="text" class="form-control" name="address" placeholder="Enter Address" required="required">
							</div>
							<div class="form-group">
								<input type = "file" name = "file" required="required">
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