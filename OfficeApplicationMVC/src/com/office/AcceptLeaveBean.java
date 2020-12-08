package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AcceptLeaveBean {
	private String Mname;
	private int id;
	private int no_of_days;
	private int eid;
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNo_of_days() {
		return no_of_days;
	}
	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public boolean accept(String mname, int id, int no_of_days, int eid) throws Exception {
		Connection con=ConnectionEst.connecitvity();
		String sql = "update leaves set status=?,mname=? where lid=?";
		PreparedStatement ps = con.prepareStatement(sql);
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
				return true;
			else
				return false;
		}else
			return false;
		
	}
	
}
