package com.lti.repository;


import java.util.List;

import com.lti.model.Bus;
import com.lti.model.Ticket;

public interface TicketRepository {


	public Ticket addTicket(Ticket t);
	public void updateTicket(int tid);
	public void deleteTicket(int tid);
	public List<Ticket> findAllTickets();
	
}
