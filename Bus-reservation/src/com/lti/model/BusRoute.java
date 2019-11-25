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
@Table(name="bus_route")
public class BusRoute {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "route_seq")
	@SequenceGenerator(sequenceName = "route_seq", name = "route_seq", allocationSize = 1)
	int Route_id;
	
	float fare;
	int distance;
	

	@ManyToOne
	@JoinColumn(name="source_id")  //again this is column of foreign key
	Location source;
	

	@ManyToOne
	@JoinColumn(name="destination_id")  //again this is column of foreign key
	Location destination;


	public BusRoute() {
		
	}


	public BusRoute(int route_id, float fare, int distance, Location source, Location destination) {
		super();
		Route_id = route_id;
		this.fare = fare;
		this.distance = distance;
		this.source = source;
		this.destination = destination;
	}


	public int getRoute_id() {
		return Route_id;
	}


	public void setRoute_id(int route_id) {
		Route_id = route_id;
	}


	public float getFare() {
		return fare;
	}


	public void setFare(float fare) {
		this.fare = fare;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	public Location getSource() {
		return source;
	}


	public void setSource(Location source) {
		this.source = source;
	}


	public Location getDestination() {
		return destination;
	}


	public void setDestination(Location destination) {
		this.destination = destination;
	}


	@Override
	public String toString() {
		return "BusRoute [Route_id=" + Route_id + ", fare=" + fare + ", distance=" + distance + ", source=" + source
				+ ", destination=" + destination + "]";
	}
	
	

}
