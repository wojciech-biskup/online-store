<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>HDD Drives</title>
</head>
<body>
<c:forEach var="hddDrive" items="${hddDrives}">
	<h2>${hddDrive.name}</h2>

	<ul>
		<li>
			<span>Capacity: ${hddDrive.capacity}</span>
		</li>

		<li>
			<span>Rotation Speed: ${hddDrive.rotationSpeed}</span>
		</li>

		<li>
			<span>Size: ${hddDrive.size}</span>
		</li>

		<li>
			<span>Price: ${hddDrive.price}</span>
		</li>

		<li>
			<c:choose>
				<c:when test="${hddDrive.amount <= 3}"><span>Weak Availability</span></c:when>
				<c:otherwise><span>Good Availability</span></c:otherwise>
			</c:choose>
		</li>
	</ul>

	<form action="buy-product" method="POST">
		<input type="hidden" name="productName" value="${hddDrive.name}">
		<input type="submit" value="Buy">
	</form>
</c:forEach>
</body>
</html>