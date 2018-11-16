<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<title>注册</title>
	<link rel="stylesheet" type="text/css" href="/ssh_cosmetics/css/register.css">
	<script type="text/javascript" src="/ssh_cosmetics/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="/ssh_cosmetics/js/tools.js"></script>
	<script type="text/javascript">
		$(function(){
			var name_res = /^[\u4e00-\u9fa5a-zA-Z0-9_]{3,8}$/;
			var password_res = /^[a-zA-Z0-9_]{6,16}$/;
			var is_submit = false;
			
			$("input[placeholder='请输入账号'],input[placeholder='设置密码'],input[placeholder='确认密码']").blur(function(){
				$("#message").text("");
				var name = $("input[placeholder='请输入账号']").val();
				var name_result = Verification(name_res, name);
				var password = $("input[placeholder='设置密码']").val();
				var password_result = Verification(password_res, password);
				var repassword = $("input[placeholder='确认密码']").val();
				var repassword_result = password==repassword?true:false;
				
				if(name_result == false){
					$("#message").append("账号支持3-8位中英文<br>");
					is_submit = false;
				}
				if (password_result == false) {
					$("#message").append("密码支持3-16位字母数字下划线<br>");
					is_submit = false;
				}
				if (repassword_result == false) {
					$("#message").append("两次密码不相同<br>");
					is_submit = false;
				}
				
				if(name_result && password_result && repassword_result){
					is_submit = true;
				}
			})
			
			$("#register").click(function(){
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
	<img class="logo" src="../img/sshLOGO.png" width="40px" height="40px;" style="padding: 10px;">
</div>
<div class="container">
	<div class="container_middle">
		<div class="container_right">
			<h3 class="title1"><a class="title1_a" href="#">邮箱注册</a></h3>
			<h3 class="title2"><a class="title2_a" href="#">手机号注册</a></h3>
			<div class="login_form">
				<p id="message" style='color:red'></p>
				<form action="user_register.action" method="post">
					<div class="user-name">
						<input name="user.name" id="user" placeholder="请输入账号" type="text">
                 	</div>
                 	<div class="user-pass">
						<label for="password"></label>
						<input name="user.password" id="password" placeholder="设置密码" type="password">
                 	</div>
                 	<div class="user-repeat">
						<label for="password_repeat"></label>
						<input name="" id="password" placeholder="确认密码" type="password">
                 	</div>
				</form>
				<div class="btn1">
					<span class="span4"><a href="#" id="register">注册</a></span>
				</div>
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