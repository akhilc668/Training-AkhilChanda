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
String pname = request.getParameter("pname");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
long mobile = Long.parseLong(phone);
String gender = request.getParameter("gender");
String address = request.getParameter("address");
String sql = "update patient set pname=?,email=?,phone=?,gender=?,address=? where pid=?";
ps = con.prepareStatement(sql);
ps.setString(1, pname);
ps.setString(2, email);
ps.setLong(3, mobile);
ps.setString(4, gender);
ps.setString(5, address);
ps.setInt(6,pid);
int a = ps.executeUpdate();
if (a != 0)
	response.sendRedirect("patient_profile.jsp?msg=updated sucessfully");
%>