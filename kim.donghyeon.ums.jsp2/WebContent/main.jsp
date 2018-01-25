<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UMS</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
<H1>UMS</H1>
<hr>
<form>
	<input type="text" id="userName" placeholder="${msg }"/>
	<button type="submit" formaction="user/list.jsp">목록</button>
	<button type="submit" formaction="user/add.jsp">등록</button>
	<button type="submit" formaction="user/update.jsp">수정</button>
	<button type="submit" formaction="user/delete.jsp">삭제</button>
	
	<br><br><h2>사용자 목록</h2>
	<%@ include file="user/table.jsp" %>
</form>
</body>
</html>