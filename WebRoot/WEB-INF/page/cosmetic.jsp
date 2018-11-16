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
		
		<script type="text/javascript" src="/ssh_cosmetics/js/jquery-3.3.1.min.js"></script>
		<script type="text/javascript" src="/ssh_cosmetics/js/tools.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#search").click(function(){
					$(this).attr("href",$(this).attr("href") + "?name=" + $(this).prev().val());
				})
				
				$("#more").click(function(){
					$(this).attr("href",$(this).attr("href") + "?length=" + $("div[cosmetic='cosmetic']").length);
				})
				
				//让页面跳转到原来浏览过的状态
				$("html,body").animate({scrollTop:$("#" + $("#length").val()).offset().top},1000)
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

	           <!-- Start top-section Area -->
            <section class="top-section-area section-gap">
                <div class="container">
                    <div class="row justify-content-between align-items-center d-flex">
                        <div class="col-lg-8 top-left">
                            <h1 class="text-white mb-20">种草秘籍</h1>
                            <ul>

                                <li><a href="/ssh_cosmetics/user/user_indexUI.action">首页</a><span class="lnr lnr-arrow-right"></span></li>
                                <li><a href="#">种草秘籍</a><span class="lnr lnr-arrow-right"></span></li>
                            </ul>
                        </div>
                    </div>
                </div>  
            </section>
            <!-- End top-section Area -->

    
    <!-- Start post Area -->
    <div class="post-wrapper pt-100">
        <!-- Start post Area -->
        <section class="post-area">
            <div class="container">
                <div class="row justify-content-center d-flex">
                    <div class="col-lg-8">
						<input type="hidden" value="<s:property value="#request.length"/>" id="length">
                    	<s:iterator value="#request.cosmeticsList" var="cosmetics">
                    		<div class="top-posts">
	                            <div class="container">
	                                <div class="row justify-content-center">
	                                	<s:iterator value="#cosmetics" var="cosmetic"> 
	                                		<div class="single-posts col-lg-6 col-sm-6" cosmetic="cosmetic" id="<s:property value="#cosmetic.id"/>">
			                                    <s:iterator value="#cosmetic.imageSet" var="image">
					                    			<s:if test="#image.is_cosmeticImage == true">
					                    				<img class="img-fluid" src="<s:property value="#image.path"/>" alt="" style="width: 335px;height: 205.433px;">
					                    			</s:if>
					                    		</s:iterator>
				                                <div class="date mt-20 mb-20"><s:date name="#cosmetic.time" format="yyyy-MM-dd"/></div>
				                                <a href="cosmetic_articleUI.action?id=<s:property value="#cosmetic.id"/>"><h4 class="text-uppercase"><s:property value="#cosmetic.name"/> </h4></a>
		                                    	<p class="footer pt-20">
		                                    		<%int i = 0;%>
		                                    		<%boolean is_like = false;%>
		                                    		<s:iterator value="#cosmetic.likeSet" var="like">
		                                    			 <s:if test="#like.is_like == true">
		                                    			 	<%i++; %>
		                                    			 	<s:if test="#like.user.id == #session.user.id">
		                                    			 		<%is_like = true; %>
		                                    			 	</s:if>
		                                    			 </s:if>
		                                    			 <%request.setAttribute("i", i); %>
		                                    			 <%request.setAttribute("is_like", is_like); %>
		                                    		</s:iterator>
		                                    		<%-- <s:iterator value="#cosmetic.likeSet" var="like">
	                                                   <s:if test="#like.user.id == #session.user.id && #like.is_like == true && #request.canLike != false">
	                                                        <span alt="" style="display: inline-block; width:18px;height:18px; background-image: url(/ssh_cosmetics/img/like.png); background-position:-19px 0;"></span>
	                                                        <a href="like_like.action?id=<s:property value="#cosmetic.id"/>"><s:property value="#request.i"/> Likes </a>
		                                                    <s:set var="canLike" scope="request" value="canLike">canLike</s:set>
		                                                    <%request.setAttribute("canLike", false); %>
	                                                    </s:if>                                             
		                                    		</s:iterator> --%>
		                                    		<s:if test="#request.is_like == true">
		                                                 <span alt="" style="display: inline-block; width:18px;height:18px; background-image: url(/ssh_cosmetics/img/like.png); background-position:-19px 0;"></span>
	                                                        <a href="like_like.action?id=<s:property value="#cosmetic.id"/>"><s:property value="#request.i"/> Likes </a>
		                                            </s:if> 
		                                   			<s:if test="#request.is_like == false">
		                                                 <span alt="" style="display: inline-block; width:18px;height:18px; background: url(/ssh_cosmetics/img/like.png)"></span>
		                                                 <a href="like_notLike.action?id=<s:property value="#cosmetic.id"/>"><s:property value="#request.i"/> Likes </a>
		                                            </s:if> 
                                                </p>
		                                    </div>
	                                	</s:iterator>
	                                </div>
	                            </div>
	                        </div>      
                    	</s:iterator>
                    	
                    	<s:if test="#request.more == true">
	                        <div class="top-posts pt-50">
	                            <div class="container">
	                                <div class="row justify-content-center">
	                                    <div class="justify-content-center d-flex">
	                                        <a class="text-uppercase primary-btn loadmore-btn mt-20 mb-60" href="cosmetic_moreCosmetic.action" id="more"> ---更多护肤品---</a>
	                                    </div>                                                                       
	                                </div> 
	                            </div>
	                        </div>                            
                    	</s:if>
                    </div>
                    <div class="col-lg-4 sidebar-area">
                        <div class="single_widget search_widget">
                            <div id="imaginary_container"> 
                                <div class="input-group stylish-input-group">
	                                <input type="text" class="form-control"  placeholder="Search" >
	                                <a href="cosmetic_getBeanListLikeName.action" id="search">
		                                <span class="input-group-addon">
		                                    <button type="submit">
		                                        <span class="lnr lnr-magnifier"></span>
		                                    </button>  
		                                </span>
	                                </a>
                                </div>
                            </div> 
                        </div>

                        <div class="single_widget about_widget">
                            <img src="/ssh_cosmetics/img/asset/1.jpg" alt="" width="200px" height="180px">
                            <h2 class="text-uppercase">唐嫣</h2>
                            <p>
                                	时而干练知性，时而甜美可人，在不同风格间演绎真实自我的唐嫣，与珀莱雅自然、自在、自信的品牌内涵不谋而合，
                                	为每一个渴望“做自己”的爱美女孩，开启内心的自信之钥，引领珀莱雅进入海洋芯时代。
                            </p>
                            <div class="social-link">
                                <a href="#"><button class="btn"><i class="fa fa-facebook" aria-hidden="true"></i> Like</button></a>
                                <a href="#"><button class="btn"><i class="fa fa-twitter" aria-hidden="true"></i> follow</button></a>
                            </div>
                        </div>
                        <div class="single_widget cat_widget">
                            <h4 class="text-uppercase pb-20">more article</h4>
                            <ul>
                                <li>
                                    <a href="#">保湿 <span>37</span></a>
                                </li>
                                <li>
                                    <a href="#">控油 <span>37</span></a>
                                </li>
                                <li>
                                    <a href="#">亮白 <span>37</span></a>
                                </li>
                                <li>
                                    <a href="#">亮肤 <span>37</span></a>
                                </li>
                                <li>
                                    <a href="#">紧肤 <span>37</span></a>
                                </li>
                            </ul>
                        </div>

                                          
                    </div>
                </div>
            </div>    
        </section>
        <!-- End post Area -->  
    </div>
    <!-- End post Area -->
    
            <!-- start footer Area -->      
            <footer class="footer-area section-gap">
                <div class="container">
                   

                    <div class="row footer-bottom d-flex justify-content-between">
                        
                        <p class="col-lg-8 col-sm-12 footer-text">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | made with Colorlib -  More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
                        
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