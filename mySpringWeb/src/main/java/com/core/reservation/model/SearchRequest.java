package com.core.reservation.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class SearchRequest {
	
	private Date checkinDate;
	
	private Date checkoutDate;
	
	private String numberOfAdults;
	
	private Map<String,String> numberOfAdultsRefData;
	
	private String roomType;

	public Date getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(String numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public Map<String, String> getNumberOfAdultsRefData() {
		return numberOfAdultsRefData;
	}

	public void setNumberOfAdultsRefData(Map<String, String> numberOfAdultsRefData) {
		this.numberOfAdultsRefData = numberOfAdultsRefData;
	}

		

}
