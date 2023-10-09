<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
	<div class="container mt-5">
		<div class="row m-auto d-flex justify-content-center mt-5">
			<div class="col-6 mt-5">
				<form class="mt-5" action="/sendForm" method="POST">
					<c:if test="${fn:length(error)>0}">
						<p>
							
						</p>
						<div class="alert alert-danger" role="alert">
							<c:out value="${error }"></c:out>
						</div>
					</c:if>
					<div class="form-group">
						<label for="">Select a number from 2 to 25</label> <input
							type="number" class="form-control" name="number">
					</div>
					<div class="form-group">
						<label for="">Enter the name of the city</label> <input
							type="text" class="form-control" name="city">
					</div>
					<div class="form-group">
						<label for="">Enter the name of any real person</label> <input
							type="text" class="form-control" name="person">
					</div>
					<div class="form-group">
						<label for="">Enter professional endeavor or hobby</label> <input
							type="text" class="form-control" name="hobby">
					</div>
					<div class="form-group">
						<label for="">Enter any type of living thing</label> <input
							type="text" class="form-control" name="living">
					</div>
					<div class="form-group">
						<label for="">say something nice to someone</label>
						<textarea class="form-control" name="speach" rows=3></textarea>
					</div>
					<p>Send and show a friend</p>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>