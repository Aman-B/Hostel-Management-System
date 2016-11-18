/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aman.classes;

import com.aman.JDBC.StudentJDBCTemplate;
import com.aman.JDBC.UserJDBCTemplate;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aman
 */
public class SavePref extends HttpServlet {

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
            out.println("<title>Servlet SavePref</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SavePref at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
    ApplicationContext applicationContext=
               new ClassPathXmlApplicationContext("resources/applicationContext.xml");
    StudentJDBCTemplate studentJDBCTemplate= (StudentJDBCTemplate) applicationContext.getBean("StudentJDBCTemplate");
    
        UserJDBCTemplate mUserJDBCTemplate=(UserJDBCTemplate) applicationContext.getBean("UserJDBCTemplate");

            String p1=null,p2=null,p3=null,username=null,password=null;
            if(request.getParameter("p1")!=null)
            {
                p1= request.getParameter("p1");
                p2= request.getParameter("p2");
                p3= request.getParameter("p3");
                username=request.getParameter("username");
                password=request.getParameter("password");
                studentJDBCTemplate.setPref(username, p1, p2, p3);
                mUserJDBCTemplate.setFilled(username, "yes");
            }
            
           PrintWriter out =response.getWriter();
           out.println("<head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>Preference Saved!</title>\n" +
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
"\n" +
"</style>\n" +
"    </head>");
           out.print("<h1>Applied Successfully!</h2>");
            System.out.println("Pref 1 : "+p1+"Pref 2 : "+p2+"Pref 3: "+p3+"Username :"+username);
          
           out.print("<form  method=\"GET\" action=\"/HostelManagementSystem/index.htm\">"
                   +"<input type=\"text\" name=\"userName\" value="+username+" hidden/>"
                   +"<p hidden><input type=\"password\" name=\"password\" value="+password+" hidden/></p>"
                   +"<input type=\"submit\" value=\"Logout\" />"
                   + "</form>");
    
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
