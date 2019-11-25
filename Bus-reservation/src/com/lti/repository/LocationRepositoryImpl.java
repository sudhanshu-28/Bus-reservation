package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Location;

@Repository("lrepository")
public class LocationRepositoryImpl implements LocationRepository
{
	
	
	@PersistenceContext
	EntityManager em;

	@Override
	public Location addLocation(Location l) 
	{
		
		em.persist(l);
		return l;
		
	}

	@Override
	public void updateLocation(Location l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLocation(int lid) {
		Location l=em.find(Location.class,lid);

		em.remove(l);
		
		
	}

	@Override
	public List<Location> findAllLocations() {
		String q="Select l from Location l";
		javax.persistence.TypedQuery<Location> query=em.createQuery(q,Location.class);
		List<Location> li=query.getResultList();
		
		for(Location l:li)
		{
			System.out.println("\n\n----------"+l);
		}
			/*System.out.println("in dao");
			String ql = " from Users";
			Query q = em.createQuery(ql);
			return q.getResultList();*/
		
	return li;
	}

	@Override
	public Location findl(int id) {
		return em.find(Location.class, id);
	}


	
	
	public Location findLocationBySource(String name)
	{
		String q="select l from Location  l where l.name=?1";
		TypedQuery<Location> query=em.createQuery(q,Location.class);
		query.setParameter(1, name);
		
		Location l=query.getSingleResult();
		return l;
	}	
	
	public Location findLocationByDestination(String name)
	{
		String q="select l from Location  l where l.name=?1";
		TypedQuery<Location> query=em.createQuery(q,Location.class);
		query.setParameter(1, name);
		
		Location l=query.getSingleResult();
		return l;
		
	}


}
