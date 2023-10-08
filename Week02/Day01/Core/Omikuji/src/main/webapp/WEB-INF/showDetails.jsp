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
<!-- <script src="/webjars/bootstrap/js/bootstrap.min.js"></script> -->
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div
		class="container row d-flex justify-content-center align-items-center mt-4">
		<div class="col-4">

			<div class="bg-primary">
				In
				<c:out value="${number }"></c:out>
				years, you will live in
				<c:out value="${city }"></c:out>
				with
				<c:out value="${person }"></c:out>
				as your roommate,
				<c:out value="${hobby }"></c:out>
				for living. The next you see a
				<c:out value="${living }"></c:out>
				, you will have good luck. Also
				<c:out value="${speach }"></c:out>
			</div>
			<div class="text-center">
				<a href="/omikuji">Go Back</a>
			</div>
		</div>
	</div>
</body>
</html>