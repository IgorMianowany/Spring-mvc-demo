<%--
  Created by IntelliJ IDEA.
  User: fimia
  Date: 26.07.2022
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/hello/processFormVersionThree" method="GET">
        <label>
            <input type="text" name="studentName"
                placeholder="What's your name"/>
        </label>

        <input type="submit"/>
    </form>
</body>
</html>
