package com.core.reservation.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.core.member.CustomerJDBCTemplate;
import com.core.reservation.model.SearchRequest;
import com.core.reservation.model.SearchResults;


@Controller
public class HotelSearchResultsController {
	
	@Autowired
	public CustomerJDBCTemplate jdbcTemplate;

	@RequestMapping(value="/searchRooms",method=RequestMethod.POST)
	public ModelAndView searchRooms(@ModelAttribute("SearchRequest") SearchRequest searchRequest,  ModelMap model){
	 	SearchResults searchResults = jdbcTemplate.searchRooms(searchRequest);

	 	model.addAttribute("SearchResults", searchResults);
	 	System.out.println("In search results controller");
	 	return new ModelAndView("searchresults",model);
	  
	  }

}
