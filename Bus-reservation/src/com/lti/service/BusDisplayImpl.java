package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.BusDisplay;
import com.lti.repository.BusDisplayRepo;




@Service("bdservice")
public class BusDisplayImpl implements BusDisplayService{

	@Autowired
	BusDisplayRepo repository;
	
	@Override
	@Transactional
	public BusDisplay addBus(BusDisplay bd) {
		return repository.addBus(bd);
	}

	@Transactional
	@Override
	public List<BusDisplay> findAllBuses(String source,String destination) {
		return repository.findAllBuses(source, destination);
	}

	@Override
	public BusDisplay findBusByBusNum(String bus_num) {
		return repository.findBusByBusNum(bus_num);
	}

}
