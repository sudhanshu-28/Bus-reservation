package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Bus;
import com.lti.model.Ticket;

import com.lti.repository.TicketRepository;

@Service("tservice")
public class TicketServiceImpl implements TicketService{

	@Autowired
	TicketRepository repository;
	
	
	@Transactional
	@Override
	public Ticket addTicket(Ticket t) {
		return repository.addTicket(t);
		
	}

	@Override
	public void updateTicket(Ticket t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTicket(Ticket t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bus> findAllBuses() {
		// TODO Auto-generated method stub
		return null;
	}

}
