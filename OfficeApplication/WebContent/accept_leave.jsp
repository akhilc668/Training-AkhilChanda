<%@include file="connect.jsp"%>
<%
String mname=(String) session.getAttribute("mname");
int id=Integer.parseInt(request.getParameter("id"));
int no_of_days=Integer.parseInt(request.getParameter("no_of_days"));
int eid=Integer.parseInt(request.getParameter("eid"));
System.out.println(no_of_days+" "+eid);
String sql = "update leaves set status=?,mname=? where lid=?";
ps = con.prepareStatement(sql);
ps.setString(1, "Accepted");
ps.setString(2, mname);
ps.setInt(3, id);
int a = ps.executeUpdate();
if (a != 0){
	sql = "update employee set no_of_leaves_taken=no_of_leaves_taken+? where eid=?";
	ps = con.prepareStatement(sql);
	ps.setInt(1, no_of_days);
	ps.setInt(2, eid);
	a = ps.executeUpdate();
	if (a != 0)
		response.sendRedirect("view_leave.jsp?msg=accepted");
}
%>