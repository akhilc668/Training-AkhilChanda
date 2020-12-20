<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<h1>Welcome to Add Plot Page</h1><br><br>
<a href="admin_home.jsp">Home</a> |
<a href="employee_register.jsp">Employee Register</a> |
<a href="add_plot.jsp">Add plot</a> |
<a href="./index.html">Logout</a>
</center>
<br><br><br>
<form action="./add_plot" method="post" align="center">
PlotNo: <input type="text" name="plotNo"><br><br>
OwnerName: <input type="text" name="ownerName"><br><br>
Email: <input type="email" name="email"><br><br>
Phone: <input type="number" name="phone"><br><br>
Amount: <input type="number" name="amount"><br><br>
Venture: <input type="text" name="venture"><br><br>
Address: <textarea rows="5" cols="10" name="address"></textarea><br><br>
<input type="submit" value="Add">
</form>
</body>
</html>