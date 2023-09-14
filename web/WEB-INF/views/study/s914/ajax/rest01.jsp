<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
		<script>
			function getF() {
				$.ajax({
					url : "rest", type : "get",
					success : function( data ) {
						$("#txt").html(data);
					},
					error : function(e) {
						console.log(e);
					}
				})
			}
			
			function postF() {
				$.ajax({
					url : "rest", type : "post",
					success : function( data ) {
						$("#txt").html(data);
					},
					error : function(e) {
						console.log(e);
					}
				})
			}
			
			function putF() {
				$.ajax({
					url : "rest", type : "put",
					success : function( data ) {
						$("#txt").html(data);
					},
					error : function(e) {
						console.log(e);
					}
				})
			}
			
			function delF() {
				$.ajax({
					url : "rest", type : "delete",
					success : function( data ) {
						$("#txt").html(data);
					},
					error : function(e) {
						console.log(e);
					}
				})
			}
		</script>
	</head>
	
	<body>
		<h3 id="txt"></h3>
		<button onclick="getF()">get</button>
		<button onclick="postF()">post</button>
		<button onclick="putF()">put</button>
		<button onclick="delF()">delete</button>
	</body>
</html>