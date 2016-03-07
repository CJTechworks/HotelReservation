package com.core.member;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.core.reservation.model.SearchResults;

public class SearchResultsMapper implements RowMapper<SearchResults>{
	
	public SearchResults mapRow(ResultSet rs, int rowNum) throws SQLException{
		SearchResults searchResults = new SearchResults();
		searchResults.setHotelName(rs.getString("Name"));
		searchResults.setHotelAddress(rs.getString("Address"));
		searchResults.setHotelPhoneNumber(rs.getString("Phone"));
		searchResults.setRoomRate(rs.getInt("Rate"));
		searchResults.setCity(rs.getString("City"));
		searchResults.setRoomType(rs.getString("RoomType"));
		searchResults.setState(rs.getString("State"));
		searchResults.setHotelId(rs.getInt("hotelId"));
		searchResults.setRoomId(rs.getInt("RoomId"));
		
		return searchResults;
	}
	
	

}


