package com.example.facebook.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FaceBook
{
	@Id
	private int RegNo;
	private String name;
	private String Department;
	private String Email;
	public int getRegNo() {
		return RegNo;
	}
	public void setRegNo(int regNo) {
		RegNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
