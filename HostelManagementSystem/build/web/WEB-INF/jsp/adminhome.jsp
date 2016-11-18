<%-- 
    Document   : adminhome
    Created on : Nov 17, 2016, 1:23:40 AM
    Author     : Aman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
body {
background-image: url("img/bgr.jpg");}
h1   {color: brown;
 font-family: sans-serif;}
p    {color: black;
      font-family: sans-serif;
      font-size: 12px;
}
input[type=submit] {
    padding:5px 15px; 
    background:#ccc; 
    border:0 none;
    cursor:pointer;
    -webkit-border-radius: 5px;
    border-radius: 5px; 
}
</style>
    </head>
    <body>
        <h1 align="center">Welcome Admin!</h1>
              
        <br>
        <br>
        <div align="center" ><form action="ShowStudentPref" method="GET" >
     
        <input type="submit" value= "See Students' hostel preference">
        </form>
        </div>
        <br>
        <br>
        
         <div align="center" ><form action="https://www.gmail.com" method="GET" >
     
            <input type="submit" value= "Open mail" >
        </form>
         </div>
    </body>
</html>
