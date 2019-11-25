package com.lti.service;

import java.util.List;

import com.lti.model.BusService;

public interface BusServiceservice {
	public BusService addBusService(BusService bs);

	public void updateBusService(BusService bs);

	public void deleteBusService(int bs_id);

	public List<BusService> findAllBusService();
	
	public BusService findbs(int bs_id);
}
