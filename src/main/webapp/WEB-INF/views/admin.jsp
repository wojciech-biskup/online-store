<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Admin Page</title>
</head>
<body>
	<a href="<c:url value="/add-product"/>">Add Product</a> <br>
	<a href="<c:url value="/current-orders"/>">Current Orders</a> <br>
</body>
</html>