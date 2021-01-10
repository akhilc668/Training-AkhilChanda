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

#divleft {
	background-color: transparent;
	float: left;
	width: 50%;
	height: 100%;
	border-radius: 10px;
}

#image {
	width: 90%;
	height: 90%;
	margin-left: 35px;
	border-radius: 10px;
}

#divright {
	background-color: transparent;
	float: right;
	width: 50%;
	height: 100%;
	border-radius: 10px;
}

#right {
	margin-top: 10px;
	margin-left: 75px;
	margin-right: 75px;
	margin-bottom: 10px;
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
		<h1>Welcome to Available Plot Page</h1>
		<br> <br> <a href="user_home.jsp">Home</a> | <a
			href="update_user.jsp">Update User</a> |<a href="available_plot.jsp">Available
			plot</a> | <a href="user_bought_plot.jsp">Bought plot</a> | <a
			href="index.html">Logout</a>
	</center>
	<br>
	<div class="container">
		<%@page import="com.pojo.Plot,com.realtor.ViewPlotBean,java.util.*"%>
		<%
			int id = Integer.parseInt(request.getParameter("pid"));
		Plot vab = ViewPlotBean.getById(id);
		String src="images/"+vab.getFilename();
		%>
		<div id="divleft">
			<img alt="" src="<%=src%>" id="image">
		</div>
		<div id="divright">
			<div id="right">
				<table class="table table-border table-success">
					<tr>
						<td>ID:</td>
						<td><%=vab.getPlotNo()%></td>
					</tr>
					<tr>
						<td>Owner Name:</td>
						<td><%=vab.getOwnerName()%></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><%=vab.getEmail()%></td>
					</tr>
					<tr>
						<td>Venture:</td>
						<td><%=vab.getVenture()%></td>
					</tr>
					<tr>
						<td>Area:</td>
						<td><%=vab.getArea()%></td>
					</tr>
					<tr>
						<td>Amount:</td>
						<td><%=vab.getAmount()%></td>
					</tr>
					<tr>
						<td>Address:</td>
						<td><%=vab.getAddress()%></td>
					</tr>
					<tr>
						<td>Status:</td>
						<td><%=vab.getStatus()%></td>
					</tr>
					<tr><td><a href="buy_plot.jsp?pid=<%=vab.getId()%>" class="btn btn-primary">Buy</a></td></tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>