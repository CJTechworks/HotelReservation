<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel booking search page</title>
</head>
<body>
 <form:form action="searchRooms" method="post" commandName="User">
 	
 </form:form>
search page

<form:select path="country">
    <form:options items="${countryList}" />
</form:select>

</body>
</html>