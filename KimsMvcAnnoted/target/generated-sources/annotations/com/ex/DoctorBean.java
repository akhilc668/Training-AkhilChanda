package com.ex;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class DoctorBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="did")
	private int id;
	@Column(name="dname")
	private String dname;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	@Column(name="gender")
	private String gender;
	@Column(name="specialization")
	private String specialization;
	@Column(name="experiance")
	private int experiance;
	@Column(name="address")
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
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
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
