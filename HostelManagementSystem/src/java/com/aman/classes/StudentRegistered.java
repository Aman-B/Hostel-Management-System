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
public class StudentRegistered extends HttpServlet {

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
            out.println("<title>Servlet StudentRegistered</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StudentRegistered at " + request.getContextPath() + "</h1>");
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
    response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String username, password,emailid,yearofstudy,name,regnum,p1,p2,p3,alloted ;
            int age;
            
            username=request.getParameter("username");
            password=request.getParameter("password");
            emailid=request.getParameter("emailid");
            name=request.getParameter("name");
            regnum=String.valueOf(request.getParameter("regnum"));
            yearofstudy=request.getParameter("yearofstudy");
            age=Integer.parseInt(request.getParameter("age"));
            p1=request.getParameter("p1");
            p2=request.getParameter("p2");
            p3=request.getParameter("p3");
            alloted="not alloted";
            
            
            ApplicationContext applicationContext=
               new ClassPathXmlApplicationContext("resources/applicationContext.xml");
            
            StudentJDBCTemplate mStudentJDBCTemplate= (StudentJDBCTemplate) applicationContext.getBean("StudentJDBCTemplate");
            UserJDBCTemplate userJDBCTemplate= (UserJDBCTemplate) applicationContext.getBean("UserJDBCTemplate");

            
            try{
            mStudentJDBCTemplate.create(username, name,age,regnum,yearofstudy,
                    emailid,p1,p2, p3,alloted);
            userJDBCTemplate.create(username, password, "no", alloted);
           out.println("<!DOCTYPE html>");
            out.println("<html>");
                        
            out.println("<head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>Student Registered!</title>\n" +
"     \n" +
"<style>\n" +
"body {\n" +
"background-image: url(\"img/bgr.jpg\");}\n" +
"h1   {color: brown;}\n" +
"p    {color: black;}\n" +
"\n" +
"</style>\n" +
"    </head></head>");
            out.println("<body>");
            out.println("<h1>Registration Successful!</h1>");
            out.println("</body>");
            out.println("</html>");
            }
            catch(Exception e)
            {
                out.println("<h2>Exception : "+e+"<h2>");
            }
            
            
            
        }
    
    
    
    
    
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
