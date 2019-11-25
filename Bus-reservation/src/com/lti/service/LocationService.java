package com.lti.service;

import java.util.List;

import com.lti.model.Location;

public interface LocationService {

	public Location addLocation(Location l);
	public void updateLocation(Location l);
	public void deleteLocation(int lid);
	public List<Location> findAllLocations();
	public Location findl(int id);
	
	public Location findLocationBySource(String name);
    public Location findLocationByDestination(String name);
}
