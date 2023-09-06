<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>QUIZ LIST</title>
	</head>
	
	<body>
		<h1>회원 목록</h1>
		<table border="1">
			<thead>
				<tr><th>ID</th> <th>PW</th> <th>이름</th></tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${ list }">
					<tr>
						<td>${ item.id }</td>
						<td>${ item.pw }</td>
						<td><a href="content?id=${ item.id }">${ item.name }</a></td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="3"><a href="insert">회원 정보 등록</a></td>
				</tr>
			</tbody>
		</table>
	</body>
</html>