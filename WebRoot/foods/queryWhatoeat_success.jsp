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
				<a href="<%=path%>/users/Users_login_success.jsp" class="navbar-brand">吃什么</a>
				<button type="button" class="navbar-toggle" data-toggle='collapse' data-target='#nav'>
					<span class="sr-only">切换导航</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<div id="nav" class="collapse navbar-collapse">
			<!-- 	<ul class="nav navbar-nav">
					<li><a href="#">吃</a></li>
					<li><a href="#">什</a></li>
					<li><a href="#">么</a></li>

				</ul> -->
				<ul class="nav navbar-nav pull-right">
					<li><a>${sessionScope.loginUserName}</a></li>
                      		<li><a href="<%=path%>/foods/Foods_queryLikeFoods.action">喜欢</a></li>
                      		<li><a href="<%=path%>/foods/Foods_queryDislikeFoods.action">不喜欢</a></li>
				</ul>
			</div>
		</nav>
	</header>
	<!-- 顶栏结束 -->
	<!-- 轮播 -->
<!-- 	<div class="carousel slide">
		<div class="carousel-inner">
			<div class="item active">
				<img src="http://img.hb.aicdn.com/509a89e818298c0a41a556c4bf013e963710e94cc7387-XweFQW_fw658" alt="">
			</div>
		</div>
	</div> -->
	<!-- 轮播结束 -->

	<!-- 主页面 -->
	<div id="particles-js" class="container">
		<a href="<%=path%>/foods/Foods_queryWhatoeat.action"><button class="center-block btn btn-lg btn-primary">再来一次</button></a>

		<!-- 结果（推荐）容器 -->
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
	<script type="text/javascript" src='../js/myparticles.js'></script>

<style>
	.container .btn{
		position: absolute;
		top:10%;
		left: 50%;
		margin-left: -53px;
		opacity: 0;
		animation: show 2s 1s forwards;
	}
	.result{
		animation: show 1s 0.5s forwards;
	}
	@keyframes show{
		0%{opacity:0}
		100%{opacity: 1;}
	}
</style>
<script>
</script>
</body>
</html>

