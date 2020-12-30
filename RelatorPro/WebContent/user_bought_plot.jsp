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
<h1>Welcome to Bought plot Page</h1><br>
<a href="user_home.jsp">Home</a> |
<a href="update_user.jsp">Update User</a> |
<a href="available_plot.jsp">Available plot</a> |
<a href="user_bought_plot.jsp">Bought plot</a> |
<a href="index.html">Logout</a> 
</center>
<br>
<div class="container">
		<div class="row justify-content-center align-items-center">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="user_bought_plot.jsp">
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
	<div class="container-fulid">
<%@page import="com.pojo.Plot,com.realtor.ViewPlotBean,com.pojo.Sales,com.realtor.ViewSalesBean,java.util.*" %>
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
			<td><b>Plot Status</b></td>
			<td><b>paidAmount</b></td>
			<td><b>RemainingAmount</b></td>
			<td><b>paymentStatus</b></td>
			<td><b>Sales Status</b></td>
			<td><b>Action</b></td>
		</tr>
<%
int uid=(Integer)session.getAttribute("uid");
String paymentStatus=request.getParameter("paymentStatus");
List<Sales> l=null;
if (paymentStatus==null || paymentStatus.equals("select")) {
	l=ViewSalesBean.viewSalesByUser(uid);
} else {
	l = ViewSalesBean.search(uid,paymentStatus);
}
Iterator i=l.iterator();
while(i.hasNext()){
Sales vab=(Sales)i.next();
Plot p=ViewPlotBean.getById(vab.getPlotId());
%>
<tr>
			<td><%=p.getPlotNo() %></td>
			<td><%=p.getOwnerName() %></td>
			<td><%=p.getEmail() %></td>
			<td><%=p.getPhone() %></td>
			<td><%=p.getVenture() %></td>
			<td><%=p.getArea() %></td>
			<td><%=p.getAmount() %></td>
			<td><%=p.getAddress() %></td>
			<%if(p.getStatus().equals("reserved")||p.getStatus().equals("vacant")){ %>
			<td><%=p.getStatus() %></td>
			<%}else{ %>
			<td>Owned</td>
			<%} %>
			<td><%=vab.getPaidAmount()%></td>
			<td><%=vab.getRemainingAmount() %></td>
			<td><%=vab.getPaymentStatus() %></td>
			<td><%=vab.getStatus() %></td>
			<%if(vab.getPaymentStatus().equals("incomplete")&&vab.getStatus().equals("Accepted")){ %>
			<td><a href="./complete_payment.jsp?id=<%=vab.getId()%>&&remainingAmount=<%=vab.getRemainingAmount()%>">Complete Payment</a></td>
			<%}else if(vab.getStatus().equals("none")){ %>
			<td>Plot is still not reserved</td>
			<%}else{ %>
			<td>Accepted and updated</td>
			<%} %>
		</tr>
<%} %>
</table>
</div>
</body>
</html>