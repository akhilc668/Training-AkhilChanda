<%@page import="java.sql.* "%>
<%
	Connection con = null;
PreparedStatement ps = null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/kims";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url, username, password);
int pid = Integer.parseInt(request.getParameter("id"));
String dname=request.getParameter("dname");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
long mobile=Long.parseLong(phone);
String gender=request.getParameter("gender");
String specialization=request.getParameter("specialization");
int experiance=Integer.parseInt(request.getParameter("experiance"));
String address=request.getParameter("address");
String sql = "update doctor set dname=?,email=?,phone=?,gender=?,address=?,specialization=?,experiance=? where did=?";
ps = con.prepareStatement(sql);
ps.setString(1, dname);
ps.setString(2, email);
ps.setLong(3, mobile);
ps.setString(4, gender);
ps.setString(5, address);
ps.setString(6,specialization);
ps.setInt(7,experiance);
ps.setInt(8,pid);
int a = ps.executeUpdate();
if (a != 0)
	response.sendRedirect("doctor_profile.jsp?msg=updated sucessfully");
%>