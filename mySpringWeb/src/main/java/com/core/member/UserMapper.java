package com.core.member;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.core.reservation.model.SearchResults;
import com.core.reservation.model.User;

public class UserMapper implements RowMapper<User>{
	
	public User mapRow(ResultSet rs, int rowNum) throws SQLException{
		User user = new User();
		
		user.setUserName(rs.getString("username"));
		user.setUserId(rs.getInt("userid"));
		
		return user;
	}
	
	

}


