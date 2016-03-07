package com.core.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.core.member.CustomerJDBCTemplate;


@Controller
public class HotelSearchController {
	
	@Autowired
	public CustomerJDBCTemplate customer;
	
	@RequestMapping(value="/search",method=RequestMethod.POST)
	 public String search(Model model) {
		System.out.println("In search controller");
		
	    return "search";
	  }

}
