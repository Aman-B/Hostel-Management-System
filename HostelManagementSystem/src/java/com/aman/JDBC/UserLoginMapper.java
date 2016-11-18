/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aman.JDBC;

import com.aman.POJO.UserLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Aman
 */
class UserLoginMapper implements RowMapper<UserLogin> {

    public UserLoginMapper() {
    }

    @Override
    public UserLogin mapRow(ResultSet rs, int i) throws SQLException {
        UserLogin mAccounts= new UserLogin();
       
       mAccounts.setUserName(rs.getString("username"));
       mAccounts.setPassword(rs.getString("password"));
       mAccounts.setFilled(rs.getString("filled"));
       mAccounts.setAlloted(rs.getString("alloted"));
       
       return mAccounts;
      
        

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
