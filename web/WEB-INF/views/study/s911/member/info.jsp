<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<script src="<%= request.getContextPath() %>/resources/js/daumPost.js"></script>
	</head>
	
	<body>
		<%@ include file="../default/header.jsp" %>
		<h1>INFO JSP</h1>
		ID : ${ mem.dto.id }<br>
		PW : ${ mem.dto.pw }<br>
		ADDR1 : ${ mem.addr1 }<br>
		ADDR2 : ${ mem.addr2 }<br>
		ADDR3 : ${ mem.addr3 }
		<br><hr><br>
		<form action="${ contextPath }/member/register" method="post">
			<input type="text" name="id" placeholder="Input ID" value="${ mem.dto.id }" readonly><br>
			<input type="password" name="pw" placeholder="Input PWD"><br>
			<input type="text" readonly id="addr1" name="addr" placeholder="우편번호" value="${ mem.addr1 }">
			<button type="button" onclick="daumPost()">우편번호 찾기</button><br>
			<input type="text" readonly id="addr2" name="addr" placeholder="주소" value="${ mem.addr2 }"><br>
			<input type="text" id="addr3" name="addr" placeholder="상세 주소" value="${ mem.addr3 }"><br>
			<input type="submit" value="Modify">
		</form>
	</body>
</html>