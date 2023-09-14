<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h1>upload1</h1>
		<form action="upload1" method="post" enctype="multipart/form-data">
			<input type="text" name="id" ><br>
			<input type="text" name="name" ><br>
			<input type="file" name="file" ><br>
			<input type="submit" value="전송">
		</form>
		<br><hr><br>
		
		<a href="views">내용 확인</a>
		
		<br><hr><br>
		<h1>upload2</h1>
		<form action="upload2" method="post" enctype="multipart/form-data">
			<input type="text" name="id" ><br>
			<input type="text" name="name" ><br>
			<input type="file" name="file" ><br>
			<input type="submit" value="전송">
		</form>
		<br><hr><br>
	</body>
</html>