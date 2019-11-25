package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Passenger;


@Repository ("prepository")
public class PassengerRepositoryImpl implements PassengerRepository{

	@PersistenceContext
	EntityManager em;
	@Override
	public Passenger addPassenger(Passenger p) {
	
		em.persist(p);
		return p;
		
	}
	@Override
	public Passenger findPassengerByEmail(String email) {
		System.out.println("\n\n--Done with where clause with parameters");
		String q="Select p from Passenger p where p.email= ?1";
		javax.persistence.TypedQuery<Passenger> query=em.createQuery(q,Passenger.class);
		query.setParameter(1,email);
		Passenger p=query.getSingleResult();
		
		
		return p;
		
	}
	

}
