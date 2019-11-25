package com.lti.repository;

import java.util.List;

import com.lti.model.Bus;

public interface BusRepository {

	public Bus addBus(Bus b);
	public void updateBus(int bid);
	public void deleteBus(int bid);
	public List<Bus> findAllBuses();
	
	public Bus findBus(int bid);
}

