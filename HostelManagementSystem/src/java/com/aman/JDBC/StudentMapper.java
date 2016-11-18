/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aman.JDBC;

import com.aman.POJO.Student;
import com.aman.POJO.UserLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Aman
 */
class StudentMapper implements RowMapper<Student>  {

    @Override
    public Student mapRow(ResultSet rs, int i) throws SQLException {
    Student mStudent= new Student();
    
    mStudent.setUsername(rs.getString("username"));
    mStudent.setName(rs.getString("name"));
    mStudent.setAge(rs.getInt("age"));
    mStudent.setRegnum(rs.getString("regnum"));
    mStudent.setYearofstudy(rs.getString("yearofstudy"));
    mStudent.setEmailid(rs.getString("emailid"));
    mStudent.setP1(rs.getString("p1"));
    mStudent.setP2(rs.getString("p2"));
    mStudent.setP3(rs.getString("p3"));
    mStudent.setAlloted(rs.getString("alloted"));
    
    return mStudent;
    
    


//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
