<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>TiffinWiffin</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Tiffin Service by TiffinWiffin.co" />
	<meta name="keywords" content="tiffin, service, delievery, TiffinWiffin, mobile first, responsive" />
	<meta name="author" content="TiffinWiffin.co" />

	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Themify Icons-->
	<link rel="stylesheet" href="css/themify-icons.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/magnific-popup.css">

	<!-- Bootstrap DateTimePicker -->
	<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">

	<!-- Owl Carousel  -->
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

</head>
<body>
<div class="gtco-loader"></div>
	
	<div id="page">

	
	<!-- <div class="page-inner"> -->
	<nav class="gtco-nav" role="navigation">
		<div class="gtco-container">
			
			<div class="row">
				<div class="col-sm-4 col-xs-12">
					<div id="gtco-logo"><a href="home.jsp">Tiffin Wiffin <em>.</em></a></div>
				</div>
				<div class="col-xs-8 text-right menu-1">
					<ul>
						<li><a href="menu.jsp">Menu</a></li>
                                                <li><a href="plans.jsp">Plans</a></li>
<!--						<li class="has-dropdown">
							<a href="plans.jsp">Plans</a>
							<ul class="dropdown">
								<li><a href="#">Gujarati</a></li>
								<li><a href="#">Punjabi</a></li>
							</ul>
						</li>-->
						
						<li><a href="services.jsp">Services</a></li>
						<li><a href="contact.jsp">Contact</a></li>
                                                <%
                                                if(session.getAttribute("id")==null)    
                                                {
                                                %>
						 <li class="has-dropdown"><a href="signup.jsp">Sign Up</a>
                                                <ul class="dropdown">
								<li><a href="login.jsp">Login</a></li>
								
							</ul></li>
                                                <%
                                                    }
                                                    else
                                                    {   
                                                %>
                                                <li><a href="mydetails.jsp">My Details</a></li>
                                                <li class="btn-cta"><a href="SignOut" onclick="signOut();"><span>Sign Out</span></a></li>
                                                <%
                                                    }
                                                    %>
                                                
                                                <li class="btn-cta"><a href="order.jsp"><span class="icon">
							<i class="ti-shopping-cart"></i>
						</span></a></li>
                                                <%
                                                    if(session.getAttribute("id")!=null)
                                                    {
                                                %>
                                                <li><span style="color:white">Hi, <%=session.getAttribute("name") %></span></li>
                                                <%
                                                    }
                                                %>
					</ul>	
				</div>
			</div>
			
		</div>
	</nav>
                                                    
                                                    
<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(images/img_bg_3.jpg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-center">

					<div class="row row-mt-15em">
						<div class="col-md-12 mt-text animate-box" data-animate-effect="fadeInUp">
							<h1 class="cursive-font">Say hello!</h1>	
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	
	
	<div class="gtco-section">
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12">
					<div class="col-md-6 animate-box">
					<h3>Get In Touch</h3>
                                        <form action="FeedbackServlet" method="POST">
						<div class="row form-group">
							<div class="col-md-12">
								<label class="sr-only" for="name">Name</label>
                                                                <input type="text" name="name" id="name" class="form-control" placeholder="Your firstname" required="">
							</div>
						</div>

						<div class="row form-group">
							<div class="col-md-12">
								<label class="sr-only" for="email">Email</label>
                                                                <input type="text" id="email" name="email" class="form-control" placeholder="Your email address" required="">
							</div>
						</div>
						
						<div class="row form-group">
							<div class="col-md-12">
								<label class="sr-only" for="message">Message</label>
                                                                <textarea name="message" id="message" cols="30" rows="10" class="form-control" placeholder="Write us something" required=""></textarea>
							</div>
						</div>
						
						<div class="form-group">
							<input type="submit" value="Send Message" class="btn btn-primary">
						</div>

					</form>		
				</div>
				<div class="col-md-5 col-md-push-1 animate-box">
					
					<div class="gtco-contact-info">
						<h3>Contact Information</h3>
						<ul>
							<li class="address">123 Saman Complex, <br> Ahmedabad Gujarat IN 380018</li>
							<li class="phone"><a href="tel://9090909090">+91 9090909090</a></li>
							<li class="email"><a href="mailto:info@TiffinWiffin.com">info@TiffinWiffin.com</a></li>
							<li class="url"><a href="home.jsp">TiffinWiffin.co</a></li>
						</ul>
					</div>


				</div>
				</div>
			</div>
		</div>
	</div>
                                                    
         <center>
        <div id="map" style="width:1000px;height:600px;margin:20px;"></div>
        </center>
            <script>
            function initMap() {
              // The location of Tiffin Wiffin Office
                var uluru = {lat: 23.0299143, lng: 72.5267286};
                var mapOptions = {
                        center: new google.maps.LatLng(23.0299143, 72.5267286),
                        zoom: 16,
                        mapTypeId: google.maps.MapTypeId.ROADMAP
                }
                var map = new google.maps.Map(
                document.getElementById('map'), mapOptions);
                // The marker, positioned at Uluru
                var marker = new google.maps.Marker({position: uluru, map: map});
            }
    </script>
    <!--Load the API from the specified URL
    * The async attribute allows the browser to render the page while the API loads
    * The key parameter will contain your own API key (which is not needed for this tutorial)
    * The callback parameter executes the initMap() function
    -->
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDxh3FfyUz3vvTEI7-gp4hWUvCsV5eFcZ0&callback=initMap">
    </script>
    

	<footer id="gtco-footer" role="contentinfo" style="background-image: url(images/img_bg_1.jpg)" data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row row-pb-md">
				<div class="col-md-12 text-center">
					<div class="gtco-widget">
						<h3>Get In Touch</h3>
						<ul class="gtco-quick-contact">
							<li><a href="tel://9090909090"><i class="icon-phone"></i> +91 9090909090</a></li>
							<li><a href="mailto:info@TiffinWiffin.com"><i class="icon-mail2"></i> info@TiffinWiffin.co</a></li>
						</ul>
					</div>
				</div>

				<div class="col-md-12 text-center copyright">
					<p><small class="block">&copy;All Rights Reserved.</small>
				</div>

			</div>

			

		</div>
	</footer>
	<!-- </div> -->

	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>
	
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- countTo -->
	<script src="js/jquery.countTo.js"></script>

	<!-- Stellar Parallax -->
	<script src="js/jquery.stellar.min.js"></script>

	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	
	<script src="js/moment.min.js"></script>
	<script src="js/bootstrap-datetimepicker.min.js"></script>


	<!-- Main -->
	<script src="js/main.js"></script>

</body>
</html>