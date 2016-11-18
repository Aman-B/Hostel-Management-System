<%-- 
    Document   : showhostels
    Created on : Nov 16, 2016, 8:11:24 PM
    Author     : Aman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hostels' List</title>
        <style>
body {
background-image: url("img/bgr.jpg");}
h1   {color: brown;}
p    {color: black;}

</style>
    </head>
    <body>
        <h1>Hostels' List!</h1>
       
       <form action="SavePref" method="post">
      <input type="text" name="username" value="${username}" hidden> </input>
       <input type="password" name="password" value="${password}" hidden> </input>

          <h3 >Provide hostel preferences:</h3>
            
              <label for="p1">Pref 1: </label>
              <select name="p1" size="1" id="p1" >
                  
                <option value="14th Block" selected>14th Block</option>
                <option value="15th Block">15th Block</option>
                <option value="16th Block">16th Block</option>
                <option value="20th Block">20th Block</option>
                <option value="10th Block">10th Block</option>
              </select>
              <br/>
           <br/>
          
           <label for="p2">Pref 2: </label>
              <select name="p2" size="1" id="p2" >
                  
                  
               
                 <option value="14th Block" selected>14th Block</option>
                <option value="15th Block">15th Block</option>
                <option value="16th Block">16th Block</option>
                <option value="20th Block">20th Block</option>
                <option value="10th Block">10th Block</option>
              </select>
           <br>
           <br>
           <label for="p3">Pref 3: </label>
              <select name="p3" size="1" id="p3" >
                  
                 
               
                <option value="14th Block" selected>14th Block</option>
                <option value="15th Block">15th Block</option>
                <option value="16th Block">16th Block</option>
                <option value="20th Block">20th Block</option>
                <option value="10th Block">10th Block</option>
              </select>
           <br>
           <br>
           
           <input type="submit" value="Submit Preference">
</form>
    </body>
</html>
