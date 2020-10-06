<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
table,th,td {
	border: 1px black solid;
}
table {
	width: 70%;
	border-collapse: collapse;
}
</style>
</head>
<body>
<h2>�����</h2>
<hr>
<table>
	<tr>
		<th>����ȣ</th>
		<th>����</th>
		<th>�ּ�</th>
		<th>��ȭ��ȣ</th>
		<th>�ֹι�ȣ</th>
		<th>�̸���</th>
	</tr>
	<c:forEach var="vo" items="${list }">
		<tr>
			<td>${vo.custid }</td>
			<td>${vo.name }</td>
			<td>${vo.address }</td>
			<td>${vo.phone }</td>
			<td>${vo.jumin }</td>
			<td>${vo.email }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>