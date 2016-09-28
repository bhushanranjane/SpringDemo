<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<link rel="stylesheet"
	href="/WEB-INF/world.css" type="text/css" />
</head>
<body>
	<table class="silver" width="150">
		<h1>Countries</h1>
		<c:forEach items="${countries}" var="country">
			<tr>
				<td><a href="countryDetails?id=${country.id}">
						${country.name}</a> ${country.id}</td>
			</tr>
		</c:forEach>
	</table>

</body>