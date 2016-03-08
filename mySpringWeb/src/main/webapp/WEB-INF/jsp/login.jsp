<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ page isELIgnored="false" %>
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel Booking</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>


<script type="text/javascript">

$(document).ready(function(){
	
	$("#NewUserSection").hide();
	$("#ExistingUser").hide();

	$("#NewUser").click(function(){
		$("#NewUserSection").show();
		$("#ExistingUserSection").hide();
		$("#ExistingUser").show();
		$("#NewUser").hide();
	})
	
	$("#ExistingUser").click(function(){
		$("#ExistingUserSection").show();
		$("#NewUserSection").hide();
		$("#ExistingUser").hide();
		$("#NewUser").show();

	})
	
	
	$("#RegisterBtn").click(function(){
		
		if($("#userName").val()==''){
			$("#registrationError").html("user name can't be blank");
			return false;
		}
		if($("#password").val()==''){
			$("#registrationError").html("password can't be blank");
			return false;
		}
		if($("#emailAddress").val()==''){
			$("#registrationError").html("email address can't be blank");
			return false;
		}

	})
	});

</script>
   
</head>
<body>

<div align="center" class="table-responsive">



	<table class="table">
    	 		
                <tr>
                    <td>
                    	<button id="NewUser" name="New User">New User</button>
                    </td>
                     <td>
                    	<button id="ExistingUser" name="Existing User">Existing User</button>
                    </td>
                     
                   	
                </tr>
     </table>
<form:form action="register" method="post" commandName="User">

<div id="NewUserSection">

  <table class="table hide">
  
   <label id="registrationError" style="color:red;"></label>
    	 		<tr>
                    <td colspan="2" align="center"><h2>Hotel Booking Application</h2></td>
                </tr>
               	<tr>
                    <td>
                    	<label>User Name: </label>
                    </td>
                   	<td>
                   		<form:input id="userName" path="userName"/>
                   	</td>
                </tr>
                
                <tr>
                    <td>
                    	<label>Password:</label>
                    </td>
                    <td>
                    	<form:password id="password" path="password"/>
                    </td>
                </tr>
                
                  <tr>
                    <td>
                    	<label>Email Address:</label>
                    </td>
                    <td>
                    	<form:input id="emailAddress" path="emailAddress"/>
                    </td>
                </tr>
               
                <tr>
                    <td colspan="2" align="center"><input id="RegisterBtn" type="submit" value="Register" /></td>
                </tr>
  </table>
  </form:form>
 </div>
 
 <div id="ExistingUserSection">
 
 	
  
  <form:form action="loginExistingUser" method="post" commandName="User">

  <table id="ExistingUserSection" class="table hide">
    	 		<tr>
                    <td colspan="2" align="center"><h2>Hotel Booking Application</h2></td>
                </tr>
                <label style="color:red;">${error.errorMessage}</label>
               
                
               	<tr>
                    <td>
                    	<label>User Name: </label>
                    </td>
                   	<td>
                   		<form:input path="userName"/>
                   	</td>
                </tr>
                
                <tr>
                    <td>
                    	<label>Password:</label>
                    </td>
                    <td>
                    	<form:password path="password"/>
                    </td>
                </tr>
               
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Login" /></td>
                </tr>
               
  </table>
  </form:form>
</div>

 

</body>
</html>