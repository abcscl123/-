<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
    <!DOCTYPE html>
    <html lang="zxx" class="no-js">
    <head>
        <!-- Mobile Specific Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Favicon-->
        <link rel="shortcut icon" href="img/fav.png">
        <!-- Author Meta -->
        <meta name="author" content="colorlib">
        <!-- Meta Description -->
        <meta name="description" content="">
        <!-- Meta Keyword -->
        <meta name="keywords" content="">
        <!-- meta character set -->
        <meta charset="UTF-8">
        <!-- Site Title -->
        <title>Blogger</title>

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
                    <div class="row justify-content-center align-items-center d-flex">
                        <div class="col-lg-8">
                            <div id="imaginary_container"> 
                                <div class="input-group stylish-input-group">
                                    <input type="text" class="form-control"  placeholder="补水神器" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Addictionwhen gambling '" required="">
                                    <span class="input-group-addon">
                                        <button type="submit">
                                            <span class="lnr lnr-magnifier"></span>
                                        </button>  
                                    </span>
                                </div>
                            </div> 
                            <p class="mt-20 text-center text-white">169 results found for “补水神器”</p>
                        </div>
                    </div>
                </div>  
            </section>
            <!-- End top-section Area -->

    

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

            <script src="js/vendor/jquery-2.2.4.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
            <script src="js/vendor/bootstrap.min.js"></script>
            <script src="js/jquery.ajaxchimp.min.js"></script>
            <script src="js/parallax.min.js"></script>          
            <script src="js/owl.carousel.min.js"></script>      
            <script src="js/jquery.magnific-popup.min.js"></script>             
            <script src="js/jquery.sticky.js"></script>
            <script src="js/main.js"></script>  
        </body>
    </html>