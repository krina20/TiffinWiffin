package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class google_005fsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"ISO-8859-1\">\n");
      out.write("        <meta name=\"google-signin-client_id\" content=\"941517274442-70uv4fsbb8br4pcuicm7thek6rs8r4ah.apps.googleusercontent.com\">\n");
      out.write("\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("        <script src=\"js/log.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/uni.css\" />\n");
      out.write("        <meta charset=\"ISO-8859-1\">\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>TiffinWiffin</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"Tiffin Service by TiffinWiffin.co\" />\n");
      out.write("        <meta name=\"keywords\" content=\"tiffin, service, delievery, TiffinWiffin, mobile first, responsive\" />\n");
      out.write("        <meta name=\"author\" content=\"TiffinWiffin.co\" />\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Kaushan+Script\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Animate.css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <!-- Icomoon Icon Fonts-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("        <!-- Themify Icons-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n");
      out.write("        <!-- Bootstrap  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\n");
      out.write("        <!-- Magnific Popup -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap DateTimePicker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-datetimepicker.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Owl Carousel  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Theme style  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("        <!-- Modernizr JS -->\n");
      out.write("        <script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("        <!-- FOR IE9 below -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"gtco-loader\"></div>\n");
      out.write("\n");
      out.write("        <div id=\"page\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- <div class=\"page-inner\"> -->\n");
      out.write("            <nav class=\"gtco-nav\" role=\"navigation\">\n");
      out.write("                <div class=\"gtco-container\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("                            <div id=\"gtco-logo\"><a href=\"home.jsp\">Tiffin Wiffin <em>.</em></a></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-8 text-right menu-1\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"menu.jsp\">Menu</a></li>\n");
      out.write("                                <li><a href=\"plans.jsp\">Plans</a></li>\n");
      out.write("                                <!--\t\t\t\t\t\t<li class=\"has-dropdown\">\n");
      out.write("                                                                                        <a href=\"plans.jsp\">Plans</a>\n");
      out.write("                                                                                        <ul class=\"dropdown\">\n");
      out.write("                                                                                                <li><a href=\"#\">Gujarati</a></li>\n");
      out.write("                                                                                                <li><a href=\"#\">Punjabi</a></li>\n");
      out.write("                                                                                        </ul>\n");
      out.write("                                                                                </li>-->\n");
      out.write("\n");
      out.write("                                <li><a href=\"services.jsp\">Services</a></li>\n");
      out.write("                                <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                                    ");

                                        if (session.getAttribute("id") == null) {
                                    
      out.write("\n");
      out.write("                                <li class=\"has-dropdown\"><a href=\"signup.jsp\">Sign Up</a>\n");
      out.write("                                    <ul class=\"dropdown\">\n");
      out.write("                                        <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("\n");
      out.write("                                    </ul></li>\n");
      out.write("                                    ");

                                    } else {
                                    
      out.write("\n");
      out.write("                                <li class=\"btn-cta\"><a href=\"SignOut\"><span>Sign Out</span></a></li>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("\n");
      out.write("                               <li class=\"btn-cta\"><a href=\"order.jsp\"><span class=\"icon\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"ti-shopping-cart\"></i>\n");
      out.write("\t\t\t\t\t\t</span></a></li>\n");
      out.write("                            </ul>\t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <header id=\"gtco-header\" class=\"gtco-cover gtco-cover-md\" role=\"banner\" style=\"background-image: url(images/img_bg_1.jpg)\" data-stellar-background-ratio=\"0.5\">\n");
      out.write("                <div class=\"overlay\"></div>\n");
      out.write("                <div class=\"gtco-container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12 col-md-offset-0 text-left\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row row-mt-15em\">\n");
      out.write("                                <div class=\"col-md-7 mt-text animate-box\" data-animate-effect=\"fadeInUp\">\n");
      out.write("                                    <h1 class=\"cursive-font\">Join the family!</h1>\t\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-4 col-md-push-1 animate-box\" data-animate-effect=\"fadeInRight\">\n");
      out.write("                                    <div class=\"form-wrap\">\n");
      out.write("                                        <div class=\"tab\">\n");
      out.write("\n");
      out.write("                                            <div class=\"tab-content\">\n");
      out.write("                                                <div class=\"tab-content-inner active\" data-content=\"signup\">\n");
      out.write("                                                    <h3 class=\"cursive-font\">Sign Up</h3>\n");
      out.write("                                                    <form action=\"SignupServlet\" method=\"POST\">\n");
      out.write("                                                        <div class=\"row form-group\">\n");
      out.write("                                                            <div class=\"col-md-12\">\n");
      out.write("                                                                <label class=\"sr-only\" for=\"name\">Name</label>\n");
      out.write("                                                                <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Your firstname\" readonly>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                        <div class=\"row form-group\">\n");
      out.write("                                                            <div class=\"col-md-12\">\n");
      out.write("                                                                <label for=\"email\" class=\"sr-only\">Email</label>\n");
      out.write("                                                                <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Your Email Address\" readonly>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    \n");
      out.write("                                                        <div class=\"row form-group\">\n");
      out.write("                                                            <div class=\"col-md-12\">\n");
      out.write("                                                                <label class=\"sr-only\" for=\"email\">Address</label>\n");
      out.write("                                                                <input type=\"text\" name=\"address\" class=\"form-control\" placeholder=\"Your address\">\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                        <div class=\"row form-group\">\n");
      out.write("                                                            <div class=\"col-md-12\">\n");
      out.write("                                                                <label class=\"sr-only\" for=\"contact\">Contact Number</label>\n");
      out.write("                                                                <input type=\"text\" name=\"contact\" class=\"form-control\" placeholder=\"Your Contact number\">\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                        <div class=\"row form-group\">\n");
      out.write("                                                            <div class=\"col-md-12\">\n");
      out.write("                                                                <input type=\"submit\" class=\"btn btn-primary btn-block\" value=\"Register\">\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div id=\"page\">\n");
      out.write("\n");
      out.write("                                                             \n");
      out.write("                                                               \n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div style=\"text-align: center\">Already have an account?  <a href=\"login.jsp\">Login!</a></div>\n");
      out.write("                                                    </form>\t\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <!--            <div class=\"gtco-cover gtco-cover-sm\" style=\"background-image: url(images/img_bg_1.jpg)\"  data-stellar-background-ratio=\"0.5\">\n");
      out.write("                            <div class=\"overlay\"></div>\n");
      out.write("                            <div class=\"gtco-container text-center\">\n");
      out.write("                                <div class=\"display-t\">\n");
      out.write("                                    <div class=\"display-tc\">\n");
      out.write("                                        <h1>&ldquo; Their high quality of service makes me back over and over again!&rdquo;</h1>\n");
      out.write("                                        <p>&mdash; Sahil Shah, CEO of NetSavvies Co.</p>\n");
      out.write("                                    </div>\t\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>-->\n");
      out.write("\n");
      out.write("            <footer id=\"gtco-footer\" role=\"contentinfo\" style=\"background-image: url(images/img_bg_1.jpg)\" data-stellar-background-ratio=\"0.5\">\n");
      out.write("                <div class=\"overlay\"></div>\n");
      out.write("                <div class=\"gtco-container\">\n");
      out.write("                    <div class=\"row row-pb-md\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-12 text-center\">\n");
      out.write("                            <div class=\"gtco-widget\">\n");
      out.write("                                <h3>Get In Touch</h3>\n");
      out.write("                                <ul class=\"gtco-quick-contact\">\n");
      out.write("                                    <li><a href=\"#\"><i class=\"icon-phone\"></i> +91 9090909090</a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"icon-mail2\"></i> info@TiffinWiffin.co</a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"icon-chat\"></i> Live Chat</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-12 text-center copyright\">\n");
      out.write("                            <p><small class=\"block\">&copy;All Rights Reserved.</small> \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("            <!-- </div> -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"gototop js-top\">\n");
      out.write("            <a href=\"#\" class=\"js-gotop\"><i class=\"icon-arrow-up\"></i></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- jQuery Easing -->\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Waypoints -->\n");
      out.write("        <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <!-- Carousel -->\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <!-- countTo -->\n");
      out.write("        <script src=\"js/jquery.countTo.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Stellar Parallax -->\n");
      out.write("        <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Magnific Popup -->\n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <script src=\"js/magnific-popup-options.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/moment.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Main -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
