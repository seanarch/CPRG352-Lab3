<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 24, 2021, 7:18:17 PM
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
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic" >
            <label>First: </label>
            <input type="text" name ="first_number" value="${firstNumber}" >
            <br>
            <label>Second: </label>
            <input type="text" name ="second_number" value="${secondNumber}" >
            <br> 
            <input type="submit" name= "action" value="+">    
            <input type="submit" name= "action" value="-">  
            <input type="submit" name= "action" value="*">  
            <input type="submit" name= "action" value="%">  
        </form>
        <p>Result: --- ${message}</p>
        <p><a href="/age">Age Calculator</a></p>
    </body>
</html>
