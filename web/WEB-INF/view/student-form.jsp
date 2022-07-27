<%--
  Created by IntelliJ IDEA.
  User: fimia
  Date: 26.07.2022
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">

        First name: <form:input path="firstName"/>
        <br> <br>

        Last name: <form:input path="lastName"/>
        <br> <br>

        <form:select path="country">
            <form:options items="${student.countryOptions}"/>
        </form:select>

        <br> <br>

        Favourite language: <br>

        Java <form:radiobutton path="favouriteLanguage" value="Java" />
        C# <form:radiobutton path="favouriteLanguage" value="C#" />
        Python <form:radiobutton path="favouriteLanguage" value="Python" />
        C++ <form:radiobutton path="favouriteLanguage" value="C++" />

        <br> <br>

        OS you're familiar with
        <br> <br>
        Linux <form:checkbox path="OS" value="Linux"/>
        Mac <form:checkbox path="OS" value="Mac"/>
        Windows <form:checkbox path="OS" value="Windows"/>

        <br> <br>
        <input type="submit" value="Submit"/>
    </form:form>



</body>
</html>
