/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aman.classes;

import com.aman.JDBC.StudentJDBCTemplate;
import com.aman.JDBC.UserJDBCTemplate;
import com.aman.POJO.Student;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class ShowStudentPref extends HttpServlet {

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
            out.println("<title>Servlet ShowStudentPref</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowStudentPref at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
       
       PrintWriter out= response.getWriter();
       
           ApplicationContext applicationContext=
               new ClassPathXmlApplicationContext("resources/applicationContext.xml");
           
           StudentJDBCTemplate mStudentJDBCTemplate= (StudentJDBCTemplate) applicationContext.getBean("StudentJDBCTemplate");

            UserJDBCTemplate mUserJDBCTemplate= (UserJDBCTemplate) applicationContext.getBean("UserJDBCTemplate");

           
           
           List<Student> mList= mStudentJDBCTemplate.listStudents();
           out.println("<!DOCTYPE html>");
            out.println("<html>");
                        
            out.println("<head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>Student Preference List</title>\n" +
"     \n" +
"<style>\n" +
"body {\n" +
"background-image: url(\"img/bgr.jpg\");}\n" +
"h2  {color: brown;"
                    + " font-family: sans-serif;}\n" +
                    
"tr   {color: black;"
                    + "font-family: sans-serif;}\n"+
"h1   {color: brown;\n" +
" font-family: sans-serif;}\n" +
"p    {color: black;\n" +
"      font-family: sans-serif;\n" +
"      font-size: 12px;\n" +
"}" +
"\n" +
"</style>\n" +
"    </head></head>");
           out.print("<h2>Hostel request list:</h2>"
                   + "<p>Click on hostel blocks to allot to the corresponding student </p>"
                   + "<table border =1px> <tr>"
                   +"<th>Year Of Study</th>"
                 + "<th>Student Regnum </th>"
                 + "<th>Student Name </th>"       
                 + "<th>Pref 1 </th>"
                 + "<th>Pref 2 </th>"
                 + "<th>Pref 3 </th></tr>");
         for(Student s: mList)
         {
             if(s.getAlloted().equalsIgnoreCase("not alloted"))
             {
                 if(s.getP1().equalsIgnoreCase("not selected"))
                 {
                 }else{
             out.print("<tr> <td>"+s.getYearofstudy()+ "</td><td>"+s.getRegnum()+ "</td><td>"+s.getName()+"</td><td> <a href=\"AllotHostel?regnum="+s.getRegnum()+"&block="+s.getP1()+"&name="+s.getUsername()+"\">"+ s.getP1()+"</a></td>"
                    + "<td> <a href=\"AllotHostel?regnum="+s.getRegnum()+"&block="+s.getP2()+"&name="+s.getUsername()+"\">"+ s.getP2()+"</a></td><td>  <a href=\"AllotHostel?regnum="+s.getRegnum()+"&block="+s.getP3()+"&name="+s.getUsername()+"\">"+ s.getP3()+"</a></td></tr> "
                   );
                }
             }
         }
         out.print("<div align=\"bottom\"><form  method=\"GET\" action=\"/HostelManagementSystem/index.htm\">"
                  +"<input type=\"submit\" value=\"Logout\" />"
                   + "</form></div>");
    
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
