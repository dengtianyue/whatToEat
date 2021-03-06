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
				<a href="/" class="navbar-brand">吃什么</a>
				<button type="button" class="navbar-toggle" data-toggle='collapse' data-target='#nav'>
					<span class="sr-only">切换导航</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<div id="nav" class="collapse navbar-collapse">

				<ul class="nav navbar-nav pull-right">
                      <li><a href="<%=path%>/foods/Foods_queryLikeFoods.action">喜欢</a></li>
                      <li><a href="<%=path%>/foods/Foods_queryDislikeFoods.action">不喜欢</a></li>
				</ul>
			</div>
		</nav>
	</header>

	<!-- 主页面 -->
	<div id="particles-js" class="container">
		<button class="center-block btn btn-lg btn-primary">今天吃什么</button>

		<div class="result">
			<ul>
			<s:iterator value="#session.Whatoeat_list" var="qfood">
				<li><s:property value="#qfood.foodName"/>
					<ul>
						<a href="<%=path%>/foods/Foods_addLikeFoods.action?foodName=<s:property value="#qfood.foodName"/>"><li class="like">喜欢</li></a>
						<a href="<%=path%>/foods/Foods_addDislikeFoods.action?foodName=<s:property value="#qfood.foodName"/>"><li class="dislike">不喜欢</li></a>
					</ul>
				</li>
			</s:iterator>
			</ul>


		</div>
		<!-- 结果（推荐）结束 -->
	</div>
	<!-- 主页面结束 -->
	<div class="sticky"></div>
	<footer>Created By <a href="https://github.com/dengtianyue/">Dengtianyue</a> &amp; <a href="https://github.com/namelessman/">namelessman</a></footer>


	<!-- JavaScript -->
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
	<script type="text/javascript" src='../js/bootstrap.js'></script>
	<script type="text/javascript" src="https://cdn.jsdelivr.net/particles.js/2.0.0/particles.min.js"></script>
	<script type="text/javascript" src="../js/index.js"></script>

</body>
</html>