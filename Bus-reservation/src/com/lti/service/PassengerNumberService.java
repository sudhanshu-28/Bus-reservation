package com.lti.service;

import java.util.List;

import com.lti.model.PassengerNumber;

public interface PassengerNumberService {

	public PassengerNumber addPassengerNumber(PassengerNumber pn);

	public void updatePassengerNumber(PassengerNumber pn);

	public void deletePassengerNumber(int pnid);

	public List<PassengerNumber> findAllPassengerNumber();
}
