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
	
	int i=0;
	String[] indexs = request.getParameterValues("index");
	for(String index:indexs){
		i=Integer.parseInt(index);
		userService.secedeUser(i);	
	}
%>
<jsp:forward page="01.jsp"/>