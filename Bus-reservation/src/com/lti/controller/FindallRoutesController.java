 package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.lti.model.BusRoute;

import com.lti.service.RouteService;

@Controller
public class FindallRoutesController {
	
	
	
		
		@Autowired
		private RouteService routeService;
		
		@RequestMapping(path = "/findAllRoutes")
		public ModelAndView fetchAll() {
			
			System.out.println("in controller");
			List<BusRoute> list = routeService.getAllRoutes();
			ModelAndView model=null;
			if(list==null)
			{
				model=new ModelAndView("addfailed");
			}
			else
			{
				model=new ModelAndView("fetchroutes");
				model.addObject("routes", list);
			}
			System.out.println(list);
			
			return model;
			
			
		}
		}
	


