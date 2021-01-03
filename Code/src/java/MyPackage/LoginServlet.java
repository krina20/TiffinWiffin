package MyPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 *
 * @author user
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
         try (PrintWriter out = response.getWriter())
        {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            try{
                if(email!=null)
                {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffinwiffin","root","");
                    
                    String query = "select * from cust_details where email_id=? and password=?";
                    PreparedStatement psm = con.prepareStatement(query);
                    psm.setString(1, email);
                    psm.setString(2, password);
                    ResultSet rs = psm.executeQuery();
                    if(rs.next()) 
                    {
                       int id= rs.getInt(1);
                       HttpSession session = request.getSession(true);
                       session.setAttribute("id", id);
                       session.setAttribute("name",rs.getString("name"));
                       session.setAttribute("contact_no",rs.getString("contact_no"));
                       session.setAttribute("address",rs.getString("address"));
                       
                       response.sendRedirect("home.jsp");
                    }
                    else
                    {
                        out.println("<script type=\"text/javascript\">");
                 out.println("alert('Login Failed! Try Again!');");
                 out.println("location='login.jsp';");
             
                 out.println("</script>");
                    }
                }
            }
            catch(Exception e)
            {
                out.println("Exception:" + e.getMessage());
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
