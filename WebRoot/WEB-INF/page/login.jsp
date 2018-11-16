<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<title>登录</title>
	<link rel="stylesheet" type="text/css" href="/ssh_cosmetics/css/login.css">
	<script type="text/javascript" src="/ssh_cosmetics/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="/ssh_cosmetics/js/tools.js"></script>
	<script type="text/javascript">
		$(function(){
			var name_res = /[\u4e00-\u9fa5a-zA-Z0-9_]{3,8}/;
			var password_res = /^[a-zA-Z0-9_]{6,16}$/;
			var is_submit = false;
			
			$("#user").blur(function(){
				var name = $("#user").val();
				var name_result = Verification(name_res, name);
				if(name_result == false){
					$("#message").text("请输入正确的用户名");
				} else {
					is_submit = true;
				}
			})
			
			$("#password").blur(function(){
				var password = $("#password").val();
				var password_result = Verification(password_res, password);
				if(password_result == false){
					$("#message").text("请输入正确的密码");
				} else {
					is_submit = true;
				}
			})
			
			$("#login").click(function(){
				if(is_submit){
					$("form").submit();
				}
			})
			
			$("span[class='span2']").mouseenter(function(){
				$(this).css("color", "blue");
			})
			
			$("span[class='span2']").mouseout(function(){
				$(this).css("color", "black");
			})
		})
	</script>
</head>
<body>
<div class="header">
	<img class="logo" src="/ssh_cosmetics/img/sshLOGO.png" width="40px" height="40px;" style="padding: 10px;">
</div>
<div class="container">
	<div class="container_middle">
		<div class="container_right">
			<h3 class="title">登录商城</h3>
			<div class="login_form">
				<form action="user_login.action" method="post">
					<p id="message" style='color:red'></p>
					<div class="user-name">
						<input name="user.name" id="user" placeholder="邮箱/手机/用户名" type="text">
                 	</div>
                 	<div class="user-pass">
						<label for="password"></label>
						<input name="user.password" id="password" placeholder="请输入密码" type="password">
                 	</div>
					<span class="span1"><input type="checkbox">记住密码</span>
					<span class="span2" style='cursor: pointer'>忘记密码</span>
				</form>
				<div class="btn1">
					<span class="span3"><a href="#" id="login">登录</a></span>
					<span class="span4"><a href="user_registrUI.action">注册</a></span>
				</div>
			</div>
			<div class="right_bottom">
				<span class="span5">合作账号</span>
				<ul class="right_bottom_list">
					<li>QQ登录</li>
					<li>微信登录</li>
					<li>微博登录</li>
				</ul>
			</div>
		</div>
	</div>
</div>
<div class="footer">
	<div class="footer_top">
	</div>
	<div class="footer_bottom">
		<p>Copyright &copy; All rights reserved | made with Colorlib -  More Templates <a href="#" target="_blank" title="模板之家">护肤专家</a> - Collect from <a href="#" title="网页模板" target="_blank">更多了解</a></p>
	</div>
</div>
</body>
</html>