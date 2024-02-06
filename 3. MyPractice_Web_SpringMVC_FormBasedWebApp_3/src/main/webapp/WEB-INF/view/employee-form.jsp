<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Registration Form</title>
</head>
<body>

    <!-- Spring form taglib used for binding form elements to model attributes -->
    <form:form action="processForm" modelAttribute="employeeModel">
    
        <!-- Input field for First Name -->
        First Name : <form:input path="firstName"/>
        <br>
        <br>
        
        <!-- Input field for Last Name -->
        Last Name : <form:input path="LastName"/>
        <br>
        <br>
        
        <!-- Radio buttons for selecting Department -->
        Department : 
        Hr <form:radiobutton path="department" value="Hr"/>
        Admin <form:radiobutton path="department" value="Admin"/>
        IT <form:radiobutton path="department" value="IT"/>
        <br>
        <br>
        
        <!-- Checkboxes for selecting Technologies -->
        Technologies :
        Excel <form:checkbox path="technologies" value="Excel"/>
        Java <form:checkbox path="technologies" value="Java"/>
        RDBMS <form:checkbox path="technologies" value="RDBMS"/>
        <br>
        <br>
        
        <!-- Submit button -->
        <input type="submit" value="Submit"/>
        
    </form:form>

</body>
</html>
