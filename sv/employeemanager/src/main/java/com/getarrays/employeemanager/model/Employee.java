package com.getarrays.employeemanager.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Employee implements Serializable{
	@Id
	@Column(nullable=false,updatable=false)
	private Long id;
	private String name;
	private String email;
	private String jobType;
	private String imageUrl;
	
	public Employee() {
		
	}
	
	public Employee(Long id, String name, String email, String jobType, String imageUrl) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.jobType = jobType;
		this.imageUrl = imageUrl;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getJobType() {
		return jobType;
	}
	
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}

