package com.motivity;

import java.util.Set;

public class Certification {
	private int id;
	private String name;
	private String duration;
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
