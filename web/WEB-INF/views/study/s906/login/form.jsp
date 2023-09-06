<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${ pageContext.request.contextPath }" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<!--
		<script>
			test = () => { alert("TEST"); }
			
			window.onload = () => {
				const btn = document.getElementById("btn");
				btn.addEventListener("click", test);
			}
		</script>
		-->
		<link rel="stylesheet" type="text/css" href="${ contextPath }/css/test.css">
		<script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/test.js"></script>
	</head>
	
	<body>
		PATH : ${ contextPath }
		<h1>로그인 페이지</h1>
		<button type="button" id="btn">클릭</button>
		<button type="button" onclick="test()">클릭 TEST</button>
		<form action="login_chk" method="post">
			<input type="text" name="id"><br>
			<input type="text" name="pwd"><br>
			<input type="submit" value="로그인">
		</form>
	</body>
</html>