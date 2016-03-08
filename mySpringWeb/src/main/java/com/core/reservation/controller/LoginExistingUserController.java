package com.core.reservation.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.core.member.CustomerJDBCTemplate;
import com.core.reservation.model.SearchRequest;
import com.core.reservation.model.User;
@Controller
public class LoginExistingUserController {
	
	@Autowired
	public CustomerJDBCTemplate jdbcTemplate;
	
	@RequestMapping("/loginExistingUser")
	public ModelAndView registerUser(@ModelAttribute("User") User user,  Map<String, Object> model){
		User userResult = jdbcTemplate.loginExistingUser(user);
		SearchRequest searchRequest = new SearchRequest();

		if(userResult != null && !StringUtils.isEmpty(userResult.getUserId())){
			System.out.println("login successful");
			return new ModelAndView("search", "SearchRequest", searchRequest);
		}
		
		com.core.reservation.model.Error error = new com.core.reservation.model.Error();
		
		error.setErrorMessage("Invalid user id or password");
		
		return new ModelAndView("login","error",error);
		
	}

}
