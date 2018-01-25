<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kim.donghyeon.ums.domain.User" %>
<%@ page import="kim.donghyeon.ums.service.UserService" %>
<%@ page import="kim.donghyeon.ums.service.UserServiceImpl" %>
<%@ page import="kim.donghyeon.ums.dao.UserDao" %>
<%@ page import="kim.donghyeon.ums.dao.UserDaoImpl" %>      
<!DOCTYPE html>
<%
	UserDao userDao=new UserDaoImpl();
	UserService userService=new UserServiceImpl(userDao);
	
	int userNum=Integer.parseInt(request.getParameter("index"));
	String updateName=request.getParameter("updateName");
	
	userService.corructUser(userNum, updateName);
%>
<jsp:forward page="01.jsp"/>