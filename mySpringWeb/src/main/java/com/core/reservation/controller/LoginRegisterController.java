package com.core.reservation.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.core.member.CustomerJDBCTemplate;
import com.core.reservation.model.SearchRequest;
import com.core.reservation.model.User;

@Controller
public class LoginRegisterController {
	
	@Autowired
	public CustomerJDBCTemplate jdbcTemplate;
	
	@RequestMapping("/register")
	public ModelAndView registerUser(@ModelAttribute("User") User user,  Map<String, Object> model){
		jdbcTemplate.createNewGuest(user);
		
		// once the user creation is succuessful, redirect to search page
		SearchRequest searchRequest = new SearchRequest();
		
		return new ModelAndView("search", "SearchRequest", searchRequest);
		
	}
}
