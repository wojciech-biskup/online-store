<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Power Supplies</title>
</head>
<body>
<c:forEach var="powerSupply" items="${powerSupplies}">
	<h2>${powerSupply.name}</h2>

	<ul>
		<li>
			<span>Certification: ${powerSupply.certification}</span>
		</li>

		<li>
			<span>Wattage: ${powerSupply.wattage}</span>
		</li>

		<li>
			<span>Price: ${powerSupply.price}</span>
		</li>

		<li>
			<c:choose>
				<c:when test="${powerSupply.amount <= 3}"><span>Weak Availability</span></c:when>
				<c:otherwise><span>Good Availability</span></c:otherwise>
			</c:choose>
		</li>
	</ul>

	<form action="buy-product" method="POST">
		<input type="hidden" name="productName" value="${powerSupply.name}">
		<input type="submit" value="Buy">
	</form>
</c:forEach>
</body>
</html>