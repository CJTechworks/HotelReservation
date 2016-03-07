package com.core.reservation.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.core.member.CustomerJDBCTemplate;
import com.core.reservation.model.Reservation;

@Controller
public class MakeReservationController {
	

	@Autowired
	public CustomerJDBCTemplate jdbcTemplate;
	
	@RequestMapping(value="/makeReservation",method=RequestMethod.POST)
	public ModelAndView makeReservation(@ModelAttribute("Reservation") Reservation reservation, Map<String,Object> modelMap){
		
		// update reservation here
		
		jdbcTemplate.makeReservation(reservation);
		
		// get the confirmation number
		
		Reservation confirmedReservation = null;
		
		return new ModelAndView("reserve","reservation",modelMap);
	}

}
