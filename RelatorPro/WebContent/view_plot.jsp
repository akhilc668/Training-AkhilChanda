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
  background-repeat: no-repeat;
  background-size: cover;
  background-attachment: scroll;
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
		<%
			int id = (Integer) session.getAttribute("eid");
		%>
		<h1>Welcome to View Plot Page</h1>
		<br> <a href="employee_home.jsp">Home</a> | <a
			href="employee_update.jsp?id=<%=id%>">Update employee</a> | <a
			href="view_plot.jsp">View plot</a> | <a href="bought_plot.jsp">Sales
			Book</a> | <a href="./index.html">Logout</a>
	</center>
	<br>
	<%@page import="com.pojo.Plot,com.realtor.ViewPlotBean,java.util.*"%>
	<div class="container">
		<div class="row justify-content-center align-items-center">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="./view_plot.jsp">
							<div class="form-group">
								By Status: <select name="status" class="form-control">
									<option value="select">Select</option>
									<option value="vacant">Vacant</option>
									<option value="reserved">Reserved</option>
									<option value="sold">Sold</option>
								</select>
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
		<table class="table table-bordered table-light">
			<tr>
				<td>PlotNo</td>
				<td>OwnerName</td>
				<td>Email</td>
				<td>Phone</td>
				<td>Venture</td>
				<td>Area</td>
				<td>amount</td>
				<td>Address</td>
				<td>Status</td>
				<td>Action</td>
			</tr>
			<%
				String status = request.getParameter("status");
			List<Plot> l = null;
			if (status == null || status.equals("select")) {
				l = ViewPlotBean.view();
			} else {
				l = ViewPlotBean.viewByStatus(status);
			}
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
				<td><a href="update_plot.jsp?id=<%=vab.getId()%>">update</a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>