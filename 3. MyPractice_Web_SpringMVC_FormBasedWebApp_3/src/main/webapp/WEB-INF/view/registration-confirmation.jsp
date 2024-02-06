<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Confirmation</title>
</head>
<body>

    <!-- Displaying confirmation information using expression language -->
    The Registration of Employee is confirmed : ${employeeModel.firstName} ${employeeModel.lastName}
    <br>
    <br>
    
    <!-- Displaying the assigned department -->
    The Department assigned is : ${employeeModel.department}
    <br>
    <br>
    
    <!-- Displaying the technologies known by the employee -->
    The Technologies that Employee Knows : ${employeeModel.technologies}
    
    <!-- Iterating over the technologies using JSTL forEach -->
    <ul>
        <c:forEach var="temp" items="${employeeModel.technologies}">
            <!-- Displaying each technology as a list item -->
            <li>${temp}</li>
        </c:forEach>
    </ul>
    
</body>
</html>
