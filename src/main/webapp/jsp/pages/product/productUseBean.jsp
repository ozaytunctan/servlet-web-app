<%--
  Created by IntelliJ IDEA.
  User: ozay.tunctan
  Date: 6.11.2024
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean id="product" class="com.otunctan.webapp.model.Product" scope="request"/>
<p><jsp:getProperty name="product" property="name"/></p>
<p><jsp:getProperty name="product" property="categoryName"/></p>
<p><jsp:getProperty name="product" property="basePrice"/> x <sub><jsp:getProperty name="product" property="quantity"/></sub></p>
</body>
</html>
