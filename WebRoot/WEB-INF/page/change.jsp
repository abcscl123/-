<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
	<!-- Site Title -->
	<title>个人中心</title>
	<!-- meta character set -->
		<meta charset="UTF-8">

		<link rel="stylesheet" href="/ssh_cosmetics/css/linearicons.css">
		<link rel="stylesheet" href="/ssh_cosmetics/css/font-awesome.min.css">
		<link rel="stylesheet" href="/ssh_cosmetics/css/bootstrap.css">
		<link rel="stylesheet" href="/ssh_cosmetics/css/owl.carousel.css">
		<link rel="stylesheet" href="/ssh_cosmetics/css/main.css">
		
		<script type="text/javascript" src="/ssh_cosmetics/js/jquery-3.3.1.min.js"></script>
		<script type="text/javascript" src="/ssh_cosmetics/js/tools.js"></script>
		<script type="text/javascript">
			$(function(){
				//创建下拉框内数据
				var birthday = new Date($("#birthday").attr("value"));
				for(var i = 1900;i<new Date().getFullYear()+3;i++){
		           var option = $("<option></option>");
		           option.attr("value",i);
				   if(i == birthday.getFullYear()){
				   		option.attr("selected",true);
				   }
				   option.text(i);
				   $("#year").append(option);
				}
				for(var i = 1;i<13;i++){
		           var option = $("<option></option>");
		           option.attr("value",i);
		           if(i == birthday.getMonth()+1){
				   		option.attr("selected",true);
				   }
				   option.text(i);
				   $("#month").append(option);
				}
				var dayLength = 0;
				if(new Date().getMonth()+1 == 1 || new Date().getMonth()+1 == 3 ||
				   new Date().getMonth()+1 == 5 || new Date().getMonth()+1 == 7 ||
				   new Date().getMonth()+1 == 8 || new Date().getMonth()+1 == 10 ||
				   new Date().getMonth()+1 == 12
				){
					dayLength = 31;
				} else if(new Date().getMonth()+1 == 2){
					if(new Date().getFullYear()/4 != 0 || new Date().getFullYear()/400 != 0){
						dayLength = 28;
					} else {
						dayLength = 29;
					}
				} else {
					dayLength = 30;
				}
				for(var i = 1;i<dayLength;i++){
		           var option = $("<option></option>");
		           option.attr("value",i);
		           if(i == birthday.getDate()){
				   		option.attr("selected",true);
				   }
				   option.text(i);
				   $("#day").append(option);
				}
				
				//获取下拉框数据，保存到隐藏域中
				$("#year option,#month option,#day option").click(function(){
					var date = $("#year option:selected").val() + "-" 
								+ $("#month option:selected").val() + "-"
								+ $("#day option:selected").val();
					$("#birthday").attr("value",date);
				})
				
				//判断性别
				if($("#sex").attr("value") == "男"){
					$("#man").attr("checked","checked");
				} else {
					$("#woman").attr("checked","checked");
				}

				//提交表单
				$("#submit").click(function(){
					$("input").css("color", "black");
					
					var is_submit = true;
					
					var name = $("#name").val();
					var phone = $("#phone").val();
					var email = $("#email").val();
					//前端验证
					var name_res = /^[\u4e00-\u9fa5a-zA-Z0-9_]{3,8}$/;
					var phone_res = /^0?(13|14|15|17|18|19)[0-9]{9}$/;
					var email_res = /\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/;
					if(Verification(name_res, name) == false){
						//$("#name").val(name + "     (昵称支持3-8位中英文)");
						$("#name").css("color", "red");
						is_submit = false;
					}
					if(Verification(phone_res, phone) == false){
						//$("#phone").val(phone + "     (请输入正确的电话号码)");
						$("#phone").css("color", "red");
						is_submit = false;
					}
					if(Verification(email_res, email) == false){
						//$("#email").val(email + "     (请输入正确的邮箱)");
						$("#email").css("color", "red");
						is_submit = false;
					}
					
					if(is_submit){
						$("form").submit();
					}
					
				})
				/* $(".user-haeder img").mouseover(function(){
					$(".over").fadeIn().animate({opacity: "0.5"});
					$(".add").fadeIn().css("z-index",100);
				})
				$(".over").mouseout(function(){
					$(this).animate({opacity: "0",zIndex:"110"});
					$(".add").css("z-index",-5);
				}) */
			})
		</script>
