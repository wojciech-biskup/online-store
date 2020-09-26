<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Motherboards</title>
</head>
<body>
<c:forEach var="motherboard" items="${motherboards}">
	<h2>${motherboard.name}</h2>

	<ul>
		<li>
			<span>Chipset: ${motherboard.chipset}</span>
		</li>

		<li>
			<span>Memory Slots: ${motherboard.memorySlots}</span>
		</li>

		<li>
			<span>Socket: ${motherboard.socket}</span>
		</li>

		<li>
			<span>Type: ${motherboard.type}</span>
		</li>

		<li>
			<span>Price: ${motherboard.price}</span>
		</li>

		<li>
			<c:choose>
				<c:when test="${motherboard.amount <= 3}"><span>Weak Availability</span></c:when>
				<c:otherwise><span>Good Availability</span></c:otherwise>
			</c:choose>
		</li>
	</ul>

	<form action="buy-product" method="POST">
		<input type="hidden" name="productName" value="${motherboard.name}">
		<input type="submit" value="Buy">
	</form>
</c:forEach>
</body>
</html>