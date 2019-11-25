package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.BusRoute;
import com.lti.model.Location;
import com.lti.service.LocationService;
import com.lti.service.RouteService;

@Controller
public class SearchController {
	
	@Autowired
	LocationService search;
	
	@Autowired
	RouteService service;
	
	@RequestMapping(value="/searchController",method=RequestMethod.POST)
	public ModelAndView search(@RequestParam String source,@RequestParam String destination)
	{
		Location l=new Location();
		BusRoute r=new BusRoute();
		l.setName(source);
		l.setName(destination);

		ModelAndView model =null;
		
	  	Location l1=search.findLocationBySource(source);
		int lsid=l1.getId();
		System.out.println(lsid);
		r.setSource(l1);
		Location l2=search.findLocationByDestination(destination);
		int ldid=l2.getId();
		System.out.println(ldid);
		r.setDestination(l2);
		
		BusRoute route=service.findRouteId(lsid, ldid);
		System.out.println(route);
		int rid=route.getRoute_id();
		System.out.println(rid);
		
		
		    
		        
		        return model;
		        
	}

}
