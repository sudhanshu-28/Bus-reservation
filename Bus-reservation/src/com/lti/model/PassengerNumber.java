package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "passenger_number")
public class PassengerNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pn_seq")
	@SequenceGenerator(sequenceName = "pn_seq", name = "pn_seq", allocationSize = 1)
	int pnid;
	String name;
	String gender;
	
	@ManyToOne
    @JoinColumn(name="ticket_id")
    Ticket ticket;

	public PassengerNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassengerNumber(int pnid, String name, String gender, Ticket ticket) {
		super();
		this.pnid = pnid;
		this.name = name;
		this.gender = gender;
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "PassengerNumber [pnid=" + pnid + ", name=" + name + ", gender=" + gender + ", ticket=" + ticket + "]";
	}

	public int getPnid() {
		return pnid;
	}

	public void setPnid(int pnid) {
		this.pnid = pnid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
    
   

    

	
	}



	

	

