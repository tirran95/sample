<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kim.donghyeon.ums.domain.User" %>
<%@ page import="kim.donghyeon.ums.service.UserService" %>
<%@ page import="kim.donghyeon.ums.service.UserServiceImpl" %>
<%@ page import="kim.donghyeon.ums.dao.UserDao" %>
<%@ page import="kim.donghyeon.ums.dao.UserDaoImpl" %>   
<%@ page import="java.util.List" %>

<%
	UserDao userDao=new UserDaoImpl();
	UserService userService=new UserServiceImpl(userDao);
	
	String userName=request.getParameter("userName");
	userService.joinUser(userName);
%>
<!DOCTYPE html>
<script>
	alert("사용자 등록 성공");
</script>
<jsp:forward page="01.jsp"/>