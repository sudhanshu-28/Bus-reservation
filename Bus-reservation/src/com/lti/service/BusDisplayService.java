package com.lti.service;
import com.lti.model.BusDisplay;
import java.util.List;



public interface BusDisplayService {
	
	public BusDisplay addBus(BusDisplay bd);
	public List<BusDisplay> findAllBuses(String source,String destination);
    public BusDisplay findBusByBusNum(String bus_num);


}
