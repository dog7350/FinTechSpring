<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
		<script>
			function test() {
				$.ajax({
					url : "result02",
					type : "get",
					success : function(data) { // 서버로부터 전달받은 리턴값 : data
						$("#txt").text(data);
					},
					error : () => {
						console.log("문제 발생");
					}
				});
			}
		</script>
	</head>
	
	<body>
		<h1>1111</h1> <h1>1111</h1> <h1>1111</h1>
		<h1>1111</h1> <h1>1111</h1> <h1>1111</h1>
		<button type="button" onclick="test()">클릭</button>
		<br>
		
		<b id="txt"></b>
	</body>
</html>