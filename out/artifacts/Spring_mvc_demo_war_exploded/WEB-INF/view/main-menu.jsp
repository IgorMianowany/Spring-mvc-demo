<%--
  Created by IntelliJ IDEA.
  User: fimia
  Date: 26.07.2022
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h2> Spring MVC demo - home page </h2>
    <a href="${pageContext.request.contextPath}/hello/showForm"> Form </a>
    <br> <br>
    <a href="${pageContext.request.contextPath}/student/showForm"> Student form </a>
    <br> <br>
    <a href="${pageContext.request.contextPath}/customer/showForm"> Customer form </a>

</body>
</html>
