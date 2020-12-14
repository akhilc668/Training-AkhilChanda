package com.kims;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PatientRegisterBean {
	private int id;
	private String pname;
	private String password;
	private String email;
	private String phone;
	private String gender;
	private String address;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean register(String pname, String password, String email, String phone, String gender, String address) throws Exception {
		Connection con=ConnectionEst.connecitvity();
		String sql="insert into patient(pname,password,email,phone,gender,address) values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, pname);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setString(4, phone);
		ps.setString(5,gender);
		ps.setString(6, address);
		int a=ps.executeUpdate();
		if(a!=0)
			return true;
		else
			return false;
	}
}
