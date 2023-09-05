<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h1>INDEX 기본 페이지</h1>
		<h3>Request : <%= request.getAttribute("msg") %></h3>
		<a href="/root/login">로그인 페이지</a><br>
		<a href="/root/logout">로그아웃 페이지</a>
	</body>
</html>