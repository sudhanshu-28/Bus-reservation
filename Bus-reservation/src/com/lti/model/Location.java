package com.lti.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loc_seq")
	@SequenceGenerator(sequenceName = "loc_seq", name = "loc_seq", allocationSize = 1)
	int id;
	String name;
	
	@OneToMany(mappedBy="source")
	List<BusRoute> busroute;
	
	@OneToMany(mappedBy="destination")
	List<BusRoute> busroute1;

	public Location() {

	}

	public Location(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", name=" + name + "]";
	}

}
