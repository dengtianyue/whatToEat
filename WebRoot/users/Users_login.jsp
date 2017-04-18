<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en" class="no-js">

<head>

<meta charset="utf-8">
<title>今天吃什么~~</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<link rel="stylesheet" href="../css/supersized.css">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="../css/login.css">
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
	<script src="js/html5.js"></script>
<![endif]-->
<script src="../js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="../js/jquery.form.js"></script>
<script type="text/javascript" src="../js/tooltips.js"></script>
<!--<script type="text/javascript" src="../js/login.js"></script>-->
</head>

<body>

<div class="page-container">
	<div class="main_box">
		<div class="login_box">
			<div class="login_logo">
				今天吃什么~~~
			</div>

			<div class="login_form">
				<form action="<%=path%>/users/Users_login.action" id="login_form" method="post">
					<div class="form-group">
						<label for="j_username" class="t">账　号：</label>
						<input id="userName" value="" name="userName" type="text" class="form-control x319 in" autocomplete="off">
					</div>
					<div class="form-group">
						<label for="j_password" class="t">密　码：</label>
						<input id="password" value="" name="password" type="password" class="password form-control x319 in">
					</div>
					<div class="form-group space">
						<label class="t"></label>　　　
						<button type="submit"  id="submit_btn" class="btn btn-primary btn-lg">&nbsp;登&nbsp;录&nbsp;</button>
						<a href="<%=path%>/users/Users_register.jsp"><button type="button"  id="submit_btn" class="btn btn-primary btn-lg">&nbsp;注&nbsp;册&nbsp;</button></a>
					</div>
                              <div>
                                     <s:fielderror/> <!-- 显示表单验证的出错信息 -->
                              </div>
				</form>
			</div>
		</div>
	</div>
</div>

<!-- Javascript -->

<script src="../js/supersized.3.2.7.min.js"></script>
<script src="../js/supersized-init.js"></script>



</body>
</html>
