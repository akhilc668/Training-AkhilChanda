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
<table class="table table-bordered">
		<tr>
			<td>PlotNo</td>
			<td>OwnerName</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Venture</td>
			<td>Area</td>
			<td>amount</td>
			<td>Address</td>
			<td>Plot Status</td>
			<td>paidAmount</td>
			<td>RemainingAmount</td>
			<td>paymentStatus</td>
			<td>Sales Status</td>
			<td>Action</td>
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
			<%if(vab.getPaymentStatus().equals("incomplete")){ %>
			<td><a href="./complete_payment.jsp?id=<%=vab.getId()%>&&remainingAmount=<%=vab.getRemainingAmount()%>">Complete Payment</a></td>
			<%}else{ %>
			<td>Accepted and updated</td>
			<%} %>
		</tr>
<%} %>
</table>
</div>
</body>
</html>