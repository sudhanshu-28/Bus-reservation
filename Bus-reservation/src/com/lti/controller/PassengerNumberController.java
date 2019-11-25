package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Location;
import com.lti.model.PassengerNumber;
import com.lti.model.Ticket;
import com.lti.service.PassengerNumberService;

@Controller
public class PassengerNumberController 
{

	@Autowired
	PassengerNumberService service;

	@RequestMapping(value = "/addPassengerc", method = RequestMethod.POST)
	public ModelAndView addPassengerNumber(@RequestParam String name, @RequestParam String gender,@RequestParam int ticket_id) 
	{
		ModelAndView model = null;

		Ticket ticket=new Ticket();
		ticket.setTicket_id(ticket_id);
		
		PassengerNumber pn = new PassengerNumber();
		pn.setName(name);
		pn.setGender(gender);
		pn.setTicket(ticket);

		PassengerNumber pn1 = service.addPassengerNumber(pn);

		if (pn1 != null) 
		{
			model = new ModelAndView("passengerNumberAdded");
			model.addObject("passengerNumber", pn1);
		} 
		else 
		{
			model = new ModelAndView("passengerNumberFail");

		}

		return model;

	}
	
	/*@RequestMapping(value = "/deletePassengerNumber", method = RequestMethod.POST)
	public ModelAndView deletePassengerNumber(@RequestParam int pnid) 
	{

		PassengerNumber pn1 = new PassengerNumber();
		pn1.setPnid(pnid);
		ModelAndView model = null;

		service.deletePassengerNumber(pnid);

		System.out.println("Deleted");

		return model;
	}*/

}
