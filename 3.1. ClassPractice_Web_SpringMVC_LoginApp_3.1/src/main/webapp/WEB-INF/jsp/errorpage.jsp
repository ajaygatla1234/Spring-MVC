<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

    <!-- Displaying a red-colored message using inline CSS -->
    <h2 style="color:red">${message} </h2><br/>

    <!-- Including content from the index.jsp page -->
    <jsp:include page="/index.jsp" />

</body>
</html>
