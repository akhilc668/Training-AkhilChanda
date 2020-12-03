<%@ include file="connect.jsp"%>
<%
String ename=request.getParameter("ename");
String email=request.getParameter("email");
String number=request.getParameter("phone");
long phone=Long.parseLong(number);
String gender=request.getParameter("gender");
int no_of_days=Integer.parseInt(request.getParameter("no_of_days"));
String date_of_leave=request.getParameter("date_of_leave");
String designation=request.getParameter("designation");
String sql="insert into leaves(ename,email,phone,gender,no_of_days,date_of_leave,designation) values(?,?,?,?,?,?,?)";
ps=con.prepareStatement(sql);
ps.setString(1, ename);
ps.setString(2, email);
ps.setLong(3,phone);
ps.setString(4,gender);
ps.setInt(5,no_of_days);
ps.setString(6, date_of_leave);
ps.setString(7, designation);
int a=ps.executeUpdate();
if(a!=0)
	response.sendRedirect("leave.jsp?msg=applied successfully");
%>