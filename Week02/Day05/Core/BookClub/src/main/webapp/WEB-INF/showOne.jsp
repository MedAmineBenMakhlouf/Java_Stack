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
	<div class="container mt-5 mb-5">
		<div class=" row ">
			<div class="col-12 d-flex justify-content-between">
				<h2>
					<c:out value="${book.title }"></c:out>
				</h2>
				<a href="/dashboard">Go Back</a>
			</div>
		</div>
		<div class="row">
			<div class="col-12">
				<c:if test="${loggedUser.id == book.user.id }">
					<p>
						You read
						<c:out value="${book.title }"></c:out>
						.
					</p>
					<p>Here are your thoughts:</p>
				</c:if>
				<c:if test="${loggedUser.id != book.user.id }">
					<p>
						<span class="text-danger"> <c:out
								value="${book.user.userName }"></c:out>
						</span> read <span class="text-success"> <c:out
								value="${book.title }"></c:out></span> by
						<c:out value="${book.author }"></c:out>
					</p>
				</c:if>
			</div>
			<hr />
			<div class="row">
				<div class="col-12">
					<p>
						<c:out value="${book.thoughts }"></c:out>
					</p>
				</div>
			</div>
			<c:if test="${loggedUser.id == book.user.id }">
				<div class="row justify-content-center">
					<div class="col-6 justify-content-center">

						<a href="/book/${book.id}/edit"><button class="btn btn-info">Edit</button></a>
						<div>
							<form action="/book/${book.id }/delete" method="post">
								<input type="hidden" name="_method" value="delete" />
								<button class="btn btn-danger">delete</button>
							</form>
						</div>

					</div>
				</div>
			</c:if>
		</div>
	</div>
</body>
</html>