<%@include file="connect.jsp" %>
<%
int pid = Integer.parseInt(request.getParameter("id"));
String dname=request.getParameter("dname");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
String gender=request.getParameter("gender");
String specialization=request.getParameter("specialization");
int experiance=Integer.parseInt(request.getParameter("experiance"));
String address=request.getParameter("address");
String sql = "update doctor set dname=?,email=?,phone=?,gender=?,address=?,specialization=?,experiance=? where did=?";
ps = con.prepareStatement(sql);
ps.setString(1, dname);
ps.setString(2, email);
ps.setString(3,phone);
ps.setString(4, gender);
ps.setString(5, address);
ps.setString(6,specialization);
ps.setInt(7,experiance);
ps.setInt(8,pid);
int a = ps.executeUpdate();
if (a != 0)
	response.sendRedirect("doctor_profile.jsp?msg=updated sucessfully");
%>