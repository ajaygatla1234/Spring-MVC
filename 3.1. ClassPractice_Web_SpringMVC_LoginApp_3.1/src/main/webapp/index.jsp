<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Spring MVC Login Example</title>
</head>
<body>

    <!-- Form for user login with username and password -->
    <div align="center">
        <form action="loginrqpm.html" method="post">
            <!-- Input field for entering the username -->
            Username:<input type="text" name="userName"> 
            <br /> <br /> 
            <!-- Input field for entering the password -->
            Password:<input type="password" name="password"> 
            <br /> <br /> 
            <!-- Submit button for submitting the login form -->
            <input type="submit" value="login" />
        </form>
    </div>
</body>
</html>
