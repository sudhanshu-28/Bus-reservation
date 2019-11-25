package com.lti.repository;

import java.util.List;

import com.lti.model.Location;


public interface LocationRepository {
	
	public Location addLocation(Location l);
	public void updateLocation(Location l);
	public void deleteLocation(int lid);
	public List<Location> findAllLocations();
	public Location findl(int id);
	public Location findLocationBySource(String name);
    public Location findLocationByDestination(String name);


}
