package com.ems.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long employeeid;
	
	private String firstname;
	private String lastname;
	private String email;
	
	public Employee() {
		
	}
	public Employee(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public Long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
