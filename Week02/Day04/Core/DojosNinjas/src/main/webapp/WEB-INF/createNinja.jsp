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
<title>Create Ninja</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container mt-3 mb-5">
		<form:form action="/createNinja" method="post" modelAttribute="ninja">

			<p>
				<form:select path="dojo">
					<c:forEach items="${dojos }" var="dojo">
						<form:option value="${dojo.id }">${dojo.name }</form:option>
					</c:forEach>
				</form:select>
			</p>
			<p>
				<form:label class="form-label" path="first_name">first Name:</form:label>
				<form:errors path="first_name" />
				<form:input class="form-control" path="first_name" />
			</p>
			<p>
				<form:label class="form-label" path="lat_name">Last Name</form:label>
				<form:errors path="lat_name" />
				<form:textarea class="form-control" path="lat_name" />
			</p>
			<p>
				<form:label class="form-label" path="age">Age:</form:label>
				<form:errors path="age" />
				<form:input class="form-control" type="number" path="age" />

			</p>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>