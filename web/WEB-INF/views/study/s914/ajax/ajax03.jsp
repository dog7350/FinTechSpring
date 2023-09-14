<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>

		<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
		<script>
			function test() {
				let n = document.getElementById("name").value;
				let a = $("#age").val();
				let form = { name : n, age : a};

				$.ajax({
					url : "result03",
					type : "POST",
					data : JSON.stringify( form ), // 서버로 전송할 데이터
					contentType : "application/json; charset=utf-8", // 서버로 전송할 데이터 타입
					dataType : "JSON", // 서버로부터 리턴받을 타입 지정
					success : function( data ) {
						console.log("성공데스");
						console.log("이름 : " + data.name);
						console.log("나이 : " + data.age);
					},
					error : function() {
						console.log("실패데스");
					}
				});
			}
		</script>
	</head>
	
	<body>
		NAME : <input type="text" id="name"><br>
		AGE : <input type="text" id="age"><br>
		<input type="button" onclick="test()" value="전송">
	</body>
</html>