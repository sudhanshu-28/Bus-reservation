package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Passenger;
import com.lti.service.PassengerService;

@Controller
public class RegisterController {
	@Autowired
	PassengerService service;
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView addPassenger(@RequestParam String  pname,
	@RequestParam String password,
	@RequestParam String address,
	@RequestParam String gender,
	@RequestParam long contact,
	@RequestParam String email)
	{
		ModelAndView model=null;
		
		Passenger p=new Passenger();
		p.setPname(pname);
		p.setPassword(password);
		p.setAddress(address);
		p.setGender(gender);
		p.setContact(contact);
		p.setEmail(email);
		
		Passenger p1=service.addPassenger(p);
		
		if(p1!=null)
		{
			model=new ModelAndView("passengerAdded");
			model.addObject("passenger",p1);
		}
		else
		{
			model=new ModelAndView("registerFail");
			
		}
		
		return model;
		
	}

}
