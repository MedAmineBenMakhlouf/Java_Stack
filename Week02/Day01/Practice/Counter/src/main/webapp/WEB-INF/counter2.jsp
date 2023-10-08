<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">

<!-- Optional JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
	crossorigin="anonymous"></script>
<!--<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />-->
<!-- YOUR own local CSS -->
<!--<link rel="stylesheet" href="/css/main.css"/>-->
<!-- For any Bootstrap that uses JS -->
<!-- <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>-->
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p>
			you have visited <a href="http://localhost:8080">http://localhost:8080</a>
			<c:out value="${count2 }"></c:out>
			times
		</p>
		<p>
			<a href="http://localhost:8080">Test another visit</a>
		</p>
	</div>
</body>
</html>