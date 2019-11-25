package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Location;
import com.lti.service.LocationService;

@Controller
@RequestMapping("/index.jsp")
public class LocationDropDownController {

	@Autowired
	private LocationService locationService;

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(Model model) {
        Location location = new Location();
        model.addAttribute("location", location);
        initModelList(model);
        return "location";
    }
	
    
    private void initModelList(Model model) {
    	List<Location> list = locationService.findAllLocations();
        
    }
	@RequestMapping(path = "/findAllLocationDropDownController")
	public ModelAndView fetchAll() 
	{

		List<Location> list = locationService.findAllLocations();
		ModelAndView model = null;
		if (list == null) 
		{
			
		} 
		else 
		{
			model.addObject("location", list);
		}
		System.out.println(list);

		return model;

	}
}
