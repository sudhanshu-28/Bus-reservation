package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Ticket;

@Repository("trepository")
public class TicketRepositoryImpl implements TicketRepository {

	@PersistenceContext
	EntityManager em;
	@Override
	public Ticket addTicket(Ticket t) {
		em.persist(t);
		return t;
	}

	@Override
	public void updateTicket(int tid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTicket(int tid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ticket> findAllTickets() {
		// TODO Auto-generated method stub
		return null;
	}

}
