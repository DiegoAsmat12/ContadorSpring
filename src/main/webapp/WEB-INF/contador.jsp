<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Contador de visitas</title>
	</head>
	<body>
		<p>Has visto <a href="/">El inicio</a> <c:out value="${counter}"/></p>
	</body>
</html>