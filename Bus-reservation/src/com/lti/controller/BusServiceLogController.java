package com.lti.controller;

import com.lti.util.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Bus;
import com.lti.model.BusRoute;
import com.lti.model.BusService;
import com.lti.model.BusServiceLog;
import com.lti.service.BusService1;
import com.lti.service.BusServiceLogService;
import com.lti.service.BusServiceservice;

@Controller
public class BusServiceLogController {

	@Autowired
	BusServiceLogService service; //bus service log
	
	@Autowired
	BusServiceservice service1;  //bus service service
	
	@Autowired
	BusService1 bservice;  //bus service
	
	@RequestMapping(value="/addBusServiceLog",method=RequestMethod.POST)
	public ModelAndView addBusServiceLog(@RequestParam int bs_id,@RequestParam int bid,@RequestParam String run_date, @RequestParam String actual_stime, 
			@RequestParam String actual_etime, @RequestParam int seats_filled, @RequestParam String remark)
	{
		ModelAndView model=null;
		
		
		BusServiceLog bsl=new BusServiceLog();
	
	//	BusService services=new BusService();
	//	services.setBs_id(bs_id);
		
		
		
		
	//	Bus bus=new Bus();
	//	bus.setBid(bid);
		
		
		
	
		
		BusService services=service1.findbs(bs_id);
		bsl.setServices(services);
		Bus bus=bservice.findBus(bid);
		bsl.setBus(bus);
		bsl.setRun_date(DateWorker.formatDate(run_date));
		bsl.setActual_stime(actual_stime);
		bsl.setActual_stime(actual_stime);
		bsl.setActual_etime(actual_etime);
		bsl.setSeats_filled(seats_filled);
		bsl.setRemark(remark);
	    
		
		
		
		
		BusServiceLog bsl1=service.addBusServiceLog(bsl);
		
		if(bsl1!=null)
		{
			model=new ModelAndView("busServiceLogAdded");
			model.addObject("busservice",bsl1);
		}
		else
		{
			model=new ModelAndView("busServiceLogFailed");
			
		}
		
		return model;
		
	}
	
	
	
		

	}
	

