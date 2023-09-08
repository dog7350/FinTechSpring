<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Spring Day5 Quiz</title>
	</head>
	
	<body>
		<input id="msg" type="hidden" value="${msg}" />
		<input id="url" type="hidden" value="${url}" />
		
		<script>
			alert(document.getElementById("msg").value);
			location.href=document.getElementById("url").value;
		</script>
	</body>
</html>