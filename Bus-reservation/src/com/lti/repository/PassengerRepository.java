package com.lti.repository;

import com.lti.model.Passenger;

public interface PassengerRepository {
	
	public Passenger addPassenger(Passenger p);
	public Passenger findPassengerByEmail(String email);


}
