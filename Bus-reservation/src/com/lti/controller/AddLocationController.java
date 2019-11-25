package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Location;
import com.lti.service.LocationService;

@Controller
public class AddLocationController {

		@Autowired
		LocationService service;
		
		@RequestMapping(value="/addLocation",method=RequestMethod.POST)
		public ModelAndView addLocation(@RequestParam String name)
		{
			ModelAndView model=null;
			
			Location l=new Location();
			
			l.setName(name);
			
			
			Location l1=service.addLocation(l);
			
			if(l1!=null)
			{
				model=new ModelAndView("locationAdded");
				model.addObject("location",l1);
			}
			else
			{
				model=new ModelAndView("locationFailed");
				
			}
			
			return model;
			
		}
		
		
}

