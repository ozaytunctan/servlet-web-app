<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 10.11.2024
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        Implicit Objects
    </title>
</head>
<body>

<p>${cookie.username.value}</p>
<p><%=request.getMethod()%>
</p>

<p>${pageContext.request.method}</p>
</body>
</html>
