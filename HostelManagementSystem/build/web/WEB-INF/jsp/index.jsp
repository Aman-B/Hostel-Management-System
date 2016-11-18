<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Hostel Reservation System</title>
     
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
   font-size: 14px;
   font-family: sans-serif;
}
td{font-family: sans-serif;
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
input[type=text] {
    padding:5px; 
    border:2px solid #ccc; 
    -webkit-border-radius: 5px;
    border-radius: 5px;
}

input[type=text]:focus {
    border-color:#333;
}
input[type=password] {
    padding:5px; 
    border:2px solid #ccc; 
    -webkit-border-radius: 5px;
    border-radius: 5px;
}

input[type=password]:focus {
    border-color:#333;
}
img {
    opacity: 0.5;
    filter: alpha(opacity=50); /* For IE8 and earlier */
}
.imgcontainer {
    text-align: center;
    margin: 12px 0 12px 0;
}

img.avatar {
    width: 10%;
    border-radius: 50%;
}

.container {
    padding: 10px;
}

</style>
    </head>

    <body>
        <div align="center"><h1>Hostel Reservation System</h1></div>
         
       <form:form  method="POST" action="/HostelManagementSystem/addUser.htm">
            <div class="imgcontainer">
                <img src="img/pp.png" alt="Avatar" class="avatar">
              </div>
        <div align="center">
            <table cellpadding="2px">
                <tr>
                    <td ><em><b>User Name</b></em></td>
                    <td><input type="text" name="userName" /></td>
                </tr>
                <tr>
                    <td><em><b>Password</b></em></td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit" align="right"/></td>
                </tr>
            </table>
            <div style="color: red">${error}</div>
        </div>
         <div>
                ${message}
            </div>
    </form:form>
        <br>
        <br>
        <br>
        <div align="center">
            
            <p>Not Registered? Register here, to apply for hostels!</p>
            <form action="RegisterServlet" method="get" >
                
             <input type="submit" value="Register" align="center">
            </form></div>


    </body>
</html>
