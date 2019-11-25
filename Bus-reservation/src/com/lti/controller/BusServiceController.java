package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.BusRoute;
import com.lti.model.BusService;
import com.lti.service.BusServiceservice;

@Controller
public class BusServiceController {

	@Autowired
	BusServiceservice service;
	
	@RequestMapping(value="/addBusService",method=RequestMethod.POST)
	public ModelAndView addBusService(@RequestParam int route_id, @RequestParam String start_time, @RequestParam String end_time, @RequestParam String status)
	{
		ModelAndView model=null;
		
		BusRoute route=new BusRoute();
		route.setRoute_id(route_id);
		
		BusService bs=new BusService();
		bs.setStart_time(start_time);
		bs.setEnd_time(end_time);
		bs.setStatus(status);
	    bs.setRoute(route);
		
		
		
		BusService bs1=service.addBusService(bs);
		
		if(bs1!=null)
		{
			model=new ModelAndView("busServiceAdded");
			model.addObject("busservice",bs1);
		}
		else
		{
			model=new ModelAndView("busServiceFailed");
			
		}
		
		return model;
		
	}
	
	
	
}
