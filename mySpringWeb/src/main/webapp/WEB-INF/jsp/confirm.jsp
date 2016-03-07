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
  
  
			  <table class="table">
			    <thead>
			     
			    </thead>
			    <tbody>
			      <tr>
			      	<td>
			      		<label>Confirmation Number :</label>
			      	</td>
			        <td>
			        	${reservation.confirmationNumber}  
					</td>
			      </tr>
			    </tbody>
			  </table>
			
		
  	</div>
</div>
		
</body>
</html>