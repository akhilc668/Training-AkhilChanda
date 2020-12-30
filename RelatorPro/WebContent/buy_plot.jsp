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
		<h1>Welcome to Buy Plot Page</h1>
		<br> <a href="user_home.jsp">Home</a> | <a
			href="available_plot.jsp">Available plot</a> | <a href="index.html">Logout</a>
	</center>
	<br>
	<%@page import="com.pojo.Plot,com.pojo.User,com.realtor.ViewPlotBean"%>
	<%
		User u = (User) session.getAttribute("user");
	int id = Integer.parseInt(request.getParameter("pid"));
	Plot p = ViewPlotBean.getById(id);
	if (p != null && u != null) {
	%>
	<div class="container">
		<div class="row justify-content-center align-items-center">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="./buy_plot" method="post">
							<input type="hidden" name="plotId" value="<%=p.getId()%>">
							<input type="hidden" name="uid" value="<%=u.getId()%>">
							<div class="form-group">
								OwnerName:<input type="text" name="ownerName"
									value="<%=p.getOwnerName()%>" class="form-control">
							</div>
							<div class="form-group">
								BuyerName: <input type="text" name="buyerName"
									value="<%=u.getUname()%>" class="form-control">
							</div>
							<div class="form-group">
								BuyerPhone: <input type="number" name="bPhone"
									value="<%=u.getPhone()%>" class="form-control">
							</div>
							<div class="form-group">
								Amount:<input type="text" value="<%=p.getAmount()%>"
									readonly="readonly" class="form-control">
							</div>
							<div class="form-group">
								Amount to pay: <input type="number" name="paidAmount"
									class="form-control" placeholder="Enter the Amount">
							</div>
							<input type="submit" class="btn btn-primary" value="serach">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%
		}
	%>
</body>
</html>