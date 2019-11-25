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
public class DeleteLocationController {
	

	@Autowired
	LocationService service;
	
	@RequestMapping(value="/DeleteLocation",method=RequestMethod.POST)
	public ModelAndView deleteC(@RequestParam int lid)
	{
		Location newloc=new Location();
		newloc.setId(lid);
		ModelAndView model=null;
		
            service.deleteLocation(lid);
		
          
    		return model;
    		
	
		
	
		
	}
	
}