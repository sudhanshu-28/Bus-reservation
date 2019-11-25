package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.PassengerNumber;
import com.lti.repository.PassengerNumberRepository;

@Service("passengerNumberService")
public class PassengerNumberServiceImpl implements PassengerNumberService {

	@Autowired
	PassengerNumberRepository repository;

	@Transactional
	@Override
	public PassengerNumber addPassengerNumber(PassengerNumber pn) {
		return repository.addPassengerNumber(pn);
	}

	@Override
	public void updatePassengerNumber(PassengerNumber pn) {
		// TODO Auto-generated method stub

	}

	@Transactional
	@Override
	public void deletePassengerNumber(int pnid) {
		repository.deletePassengerNumber(pnid);

	}

	@Transactional
	@Override
	public List<PassengerNumber> findAllPassengerNumber() {
		return repository.findAllPassengerNumber();
	}

}
