package com.lti.repository;

import java.util.List;

import com.lti.model.BusRoute;
import com.lti.model.Location;

public interface RouteRepository 
{
	public BusRoute addRoute(BusRoute r);

	public void updateRoute(BusRoute r);

	public void deleteRoute(BusRoute r);

	public BusRoute findRouteById(int id);

	public List<BusRoute> findAllRoutes();
	
	public BusRoute findr(int Route_id);
	
	public BusRoute findRouteId(int src,int dest);
	
	//public BusRoute findRouteId(Location src,Location dest);


}
