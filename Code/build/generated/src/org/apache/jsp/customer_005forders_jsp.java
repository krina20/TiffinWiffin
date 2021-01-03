package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class customer_005forders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <meta charset=\"ISO-8859-1\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/uni.css\" />\n");
      out.write("\n");
      out.write("<script src=\"js/log.js\"></script>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<title>TiffinWiffin</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<meta name=\"description\" content=\"Tiffin Service by TiffinWiffin.co\" />\n");
      out.write("\t<meta name=\"keywords\" content=\"tiffin, service, delievery, TiffinWiffin, mobile first, responsive\" />\n");
      out.write("\t<meta name=\"author\" content=\"TiffinWiffin.co\" />\n");
      out.write("\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Kaushan+Script\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("\t<!-- Animate.css -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<!-- Icomoon Icon Fonts-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("\t<!-- Themify Icons-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n");
      out.write("\t<!-- Bootstrap  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\n");
      out.write("\t<!-- Magnific Popup -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap DateTimePicker -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-datetimepicker.min.css\">\n");
      out.write("\n");
      out.write("\t<!-- Owl Carousel  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("\n");
      out.write("\t<!-- Theme style  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\t<!-- Modernizr JS -->\n");
      out.write("\t<script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("\t<!-- FOR IE9 below -->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"js/respond.min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"gtco-loader\"></div>\n");
      out.write("\t\n");
      out.write("\t<div id=\"page\">\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!-- <div class=\"page-inner\"> -->\n");
      out.write("\t<nav class=\"gtco-nav\" role=\"navigation\">\n");
      out.write("\t\t<div class=\"gtco-container\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-xs-12\">\n");
      out.write("\t\t\t\t\t<div id=\"gtco-logo\"><a href=\"adminhome.jsp\">Tiffin Wiffin <em>.</em></a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-xs-8 text-right menu-1\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"customer_orders.jsp\">Customer's Orders</a></li>\n");
      out.write("                                                <li><a href=\"customer_feedbacks.jsp\">Customer's Feedbacks</a></li>\n");
      out.write("                                                 <li> <a href=\"adminLogin.jsp\" >Sign out</a> </li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("        \n");
      out.write(" \n");
      out.write("\t\n");
      out.write("\t<header id=\"gtco-header\" class=\"gtco-cover gtco-cover-sm\" role=\"banner\" style=\"background-image: url(images/img_bg_1.jpg)\" data-stellar-background-ratio=\"0.5\">\n");
      out.write("\t\t<div class=\"overlay\"></div>\n");
      out.write("\t\t<div class=\"gtco-container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12 col-md-offset-0 text-center\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row row-mt-15em\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12 mt-text animate-box\" data-animate-effect=\"fadeInUp\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"cursive-font\">Customer's Orders</h1>\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("        <div class=\"gtco-section\">\n");
      out.write("\t\t<div class=\"gtco-container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <center>\n");
      out.write("                            <table style=\"width:100%\" border=\"1\" style=\"border-color:#fbb448\">\n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("                                                    ");

                                                        Class.forName("com.mysql.jdbc.Driver");
                                                        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffinwiffin","root","");
                                                        Statement st = con.createStatement();
                                                        ResultSet rs = st.executeQuery("select order_id,cust_details.cust_id,plan_name,start_date,end_date,contact_no,address,quantity,order_total from orders,cust_details,plans where cust_details.cust_id=orders.cust_id and orders.plan_id=plans.plan_id;");
                                                        
      out.write("\n");
      out.write("                                                        <tr>\n");
      out.write("                                                                <th>Order ID</th>\n");
      out.write("                                                                <th>Customer ID</th>\n");
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
      out.write("                                                                <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                                                                <td>");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                            ");

                                                        }
                                                        
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                        </center>\t\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("                                                    \n");
      out.write("\t<!-- jQuery -->\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t<!-- jQuery Easing -->\n");
      out.write("\t<script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<!-- Waypoints -->\n");
      out.write("\t<script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("\t<!-- Carousel -->\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("\t<!-- countTo -->\n");
      out.write("\t<script src=\"js/jquery.countTo.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Stellar Parallax -->\n");
      out.write("\t<script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Magnific Popup -->\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("\t<script src=\"js/magnific-popup-options.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<script src=\"js/moment.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Main -->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
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
