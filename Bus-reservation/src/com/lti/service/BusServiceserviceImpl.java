package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.BusService;
import com.lti.repository.BusServiceRepository;

@Service("busserviceService")
public class BusServiceserviceImpl implements BusServiceservice {

	@Autowired
	BusServiceRepository repository;
	
	@Transactional
	public BusService addBusService(BusService bs) {
		return repository.addBusService(bs);
	}

	@Transactional
	public void updateBusService(BusService bs) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteBusService(int bs_id) {
		repository.deleteBusService(bs_id);
	}
	
	@Transactional
	public List<BusService> findAllBusService() {
		return	repository.findAllBusService();
	}

	@Override
	public BusService findbs(int bs_id) {
		return repository.findbs(bs_id);
	}

}
