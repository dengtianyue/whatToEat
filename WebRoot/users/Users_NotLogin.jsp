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
	<title>吃什么 | whatoeat</title>
	<meta name="viewport" content="width=device-width max-scale=1 min-scale=1 user-scale=no">
	<!-- <link rel="stylesheet" type="text/css" href="css/normalize.css"> -->
	<link rel="stylesheet" href="../css/bootstrap.css">
	<link rel="stylesheet" href="../css/index.css">
</head>
<body>
	<!-- 顶栏 -->
	<header>
		<nav class="navbar navbar-default">
			<div class="navbar-header">
				<a href="/users/Users_login_success.jsp" class="navbar-brand">吃什么</a>
				<button type="button" class="navbar-toggle" data-toggle='collapse' data-target='#nav'>
					<span class="sr-only">切换导航</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<div id="nav" class="collapse navbar-collapse">

				<ul class="nav navbar-nav pull-right">
					  <li><a>用户名</a></li>
                      <li><a href="<%=path%>/users/Users_login.jsp">登录</a></li>
                      <li><a href="<%=path%>/users/Users_register.jsp">注册</a></li>
				</ul>
			</div>
		</nav>
	</header>

	<!-- 主页面 -->
	<div id="particles-js" class="container">
		<a href="<%=path%>/foods/Foods_queryWhatoeat2.action"><button class="center-block btn btn-lg btn-primary" >今天吃什么</button></a>

		<!-- 结果（推荐）容器 -->
		<!-- <div class="result">
			<ul>
				<li>红烧肉</li>
				<li>油焖笋</li>
				<li>香椿炒蛋</li>
				<li>锅包肉</li>
			</ul>

		</div> -->
		<!-- 结果（推荐）结束 -->
	</div>
	<!-- 主页面结束 -->
	<div class="sticky"></div>
	<footer>Created By <a href="https://github.com/dengtianyue/">Dengtianyue</a> &amp; <a href="https://github.com/namelessman/">namelessman</a></footer>

	<!-- JavaScript -->
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
	<script type="text/javascript" src='../js/bootstrap.js'></script>
	<script type="text/javascript" src="https://cdn.jsdelivr.net/particles.js/2.0.0/particles.min.js"></script>
	<script type="text/javascript" src='../js/myparticles.js'></script>

</body>
</html>

