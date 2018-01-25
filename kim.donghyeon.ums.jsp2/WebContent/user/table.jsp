<%@page import="kim.donghyeon.ums.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kim.donghyeon.ums.service.UserService" %>
<%@ page import="kim.donghyeon.ums.service.UserServiceImpl" %>
<%@ page import="java.util.List" %>  
<% 
	UserService userService=new UserServiceImpl(); 
	List<User> userList=userService.getUsers();
%>  
<!DOCTYPE html>
<table>
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>등록일</th>
	</tr>
<% 
	for(User user:userList){
%>
	<tr>
		<td><input type="radio" id="userNo" value="<%= user.getUserNo() %>"/><%= user.getUserNo() %></td>
		<td><%= user.getUserName() %></td>
		<td><%= user.getRegDate() %></td>
	</tr>
<%
	}
%>
</table>