package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="bus_display")
public class BusDisplay {
	

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="display_seq")
	@SequenceGenerator(sequenceName="display_seq",name="display_seq",allocationSize=1)
	int bus_id;
	String bus_num;
	String bus_name;
	String source;
	String destination;
	String start_time;
	String end_time;
    int fare;
	public BusDisplay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusDisplay(int bus_id, String bus_num, String bus_name, String source, String destination, String start_time,
			String end_time, int fare) {
		super();
		this.bus_id = bus_id;
		this.bus_num = bus_num;
		this.bus_name = bus_name;
		this.source = source;
		this.destination = destination;
		this.start_time = start_time;
		this.end_time = end_time;
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "BusDisplay [bus_id=" + bus_id + ", bus_num=" + bus_num + ", bus_name=" + bus_name + ", source=" + source
				+ ", destination=" + destination + ", start_time=" + start_time + ", end_time=" + end_time + ", fare="
				+ fare + "]";
	}
	public int getBus_id() {
		return bus_id;
	}
	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}
	public String getBus_num() {
		return bus_num;
	}
	public void setBus_num(String bus_num) {
		this.bus_num = bus_num;
	}
	public String getBus_name() {
		return bus_name;
	}
	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	

}
