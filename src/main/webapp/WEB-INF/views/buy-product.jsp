<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
	<title>Buy Product</title>
</head>
<body>
	<form action="submit-order" method="POST">
		<input type="hidden" name="productName" value="${productName}"> <br>
		<span>First Name: </span> <input type="text" name="customerFirstName"> <br>
		<span>Last Name: </span> <input type="text" name="customerLastName"> <br>
		<span>City: </span> <input type="text" name="city"> <br>
		<span>Address: </span> <input type="text" name="address"> <br>
		<span>Postal Code: </span> <input type="text" name="postalCode"> <br>
		<span>Phone Number: </span> <input type="tel" name="phoneNumber"> <br>
		<span>Email: </span> <input type="email" name="email"> <br>
		<input type="submit" value="Submit Order">
	</form>
</body>
</html>