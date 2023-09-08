<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" type="text/css" href="css/default/header.css" />

<div id="fileHeaderContainer">
	<div id="fileHeaderTitle">
		<a href="/">CARE LAB</a>
	</div>
	
	<hr>
	<div id="fileHeaderNavContainer">
		<nav id="fileHeaderNav">
			<ul>
				<li><a href="/">HOME</a></li>
				
				<c:choose>
					<c:when test="${ sessionScope.user == null }">
						<li><a href="/login">로그인</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="/memberInfo">회원 정보</a></li>
						<li><a href="/logout">로그아웃</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</nav>
	</div>
</div>
<hr>