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
<title>dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container">
		<div class="row d-flex justify-content-between">
			<a href="/lookify/new">Add New</a> <a href="/lookify/findTop">Top
				Songs</a>
			<form action="/findByName" method="get">
				<input type="text" name="name">
				<button>Search</button>
			</form>

			<table class="table">
				<thead>
					<tr>
						<th>Name</th>
						<th>Rating</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${lookifies }" var="lookify">
						<tr>
							<td><a href="/lookify/${lookify.id }"> <c:out
										value="${lookify.title }"></c:out>
							</a></td>
							<td><c:out value="${lookify.rating }"></c:out></td>
							<td><a href="/lookify/${lookify.id }/edit">Edit</a>
								<form action="/lookify/${lookify.id }/delete" method="post">
									<input type="hidden" name="_method" value="delete" />
									<button>delete</button>
								</form></td>
						</tr>

					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>
</body>
</html>