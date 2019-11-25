package com.lti.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name ="bus_service")
public class BusService {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bs_seq")
	@SequenceGenerator(sequenceName = "bs_seq", name = "bs_seq", allocationSize = 1)
	int bs_id;
	
	String start_time;
	String end_time;
	String status;


	@OneToOne
	@JoinColumn(name="route_id")  //again this is column of foreign key
	BusRoute route;
	
	@OneToMany(mappedBy="services",fetch = FetchType.EAGER)
	List<BusServiceLog> serviceLog;
	public BusService() {
		
	}
	public BusService(int bs_id, String start_time, String end_time, String status, BusRoute route,
			List<BusServiceLog> serviceLog) {
		super();
		this.bs_id = bs_id;
		this.start_time = start_time;
		this.end_time = end_time;
		this.status = status;
		this.route = route;
		this.serviceLog = serviceLog;
	}
	public int getBs_id() {
		return bs_id;
	}
	public void setBs_id(int bs_id) {
		this.bs_id = bs_id;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BusRoute getRoute() {
		return route;
	}
	public void setRoute(BusRoute route) {
		this.route = route;
	}
	public List<BusServiceLog> getServiceLog() {
		return serviceLog;
	}
	public void setServiceLog(List<BusServiceLog> serviceLog) {
		this.serviceLog = serviceLog;
	}
//	@Override
//	public String toString() {
//		return "BusService [bs_id=" + bs_id + ", start_time=" + start_time + ", end_time=" + end_time + ", status="
//				+ status + ", route=" + route + ", serviceLog=" + serviceLog + "]";
//	}
	
		
	


	
	
}
