<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName"/>
		<br><br>
		Last name: <form:input path="lastName"/>
		<br><br>
		Country: <form:select path="country">
			<%-- <form:option value="India" label="India" />
			<form:option value="USA" label="USA" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" /> --%>
			
			<form:options items="${student.countryOptions}"/>
			
		</form:select>
		<br><br>
		<input type="submit" value="Sumbit" />	
	</form:form>
	
	
</body>
</html>