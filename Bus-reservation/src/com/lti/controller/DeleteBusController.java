package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Bus;
import com.lti.service.BusService1;



@Controller
public class DeleteBusController {
	

	@Autowired
	BusService1 service;
	
	@RequestMapping(value="/DeleteBus",method=RequestMethod.GET)
	public String deleteC(@PathVariable("bid") int bid)
	{
		//Bus newbus=new Bus();
		//newbus.setBid(bid);
		//ModelAndView model=null;
		
            service.deleteBus(bid);
		
	return "redirect:/view/fetchbuses";
		
	
	
	}
}
