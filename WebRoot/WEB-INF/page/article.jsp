<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>种草秘籍</title>
		<link rel="stylesheet" href="/ssh_cosmetics/css/linearicons.css">
		<link rel="stylesheet" href="/ssh_cosmetics/css/font-awesome.min.css">
		<link rel="stylesheet" href="/ssh_cosmetics/css/bootstrap.css">
		<link rel="stylesheet" href="/ssh_cosmetics/css/owl.carousel.css">
		<link rel="stylesheet" href="/ssh_cosmetics/css/main.css">
</head>
<body>
<!-- Start Header Area -->
	<header class="default-header">
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
	<!-- Start fashion Area -->
	<section class="fashion-area section-gap" id="fashion">
		<div class="container">
			<div class="row d-flex justify-content-center">
				<div class="menu-content pb-70 col-lg-8">
					<div class="title text-center">
						<h1 class="mb-10"><s:property value="#request.cosmetic.name"/></h1>
						<img src="/ssh_cosmetics/img/line.png">
						<p><s:property value="#request.cosmetic.describes"/></p>
					</div>
				</div>
			</div>	
			<div class="row" style="margin: 0 auto">
				<s:iterator value="#request.cosmetic.imageSet" var="image">
					<s:if test="#image.is_cosmeticImage == true">
						<img style="width:600px;height:600px;" class="test" src=<s:property value="#image.path"/>>
					</s:if>
				</s:iterator>
				<s:iterator value="#request.cosmetic.imageSet" var="image">
					<s:if test="#image.is_cosmeticImage == false">
						<img style="width:600px;height:600px;"class="test" src=<s:property value="#image.path"/>>
					</s:if>
				</s:iterator>
				<!-- <h5 style="margin-top: 20px;margin-bottom: 20px;">什么方法可以快速美白？</h5><br>
				<p style="color: #000; font-weight: 400; margin-bottom: 20px;">美白需要“吃”出来的，为什么会这么说呢?你吃的食物对于你肌肤的吸收是很有影响的，维他命c、矿物质以及维他命a都是对于美白很有作用的，所以我们在饮食方面上一定是要注意的。最好的方法就是先以生食为主。</p><br>

				<p style="color: #000; font-weight: 400; margin-bottom: 20px;">精油可以让皮肤更加美白。你自己使用的美白护肤品加上芳香的精油是可以让你的肌肤快速的得到美白效果的。那么对于精油你是可以去购买的，也是可以去自制精油的，不管是选择的哪一种，其实在精油里都是含有很多的维生素c，可以促进我们肌肤的一个弹性以及活力。</p><br>

				<p style="color: #000; font-weight: 400; margin-bottom: 20px;">生活细节可以让你更加美白，平时的时候多多注意生活中的小细节。对于淘米水来洗脸，我们这个是很多的女孩子都使用过的吧。那么其实每次做饭之前我们都是要取一些淘米水的，然后你需要做的就是坚持使用，不能今天使用，然后过些天再洗脸。一定要坚持才能看到效果。</p><br>

				<p style="color: #000; font-weight: 400; margin-bottom: 20px;">睡觉前学会护肤，在每天睡觉前的时候一定要知道如何护肤，尤其是在秋天来临的时刻，睡前美白护肤是很有好处的，晚上制作一些面膜坚持使用才是好的。有的时候，你也是可以选择使用护肤品美白面膜之类的都是可以的。我相信慢慢通过调理，你的肌肤会越来越好的。</p><br>

				<p style="color: #000; font-weight: 400; margin-bottom: 20px;">每次在洗脸的时候一定要注意多点细节的，在秋季时刻，天气是慢慢的变冷的，所以先用温水去洗脸，然后再用冷水去洗脸可以让肌肤的毛孔变小，对于脸部肌肤很有好处。在洗完了脸之后，如果可以的话，可以将养乐多轻轻的敷在脸上的，让自己的皮肤慢慢去吸收营养。</p><br>
 -->
				<!-- <h5 style="color: #d3d3d3;">评价：</h5>
				<input class="say" type="text" name="">
				<a href="#" class="say-a">发表</a>
				<div class="them">
					<h5>Adam</h5>
					<p>hahaha</p><br>
					<h5>Adam</h5>
					<p>hahaha</p><br>
					<h5>Adam</h5>
					<p>hahaha</p><br>
					<h5>Adam</h5>
					<p>hahaha</p><br>
				</div> -->
			</div>		
		</div>	
	</section>

	<!-- start footer Area -->		
			<footer class="footer-area section-gap" style=" padding: 5px; width: 100%;height: 200px;">
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