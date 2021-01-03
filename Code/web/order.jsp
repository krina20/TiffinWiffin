<%-- 
    Document   : order
    Created on : 13 Nov, 2018, 5:01:29 PM
    Author     : shiva
--%>

<%@page import="MyPackage.PlansBean"%>
<%@page import="java.util.ArrayList"%>
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
        <%

            ArrayList<PlansBean> plans = (ArrayList<PlansBean>) session.getAttribute("plans");
        %>

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
                                <li><a href="services.jsp">Services</a></li>
                                <li><a href="contact.jsp">Contact</a></li>
                                    <%
                                        if (session.getAttribute("id") == null) {
                                    %>

                                <li class="has-dropdown"><a href="signup.jsp">Sign Up</a>
                                    <ul class="dropdown">
                                        <li><a href="login.jsp">Login</a></li>

                                    </ul></li>
                                    <%
                                    } else {

                                    %>
                                <li><a href="mydetails.jsp">My Details</a></li>
                                <li class="btn-cta"><a href="SignOut" onclick="signOut();"><span>Sign Out</span></a></li>


                                <%   }
                                %>

                                <li class="btn-cta"><a href="OrderServlet"><span class="icon">
                                            <i class="ti-shopping-cart"></i>
                                        </span></a></li>
                                        <%
                                            if (session.getAttribute("id") != null) {
                                        %>
                                <li><span style="color:white">Hi, <%=session.getAttribute("name")%> </span></li>
                                    <%
                                        }
                                    %>

                            </ul>	
                        </div>
                    </div>

                </div>
            </nav>

            <header id="gtco-header" class="gtco-cover gtco-cover-md" role="banner" style="background-image: url(images/img_bg_1.jpg)" data-stellar-background-ratio="0.5">
                <div class="overlay"></div>
                <div class="gtco-container">
                    <div class="row">
                        <div class="col-md-12 col-md-offset-0 text-left">


                            <div class="row row-mt-15em">
                                <div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
                                    <span class="intro-text-small">Hand-crafted by <a href="http://gettemplates.co" target="_blank">GetTemplates.co</a></span>
                                    <h1 class="cursive-font">All in good taste!</h1>	
                                </div>
                                <div class="col-md-4 col-md-push-1 animate-box" data-animate-effect="fadeInRight">
                                    <div class="form-wrap">
                                        <div class="tab">

                                            <div class="tab-content">
                                                <div class="tab-content-inner active" data-content="signup">
                                                    <h3 class="cursive-font">Table Reservation</h3>
                                                    <form action="placeorder.jsp" method="post">
                                                        <div class="row form-group">
                                                            <div class="col-md-12">
                                                                <label for="activities">Plans</label>
                                                                <select name="plan" id="activities" class="form-control" style="color:white">
                                                                    <%
                                                                        for (int i = 0; i < plans.size(); i++) {

                                                                    %>

                                                                    <option value=<%=plans.get(i).getPlan_id()%>> <%=plans.get(i).getPlan_name()%></option>

                                                                    <%
                                                                        }
                                                                    %>
                                                                </select>
                                                            </div>
                                                        </div>
                                                        <div class="row form-group">
                                                            <div class="col-md-12">
                                                                <label for="date-start">Start Date</label>
                                                                <input type="text" name="startdate" id="date" class="form-control" required="">
                                                            </div>
                                                        </div>
                                                        <div class="row form-group">
                                                            <div class="col-md-12">
                                                                <label>Quantity</label>
                                                                <input type="number" name="quantity" class="form-control" placeholder="Quantity Of Tiffins" required="">
                                                            </div>
                                                        </div>


                                                        <div class="row form-group">
                                                            <div class="col-md-12">
                                                                <input type="submit" class="btn btn-primary btn-block" value="Review Order">
                                                            </div>
                                                        </div>
                                                    </form>	
                                                </div>


                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>


                        </div>
                    </div>
                </div>
            </header>

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
