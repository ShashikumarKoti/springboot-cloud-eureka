package com.example.demo.entity;

import org.springframework.stereotype.Service;

@Service
public class Users {

	private String fname;
	private String lname;
	private String city;
	
	
	public Users() {
		
	}
	public Users(String fname, String lname, String city) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.city = city;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
