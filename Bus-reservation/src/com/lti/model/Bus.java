package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Bus {

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="bus_seq")
	@SequenceGenerator(sequenceName="bus_seq",name="bus_seq",allocationSize=1)
	int bid;
	String bus_num;
	
	String bus_type;
	int max_seats;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBus_num() {
		return bus_num;
	}
	public void setBus_num(String bus_num) {
		this.bus_num = bus_num;
	}
	public String getBus_type() {
		return bus_type;
	}
	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}
	public int getMax_seats() {
		return max_seats;
	}
	public void setMax_seats(int max_seats) {
		this.max_seats = max_seats;
	}
	@Override
	public String toString() {
		return "Bus [bid=" + bid + ", bus_num=" + bus_num + ", bus_type=" + bus_type + ", max_seats=" + max_seats + "]";
	}
	public Bus(int bid, String bus_num, String bus_type, int max_seats) {
		super();
		this.bid = bid;
		this.bus_num = bus_num;
		this.bus_type = bus_type;
		this.max_seats = max_seats;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

}