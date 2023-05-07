package com.PlacementManagementSystem.job;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JobPost {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String Company;
	private String	Role;
	private String 	Salary;
	private String 	Location;
	@Column(length=1000)
	private String Description;
	public JobPost() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobPost(int id, String company, String role, String salary, String location, String description) {
		super();
		this.id = id;
		Company = company;
		Role = role;
		Salary = salary;
		Location = location;
		Description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
}
