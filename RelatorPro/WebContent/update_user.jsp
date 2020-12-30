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
<h1>Welcome to User Update Page</h1><br>
<a href="user_home.jsp">Home</a> |
<a href="update_user.jsp">Update User</a> |
<a href="available_plot.jsp">Available plot</a> |
<a href="user_bought_plot.jsp">Bought plot</a> |
<a href="index.html">Logout</a> 
</center>
<br>
<%@page import="com.pojo.User"%>
<%
User p=(User)session.getAttribute("user");
%>
<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="./update_user" method="post">
							<input type="hidden" name="id" value="<%=p.getId()%>"> 
							<div class="form-group">
								User name: <input type="text" class="form-control"
									name="uname" value="<%=p.getUname()%>">
							</div>
							<div class="form-group">
								Email: <input type="email" class="form-control" name="email"
									value="<%=p.getEmail()%>">
							</div>
							<div class="form-group">
								phone: <input type="number" class="form-control" name="phone"
									value="<%=p.getPhone()%>">
							</div>
							<div class="form-group">
								<%
									if (p.getGender().equals("Male")) {
								%>
								Gender:<br> <input type="radio" name="gender" value="Male"
									checked="checked">Male <input type="radio"
									name="gender" value="Female">Female
								<%
 	} else {
 %>
								Gender: <input type="radio" name="gender" value="Male">Male
								<input type="radio" name="gender" value="Female"
									checked="checked">Female
								<%
 	}
 %>
							</div>
							<div class="form-group">
								Address: <input type="text" class="form-control" name="address"
									value="<%=p.getAddress()%>">
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