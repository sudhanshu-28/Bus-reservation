package com.lti.repository;

import java.util.List;

import com.lti.model.BusDisplay;


public interface BusDisplayRepo {
	
	public BusDisplay addBus(BusDisplay bd);
	public List<BusDisplay> findAllBuses(String source,String destination);
    public BusDisplay findBusByBusNum(String bus_num);

}
