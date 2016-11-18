/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aman.JDBC;

import com.aman.POJO.Student;
import com.aman.POJO.UserLogin;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Aman
 */
public class StudentJDBCTemplate {
 private JdbcTemplate jdbcTemplate;
    
    
     public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
     
     
     public  void create(String username,String name,int age,String regnum,String yearofstudy,String emailid,
             String p1,String p2,String p3,String alloted)
    {
        String SQL ="insert into stdetails (username,name,age,regnum,yearofstudy,emailid,p1,p2,p3,alloted) values "
                + "(?,?,?,?,?,?,?,?,?,?)";
        
        jdbcTemplate.update(SQL,username,name,age,regnum,yearofstudy,emailid,p1,p2,p3,alloted);
        System.out.println("Created Record name = "+username+"!");
        
    }
    public Student getStudent(String username)
    {
         String SQL ="select * from stdetails  where username =?";
        
//        jdbcTemplate.update(SQL,username);
        Student account= jdbcTemplate.queryForObject(SQL, new Object[]{username},new StudentMapper());
        return account;
    }
    
     public List<Student> listStudents ()
    {
        String SQL ="select * from stdetails order by yearofstudy";
        List<Student> login= jdbcTemplate.query(SQL,new StudentMapper());
        
        return login;
        
    }
     
    public void setPref(String username,String p1,String p2,String p3)
    {
        String SQL ="update stdetails set p1=?,p2=?,p3=?  where username =?";        
        jdbcTemplate.update(SQL,p1,p2,p3,username);
        System.out.println("Record updated!");
        
    }
    public void setAlloted(String regnum,String alloted)
    {
        String SQL ="update stdetails set alloted=?  where regnum =?";        
        jdbcTemplate.update(SQL,alloted,regnum);
        System.out.println("Record updated!");
        
    }
    public void setFilled(String regnum,String filled)
    {
        String SQL ="update stdetails set filled=?  where regnum =?";        
        jdbcTemplate.update(SQL,filled,regnum);
        System.out.println("Record updated!");
        
    }
    
}

