package com.core.reservation.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.core.member.CustomerJDBCTemplate;
import com.core.reservation.model.User;

@Controller
public class LoginRegisterController {
	
	@Autowired
	public CustomerJDBCTemplate jdbcTemplate;
	
	@RequestMapping("/register")
	public ModelAndView registerUser(@ModelAttribute("User") User user,  Map<String, Object> model){
		jdbcTemplate.createNewGuest(user);
		return new ModelAndView("search", "users", user);
		
	}
}
