package com.lti.repository;

import com.lti.model.Fare;

public interface FareRepository {

	public Fare addFare(Fare f);
	public void updateFare(int fid);
}
