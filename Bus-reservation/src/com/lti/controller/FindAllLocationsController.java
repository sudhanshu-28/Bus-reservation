package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Location;
import com.lti.service.LocationService;

@Controller
public class FindAllLocationsController 
{

	@Autowired
	private LocationService locationService;

	@RequestMapping(path = "/searchLocation", method= RequestMethod.GET)
	public ModelAndView fetchAll() 
	{
		List<Location> list = locationService.findAllLocations();
		ModelAndView model = null;
		if (list == null)
		{
			model = new ModelAndView("");
		} 
		else 
		{
			model = new ModelAndView("index");
			model.addObject("location", list);
		}
		System.out.println(list);

		return model;

	}
}
