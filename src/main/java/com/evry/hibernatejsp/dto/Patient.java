package com.evry.hibernatejsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	private String pname;
	private int age;
	private String bloodGroup;
	private String doctors;
	private String  tests;
	
	public Patient() {
		
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getCheckUp() {
		return doctors;
	}

	public void setDoctors(String doctors) {
		this.doctors = doctors;
	}

	public String getTests() {
		return tests;
	}

	public void setTests(String tests) {
		this.tests = tests;
	}

	
	
}
