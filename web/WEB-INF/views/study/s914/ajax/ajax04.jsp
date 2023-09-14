<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>

		<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
		<script>
			function test() {
				let frm = {}
				let arr = $("#frm").serializeArray();
				
				for (var i = 0; i < arr.length; i++) frm[arr[i].name] = arr[i].value;
				
				/*
				$.ajax({
					url : "result04",
					type : "POST",
					data : JSON.stringify(arr), // 서버로 전송할 데이터
					contentType : "application/json; charset=utf-8", // 서버로 전송할 데이터 타입
					dataType : "JSON", // 서버로부터 리턴받을 타입 지정
					success : function( data ) {
						console.log("성공데스");
					},
					error : function() {
						console.log("실패데스");
					}
				});
				*/
				$.ajax({
					url : "result04",
					type : "POST",
					data : JSON.stringify(frm), // 서버로 전송할 데이터
					contentType : "application/json; charset=utf-8", // 서버로 전송할 데이터 타입
					dataType : "JSON", // 서버로부터 리턴받을 타입 지정
					success : function( data ) {
						console.log("성공데스");
						console.log(data);
					},
					error : function( e ) {
						console.log("실패데스");
						console.log(e);
					}
				});
			}
		</script>
	</head>
	
	<body>
		<form id="frm">
			<input type="text" name="id"><br>
			<input type="text" name="pwd"><br>
			<input type="text" name="name"><br>
			<input type="text" name="age"><br>
			<input type="text" name="addr"><br>
			
			<input type="button" onclick="test()" value="전송">
		</form>
	</body>
</html>