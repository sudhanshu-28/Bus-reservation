package com.lti.model;


import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="bus_service_log")
public class BusServiceLog {


	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="log_seq")
	@SequenceGenerator(sequenceName="log_seq",name="log_seq",allocationSize=1)
	int bsl_id;
	
	@OneToOne
	@JoinColumn(name="bid")  //again this is column of foreign key
	Bus bus;

	LocalDate run_date;
	String actual_stime;
	String actual_etime;
	int seats_filled;
	String remark;
	
    @ManyToOne
    @JoinColumn(name="bs_id")
    BusService services;
   
	public BusServiceLog() {
		
	}
	public int getBsl_id() {
		return bsl_id;
	}
	public void setBsl_id(int bsl_id) {
		this.bsl_id = bsl_id;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	
	public LocalDate getRun_date() {
		return run_date;
	}
	public void setRun_date(LocalDate run_date) {
		this.run_date = run_date;
	}
	public String getActual_stime() {
		return actual_stime;
	}
	public void setActual_stime(String actual_stime) {
		this.actual_stime = actual_stime;
	}
	public String getActual_etime() {
		return actual_etime;
	}
	public void setActual_etime(String actual_etime) {
		this.actual_etime = actual_etime;
	}
	public int getSeats_filled() {
		return seats_filled;
	}
	public void setSeats_filled(int seats_filled) {
		this.seats_filled = seats_filled;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public BusService getServices() {
		return services;
	}
	public void setServices(BusService services) {
		this.services = services;
	}
//	@Override
//	public String toString() {
//		return "BusServiceLog [bsl_id=" + bsl_id + ", bus=" + bus + ", run_date=" + run_date + ", actual_stime="
//				+ actual_stime + ", actual_etime=" + actual_etime + ", seats_filled=" + seats_filled + ", remark="
//				+ remark + ", services=" + services + "]";
//	}
	public BusServiceLog(int bsl_id, Bus bus,LocalDate run_date, String actual_stime, String actual_etime,
			int seats_filled, String remark, BusService services) {
		super();
		this.bsl_id = bsl_id;
		this.bus = bus;
		this.run_date = run_date;
		this.actual_stime = actual_stime;
		this.actual_etime = actual_etime;
		this.seats_filled = seats_filled;
		this.remark = remark;
		this.services = services;
	}
	

	

}
