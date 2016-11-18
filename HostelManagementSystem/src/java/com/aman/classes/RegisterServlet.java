/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aman.classes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aman
 */
public class RegisterServlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        //processRequest(request, response);
     try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
                        
            out.println("<head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>Student Registration</title>\n" +
"     \n" +
"<style>\n" +
"body {\n" +
"background-image: url(\"img/bgr.jpg\");}\n" +
                    "br {display:none;}"+
"h1   {color: brown;\n" +
" font-family: sans-serif;}\n" +
"p    {color: black;\n" +
"      font-family: sans-serif;\n" +
"      font-size: 12px;\n" +
"}" +
"\n" +"input[type=text] {\n" +
"    padding:5px; \n" +
"    border:2px solid #ccc; \n" +
"    -webkit-border-radius: 5px;\n" +
"    border-radius: 5px;\n" +
"}\n" +
"\n" +
"input[type=text]:focus {\n" +
"    border-color:#333;\n" +
"}\n" +
"input[type=password] {\n" +
"    padding:5px; \n" +
"    border:2px solid #ccc; \n" +
"    -webkit-border-radius: 5px;\n" +
"    border-radius: 5px;\n" +
"}\n" +
"\n" +
"input[type=password]:focus {\n" +
"    border-color:#333;\n" +
"}"+"input[type=number] {\n" +
"    padding:5px; \n" +
"    border:2px solid #ccc; \n" +
"    -webkit-border-radius: 5px;\n" +
"    border-radius: 5px;\n" +
"}\n" +
"\n" +
"input[type=number]:focus {\n" +
"    border-color:#333;\n" +
"}"+"input[type=email] {\n" +
"    padding:5px; \n" +
"    border:2px solid #ccc; \n" +
"    -webkit-border-radius: 5px;\n" +
"    border-radius: 5px;\n" +
"}\n" +
"\n" +
"input[type=email]:focus {\n" +
"    border-color:#333;\n" +
"}"+"input[type=submit] {\n" +
"    padding:5px 15px; \n" +
"    background:#ccc; \n" +
"    border:0 none;\n" +
"    cursor:pointer;\n" +
"    -webkit-border-radius: 5px;\n" +
"    border-radius: 5px; \n" +
"}"+
"</style>\n" +
"    </head></head>");
            out.println("<body>");
            
            out.println("<h1 align=\"center\">Registration:</h1>");
            out.println("<form action=StudentRegistered method=post>");
            out.println("<div align=\"center\">"
                    + "<table><tr><td>Name:</td><td> <input type=\"text\" name=\"name\"></td></tr>\n" +"");
            out.println("<tr><td>Username: </td><td><input type=\"text\" name=\"username\"></td></tr><br> <br>\n" +"");
            out.println("<tr><td>Regnum : </td>"
                    + "<td><input type=number name=regnum></td></tr></<br><br>");
            out.println("<tr><td>Password: </td><td><input type=\"password\" name=\"password\"></td></tr><br><br>\n");
            out.println("<tr><td>Email id : </td><td><input type=email name=emailid></td></tr><br><br>");
            out.println("<tr><td>Age : </td><td><input type=number name=age></td></tr><br><br>");
            out.println("<tr><td>Year Of Study : </td><td><input type=\"text\" name=yearofstudy></td></tr><br><br>");
            out.println("<tr><td><input type=submit value=Register></td></tr></table></div> </form>");
            out.println("</body>");
            out.println("</html>");
        }
    
    
    
    
    
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
