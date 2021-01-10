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
		<h1>Welcome to Available Plot Page</h1>
		<br> <br> <a href="user_home.jsp">Home</a> | <a
			href="update_user.jsp">Update User</a> |<a href="available_plot.jsp">Available
			plot</a> | <a href="user_bought_plot.jsp">Bought plot</a> | <a
			href="index.html">Logout</a>
	</center>
	<br>

	<div class="container">
		<div class="row justify-content-center align-items-center">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="./available_plot.jsp">
							<div class="form-group">
								By Address: <input type="text" name="address"
									class="form-control" placeholder="enter a place"> Or By
								Venture: <input type="text" name="venture" class="form-control"
									placeholder="enter a venture">
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
		<%@page import="com.pojo.Plot,com.realtor.ViewPlotBean,java.util.*"%>
		<table class="table table-bordered table-light">
			<tr class="table-success">
				<td><b>PlotNo</b></td>
				<td><b>OwnerName</b></td>
				<td><b>Email</b></td>
				<td><b>Phone</b></td>
				<td><b>Venture</b></td>
				<td><b>Area</b></td>
				<td><b>amount</b></td>
				<td><b>Address</b></td>
				<td><b>Status</b></td>
				<td><b>Action</b></td>
			</tr>
			<%
				String address = request.getParameter("address");
			String venture = request.getParameter("venture");
			List<Plot> l = null;
			if ((address == null && venture == null) || (address.equals("") && venture.equals(""))) {
				l = ViewPlotBean.viewByStatus("vacant");
			} else {
				l = ViewPlotBean.search(address, venture);
			}
			if (l == null) {
			%>
			<tr></tr>
			<%
				} else {
			Iterator i = l.iterator();
			while (i.hasNext()) {
				Plot vab = (Plot) i.next();
			%>
			<tr>
				<td><%=vab.getPlotNo()%></td>
				<td><%=vab.getOwnerName()%></td>
				<td><%=vab.getEmail()%></td>
				<td><%=vab.getPhone()%></td>
				<td><%=vab.getVenture()%></td>
				<td><%=vab.getArea()%></td>
				<td><%=vab.getAmount()%></td>
				<td><%=vab.getAddress()%></td>
				<td><%=vab.getStatus()%></td>
				<td><a href="plot_details.jsp?pid=<%=vab.getId()%>" class="btn btn-primary">view</a></td>
			</tr>
			<%
				}
			}
			%>
		</table>
	</div>
</body>
</html>