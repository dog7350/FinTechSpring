<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<c:forEach var="dto" items="${ list }">
			ID : ${ dto.id }<br>
			NAME : ${ dto.name }<br>
			ImgName : ${ dto.imgName }<br>
			<img src="download?file=${ dto.imgName }" width="100" height="100"><br>
			<a href="download?file=${ dto.imgName }">${ dto.imgName }</a><br>
			<a href="modify_view?file=${ dto.imgName }&id=${ dto.id }">수정</a>
				> 수정버튼 클릭 시 modify_view.jsp 이동 후 내용 수정 가능하게 만드세요.<br>
			<a href="download?file=${ dto.imgName }&id=${ dto.id }">삭제</a><br>
			<br><hr><br>
		</c:forEach>
		<a href="form">업로드로 이동</a>
	</body>
</html>