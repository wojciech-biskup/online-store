<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Online Store</title>
</head>
<body>
	<h2>Products:</h2>
    
    <ul>
    	<li>
			<a href="<c:url value="/cpus"/>">CPUs</a>
		</li>
    	
    	<li>    
			<a href="<c:url value="/graphics-cards"/>">Graphics Cards</a>
		</li>
		
		<li>
			<a href="<c:url value="/hdd-drives"/>">HDD Drives</a>
		</li>
		
    	<li>
			<a href="<c:url value="/motherboards"/>">Motherboards</a>
		</li>
                
		<li>
			<a href="<c:url value="/power-supplies"/>">Power Supplies</a>
		</li>
                
		<li>
			<a href="<c:url value="/ram-sticks"/>">RAM Sticks</a>
		</li>
	</ul>
    
    <a href="<c:url value="/admin"/>">Admin Page</a>
</body>
</html>