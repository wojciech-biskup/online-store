<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>CPUs</title>
</head>
<body>
<c:forEach var="cpu" items="${cpus}">
	<h2>${cpu.name}</h2>

	<ul>
		<li>
			<span>Clock Rate: ${cpu.clockRate}</span>
		</li>

		<li>
			<span>Core Amount: ${cpu.coreAmount}</span>
		</li>

		<li>
			<span>Socket: ${cpu.socket}</span>
		</li>

		<li>
			<span>Price: ${cpu.price}</span>
		</li>

		<li>
			<c:choose>
				<c:when test="${cpu.amount <= 3}"><span>Weak Availability</span></c:when>
				<c:otherwise><span>Good Availability</span></c:otherwise>
			</c:choose>
		</li>
	</ul>

	<form action="buy-product" method="POST">
		<input type="hidden" name="productName" value="${cpu.name}">
		<input type="submit" value="Buy">
	</form>
</c:forEach>
</body>
</html>