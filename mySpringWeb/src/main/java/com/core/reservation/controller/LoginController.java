package com.core.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.core.member.CustomerJDBCTemplate;
import com.core.reservation.model.User;

@Controller
public class LoginController {
	
	@Autowired
	public CustomerJDBCTemplate customer;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	 public String login(Model model) {
		model.addAttribute("User", new User());
	    return "login";
	  }

}
