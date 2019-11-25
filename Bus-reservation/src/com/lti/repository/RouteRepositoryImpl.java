package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.BusRoute;
import com.lti.model.Location;

@Repository("routeRepository")
public class RouteRepositoryImpl implements RouteRepository
{
	@PersistenceContext
	EntityManager em;

	@Transactional
	@Override
	public BusRoute addRoute(BusRoute r) {
		r=em.merge(r);
		em.persist(r);
		return r;
	}

	@Override
	public void updateRoute(BusRoute r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRoute(BusRoute r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BusRoute findRouteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BusRoute> findAllRoutes() {
	
			String q="Select r from BusRoute r";
			javax.persistence.TypedQuery<BusRoute> query=em.createQuery(q,BusRoute.class);
			List<BusRoute> li=query.getResultList();
			
			for(BusRoute r:li)
			{
				System.out.println("\n\n----------"+r);
			}
	
			return li;

}

	@Override
	public BusRoute findr(int Route_id) {
		return em.find(BusRoute.class, Route_id);
	}
	
	public BusRoute findRouteId(int src,int dest)
	{
		BusRoute route=new BusRoute();
		//int src_id=route.getSource().getId();
		//int dest_id=route.getDestination().getId();
		String q="select r from BusRoute r where source_id=?1 and destination_id=?2";
		TypedQuery<BusRoute> query=em.createQuery(q,BusRoute.class);
		query.setParameter(1, src);
		query.setParameter(2, dest);

		
		BusRoute r=query.getSingleResult();
		return r;
		
		
}
	
	

	
	
}
