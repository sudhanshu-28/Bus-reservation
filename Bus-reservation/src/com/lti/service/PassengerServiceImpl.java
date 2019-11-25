package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Passenger;

import com.lti.repository.PassengerRepository;

@Service("pservice")
public class PassengerServiceImpl implements PassengerService{

	@Autowired
	PassengerRepository repository;
	
	@Transactional
	public Passenger addPassenger(Passenger p) {
		
		return repository.addPassenger(p);
		
	}

	@Override
	public Passenger login(Passenger p) {
		Passenger passengerToBeReturned=null;
		Passenger pdb=repository.findPassengerByEmail(p.getEmail());
		
		if(pdb==null)
		{
			System.out.println("not found");
		}
		else if(pdb.getEmail().equals((p.getEmail()))&&(pdb.getPassword().equals(p.getPassword())))
		{
			       passengerToBeReturned=pdb;
		}
		else
		{
			
		}
		
		return passengerToBeReturned;
	
	}

}
