<%--
  Created by IntelliJ IDEA.
  User: fimia
  Date: 26.07.2022
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Student confirmation</title>
</head>
<body>
    Student confirmed: ${student.firstName} ${student.lastName} from ${student.country}.
    <br>
    Favourite language: ${student.favouriteLanguage}
    <br>
    OS familiar with:
<ul>
    <c:forEach var="temp" items="${student.OS}">
        <li>
            ${temp}
        </li>
    </c:forEach>
</ul>
</body>
</html>
