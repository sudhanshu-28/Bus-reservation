package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Bus;
import com.lti.model.BusDisplay;
import com.lti.service.BusDisplayService;


@Controller
public class DisplayBusController {
	
	@Autowired
	BusDisplayService bdservice;
	
	
	@RequestMapping(value="/displaybus",method=RequestMethod.POST)
	public ModelAndView addBus(@RequestParam String source,@RequestParam String destination)
	{
		BusDisplay bd=new BusDisplay();
		
		bd.setSource(source);
		bd.setDestination(destination);
		
		List<BusDisplay> list = bdservice.findAllBuses(source, destination);
		
		ModelAndView model=null;
		if(list==null)
		{
			model=new ModelAndView("addfailed");
		}
		else
		{
			model=new ModelAndView("displaybuses");
			model.addObject("dbuses", list);
		}
		System.out.println(list);
		
		return model;
		
		
		
	}
				
				
				
				
				
				
				
				
				
				
				
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
