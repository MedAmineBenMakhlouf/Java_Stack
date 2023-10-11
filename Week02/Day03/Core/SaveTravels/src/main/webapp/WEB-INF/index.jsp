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
<title>Travels</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container">
		<h1>Travels</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Expense</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${travels }" var="travel">
					<tr>
						<td><a href="/expense/${travel.id }"><c:out
									value="${travel.expenseName }"></c:out></a></td>
						<td><c:out value="${travel.vendor }"></c:out></td>
						<td>$<c:out value="${travel.amount }"></c:out></td>
						<td><a href="/expense/${travel.id }/edit">Edit</a>
							<form action="/travel/${travel.id }/delete" method="post">
								<input type="hidden" name="_method" value="delete"> 
								<input
									type="submit" value="delete" />
							</form></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="mt-3">
			<form:form action="/travels" method="post" modelAttribute="travel">
				<p>
					<form:label path="expenseName">Title</form:label>
					<form:errors path="expenseName" />
					<form:input path="expenseName" />
				</p>
				<p>
					<form:label path="vendor">Description</form:label>
					<form:errors path="vendor" />
					<form:textarea path="vendor" />
				</p>
				<p>
					<form:label path="description">Language</form:label>
					<form:errors path="description" />
					<form:input path="description" />
				</p>
				<p>
					<form:label path="amount">Pages</form:label>
					<form:errors path="amount" />
					<form:input type="number" path="amount" />
				</p>
				<input type="submit" value="Submit" />
			</form:form>
		</div>
	</div>

</body>
</html>