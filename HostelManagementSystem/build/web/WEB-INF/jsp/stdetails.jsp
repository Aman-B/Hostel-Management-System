<%-- 
    Document   : stdetails
    Created on : Nov 16, 2016, 9:58:02 PM
    Author     : Aman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Information</title>
        <style>
body {
background-image: url("img/bgr.jpg");}
h1   {color: brown;}
p    {color: black;
      
      font-family: sans-serif;
      font-size: 12px;
}
br {display:none;}

</style>
    </head>
    <body>
        
        <div align="center"> 
                    <h1 algn="center">Student details</h1>
<table  >
            <tr><td><p>  Name : ${name} </p></td></tr>
            <tr><td><p> Age : ${age}</p></td></tr>
       <tr><td><p>  Reg. no :${regnum}</p></td></tr>
       <tr><td> <p>Year of Study : ${yearofstudy}</p></td></tr>
        <tr><td><p>Email ID : ${emailid}</p></td></tr>
        <tr><td><p>Pref 1 : ${p1}</p></td></tr>
      <tr><td><p>  Pref 2 : ${p2}</p></td></tr>
        <tr><td><p>Pref 3 : ${p3}</p></td></tr>
        <tr><td><p>Alloted : ${alloted}</p></td></tr>
       
      <tr><td>  <form action="ShowHostels" method="post" >
             <input type="text" name="username" value="${username}" hidden> 
             <input type="password" name="password" value="${password}" hidden></input>
        <input type="submit" value="Edit/Apply for hostels"></td></tr>
        </form>

        <br>
        <br>
        <tr><td>
       <form method="post" action="mailto:admin@gmail.com?Subject=Hostel%20query" >
<input type="submit" value="Send Email" /> </td></tr>
</form>
        <br>
        <br>
       <tr><td> <form action="/HostelManagementSystem/index.htm" method="GET" >
     
        <input type="submit" value= "Logout"></td></tr>
        </form>
        </table>
        </div>
    </body>
</html>