</head>
<body>
<!-- Start Header Area -->
	<header class="default-header"  style="position:absolute;top:-70px;">
		<nav class="navbar navbar-expand-lg navbar-light">
			<div class="container">
				  <a class="navbar-brand" href="index.html">
				  	<img src="/ssh_cosmetics/img/sshLOGO.png" alt="">
				  </a>
				  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
				    <span class="navbar-toggler-icon"></span>
				  </button>

				  <div class="collapse navbar-collapse justify-content-end align-items-center" id="navbarSupportedContent">
				    <ul class="navbar-nav">
						<li><a href="/ssh_cosmetics/user/user_indexUI.action">首页</a></li>
						<li><a href="/ssh_cosmetics/cosmetic/cosmetic_cosmeticUI.action">种草秘籍</a></li>
						<!-- <li><a href="tuijian.html">必选推荐</a></li> -->
						<li><a href="/ssh_cosmetics/test/test_testUI.action">测试皮肤</a></li>
						<li><a href="/ssh_cosmetics/user/user_userUI.action" target="_self">个人中心</a></li>
						<!-- <li><a href="htmls/login.html" target="_blank">登录</a></li> -->
						 <!-- Dropdown -->
                                <li class="dropdown">
                                  <a class="dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                                    更多
                                  </a>
                                  <div class="dropdown-menu">
                                    <a class="dropdown-item" href="/ssh_cosmetics/user/user_searchUI.action">搜索</a>
                                    <s:if test="#session.user == null">
	                                    <a class="dropdown-item" href="/ssh_cosmetics/user/user_registrUI.action">注册</a>
	                                    <a class="dropdown-item" href="/ssh_cosmetics/user/user_loginUI.action">登录</a>
                                    </s:if>
                                  </div>
                                </li>   								
				    </ul>
				  </div>						
			</div>
		</nav>
	</header>
	<!-- End Header Area -->

	<!-- start banner Area -->
	<section class="user-banner" data-parallax="scroll">
		<div class="user-bg">
			<div class="user-container">
				<div class="user-haeder">
					<a href="#"><img src="/ssh_cosmetics/img/userm.jpg" style="width:100px;height:100px;"></a>
					<!-- <div class="add">+</div>
					<div class="over"><a href="#"></a></div>	 -->
					<h3 style="text-align: center; margin-top: 10px;"></h3>
			    </div>
			    <div class="uesr-xinxi" style="text-align: center;">
					<form action="user_change.action" method="post">
						<input type="hidden" name="user.id" value="<s:property value="#session.user.id"/>">
						<input type="hidden" name="user.name" value="<s:property value="#session.user.name"/>">
						<input type="hidden" name="user.password" value="<s:property value="#session.user.password"/>">
						<input type="hidden" name="user.type" value="<s:property value="#session.user.type"/>">
				    	<!-- start  修改资料 -->
				    	<h4 style="width: 60px;float: left;margin-top: 5px; over-float:hidden;">昵称：</h4>
			 			<input class="xinxi-input" type="text" name="user.nickname" id="name" value="<s:property value="#session.user.nickname"/>">
						<div style=" height:80px;">
							<h4 style="width: 60px;float: left;margin-top: 5px;">性别：</h4>	
	
							<input type="hidden" name="sex" id="sex" value="<s:if test="#session.user.sex == true">男</s:if><s:if test="#session.user.sex == false">女</s:if>">
							<input style="float: left;margin:10px;" type="radio" name="user.sex" value="男" id="man" ><h5 style="float:left; margin:5px;">男</h5> 
							<input style="float: left;margin:10px;" type="radio" name="user.sex" value="女" id="woman"><h5 style="float:left; margin:5px;">女</h5>
							<input style="border-bottom-color:#fff;" class="xinxi-input" type="text" name="user.sex" value="<s:if test="#session.user.sex == true">男</s:if><s:if test="#session.user.sex == false"></s:if>">
						</div>
						<h4 style="width: 60px;float: left;margin-top: 5px;">生日：</h4>
						<s:if test="#session.user.birthday == null">
							<input type="hidden" value="<s:date name="#session.date" format="yyyy-MM-dd"/>" id="birthday" name="user.birthday">
						</s:if>
						<s:if test="#session.user.birthday != null">
							<input type="hidden" value="<s:date name="#session.user.birthday" format="yyyy-MM-dd"/>" id="birthday" name="user.birthday">
						</s:if>
						<select id="year"  style="float: left;margin-top: 5px; margin-right:10px; margin-bottom:50px;"></select>
						<select id="month" style="float: left;margin-top: 5px; margin-right:10px; margin-bottom:50px;"></select>
						<select id="day" style="float: left;margin-top: 5px; margin-right:10px; margin-bottom:50px;"></select>
						<input class="xinxi-input" type="text" name="user.phone" id="phone" value="<s:property value="#session.user.phone"/>">
						<h4 style="width: 60px;float: left;margin-top: 5px; over-float:hidden;">电话：</h4>
						<input class="xinxi-input" type="text" name="user.eamil" id="email" value="<s:property value="#session.user.eamil"/>">
						<h4 style="width: 60px;float: left;margin-top: 5px; over-float:hidden;">邮箱：</h4>
						<%-- <input class="xinxi-input" type="text" name="user.eamil" id="email" value=""> --%>
	
						<a href="#" class="primary-btn load-more pbtn-2 text-uppercase mx-auto mt-60" id="submit">完成</a>
				    </form>	
			    </div>

			</div>
		</div>
	</section>

	<!-- End banner Area -->



	<!-- start footer Area -->		
			<footer class="footer-area section-gap" style="position: absolute;top: 1300px; padding: 5px; width: 100%;height: 200px;">
				<div class="container">
					<div class="row">
					<div class="row footer-bottom d-flex justify-content-between">
						
						<p class="col-lg-8 col-sm-12 footer-text">Copyright &copy;<!-- <script>document.write(new Date().getFullYear());</script> --> All rights reserved | made with Colorlib -  More Templates <a href="#" target="_blank" title="模板之家">护肤专家</a> - Collect from <a href="#" title="网页模板" target="_blank">更多了解</a></p>
					</div>
				</div>
			</footer>
			<!-- End footer Area -->

</body>
</html>