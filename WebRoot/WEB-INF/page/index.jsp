<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html lang="zxx" class="no-js">
	<head>
		<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Favicon-->
		<link rel="shortcut icon" href="/ssh_cosmetics/img/fav.png">
		<!-- Author Meta -->
		<meta name="author" content="colorlib">
		<!-- Meta Description -->
		<meta name="description" content="">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		<!-- meta character set -->
		<meta charset="UTF-8">
		<!-- Site Title -->
		<title>护肤网</title>

		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
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
						<li><a href="#home">首页</a></li>
                        <li><a href="#news">种草秘籍</a></li>
                        <li><a href="#travel">必选推荐</a></li>
                        <li><a href="#fashion">测试皮肤</a></li>
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
			<section class="banner-area relative" id="home" data-parallax="scroll" data-image-src="/ssh_cosmetics/img/header-bg.jpg">
				<div class="overlay-bg overlay"></div>
				<div class="container">
					<!-- <input class="input-search" type="search" name="search" placeholder="搜索" autocomplete="off"> -->
					<div class="row fullscreen">
						<div class="banner-content d-flex align-items-center col-lg-12 col-md-12">
							<h1>
								2018年秋季最佳化妆品 <br>
								排名趋势.							
							</h1>
						</div>	
						<div class="head-bottom-meta d-flex justify-content-between align-items-end col-lg-12">
							<div class="col-lg-6 flex-row d-flex meta-left no-padding">
								<!-- <p><span class="lnr lnr-heart"></span> 100 喜欢</p>
								<p><span class="lnr lnr-bubble"></span> 89 评论</p> -->
							</div>
							<div class="col-lg-6 flex-row d-flex meta-right no-padding justify-content-end">
								<div class="user-meta">
									<h4 class="text-white">Mark wiens</h4>
									<p>10 Jan, 2018 11:21 am</p>
								</div>
								<img class="img-fluid user-img" src="/ssh_cosmetics/img/user.jpg" alt="">
							</div>
						</div>												
					</div>
				</div>
			</section>
			<!-- End banner Area -->	


			<!-- Start category Area -->
			<section class="category-area section-gap" id="news">
				<div class="container" style="text-align: center;">
					<div class="row d-flex justify-content-center">
						<div class="menu-content pb-70 col-lg-8">
							<div class="title text-center">
								<h1 class="mb-10">种草秘籍</h1>
								<img src="/ssh_cosmetics/img/line.png">
								<p>想了解最新，最好的护肤品吗？那就来看看吧！</p>
							</div>
						</div>
					</div>						
					<div class="active-cat-carusel">
						<div class="item single-cat">
							<a href="/ssh_cosmetics/cosmetic/cosmetic_cosmeticUI.action"><img src="/ssh_cosmetics/img/c1.jpg" alt=""></a>
							<p class="date">1 Jan 2018</p>
							<h4><a href="article.html">什么方法可以快速美白？</a></h4>
						</div>
						<div class="item single-cat">
							<a href="/ssh_cosmetics/cosmetic/cosmetic_cosmeticUI.action"><img src="/ssh_cosmetics/img/c2.jpg" alt=""></a>
							<p class="date">5 Jan 2018</p>
							<h4><a href="#">你知道如何保护你的指甲吗?</a></h4>
						</div>
						<div class="item single-cat">
							<a href="/ssh_cosmetics/cosmetic/cosmetic_cosmeticUI.action"><img src="/ssh_cosmetics/img/c3.jpg" alt=""></a>
							<p class="date">10 Jan 2018</p>
							<h4><a href="#">2018年秋季最佳化妆品排名趋势</a></h4>
						</div>							
					</div>	
					<a href="/ssh_cosmetics/cosmetic/cosmetic_cosmeticUI.action" class="primary-btn load-more pbtn-2 text-uppercase mx-auto mt-60">- 更多秘籍 - </a>
				</div>	

			</section>
			<!-- End category Area -->
			
			<!-- Start travel Area -->
			<section class="travel-area section-gap" id="travel">
				<div class="container">
					<div class="row d-flex justify-content-center">
						<div class="menu-content pb-70 col-lg-8">
							<div class="title text-center">
								<h1 class="mb-10">必选推荐</h1>
								<img src="/ssh_cosmetics/img/line.png">
								<p>浏览他人经验，找到属于自己的护肤品</p>
							</div>
						</div>
					</div>						
					<div class="row">
						<div class="col-lg-6 travel-left">
							<div class="single-travel media pb-70">
							  <img class="img-fluid d-flex  mr-3" src="/ssh_cosmetics/img/t1.jpg" alt="">
							  <div class="dates">
							  	<span>2</span>
							  	<p>Dec</p>
							  </div>
							  <div class="media-body align-self-center">
							    <h4 class="mt-0"><a href="#">超详细/我的混油皮粉底液推荐</a></h4>
							    <p>今天想和大家分享一下我常用的粉底液<br>
							       我是冬混干夏混油<br>
							       尤其到了夏天 T区特别容易出油脱妆<br>
							       后来意识到不同的粉底液有不同的功效<br>
							       所以会根据季节和当日皮肤状态来选择不同种类...</p>
								<div class="meta-bottom d-flex justify-content-between">
									<p><span class="lnr lnr-heart"></span> 18 喜欢</p>
									<p><span class="lnr lnr-bubble"></span> 10 评论</p>
								</div>							 
							  </div>
							</div>
							<div class="single-travel media">
							  <img class="img-fluid d-flex  mr-3" src="/ssh_cosmetics/img/t3.jpg" alt="">
							  <div class="dates">
							  	<span>10</span>
							  	<p>Dec</p>
							  </div>							  
							  <div class="media-body align-self-center">
							    <h4 class="mt-0"><a href="#">混合油性皮肤怎么护理</a></h4>
							    <p>现在有混合油性性皮肤的人群在呈现一个上升的趋势<br>
							       由于压力大也会逐渐形成混合性的皮肤<br>
							       对于混合性的皮肤，脸颊部位和嘴唇两边是干燥的<br>
							       额头鼻子是油油的，下颚处也会经常起小的粉刺<br>
							       且毛孔粗大...</p>
								<div class="meta-bottom d-flex justify-content-between">
									<p><span class="lnr lnr-heart"></span> 16 喜欢</p>
									<p><span class="lnr lnr-bubble"></span> 5 评论</p>
								</div>							 
							  </div>
							</div>														
						</div>
						<div class="col-lg-6 travel-right">
							<div class="single-travel media pb-70">
							  <img class="img-fluid d-flex  mr-3" src="/ssh_cosmetics/img/t2.jpg" alt="">
							  <div class="dates">
							  	<span>18</span>
							  	<p>Dec</p>
							  </div>							  
							  <div class="media-body align-self-center">
							    <h4 class="mt-0"><a href="#">适合混合皮的水乳</a></h4>
							    <p>我给你们介绍干皮、油皮<br>
							       春、夏、秋、冬一年四季<br>
							       都给你们一一介绍过了<br>
							       但是很多混合皮就不开心了<br>
							       为毛从没单独说过混合皮...</p>
								<div class="meta-bottom d-flex justify-content-between">
									<p><span class="lnr lnr-heart"></span> 10 喜欢</p>
									<p><span class="lnr lnr-bubble"></span> 02 评论</p>
								</div>							 
							  </div>
							</div>
							<div class="single-travel media">
							  <img class="img-fluid d-flex  mr-3" src="/ssh_cosmetics/img/t4.jpg" alt="">
							  <div class="dates">
							  	<span>20</span>
							  	<p>Dec</p>
							  </div>							  
							  <div class="media-body align-self-center">
							    <h4 class="mt-0"><a href="#">推荐这些精华非常适合混油皮的人</a></h4>
							    <p>兰蔻【小黑瓶】面部精华肌底液，坚持使用<br>
							       真的有效果，皮肤会慢慢变得很滑很滋润<br>
							       用完皮肤感觉变得更细腻了，涂完脸比较滑<br>
							       油皮干皮都适合<br>
							       资生堂【红研】肌活精华露30ml，上脸很清爽...</p>
								<div class="meta-bottom d-flex justify-content-between">
									<p><span class="lnr lnr-heart"></span> 15 喜欢</p>
									<p><span class="lnr lnr-bubble"></span> 08 评论</p>
								</div>							 
							  </div>
							</div>								
						</div>
						<a href="#" class="primary-btn load-more pbtn-2 text-uppercase mx-auto mt-60">- 更多推荐 - </a>		
					</div>
				</div>					
			</section>
			<!-- End travel Area -->

			<!-- Start fashion Area -->
			<section class="fashion-area section-gap" id="fashion">
				<div class="container">
					<div class="row d-flex justify-content-center">
						<div class="menu-content pb-70 col-lg-8">
							<div class="title text-center">
								<h1 class="mb-10">测试皮肤</h1>
								<img src="/ssh_cosmetics/img/line.png">
								<p>比起武断地推荐某款祛痘、抗敏产品.其实更建议大家先了解自己的肤质，只有正确判断自己的肤质<br>才能对症下药的选择护肤品.比如油性皮肤、干性皮肤、中性皮肤、痤疮型皮肤、色素型皮肤、<br>老化型皮肤等等.有了更清晰的认识，才能奠定好护肤第一步.</p>
							</div>
						</div>
					</div>	
					<div class="row">
						<img class="test" src="/ssh_cosmetics/img/test.png">
						<a href="/ssh_cosmetics/test/test_testUI.action" class="primary-btn load-more pbtn-2 text-uppercase mx-auto mt-60">- 进入测试 -</a>	
					</div>	
				</div>	
		</section>
			
			<!-- start footer Area -->		
			<footer class="footer-area section-gap">
				<div class="container">
					<div class="row">
					<div class="row footer-bottom d-flex justify-content-between">
						
						<p class="col-lg-8 col-sm-12 footer-text">Copyright &copy;<!-- <script>document.write(new Date().getFullYear());</script> --> All rights reserved | made with Colorlib -  More Templates <a href="#" target="_blank" title="模板之家">护肤专家</a> - Collect from <a href="#" title="网页模板" target="_blank">更多了解</a></p>
					</div>
				</div>
			</footer>
			<!-- End footer Area -->		

			<script src="/ssh_cosmetics/js/vendor/jquery-2.2.4.min.js"></script>
			<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
			<script src="/ssh_cosmetics/js/vendor/bootstrap.min.js"></script>
			<script src="/ssh_cosmetics/js/jquery.ajaxchimp.min.js"></script>
			<script src="/ssh_cosmetics/js/parallax.min.js"></script>			
			<script src="/ssh_cosmetics/js/owl.carousel.min.js"></script>		
			<script src="/ssh_cosmetics/js/jquery.magnific-popup.min.js"></script>				
			<script src="/ssh_cosmetics/js/jquery.sticky.js"></script>
			<script src="/ssh_cosmetics/js/main.js"></script>	
		</body>
	</html>