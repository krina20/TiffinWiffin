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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shiva
 */
@WebServlet(urlPatterns = {"/GoogleSignup"})
public class GoogleSignup extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            
            
            String email = request.getParameter("email");
            String name = request.getParameter("name").toString().replace('_',' ');
            String contact = request.getParameter("contact");
            String address=request.getParameter("address");
            
            int status =0;
            
            try{
                if(email!=null)
                {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffinwiffin","root","");
                    
                    String query = "insert into cust_details(email_id,name,contact_no,address) values (?,?,?,?)";
                    PreparedStatement psm = con.prepareStatement(query);
                    psm.setString(1, email);
                    psm.setString(2, name);
                    psm.setString(3, contact);
                    psm.setString(4, address);
                    status = psm.executeUpdate();
                    
                   
                    
                    if(status == 1)
                    {
                        response.sendRedirect("login.jsp");
                    }
                    else{
                        out.write("Signup failed! Try again");
                    }
                    con.close();
                }
            }
            
            catch(Exception e)
            {
                if(e.toString().contains("MySQLIntegrityConstraintViolationException"))
                {
                 out.println("<script type=\"text/javascript\">");
                 out.println("alert('User Already Exist!Login!');");
                 out.println("location='login.jsp';");
                 out.println("</script>");
                }
                else
                    
                {
                    out.print(e.toString());
                }
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
