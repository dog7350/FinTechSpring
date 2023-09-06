<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h3>GET 방식</h3>
		<form action="result" method="get">
			<input type="text" name="name"><br>
			<input type="text" name="age"><br>
			<input type="submit" name="GET 전송">
		</form>
		
		<br><hr><br>
		
		<h3>POST 방식</h3>
		<form action="result" method="post">
			<input type="text" name="name"><br>
			<input type="text" name="age"><br>
			<input type="submit" name="POST 전송">
		</form>
		
		<br><hr><br>
		
		<h3>DTO 방식</h3>
		<form action="dto" method="post">
			<input type="text" name="name"><br>
			<input type="text" name="age"><br>
			<input type="text" name="addr"><br>
			<input type="submit" name="DTO 전송">
		</form>
	</body>
</html>