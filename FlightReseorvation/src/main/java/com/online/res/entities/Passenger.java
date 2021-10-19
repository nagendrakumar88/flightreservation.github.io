package com.online.res.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Passenger")
public class Passenger extends AbstractEntity{
	
	private String firstName;
	
	private String lastname;
	
	private String middelName;
	
	private String email;
	
	private String phone;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddelName() {
		return middelName;
	}

	public void setMiddelName(String middelName) {
		this.middelName = middelName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
