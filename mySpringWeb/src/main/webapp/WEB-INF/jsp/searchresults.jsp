<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel booking search page</title>
</head>
<body>
		<div class="container">
  <h2>Search Results for your booking request :</h2>
  <p>Please select the option below:</p>                                                                                      
  <div class="table-responsive">        
  
  
			
 	  	 <form:form action="makeReservation" method="post" commandName="S">
 	 
			  <table class="table">
			    <thead>
			     
			    </thead>
			    <tbody>
			      <tr>
			      	<td>
			      		<label>Hotel Name :</label>
			      	</td>
			        <td>
			        	${SearchResults.hotelName}  
					</td>
			      </tr>
			      <tr>
			      	<td>
			      		<label>Room Type :</label>
			      	</td>
			        <td>
			        	${SearchResults.roomType}  
					</td>
			      </tr>
			      <tr>
			      	<td>
			      		<label>Address :</label>
			      	</td>
			        <td>
			        	${SearchResults.hotelAddress}  
					</td>
			      </tr>
			      <tr>
			      	<td>
			      		<label>Phone number :</label>
			      	</td>
			        <td>
			        	${SearchResults.hotelPhoneNumber}  
					</td>
			      </tr>
			      <tr>
			      	<td>
			      		<label>City :</label>
			      	</td>
			        <td>
			        	${SearchResults.city}  
					</td>
			      </tr>
			      <tr>
			      	<td>
			      		<label>State :</label>
			      	</td>
			        <td>
			        	${SearchResults.state}  
					</td>
			      </tr>
			      <tr>
			      	<td>
			      		<label>Zip :</label>
			      	</td>
			        <td>
			        	${SearchResults.zipCode}  
					</td>
			      </tr>
			      <tr>
			      	<td>
			      		<label>Room Rate :</label>
			      	</td>
			        <td>
			        	${SearchResults.roomRate}  
					</td>
			      </tr>
			      
			       <tr>
	       			 <td colspan="2">
	            		<input type="submit" value="Make Reservation"/>
	        		</td>
   				 </tr>
			      
			    </tbody>
			  </table>
			  <input type="hidden" value="${SearchResults.hotelId}"></input>
			   <input type="hidden" value="1"></input>
		  </form:form>
		
  	</div>
</div>
		
</body>
</html>