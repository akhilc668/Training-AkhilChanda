<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
		<h1>Welcome to Payment Page</h1>
		<br> <a href="user_home.jsp">Home</a> | <a
			href="available_plot.jsp">Available plot</a> | <a
			href="user_bought_plot.jsp">Bought plot</a> | <a href="index.html">Logout</a>
	</center>
	<br>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
	int RemainingAmount = Integer.parseInt(request.getParameter("remainingAmount"));
	%>

	<div class="container">
		<div class="row justify-content-center align-items-center">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="./complete_payment" method="post">
							<input type="hidden" name="id" value="<%=id%>">
							<div class="form-group">
								Reamining Amount: <input type="number" value="<%=RemainingAmount %>" readonly="readonly"
									class="form-control">
							</div>
							<div class="form-group">
								Amount: <input type="number" name="paidAmount"
									class="form-control">
							</div>
							<input type="submit" class="btn btn-primary" value="Pay">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>