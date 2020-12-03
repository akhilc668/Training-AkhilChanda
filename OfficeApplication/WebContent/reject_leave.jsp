<%@include file="connect.jsp"%>
<%
	
int id = Integer.parseInt(request.getParameter("id"));
String sql = "update leaves set status=? where lid=?";
ps = con.prepareStatement(sql);
ps.setString(1, "Exceed the limit check and re-enter the leaves");
ps.setInt(2, id);
int a = ps.executeUpdate();
if (a != 0)
	response.sendRedirect("view_leave.jsp?msg=rejected");
%>