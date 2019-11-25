package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.model.BusRoute;
import com.lti.model.BusService;


@Repository("busserviceRepository")
public class BusServiceRepositoryImpl implements BusServiceRepository{


	@PersistenceContext
	EntityManager em;
	
	@Override
	public BusService addBusService(BusService bs) {
		em.persist(bs);
		return bs;
	}

	@Override
	public void updateBusService(BusService bs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBusService(int bs_id) {
		BusService bs=em.find(BusService.class,bs_id);
		em.merge(bs);
		em.remove(bs);
		
	}

	@Override
	public List<BusService> findAllBusService() {
		String q="Select bs from BusService bs";
		javax.persistence.TypedQuery<BusService> query=em.createQuery(q,BusService.class);
		List<BusService> li=query.getResultList();
		
		for(BusService bs:li)
		{
			System.out.println("\n\n----------"+bs);
		}
			
		
	return li;
	}

	@Override
	public BusService findbs(int bs_id) {
	  return em.find(BusService.class, bs_id);
	}

	
	public BusService findservice(int rid)
	{
		BusService service=new BusService();
		//int src_id=route.getSource().getId();
		//int dest_id=route.getDestination().getId();
		String q="select bs from BusService bs where route_id=?1";
		TypedQuery<BusService> query=em.createQuery(q,BusService.class);
		query.setParameter(1, rid);
		

		
		BusService serv=query.getSingleResult();
		return serv;
		
		
}
	
}
