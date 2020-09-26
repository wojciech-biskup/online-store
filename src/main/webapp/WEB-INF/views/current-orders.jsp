<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Current Orders</title>
</head>
<body>
<c:forEach var="order" items="${orders}">
	<ul>
		<li>
			<span>Address: ${order.address}</span>
		</li>

		<li>
			<span>City: ${order.city}</span>
		</li>

		<li>
			<span>Customer Email: ${order.customerEmail}</span>
		</li>

		<li>
			<span>Customer First Name: ${order.customerFirstName}</span>
		</li>

		<li>
			<span>Customer Last Name: ${order.customerLastName}</span>
		</li>

		<li>
			<span>Customer Phone Number: ${order.customerPhoneNumber}</span>
		</li>

		<li>
			<span>Postal Code: ${order.postalCode}</span>
		</li>

		<li>
			<span>Product Name: ${order.productName}</span>
		</li>
	</ul>
</c:forEach>
</body>
</html>