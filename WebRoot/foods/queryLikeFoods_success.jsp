<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="UTF-8">
	<title>今天吃什么</title>
</head>
<body>
	
	

	<div class="user">
		<span>username</span>
		<a href="<%=path%>/foods/Foods_queryLikeFoods.action">喜欢</a>
		<a href="<%=path%>/foods/Foods_queryDislikeFoods.action">不喜欢</a>
		<a href="<%=path%>/users/Users_login_success.jsp">返回首页</a>
	</div>
	
	<!-- 遍历开始 -->
	<s:iterator value="#session.LikeFoods_list" var="qlfood">
	<tr class="qlfood">
		<td><s:property value="#qlfood"/></td>
	</tr>
	</s:iterator>
	<!-- 遍历结束 -->
</body>
</html>