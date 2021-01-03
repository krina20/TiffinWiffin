<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta charset="ISO-8859-1">

<link rel="stylesheet" href="css/uni.css" />

<script src="js/log.js"></script>

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
					<div id="gtco-logo"><a href="adminhome.jsp">Tiffin Wiffin <em>.</em></a></div>
				</div>
				<div class="col-xs-8 text-right menu-1">
					<ul>
						<li><a href="customer_orders.jsp">Customer's Orders</a></li>
                                                <li><a href="customer_feedbacks.jsp">Customer's Feedbacks</a></li>
                                                 <li> <a href="adminLogin.jsp" >Sign out</a> </li>
						
					</ul>	
				</div>
			</div>
			
		</div>
	</nav>
        
 
	
	<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(images/img_bg_1.jpg)" data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-center">

					<div class="row row-mt-15em">
						<div class="col-md-12 mt-text animate-box" data-animate-effect="fadeInUp">
							<h1 class="cursive-font">Customer's Orders</h1>	
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
        <div class="gtco-section">
		<div class="gtco-container">
                    <div class="row">
                        <center>
                            <table style="width:100%" border="1" style="border-color:#fbb448">
                                                    <%@ page import = "java.sql.*"%>
                                                    <%@ page import = "javax.sql.*"%>
                                                    <%
                                                        Class.forName("com.mysql.jdbc.Driver");
                                                        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffinwiffin","root","");
                                                        Statement st = con.createStatement();
                                                        ResultSet rs = st.executeQuery("select order_id,cust_details.cust_id,plan_name,start_date,end_date,contact_no,address,quantity,order_total from orders,cust_details,plans where cust_details.cust_id=orders.cust_id and orders.plan_id=plans.plan_id;");
                                                    %>
                                                        <tr>
                                                                <th>Order ID</th>
                                                                <th>Customer ID</th>
                                                                <th>Plan Name</th>
                                                                <th>Package Starting Date</th>
                                                                <th>Package Ending Date</th>
                                                                <th>Contact No</th>
                                                                <th>Address</th>
                                                                <th>Quantity</th>
                                                                <th>Order Total</th>
                                                            </tr>
                                                        <%
                                                        while(rs.next())
                                                        {
                                                            %>
                                                        
                                                            
                                                            
                                                            <tr><td><%=rs.getString(1)%></td>
                                                                <td><%=rs.getString(2)%></td>
                                                                <td><%=rs.getString(3)%></td>
                                                                <td><%=rs.getString(4)%></td>
                                                                <td><%=rs.getString(5)%></td>
                                                                <td><%=rs.getString(6)%></td>
                                                                <td><%=rs.getString(7)%></td>
                                                                <td><%=rs.getString(8)%></td>
                                                                <td><%=rs.getString(9)%></td>
                                                            </tr>
                                                            <%
                                                        }
                                                        %>
                                </table>
                        </center>	
                    </div>
		</div>
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
