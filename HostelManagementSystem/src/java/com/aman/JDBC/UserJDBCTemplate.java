/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aman.JDBC;

import com.aman.POJO.UserLogin;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Aman
 */
public class UserJDBCTemplate {
    
    private JdbcTemplate jdbcTemplate;
    
    
     public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
     
     
     public  void create(String username, String password,String filled,String alloted)
    {
        String SQL ="insert into login1 (username,password,filled,alloted) values (?,?,?,?)";
        
        jdbcTemplate.update(SQL,username,password,filled,alloted);
        System.out.println("Created Record name = "+username+" and password = "+password);
        
    }
    public UserLogin getAccount(String username)
    {
         String SQL ="select * from login1  where username =?";
        
//        jdbcTemplate.update(SQL,username);
        UserLogin account= jdbcTemplate.queryForObject(SQL, new Object[]{username},new UserLoginMapper());
        return account;
    }
    
     public List<UserLogin> listAccounts ()
    {
        String SQL ="select * from login1";
        List<UserLogin> login= jdbcTemplate.query(SQL,new UserLoginMapper());
        
        return login;
        
    }
    public void setFilled(String username,String filled)
    {
        String SQL ="update login1 set filled=?  where username =?";        
        jdbcTemplate.update(SQL,filled,username);
        System.out.println("Record updated!");
        
    }
    public UserLogin getFilled(String username)
    {
         String SQL ="select * from login1  where username =?";
        
//        jdbcTemplate.update(SQL,username);
        UserLogin account= jdbcTemplate.queryForObject(SQL, new Object[]{username},new UserLoginMapper());
        return account;
    }
    
    public void setAlloted(String username,String alloted)
    {
        String SQL ="update login1 set alloted=?  where username =?";        
        jdbcTemplate.update(SQL,alloted,username);
        System.out.println("Record updated!");
        
    }
}
