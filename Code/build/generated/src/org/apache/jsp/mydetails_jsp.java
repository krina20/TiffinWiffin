package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class mydetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"ISO-8859-1\">\n");
      out.write("        <meta name=\"google-signin-client_id\" content=\"941517274442-70uv4fsbb8br4pcuicm7thek6rs8r4ah.apps.googleusercontent.com\">\n");
      out.write("            \n");
      out.write("<!--        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>-->\n");
      out.write("        <script src=\"js/log.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js?onload=renderButton\" async defer></script>\n");
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
      out.write("                                    <li><a href=\"mydetails.jsp\">My Details</a></li>\n");
      out.write("                                <li class=\"btn-cta\"><a onclick=\"signOut();\" href=\"SignOut\"><span>Sign Out</span></a></li>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                <li class=\"btn-cta\"><a href=\"OrderServlet\"><span class=\"icon\">\n");
      out.write("                                            <i class=\"ti-shopping-cart\"></i>\n");
      out.write("                                        </span></a></li>\n");
      out.write("                                         ");

                                                    if(session.getAttribute("id")!=null)
                                                    {
                                                
      out.write("\n");
      out.write("                                                <li><span style=\"color:white\">Hi, ");
      out.print(session.getAttribute("name") );
      out.write("</span></li>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
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
      out.write("                                    <h1 class=\"cursive-font\">My Profile</h1>\t\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-4 col-md-push-1 animate-box\" data-animate-effect=\"fadeInRight\">\n");
      out.write("                                    <div class=\"form-wrap\">\n");
      out.write("                                        <div class=\"tab\">\n");
      out.write("\n");
      out.write("                                            <div class=\"tab-content\">\n");
      out.write("                                                <div class=\"tab-content-inner active\" data-content=\"signup\">\n");
      out.write("                                                    <h3 class=\"cursive-font\">Edit Profile</h3>\n");
      out.write("                                                    <form action=\"DetailServlet\" method=\"POST\">\n");
      out.write("                                                       <div class=\"row form-group\">\n");
      out.write("                                                            <div class=\"col-md-12\">\n");
      out.write("                                                                <label class=\"sr-only\" for=\"name\">Name</label>\n");
      out.write("                                                                <input type=\"text\" name=\"name\" class=\"form-control\" value=\"");
      out.print(session.getAttribute("name") );
      out.write("\" placeholder=\"Your firstname\" required>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        \n");
      out.write("                                                        <div class=\"row form-group\">\n");
      out.write("                                                            <div class=\"col-md-12\">\n");
      out.write("                                                                <label class=\"sr-only\" for=\"email\">Address</label>\n");
      out.write("                                                                <input type=\"text\" name=\"address\" class=\"form-control\" value=\"");
      out.print(session.getAttribute("address") );
      out.write("\" placeholder=\"Your address\" required>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"row form-group\">\n");
      out.write("                                                            <div class=\"col-md-12\">\n");
      out.write("                                                                <label class=\"sr-only\" for=\"contact\">Contact Number</label>\n");
      out.write("                                                                <input type=\"number\" name=\"contact_no\" class=\"form-control\" value=\"");
      out.print(session.getAttribute("contact_no") );
      out.write("\" placeholder=\"Your Contact number\" required>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                        <div class=\"row form-group\">\n");
      out.write("                                                            <div class=\"col-md-12\">\n");
      out.write("                                                                <input type=\"submit\" class=\"btn btn-primary btn-block\" value=\"Update\">\n");
      out.write("                                                            </div>\n");
      out.write("                                                    </form>\t\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("             <div class=\"gtco-section\">\n");
      out.write("\t\t<div class=\"gtco-container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-8 col-md-offset-2 text-center gtco-heading\">\n");
      out.write("\t\t\t\t\t<h2 class=\"cursive-font primary-color\">Your orders</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                    \n");
      out.write("                        <center>\n");
      out.write("                            <table style=\"width:100%\" border=\"1\" style=\"border-color:#fbb448\">\n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("                                                    ");

                                                        Class.forName("com.mysql.jdbc.Driver");
                                                        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffinwiffin","root","");
                                                        Statement st = con.createStatement();
                                                        ResultSet rs = st.executeQuery("select plan_name,start_date,end_date,contact_no,address,quantity,order_total from orders,cust_details,plans where cust_details.cust_id=orders.cust_id and orders.plan_id=plans.plan_id and cust_details.cust_id="+session.getAttribute("id"));
                                                        
      out.write("\n");
      out.write("                                                        <tr>\n");
      out.write("                                                                \n");
      out.write("                                                                <th>Plan Name</th>\n");
      out.write("                                                                <th>Package Starting Date</th>\n");
      out.write("                                                                <th>Package Ending Date</th>\n");
      out.write("                                                                <th>Contact No</th>\n");
      out.write("                                                                <th>Address</th>\n");
      out.write("                                                                <th>Quantity</th>\n");
      out.write("                                                                <th>Order Total</th>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                        ");

                                                        while(rs.next())
                                                        {
                                                            
      out.write("\n");
      out.write("                                                        \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                            <tr><td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                                                                <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                                                <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                                                <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                                                <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                                                                <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                                                                <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                                                                \n");
      out.write("                                                            </tr>\n");
      out.write("                                                            ");

                                                        }
                                                        
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                        </center>\t\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("            <footer id=\"gtco-footer\" role=\"contentinfo\" style=\"background-image: url(images/img_bg_1.jpg)\" data-stellar-background-ratio=\"0.5\">\n");
      out.write("                <div class=\"overlay\"></div>\n");
      out.write("                <div class=\"gtco-container\">\n");
      out.write("                    <div class=\"row row-pb-md\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-12 text-center\">\n");
      out.write("                            <div class=\"gtco-widget\">\n");
      out.write("                                <h3>Get In Touch</h3>\n");
      out.write("                                <ul class=\"gtco-quick-contact\">\n");
      out.write("                                    <li><a href=\"tel://9090909090\"><i class=\"icon-phone\"></i> +91 9090909090</a></li>\n");
      out.write("                                    <li><a href=\"mailto:info@TiffinWiffin.com\"><i class=\"icon-mail2\"></i> info@TiffinWiffin.co</a></li>\n");
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
      out.write("        <!--</div>-->\n");
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
