<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Graphics Cards</title>
</head>
<body>
<c:forEach var="graphicsCard" items="${graphicsCards}">
	<h2>${graphicsCard.name}</h2>

	<ul>
		<li>
			<span>Clock Rate: ${graphicsCard.clockRate}</span>
		</li>

		<li>
			<span>Lenght: ${graphicsCard.lenght}</span>
		</li>

		<li>
			<span>RAM Memory Size: ${graphicsCard.ramMemorySize}</span>
		</li>

		<li>
			<span>Price: ${graphicsCard.price}</span>
		</li>

		<li>
			<c:choose>
				<c:when test="${graphicsCard.amount <= 3}"><span>Weak Availability</span></c:when>
				<c:otherwise><span>Good Availability</span></c:otherwise>
			</c:choose>
		</li>
	</ul>

	<form action="buy-product" method="POST">
		<input type="hidden" name="productName" value="${graphicsCard.name}">
		<input type="submit" value="Buy">
	</form>
</c:forEach>
</body>
</html>