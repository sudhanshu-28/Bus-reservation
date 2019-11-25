package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.model.Bus;

@Repository("brepository")
public class BusRepositoryImpl implements BusRepository{
	 @PersistenceContext
		EntityManager em; 
	@Override
	public Bus addBus(Bus b) {
		em.persist(b);
		return b;
	}

	@Override
	public void updateBus(int bid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBus(int bid) {
		Bus b=em.find(Bus.class,bid);
		em.merge(bid);
		em.remove(b);
		
	}
	
	

	@Override
	public List<Bus> findAllBuses() {
		

		String q="Select b from Bus b";
		javax.persistence.TypedQuery<Bus> query=em.createQuery(q,Bus.class);
		List<Bus> l=query.getResultList();
		
		for(Bus b:l)
		{
			System.out.println("\n\n----------"+b);
		}
			/*System.out.println("in dao");
			String ql = " from Users";
			Query q = em.createQuery(ql);
			return q.getResultList();*/
		
	return l;

	}

	@Override
	public Bus findBus(int bid) {
		return em.find(Bus.class, bid);
	}
}	
