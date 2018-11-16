<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
	<title>个人中心</title>
		<meta charset="UTF-8">

		<link rel="stylesheet" href="/ssh_cosmetics/css/linearicons.css">
		<link rel="stylesheet" href="/ssh_cosmetics/css/font-awesome.min.css">
		<link rel="stylesheet" href="/ssh_cosmetics/css/bootstrap.css">
		<link rel="stylesheet" href="/ssh_cosmetics/css/owl.carousel.css">
		<link rel="stylesheet" href="/ssh_cosmetics/css/main.css">
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
					<img src="/ssh_cosmetics/img/userm.jpg">
					<h3 style="text-align: center; margin-top: 10px;"></h3>
			    </div>
			    <div class="uesr-xinxi" style="text-align: center; padding-top: 100px;">
			    	<!-- start  显示资料 -->
			    	<div class="content" style="width: 250px;margin: 0 auto">
				    	<h4 style="width: 60px;float: left;">昵称：</h4>
						<h4 style="width: 350px;margin-top: 5px; color: #fb7ba3;"><s:property value="#session.user.nickname"/></h4><br>
						<h4 style="width: 60px;float: left;margin-top: 5px;">性别：</h4>
						<h4 style="width: 350px;margin-top: 5px; color: #fb7ba3;">
							<s:if test="#session.user.sex == true && #session.user.nickname != null">
								男
							</s:if>
							<s:if test="#session.user.sex == false && #session.user.nickname != null">
								女
							</s:if>
						</h4><br>
						<h4 style="width: 60px;float: left;margin-top: 5px;">生日：</h4>
						<h4 style="width: 350px;margin-top: 5px; color: #fb7ba3;">
							<s:date name="#session.user.birthday"  format="yyyy-MM-dd"/>
						</h4><br>
						<h4 style="width: 60px;float: left;margin-top: 5px;">电话：</h4>
						<h4 style="width: 350px;margin-top: 5px; color: #fb7ba3;"><s:property value="#session.user.phone"/></h4><br>
						<h4 style="width: 60px;float: left;margin-top: 5px;">邮箱：</h4>
						<h4 style="width: 350px;margin-top: 5px; color: #fb7ba3;"><s:property value="#session.user.eamil"/></h4><br>
					</div>

					<!-- End  显示资料 -->

					<a href="user_changeUI.action" class="primary-btn load-more pbtn-2 text-uppercase mx-auto mt-60">修改资料</a>
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