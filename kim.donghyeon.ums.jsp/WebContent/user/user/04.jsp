<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <br><br>
<%@ page import="kim.donghyeon.ums.domain.User" %>
<%@ page import="kim.donghyeon.ums.service.UserService" %>
<%@ page import="kim.donghyeon.ums.service.UserServiceImpl" %>
<%@ page import="kim.donghyeon.ums.dao.UserDao" %>
<%@ page import="kim.donghyeon.ums.dao.UserDaoImpl" %>      
<%@ include file="nav.jsp" %>
<!DOCTYPE html>
<%
	UserDao dao=new UserDaoImpl();
	UserService service=new UserServiceImpl(dao);
%>
<html lang="ko">
<head>
<title>main</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>
<div class="container">
<%	
	if(service.getUserList().size()==0){
		out.print("<h4>등록된 사용자가 없습니다.</h4>");
	}else{
%>		
	
		<h2>사용자 탈퇴</h2>
		<p>탈퇴할 사용자들의 버튼을 체크하고,삭제버튼을 누르세요.</p>
		<br>
		
	<form action="delProc.jsp">
	<input class="btn btn-danger" type="submit" value="삭제"/>
		<div id="list">
			<table class="table table-hover">
				<thead>
						<tr>
							<th></th>
							<th>번호</th>
							<th>이름</th>
							<th>등록일</th>
						</tr>
					</thead>
					<tbody id="userTable">
				<%
					for(User tmp:service.getUserList()){
				%>
					<tr>
						<td><input type="checkbox" name="index" value="<%=tmp.getUserNum()%>"></td>
						<td><%=tmp.getUserNum() %></td>
						<td><%=tmp.getUserName() %></td>
						<td><%=tmp.getRegDate() %></td>
					</tr>
				<%
					}
				%>
					</tbody>
			</table>
		</div>
	</form>
<%
	}
%>
</div>
</body>
</html>