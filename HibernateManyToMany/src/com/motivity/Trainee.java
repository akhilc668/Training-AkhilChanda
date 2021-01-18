package com.motivity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="trainee1")
public class Trainee {
	@Id
	@Column(name = "tid")
	private int id;
	@Column(name="tname")
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
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
