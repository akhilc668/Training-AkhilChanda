<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<a href="employee_home.jsp">Home</a> |
<a href="view_plot.jsp">View plot</a> |
<a href="./index.html">Logout</a>
</center>
<br><br><br>
<%@page import="com.pojo.Plot,com.realtor.ViewPlotBean"%>
<%
int id=Integer.parseInt(request.getParameter("id"));
Plot p=ViewPlotBean.getById(id); %>
<form action="./update_plot" method="post" align="center">
<input type="hidden" name="id" value="<%=p.getId()%>">
PlotNo: <input type="text" name="plotNo" value="<%=p.getPlotNo()%>"><br><br>
OwnerName: <input type="text" name="ownerName" value="<%=p.getOwnerName()%>"><br><br>
Email: <input type="email" name="email" value="<%=p.getEmail()%>"><br><br>
Phone: <input type="number" name="phone" value="<%=p.getPhone()%>"><br><br>
Amount: <input type="number" name="amount" value="<%=p.getAmount()%>"><br><br>
Venture: <input type="text" name="venture" value="<%=p.getVenture()%>"><br><br>
Address: <textarea rows="5" cols="10" name="address"><%=p.getAddress()%></textarea><br><br>
Status: <select name="status">
<option value="<%=p.getStatus()%>"><%=p.getStatus()%></option>
<option value="vacant">vacant</option>
<option value="reserved">reserved</option>
<option value="sold">sold</option>
</select>
<input type="submit" value="update">
</form>
</body>
</html>