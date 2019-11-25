package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.BusServiceLog;
import com.lti.model.PassengerNumber;
import com.lti.model.Ticket;
import com.lti.service.BusServiceLogService;
import com.lti.service.TicketService;
import com.lti.util.DateWorker;

@Controller
public class AddTicketController {

	@Autowired
	BusServiceLogService service;
	
	@Autowired
	TicketService servicet;
	
	@RequestMapping(value="/addTicket",method=RequestMethod.POST)
	public ModelAndView addTicket(@RequestParam String ticket_date,@RequestParam int no_of_passenger, @RequestParam int bsl_id
)

	{
		ModelAndView model=null;
	
		
		Ticket ticket=new Ticket();
		
		BusServiceLog bslog=service.findbsl(bsl_id);
		ticket.setBslog(bslog);
	
	//BusServiceLog bslog=new BusServiceLog();
	//bslog.setBsl_id(bsl_id);
	
	
		
		
		
		
		ticket.setNo_of_passenger(no_of_passenger);
		ticket.setTicket_date(DateWorker.formatDate(ticket_date));
		
		
		System.out.println(ticket);
	
        Ticket t1=servicet.addTicket(ticket);
		
        System.out.println(t1);
        
		if(t1!=null)
		{
			model=new ModelAndView("ticketAdded");
			model.addObject("tickets",t1);
		}
		else
		{
			model=new ModelAndView("ticketaddingfailed");
			
		}
		
		
		return model;
		
	}
}
