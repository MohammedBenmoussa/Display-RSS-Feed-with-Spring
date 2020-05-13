<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8" >
<title>index</title>
</head>
<body>
<c:forEach var="item" items="${items}">
	<div>
		<p>${item.title}</p>
		<p>${item.description}</p>
		<p>${item.category} - ${item.pubDate}</p>
		<p><a href="${item.link}">lire la suite...</a></p>
	</div>
	<hr/>
</c:forEach>


</body>
</html>