package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.lti.model.Bus;
import com.lti.model.Fare;
import com.lti.service.FareService;

@Controller
public class AddFareController {
	
	@Autowired
	FareService service;

	@RequestMapping(value="/addFare",method=RequestMethod.POST)
	public ModelAndView addFare(
	@RequestParam int final_fare,@RequestParam int bid)

	{
		ModelAndView model=null;
		
		Bus b=new Bus();
		b.setBid(bid);
	
		
	    Fare fare=new Fare();
		fare.setFinal_fare(final_fare);
		fare.setBus(b);
		
		Fare fare1 = service.addFare(fare);
		if(fare1!= null)
		{ 
			model=new ModelAndView("fareadded");
			model.addObject("fare",fare1);
		}
		else
		{
			model=new ModelAndView("fairaddfail");
			
		}
		
		return model;
		
	}

}
