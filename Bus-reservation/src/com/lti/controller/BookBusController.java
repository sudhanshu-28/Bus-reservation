package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.BusDisplay;
import com.lti.service.BusDisplayService;

@Controller
public class BookBusController {
	

	@Autowired
	BusDisplayService bdservice;
	
	@RequestMapping(value="/Bookbus",method=RequestMethod.GET)
	public ModelAndView Bookbus(@RequestParam String bus_num)
	{
	BusDisplay db=new BusDisplay();

		ModelAndView model=null;
		
		BusDisplay bd=new BusDisplay();
		
		bd.setBus_num(bus_num);
		
		BusDisplay bd1=bdservice.findBusByBusNum(bus_num);
	
		
		
		if(bd1!=null)
		{
			model=new ModelAndView("booking");
			model.addObject("bookbus",bd1);
		}
		else
		{
			model=new ModelAndView("busaddfail");
			
		}
		
		return model;
		

}
}
