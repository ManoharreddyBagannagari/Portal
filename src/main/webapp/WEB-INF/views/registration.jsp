<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Join Portal</title>
</head>
<body>
	<h2>Sign Up</h2>

	<form:form method="POST" modelAttribute="users">
		<form:input type="hidden" path="id" id="id" />
		<table>
			<tr>
				<td><label for="username">Username: </label></td>
				<td><form:input path="username" id="username" /></td>
			</tr>
			
			<tr>
				<td><label for="password">Username: </label></td>
				<td><form:password path="password" id="password" /></td>
			</tr>
			
			<tr>
				<td><label for=firstName>First Name: </label></td>
				<td><form:input path="firstName" id="firstName" /></td>
			</tr>
			
			<tr>
				<td><label for=lastName>Last Name: </label></td>
				<td><form:input path="firstName" id="firstName" /></td>
			</tr>
			
			<tr>
				<td><label for=phoneNumber>Phone Number: </label></td>
				<td><form:input path="phoneNumber" id="phoneNumber" /></td>
			</tr>

			<tr>
				<td><label for="dob">Date of Birth: </label></td>
				<td><form:input path="dob" id="dob" /></td>
			</tr>

			<tr>
				<td><label for="email">Salary: </label></td>
				<td><form:input path="email" id="email" /></td>
			</tr>

			<tr>
				<td colspan="3"><c:choose>
						<c:when test="${edit}">
							<input type="submit" value="Update" />
						</c:when>
						<c:otherwise>
							<input type="submit" value="Register" />
						</c:otherwise>
					</c:choose></td>
			</tr>
		</table>
	</form:form>
	<br />
	<%-- <br /> Go back to
	<a href="<c:url value='/list' />">List of All Employees</a> --%>
</body>
</html>