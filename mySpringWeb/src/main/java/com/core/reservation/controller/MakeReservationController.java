package com.core.reservation.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.core.member.CustomerJDBCTemplate;
import com.core.reservation.model.Reservation;
import com.core.reservation.model.SearchResults;

@Controller
public class MakeReservationController {
	

	@Autowired
	public CustomerJDBCTemplate jdbcTemplate;
	
	@RequestMapping(value="/makeReservation",method=RequestMethod.POST)
	public ModelAndView makeReservation(@ModelAttribute("SearchResults") SearchResults searchResults, Map<String,Object> modelMap){
		
		// update reservation here
		
		Reservation reservation = new Reservation();
		
		reservation.setRoomId(searchResults.getRoomId());
		// TODO get the user id from user table
		reservation.setUserId("1");
		reservation.setStartDate(new Date());
		reservation.setEndDate(new Date());
		reservation.setRoomId(1);
		
		jdbcTemplate.makeReservation(reservation);
		
		// get the confirmation number
		
		reservation.setConfirmationNumber("3455666");
		
		return new ModelAndView("confirm","reservation",reservation);
	}

}
