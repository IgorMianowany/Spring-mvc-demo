<%--
  Created by IntelliJ IDEA.
  User: fimia
  Date: 27.07.2022
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation Page</title>
</head>
<body>
        Customer first name: ${customer.firstName}
        <br>
        Customer Last name: ${customer.lastName}
        <br>
        Number of free passes is: ${customer.freePasses}
        <br>
        Postal code: ${customer.postalCode}
        <br>
        Course code: ${customer.courseCode}
</body>
</html>
