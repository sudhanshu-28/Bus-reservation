package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Fare {
	

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="bus_seq")
	@SequenceGenerator(sequenceName="fare_seq",name="fare_seq",allocationSize=1)
	int fid;
	int final_fare;
	@OneToOne
	@JoinColumn(name="bid")  //again this is column of foreign key
	Bus bus;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getFinal_fare() {
		return final_fare;
	}
	public void setFinal_fare(int final_fare) {
		this.final_fare = final_fare;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	@Override
	public String toString() {
		return "Fare [fid=" + fid + ", final_fare=" + final_fare + ", bus=" + bus + "]";
	}
	public Fare(int fid, int final_fare, Bus bus) {
		super();
		this.fid = fid;
		this.final_fare = final_fare;
		this.bus = bus;
	}
	public Fare() {
		super();
		// TODO Auto-generated constructor stub
	}


}
