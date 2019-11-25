package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.lti.model.BusRoute;
import com.lti.model.Location;
import com.lti.repository.RouteRepository;

@Service("serviceRepository")
public class RouteServiceImpl implements RouteService 
{
	@Autowired
	RouteRepository repository;

	@Override
	public BusRoute addRoute(BusRoute r) 
	{
		BusRoute r1 = repository.addRoute(r);
		return r1;
	}

	
		@Override
		public List<BusRoute> getAllRoutes() {
			
			return	repository.findAllRoutes();
		}


		@Override
		public BusRoute findr(int Route_id) {
			return repository.findr(Route_id);
		}


		@Override
		public BusRoute findRouteId(int src, int dest) {
			return repository.findRouteId(src, dest);
		}
			
	

}
