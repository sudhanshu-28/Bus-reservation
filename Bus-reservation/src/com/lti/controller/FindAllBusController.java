 package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Bus;

import com.lti.service.BusService1;

@Controller
public class FindAllBusController {
	
	
	
		
		@Autowired
		private BusService1 busService;
		
		@RequestMapping(path = "/findAllBusController")
		public ModelAndView fetchAll() {
			
			System.out.println("in controller");
			List<Bus> list = busService.findAllBuses();
			ModelAndView model=null;
			if(list==null)
			{
				model=new ModelAndView("addfailed");
			}
			else
			{
				model=new ModelAndView("fetchbuses");
				model.addObject("buses", list);
			}
			System.out.println(list);
			
			return model;
			
			
		}
		}
	


