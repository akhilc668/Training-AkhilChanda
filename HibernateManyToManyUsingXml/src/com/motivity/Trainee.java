package com.motivity;

import java.util.Set;

public class Trainee {
	private int id;
	private String name;

	private Set<Certification> certification;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Certification> getCertification() {
		return certification;
	}

	public void setCertification(Set<Certification> certification) {
		this.certification = certification;
	}

}
