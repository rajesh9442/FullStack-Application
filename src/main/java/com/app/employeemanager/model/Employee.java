package com.app.employeemanager.model;

import java.io.Serializable;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
public class Employee implements Serializable{
	@Id
	@Column(nullable=false,updatable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String jobTitle;
	private String imageUrl;
	private String employeeCode;
	
	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public Employee() {
		
	}
	
	public Employee(Long id, String name, String email, String jobTitle, String imageUrl) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.jobTitle = jobTitle;
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
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}

