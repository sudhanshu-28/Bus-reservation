package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Bus;
import com.lti.model.Location;

import com.lti.service.LocationService;

@Controller
public class ShowAllLocation {
	
	
	
		
		@Autowired
		private LocationService locService;
		
		@RequestMapping(path = "/showAllLocation")
		public ModelAndView fetchAll() {
			
			System.out.println("in controller");
			List<Location> list = locService.findAllLocations();
			ModelAndView model=null;
			if(list==null)
			{
				model=new ModelAndView("addfailed");
			}
			else
			{
				model=new ModelAndView("locations");
				model.addObject("locations", list);
			}
			System.out.println(list);
			
			return model;
			
			
		}
		}
	


