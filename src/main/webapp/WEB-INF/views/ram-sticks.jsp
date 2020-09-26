<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>RAM Sticks</title>
</head>
<body>
<c:forEach var="ramStick" items="${ramSticks}">
	<h2>${ramStick.name}</h2>

	<ul>
		<li>
			<span>Capacity: ${ramStick.capacity}</span>
		</li>

		<li>
			<span>Frequency: ${ramStick.frequency}</span>
		</li>

		<li>
			<span>Type: ${ramStick.type}</span>
		</li>

		<li>
			<span>Price: ${ramStick.price}</span>
		</li>

		<li>
			<c:choose>
				<c:when test="${ramStick.amount <= 3}"><span>Weak Availability</span></c:when>
				<c:otherwise><span>Good Availability</span></c:otherwise>
			</c:choose>
		</li>
	</ul>

	<form action="buy-product" method="POST">
		<input type="hidden" name="productName" value="${ramStick.name}">
		<input type="submit" value="Buy">
	</form>
</c:forEach>
</body>