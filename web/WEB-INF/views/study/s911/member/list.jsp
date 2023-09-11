<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<%@ include file="../default/header.jsp" %>
		<h3>List Page</h3>
		size : ${ list.size() }
		
		<table border="1">
			<thead>
				<tr><th>ID</th> <th>PWD</th> <th>ADDR</th>
			</thead>
			
			<tbody>
				<c:forEach var="dto" items="${ list }">
					<tr>
						<td>
							<a href="info?id=${ dto.id }">
								${ dto.id }
							</a>
						</td>
						<td>${ dto.pw }</td>
						<td>${ dto.addr }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>