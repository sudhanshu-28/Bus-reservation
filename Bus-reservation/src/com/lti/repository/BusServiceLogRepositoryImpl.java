package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.BusServiceLog;

@Repository("busservicelogRepository")
public class BusServiceLogRepositoryImpl implements BusServiceLogRepository {

	@PersistenceContext
	EntityManager em;

	@Override
	public BusServiceLog addBusServiceLog(BusServiceLog bsl) {
		em.persist(bsl);
		return bsl;
	}

	@Override
	public void updateBusServiceLog(BusServiceLog bsl) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBusServiceLog(int bsl_id) {
		BusServiceLog bsl = em.find(BusServiceLog.class, bsl_id);
		em.merge(bsl);
		em.remove(bsl);
	}

	@Override
	public List<BusServiceLog> findAllBusServiceLog() {
		String q = "Select bsl from BusServiceLog bsl";
		javax.persistence.TypedQuery<BusServiceLog> query = em.createQuery(q, BusServiceLog.class);
		List<BusServiceLog> li = query.getResultList();

		for (BusServiceLog bsl : li) {
			System.out.println("\n\n----------" + bsl);
		}

		return li;
	}

	@Override
	public BusServiceLog findbsl(int bsl_id) {
		return em.find(BusServiceLog.class, bsl_id);
	}

}
