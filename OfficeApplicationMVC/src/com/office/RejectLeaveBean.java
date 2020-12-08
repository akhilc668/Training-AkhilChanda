package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RejectLeaveBean {
 private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public boolean reject(int id) throws Exception {
	Connection con=ConnectionEst.connecitvity();
	String sql = "update leaves set status=? where lid=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, "Exceed the limit check and re-enter the leaves");
	ps.setInt(2, id);
	int a = ps.executeUpdate();
	if (a != 0)
		return true;
	else
		return false;
}
 
}
