<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<a href="user_home.jsp">Home</a> |
<a href="available_plot.jsp">Available plot</a> |
<a href="index.html">Logout</a> 
</center>
<br><br><br>
<%@page import="com.pojo.Plot,com.pojo.User,com.realtor.ViewPlotBean" %>
<%User u=(User)session.getAttribute("user");
int id=Integer.parseInt(request.getParameter("pid"));
Plot p=ViewPlotBean.getById(id);
if(p!=null&&u!=null){
%>
<form action="./buy_plot" method="post" align="center">
<input type="hidden" name="plotId" value="<%=p.getId()%>">
OwnerName:<input type="text" name="ownerName" value="<%=p.getOwnerName()%>"><br><br>
BuyerName: <input type="text" name="buyerName" value="<%=u.getUname()%>"><br><br>
BuyerPhone: <input type="number" name="bPhone" value="<%=u.getPhone()%>"><br><br>
Amount to pay: <input type="number" name="paidAmount"><br><br>
<input type="hidden" name="uid" value="<%=u.getId()%>">
<input type="submit" value="Buy">
</form>
<%} %>
</body>
</html>