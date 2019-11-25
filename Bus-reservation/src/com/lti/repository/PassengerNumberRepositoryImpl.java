package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.PassengerNumber;

@Repository("passengerNumberRepository")
public class PassengerNumberRepositoryImpl implements PassengerNumberRepository {

	@PersistenceContext
	EntityManager em;

	@Override
	public PassengerNumber addPassengerNumber(PassengerNumber pn) {
		em.persist(pn);
		return pn;
	}

	@Override
	public void updatePassengerNumber(PassengerNumber pn) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePassengerNumber(int pnid) {
		PassengerNumber pn = em.find(PassengerNumber.class, pnid);
		em.merge(pn);
		em.remove(pn);

	}

	@Override
	public List<PassengerNumber> findAllPassengerNumber() {
		String q = "Select pn from PassengerNumber pn";
		javax.persistence.TypedQuery<PassengerNumber> query = em.createQuery(q, PassengerNumber.class);
		List<PassengerNumber> l = query.getResultList();

		for (PassengerNumber pn : l) {
			System.out.println("\n\n----------" + pn);
		}
		/*
		 * System.out.println("in dao"); String ql = " from Users"; Query q =
		 * em.createQuery(ql); return q.getResultList();
		 */

		return l;
	}

}
