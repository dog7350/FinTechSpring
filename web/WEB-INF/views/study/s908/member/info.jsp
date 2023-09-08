<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Spring Day5 Quiz</title>
		
		<style>
			#userTable {
				margin: auto;
				margin-top: 30px;
				margin-bottom: 30px;
				width: 800px;
				border: 1px solid black;
				border-collapse: collapse;
				text-align: center;
			}
			#userTable td, th {
				border: 1px solid black;
				border-collapse: collapse;
			}
		</style>
	</head>
	
	<body>
		<%@ include file="../default/header.jsp" %>
		
		<table id="userTable">
			<thead>
				<tr><th colspan="3" style="font-size: 30pt;">${ info.id }님의 정보</th></tr>
			</thead>
			
			<tbody>
				<tr><th>아이디</th> <td>${ info.id }</td></tr>
				<tr><th>비밀번호</th> <td>${ info.pw }</td></tr>
				<tr><th>주소</th> <td>${ info.addr }</td></tr>
				<tr><td colspan="3"><input type="button" value="회원 수정" onclick="location.href='/modify?id=${ info.id }'"></td></tr>
				<tr><td colspan="3"><input type="button" value="회원 탈퇴" onclick="location.href='/exit?id=${ info.id }'"></td></tr>
			</tbody>
		</table>
		
		<%@ include file="../default/footer.jsp" %>
	</body>
</html>