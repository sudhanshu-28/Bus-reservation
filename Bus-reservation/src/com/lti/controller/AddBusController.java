package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Bus;

import com.lti.service.BusService1;

@Controller
public class AddBusController {
	
	
	
		@Autowired
		BusService1 service;
		
		
		@RequestMapping(value="/findBus",method=RequestMethod.POST)
		public ModelAndView addBus(
		@RequestParam String bus_num,@RequestParam String bus_type,
		@RequestParam int max_seats)
	
		{
			ModelAndView model=null;
			
			Bus b=new Bus();
			
			b.setBus_num(bus_num);
			b.setBus_type(bus_type);
			b.setMax_seats(max_seats);
		
			Bus b1=service.addBus(b);
			
			if(b1!=null)
			{
				model=new ModelAndView("busAdded");
				model.addObject("bus",b1);
			}
			else
			{
				model=new ModelAndView("busaddfail");
				
			}
			
			return model;
			
		}

}
