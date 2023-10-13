<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tacos</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12 d-flex justify-content-between">
				<h2>
					Welcome,
					<c:out value="${loggedUser.userName }"></c:out>
				</h2>
				<a href="/logout">Logout</a>
			</div>
		</div>
		<div class="row">
			<div class="col-12 d-flex justify-content-between">
				<p>this is your dashboard nothing to see here</p>
				<a href="/book/add">+ Add To my Shelf</a>
			</div>
		</div>
		<div class="row">
		<table class="table table-bordered">
		<thead>
		<tr>
		<th>Title</th>
		<th>Author Name</th>
		<th>Posted By</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${books }" var="book">
		<tr>
		<td>
		<a href="/book/${book.id }/show"><c:out value="${book.title }"></c:out></a>
		</td>
		<td>
		<c:out value="${book.author }"></c:out>
		</td>
		<td>
		<c:out value="${book.user.userName }"></c:out>
		</td>
		</tr>
		</c:forEach>
		</tbody>
		</table>
		</div>

	</div>

</body>
</html>