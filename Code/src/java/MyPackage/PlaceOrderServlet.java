/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shiva
 */
@WebServlet(name = "PlaceOrderServlet", urlPatterns = {"/PlaceOrderServlet"})
public class PlaceOrderServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session=request.getSession();
            
            try
            {
            String cust_id=session.getAttribute("id").toString();
            
            String plan_id=request.getParameter("planid");
          
            String start_date =request.getParameter("startdate");
           
            String end_date=request.getParameter("enddate");
            
            String quantity = request.getParameter("quantity");
            
            String order_total=request.getParameter("ordertotal");
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffinwiffin","root","");
                    
                    String query = "insert into orders(cust_id,plan_id,start_date,end_date,quantity,order_total) values (?,?,?,?,?,?)";
                    PreparedStatement psm = con.prepareStatement(query);
                    
                    psm.setString(1, cust_id);
                    psm.setString(2, plan_id);
                    psm.setString(3, start_date);
                    psm.setString(4, end_date);
                    psm.setString(5, quantity);
                    psm.setString(6, order_total);
                    int status = psm.executeUpdate();

                    if(status == 1)
                    {
                       out.println("<script type=\"text/javascript\">");
                       out.println("alert('Order Placed Successfully!');");
                       out.println("location='home.jsp';");
                       out.println("</script>");
                    }
                    else{
                        out.println("<script type=\"text/javascript\">");
                       out.println("alert('Order Not Placed!');");
                       out.println("location='order.jsp';");
                       out.println("</script>");
                    }
                    con.close();
            }
            catch(Exception e)
            {
                out.print(e);
            }
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
