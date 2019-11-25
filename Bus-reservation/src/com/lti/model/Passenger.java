package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger {
	
	@Id @GeneratedValue
	int pid;
	String  pname;
	String password;
	String address;
	String gender;
	long contact;
	String email;
	public Passenger() {
		
	}
	public Passenger(int pid, String pname, String password, String address, String gender, long contact,
			String email) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.password = password;
		this.address = address;
		this.gender = gender;
		this.contact = contact;
		this.email = email;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", pname=" + pname + ", password=" + password + ", address=" + address
				+ ", gender=" + gender + ", contact=" + contact + ", email=" + email + "]";
	}
	

}
