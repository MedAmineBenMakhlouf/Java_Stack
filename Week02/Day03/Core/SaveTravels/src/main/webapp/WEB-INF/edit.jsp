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
	<div class="d-flex justify-content-between">
	<h1>Edit Expense</h1>
	<a href="/">Go Back</a>
	</div>
		<form:form action="/travels" method="post" modelAttribute="travel">
		<input type="hidden" name="_method" value="put">
			<p>
				<form:label path="expenseName">Title</form:label>
				<form:errors path="expenseName" />
				<form:input path="expenseName" />
			</p>
			<p>
				<form:label path="vendor">Vendor</form:label>
				<form:errors path="vendor" />
				<form:textarea path="vendor" />
			</p>
			<p>
				<form:label path="description">Description</form:label>
				<form:errors path="description" />
				<form:input path="description" />
			</p>
			<p>
				<form:label path="amount">Amount</form:label>
				<form:errors path="amount" />
				<form:input type="number" path="amount" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>