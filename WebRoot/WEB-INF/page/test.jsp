<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>测试</title>
			<link rel="stylesheet" href="/ssh_cosmetics/css/linearicons.css">
			<link rel="stylesheet" href="/ssh_cosmetics/css/font-awesome.min.css">
			<link rel="stylesheet" href="/ssh_cosmetics/css/bootstrap.css">
			<link rel="stylesheet" href="/ssh_cosmetics/css/owl.carousel.css">
			<link rel="stylesheet" href="/ssh_cosmetics/css/main.css">
	
	<script type="text/javascript" src="/ssh_cosmetics/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript">
		$(function(){
			var finalSource = 0;
			var is_submit = false;
			$("label").click(function(){
				var source = 0;
				var is_check = 0;
				var list = $("label");
				$.each($("label"),function(index,value){
					//length++;
					if($(value).find("input").is(":checked") == true){
						is_check ++;
						if($(value).text().indexOf("A") != -1){
							source += 1;
						} else if ($(value).text().indexOf("B") != -1){
							source += 2;
						} else if ($(value).text().indexOf("C") != -1){
							source += 3;
						} else if ($(value).text().indexOf("D") != -1){
							source += 4;
						} else {
							source += 0;
						}
					}
					finalSource = source;
					if(list.length/4 == is_check){
						is_submit = true;
					}
				})
				$("#source").text(source);
			})
			
			$("#submit").click(function(){
				if(is_submit){
					alert("最终分数是:" + finalSource);
					$('html,body').animate({scrollTop:$('#result').offset().top}, 800);
				} else {
					alert("请完成所有题目再提交");
				}
			})
		})
	</script>
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
						<h1 class="mb-10">肤质测试</h1>
						<img src="/ssh_cosmetics/img/line.png">
						<p><s:property value="#request.number.describes"/> </p>
					</div>
				</div>
			</div>	
			<div class="row" style="margin-left: 200px; width:700px; ">
				<form action="" method="get">
					<s:iterator value="#request.problemList" var="problem">
						<h5><s:property value="#problem.problem"/></h5><br>
						<s:iterator value="#problem.answerSet" var="answer">
							<s:if test="#answer.options == 'A'.toString()">
								<label class="test-label">
									<p>
										<input type="radio" name=<s:property value="#problem.id"/>>
										<s:property value="#answer.options"/> 
										<s:property value="#answer.answer"/>
									</p> 
								</label><br>
							</s:if> 
						</s:iterator>
						<s:iterator value="#problem.answerSet" var="answer">
							<s:if test="#answer.options == 'B'.toString()">
								<label class="test-label">
									<p>
										<input type="radio" name=<s:property value="#problem.id"/>>
										<s:property value="#answer.options"/> 
										<s:property value="#answer.answer"/> 
									</p>
								</label><br>
							</s:if> 
						</s:iterator>
						<s:iterator value="#problem.answerSet" var="answer">
							<s:if test="#answer.options == 'C'.toString()">
								<label class="test-label">
									<p>
										<input type="radio" name=<s:property value="#problem.id"/>>
										<s:property value="#answer.options"/> 
										<s:property value="#answer.answer"/> 
									</p>
								</label><br>
							</s:if> 
						</s:iterator>
						<s:iterator value="#problem.answerSet" var="answer">
							<s:if test="#answer.options == 'D'.toString()">
								<label class="test-label" style="margin-bottom: 20px;">
									<p>
										<input type="radio" name=<s:property value="#problem.id"/>>
										<s:property value="#answer.options"/> 
										<s:property value="#answer.answer"/> 
									</p>
								</label>
							</s:if> 
						</s:iterator>
					</s:iterator>
				</form><br>
				<a href="#" class="primary-btn load-more pbtn-2 text-uppercase mx-auto mt-60" id="submit" style="height:50px;margin:0 auto;">- 提交试卷 -</a>
			</div>
			<div class="shuoming" style="margin-top: 100px;border:1px dashed #fc91b3;padding: 10px;" id="result">
				<h8 style="color: #000;"><h4>分值：</h4><br> 							
					选A－1分，选B－2分，选C－3分，选D－4分 <br>
					你的得分是：<P id="source"></P>
					<s:iterator value="#request.resultList" var="result">
						如果得分为<s:property value="#result.minimum_score"/>－<s:property value="#result.highest_score"/>，属于<s:property value="#result.answer"/><br> 
					</s:iterator>
				</h8>
			</div>
				
		</div>	
	</section>

			<footer class="footer-area section-gap" style="padding: 5px; width: 100%;height: 200px;">
				<div class="container">
					<div class="row">
					<div class="row footer-bottom d-flex justify-content-between">
						
						<p class="col-lg-8 col-sm-12 footer-text">Copyright &copy; All rights reserved | made with Colorlib -  More Templates <a href="#" target="_blank" title="模板之家">护肤专家</a> - Collect from <a href="#" title="网页模板" target="_blank">更多了解</a></p>
					</div>
				</div>
			</footer>

</body>
</html>