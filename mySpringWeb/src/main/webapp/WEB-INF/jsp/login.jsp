<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel Booking</title>

   
</head>
<body>

<div align="center" class="table-responsive">
<form:form action="register" method="post" commandName="User">

  <table class="table">
    	 <tr>
                    <td colspan="2" align="center"><h2>User Registration</h2></td>
                </tr>
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
                    	<form:input path="password"/>
                    </td>
                </tr>
                
                  <tr>
                    <td>
                    	<label>Email Address:</label>
                    </td>
                    <td>
                    	<form:input path="emailAddress"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
  </table>
  </form:form>
</div>

 

</body>
</html>