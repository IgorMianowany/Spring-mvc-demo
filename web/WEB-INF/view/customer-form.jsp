<%--
  Created by IntelliJ IDEA.
  User: fimia
  Date: 27.07.2022
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer registration form</title>

    <style>
        .error{color:red}
    </style>
</head>
<body>
Fill out form. Asterisk (*) is required
    <form:form action="processForm" modelAttribute="customer">

    First name: <form:input path="firstName"/>
        <br><br>
    Last name*: <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br><br>
    <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>
