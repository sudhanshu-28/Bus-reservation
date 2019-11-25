package com.lti.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Bus;
import com.lti.repository.BusRepository;

@Service("bservice")
public class BusServiceImpl implements BusService1 {

	@Autowired
	BusRepository repository;
	@Override
	
	@Transactional
	public Bus addBus(Bus b) {
		return repository.addBus(b);
	}

	@Override
	public void updateBus(int bid) {
		// TODO Auto-generated method stub
		
	}
   @Transactional
	@Override
	public void deleteBus(int bid) {
		repository.deleteBus(bid);
		
	}

	@Override
	public List<Bus> findAllBuses() {
	return	repository.findAllBuses();
		
	}

	@Override
	public Bus findBus(int bid) {
		return repository.findBus(bid);
	}

	
}
