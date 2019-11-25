package com.lti.service;

import java.util.List;

import com.lti.model.Bus;
import com.lti.model.Ticket;
public interface TicketService {
	
	public Ticket addTicket(Ticket t);
	public void updateTicket(Ticket t);
	public void deleteTicket(Ticket t);
	public List<Bus> findAllBuses();

}
