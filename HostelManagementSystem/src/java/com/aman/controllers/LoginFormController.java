package com.aman.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aman
 */
import com.aman.JDBC.StudentJDBCTemplate;
import com.aman.JDBC.UserJDBCTemplate;
import com.aman.POJO.Student;
import com.aman.POJO.UserLogin;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginFormController {
    
    
    public static String USERNAME;
     public static String PASSWORD;
    @RequestMapping(value="/index.htm", method = RequestMethod.GET)
   public String initLogin(ModelMap map) {
       map.addAttribute("messsage","");
       return "index";
   }
//     @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
//   public ModelAndView student() {
//      return new ModelAndView("student", "command", new UserLogin());
//   }
   
   @RequestMapping(value = "/addUser.htm", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb")UserLogin student, 
   ModelMap model) {
       
       String uname=student.getUserName();
       String pwd=student.getPassword();
       
           ApplicationContext applicationContext=
               new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        
        UserJDBCTemplate userJDBCTemplate= (UserJDBCTemplate) applicationContext.getBean("UserJDBCTemplate");
      List <UserLogin> users= userJDBCTemplate.listAccounts();
        for (UserLogin info:users)
        {
            //just for testing
            System.out.println(" Username : "+info.getUserName()+ " password : "+info.getPassword());
        
            if(uname.equals(info.getUserName())&&pwd.equals(info.getPassword()))
            {
                if(uname.equalsIgnoreCase("admin"))
                {
                    return "adminhome";
                }
               // model.addAttribute("message", "Login successful");
               USERNAME=uname;
               PASSWORD=pwd;
                 StudentJDBCTemplate studentJDBCTemplate= (StudentJDBCTemplate) applicationContext.getBean("StudentJDBCTemplate");
                Student mStudent= studentJDBCTemplate.getStudent(USERNAME);
                  model.addAttribute("username",mStudent.getUsername());
                  model.addAttribute("name",mStudent.getName());
                  model.addAttribute("age",mStudent.getAge());
                  model.addAttribute("regnum",mStudent.getRegnum());
                  model.addAttribute("yearofstudy",mStudent.getYearofstudy());
                  model.addAttribute("emailid",mStudent.getEmailid());
                  model.addAttribute("p1",mStudent.getP1());
                  model.addAttribute("p2",mStudent.getP2());
                  model.addAttribute("p3",mStudent.getP3());
                  model.addAttribute("alloted",mStudent.getAlloted());

                  System.out.println("info "+info.getAlloted());
                  if(info.getAlloted().equalsIgnoreCase("no"))
                  {
                    return "stdetails";
                  }
                  else
                  {
                     return "stdetailsfilled";//TODO: change this
                  }
            }
        
            
        
        }
        
        
      model.addAttribute("error", "Login unsuccessful!");
      
       System.out.println("Here. matey!");
      
      return "index";
   }
   
    @RequestMapping(value = "/addedUser.htm", method = RequestMethod.POST)
   public String addedStudent(@ModelAttribute("SpringWeb")UserLogin student, 
   ModelMap model) {
       
       String uname=student.getUserName();
       String pwd=student.getPassword();
       
           ApplicationContext applicationContext=
               new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        
        UserJDBCTemplate userJDBCTemplate= (UserJDBCTemplate) applicationContext.getBean("UserJDBCTemplate");
      List <UserLogin> users= userJDBCTemplate.listAccounts();
        for (UserLogin info:users)
        {
            //just for testing
            System.out.println(" Username : "+info.getUserName()+ " password : "+info.getPassword());
        
            if(uname.equals(info.getUserName())&&pwd.equals(info.getPassword()))
            {
                
               // model.addAttribute("message", "Login successful");
               USERNAME=info.getUserName();
               PASSWORD=pwd;
                 StudentJDBCTemplate studentJDBCTemplate= (StudentJDBCTemplate) applicationContext.getBean("StudentJDBCTemplate");
                Student mStudent= studentJDBCTemplate.getStudent(USERNAME);
                  model.addAttribute("username",mStudent.getUsername());
                  model.addAttribute("name",mStudent.getName());
                  model.addAttribute("age",mStudent.getAge());
                  model.addAttribute("regnum",mStudent.getRegnum());
                  model.addAttribute("yearofstudy",mStudent.getYearofstudy());
                  model.addAttribute("emailid",mStudent.getEmailid());
                  model.addAttribute("p1",mStudent.getP1());
                  model.addAttribute("p2",mStudent.getP2());
                  model.addAttribute("p3",mStudent.getP3());
                  model.addAttribute("alloted",mStudent.getAlloted());

                  
                  
                  return "stdetailsfilled";
            }
        
            
        
        }
        
        
      model.addAttribute("error", "Login unsuccessful");
      
       System.out.println("Here. matey!");
      
      return "index";
   }
   
   
}
