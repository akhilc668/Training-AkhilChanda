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
		<h1>Welcome to Employee login Page</h1>
		<br> <a href="./index.html">Home</a>
	</center>
	<br>
	<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 10vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="./employee_login" method="post">
							<div class="form-group">
								Email: <input type="email" name="email" class="form-control"
									placeholder="Enter Email">
							</div>
							<div class="form-group">
								Password: <input type="password" name="password"
									class="form-control" placeholder="Enter Password">
							</div>
							<input type="submit" class="btn btn-primary" value="login">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>