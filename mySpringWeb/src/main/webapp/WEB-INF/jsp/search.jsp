<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
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
  <h2>Welcome!</h2>
  <p>Please select the option below:</p>                                                                                      
  <div class="table-responsive">          
 	 <form:form action="searchRooms" method="post" commandName="SearchRequest">
		  <table class="table">
		    <thead>
		     
		    </thead>
		    <tbody>
		      <tr>
		      	<td>
		      		<label>Number of Adults :</label>
		      	</td>
		        <td>
		        	<form:select path="numberOfAdults">
						<form:option value="1"></form:option>
						<form:option value="2"></form:option>
						<form:option value="3"></form:option>
						<form:option value="4"></form:option>
					</form:select>
				</td>
		      </tr>
		       <tr>
		      	<td>
		      		<label for="checkinDate">Check in Date:</label>
		      	</td>
		        <td>
		        	<input id="checkindate" type="date" value=""/>
				</td>
		      </tr>
		      <tr>
		      	<td>
		      		<label for="checkoutDate">Check out Date:</label>
		      	</td>
		        <td>
		        	<input id="checkoutdate" type="date" value=""/>
				</td>
		      </tr>
		      <tr>
       			 <td colspan="2">
            		<input type="submit" value="Search"/>
        		</td>
   			 </tr>
		      
		    </tbody>
		  </table>
		  
		 </form:form>
  	</div>
</div>
		
</body>
</html>