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
	<h1>Create Book 📰</h1>
	<form:form action="/book/add" method="post" modelAttribute="book"
		class="col-3">

		<p>
			<form:label path="title" class="form-label">Title:</form:label>
			<form:errors path="title" />
			<form:input class="form-control" path="title" />
		</p>

		<p>
			<form:label path="author">Author:</form:label>
			<form:errors path="author" />
			<form:input type="text" path="author" class="form-control" />
		</p>
		<p>
			<form:label path="thoughts">My thoughts:</form:label>
			<form:errors path="thoughts" />
			<form:textarea path="thoughts" class="form-control" />
		</p>

		<button class="btn btn-success">Submit</button>

	</form:form>
</body>
</html>