<%-- 
    Document   : agecalculator
    Created on : Sep 24, 2021, 5:05:04 PM
    Author     : seanz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age" >
            <label>First Name:</label>
            <input type="text" name ="your_age" value="${yourAge}" >
            <br> 
            <input type="submit" value="Age next birthday">    
        </form>
        <p>${message}</p>
        <p><a href="arithmetic">Arithmetic Calculator</a></p>
    </body>
</html>

