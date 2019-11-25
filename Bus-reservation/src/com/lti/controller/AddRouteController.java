package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Location;
import com.lti.model.BusRoute;
import com.lti.service.LocationService;
import com.lti.service.RouteService;

@Controller
public class AddRouteController 
{
	@Autowired
	RouteService service;
	
	@Autowired
	LocationService service1;
	
	@RequestMapping(value="/addRoute",method=RequestMethod.POST)
	public ModelAndView addRoute(@RequestParam float fare,  @RequestParam int source_id, @RequestParam int destination_id,int distance)
	{
		ModelAndView model=null;
		
		
		
		Location source=new Location();
		source.setId(source_id);
		
		Location destination=new Location();
		destination.setId(destination_id);
		
		
		BusRoute br=new BusRoute();
		br.setFare(fare);
	    br.setDistance(distance);
		br.setSource(source);
		br.setDestination(destination);

		
		BusRoute br1=service.addRoute(br);
		
		if(br1!=null)
		{
			model=new ModelAndView("routeAdded");
			model.addObject("route",br1);
		}
		else
		{
			model=new ModelAndView("routeFailed");
			
		}
		
		return model;
		
	}

	
}
