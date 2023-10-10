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
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>All Books</h1>
		<table class="table bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Language</th>
					<th>Number of Pages</th>
				</tr>
			</thead>
			<tbody>
				<!-- loop over all the books to show the details as in the wireframe! -->
				<c:forEach items="${books }" var="book">
					<tr>
					<td><c:out value="${book.id }"></c:out></td>
						<td><a href="book/show/${book.id}"> <c:out
									value="${book.title }"></c:out></a></td>
						<td><c:out value="${book.language }"></c:out></td>
						<td><c:out value="${book.pages }"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a href="/books/new">Create a Book</a>
		</div>
		<ul>

		</ul>
	</div>
</body>
</html>