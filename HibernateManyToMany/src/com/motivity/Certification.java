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
@Table(name = "certification1")
public class Certification {
	@Id
	@Column(name = "cid")
	private int id;
	@Column(name = "cname")
	private String name;
	@Column(name = "duration")
	private String duration;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "certification")
	private Set<Trainee> trainees;
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
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Set<Trainee> getTrainees() {
		return trainees;
	}
	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}
}
