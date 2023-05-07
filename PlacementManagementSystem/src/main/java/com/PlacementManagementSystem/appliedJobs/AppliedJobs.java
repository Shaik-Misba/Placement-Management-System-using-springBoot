package com.PlacementManagementSystem.appliedJobs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AppliedJobs {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int JobId;
	private String Company;
	private String Role;
	private String user;
	public AppliedJobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getJobId() {
		return JobId;
	}
	public void setJobId(int jobId) {
		JobId = jobId;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
	public AppliedJobs(int jobId, String company, String role, String user) {
		super();
		JobId = jobId;
		Company = company;
		Role = role;
		this.user = user;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
}
