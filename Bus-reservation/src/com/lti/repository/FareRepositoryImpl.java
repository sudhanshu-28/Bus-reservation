package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Fare;

@Repository("frepository")
public class FareRepositoryImpl implements FareRepository{

	@PersistenceContext
	EntityManager em;
	@Override
	public Fare addFare(Fare f) {
		em.persist(f);
		return f;
	}

	@Override
	public void updateFare(int fid) {
		// TODO Auto-generated method stub
		
	}

}
