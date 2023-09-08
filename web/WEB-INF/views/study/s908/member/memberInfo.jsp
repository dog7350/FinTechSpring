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
				<tr><th>ID</th> <th>PW</th> <th>ADDR</th></tr>
			</thead>
			
			<tbody>
				<c:forEach var="item" items="${ list }">
					<tr>
						<td><a href="/info?id=${ item.id }">${ item.id }</a></td>
						<td>${ item.pw }</td>
						<td>${ item.addr }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<%@ include file="../default/footer.jsp" %>
	</body>
</html>