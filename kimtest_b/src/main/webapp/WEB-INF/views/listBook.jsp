<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>도서목록</h2>
	<hr>
	<table border="1" width="80%">
		<tr>
			<td>도서번호</td>
			<td>도서명</td>
			<td>출판사</td>
			<td>가격</td>
		</tr>
		
		<c:forEach var="b" items="${list }">
			<tr>
				<td>${b.bookid }</td>
				<td>${b.bookname }</td>
				<td>${b.publisher }</td>
				<td>${b.price }</td>
			</tr>
		</c:forEach>
	</table>
	
	
	
</body>
</html>



