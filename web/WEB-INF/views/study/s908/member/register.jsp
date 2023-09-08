<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Spring Day5 Quiz</title>

		<style>
			#joinForm {
				margin: auto;
				margin-top: 30px;
				margin-bottom: 30px;
				width: 500px;
				text-align: center;
			}
		</style>
	</head>
	
	<body>
		<%@ include file="../default/header.jsp" %>
		
		<form id="joinForm" action="/join" method="post">
			<input type="text" name="id" placeholder="Input ID"><br>
			<input type="text" name="pw" placeholder="Input PW"><br>
			<input type="text" name="addr" placeholder="Input ADDR"><br>
			<input type="submit" value="JOIN">
		</form>
		
		<%@ include file="../default/footer.jsp" %>
	</body>
</html>