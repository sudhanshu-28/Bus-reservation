package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Fare;
import com.lti.repository.FareRepository;


@Service("fservice")
public class FareServiceImpl implements FareService{

	@Autowired
	FareRepository repository;
	

	
	@Override
	@Transactional
	public Fare addFare(Fare f) {
		return repository.addFare(f);
	}

	@Override
	public void updateFare(Fare f) {
		// TODO Auto-generated method stub
		
	}

}
