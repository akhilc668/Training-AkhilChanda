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
		<h1>Welcome to Sales Book Page</h1>
		<br> <br> <a href="employee_home.jsp">Home</a> | <a
			href="employee_update.jsp">Update employee</a> | <a
			href="view_plot.jsp">View plot</a> | <a href="bought_plot.jsp">Sales
			Book</a> | <a href="./index.html">Logout</a>
	</center>
	<br>
	<div class="container">
		<div class="row justify-content-center align-items-center">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="bought_plot.jsp">
							<div class="form-group">
								By PaymentStatus: <select name="paymentStatus"
									class="form-control">
									<option value="select">Select</option>
									<option value="completed">Completed</option>
									<option value="incomplete">Incomplete</option>
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

		<%@page
			import="com.pojo.Plot,com.realtor.ViewPlotBean,com.pojo.Sales,com.realtor.ViewSalesBean,java.util.*"%>
		<table class="table table-bordered table-light">
			<tr class="table-success">
				<td><b>plotId</td>
				<td><b>OwnerName</b></td>
				<td><b>BuyerName</b></td>
				<td><b>BuyerPhone</b></td>
				<td><b>paidAmount</b></td>
				<td><b>RemainingAmount</b></td>
				<td><b>paymentStatus</b></td>
				<td><b>Status</b></td>
				<td><b>Plot Status</b></td>
				<td><b>Action</b></td>
			</tr>
			<%
				String paymentStatus = request.getParameter("paymentStatus");
			List<Sales> l = null;
			if (paymentStatus == null || paymentStatus.equals("select")) {
				l = ViewSalesBean.viewSales();
			} else {
				l = ViewSalesBean.viewSalesByPaymentStatus(paymentStatus);
			}
			Iterator i = l.iterator();
			while (i.hasNext()) {
				Sales vab = (Sales) i.next();
				Plot p = ViewPlotBean.getById(vab.getPlotId());
			%>
			<tr>
				<td><%=vab.getPlotId()%></td>
				<td><%=vab.getOwnerName()%></td>
				<td><%=vab.getBuyerName()%></td>
				<td><%=vab.getbPhone()%></td>
				<td><%=vab.getPaidAmount()%></td>
				<td><%=vab.getRemainingAmount()%></td>
				<td><%=vab.getPaymentStatus()%></td>
				<td><%=vab.getStatus()%></td>
				<td><%=p.getStatus()%></td>
				<%
					if (vab.getRemainingAmount() >= 0 && (p.getStatus().equals("reserved") || p.getStatus().equals("vacant"))) {
				%>
				<td><a href="./sales_book?id=<%=vab.getId()%>">Accept and
						update plot</a></td>
				<%
					} else {
				%>
				<td>Accepted and updated</td>
				<%
					}
				%>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>