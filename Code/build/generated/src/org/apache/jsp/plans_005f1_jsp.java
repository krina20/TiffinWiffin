package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class plans_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<title>Tiffin Wiffin</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<meta name=\"description\" content=\"Tiffin Service by TiffinWiffin.co\" />\r\n");
      out.write("\t<meta name=\"keywords\" content=\"tiffin, service, delievery, TiffinWiffin, mobile first, responsive\" />\r\n");
      out.write("\t<meta name=\"author\" content=\"TiffinWiffin.co\" />\r\n");
      out.write("\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Kaushan+Script\" rel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Animate.css -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("\t<!-- Icomoon Icon Fonts-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/icomoon.css\">\r\n");
      out.write("\t<!-- Themify Icons-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/themify-icons.css\">\r\n");
      out.write("\t<!-- Bootstrap  -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Magnific Popup -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Bootstrap DateTimePicker -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Owl Carousel  -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Theme style  -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modernizr JS -->\r\n");
      out.write("\t<script src=\"js/modernizr-2.6.2.min.js\"></script>\r\n");
      out.write("\t<!-- FOR IE9 below -->\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t<script src=\"js/respond.min.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"gtco-loader\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"page\">\r\n");
      out.write("\t<!-- <div class=\"page-inner\"> -->\r\n");
      out.write("\t<nav class=\"gtco-nav\" role=\"navigation\">\r\n");
      out.write("\t\t<div class=\"gtco-container\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t<div id=\"gtco-logo\"><a href=\"home.jsp\">Tiffin Wiffin <em>.</em></a></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-8 text-right menu-1\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"menu.jsp\">Menu</a></li>\r\n");
      out.write("                                                <li><a href=\"plans.jsp\">Plans</a></li>\r\n");
      out.write("<!--\t\t\t\t\t\t<li class=\"has-dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"plans.jsp\">Plans</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Gujarati</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Punjabi</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>-->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"services.jsp\">Services</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("                                                ");

                                                if(session.getAttribute("id")==null)    
                                                {
                                                
      out.write("\r\n");
      out.write("\t\t\t\t\t\t <li class=\"has-dropdown\"><a href=\"signup.jsp\">Sign Up</a>\r\n");
      out.write("                                                <ul class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("                                                ");

                                                    }
                                                    else
                                                    {   
                                                
      out.write("\r\n");
      out.write("                                                <li class=\"btn-cta\"><a href=\"SignOut\"><span>Sign Out</span></a></li>\r\n");
      out.write("                                                ");

                                                    }
                                                    
      out.write("\r\n");
      out.write("                                                \r\n");
      out.write("                                                <li class=\"btn-cta\"><a href=\"order.jsp\"><span class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"ti-shopping-cart\"></i>\r\n");
      out.write("\t\t\t\t\t\t</span></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t\r\n");
      out.write("\t<header id=\"gtco-header\" class=\"gtco-cover gtco-cover-sm\" role=\"banner\" style=\"background-image: url(images/img_bg_3.jpg)\">\r\n");
      out.write("\t\t<div class=\"overlay\"></div>\r\n");
      out.write("\t\t<div class=\"gtco-container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12 col-md-offset-0 text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row row-mt-15em\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12 mt-text animate-box\" data-animate-effect=\"fadeInUp\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"cursive-font\">Choose your Plan</h1>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("                                                \r\n");
      out.write("        <div class=\"gtco-section\">\r\n");
      out.write("\t\t<div class=\"gtco-container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8 col-md-offset-2 text-center gtco-heading\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"cursive-font primary-color\">Our Packages</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<a href=\"images/img_1.jpg\" class=\"fh5co-card-item image-popup\">\r\n");
      out.write("\t\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"overlay\"><i class=\"ti-plus\"></i></div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/images/img_1.jpg\" alt=\"Monthly - Gujarati\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fh5co-text\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Monthly - Gujarati</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><span class=\"price cursive-font\">Rs.1800</span></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<a href=\"images/img_2.jpg\" class=\"fh5co-card-item image-popup\">\r\n");
      out.write("\t\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"overlay\"><i class=\"ti-plus\"></i></div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/img_1.jpg\" alt=\"Weekly - Gujarati\" class=\"img-responsive\"/>\r\n");
      out.write("\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fh5co-text\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Weekly - Gujarati</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><span class=\"price cursive-font\">Rs.450</span></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<a href=\"images/img_3.jpg\" class=\"fh5co-card-item image-popup\">\r\n");
      out.write("\t\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"overlay\"><i class=\"ti-plus\"></i></div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/images/img_3.jpg\" alt=\"Daily - Gujarati\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fh5co-text\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Daily - Gujarati</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><span class=\"price cursive-font\">Rs.80</span></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<a href=\"images/img_4.jpg\" class=\"fh5co-card-item image-popup\">\r\n");
      out.write("\t\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"overlay\"><i class=\"ti-plus\"></i></div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/images/img_4.jpg\" alt=\"Monthly - Punjabi\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fh5co-text\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Monthly - Punjabi</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><span class=\"price cursive-font\">Rs.1900</span></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<a href=\"images/img_5.jpg\" class=\"fh5co-card-item image-popup\">\r\n");
      out.write("\t\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"overlay\"><i class=\"ti-plus\"></i></div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/images/img_5.jpg\" alt=\"Weekly - Punjabi\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fh5co-text\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Weekly - Punjabi</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><span class=\"price cursive-font\">Rs.500</span></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/images/img_6.jpg\" class=\"fh5co-card-item image-popup\">\r\n");
      out.write("\t\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"overlay\"><i class=\"ti-plus\"></i></div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/img_6.jpg\" alt=\"Daily - Punjabi\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fh5co-text\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Daily - Punjabi</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><span class=\"price cursive-font\">Rs.90</span></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<footer id=\"gtco-footer\" role=\"contentinfo\" style=\"background-image: url(images/img_bg_1.jpg)\" data-stellar-background-ratio=\"0.5\">\r\n");
      out.write("\t\t<div class=\"overlay\"></div>\r\n");
      out.write("\t\t<div class=\"gtco-container\">\r\n");
      out.write("\t\t\t<div class=\"row row-pb-md\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12 text-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"gtco-widget\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Get In Touch</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"gtco-quick-contact\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-phone\"></i> +91 9090909090</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-mail2\"></i> info@TiffinWiffin.co</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-chat\"></i> Live Chat</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12 text-center copyright\">\r\n");
      out.write("\t\t\t\t\t<p><small class=\"block\">&copy;All Rights Reserved.</small> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- </div> -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"gototop js-top\">\r\n");
      out.write("\t\t<a href=\"#\" class=\"js-gotop\"><i class=\"icon-arrow-up\"></i></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- jQuery -->\r\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t<!-- jQuery Easing -->\r\n");
      out.write("\t<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t<!-- Bootstrap -->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- Waypoints -->\r\n");
      out.write("\t<script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("\t<!-- Carousel -->\r\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("\t<!-- countTo -->\r\n");
      out.write("\t<script src=\"js/jquery.countTo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Stellar Parallax -->\r\n");
      out.write("\t<script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Magnific Popup -->\r\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/magnific-popup-options.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"js/moment.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Main -->\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
