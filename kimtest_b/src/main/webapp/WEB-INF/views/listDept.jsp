<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
table, th, td {
	border: 1px black solid;
}
table {
	width: 80%;
}
</style>
</head>
<body>
<h2>�μ����</h2>
<hr>
<table>
	<tr>
		<th>�μ���ȣ</th>
		<th>�μ���</th>
		<th>�μ���ġ</th>
	</tr>
	<c:forEach var="vo" items="${list }">
		<tr>
			<td>${vo.deptno }</td>
			<td>${vo.dname }</td>
			<td>${vo.loc }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>