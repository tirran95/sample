<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kim.donghyeon.ums.domain.User" %>
<%@ page import="kim.donghyeon.ums.service.UserService" %>
<%@ page import="kim.donghyeon.ums.service.UserServiceImpl" %>
<%@ page import="kim.donghyeon.ums.dao.UserDao" %>
<%@ page import="kim.donghyeon.ums.dao.UserDaoImpl" %>  
<br><br>   
<%@ include file="nav.jsp" %>
<%
	UserDao dao=new UserDaoImpl();
	UserService service=new UserServiceImpl(dao);
%>
<!DOCTYPE html>
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
<input id="numFrom" type="text" name="editNum" style="display:none" value="">
	<div class="form-group">
<%	
	if(service.getUserList().size()==0){
		out.print("<h4>등록된 사용자가 없습니다.</h4>");
	}else{
%>		
		<h2>사용자 수정</h2>
		
		<form action="updateProc.jsp">
			<p>수정할 사용자를 체크, 입력란에 이름을 입력하고 수정버튼을 누르세요</p>
			<input name="updateName" style="width:300px;"class="form-control"type="text" placeholder="수정할 이름을 입력하세요">
			<br>
			<input type="submit" value="수정" class="btn btn-success"/>
		
			<div id="home">
			<hr>
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
						<td><input type="radio" name="index" value="<%=tmp.getUserNum()%>"></td>
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
			</div>
		</form>
<%
	}
%>		
	</div>
</div>
</body>
</html>