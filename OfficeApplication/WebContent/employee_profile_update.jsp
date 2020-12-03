<%@include file="connect.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
String ename=request.getParameter("ename");
String email=request.getParameter("email");
String number=request.getParameter("phone");
long phone=Long.parseLong(number);
String gender=request.getParameter("gender");
String address=request.getParameter("address");
String designation=request.getParameter("designation");
int experience=Integer.parseInt(request.getParameter("experience"));
String sql="update employee set ename=?,email=?,phone=?,gender=?,address=?,designation=?,experience=? where eid=?";
ps=con.prepareStatement(sql);
ps.setString(1,ename);
ps.setString(2,email);
ps.setLong(3, phone);
ps.setString(4,gender);
ps.setString(5,address);
ps.setString(6,designation);
ps.setInt(7, experience);
ps.setInt(8, id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("./employee_profile.jsp?msg=updated sucessfully");
else
	response.sendRedirect("./update_employee_profile.jsp?id="+id+"msg=update failed");
%>