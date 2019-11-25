package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Location;
import com.lti.repository.LocationRepository;


@Service("lservice")
public class LocationServiceImpl implements LocationService
{
	
	@Autowired
	LocationRepository repository;
	
	@Transactional
	public Location addLocation(Location l) {
		return repository.addLocation(l);
	}

	
	public void updateLocation(Location l) {
		// TODO Auto-generated method stub
		
	}


	public void deleteLocation(int lid) {
		repository.deleteLocation(lid);
		
	}

	@Override
	public List<Location> findAllLocations() {
		return	repository.findAllLocations();
	}


	@Override
	public Location findl(int id) {
		return repository.findl(id);
	}

 public Location findLocationBySource(String name)
 {
	 return repository.findLocationBySource(name);
 }
 
 public Location findLocationByDestination(String name)
 {
	 return repository.findLocationByDestination(name);
 }

	
}
