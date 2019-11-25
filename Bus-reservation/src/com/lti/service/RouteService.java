package com.lti.service;

import java.util.List;

import com.lti.model.BusRoute;

public interface RouteService 
{
	public BusRoute addRoute(BusRoute a);
	public List<BusRoute> getAllRoutes();
	public BusRoute findr(int Route_id); 
	public BusRoute findRouteId(int src,int dest);
}
