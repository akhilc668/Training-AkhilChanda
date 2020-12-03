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
int no_of_leaves_taken=Integer.parseInt(request.getParameter("no_of_leaves_taken"));
String sql="update employee set ename=?,email=?,phone=?,gender=?,address=?,designation=?,experience=?,no_of_leaves_taken=? where eid=?";
ps=con.prepareStatement(sql);
ps.setString(1,ename);
ps.setString(2,email);
ps.setLong(3, phone);
ps.setString(4,gender);
ps.setString(5,address);
ps.setString(6,designation);
ps.setInt(7, experience);
ps.setInt(8,no_of_leaves_taken);
ps.setInt(9, id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("./employee_profile.jsp?msg=updated sucessfully");
else
	response.sendRedirect("./update_employee_profile.jsp?id="+id+"msg=update failed");
%>