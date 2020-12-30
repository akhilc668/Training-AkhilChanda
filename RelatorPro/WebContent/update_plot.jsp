<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body bgcolor="#E6E6FA">
	<br>
	<center>
		<h1>Welcome to Update Plot Page</h1>
		<br> <a href="employee_home.jsp">Home</a> | <a
			href="view_plot.jsp">View plot</a> | <a href="bought_plot.jsp">Sales
			Book</a> | <a href="./index.html">Logout</a>
	</center>
	<br>
	<%@page import="com.pojo.Plot,com.realtor.ViewPlotBean"%>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
	Plot p = ViewPlotBean.getById(id);
	String area = p.getArea();
	String size = area.substring(0, p.getArea().indexOf(" "));
	%>
	<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="./update_plot" method="post">
							<input type="hidden" name="id" value="<%=p.getId()%>">
							<div class="form-group">
								PlotNo: <input type="text" name="plotNo"
									value="<%=p.getPlotNo()%>" class="form-control">
							</div>
							<div class="form-group">
								OwnerName: <input type="text" name="ownerName"
									value="<%=p.getOwnerName()%>" class="form-control">
							</div>
							<div class="form-group">
								Email: <input type="email" name="email"
									value="<%=p.getEmail()%>" class="form-control">
							</div>
							<div class="form-group">
								Phone: <input type="number" name="phone"
									value="<%=p.getPhone()%>" class="form-control">
							</div>
							<div class="form-group">
								Area: <input type="number" name="area" value="<%=size%>"
									class="form-control">
							</div>
							<div class="form-group">
								Amount: <input type="number" name="amount"
									value="<%=p.getAmount()%>" class="form-control">
							</div>
							<div class="form-group">
								Venture: <input type="text" name="venture"
									value="<%=p.getVenture()%>" class="form-control">
							</div>
							<div class="form-group">
								Address: <input type="text" name="address"
									value="<%=p.getAddress()%>" class="form-control">
							</div>
							<div class="form-group">
								Status: <select name="status" class="form-control">
									<option value="<%=p.getStatus()%>"><%=p.getStatus()%></option>
									<option value="vacant">vacant</option>
									<option value="reserved">reserved</option>
									<option value="sold">sold</option>
								</select>
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