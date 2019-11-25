package com.lti.repository;

import com.lti.model.BusDisplay;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository("bdrepository")

public class BusDisplayRepoImpl implements BusDisplayRepo{

	
	@PersistenceContext
	EntityManager em; 
	
	public BusDisplay addBus(BusDisplay bd) {
		em.persist(bd);
		return bd;
	}


	
	
	public List<BusDisplay> findAllBuses(String source,String destination)
	{
		//BusDisplay display=new BusDisplay();
		
		String q="select b from BusDisplay b where source=?1 and destination=?2";
		TypedQuery<BusDisplay> query=em.createQuery(q,BusDisplay.class);
		query.setParameter(1, source);
		query.setParameter(2, destination);

		
List<BusDisplay> l=query.getResultList();
		
		for(BusDisplay b:l)
		{
			System.out.println("\n\n----------"+b);
		}
		
		return l;
}




	@Override
	public BusDisplay findBusByBusNum(String bus_num) {
		String q="select bd from BusDisplay bd where bus_num=?1";
		TypedQuery<BusDisplay> query=em.createQuery(q,BusDisplay.class);
		query.setParameter(1, bus_num);
		
		
		BusDisplay r=query.getSingleResult();
		return r;
		
	}

}
