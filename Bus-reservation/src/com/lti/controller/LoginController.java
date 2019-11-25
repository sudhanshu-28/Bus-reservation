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
public class LoginController {
	
	@Autowired
	PassengerService service;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam String email,@RequestParam String password)
	{
		Passenger incomingPassenger=new Passenger();
		incomingPassenger.setEmail(email);
		incomingPassenger.setPassword(password);
		
		Passenger p =service.login(incomingPassenger);
		
		ModelAndView model=null;
		if(p==null)
		{
			
			model=new ModelAndView("loginFailed");
			
		}
		else
		{
			model=new ModelAndView("loggedin");
			model.addObject("passenger", p);
		}
	
		return model;
	}

}
