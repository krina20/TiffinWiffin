package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"ISO-8859-1\">\r\n");
      out.write("        <meta name=\"google-signin-client_id\" content=\"941517274442-70uv4fsbb8br4pcuicm7thek6rs8r4ah.apps.googleusercontent.com\">\r\n");
      out.write("            \r\n");
      out.write("<!--        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>-->\r\n");
      out.write("        <script src=\"js/log.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js?onload=renderButton\" async defer></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/uni.css\" />\r\n");
      out.write("        <meta charset=\"ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <title>TiffinWiffin</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta name=\"description\" content=\"Tiffin Service by TiffinWiffin.co\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"tiffin, service, delievery, TiffinWiffin, mobile first, responsive\" />\r\n");
      out.write("        <meta name=\"author\" content=\"TiffinWiffin.co\" />\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Kaushan+Script\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Animate.css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("        <!-- Icomoon Icon Fonts-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/icomoon.css\">\r\n");
      out.write("        <!-- Themify Icons-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\r\n");
      out.write("        <!-- Bootstrap  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Magnific Popup -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap DateTimePicker -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Owl Carousel  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Theme style  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Modernizr JS -->\r\n");
      out.write("        <script src=\"js/modernizr-2.6.2.min.js\"></script>\r\n");
      out.write("        <!-- FOR IE9 below -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"gtco-loader\"></div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"page\">\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("            <!-- <div class=\"page-inner\"> -->\r\n");
      out.write("            <nav class=\"gtco-nav\" role=\"navigation\">\r\n");
      out.write("                <div class=\"gtco-container\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-4 col-xs-12\">\r\n");
      out.write("                            <div id=\"gtco-logo\"><a href=\"home.jsp\">Tiffin Wiffin <em>.</em></a></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-8 text-right menu-1\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"menu.jsp\">Menu</a></li>\r\n");
      out.write("                                <li><a href=\"plans.jsp\">Plans</a></li>\r\n");
      out.write("                                <!--\t\t\t\t\t\t<li class=\"has-dropdown\">\r\n");
      out.write("                                                                                        <a href=\"plans.jsp\">Plans</a>\r\n");
      out.write("                                                                                        <ul class=\"dropdown\">\r\n");
      out.write("                                                                                                <li><a href=\"#\">Gujarati</a></li>\r\n");
      out.write("                                                                                                <li><a href=\"#\">Punjabi</a></li>\r\n");
      out.write("                                                                                        </ul>\r\n");
      out.write("                                                                                </li>-->\r\n");
      out.write("\r\n");
      out.write("                                <li><a href=\"services.jsp\">Services</a></li>\r\n");
      out.write("                                <li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("                                    ");

                                        if (session.getAttribute("id") == null) {
                                    
      out.write("\r\n");
      out.write("                                <li class=\"has-dropdown\"><a href=\"signup.jsp\">Sign Up</a>\r\n");
      out.write("                                    <ul class=\"dropdown\">\r\n");
      out.write("                                        <li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("\r\n");
      out.write("                                    </ul></li>\r\n");
      out.write("                                    ");

                                    } else {
                                    
      out.write("\r\n");
      out.write("                                    <li><a href=\"mydetails.jsp\">My Details</a></li>\r\n");
      out.write("                                <li class=\"btn-cta\"><a onclick=\"signOut();\" href=\"SignOut\"><span>Sign Out</span></a></li>\r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"btn-cta\"><a href=\"order.jsp\"><span class=\"icon\">\r\n");
      out.write("                                            <i class=\"ti-shopping-cart\"></i>\r\n");
      out.write("                                        </span></a></li>\r\n");
      out.write("                            </ul>\t\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <header id=\"gtco-header\" class=\"gtco-cover gtco-cover-md\" role=\"banner\" style=\"background-image: url(images/img_bg_1.jpg)\" data-stellar-background-ratio=\"0.5\">\r\n");
      out.write("                <div class=\"overlay\"></div>\r\n");
      out.write("                <div class=\"gtco-container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12 col-md-offset-0 text-left\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row row-mt-15em\">\r\n");
      out.write("                                <div class=\"col-md-7 mt-text animate-box\" data-animate-effect=\"fadeInUp\">\r\n");
      out.write("                                    <h1 class=\"cursive-font\">Join the family!</h1>\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4 col-md-push-1 animate-box\" data-animate-effect=\"fadeInRight\">\r\n");
      out.write("                                    <div class=\"form-wrap\">\r\n");
      out.write("                                        <div class=\"tab\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"tab-content\">\r\n");
      out.write("                                                <div class=\"tab-content-inner active\" data-content=\"signup\">\r\n");
      out.write("                                                    <h3 class=\"cursive-font\">Sign Up</h3>\r\n");
      out.write("                                                    <form action=\"SignupServlet\" method=\"POST\">\r\n");
      out.write("                                                        <div class=\"row form-group\">\r\n");
      out.write("                                                            <div class=\"col-md-12\">\r\n");
      out.write("                                                                <label class=\"sr-only\" for=\"name\">Name</label>\r\n");
      out.write("                                                                <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Your firstname\" required=\"\">\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                                        <div class=\"row form-group\">\r\n");
      out.write("                                                            <div class=\"col-md-12\">\r\n");
      out.write("                                                                <label for=\"email\" class=\"sr-only\">Email</label>\r\n");
      out.write("                                                                <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Your Email Address\" required=\"\">\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"row form-group\">\r\n");
      out.write("                                                            <div class=\"col-md-12\">\r\n");
      out.write("                                                                <label for=\"password\"  class=\"sr-only\">Password</label>\r\n");
      out.write("                                                                <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Your Password\" required=\"\">\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"row form-group\">\r\n");
      out.write("                                                            <div class=\"col-md-12\">\r\n");
      out.write("                                                                <label class=\"sr-only\" for=\"email\">Address</label>\r\n");
      out.write("                                                                <input type=\"text\" name=\"address\" class=\"form-control\" placeholder=\"Your address\" required=\"\">\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"row form-group\">\r\n");
      out.write("                                                            <div class=\"col-md-12\">\r\n");
      out.write("                                                                <label class=\"sr-only\" for=\"contact\">Contact Number</label>\r\n");
      out.write("                                                                <input type=\"number\" name=\"contact\" class=\"form-control\" placeholder=\"Your Contact number\" required=\"\">\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                                        <div class=\"row form-group\">\r\n");
      out.write("                                                            <div class=\"col-md-12\">\r\n");
      out.write("                                                                <input type=\"submit\" class=\"btn btn-primary btn-block\" value=\"Register\">\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div id=\"page\">\r\n");
      out.write("\r\n");
      out.write("                                                                <input type=\"hidden\" formaction=\"GoogleSignup\" >\r\n");
      out.write("                                                               <div class=\"g-signin2\" data-width=\"285\" data-height=\"50\" data-longtitle=\"true\" style=\"margin: 10px;\" data-onsuccess=\"onSignUp\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                                </input>\r\n");
      out.write("                                                                <a class=\"logout\" onclick=\"signOut();\" href=\"SignOut\" >Sign out</a> \r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div style=\"text-align: center\">Already have an account?  <a href=\"login.jsp\">Login!</a></div>\r\n");
      out.write("                                                    </form>\t\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            <!--            <div class=\"gtco-cover gtco-cover-sm\" style=\"background-image: url(images/img_bg_1.jpg)\"  data-stellar-background-ratio=\"0.5\">\r\n");
      out.write("                            <div class=\"overlay\"></div>\r\n");
      out.write("                            <div class=\"gtco-container text-center\">\r\n");
      out.write("                                <div class=\"display-t\">\r\n");
      out.write("                                    <div class=\"display-tc\">\r\n");
      out.write("                                        <h1>&ldquo; Their high quality of service makes me back over and over again!&rdquo;</h1>\r\n");
      out.write("                                        <p>&mdash; Sahil Shah, CEO of NetSavvies Co.</p>\r\n");
      out.write("                                    </div>\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>-->\r\n");
      out.write("\r\n");
      out.write("            <footer id=\"gtco-footer\" role=\"contentinfo\" style=\"background-image: url(images/img_bg_1.jpg)\" data-stellar-background-ratio=\"0.5\">\r\n");
      out.write("                <div class=\"overlay\"></div>\r\n");
      out.write("                <div class=\"gtco-container\">\r\n");
      out.write("                    <div class=\"row row-pb-md\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-12 text-center\">\r\n");
      out.write("                            <div class=\"gtco-widget\">\r\n");
      out.write("                                <h3>Get In Touch</h3>\r\n");
      out.write("                                <ul class=\"gtco-quick-contact\">\r\n");
      out.write("                                    <li><a href=\"tel://9090909090\"><i class=\"icon-phone\"></i> +91 9090909090</a></li>\r\n");
      out.write("                                    <li><a href=\"mailto:info@TiffinWiffin.com\"><i class=\"icon-mail2\"></i> info@TiffinWiffin.co</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-12 text-center copyright\">\r\n");
      out.write("                            <p><small class=\"block\">&copy;All Rights Reserved.</small> \r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("            <!-- </div> -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"gototop js-top\">\r\n");
      out.write("            <a href=\"#\" class=\"js-gotop\"><i class=\"icon-arrow-up\"></i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <!-- jQuery Easing -->\r\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- Waypoints -->\r\n");
      out.write("        <script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("        <!-- Carousel -->\r\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("        <!-- countTo -->\r\n");
      out.write("        <script src=\"js/jquery.countTo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Stellar Parallax -->\r\n");
      out.write("        <script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Magnific Popup -->\r\n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("        <script src=\"js/magnific-popup-options.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Main -->\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
