<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!-- for Bootstrap CSS -->

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Hopper Receipt</title>
</head>
<body>
<h2>
<c:out value="${name }"></c:out>
</h2>
<hr>
<h4>Item Name: 
<c:out value="${itemName }"></c:out>
</h4>
<h4>Price: 
<c:out value="${price }"></c:out>
</h4>
<h4>Description: 
<c:out value="${description }"></c:out>
</h4>
<h4>Vendor: 
<c:out value="${vendor }"></c:out>
</h4>
</body>
</html>